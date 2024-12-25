package org.apache.http.conn.params;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/params/ConnPerRouteBean.class
 */
@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/params/ConnPerRouteBean.class */
public final class ConnPerRouteBean implements ConnPerRoute {
    public static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 2;
    private volatile int defaultMax;
    private final ConcurrentHashMap<HttpRoute, Integer> maxPerHostMap;

    public ConnPerRouteBean() {
        this(2);
    }

    public ConnPerRouteBean(int i10) {
        this.maxPerHostMap = new ConcurrentHashMap<>();
        setDefaultMaxPerRoute(i10);
    }

    public int getDefaultMax() {
        return this.defaultMax;
    }

    public int getDefaultMaxPerRoute() {
        return this.defaultMax;
    }

    @Override // org.apache.http.conn.params.ConnPerRoute
    public int getMaxForRoute(HttpRoute httpRoute) {
        Args.notNull(httpRoute, "HTTP route");
        Integer num = this.maxPerHostMap.get(httpRoute);
        return num != null ? num.intValue() : this.defaultMax;
    }

    public void setDefaultMaxPerRoute(int i10) {
        Args.positive(i10, "Default max per route");
        this.defaultMax = i10;
    }

    public void setMaxForRoute(HttpRoute httpRoute, int i10) {
        Args.notNull(httpRoute, "HTTP route");
        Args.positive(i10, "Max per route");
        this.maxPerHostMap.put(httpRoute, Integer.valueOf(i10));
    }

    public void setMaxForRoutes(Map<HttpRoute, Integer> map) {
        if (map == null) {
            return;
        }
        this.maxPerHostMap.clear();
        this.maxPerHostMap.putAll(map);
    }

    public String toString() {
        return this.maxPerHostMap.toString();
    }
}
