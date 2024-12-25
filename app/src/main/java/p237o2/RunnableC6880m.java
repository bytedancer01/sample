package p237o2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import lc.InterfaceFutureC5838a;
import p071e2.AbstractC4582k;
import p071e2.C4576e;
import p071e2.InterfaceC4577f;
import p175k0.C5440a;
import p223n2.C6636p;
import p263p2.C7546c;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/m.class
 */
/* renamed from: o2.m */
/* loaded from: combined.jar:classes1.jar:o2/m.class */
public class RunnableC6880m implements Runnable {

    /* renamed from: h */
    public static final String f35650h = AbstractC4582k.m23128f("WorkForegroundRunnable");

    /* renamed from: b */
    public final C7546c<Void> f35651b = C7546c.m32302t();

    /* renamed from: c */
    public final Context f35652c;

    /* renamed from: d */
    public final C6636p f35653d;

    /* renamed from: e */
    public final ListenableWorker f35654e;

    /* renamed from: f */
    public final InterfaceC4577f f35655f;

    /* renamed from: g */
    public final InterfaceC7748a f35656g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/m$a.class
     */
    /* renamed from: o2.m$a */
    /* loaded from: combined.jar:classes1.jar:o2/m$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C7546c f35657b;

        /* renamed from: c */
        public final RunnableC6880m f35658c;

        public a(RunnableC6880m runnableC6880m, C7546c c7546c) {
            this.f35658c = runnableC6880m;
            this.f35657b = c7546c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35657b.mo32293r(this.f35658c.f35654e.mo4808d());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o2/m$b.class
     */
    /* renamed from: o2.m$b */
    /* loaded from: combined.jar:classes1.jar:o2/m$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C7546c f35659b;

        /* renamed from: c */
        public final RunnableC6880m f35660c;

        public b(RunnableC6880m runnableC6880m, C7546c c7546c) {
            this.f35660c = runnableC6880m;
            this.f35659b = c7546c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                C4576e c4576e = (C4576e) this.f35659b.get();
                if (c4576e == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", this.f35660c.f35653d.f34575c));
                }
                AbstractC4582k.m23126c().mo23129a(RunnableC6880m.f35650h, String.format("Updating notification for %s", this.f35660c.f35653d.f34575c), new Throwable[0]);
                this.f35660c.f35654e.m4830n(true);
                RunnableC6880m runnableC6880m = this.f35660c;
                runnableC6880m.f35651b.mo32293r(runnableC6880m.f35655f.mo23116a(runnableC6880m.f35652c, runnableC6880m.f35654e.m4823e(), c4576e));
            } catch (Throwable th2) {
                this.f35660c.f35651b.mo32292q(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public RunnableC6880m(Context context, C6636p c6636p, ListenableWorker listenableWorker, InterfaceC4577f interfaceC4577f, InterfaceC7748a interfaceC7748a) {
        this.f35652c = context;
        this.f35653d = c6636p;
        this.f35654e = listenableWorker;
        this.f35655f = interfaceC4577f;
        this.f35656g = interfaceC7748a;
    }

    /* renamed from: a */
    public InterfaceFutureC5838a<Void> m31720a() {
        return this.f35651b;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f35653d.f34589q || C5440a.m27189c()) {
            this.f35651b.mo32291p(null);
            return;
        }
        C7546c m32302t = C7546c.m32302t();
        this.f35656g.mo33901a().execute(new a(this, m32302t));
        m32302t.mo23123a(new b(this, m32302t), this.f35656g.mo33901a());
    }
}
