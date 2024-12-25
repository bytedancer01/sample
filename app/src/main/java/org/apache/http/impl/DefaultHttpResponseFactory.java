package org.apache.http.impl;

import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/DefaultHttpResponseFactory.class */
public class DefaultHttpResponseFactory implements HttpResponseFactory {
    public static final DefaultHttpResponseFactory INSTANCE = new DefaultHttpResponseFactory();
    public final ReasonPhraseCatalog reasonCatalog;

    public DefaultHttpResponseFactory() {
        this(EnglishReasonPhraseCatalog.INSTANCE);
    }

    public DefaultHttpResponseFactory(ReasonPhraseCatalog reasonPhraseCatalog) {
        this.reasonCatalog = (ReasonPhraseCatalog) Args.notNull(reasonPhraseCatalog, "Reason phrase catalog");
    }

    public Locale determineLocale(HttpContext httpContext) {
        return Locale.getDefault();
    }

    @Override // org.apache.http.HttpResponseFactory
    public HttpResponse newHttpResponse(ProtocolVersion protocolVersion, int i10, HttpContext httpContext) {
        Args.notNull(protocolVersion, "HTTP version");
        Locale determineLocale = determineLocale(httpContext);
        return new BasicHttpResponse(new BasicStatusLine(protocolVersion, i10, this.reasonCatalog.getReason(i10, determineLocale)), this.reasonCatalog, determineLocale);
    }

    @Override // org.apache.http.HttpResponseFactory
    public HttpResponse newHttpResponse(StatusLine statusLine, HttpContext httpContext) {
        Args.notNull(statusLine, "Status line");
        return new BasicHttpResponse(statusLine, this.reasonCatalog, determineLocale(httpContext));
    }
}
