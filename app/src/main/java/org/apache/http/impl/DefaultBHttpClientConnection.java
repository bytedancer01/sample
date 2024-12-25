package org.apache.http.impl;

import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.p256io.DefaultHttpRequestWriterFactory;
import org.apache.http.impl.p256io.DefaultHttpResponseParserFactory;
import org.apache.http.p257io.HttpMessageParser;
import org.apache.http.p257io.HttpMessageParserFactory;
import org.apache.http.p257io.HttpMessageWriter;
import org.apache.http.p257io.HttpMessageWriterFactory;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/DefaultBHttpClientConnection.class */
public class DefaultBHttpClientConnection extends BHttpConnectionBase implements HttpClientConnection {
    private final HttpMessageWriter<HttpRequest> requestWriter;
    private final HttpMessageParser<HttpResponse> responseParser;

    public DefaultBHttpClientConnection(int i10) {
        this(i10, i10, null, null, null, null, null, null, null);
    }

    public DefaultBHttpClientConnection(int i10, int i11, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        super(i10, i11, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2);
        this.requestWriter = (httpMessageWriterFactory == null ? DefaultHttpRequestWriterFactory.INSTANCE : httpMessageWriterFactory).create(getSessionOutputBuffer());
        this.responseParser = (httpMessageParserFactory == null ? DefaultHttpResponseParserFactory.INSTANCE : httpMessageParserFactory).create(getSessionInputBuffer(), messageConstraints);
    }

    public DefaultBHttpClientConnection(int i10, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints) {
        this(i10, i10, charsetDecoder, charsetEncoder, messageConstraints, null, null, null, null);
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public void bind(Socket socket) {
        super.bind(socket);
    }

    @Override // org.apache.http.HttpClientConnection
    public void flush() {
        ensureOpen();
        doFlush();
    }

    @Override // org.apache.http.HttpClientConnection
    public boolean isResponseAvailable(int i10) {
        ensureOpen();
        try {
            return awaitInput(i10);
        } catch (SocketTimeoutException e10) {
            return false;
        }
    }

    public void onRequestSubmitted(HttpRequest httpRequest) {
    }

    public void onResponseReceived(HttpResponse httpResponse) {
    }

    @Override // org.apache.http.HttpClientConnection
    public void receiveResponseEntity(HttpResponse httpResponse) {
        Args.notNull(httpResponse, "HTTP response");
        ensureOpen();
        httpResponse.setEntity(prepareInput(httpResponse));
    }

    @Override // org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() {
        ensureOpen();
        HttpResponse parse = this.responseParser.parse();
        onResponseReceived(parse);
        if (parse.getStatusLine().getStatusCode() >= 200) {
            incrementResponseCount();
        }
        return parse;
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        Args.notNull(httpEntityEnclosingRequest, "HTTP request");
        ensureOpen();
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity == null) {
            return;
        }
        OutputStream prepareOutput = prepareOutput(httpEntityEnclosingRequest);
        entity.writeTo(prepareOutput);
        prepareOutput.close();
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) {
        Args.notNull(httpRequest, "HTTP request");
        ensureOpen();
        this.requestWriter.write(httpRequest);
        onRequestSubmitted(httpRequest);
        incrementRequestCount();
    }
}