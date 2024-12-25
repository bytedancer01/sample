package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/ProxySelectorRoutePlanner.class */
public class ProxySelectorRoutePlanner implements HttpRoutePlanner {
    public ProxySelector proxySelector;
    public final SchemeRegistry schemeRegistry;

    /* renamed from: org.apache.http.impl.conn.ProxySelectorRoutePlanner$1 */
    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/ProxySelectorRoutePlanner$1.class */
    public static /* synthetic */ class C70501 {
        public static final int[] $SwitchMap$java$net$Proxy$Type;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.apache.http.impl.conn.ProxySelectorRoutePlanner.C70501.$SwitchMap$java$net$Proxy$Type = r0
                r0 = r4
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = org.apache.http.impl.conn.ProxySelectorRoutePlanner.C70501.$SwitchMap$java$net$Proxy$Type     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = org.apache.http.impl.conn.ProxySelectorRoutePlanner.C70501.$SwitchMap$java$net$Proxy$Type     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                java.net.Proxy$Type r1 = java.net.Proxy.Type.SOCKS     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.ProxySelectorRoutePlanner.C70501.m45347clinit():void");
        }
    }

    public ProxySelectorRoutePlanner(SchemeRegistry schemeRegistry, ProxySelector proxySelector) {
        Args.notNull(schemeRegistry, "SchemeRegistry");
        this.schemeRegistry = schemeRegistry;
        this.proxySelector = proxySelector;
    }

    public Proxy chooseProxy(List<Proxy> list, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        Args.notEmpty(list, "List of proxies");
        Proxy proxy = null;
        for (int i10 = 0; proxy == null && i10 < list.size(); i10++) {
            Proxy proxy2 = list.get(i10);
            int i11 = C70501.$SwitchMap$java$net$Proxy$Type[proxy2.type().ordinal()];
            if (i11 == 1 || i11 == 2) {
                proxy = proxy2;
            }
        }
        Proxy proxy3 = proxy;
        if (proxy == null) {
            proxy3 = Proxy.NO_PROXY;
        }
        return proxy3;
    }

    public HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        ProxySelector proxySelector = this.proxySelector;
        ProxySelector proxySelector2 = proxySelector;
        if (proxySelector == null) {
            proxySelector2 = ProxySelector.getDefault();
        }
        if (proxySelector2 == null) {
            return null;
        }
        try {
            Proxy chooseProxy = chooseProxy(proxySelector2.select(new URI(httpHost.toURI())), httpHost, httpRequest, httpContext);
            HttpHost httpHost2 = null;
            if (chooseProxy.type() == Proxy.Type.HTTP) {
                if (!(chooseProxy.address() instanceof InetSocketAddress)) {
                    throw new HttpException("Unable to handle non-Inet proxy address: " + chooseProxy.address());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) chooseProxy.address();
                httpHost2 = new HttpHost(getHost(inetSocketAddress), inetSocketAddress.getPort());
            }
            return httpHost2;
        } catch (URISyntaxException e10) {
            throw new HttpException("Cannot convert host to URI: " + httpHost, e10);
        }
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
        HttpHost determineProxy = determineProxy(httpHost, httpRequest, httpContext);
        boolean isLayered = this.schemeRegistry.getScheme(httpHost.getSchemeName()).isLayered();
        return determineProxy == null ? new HttpRoute(httpHost, localAddress, isLayered) : new HttpRoute(httpHost, localAddress, determineProxy, isLayered);
    }

    public String getHost(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    public ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public void setProxySelector(ProxySelector proxySelector) {
        this.proxySelector = proxySelector;
    }
}
