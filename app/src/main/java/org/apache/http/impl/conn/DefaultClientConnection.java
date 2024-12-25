package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.impl.SocketHttpClientConnection;
import org.apache.http.message.LineParser;
import org.apache.http.p257io.HttpMessageParser;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/DefaultClientConnection.class */
public class DefaultClientConnection extends SocketHttpClientConnection implements OperatedClientConnection, ManagedHttpClientConnection, HttpContext {
    private boolean connSecure;
    private volatile boolean shutdown;
    private volatile Socket socket;
    private HttpHost targetHost;
    private final Log log = LogFactory.getLog(getClass());
    private final Log headerLog = LogFactory.getLog("org.apache.http.headers");
    private final Log wireLog = LogFactory.getLog("org.apache.http.wire");
    private final Map<String, Object> attributes = new HashMap();

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public void bind(Socket socket) {
        bind(socket, new BasicHttpParams());
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection, org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
            if (this.log.isDebugEnabled()) {
                this.log.debug("Connection " + this + " closed");
            }
        } catch (IOException e10) {
            this.log.debug("I/O error closing connection", e10);
        }
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection
    public HttpMessageParser<HttpResponse> createResponseParser(SessionInputBuffer sessionInputBuffer, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        return new DefaultHttpResponseParser(sessionInputBuffer, (LineParser) null, httpResponseFactory, httpParams);
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection
    public SessionInputBuffer createSessionInputBuffer(Socket socket, int i10, HttpParams httpParams) {
        if (i10 <= 0) {
            i10 = 8192;
        }
        SessionInputBuffer createSessionInputBuffer = super.createSessionInputBuffer(socket, i10, httpParams);
        SessionInputBuffer sessionInputBuffer = createSessionInputBuffer;
        if (this.wireLog.isDebugEnabled()) {
            sessionInputBuffer = new LoggingSessionInputBuffer(createSessionInputBuffer, new Wire(this.wireLog), HttpProtocolParams.getHttpElementCharset(httpParams));
        }
        return sessionInputBuffer;
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection
    public SessionOutputBuffer createSessionOutputBuffer(Socket socket, int i10, HttpParams httpParams) {
        if (i10 <= 0) {
            i10 = 8192;
        }
        SessionOutputBuffer createSessionOutputBuffer = super.createSessionOutputBuffer(socket, i10, httpParams);
        SessionOutputBuffer sessionOutputBuffer = createSessionOutputBuffer;
        if (this.wireLog.isDebugEnabled()) {
            sessionOutputBuffer = new LoggingSessionOutputBuffer(createSessionOutputBuffer, new Wire(this.wireLog), HttpProtocolParams.getHttpElementCharset(httpParams));
        }
        return sessionOutputBuffer;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return null;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        if (this.socket instanceof SSLSocket) {
            return ((SSLSocket) this.socket).getSession();
        }
        return null;
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection, org.apache.http.conn.OperatedClientConnection, org.apache.http.conn.ManagedHttpClientConnection
    public final Socket getSocket() {
        return this.socket;
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public final boolean isSecure() {
        return this.connSecure;
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public void openCompleted(boolean z10, HttpParams httpParams) {
        Args.notNull(httpParams, "Parameters");
        assertNotOpen();
        this.connSecure = z10;
        bind(this.socket, httpParams);
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public void opening(Socket socket, HttpHost httpHost) {
        assertNotOpen();
        this.socket = socket;
        this.targetHost = httpHost;
        if (this.shutdown) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection, org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() {
        HttpResponse receiveResponseHeader = super.receiveResponseHeader();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Receiving response: " + receiveResponseHeader.getStatusLine());
        }
        if (this.headerLog.isDebugEnabled()) {
            this.headerLog.debug("<< " + receiveResponseHeader.getStatusLine().toString());
            Header[] allHeaders = receiveResponseHeader.getAllHeaders();
            int length = allHeaders.length;
            for (int i10 = 0; i10 < length; i10++) {
                Header header = allHeaders[i10];
                this.headerLog.debug("<< " + header.toString());
            }
        }
        return receiveResponseHeader;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        return this.attributes.remove(str);
    }

    @Override // org.apache.http.impl.AbstractHttpClientConnection, org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Sending request: " + httpRequest.getRequestLine());
        }
        super.sendRequestHeader(httpRequest);
        if (this.headerLog.isDebugEnabled()) {
            this.headerLog.debug(">> " + httpRequest.getRequestLine().toString());
            Header[] allHeaders = httpRequest.getAllHeaders();
            int length = allHeaders.length;
            for (int i10 = 0; i10 < length; i10++) {
                Header header = allHeaders[i10];
                this.headerLog.debug(">> " + header.toString());
            }
        }
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        this.attributes.put(str, obj);
    }

    @Override // org.apache.http.impl.SocketHttpClientConnection, org.apache.http.HttpConnection
    public void shutdown() {
        this.shutdown = true;
        try {
            super.shutdown();
            if (this.log.isDebugEnabled()) {
                this.log.debug("Connection " + this + " shut down");
            }
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e10) {
            this.log.debug("I/O error shutting down connection", e10);
        }
    }

    @Override // org.apache.http.conn.OperatedClientConnection
    public void update(Socket socket, HttpHost httpHost, boolean z10, HttpParams httpParams) {
        assertOpen();
        Args.notNull(httpHost, "Target host");
        Args.notNull(httpParams, "Parameters");
        if (socket != null) {
            this.socket = socket;
            bind(socket, httpParams);
        }
        this.targetHost = httpHost;
        this.connSecure = z10;
    }
}
