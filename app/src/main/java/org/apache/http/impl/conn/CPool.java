package org.apache.http.impl.conn;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.AbstractConnPool;
import org.apache.http.pool.ConnFactory;
import org.apache.http.pool.PoolEntryCallback;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/CPool.class */
class CPool extends AbstractConnPool<HttpRoute, ManagedHttpClientConnection, CPoolEntry> {
    private static final AtomicLong COUNTER = new AtomicLong();
    private final Log log;
    private final long timeToLive;
    private final TimeUnit tunit;

    public CPool(ConnFactory<HttpRoute, ManagedHttpClientConnection> connFactory, int i10, int i11, long j10, TimeUnit timeUnit) {
        super(connFactory, i10, i11);
        this.log = LogFactory.getLog(CPool.class);
        this.timeToLive = j10;
        this.tunit = timeUnit;
    }

    @Override // org.apache.http.pool.AbstractConnPool
    public CPoolEntry createEntry(HttpRoute httpRoute, ManagedHttpClientConnection managedHttpClientConnection) {
        return new CPoolEntry(this.log, Long.toString(COUNTER.getAndIncrement()), httpRoute, managedHttpClientConnection, this.timeToLive, this.tunit);
    }

    @Override // org.apache.http.pool.AbstractConnPool
    public void enumAvailable(PoolEntryCallback<HttpRoute, ManagedHttpClientConnection> poolEntryCallback) {
        super.enumAvailable(poolEntryCallback);
    }

    @Override // org.apache.http.pool.AbstractConnPool
    public void enumLeased(PoolEntryCallback<HttpRoute, ManagedHttpClientConnection> poolEntryCallback) {
        super.enumLeased(poolEntryCallback);
    }

    @Override // org.apache.http.pool.AbstractConnPool
    public boolean validate(CPoolEntry cPoolEntry) {
        return !cPoolEntry.getConnection().isStale();
    }
}
