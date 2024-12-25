package org.apache.http.pool;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.pool.PoolEntry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/pool/AbstractConnPool.class */
public abstract class AbstractConnPool<T, C, E extends PoolEntry<T, C>> implements ConnPool<T, E>, ConnPoolControl<T> {
    private final LinkedList<E> available;
    private final Condition condition;
    private final ConnFactory<T, C> connFactory;
    private volatile int defaultMaxPerRoute;
    private volatile boolean isShutDown;
    private final Set<E> leased;
    private final Lock lock;
    private final Map<T, Integer> maxPerRoute;
    private volatile int maxTotal;
    private final LinkedList<Future<E>> pending;
    private final Map<T, RouteSpecificPool<T, C, E>> routeToPool;
    private volatile int validateAfterInactivity;

    public AbstractConnPool(ConnFactory<T, C> connFactory, int i10, int i11) {
        this.connFactory = (ConnFactory) Args.notNull(connFactory, "Connection factory");
        this.defaultMaxPerRoute = Args.positive(i10, "Max per route value");
        this.maxTotal = Args.positive(i11, "Max total value");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.routeToPool = new HashMap();
        this.leased = new HashSet();
        this.available = new LinkedList<>();
        this.pending = new LinkedList<>();
        this.maxPerRoute = new HashMap();
    }

