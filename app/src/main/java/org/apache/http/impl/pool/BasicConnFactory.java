package org.apache.http.impl.pool;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.impl.DefaultBHttpClientConnectionFactory;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.pool.ConnFactory;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/pool/BasicConnFactory.class */
public class BasicConnFactory implements ConnFactory<HttpHost, HttpClientConnection> {
    private final HttpConnectionFactory<? extends HttpClientConnection> connFactory;
    private final int connectTimeout;
    private final SocketFactory plainfactory;
    private final SocketConfig sconfig;
    private final SSLSocketFactory sslfactory;

    public BasicConnFactory() {
        this(null, null, 0, SocketConfig.DEFAULT, ConnectionConfig.DEFAULT);
    }

    public BasicConnFactory(int i10, SocketConfig socketConfig, ConnectionConfig connectionConfig) {
        this(null, null, i10, socketConfig, connectionConfig);
    }

    public BasicConnFactory(SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, int i10, SocketConfig socketConfig, ConnectionConfig connectionConfig) {
        this.plainfactory = socketFactory;
        this.sslfactory = sSLSocketFactory;
        this.connectTimeout = i10;
        this.sconfig = socketConfig == null ? SocketConfig.DEFAULT : socketConfig;
        this.connFactory = new DefaultBHttpClientConnectionFactory(connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig);
    }

    @Deprecated
    public BasicConnFactory(SSLSocketFactory sSLSocketFactory, HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP params");
        this.plainfactory = null;
        this.sslfactory = sSLSocketFactory;
        this.connectTimeout = httpParams.getIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 0);
        this.sconfig = HttpParamConfig.getSocketConfig(httpParams);
        this.connFactory = new DefaultBHttpClientConnectionFactory(HttpParamConfig.getConnectionConfig(httpParams));
    }

    public BasicConnFactory(SocketConfig socketConfig, ConnectionConfig connectionConfig) {
        this(null, null, 0, socketConfig, connectionConfig);
    }

    @Deprecated
    public BasicConnFactory(HttpParams httpParams) {
        this((SSLSocketFactory) null, httpParams);
    }

    @Deprecated
    public HttpClientConnection create(Socket socket, HttpParams httpParams) {
        DefaultBHttpClientConnection defaultBHttpClientConnection = new DefaultBHttpClientConnection(httpParams.getIntParameter(CoreConnectionPNames.SOCKET_BUFFER_SIZE, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT));
        defaultBHttpClientConnection.bind(socket);
        return defaultBHttpClientConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v55, types: [javax.net.SocketFactory] */
    @Override // org.apache.http.pool.ConnFactory
    public HttpClientConnection create(HttpHost httpHost) {
        Socket socket;
        String schemeName = httpHost.getSchemeName();
        if (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(schemeName)) {
            SocketFactory socketFactory = this.plainfactory;
            socket = socketFactory != null ? socketFactory.createSocket() : new Socket();
        } else {
            socket = null;
        }
        if (ClientConstants.DOMAIN_SCHEME.equalsIgnoreCase(schemeName)) {
            SSLSocketFactory sSLSocketFactory = this.sslfactory;
            if (sSLSocketFactory == null) {
                sSLSocketFactory = SSLSocketFactory.getDefault();
            }
            socket = sSLSocketFactory.createSocket();
        }
        if (socket == null) {
            throw new IOException(schemeName + " scheme is not supported");
        }
        String hostName = httpHost.getHostName();
        int port = httpHost.getPort();
        int i10 = port;
        if (port == -1) {
            if (httpHost.getSchemeName().equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME)) {
                i10 = 80;
            } else {
                i10 = port;
                if (httpHost.getSchemeName().equalsIgnoreCase(ClientConstants.DOMAIN_SCHEME)) {
                    i10 = 443;
                }
            }
        }
        socket.setSoTimeout(this.sconfig.getSoTimeout());
        if (this.sconfig.getSndBufSize() > 0) {
            socket.setSendBufferSize(this.sconfig.getSndBufSize());
        }
        if (this.sconfig.getRcvBufSize() > 0) {
            socket.setReceiveBufferSize(this.sconfig.getRcvBufSize());
        }
        socket.setTcpNoDelay(this.sconfig.isTcpNoDelay());
        int soLinger = this.sconfig.getSoLinger();
        if (soLinger >= 0) {
            socket.setSoLinger(true, soLinger);
        }
        socket.setKeepAlive(this.sconfig.isSoKeepAlive());
        socket.connect(new InetSocketAddress(hostName, i10), this.connectTimeout);
        return this.connFactory.createConnection(socket);
    }
}
