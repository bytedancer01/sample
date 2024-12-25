package org.apache.http.impl.conn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.logging.Log;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.p257io.HttpMessageParserFactory;
import org.apache.http.p257io.HttpMessageWriterFactory;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/LoggingManagedHttpClientConnection.class */
class LoggingManagedHttpClientConnection extends DefaultManagedHttpClientConnection {
    private final Log headerlog;
    private final Log log;
    private final Wire wire;

    public LoggingManagedHttpClientConnection(String str, Log log, Log log2, Log log3, int i10, int i11, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        super(str, i10, i11, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2, httpMessageWriterFactory, httpMessageParserFactory);
        this.log = log;
        this.headerlog = log2;
        this.wire = new Wire(log3, str);
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (super.isOpen()) {
            if (this.log.isDebugEnabled()) {
                this.log.debug(getId() + ": Close connection");
            }
            super.close();
        }
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public InputStream getSocketInputStream(Socket socket) {
        InputStream socketInputStream = super.getSocketInputStream(socket);
        InputStream inputStream = socketInputStream;
        if (this.wire.enabled()) {
            inputStream = new LoggingInputStream(socketInputStream, this.wire);
        }
        return inputStream;
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public OutputStream getSocketOutputStream(Socket socket) {
        OutputStream socketOutputStream = super.getSocketOutputStream(socket);
        OutputStream outputStream = socketOutputStream;
        if (this.wire.enabled()) {
            outputStream = new LoggingOutputStream(socketOutputStream, this.wire);
        }
        return outputStream;
    }

    @Override // org.apache.http.impl.DefaultBHttpClientConnection
    public void onRequestSubmitted(HttpRequest httpRequest) {
        if (httpRequest == null || !this.headerlog.isDebugEnabled()) {
            return;
        }
        this.headerlog.debug(getId() + " >> " + httpRequest.getRequestLine().toString());
        Header[] allHeaders = httpRequest.getAllHeaders();
        int length = allHeaders.length;
        for (int i10 = 0; i10 < length; i10++) {
            Header header = allHeaders[i10];
            this.headerlog.debug(getId() + " >> " + header.toString());
        }
    }

    @Override // org.apache.http.impl.DefaultBHttpClientConnection
    public void onResponseReceived(HttpResponse httpResponse) {
        if (httpResponse == null || !this.headerlog.isDebugEnabled()) {
            return;
        }
        this.headerlog.debug(getId() + " << " + httpResponse.getStatusLine().toString());
        Header[] allHeaders = httpResponse.getAllHeaders();
        int length = allHeaders.length;
        for (int i10 = 0; i10 < length; i10++) {
            Header header = allHeaders[i10];
            this.headerlog.debug(getId() + " << " + header.toString());
        }
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection
    public void setSocketTimeout(int i10) {
        if (this.log.isDebugEnabled()) {
            this.log.debug(getId() + ": set socket timeout to " + i10);
        }
        super.setSocketTimeout(i10);
    }

    @Override // org.apache.http.impl.conn.DefaultManagedHttpClientConnection, org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection
    public void shutdown() {
        if (this.log.isDebugEnabled()) {
            this.log.debug(getId() + ": Shutdown connection");
        }
        super.shutdown();
    }
}
