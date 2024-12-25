package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/tsccm/BasicPoolEntry.class */
public class BasicPoolEntry extends AbstractPoolEntry {
    private final long created;
    private long expiry;
    private long updated;
    private final long validUntil;

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute) {
        this(clientConnectionOperator, httpRoute, -1L, TimeUnit.MILLISECONDS);
    }

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute, long j10, TimeUnit timeUnit) {
        super(clientConnectionOperator, httpRoute);
        Args.notNull(httpRoute, "HTTP route");
        long currentTimeMillis = System.currentTimeMillis();
        this.created = currentTimeMillis;
        this.validUntil = j10 > 0 ? currentTimeMillis + timeUnit.toMillis(j10) : Long.MAX_VALUE;
        this.expiry = this.validUntil;
    }

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute, ReferenceQueue<Object> referenceQueue) {
        super(clientConnectionOperator, httpRoute);
        Args.notNull(httpRoute, "HTTP route");
        this.created = System.currentTimeMillis();
        this.validUntil = Long.MAX_VALUE;
        this.expiry = Long.MAX_VALUE;
    }

    public final OperatedClientConnection getConnection() {
        return this.connection;
    }

    public long getCreated() {
        return this.created;
    }

    public long getExpiry() {
        return this.expiry;
    }

    public final HttpRoute getPlannedRoute() {
        return this.route;
    }

    public long getUpdated() {
        return this.updated;
    }

    public long getValidUntil() {
        return this.validUntil;
    }

    public final BasicPoolEntryRef getWeakRef() {
        return null;
    }

    public boolean isExpired(long j10) {
        return j10 >= this.expiry;
    }

    @Override // org.apache.http.impl.conn.AbstractPoolEntry
    public void shutdownEntry() {
        super.shutdownEntry();
    }

    public void updateExpiry(long j10, TimeUnit timeUnit) {
        long currentTimeMillis = System.currentTimeMillis();
        this.updated = currentTimeMillis;
        this.expiry = Math.min(this.validUntil, j10 > 0 ? currentTimeMillis + timeUnit.toMillis(j10) : Long.MAX_VALUE);
    }
}
