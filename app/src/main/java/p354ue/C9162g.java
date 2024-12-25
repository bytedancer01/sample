package p354ue;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import p338te.C8721s;
import p338te.C8723u;
import p406xd.C9734k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/g.class
 */
/* renamed from: ue.g */
/* loaded from: combined.jar:classes2.jar:ue/g.class */
public class C9162g {

    /* renamed from: n */
    public static final String f41883n = "g";

    /* renamed from: a */
    public C9166k f41884a;

    /* renamed from: b */
    public C9165j f41885b;

    /* renamed from: c */
    public C9163h f41886c;

    /* renamed from: d */
    public Handler f41887d;

    /* renamed from: e */
    public C9168m f41888e;

    /* renamed from: h */
    public Handler f41891h;

    /* renamed from: f */
    public boolean f41889f = false;

    /* renamed from: g */
    public boolean f41890g = true;

    /* renamed from: i */
    public C9164i f41892i = new C9164i();

    /* renamed from: j */
    public Runnable f41893j = new a(this);

    /* renamed from: k */
    public Runnable f41894k = new b(this);

    /* renamed from: l */
    public Runnable f41895l = new c(this);

    /* renamed from: m */
    public Runnable f41896m = new d(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ue/g$a.class
     */
    /* renamed from: ue.g$a */
    /* loaded from: combined.jar:classes2.jar:ue/g$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C9162g f41897b;

        public a(C9162g c9162g) {
            this.f41897b = c9162g;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C9162g.f41883n, "Opening camera");
                this.f41897b.f41886c.m38567l();
            } catch (Exception e10) {
                this.f41897b.m38549t(e10);
                Log.e(C9162g.f41883n, "Failed to open camera", e10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ue/g$b.class
     */
    /* renamed from: ue.g$b */
    /* loaded from: combined.jar:classes2.jar:ue/g$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C9162g f41898b;

        public b(C9162g c9162g) {
            this.f41898b = c9162g;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C9162g.f41883n, "Configuring camera");
                this.f41898b.f41886c.m38561e();
                if (this.f41898b.f41887d != null) {
                    this.f41898b.f41887d.obtainMessage(C9734k.f44421j, this.f41898b.m38547o()).sendToTarget();
                }
            } catch (Exception e10) {
                this.f41898b.m38549t(e10);
                Log.e(C9162g.f41883n, "Failed to configure camera", e10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ue/g$c.class
     */
    /* renamed from: ue.g$c */
    /* loaded from: combined.jar:classes2.jar:ue/g$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final C9162g f41899b;

        public c(C9162g c9162g) {
            this.f41899b = c9162g;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C9162g.f41883n, "Starting preview");
                this.f41899b.f41886c.m38574s(this.f41899b.f41885b);
                this.f41899b.f41886c.m38576u();
            } catch (Exception e10) {
                this.f41899b.m38549t(e10);
                Log.e(C9162g.f41883n, "Failed to start preview", e10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ue/g$d.class
     */
    /* renamed from: ue.g$d */
    /* loaded from: combined.jar:classes2.jar:ue/g$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final C9162g f41900b;

        public d(C9162g c9162g) {
            this.f41900b = c9162g;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C9162g.f41883n, "Closing camera");
                this.f41900b.f41886c.m38577v();
                this.f41900b.f41886c.m38560d();
            } catch (Exception e10) {
                Log.e(C9162g.f41883n, "Failed to close camera", e10);
            }
            this.f41900b.f41890g = true;
            this.f41900b.f41887d.sendEmptyMessage(C9734k.f44414c);
            this.f41900b.f41884a.m38592b();
        }
    }

    public C9162g(Context context) {
        C8723u.m37274a();
        this.f41884a = C9166k.m38590d();
        C9163h c9163h = new C9163h(context);
        this.f41886c = c9163h;
        c9163h.m38570o(this.f41892i);
        this.f41891h = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m38538q(InterfaceC9171p interfaceC9171p) {
        this.f41886c.m38568m(interfaceC9171p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m38539r(final InterfaceC9171p interfaceC9171p) {
        if (this.f41889f) {
            this.f41884a.m38593c(new Runnable(this, interfaceC9171p) { // from class: ue.f

                /* renamed from: b */
                public final C9162g f41881b;

                /* renamed from: c */
                public final InterfaceC9171p f41882c;

                {
                    this.f41881b = this;
                    this.f41882c = interfaceC9171p;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f41881b.m38538q(this.f41882c);
                }
            });
        } else {
            Log.d(f41883n, "Camera is closed, not requesting preview");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m38540s(boolean z10) {
        this.f41886c.m38575t(z10);
    }

    /* renamed from: A */
    public void m38541A(final boolean z10) {
        C8723u.m37274a();
        if (this.f41889f) {
            this.f41884a.m38593c(new Runnable(this, z10) { // from class: ue.d

                /* renamed from: b */
                public final C9162g f41877b;

                /* renamed from: c */
                public final boolean f41878c;

                {
                    this.f41877b = this;
                    this.f41878c = z10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f41877b.m38540s(this.f41878c);
                }
            });
        }
    }

    /* renamed from: B */
    public void m38542B() {
        C8723u.m37274a();
        m38543C();
        this.f41884a.m38593c(this.f41895l);
    }

    /* renamed from: C */
    public final void m38543C() {
        if (!this.f41889f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* renamed from: l */
    public void m38544l() {
        C8723u.m37274a();
        if (this.f41889f) {
            this.f41884a.m38593c(this.f41896m);
        } else {
            this.f41890g = true;
        }
        this.f41889f = false;
    }

    /* renamed from: m */
    public void m38545m() {
        C8723u.m37274a();
        m38543C();
        this.f41884a.m38593c(this.f41894k);
    }

    /* renamed from: n */
    public C9168m m38546n() {
        return this.f41888e;
    }

    /* renamed from: o */
    public final C8721s m38547o() {
        return this.f41886c.m38564h();
    }

    /* renamed from: p */
    public boolean m38548p() {
        return this.f41890g;
    }

    /* renamed from: t */
    public final void m38549t(Exception exc) {
        Handler handler = this.f41887d;
        if (handler != null) {
            handler.obtainMessage(C9734k.f44415d, exc).sendToTarget();
        }
    }

    /* renamed from: u */
    public void m38550u() {
        C8723u.m37274a();
        this.f41889f = true;
        this.f41890g = false;
        this.f41884a.m38594e(this.f41893j);
    }

    /* renamed from: v */
    public void m38551v(final InterfaceC9171p interfaceC9171p) {
        this.f41891h.post(new Runnable(this, interfaceC9171p) { // from class: ue.e

            /* renamed from: b */
            public final C9162g f41879b;

            /* renamed from: c */
            public final InterfaceC9171p f41880c;

            {
                this.f41879b = this;
                this.f41880c = interfaceC9171p;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f41879b.m38539r(this.f41880c);
            }
        });
    }

    /* renamed from: w */
    public void m38552w(C9164i c9164i) {
        if (this.f41889f) {
            return;
        }
        this.f41892i = c9164i;
        this.f41886c.m38570o(c9164i);
    }

    /* renamed from: x */
    public void m38553x(C9168m c9168m) {
        this.f41888e = c9168m;
        this.f41886c.m38572q(c9168m);
    }

    /* renamed from: y */
    public void m38554y(Handler handler) {
        this.f41887d = handler;
    }

    /* renamed from: z */
    public void m38555z(C9165j c9165j) {
        this.f41885b = c9165j;
    }
}
