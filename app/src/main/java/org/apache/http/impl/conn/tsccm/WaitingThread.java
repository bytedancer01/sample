package org.apache.http.impl.conn.tsccm;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.Date;
import java.util.concurrent.locks.Condition;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/tsccm/WaitingThread.class */
public class WaitingThread {
    private boolean aborted;
    private final Condition cond;
    private final RouteSpecificPool pool;
    private Thread waiter;

    public WaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        Args.notNull(condition, JsonDocumentFields.CONDITION);
        this.cond = condition;
        this.pool = routeSpecificPool;
    }

    public boolean await(Date date) {
        boolean z10;
        if (this.waiter != null) {
            throw new IllegalStateException("A thread is already waiting on this object.\ncaller: " + Thread.currentThread() + "\nwaiter: " + this.waiter);
        }
        if (this.aborted) {
            throw new InterruptedException("Operation interrupted");
        }
        this.waiter = Thread.currentThread();
        try {
            if (date != null) {
                z10 = this.cond.awaitUntil(date);
            } else {
                this.cond.await();
                z10 = true;
            }
            if (this.aborted) {
                throw new InterruptedException("Operation interrupted");
            }
            this.waiter = null;
            return z10;
        } catch (Throwable th2) {
            this.waiter = null;
            throw th2;
        }
    }

    public final Condition getCondition() {
        return this.cond;
    }

    public final RouteSpecificPool getPool() {
        return this.pool;
    }

    public final Thread getThread() {
        return this.waiter;
    }

    public void interrupt() {
        this.aborted = true;
        this.cond.signalAll();
    }

    public void wakeup() {
        if (this.waiter == null) {
            throw new IllegalStateException("Nobody waiting on this object.");
        }
        this.cond.signalAll();
    }
}
