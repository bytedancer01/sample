package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.UUID;
import java.util.concurrent.Executor;
import lc.InterfaceFutureC5838a;
import p071e2.AbstractC4594w;
import p071e2.C4576e;
import p263p2.C7546c;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/ListenableWorker.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/ListenableWorker.class */
public abstract class ListenableWorker {

    /* renamed from: b */
    public Context f5136b;

    /* renamed from: c */
    public WorkerParameters f5137c;

    /* renamed from: d */
    public volatile boolean f5138d;

    /* renamed from: e */
    public boolean f5139e;

    /* renamed from: f */
    public boolean f5140f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/ListenableWorker$a.class
     */
    /* renamed from: androidx.work.ListenableWorker$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/ListenableWorker$a.class */
    public static abstract class AbstractC0753a {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/work/ListenableWorker$a$a.class
         */
        /* renamed from: androidx.work.ListenableWorker$a$a */
        /* loaded from: combined.jar:classes1.jar:androidx/work/ListenableWorker$a$a.class */
        public static final class a extends AbstractC0753a {

            /* renamed from: a */
            public final C0757b f5141a;

            public a() {
                this(C0757b.f5186c);
            }

            public a(C0757b c0757b) {
                this.f5141a = c0757b;
            }

            /* renamed from: e */
            public C0757b m4837e() {
                return this.f5141a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f5141a.equals(((a) obj).f5141a);
            }

            public int hashCode() {
                return (a.class.getName().hashCode() * 31) + this.f5141a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f5141a + '}';
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/work/ListenableWorker$a$b.class
         */
        /* renamed from: androidx.work.ListenableWorker$a$b */
        /* loaded from: combined.jar:classes1.jar:androidx/work/ListenableWorker$a$b.class */
        public static final class b extends AbstractC0753a {
            public boolean equals(Object obj) {
                boolean z10 = true;
                if (this == obj) {
                    return true;
                }
                if (obj == null || b.class != obj.getClass()) {
                    z10 = false;
                }
                return z10;
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/work/ListenableWorker$a$c.class
         */
        /* renamed from: androidx.work.ListenableWorker$a$c */
        /* loaded from: combined.jar:classes1.jar:androidx/work/ListenableWorker$a$c.class */
        public static final class c extends AbstractC0753a {

            /* renamed from: a */
            public final C0757b f5142a;

            public c() {
                this(C0757b.f5186c);
            }

            public c(C0757b c0757b) {
                this.f5142a = c0757b;
            }

            /* renamed from: e */
            public C0757b m4838e() {
                return this.f5142a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f5142a.equals(((c) obj).f5142a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f5142a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f5142a + '}';
            }
        }

        /* renamed from: a */
        public static AbstractC0753a m4833a() {
            return new a();
        }

        /* renamed from: b */
        public static AbstractC0753a m4834b() {
            return new b();
        }

        /* renamed from: c */
        public static AbstractC0753a m4835c() {
            return new c();
        }

        /* renamed from: d */
        public static AbstractC0753a m4836d(C0757b c0757b) {
            return new c(c0757b);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f5136b = context;
        this.f5137c = workerParameters;
    }

    /* renamed from: a */
    public final Context m4821a() {
        return this.f5136b;
    }

    /* renamed from: c */
    public Executor m4822c() {
        return this.f5137c.m4843a();
    }

    /* renamed from: d */
    public InterfaceFutureC5838a<C4576e> mo4808d() {
        C7546c m32302t = C7546c.m32302t();
        m32302t.mo32292q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return m32302t;
    }

    /* renamed from: e */
    public final UUID m4823e() {
        return this.f5137c.m4845c();
    }

    /* renamed from: g */
    public final C0757b m4824g() {
        return this.f5137c.m4846d();
    }

    /* renamed from: h */
    public InterfaceC7748a mo4825h() {
        return this.f5137c.m4847e();
    }

    /* renamed from: i */
    public AbstractC4594w m4826i() {
        return this.f5137c.m4848f();
    }

    /* renamed from: j */
    public boolean mo4827j() {
        return this.f5140f;
    }

    /* renamed from: k */
    public final boolean m4828k() {
        return this.f5138d;
    }

    /* renamed from: l */
    public final boolean m4829l() {
        return this.f5139e;
    }

    /* renamed from: m */
    public void mo4809m() {
    }

    /* renamed from: n */
    public void m4830n(boolean z10) {
        this.f5140f = z10;
    }

    /* renamed from: o */
    public final void m4831o() {
        this.f5139e = true;
    }

    /* renamed from: p */
    public abstract InterfaceFutureC5838a<AbstractC0753a> mo4810p();

    /* renamed from: q */
    public final void m4832q() {
        this.f5138d = true;
        mo4809m();
    }
}
