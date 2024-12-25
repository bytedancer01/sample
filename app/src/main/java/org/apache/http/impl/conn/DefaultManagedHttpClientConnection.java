package org.apache.http.impl.conn;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.config.MessageConstraints;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.p257io.HttpMessageParserFactory;
import org.apache.http.p257io.HttpMessageWriterFactory;
import org.apache.http.protocol.HttpContext;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/DefaultManagedHttpClientConnection.class */
public class DefaultManagedHttpClientConnection extends DefaultBHttpClientConnection implements ManagedHttpClientConnection, HttpContext {
    private final Map<String, Object> attributes;

    /* renamed from: id */
    private final String f36161id;
    private volatile boolean shutdown;

    public DefaultManagedHttpClientConnection(String str, int i10) {
        this(str, i10, i10, null, null, null, null, null, null, null);
    }

    public DefaultManagedHttpClientConnection(String str, int i10, int i11, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        super(i10, i11, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2, httpMessageWriterFactory, httpMessageParserFactory);
        this.f36161id = str;
        this.attributes = new ConcurrentHashMap();
    }

    @Override // org.apache.http.impl.DefaultBHttpClientConnection, org.apache.http.impl.BHttpConnectionBase
    public void bind(Socket socket) {
        if (this.shutdown) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
        super.bind(socket);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public String getId() {
        return this.f36161id;
    }

    @Override // org.apache.http.conn.ManagedHttpClientConnection
    public SSLSession getSSLSession() {
        Socket socket = super.getSocket();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.conn.ManagedHttpClientConnection
    public Socket getSocket() {
        return super.getSocket();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        return this.attributes.remove(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        this.attributes.put(str, obj);
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection
    public void shutdown() {
        this.shutdown = true;
        super.shutdown();
    }
}
