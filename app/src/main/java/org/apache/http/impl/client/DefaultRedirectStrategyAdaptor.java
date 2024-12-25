package org.apache.http.impl.client;

import java.net.URI;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/DefaultRedirectStrategyAdaptor.class */
class DefaultRedirectStrategyAdaptor implements RedirectStrategy {
    private final RedirectHandler handler;

    public DefaultRedirectStrategyAdaptor(RedirectHandler redirectHandler) {
        this.handler = redirectHandler;
    }

    public RedirectHandler getHandler() {
        return this.handler;
    }

    @Override // org.apache.http.client.RedirectStrategy
    public HttpUriRequest getRedirect(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        URI locationURI = this.handler.getLocationURI(httpResponse, httpContext);
        return httpRequest.getRequestLine().getMethod().equalsIgnoreCase(HttpHead.METHOD_NAME) ? new HttpHead(locationURI) : new HttpGet(locationURI);
    }

    @Override // org.apache.http.client.RedirectStrategy
    public boolean isRedirected(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        return this.handler.isRedirectRequested(httpResponse, httpContext);
    }
}
