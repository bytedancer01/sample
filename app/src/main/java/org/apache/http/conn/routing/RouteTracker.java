package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.LangUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/routing/RouteTracker.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/routing/RouteTracker.class */
public final class RouteTracker implements RouteInfo, Cloneable {
    private boolean connected;
    private RouteInfo.LayerType layered;
    private final InetAddress localAddress;
    private HttpHost[] proxyChain;
    private boolean secure;
    private final HttpHost targetHost;
    private RouteInfo.TunnelType tunnelled;

    public RouteTracker(HttpHost httpHost, InetAddress inetAddress) {
        Args.notNull(httpHost, "Target host");
        this.targetHost = httpHost;
        this.localAddress = inetAddress;
        this.tunnelled = RouteInfo.TunnelType.PLAIN;
        this.layered = RouteInfo.LayerType.PLAIN;
    }

    public RouteTracker(HttpRoute httpRoute) {
        this(httpRoute.getTargetHost(), httpRoute.getLocalAddress());
    }

    public Object clone() {
        return super.clone();
    }

    public final void connectProxy(HttpHost httpHost, boolean z10) {
        Args.notNull(httpHost, "Proxy host");
        Asserts.check(!this.connected, "Already connected");
        this.connected = true;
        this.proxyChain = new HttpHost[]{httpHost};
        this.secure = z10;
    }

    public final void connectTarget(boolean z10) {
        Asserts.check(!this.connected, "Already connected");
        this.connected = true;
        this.secure = z10;
    }

    public final boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RouteTracker)) {
            return false;
        }
        RouteTracker routeTracker = (RouteTracker) obj;
        if (this.connected != routeTracker.connected || this.secure != routeTracker.secure || this.tunnelled != routeTracker.tunnelled || this.layered != routeTracker.layered || !LangUtils.equals(this.targetHost, routeTracker.targetHost) || !LangUtils.equals(this.localAddress, routeTracker.localAddress) || !LangUtils.equals((Object[]) this.proxyChain, (Object[]) routeTracker.proxyChain)) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final int getHopCount() {
        int i10 = 1;
        if (this.connected) {
            HttpHost[] httpHostArr = this.proxyChain;
            if (httpHostArr != null) {
                i10 = 1 + httpHostArr.length;
            }
        } else {
            i10 = 0;
        }
        return i10;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getHopTarget(int i10) {
        Args.notNegative(i10, "Hop index");
        int hopCount = getHopCount();
        Args.check(i10 < hopCount, "Hop index exceeds tracked route length");
        return i10 < hopCount - 1 ? this.proxyChain[i10] : this.targetHost;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final RouteInfo.LayerType getLayerType() {
        return this.layered;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public final HttpHost getProxyHost() {
        HttpHost[] httpHostArr = this.proxyChain;
        return httpHostArr == null ? null : httpHostArr[0];
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
        HttpHost[] httpHostArr = this.proxyChain;
        int i10 = hashCode;
        if (httpHostArr != null) {
            int length = httpHostArr.length;
            int i11 = 0;
            while (true) {
                i10 = hashCode;
                if (i11 >= length) {
                    break;
                }
                hashCode = LangUtils.hashCode(hashCode, httpHostArr[i11]);
                i11++;
            }
        }
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(i10, this.connected), this.secure), this.tunnelled), this.layered);
    }

    public final boolean isConnected() {
        return this.connected;
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

    public final void layerProtocol(boolean z10) {
        Asserts.check(this.connected, "No layered protocol unless connected");
        this.layered = RouteInfo.LayerType.LAYERED;
        this.secure = z10;
    }

    public void reset() {
        this.connected = false;
        this.proxyChain = null;
        this.tunnelled = RouteInfo.TunnelType.PLAIN;
        this.layered = RouteInfo.LayerType.PLAIN;
        this.secure = false;
    }

    public final HttpRoute toRoute() {
        return !this.connected ? null : new HttpRoute(this.targetHost, this.localAddress, this.proxyChain, this.secure, this.tunnelled, this.layered);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((getHopCount() * 30) + 50);
        sb2.append("RouteTracker[");
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            sb2.append(inetAddress);
            sb2.append("->");
        }
        sb2.append('{');
        if (this.connected) {
            sb2.append('c');
        }
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
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr != null) {
            for (HttpHost httpHost : httpHostArr) {
                sb2.append(httpHost);
                sb2.append("->");
            }
        }
        sb2.append(this.targetHost);
        sb2.append(']');
        return sb2.toString();
    }

    public final void tunnelProxy(HttpHost httpHost, boolean z10) {
        Args.notNull(httpHost, "Proxy host");
        Asserts.check(this.connected, "No tunnel unless connected");
        Asserts.notNull(this.proxyChain, "No tunnel without proxy");
        HttpHost[] httpHostArr = this.proxyChain;
        int length = httpHostArr.length + 1;
        HttpHost[] httpHostArr2 = new HttpHost[length];
        System.arraycopy(httpHostArr, 0, httpHostArr2, 0, httpHostArr.length);
        httpHostArr2[length - 1] = httpHost;
        this.proxyChain = httpHostArr2;
        this.secure = z10;
    }

    public final void tunnelTarget(boolean z10) {
        Asserts.check(this.connected, "No tunnel unless connected");
        Asserts.notNull(this.proxyChain, "No tunnel without proxy");
        this.tunnelled = RouteInfo.TunnelType.TUNNELLED;
        this.secure = z10;
    }
}
