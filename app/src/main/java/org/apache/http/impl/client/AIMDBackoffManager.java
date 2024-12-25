package org.apache.http.impl.client;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.BackoffManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/AIMDBackoffManager.class */
public class AIMDBackoffManager implements BackoffManager {
    private double backoffFactor;
    private int cap;
    private final Clock clock;
    private final ConnPoolControl<HttpRoute> connPerRoute;
    private long coolDown;
    private final Map<HttpRoute, Long> lastRouteBackoffs;
    private final Map<HttpRoute, Long> lastRouteProbes;

    public AIMDBackoffManager(ConnPoolControl<HttpRoute> connPoolControl) {
        this(connPoolControl, new SystemClock());
    }

    public AIMDBackoffManager(ConnPoolControl<HttpRoute> connPoolControl, Clock clock) {
        this.coolDown = 5000L;
        this.backoffFactor = 0.5d;
        this.cap = 2;
        this.clock = clock;
        this.connPerRoute = connPoolControl;
        this.lastRouteProbes = new HashMap();
        this.lastRouteBackoffs = new HashMap();
    }

    private int getBackedOffPoolSize(int i10) {
        if (i10 <= 1) {
            return 1;
        }
        return (int) Math.floor(this.backoffFactor * i10);
    }

    private Long getLastUpdate(Map<HttpRoute, Long> map, HttpRoute httpRoute) {
        Long l10 = map.get(httpRoute);
        Long l11 = l10;
        if (l10 == null) {
            l11 = 0L;
        }
        return l11;
    }

    @Override // org.apache.http.client.BackoffManager
    public void backOff(HttpRoute httpRoute) {
        synchronized (this.connPerRoute) {
            int maxPerRoute = this.connPerRoute.getMaxPerRoute(httpRoute);
            Long lastUpdate = getLastUpdate(this.lastRouteBackoffs, httpRoute);
            long currentTime = this.clock.getCurrentTime();
            if (currentTime - lastUpdate.longValue() < this.coolDown) {
                return;
            }
            this.connPerRoute.setMaxPerRoute(httpRoute, getBackedOffPoolSize(maxPerRoute));
            this.lastRouteBackoffs.put(httpRoute, Long.valueOf(currentTime));
        }
    }

    @Override // org.apache.http.client.BackoffManager
    public void probe(HttpRoute httpRoute) {
        synchronized (this.connPerRoute) {
            int maxPerRoute = this.connPerRoute.getMaxPerRoute(httpRoute);
            int i10 = this.cap;
            if (maxPerRoute < i10) {
                i10 = maxPerRoute + 1;
            }
            Long lastUpdate = getLastUpdate(this.lastRouteProbes, httpRoute);
            Long lastUpdate2 = getLastUpdate(this.lastRouteBackoffs, httpRoute);
            long currentTime = this.clock.getCurrentTime();
            if (currentTime - lastUpdate.longValue() >= this.coolDown && currentTime - lastUpdate2.longValue() >= this.coolDown) {
                this.connPerRoute.setMaxPerRoute(httpRoute, i10);
                this.lastRouteProbes.put(httpRoute, Long.valueOf(currentTime));
            }
        }
    }

    public void setBackoffFactor(double d10) {
        Args.check(d10 > 0.0d && d10 < 1.0d, "Backoff factor must be 0.0 < f < 1.0");
        this.backoffFactor = d10;
    }

    public void setCooldownMillis(long j10) {
        Args.positive(this.coolDown, "Cool down");
        this.coolDown = j10;
    }

    public void setPerHostConnectionCap(int i10) {
        Args.positive(i10, "Per host connection cap");
        this.cap = i10;
    }
}
