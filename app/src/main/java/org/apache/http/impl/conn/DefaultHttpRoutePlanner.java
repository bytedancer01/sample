package org.apache.http.impl.conn;

import java.net.InetAddress;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/DefaultHttpRoutePlanner.class */
public class DefaultHttpRoutePlanner implements HttpRoutePlanner {
    public final SchemeRegistry schemeRegistry;

    public DefaultHttpRoutePlanner(SchemeRegistry schemeRegistry) {
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
    }

    @Override // org.apache.http.conn.routing.HttpRoutePlanner
    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        HttpRoute forcedRoute = ConnRouteParams.getForcedRoute(httpRequest.getParams());
        if (forcedRoute != null) {
            return forcedRoute;
        }
        Asserts.notNull(httpHost, "Target host");
        InetAddress localAddress = ConnRouteParams.getLocalAddress(httpRequest.getParams());
        HttpHost defaultProxy = ConnRouteParams.getDefaultProxy(httpRequest.getParams());
        try {
            boolean isLayered = this.schemeRegistry.getScheme(httpHost.getSchemeName()).isLayered();
            return defaultProxy == null ? new HttpRoute(httpHost, localAddress, isLayered) : new HttpRoute(httpHost, localAddress, defaultProxy, isLayered);
        } catch (IllegalStateException e10) {
            throw new HttpException(e10.getMessage());
        }
    }
}
