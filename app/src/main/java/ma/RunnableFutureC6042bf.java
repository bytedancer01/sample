package ma;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/bf.class
 */
/* renamed from: ma.bf */
/* loaded from: combined.jar:classes2.jar:ma/bf.class */
public final class RunnableFutureC6042bf extends C6209je implements RunnableFuture {

    /* renamed from: i */
    public volatile AbstractRunnableC6419te f33689i;

    public RunnableFutureC6042bf(Callable callable) {
        this.f33689i = new C6021af(this, callable);
    }

    /* renamed from: x */
    public static RunnableFutureC6042bf m29440x(Runnable runnable, Object obj) {
        return new RunnableFutureC6042bf(Executors.callable(runnable, obj));
    }

    @Override // ma.AbstractC6062ce
    /* renamed from: g */
    public final String mo29441g() {
        AbstractRunnableC6419te abstractRunnableC6419te = this.f33689i;
        if (abstractRunnableC6419te == null) {
            return super.mo29441g();
        }
        return "task=[" + abstractRunnableC6419te.toString() + "]";
    }

    @Override // ma.AbstractC6062ce
    /* renamed from: k */
    public final void mo29442k() {
        AbstractRunnableC6419te abstractRunnableC6419te;
        if (m29506n() && (abstractRunnableC6419te = this.f33689i) != null) {
            abstractRunnableC6419te.m30043e();
        }
        this.f33689i = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC6419te abstractRunnableC6419te = this.f33689i;
        if (abstractRunnableC6419te != null) {
            abstractRunnableC6419te.run();
        }
        this.f33689i = null;
    }
}
