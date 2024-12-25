package p072e3;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p109g3.C4936b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e3/e.class
 */
/* renamed from: e3.e */
/* loaded from: combined.jar:classes1.jar:e3/e.class */
public abstract class AbstractC4599e<T> {

    /* renamed from: a */
    public final Executor f27249a;

    /* renamed from: b */
    public AtomicReference<Object> f27250b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicBoolean f27251c = new AtomicBoolean();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/e$a.class
     */
    /* renamed from: e3.e$a */
    /* loaded from: combined.jar:classes1.jar:e3/e$a.class */
    public static final class a extends AbstractC4599e<T> {

        /* renamed from: d */
        public final Object f27252d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Executor executor, Object obj) {
            super(executor);
            this.f27252d = obj;
        }

        @Override // p072e3.AbstractC4599e
        /* renamed from: d */
        public T mo23189d() {
            return (T) this.f27252d;
        }
    }

    public AbstractC4599e(Executor executor) {
        this.f27249a = executor;
    }

    /* renamed from: b */
    public static <T> AbstractC4599e<T> m23186b(T t10) {
        return new a(null, t10);
    }

    /* renamed from: a */
    public final void m23187a() {
        if (!this.f27251c.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
    }

    /* renamed from: c */
    public final T m23188c() {
        m23187a();
        try {
            return mo23189d();
        } catch (Exception e10) {
            throw new C4936b("Failed to perform store operation", e10);
        }
    }

    /* renamed from: d */
    public abstract T mo23189d();
}
