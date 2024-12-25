package org.apache.http.impl.conn;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.p257io.HttpMessageParser;
import org.apache.http.p257io.HttpMessageParserFactory;
import org.apache.http.p257io.SessionInputBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/DefaultHttpResponseParserFactory.class */
public class DefaultHttpResponseParserFactory implements HttpMessageParserFactory<HttpResponse> {
    public static final DefaultHttpResponseParserFactory INSTANCE = new DefaultHttpResponseParserFactory();
    private final LineParser lineParser;
    private final HttpResponseFactory responseFactory;

    public DefaultHttpResponseParserFactory() {
        this(null, null);
    }

    public DefaultHttpResponseParserFactory(HttpResponseFactory httpResponseFactory) {
        this(null, httpResponseFactory);
    }

    public DefaultHttpResponseParserFactory(LineParser lineParser, HttpResponseFactory httpResponseFactory) {
        this.lineParser = lineParser == null ? BasicLineParser.INSTANCE : lineParser;
        this.responseFactory = httpResponseFactory == null ? DefaultHttpResponseFactory.INSTANCE : httpResponseFactory;
    }

    @Override // org.apache.http.p257io.HttpMessageParserFactory
    public HttpMessageParser<HttpResponse> create(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        return new DefaultHttpResponseParser(sessionInputBuffer, this.lineParser, this.responseFactory, messageConstraints);
    }
}
