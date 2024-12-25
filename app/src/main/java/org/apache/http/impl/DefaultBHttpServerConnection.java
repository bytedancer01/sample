package org.apache.http.impl;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.entity.DisallowIdentityContentLengthStrategy;
import org.apache.http.impl.p256io.DefaultHttpRequestParserFactory;
import org.apache.http.impl.p256io.DefaultHttpResponseWriterFactory;
import org.apache.http.p257io.HttpMessageParser;
import org.apache.http.p257io.HttpMessageParserFactory;
import org.apache.http.p257io.HttpMessageWriter;
import org.apache.http.p257io.HttpMessageWriterFactory;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/DefaultBHttpServerConnection.class */
public class DefaultBHttpServerConnection extends BHttpConnectionBase implements HttpServerConnection {
    private final HttpMessageParser<HttpRequest> requestParser;
    private final HttpMessageWriter<HttpResponse> responseWriter;

    public DefaultBHttpServerConnection(int i10) {
        this(i10, i10, null, null, null, null, null, null, null);
    }

    public DefaultBHttpServerConnection(int i10, int i11, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageParserFactory<HttpRequest> httpMessageParserFactory, HttpMessageWriterFactory<HttpResponse> httpMessageWriterFactory) {
        super(i10, i11, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy == null ? DisallowIdentityContentLengthStrategy.INSTANCE : contentLengthStrategy, contentLengthStrategy2);
        this.requestParser = (httpMessageParserFactory != null ? httpMessageParserFactory : DefaultHttpRequestParserFactory.INSTANCE).create(getSessionInputBuffer(), messageConstraints);
        this.responseWriter = (httpMessageWriterFactory != null ? httpMessageWriterFactory : DefaultHttpResponseWriterFactory.INSTANCE).create(getSessionOutputBuffer());
    }

    public DefaultBHttpServerConnection(int i10, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints) {
        this(i10, i10, charsetDecoder, charsetEncoder, messageConstraints, null, null, null, null);
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public void bind(Socket socket) {
        super.bind(socket);
    }

    @Override // org.apache.http.HttpServerConnection
    public void flush() {
        ensureOpen();
        doFlush();
    }

    public void onRequestReceived(HttpRequest httpRequest) {
    }

    public void onResponseSubmitted(HttpResponse httpResponse) {
    }

    @Override // org.apache.http.HttpServerConnection
    public void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        Args.notNull(httpEntityEnclosingRequest, "HTTP request");
        ensureOpen();
        httpEntityEnclosingRequest.setEntity(prepareInput(httpEntityEnclosingRequest));
    }

    @Override // org.apache.http.HttpServerConnection
    public HttpRequest receiveRequestHeader() {
        ensureOpen();
        HttpRequest parse = this.requestParser.parse();
        onRequestReceived(parse);
        incrementRequestCount();
        return parse;
    }

    @Override // org.apache.http.HttpServerConnection
    public void sendResponseEntity(HttpResponse httpResponse) {
        Args.notNull(httpResponse, "HTTP response");
        ensureOpen();
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null) {
            return;
        }
        OutputStream prepareOutput = prepareOutput(httpResponse);
        entity.writeTo(prepareOutput);
        prepareOutput.close();
    }

    @Override // org.apache.http.HttpServerConnection
    public void sendResponseHeader(HttpResponse httpResponse) {
        Args.notNull(httpResponse, "HTTP response");
        ensureOpen();
        this.responseWriter.write(httpResponse);
        onResponseSubmitted(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            incrementResponseCount();
        }
    }
}
