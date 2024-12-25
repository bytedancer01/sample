package org.apache.http.impl.conn;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/SystemDefaultRoutePlanner.class */
public class SystemDefaultRoutePlanner extends DefaultRoutePlanner {
    private final ProxySelector proxySelector;

    /* renamed from: org.apache.http.impl.conn.SystemDefaultRoutePlanner$1 */
    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/SystemDefaultRoutePlanner$1.class */
    public static /* synthetic */ class C70521 {
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
                org.apache.http.impl.conn.SystemDefaultRoutePlanner.C70521.$SwitchMap$java$net$Proxy$Type = r0
                r0 = r4
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = org.apache.http.impl.conn.SystemDefaultRoutePlanner.C70521.$SwitchMap$java$net$Proxy$Type     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = org.apache.http.impl.conn.SystemDefaultRoutePlanner.C70521.$SwitchMap$java$net$Proxy$Type     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
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
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.SystemDefaultRoutePlanner.C70521.m45349clinit():void");
        }
    }

    public SystemDefaultRoutePlanner(ProxySelector proxySelector) {
        this(null, proxySelector);
    }

    public SystemDefaultRoutePlanner(SchemePortResolver schemePortResolver, ProxySelector proxySelector) {
        super(schemePortResolver);
        this.proxySelector = proxySelector;
    }

    private Proxy chooseProxy(List<Proxy> list) {
        Proxy proxy = null;
        for (int i10 = 0; proxy == null && i10 < list.size(); i10++) {
            Proxy proxy2 = list.get(i10);
            int i11 = C70521.$SwitchMap$java$net$Proxy$Type[proxy2.type().ordinal()];
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

    private String getHost(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    @Override // org.apache.http.impl.conn.DefaultRoutePlanner
    public HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        try {
            URI uri = new URI(httpHost.toURI());
            ProxySelector proxySelector = this.proxySelector;
            ProxySelector proxySelector2 = proxySelector;
            if (proxySelector == null) {
                proxySelector2 = ProxySelector.getDefault();
            }
            if (proxySelector2 == null) {
                return null;
            }
            Proxy chooseProxy = chooseProxy(proxySelector2.select(uri));
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
}
