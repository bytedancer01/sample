package org.apache.http.pool;

import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/pool/PoolEntry.class */
public abstract class PoolEntry<T, C> {
    private final C conn;
    private final long created;
    private long expiry;

    /* renamed from: id */
    private final String f36173id;
    private final T route;
    private volatile Object state;
    private long updated;
    private final long validityDeadline;

    public PoolEntry(String str, T t10, C c10) {
        this(str, t10, c10, 0L, TimeUnit.MILLISECONDS);
    }

    public PoolEntry(String str, T t10, C c10, long j10, TimeUnit timeUnit) {
        Args.notNull(t10, "Route");
        Args.notNull(c10, "Connection");
        Args.notNull(timeUnit, "Time unit");
        this.f36173id = str;
        this.route = t10;
        this.conn = c10;
        long currentTimeMillis = System.currentTimeMillis();
        this.created = currentTimeMillis;
        this.updated = currentTimeMillis;
        long j11 = Long.MAX_VALUE;
        if (j10 > 0) {
            long millis = currentTimeMillis + timeUnit.toMillis(j10);
            j11 = Long.MAX_VALUE;
            if (millis > 0) {
                j11 = millis;
            }
        }
        this.validityDeadline = j11;
        this.expiry = this.validityDeadline;
    }

    public abstract void close();

    public C getConnection() {
        return this.conn;
    }

    public long getCreated() {
        return this.created;
    }

    public long getExpiry() {
        long j10;
        synchronized (this) {
            j10 = this.expiry;
        }
        return j10;
    }

    public String getId() {
        return this.f36173id;
    }

    public T getRoute() {
        return this.route;
    }

    public Object getState() {
        return this.state;
    }

    public long getUpdated() {
        long j10;
        synchronized (this) {
            j10 = this.updated;
        }
        return j10;
    }

    @Deprecated
    public long getValidUnit() {
        return this.validityDeadline;
    }

    public long getValidityDeadline() {
        return this.validityDeadline;
    }

    public abstract boolean isClosed();

    public boolean isExpired(long j10) {
        boolean z10;
        synchronized (this) {
            z10 = j10 >= this.expiry;
        }
        return z10;
    }

    public void setState(Object obj) {
        this.state = obj;
    }

    public String toString() {
        return "[id:" + this.f36173id + "][route:" + this.route + "][state:" + this.state + "]";
    }

    public void updateExpiry(long j10, TimeUnit timeUnit) {
        synchronized (this) {
            Args.notNull(timeUnit, "Time unit");
            long currentTimeMillis = System.currentTimeMillis();
            this.updated = currentTimeMillis;
            this.expiry = Math.min(j10 > 0 ? currentTimeMillis + timeUnit.toMillis(j10) : Long.MAX_VALUE, this.validityDeadline);
        }
    }
}
