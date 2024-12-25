package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.protocol.HttpContext;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/CPoolProxy.class */
class CPoolProxy implements ManagedHttpClientConnection, HttpContext {
    private volatile CPoolEntry poolEntry;

    public CPoolProxy(CPoolEntry cPoolEntry) {
        this.poolEntry = cPoolEntry;
    }

    public static CPoolEntry detach(HttpClientConnection httpClientConnection) {
        return getProxy(httpClientConnection).detach();
    }

    public static CPoolEntry getPoolEntry(HttpClientConnection httpClientConnection) {
        CPoolEntry poolEntry = getProxy(httpClientConnection).getPoolEntry();
        if (poolEntry != null) {
            return poolEntry;
        }
        throw new ConnectionShutdownException();
    }

    private static CPoolProxy getProxy(HttpClientConnection httpClientConnection) {
        if (CPoolProxy.class.isInstance(httpClientConnection)) {
            return (CPoolProxy) CPoolProxy.class.cast(httpClientConnection);
        }
        throw new IllegalStateException("Unexpected connection proxy class: " + httpClientConnection.getClass());
    }

    public static HttpClientConnection newProxy(CPoolEntry cPoolEntry) {
        return new CPoolProxy(cPoolEntry);
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public void bind(Socket socket) {
        getValidConnection().bind(socket);
    }

    @Override // org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CPoolEntry cPoolEntry = this.poolEntry;
        if (cPoolEntry != null) {
            cPoolEntry.closeConnection();
        }
    }

    public CPoolEntry detach() {
        CPoolEntry cPoolEntry = this.poolEntry;
        this.poolEntry = null;
        return cPoolEntry;
    }

    @Override // org.apache.http.HttpClientConnection
    public void flush() {
        getValidConnection().flush();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        ManagedHttpClientConnection validConnection = getValidConnection();
        if (validConnection instanceof HttpContext) {
            return ((HttpContext) validConnection).getAttribute(str);
        }
        return null;
    }

    public ManagedHttpClientConnection getConnection() {
        CPoolEntry cPoolEntry = this.poolEntry;
        if (cPoolEntry == null) {
            return null;
        }
        return cPoolEntry.getConnection();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return getValidConnection().getId();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        return getValidConnection().getLocalAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        return getValidConnection().getLocalPort();
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return getValidConnection().getMetrics();
    }

    public CPoolEntry getPoolEntry() {
        return this.poolEntry;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        return getValidConnection().getRemoteAddress();
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        return getValidConnection().getRemotePort();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        return getValidConnection().getSSLSession();
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public Socket getSocket() {
        return getValidConnection().getSocket();
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        return getValidConnection().getSocketTimeout();
    }

    public ManagedHttpClientConnection getValidConnection() {
        ManagedHttpClientConnection connection = getConnection();
        if (connection != null) {
            return connection;
        }
        throw new ConnectionShutdownException();
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        if (this.poolEntry != null) {
            return !r0.isClosed();
        }
        return false;
    }

    @Override // org.apache.http.HttpClientConnection
    public boolean isResponseAvailable(int i10) {
        return getValidConnection().isResponseAvailable(i10);
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        ManagedHttpClientConnection connection = getConnection();
        if (connection != null) {
            return connection.isStale();
        }
        return true;
    }

    @Override // org.apache.http.HttpClientConnection
    public void receiveResponseEntity(HttpResponse httpResponse) {
        getValidConnection().receiveResponseEntity(httpResponse);
    }

    @Override // org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() {
        return getValidConnection().receiveResponseHeader();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        ManagedHttpClientConnection validConnection = getValidConnection();
        if (validConnection instanceof HttpContext) {
            return ((HttpContext) validConnection).removeAttribute(str);
        }
        return null;
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        getValidConnection().sendRequestEntity(httpEntityEnclosingRequest);
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) {
        getValidConnection().sendRequestHeader(httpRequest);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        ManagedHttpClientConnection validConnection = getValidConnection();
        if (validConnection instanceof HttpContext) {
            ((HttpContext) validConnection).setAttribute(str, obj);
        }
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int i10) {
        getValidConnection().setSocketTimeout(i10);
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() {
        CPoolEntry cPoolEntry = this.poolEntry;
        if (cPoolEntry != null) {
            cPoolEntry.shutdownConnection();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CPoolProxy{");
        ManagedHttpClientConnection connection = getConnection();
        if (connection != null) {
            sb2.append(connection);
        } else {
            sb2.append("detached");
        }
        sb2.append('}');
        return sb2.toString();
    }
}
