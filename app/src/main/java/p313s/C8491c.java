package p313s;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import lc.InterfaceFutureC5838a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s/c.class
 */
/* renamed from: s.c */
/* loaded from: combined.jar:classes1.jar:s/c.class */
public final class C8491c {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/c$a.class
     */
    /* renamed from: s.c$a */
    /* loaded from: combined.jar:classes1.jar:s/c$a.class */
    public static final class a<T> {

        /* renamed from: a */
        public Object f39820a;

        /* renamed from: b */
        public d<T> f39821b;

        /* renamed from: c */
        public C8492d<Void> f39822c = C8492d.m36648s();

        /* renamed from: d */
        public boolean f39823d;

        /* renamed from: a */
        public void m36641a() {
            this.f39820a = null;
            this.f39821b = null;
            this.f39822c.mo36629p(null);
        }

        /* renamed from: b */
        public boolean m36642b(T t10) {
            boolean z10 = true;
            this.f39823d = true;
            d<T> dVar = this.f39821b;
            if (dVar == null || !dVar.m36646c(t10)) {
                z10 = false;
            }
            if (z10) {
                m36644d();
            }
            return z10;
        }

        /* renamed from: c */
        public boolean m36643c() {
            boolean z10 = true;
            this.f39823d = true;
            d<T> dVar = this.f39821b;
            if (dVar == null || !dVar.m36645b(true)) {
                z10 = false;
            }
            if (z10) {
                m36644d();
            }
            return z10;
        }

        /* renamed from: d */
        public final void m36644d() {
            this.f39820a = null;
            this.f39821b = null;
            this.f39822c = null;
        }

        public void finalize() {
            C8492d<Void> c8492d;
            d<T> dVar = this.f39821b;
            if (dVar != null && !dVar.isDone()) {
                dVar.m36647d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f39820a));
            }
            if (this.f39823d || (c8492d = this.f39822c) == null) {
                return;
            }
            c8492d.mo36629p(null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/c$b.class
     */
    /* renamed from: s.c$b */
    /* loaded from: combined.jar:classes1.jar:s/c$b.class */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            synchronized (this) {
            }
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/c$c.class
     */
    /* renamed from: s.c$c */
    /* loaded from: combined.jar:classes1.jar:s/c$c.class */
    public interface c<T> {
        /* renamed from: a */
        Object mo30154a(a<T> aVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s/c$d.class
     */
    /* renamed from: s.c$d */
    /* loaded from: combined.jar:classes1.jar:s/c$d.class */
    public static final class d<T> implements InterfaceFutureC5838a<T> {

        /* renamed from: b */
        public final WeakReference<a<T>> f39824b;

        /* renamed from: c */
        public final AbstractC8489a<T> f39825c = new a(this);

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:s/c$d$a.class
         */
        /* renamed from: s.c$d$a */
        /* loaded from: combined.jar:classes1.jar:s/c$d$a.class */
        public class a extends AbstractC8489a<T> {

            /* renamed from: i */
            public final d f39826i;

            public a(d dVar) {
                this.f39826i = dVar;
            }

            @Override // p313s.AbstractC8489a
            /* renamed from: m */
            public String mo36626m() {
                a<T> aVar = this.f39826i.f39824b.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f39820a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f39824b = new WeakReference<>(aVar);
        }

        @Override // lc.InterfaceFutureC5838a
        /* renamed from: a */
        public void mo23123a(Runnable runnable, Executor executor) {
            this.f39825c.mo23123a(runnable, executor);
        }

        /* renamed from: b */
        public boolean m36645b(boolean z10) {
            return this.f39825c.cancel(z10);
        }

        /* renamed from: c */
        public boolean m36646c(T t10) {
            return this.f39825c.mo36629p(t10);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f39824b.get();
            boolean cancel = this.f39825c.cancel(z10);
            if (cancel && aVar != null) {
                aVar.m36641a();
            }
            return cancel;
        }

        /* renamed from: d */
        public boolean m36647d(Throwable th2) {
            return this.f39825c.mo36630q(th2);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f39825c.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.f39825c.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f39825c.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f39825c.isDone();
        }

        public String toString() {
            return this.f39825c.toString();
        }
    }

    /* renamed from: a */
    public static <T> InterfaceFutureC5838a<T> m36640a(c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f39821b = dVar;
        aVar.f39820a = cVar.getClass();
        try {
            Object mo30154a = cVar.mo30154a(aVar);
            if (mo30154a != null) {
                aVar.f39820a = mo30154a;
            }
        } catch (Exception e10) {
            dVar.m36647d(e10);
        }
        return dVar;
    }
}
