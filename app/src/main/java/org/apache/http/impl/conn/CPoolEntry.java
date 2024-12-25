package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.PoolEntry;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/CPoolEntry.class */
class CPoolEntry extends PoolEntry<HttpRoute, ManagedHttpClientConnection> {
    private final Log log;
    private volatile boolean routeComplete;

    public CPoolEntry(Log log, String str, HttpRoute httpRoute, ManagedHttpClientConnection managedHttpClientConnection, long j10, TimeUnit timeUnit) {
        super(str, httpRoute, managedHttpClientConnection, j10, timeUnit);
        this.log = log;
    }

    @Override // org.apache.http.pool.PoolEntry
    public void close() {
        try {
            closeConnection();
        } catch (IOException e10) {
            this.log.debug("I/O error closing connection", e10);
        }
    }

    public void closeConnection() {
        getConnection().close();
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

    public boolean isRouteComplete() {
        return this.routeComplete;
    }

    public void markRouteComplete() {
        this.routeComplete = true;
    }

    public void shutdownConnection() {
        getConnection().shutdown();
    }
}
