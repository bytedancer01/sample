package org.apache.http.conn.routing;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/routing/HttpRoute.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/routing/HttpRoute.class */
public final class HttpRoute implements RouteInfo, Cloneable {
    private final RouteInfo.LayerType layered;
    private final InetAddress localAddress;
    private final List<HttpHost> proxyChain;
    private final boolean secure;
    private final HttpHost targetHost;
    private final RouteInfo.TunnelType tunnelled;

    public HttpRoute(HttpHost httpHost) {
        this(httpHost, (InetAddress) null, (List<HttpHost>) Collections.emptyList(), false, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    private HttpRoute(HttpHost httpHost, InetAddress inetAddress, List<HttpHost> list, boolean z10, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        Args.notNull(httpHost, "Target host");
        this.targetHost = normalize(httpHost);
        this.localAddress = inetAddress;
        this.proxyChain = (list == null || list.isEmpty()) ? null : new ArrayList(list);
        if (tunnelType == RouteInfo.TunnelType.TUNNELLED) {
            Args.check(this.proxyChain != null, "Proxy required if tunnelled");
        }
        this.secure = z10;
        this.tunnelled = tunnelType == null ? RouteInfo.TunnelType.PLAIN : tunnelType;
        this.layered = layerType == null ? RouteInfo.LayerType.PLAIN : layerType;
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost httpHost2, boolean z10) {
        this(httpHost, inetAddress, (List<HttpHost>) Collections.singletonList(Args.notNull(httpHost2, "Proxy host")), z10, z10 ? RouteInfo.TunnelType.TUNNELLED : RouteInfo.TunnelType.PLAIN, z10 ? RouteInfo.LayerType.LAYERED : RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost httpHost2, boolean z10, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        this(httpHost, inetAddress, (List<HttpHost>) (httpHost2 != null ? Collections.singletonList(httpHost2) : null), z10, tunnelType, layerType);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, boolean z10) {
        this(httpHost, inetAddress, (List<HttpHost>) Collections.emptyList(), z10, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost[] httpHostArr, boolean z10, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        this(httpHost, inetAddress, (List<HttpHost>) (httpHostArr != null ? Arrays.asList(httpHostArr) : null), z10, tunnelType, layerType);
    }

    public HttpRoute(HttpHost httpHost, HttpHost httpHost2) {
        this(httpHost, null, httpHost2, false);
    }

    private static int getDefaultPort(String str) {
        if (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(str)) {
            return 80;
        }
        return ClientConstants.DOMAIN_SCHEME.equalsIgnoreCase(str) ? 443 : -1;
    }

    private static HttpHost normalize(HttpHost httpHost) {
        if (httpHost.getPort() >= 0) {
            return httpHost;
        }
        InetAddress address = httpHost.getAddress();
        String schemeName = httpHost.getSchemeName();
        return address != null ? new HttpHost(address, getDefaultPort(schemeName), schemeName) : new HttpHost(httpHost.getHostName(), getDefaultPort(schemeName), schemeName);
    }

    public Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRoute)) {
            return false;
        }
        HttpRoute httpRoute = (HttpRoute) obj;
        if (this.secure != httpRoute.secure || this.tunnelled != httpRoute.tunnelled || this.layered != httpRoute.layered || !LangUtils.equals(this.targetHost, httpRoute.targetHost) || !LangUtils.equals(this.localAddress, httpRoute.localAddress) || !LangUtils.equals(this.proxyChain, httpRoute.proxyChain)) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final int getHopCount() {
        List<HttpHost> list = this.proxyChain;
        int i10 = 1;
        if (list != null) {
            i10 = 1 + list.size();
        }
        return i10;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getHopTarget(int i10) {
        Args.notNegative(i10, "Hop index");
        int hopCount = getHopCount();
        Args.check(i10 < hopCount, "Hop index exceeds tracked route length");
        return i10 < hopCount - 1 ? this.proxyChain.get(i10) : this.targetHost;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final RouteInfo.LayerType getLayerType() {
        return this.layered;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public final InetSocketAddress getLocalSocketAddress() {
        return this.localAddress != null ? new InetSocketAddress(this.localAddress, 0) : null;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getProxyHost() {
        List<HttpHost> list = this.proxyChain;
        return (list == null || list.isEmpty()) ? null : this.proxyChain.get(0);
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final RouteInfo.TunnelType getTunnelType() {
        return this.tunnelled;
    }

    public final int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, this.targetHost), this.localAddress);
        List<HttpHost> list = this.proxyChain;
        int i10 = hashCode;
        if (list != null) {
            Iterator<HttpHost> it = list.iterator();
            while (true) {
                i10 = hashCode;
                if (!it.hasNext()) {
                    break;
                }
                hashCode = LangUtils.hashCode(hashCode, it.next());
            }
        }
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(i10, this.secure), this.tunnelled), this.layered);
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean isLayered() {
        return this.layered == RouteInfo.LayerType.LAYERED;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean isSecure() {
        return this.secure;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final boolean isTunnelled() {
        return this.tunnelled == RouteInfo.TunnelType.TUNNELLED;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((getHopCount() * 30) + 50);
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            sb2.append(inetAddress);
            sb2.append("->");
        }
        sb2.append('{');
        if (this.tunnelled == RouteInfo.TunnelType.TUNNELLED) {
            sb2.append('t');
        }
        if (this.layered == RouteInfo.LayerType.LAYERED) {
            sb2.append('l');
        }
        if (this.secure) {
            sb2.append('s');
        }
        sb2.append("}->");
        List<HttpHost> list = this.proxyChain;
        if (list != null) {
            Iterator<HttpHost> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append("->");
            }
        }
        sb2.append(this.targetHost);
        return sb2.toString();
    }
}
