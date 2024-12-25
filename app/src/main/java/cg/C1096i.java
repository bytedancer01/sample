package cg;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/i.class
 */
/* renamed from: cg.i */
/* loaded from: combined.jar:classes2.jar:cg/i.class */
public final class C1096i {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/i$b.class
     */
    /* renamed from: cg.i$b */
    /* loaded from: combined.jar:classes2.jar:cg/i$b.class */
    public static class b<V> extends c<V> {

        /* renamed from: c */
        public final Throwable f7309c;

        public b(Throwable th2) {
            super();
            this.f7309c = th2;
        }

        @Override // cg.C1096i.c, java.util.concurrent.Future
        public V get() {
            throw new ExecutionException(this.f7309c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/i$c.class
     */
    /* renamed from: cg.i$c */
    /* loaded from: combined.jar:classes2.jar:cg/i$c.class */
    public static abstract class c<V> implements InterfaceFutureC1097j<V> {

        /* renamed from: b */
        public static final Logger f7310b = Logger.getLogger(c.class.getName());

        public c() {
        }

        @Override // cg.InterfaceFutureC1097j
        /* renamed from: a */
        public void mo6492a(Runnable runnable, Executor executor) {
            C1102o.m6666b(runnable, "Runnable was null.");
            C1102o.m6666b(executor, "Executor was null.");
            try {
                executor.execute(runnable);
            } catch (RuntimeException e10) {
                f7310b.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public abstract V get();

        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            C1102o.m6665a(timeUnit);
            return get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }
    }

    /* renamed from: a */
    public static <V> InterfaceFutureC1097j<V> m6540a(Throwable th2) {
        C1102o.m6665a(th2);
        return new b(th2);
    }
}
