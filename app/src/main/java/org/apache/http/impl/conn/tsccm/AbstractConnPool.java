package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.IdleConnectionHandler;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/tsccm/AbstractConnPool.class */
public abstract class AbstractConnPool {
    public volatile boolean isShutDown;
    public Set<BasicPoolEntryRef> issuedConnections;
    public int numConnections;
    public ReferenceQueue<Object> refQueue;
    private final Log log = LogFactory.getLog(getClass());
    public Set<BasicPoolEntry> leasedConnections = new HashSet();
    public IdleConnectionHandler idleConnHandler = new IdleConnectionHandler();
    public final Lock poolLock = new ReentrantLock();

    public void closeConnection(OperatedClientConnection operatedClientConnection) {
        if (operatedClientConnection != null) {
            try {
                operatedClientConnection.close();
            } catch (IOException e10) {
                this.log.debug("I/O error closing connection", e10);
            }
        }
    }

    public void closeExpiredConnections() {
        this.poolLock.lock();
        try {
            this.idleConnHandler.closeExpiredConnections();
        } finally {
            this.poolLock.unlock();
        }
    }

    public void closeIdleConnections(long j10, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        this.poolLock.lock();
        try {
            this.idleConnHandler.closeIdleConnections(timeUnit.toMillis(j10));
        } finally {
            this.poolLock.unlock();
        }
    }

    public abstract void deleteClosedConnections();

    public void enableConnectionGC() {
    }

    public abstract void freeEntry(BasicPoolEntry basicPoolEntry, boolean z10, long j10, TimeUnit timeUnit);

    public final BasicPoolEntry getEntry(HttpRoute httpRoute, Object obj, long j10, TimeUnit timeUnit) {
        return requestPoolEntry(httpRoute, obj).getPoolEntry(j10, timeUnit);
    }

    public abstract void handleLostEntry(HttpRoute httpRoute);

    public void handleReference(Reference<?> reference) {
    }

    public abstract PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj);

    public void shutdown() {
        this.poolLock.lock();
        try {
            if (this.isShutDown) {
                return;
            }
            Iterator<BasicPoolEntry> it = this.leasedConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                it.remove();
                closeConnection(next.getConnection());
            }
            this.idleConnHandler.removeAll();
            this.isShutDown = true;
        } finally {
            this.poolLock.unlock();
        }
    }
}
