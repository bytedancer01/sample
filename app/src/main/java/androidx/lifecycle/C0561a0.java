package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC0572g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/a0.class
 */
/* renamed from: androidx.lifecycle.a0 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/a0.class */
public class C0561a0 {

    /* renamed from: a */
    public final C0580n f3741a;

    /* renamed from: b */
    public final Handler f3742b = new Handler();

    /* renamed from: c */
    public a f3743c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/a0$a.class
     */
    /* renamed from: androidx.lifecycle.a0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/a0$a.class */
    public static class a implements Runnable {

        /* renamed from: b */
        public final C0580n f3744b;

        /* renamed from: c */
        public final AbstractC0572g.b f3745c;

        /* renamed from: d */
        public boolean f3746d = false;

        public a(C0580n c0580n, AbstractC0572g.b bVar) {
            this.f3744b = c0580n;
            this.f3745c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3746d) {
                return;
            }
            this.f3744b.m3166h(this.f3745c);
            this.f3746d = true;
        }
    }

    public C0561a0(InterfaceC0579m interfaceC0579m) {
        this.f3741a = new C0580n(interfaceC0579m);
    }

    /* renamed from: a */
    public AbstractC0572g m3118a() {
        return this.f3741a;
    }

    /* renamed from: b */
    public void m3119b() {
        m3123f(AbstractC0572g.b.ON_START);
    }

    /* renamed from: c */
    public void m3120c() {
        m3123f(AbstractC0572g.b.ON_CREATE);
    }

    /* renamed from: d */
    public void m3121d() {
        m3123f(AbstractC0572g.b.ON_STOP);
        m3123f(AbstractC0572g.b.ON_DESTROY);
    }

    /* renamed from: e */
    public void m3122e() {
        m3123f(AbstractC0572g.b.ON_START);
    }

    /* renamed from: f */
    public final void m3123f(AbstractC0572g.b bVar) {
        a aVar = this.f3743c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f3741a, bVar);
        this.f3743c = aVar2;
        this.f3742b.postAtFrontOfQueue(aVar2);
    }
}
