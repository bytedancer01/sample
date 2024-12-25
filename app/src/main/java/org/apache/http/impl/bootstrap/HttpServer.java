package org.apache.http.impl.bootstrap;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import org.apache.http.ExceptionLogger;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.DefaultBHttpServerConnection;
import org.apache.http.protocol.HttpService;
import p383w9.C9436a3;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/bootstrap/HttpServer.class */
public class HttpServer {
    private final HttpConnectionFactory<? extends DefaultBHttpServerConnection> connectionFactory;
    private final ExceptionLogger exceptionLogger;
    private final HttpService httpService;
    private final InetAddress ifAddress;
    private final ThreadPoolExecutor listenerExecutorService;
    private final int port;
    private volatile RequestListener requestListener;
    private volatile ServerSocket serverSocket;
    private final ServerSocketFactory serverSocketFactory;
    private final SocketConfig socketConfig;
    private final SSLServerSetupHandler sslSetupHandler;
    private final AtomicReference<Status> status;
    private final WorkerPoolExecutor workerExecutorService;
    private final ThreadGroup workerThreads;

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/bootstrap/HttpServer$Status.class */
    public enum Status {
        READY,
        ACTIVE,
        STOPPING
    }

    public HttpServer(int i10, InetAddress inetAddress, SocketConfig socketConfig, ServerSocketFactory serverSocketFactory, HttpService httpService, HttpConnectionFactory<? extends DefaultBHttpServerConnection> httpConnectionFactory, SSLServerSetupHandler sSLServerSetupHandler, ExceptionLogger exceptionLogger) {
        this.port = i10;
        this.ifAddress = inetAddress;
        this.socketConfig = socketConfig;
        this.serverSocketFactory = serverSocketFactory;
        this.httpService = httpService;
        this.connectionFactory = httpConnectionFactory;
        this.sslSetupHandler = sSLServerSetupHandler;
        this.exceptionLogger = exceptionLogger;
        this.listenerExecutorService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryImpl("HTTP-listener-" + i10));
        ThreadGroup threadGroup = new ThreadGroup("HTTP-workers");
        this.workerThreads = threadGroup;
        this.workerExecutorService = new WorkerPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryImpl("HTTP-worker", threadGroup));
        this.status = new AtomicReference<>(Status.READY);
    }

    public void awaitTermination(long j10, TimeUnit timeUnit) {
        this.workerExecutorService.awaitTermination(j10, timeUnit);
    }

    public InetAddress getInetAddress() {
        ServerSocket serverSocket = this.serverSocket;
        if (serverSocket != null) {
            return serverSocket.getInetAddress();
        }
        return null;
    }

    public int getLocalPort() {
        ServerSocket serverSocket = this.serverSocket;
        if (serverSocket != null) {
            return serverSocket.getLocalPort();
        }
        return -1;
    }

    public void shutdown(long j10, TimeUnit timeUnit) {
        stop();
        if (j10 > 0) {
            try {
                awaitTermination(j10, timeUnit);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
            }
        }
        Iterator<Worker> it = this.workerExecutorService.getWorkers().iterator();
        while (it.hasNext()) {
            try {
                it.next().getConnection().shutdown();
            } catch (IOException e11) {
                this.exceptionLogger.log(e11);
            }
        }
    }

    public void start() {
        if (C9436a3.m39798a(this.status, Status.READY, Status.ACTIVE)) {
            this.serverSocket = this.serverSocketFactory.createServerSocket(this.port, this.socketConfig.getBacklogSize(), this.ifAddress);
            this.serverSocket.setReuseAddress(this.socketConfig.isSoReuseAddress());
            if (this.socketConfig.getRcvBufSize() > 0) {
                this.serverSocket.setReceiveBufferSize(this.socketConfig.getRcvBufSize());
            }
            if (this.sslSetupHandler != null && (this.serverSocket instanceof SSLServerSocket)) {
                this.sslSetupHandler.initialize((SSLServerSocket) this.serverSocket);
            }
            this.requestListener = new RequestListener(this.socketConfig, this.serverSocket, this.httpService, this.connectionFactory, this.exceptionLogger, this.workerExecutorService);
            this.listenerExecutorService.execute(this.requestListener);
        }
    }

    public void stop() {
        if (C9436a3.m39798a(this.status, Status.ACTIVE, Status.STOPPING)) {
            this.listenerExecutorService.shutdown();
            this.workerExecutorService.shutdown();
            RequestListener requestListener = this.requestListener;
            if (requestListener != null) {
                try {
                    requestListener.terminate();
                } catch (IOException e10) {
                    this.exceptionLogger.log(e10);
                }
            }
            this.workerThreads.interrupt();
        }
    }
}
