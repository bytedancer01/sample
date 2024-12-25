package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/AbstractClientConnAdapter.class */
public abstract class AbstractClientConnAdapter implements ManagedClientConnection, HttpContext {
    private final ClientConnectionManager connManager;
    private volatile OperatedClientConnection wrappedConnection;
    private volatile boolean markedReusable = false;
    private volatile boolean released = false;
    private volatile long duration = Long.MAX_VALUE;

    public AbstractClientConnAdapter(ClientConnectionManager clientConnectionManager, OperatedClientConnection operatedClientConnection) {
        this.connManager = clientConnectionManager;
        this.wrappedConnection = operatedClientConnection;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        synchronized (this) {
            if (this.released) {
                return;
            }
            this.released = true;
            unmarkReusable();
            try {
                shutdown();
            } catch (IOException e10) {
            }
            this.connManager.releaseConnection(this, this.duration, TimeUnit.MILLISECONDS);
        }
    }

    @Deprecated
    public final void assertNotAborted() {
        if (isReleased()) {
            throw new InterruptedIOException("Connection has been shut down");
        }
    }

    public final void assertValid(OperatedClientConnection operatedClientConnection) {
        if (isReleased() || operatedClientConnection == null) {
            throw new ConnectionShutdownException();
        }
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public void bind(Socket socket) {
        throw new UnsupportedOperationException();
    }

    public void detach() {
        synchronized (this) {
            this.wrappedConnection = null;
            this.duration = Long.MAX_VALUE;
        }
    }

    @Override // org.apache.http.HttpClientConnection
    public void flush() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        wrappedConnection.flush();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        if (wrappedConnection instanceof HttpContext) {
            return ((HttpContext) wrappedConnection).getAttribute(str);
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        return wrappedConnection.getLocalAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        return wrappedConnection.getLocalPort();
    }

    public ClientConnectionManager getManager() {
        return this.connManager;
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        return wrappedConnection.getMetrics();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        return wrappedConnection.getRemoteAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        return wrappedConnection.getRemotePort();
    }

    @Override // org.apache.http.conn.ManagedClientConnection, org.apache.http.conn.HttpRoutedConnection, org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        SSLSession sSLSession = null;
        if (!isOpen()) {
            return null;
        }
        Socket socket = wrappedConnection.getSocket();
        if (socket instanceof SSLSocket) {
            sSLSession = ((SSLSocket) socket).getSession();
        }
        return sSLSession;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public Socket getSocket() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        if (isOpen()) {
            return wrappedConnection.getSocket();
        }
        return null;
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        return wrappedConnection.getSocketTimeout();
    }

    public OperatedClientConnection getWrappedConnection() {
        return this.wrappedConnection;
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public boolean isMarkedReusable() {
        return this.markedReusable;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        if (wrappedConnection == null) {
            return false;
        }
        return wrappedConnection.isOpen();
    }

    public boolean isReleased() {
        return this.released;
    }

    @Override // org.apache.http.HttpClientConnection
    public boolean isResponseAvailable(int i10) {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        return wrappedConnection.isResponseAvailable(i10);
    }

    @Override // org.apache.http.conn.ManagedClientConnection, org.apache.http.conn.HttpRoutedConnection
    public boolean isSecure() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        return wrappedConnection.isSecure();
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        OperatedClientConnection wrappedConnection;
        if (isReleased() || (wrappedConnection = getWrappedConnection()) == null) {
            return true;
        }
        return wrappedConnection.isStale();
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void markReusable() {
        this.markedReusable = true;
    }

    @Override // org.apache.http.HttpClientConnection
    public void receiveResponseEntity(HttpResponse httpResponse) {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        unmarkReusable();
        wrappedConnection.receiveResponseEntity(httpResponse);
    }

    @Override // org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        unmarkReusable();
        return wrappedConnection.receiveResponseHeader();
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        synchronized (this) {
            if (this.released) {
                return;
            }
            this.released = true;
            this.connManager.releaseConnection(this, this.duration, TimeUnit.MILLISECONDS);
        }
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        if (wrappedConnection instanceof HttpContext) {
            return ((HttpContext) wrappedConnection).removeAttribute(str);
        }
        return null;
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        unmarkReusable();
        wrappedConnection.sendRequestEntity(httpEntityEnclosingRequest);
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        unmarkReusable();
        wrappedConnection.sendRequestHeader(httpRequest);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        if (wrappedConnection instanceof HttpContext) {
            ((HttpContext) wrappedConnection).setAttribute(str, obj);
        }
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void setIdleDuration(long j10, TimeUnit timeUnit) {
        this.duration = j10 > 0 ? timeUnit.toMillis(j10) : -1L;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i10) {
        OperatedClientConnection wrappedConnection = getWrappedConnection();
        assertValid(wrappedConnection);
        wrappedConnection.setSocketTimeout(i10);
    }

    @Override // org.apache.http.conn.ManagedClientConnection
    public void unmarkReusable() {
        this.markedReusable = false;
    }
}
