package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/DefaultRedirectHandler.class */
public class DefaultRedirectHandler implements RedirectHandler {
    private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    private final Log log = LogFactory.getLog(getClass());

    @Override // org.apache.http.client.RedirectHandler
    public URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext) {
        URI rewriteURI;
        Args.notNull(httpResponse, "HTTP response");
        Header firstHeader = httpResponse.getFirstHeader("location");
        if (firstHeader == null) {
            throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
        }
        String value = firstHeader.getValue();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Redirect requested to location '" + value + "'");
        }
        try {
            URI uri = new URI(value);
            HttpParams params = httpResponse.getParams();
            URI uri2 = uri;
            if (!uri.isAbsolute()) {
                if (params.isParameterTrue(ClientPNames.REJECT_RELATIVE_REDIRECT)) {
                    throw new ProtocolException("Relative redirect location '" + uri + "' not allowed");
                }
                HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
                Asserts.notNull(httpHost, "Target host");
                try {
                    uri2 = URIUtils.resolve(URIUtils.rewriteURI(new URI(((HttpRequest) httpContext.getAttribute("http.request")).getRequestLine().getUri()), httpHost, true), uri);
                } catch (URISyntaxException e10) {
                    throw new ProtocolException(e10.getMessage(), e10);
                }
            }
            if (params.isParameterFalse(ClientPNames.ALLOW_CIRCULAR_REDIRECTS)) {
                RedirectLocations redirectLocations = (RedirectLocations) httpContext.getAttribute("http.protocol.redirect-locations");
                RedirectLocations redirectLocations2 = redirectLocations;
                if (redirectLocations == null) {
                    redirectLocations2 = new RedirectLocations();
                    httpContext.setAttribute("http.protocol.redirect-locations", redirectLocations2);
                }
                if (uri2.getFragment() != null) {
                    try {
                        rewriteURI = URIUtils.rewriteURI(uri2, new HttpHost(uri2.getHost(), uri2.getPort(), uri2.getScheme()), true);
                    } catch (URISyntaxException e11) {
                        throw new ProtocolException(e11.getMessage(), e11);
                    }
                } else {
                    rewriteURI = uri2;
                }
                if (redirectLocations2.contains(rewriteURI)) {
                    throw new CircularRedirectException("Circular redirect to '" + rewriteURI + "'");
                }
                redirectLocations2.add(rewriteURI);
            }
            return uri2;
        } catch (URISyntaxException e12) {
            throw new ProtocolException("Invalid redirect URI: " + value, e12);
        }
    }

    @Override // org.apache.http.client.RedirectHandler
    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        boolean z10 = false;
        if (statusCode != 307) {
            switch (statusCode) {
                case 301:
                case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                    break;
                case HttpStatus.SC_SEE_OTHER /* 303 */:
                    return true;
                default:
                    return false;
            }
        }
        String method = ((HttpRequest) httpContext.getAttribute("http.request")).getRequestLine().getMethod();
        if (method.equalsIgnoreCase(HttpGet.METHOD_NAME) || method.equalsIgnoreCase(HttpHead.METHOD_NAME)) {
            z10 = true;
        }
        return z10;
    }
}
