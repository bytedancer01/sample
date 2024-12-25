package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.pool.PoolEntry;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/HttpPoolEntry.class */
class HttpPoolEntry extends PoolEntry<HttpRoute, OperatedClientConnection> {
    private final Log log;
    private final RouteTracker tracker;

    public HttpPoolEntry(Log log, String str, HttpRoute httpRoute, OperatedClientConnection operatedClientConnection, long j10, TimeUnit timeUnit) {
        super(str, httpRoute, operatedClientConnection, j10, timeUnit);
        this.log = log;
        this.tracker = new RouteTracker(httpRoute);
    }

    @Override // org.apache.http.pool.PoolEntry
    public void close() {
        try {
            getConnection().close();
        } catch (IOException e10) {
            this.log.debug("I/O error closing connection", e10);
        }
    }

    public HttpRoute getEffectiveRoute() {
        return this.tracker.toRoute();
    }

    public HttpRoute getPlannedRoute() {
        return getRoute();
    }

    public RouteTracker getTracker() {
        return this.tracker;
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isClosed() {
        return !getConnection().isOpen();
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isExpired(long j10) {
        boolean isExpired = super.isExpired(j10);
        if (isExpired && this.log.isDebugEnabled()) {
            this.log.debug("Connection " + this + " expired @ " + new Date(getExpiry()));
        }
        return isExpired;
    }
}
