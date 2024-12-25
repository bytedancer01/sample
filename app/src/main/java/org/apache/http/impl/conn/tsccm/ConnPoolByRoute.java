package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/tsccm/ConnPoolByRoute.class */
public class ConnPoolByRoute extends AbstractConnPool {
    public final ConnPerRoute connPerRoute;
    private final long connTTL;
    private final TimeUnit connTTLTimeUnit;
    public final Queue<BasicPoolEntry> freeConnections;
    public final Set<BasicPoolEntry> leasedConnections;
    private final Log log;
    public volatile int maxTotalConnections;
    public volatile int numConnections;
    public final ClientConnectionOperator operator;
    private final Lock poolLock;
    public final Map<HttpRoute, RouteSpecificPool> routeToPool;
    public volatile boolean shutdown;
    public final Queue<WaitingThread> waitingThreads;

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute, int i10) {
        this(clientConnectionOperator, connPerRoute, i10, -1L, TimeUnit.MILLISECONDS);
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute, int i10, long j10, TimeUnit timeUnit) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(clientConnectionOperator, "Connection operator");
        Args.notNull(connPerRoute, "Connections per route");
        this.poolLock = super.poolLock;
        this.leasedConnections = super.leasedConnections;
        this.operator = clientConnectionOperator;
        this.connPerRoute = connPerRoute;
        this.maxTotalConnections = i10;
        this.freeConnections = createFreeConnQueue();
        this.waitingThreads = createWaitingThreadQueue();
        this.routeToPool = createRouteToPoolMap();
        this.connTTL = j10;
        this.connTTLTimeUnit = timeUnit;
    }

    @Deprecated
    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        this(clientConnectionOperator, ConnManagerParams.getMaxConnectionsPerRoute(httpParams), ConnManagerParams.getMaxTotalConnections(httpParams));
    }

    private void closeConnection(BasicPoolEntry basicPoolEntry) {
        OperatedClientConnection connection = basicPoolEntry.getConnection();
        if (connection != null) {
            try {
                connection.close();
            } catch (IOException e10) {
                this.log.debug("I/O error closing connection", e10);
            }
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        long currentTimeMillis = System.currentTimeMillis();
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (next.isExpired(currentTimeMillis)) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection expired @ " + new Date(next.getExpiry()));
                    }
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void closeIdleConnections(long j10, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        if (j10 <= 0) {
            j10 = 0;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Closing connections idle longer than " + j10 + " " + timeUnit);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long millis = timeUnit.toMillis(j10);
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (next.getUpdated() <= currentTimeMillis - millis) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection last used @ " + new Date(next.getUpdated()));
                    }
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    public BasicPoolEntry createEntry(RouteSpecificPool routeSpecificPool, ClientConnectionOperator clientConnectionOperator) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Creating new connection [" + routeSpecificPool.getRoute() + "]");
        }
        BasicPoolEntry basicPoolEntry = new BasicPoolEntry(clientConnectionOperator, routeSpecificPool.getRoute(), this.connTTL, this.connTTLTimeUnit);
        this.poolLock.lock();
        try {
            routeSpecificPool.createdEntry(basicPoolEntry);
            this.numConnections++;
            this.leasedConnections.add(basicPoolEntry);
            return basicPoolEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    public Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    public Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() {
        return new HashMap();
    }

    public Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void deleteClosedConnections() {
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (!next.getConnection().isOpen()) {
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    public void deleteEntry(BasicPoolEntry basicPoolEntry) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Deleting connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            closeConnection(basicPoolEntry);
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            routePool.deleteEntry(basicPoolEntry);
            this.numConnections--;
            if (routePool.isUnused()) {
                this.routeToPool.remove(plannedRoute);
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    public void deleteLeastUsedEntry() {
        this.poolLock.lock();
        try {
            BasicPoolEntry remove = this.freeConnections.remove();
            if (remove != null) {
                deleteEntry(remove);
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("No free connection to delete");
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void freeEntry(BasicPoolEntry basicPoolEntry, boolean z10, long j10, TimeUnit timeUnit) {
        String str;
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Releasing connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            if (this.shutdown) {
                closeConnection(basicPoolEntry);
                return;
            }
            this.leasedConnections.remove(basicPoolEntry);
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            if (!z10 || routePool.getCapacity() < 0) {
                closeConnection(basicPoolEntry);
                routePool.dropEntry();
                this.numConnections--;
            } else {
                if (this.log.isDebugEnabled()) {
                    if (j10 > 0) {
                        str = "for " + j10 + " " + timeUnit;
                    } else {
                        str = "indefinitely";
                    }
                    this.log.debug("Pooling connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]; keep alive " + str);
                }
                routePool.freeEntry(basicPoolEntry);
                basicPoolEntry.updateExpiry(j10, timeUnit);
                this.freeConnections.add(basicPoolEntry);
            }
            notifyWaitingThread(routePool);
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool() {
        this.poolLock.lock();
        try {
            return this.numConnections;
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        this.poolLock.lock();
        int i10 = 0;
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, false);
            if (routePool != null) {
                i10 = routePool.getEntryCount();
            }
            this.poolLock.unlock();
            return i10;
        } catch (Throwable th2) {
            this.poolLock.unlock();
            throw th2;
        }
    }

    public BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j10, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) {
        BasicPoolEntry basicPoolEntry;
        ClientConnectionOperator clientConnectionOperator;
        Date date = j10 > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j10)) : null;
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            WaitingThread waitingThread = null;
            BasicPoolEntry basicPoolEntry2 = null;
            while (true) {
                basicPoolEntry = basicPoolEntry2;
                if (basicPoolEntry2 != null) {
                    break;
                }
                boolean z10 = false;
                Asserts.check(!this.shutdown, "Connection pool shut down");
                if (this.log.isDebugEnabled()) {
                    this.log.debug("[" + httpRoute + "] total kept alive: " + this.freeConnections.size() + ", total issued: " + this.leasedConnections.size() + ", total allocated: " + this.numConnections + " out of " + this.maxTotalConnections);
                }
                basicPoolEntry = getFreeEntry(routePool, obj);
                if (basicPoolEntry != null) {
                    break;
                }
                if (routePool.getCapacity() > 0) {
                    z10 = true;
                }
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Available capacity: " + routePool.getCapacity() + " out of " + routePool.getMaxEntries() + " [" + httpRoute + "][" + obj + "]");
                }
                if (z10 && this.numConnections < this.maxTotalConnections) {
                    clientConnectionOperator = this.operator;
                } else if (!z10 || this.freeConnections.isEmpty()) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Need to wait for connection [" + httpRoute + "][" + obj + "]");
                    }
                    WaitingThread waitingThread2 = waitingThread;
                    if (waitingThread == null) {
                        waitingThread2 = newWaitingThread(this.poolLock.newCondition(), routePool);
                        waitingThreadAborter.setWaitingThread(waitingThread2);
                    }
                    try {
                        routePool.queueThread(waitingThread2);
                        this.waitingThreads.add(waitingThread2);
                        boolean await = waitingThread2.await(date);
                        routePool.removeThread(waitingThread2);
                        this.waitingThreads.remove(waitingThread2);
                        basicPoolEntry2 = basicPoolEntry;
                        waitingThread = waitingThread2;
                        if (await) {
                            continue;
                        } else {
                            basicPoolEntry2 = basicPoolEntry;
                            waitingThread = waitingThread2;
                            if (date == null) {
                                continue;
                            } else {
                                if (date.getTime() <= System.currentTimeMillis()) {
                                    throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
                                }
                                basicPoolEntry2 = basicPoolEntry;
                                waitingThread = waitingThread2;
                            }
                        }
                    } catch (Throwable th2) {
                        routePool.removeThread(waitingThread2);
                        this.waitingThreads.remove(waitingThread2);
                        throw th2;
                    }
                } else {
                    deleteLeastUsedEntry();
                    routePool = getRoutePool(httpRoute, true);
                    clientConnectionOperator = this.operator;
                }
                basicPoolEntry2 = createEntry(routePool, clientConnectionOperator);
            }
            this.poolLock.unlock();
            return basicPoolEntry;
        } catch (Throwable th3) {
            this.poolLock.unlock();
            throw th3;
        }
    }

    public BasicPoolEntry getFreeEntry(RouteSpecificPool routeSpecificPool, Object obj) {
        this.poolLock.lock();
        boolean z10 = false;
        BasicPoolEntry basicPoolEntry = null;
        while (!z10) {
            try {
                basicPoolEntry = routeSpecificPool.allocEntry(obj);
                if (basicPoolEntry != null) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Getting free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                    }
                    this.freeConnections.remove(basicPoolEntry);
                    if (basicPoolEntry.isExpired(System.currentTimeMillis())) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Closing expired free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                        }
                        closeConnection(basicPoolEntry);
                        routeSpecificPool.dropEntry();
                        this.numConnections--;
                    } else {
                        this.leasedConnections.add(basicPoolEntry);
                    }
                } else if (this.log.isDebugEnabled()) {
                    this.log.debug("No free connections [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                }
                z10 = true;
            } catch (Throwable th2) {
                this.poolLock.unlock();
                throw th2;
            }
        }
        this.poolLock.unlock();
        return basicPoolEntry;
    }

    public Lock getLock() {
        return this.poolLock;
    }

    public int getMaxTotalConnections() {
        return this.maxTotalConnections;
    }

    public RouteSpecificPool getRoutePool(HttpRoute httpRoute, boolean z10) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routeSpecificPool = this.routeToPool.get(httpRoute);
            RouteSpecificPool routeSpecificPool2 = routeSpecificPool;
            if (routeSpecificPool == null) {
                routeSpecificPool2 = routeSpecificPool;
                if (z10) {
                    routeSpecificPool2 = newRouteSpecificPool(httpRoute);
                    this.routeToPool.put(httpRoute, routeSpecificPool2);
                }
            }
            this.poolLock.unlock();
            return routeSpecificPool2;
        } catch (Throwable th2) {
            this.poolLock.unlock();
            throw th2;
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void handleLostEntry(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            routePool.dropEntry();
            if (routePool.isUnused()) {
                this.routeToPool.remove(httpRoute);
            }
            this.numConnections--;
            notifyWaitingThread(routePool);
        } finally {
            this.poolLock.unlock();
        }
    }

    public RouteSpecificPool newRouteSpecificPool(HttpRoute httpRoute) {
        return new RouteSpecificPool(httpRoute, this.connPerRoute);
    }

    public WaitingThread newWaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        return new WaitingThread(condition, routeSpecificPool);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #0 {all -> 0x00b7, blocks: (B:27:0x000d, B:29:0x0014, B:31:0x0020, B:33:0x0050, B:12:0x00a9, B:3:0x0057, B:5:0x0063, B:7:0x006f, B:9:0x007c, B:21:0x008b, B:23:0x0097), top: B:26:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool r4) {
        /*
            r3 = this;
            r0 = r3
            java.util.concurrent.locks.Lock r0 = r0.poolLock
            r0.lock()
            r0 = r4
            if (r0 == 0) goto L57
            r0 = r4
            boolean r0 = r0.hasThread()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L57
            r0 = r3
            org.apache.commons.logging.Log r0 = r0.log     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L4f
            r0 = r3
            org.apache.commons.logging.Log r0 = r0.log     // Catch: java.lang.Throwable -> Lb7
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> Lb7
            r0 = r6
            java.lang.String r1 = "Notifying thread waiting on pool ["
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lb7
            r0 = r6
            r1 = r4
            org.apache.http.conn.routing.HttpRoute r1 = r1.getRoute()     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lb7
            r0 = r6
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lb7
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb7
            r0.debug(r1)     // Catch: java.lang.Throwable -> Lb7
        L4f:
            r0 = r4
            org.apache.http.impl.conn.tsccm.WaitingThread r0 = r0.nextThread()     // Catch: java.lang.Throwable -> Lb7
            r4 = r0
            goto La5
        L57:
            r0 = r3
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r0 = r0.waitingThreads     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto L8b
            r0 = r3
            org.apache.commons.logging.Log r0 = r0.log     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L7b
            r0 = r3
            org.apache.commons.logging.Log r0 = r0.log     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = "Notifying thread waiting on any pool"
            r0.debug(r1)     // Catch: java.lang.Throwable -> Lb7
        L7b:
            r0 = r3
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r0 = r0.waitingThreads     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> Lb7
            org.apache.http.impl.conn.tsccm.WaitingThread r0 = (org.apache.http.impl.conn.tsccm.WaitingThread) r0     // Catch: java.lang.Throwable -> Lb7
            r4 = r0
            goto La5
        L8b:
            r0 = r3
            org.apache.commons.logging.Log r0 = r0.log     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto La3
            r0 = r3
            org.apache.commons.logging.Log r0 = r0.log     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = "Notifying no-one, there are no waiting threads"
            r0.debug(r1)     // Catch: java.lang.Throwable -> Lb7
        La3:
            r0 = 0
            r4 = r0
        La5:
            r0 = r4
            if (r0 == 0) goto Lad
            r0 = r4
            r0.wakeup()     // Catch: java.lang.Throwable -> Lb7
        Lad:
            r0 = r3
            java.util.concurrent.locks.Lock r0 = r0.poolLock
            r0.unlock()
            return
        Lb7:
            r4 = move-exception
            r0 = r3
            java.util.concurrent.locks.Lock r0 = r0.poolLock
            r0.unlock()
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool):void");
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj) {
        return new PoolEntryRequest(this, new WaitingThreadAborter(), httpRoute, obj) { // from class: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.1
            public final ConnPoolByRoute this$0;
            public final WaitingThreadAborter val$aborter;
            public final HttpRoute val$route;
            public final Object val$state;

            {
                this.this$0 = this;
                this.val$aborter = r5;
                this.val$route = httpRoute;
                this.val$state = obj;
            }

            @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
            public void abortRequest() {
                this.this$0.poolLock.lock();
                try {
                    this.val$aborter.abort();
                } finally {
                    this.this$0.poolLock.unlock();
                }
            }

            @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
            public BasicPoolEntry getPoolEntry(long j10, TimeUnit timeUnit) {
                return this.this$0.getEntryBlocking(this.val$route, this.val$state, j10, timeUnit, this.val$aborter);
            }
        };
    }

    public void setMaxTotalConnections(int i10) {
        this.poolLock.lock();
        try {
            this.maxTotalConnections = i10;
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void shutdown() {
        this.poolLock.lock();
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Iterator<BasicPoolEntry> it = this.leasedConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                it.remove();
                closeConnection(next);
            }
            Iterator<BasicPoolEntry> it2 = this.freeConnections.iterator();
            while (it2.hasNext()) {
                BasicPoolEntry next2 = it2.next();
                it2.remove();
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Closing connection [" + next2.getPlannedRoute() + "][" + next2.getState() + "]");
                }
                closeConnection(next2);
            }
            Iterator<WaitingThread> it3 = this.waitingThreads.iterator();
            while (it3.hasNext()) {
                WaitingThread next3 = it3.next();
                it3.remove();
                next3.wakeup();
            }
            this.routeToPool.clear();
        } finally {
            this.poolLock.unlock();
        }
    }
}