    private int getMax(T t10) {
        Integer num = this.maxPerRoute.get(t10);
        return num != null ? num.intValue() : this.defaultMaxPerRoute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RouteSpecificPool<T, C, E> getPool(T t10) {
        RouteSpecificPool routeSpecificPool = this.routeToPool.get(t10);
        RouteSpecificPool routeSpecificPool2 = routeSpecificPool;
        if (routeSpecificPool == null) {
            routeSpecificPool2 = new RouteSpecificPool<T, C, E>(this, t10, t10) { // from class: org.apache.http.pool.AbstractConnPool.1
                public final AbstractConnPool this$0;
                public final Object val$route;

                {
                    this.this$0 = this;
                    this.val$route = t10;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // org.apache.http.pool.RouteSpecificPool
                public E createEntry(C c10) {
                    return (E) this.this$0.createEntry(this.val$route, c10);
                }
            };
            this.routeToPool.put(t10, routeSpecificPool2);
        }
        return routeSpecificPool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public E getPoolEntryBlocking(T t10, Object obj, long j10, TimeUnit timeUnit, Future<E> future) {
        E e10;
        boolean z10;
        PoolEntry lastUsed;
        Date date = j10 > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j10)) : null;
        this.lock.lock();
        try {
            RouteSpecificPool pool = getPool(t10);
            while (true) {
                Asserts.check(!this.isShutDown, "Connection pool shut down");
                while (true) {
                    e10 = (E) pool.getFree(obj);
                    if (e10 == null) {
                        break;
                    }
                    if (e10.isExpired(System.currentTimeMillis())) {
                        e10.close();
                    }
                    if (!e10.isClosed()) {
                        break;
                    }
                    this.available.remove(e10);
                    pool.free(e10, false);
                }
                if (e10 != null) {
                    this.available.remove(e10);
                    this.leased.add(e10);
                    onReuse(e10);
                    return e10;
                }
                int max = getMax(t10);
                int max2 = Math.max(0, (pool.getAllocatedCount() + 1) - max);
                if (max2 > 0) {
                    for (int i10 = 0; i10 < max2 && (lastUsed = pool.getLastUsed()) != null; i10++) {
                        lastUsed.close();
                        this.available.remove(lastUsed);
                        pool.remove(lastUsed);
                    }
                }
                if (pool.getAllocatedCount() < max) {
                    int max3 = Math.max(this.maxTotal - this.leased.size(), 0);
                    if (max3 > 0) {
                        if (this.available.size() > max3 - 1 && !this.available.isEmpty()) {
                            E removeLast = this.available.removeLast();
                            removeLast.close();
                            getPool(removeLast.getRoute()).remove(removeLast);
                        }
                        E e11 = (E) pool.add(this.connFactory.create(t10));
                        this.leased.add(e11);
                        return e11;
                    }
                }
                try {
                    if (future.isCancelled()) {
                        throw new InterruptedException("Operation interrupted");
                    }
                    pool.queue(future);
                    this.pending.add(future);
                    if (date != null) {
                        z10 = this.condition.awaitUntil(date);
                    } else {
                        this.condition.await();
                        z10 = true;
                    }
                    if (future.isCancelled()) {
                        throw new InterruptedException("Operation interrupted");
                    }
                    pool.unqueue(future);
                    this.pending.remove(future);
                    if (!z10 && date != null && date.getTime() <= System.currentTimeMillis()) {
                        throw new TimeoutException("Timeout waiting for connection");
                    }
                } catch (Throwable th2) {
                    pool.unqueue(future);
                    this.pending.remove(future);
                    throw th2;
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    private void purgePoolMap() {
        Iterator<Map.Entry<T, RouteSpecificPool<T, C, E>>> it = this.routeToPool.entrySet().iterator();
        while (it.hasNext()) {
            RouteSpecificPool<T, C, E> value = it.next().getValue();
            if (value.getPendingCount() + value.getAllocatedCount() == 0) {
                it.remove();
            }
        }
    }

    public void closeExpired() {
        enumAvailable(new PoolEntryCallback<T, C>(this, System.currentTimeMillis()) { // from class: org.apache.http.pool.AbstractConnPool.4
            public final AbstractConnPool this$0;
            public final long val$now;

            {
                this.this$0 = this;
                this.val$now = r6;
            }

            @Override // org.apache.http.pool.PoolEntryCallback
            public void process(PoolEntry<T, C> poolEntry) {
                if (poolEntry.isExpired(this.val$now)) {
                    poolEntry.close();
                }
            }
        });
    }

    public void closeIdle(long j10, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j10);
        long j11 = millis;
        if (millis < 0) {
            j11 = 0;
        }
        enumAvailable(new PoolEntryCallback<T, C>(this, System.currentTimeMillis() - j11) { // from class: org.apache.http.pool.AbstractConnPool.3
            public final AbstractConnPool this$0;
            public final long val$deadline;

            {
                this.this$0 = this;
                this.val$deadline = r6;
            }

            @Override // org.apache.http.pool.PoolEntryCallback
            public void process(PoolEntry<T, C> poolEntry) {
                if (poolEntry.getUpdated() <= this.val$deadline) {
                    poolEntry.close();
                }
            }
        });
    }

    public abstract E createEntry(T t10, C c10);

    public void enumAvailable(PoolEntryCallback<T, C> poolEntryCallback) {
        this.lock.lock();
        try {
            Iterator<E> it = this.available.iterator();
            while (it.hasNext()) {
                E next = it.next();
                poolEntryCallback.process(next);
                if (next.isClosed()) {
                    getPool(next.getRoute()).remove(next);
                    it.remove();
                }
            }
            purgePoolMap();
        } finally {
            this.lock.unlock();
        }
    }

    public void enumLeased(PoolEntryCallback<T, C> poolEntryCallback) {
        this.lock.lock();
        try {
            Iterator<E> it = this.leased.iterator();
            while (it.hasNext()) {
                poolEntryCallback.process(it.next());
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        this.lock.lock();
        try {
            return this.defaultMaxPerRoute;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxPerRoute(T t10) {
        Args.notNull(t10, "Route");
        this.lock.lock();
        try {
            return getMax(t10);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxTotal() {
        this.lock.lock();
        try {
            return this.maxTotal;
        } finally {
            this.lock.unlock();
        }
    }

    public Set<T> getRoutes() {
        this.lock.lock();
        try {
            return new HashSet(this.routeToPool.keySet());
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getStats(T t10) {
        Args.notNull(t10, "Route");
        this.lock.lock();
        try {
            RouteSpecificPool<T, C, E> pool = getPool(t10);
            return new PoolStats(pool.getLeasedCount(), pool.getPendingCount(), pool.getAvailableCount(), getMax(t10));
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        this.lock.lock();
        try {
            return new PoolStats(this.leased.size(), this.pending.size(), this.available.size(), this.maxTotal);
        } finally {
            this.lock.unlock();
        }
    }

    public int getValidateAfterInactivity() {
        return this.validateAfterInactivity;
    }

    public boolean isShutdown() {
        return this.isShutDown;
    }

    public Future<E> lease(T t10, Object obj) {
        return lease(t10, obj, null);
    }

    @Override // org.apache.http.pool.ConnPool
    public Future<E> lease(T t10, Object obj, FutureCallback<E> futureCallback) {
        Args.notNull(t10, "Route");
        Asserts.check(!this.isShutDown, "Connection pool shut down");
        return (Future<E>) new Future<E>(this, futureCallback, t10, obj) { // from class: org.apache.http.pool.AbstractConnPool.2
            private final AtomicBoolean cancelled = new AtomicBoolean(false);
            private final AtomicBoolean done = new AtomicBoolean(false);
            private final AtomicReference<E> entryRef = new AtomicReference<>(null);
            public final AbstractConnPool this$0;
            public final FutureCallback val$callback;
            public final Object val$route;
            public final Object val$state;

            {
                this.this$0 = this;
                this.val$callback = futureCallback;
                this.val$route = t10;
                this.val$state = obj;
            }

            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                if (!this.cancelled.compareAndSet(false, true)) {
                    return false;
                }
                this.done.set(true);
                this.this$0.lock.lock();
                try {
                    this.this$0.condition.signalAll();
                    this.this$0.lock.unlock();
                    FutureCallback futureCallback2 = this.val$callback;
                    if (futureCallback2 == null) {
                        return true;
                    }
                    futureCallback2.cancelled();
                    return true;
                } catch (Throwable th2) {
                    this.this$0.lock.unlock();
                    throw th2;
                }
            }

            @Override // java.util.concurrent.Future
            public E get() {
                try {
                    return (E) get(0L, TimeUnit.MILLISECONDS);
                } catch (TimeoutException e10) {
                    throw new ExecutionException(e10);
                }
            }

            @Override // java.util.concurrent.Future
            public E get(long j10, TimeUnit timeUnit) {
                E e10;
                E e11 = this.entryRef.get();
                if (e11 != null) {
                    return e11;
                }
                synchronized (this) {
                    while (true) {
                        try {
                            e10 = (E) this.this$0.getPoolEntryBlocking(this.val$route, this.val$state, j10, timeUnit, this);
                            if (this.this$0.validateAfterInactivity <= 0 || e10.getUpdated() + this.this$0.validateAfterInactivity > System.currentTimeMillis() || this.this$0.validate(e10)) {
                                break;
                            }
                            e10.close();
                            this.this$0.release((AbstractConnPool) e10, false);
                        } catch (IOException e12) {
                            this.done.set(true);
                            FutureCallback futureCallback2 = this.val$callback;
                            if (futureCallback2 != null) {
                                futureCallback2.failed(e12);
                            }
                            throw new ExecutionException(e12);
                        }
                    }
                    this.entryRef.set(e10);
                    this.done.set(true);
                    this.this$0.onLease(e10);
                    FutureCallback futureCallback3 = this.val$callback;
                    if (futureCallback3 != null) {
                        futureCallback3.completed(e10);
                    }
                }
                return e10;
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return this.cancelled.get();
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return this.done.get();
            }
        };
    }

    public void onLease(E e10) {
    }

    public void onRelease(E e10) {
    }

    public void onReuse(E e10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.http.pool.ConnPool
    public void release(E e10, boolean z10) {
        this.lock.lock();
        try {
            if (this.leased.remove(e10)) {
                RouteSpecificPool pool = getPool(e10.getRoute());
                pool.free(e10, z10);
                if (!z10 || this.isShutDown) {
                    e10.close();
                } else {
                    this.available.addFirst(e10);
                }
                onRelease(e10);
                Future<E> nextPending = pool.nextPending();
                if (nextPending != null) {
                    this.pending.remove(nextPending);
                } else {
                    nextPending = this.pending.poll();
                }
                if (nextPending != null) {
                    this.condition.signalAll();
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i10) {
        Args.positive(i10, "Max per route value");
        this.lock.lock();
        try {
            this.defaultMaxPerRoute = i10;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxPerRoute(T t10, int i10) {
        Args.notNull(t10, "Route");
        this.lock.lock();
        try {
            if (i10 > -1) {
                this.maxPerRoute.put(t10, Integer.valueOf(i10));
            } else {
                this.maxPerRoute.remove(t10);
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxTotal(int i10) {
        Args.positive(i10, "Max value");
        this.lock.lock();
        try {
            this.maxTotal = i10;
        } finally {
            this.lock.unlock();
        }
    }

    public void setValidateAfterInactivity(int i10) {
        this.validateAfterInactivity = i10;
    }

    public void shutdown() {
        if (this.isShutDown) {
            return;
        }
        this.isShutDown = true;
        this.lock.lock();
        try {
            Iterator<E> it = this.available.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<E> it2 = this.leased.iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
            Iterator<RouteSpecificPool<T, C, E>> it3 = this.routeToPool.values().iterator();
            while (it3.hasNext()) {
                it3.next().shutdown();
            }
            this.routeToPool.clear();
            this.leased.clear();
            this.available.clear();
        } finally {
            this.lock.unlock();
        }
    }

    public String toString() {
        return "[leased: " + this.leased + "][available: " + this.available + "][pending: " + this.pending + "]";
    }

    public boolean validate(E e10) {
        return true;
    }
}
