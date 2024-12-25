package org.apache.http.client.protocol;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Lookup;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/RequestAddCookies.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/RequestAddCookies.class */
public class RequestAddCookies implements HttpRequestInterceptor {
    private final Log log = LogFactory.getLog(getClass());

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        URI uri;
        Header versionHeader;
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            return;
        }
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        CookieStore cookieStore = adapt.getCookieStore();
        if (cookieStore == null) {
            this.log.debug("Cookie store not specified in HTTP context");
            return;
        }
        Lookup<CookieSpecProvider> cookieSpecRegistry = adapt.getCookieSpecRegistry();
        if (cookieSpecRegistry == null) {
            this.log.debug("CookieSpec registry not specified in HTTP context");
            return;
        }
        HttpHost targetHost = adapt.getTargetHost();
        if (targetHost == null) {
            this.log.debug("Target host not set in the context");
            return;
        }
        RouteInfo httpRoute = adapt.getHttpRoute();
        if (httpRoute == null) {
            this.log.debug("Connection route not set in the context");
            return;
        }
        String cookieSpec = adapt.getRequestConfig().getCookieSpec();
        String str = cookieSpec;
        if (cookieSpec == null) {
            str = CookieSpecs.DEFAULT;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("CookieSpec selected: " + str);
        }
        if (httpRequest instanceof HttpUriRequest) {
            uri = ((HttpUriRequest) httpRequest).getURI();
        } else {
            try {
                uri = new URI(httpRequest.getRequestLine().getUri());
            } catch (URISyntaxException e10) {
                uri = null;
            }
        }
        String path = uri != null ? uri.getPath() : null;
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        int i10 = port;
        if (port < 0) {
            i10 = httpRoute.getTargetHost().getPort();
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (TextUtils.isEmpty(path)) {
            path = "/";
        }
        CookieOrigin cookieOrigin = new CookieOrigin(hostName, i10, path, httpRoute.isSecure());
        CookieSpecProvider lookup = cookieSpecRegistry.lookup(str);
        if (lookup == null) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("Unsupported cookie policy: " + str);
                return;
            }
            return;
        }
        CookieSpec create = lookup.create(adapt);
        List<Cookie> cookies = cookieStore.getCookies();
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        boolean z10 = false;
        for (Cookie cookie : cookies) {
            if (cookie.isExpired(date)) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Cookie " + cookie + " expired");
                }
                z10 = true;
            } else if (create.match(cookie, cookieOrigin)) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Cookie " + cookie + " match " + cookieOrigin);
                }
                arrayList.add(cookie);
            }
        }
        if (z10) {
            cookieStore.clearExpired(date);
        }
        if (!arrayList.isEmpty()) {
            Iterator<Header> it = create.formatCookies(arrayList).iterator();
            while (it.hasNext()) {
                httpRequest.addHeader(it.next());
            }
        }
        if (create.getVersion() > 0 && (versionHeader = create.getVersionHeader()) != null) {
            httpRequest.addHeader(versionHeader);
        }
        httpContext.setAttribute("http.cookie-spec", create);
        httpContext.setAttribute("http.cookie-origin", cookieOrigin);
    }
}
