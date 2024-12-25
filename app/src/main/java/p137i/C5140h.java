package p137i;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p235o0.C6807a1;
import p235o0.C6864y0;
import p235o0.InterfaceC6866z0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i/h.class
 */
/* renamed from: i.h */
/* loaded from: combined.jar:classes1.jar:i/h.class */
public class C5140h {

    /* renamed from: c */
    public Interpolator f29505c;

    /* renamed from: d */
    public InterfaceC6866z0 f29506d;

    /* renamed from: e */
    public boolean f29507e;

    /* renamed from: b */
    public long f29504b = -1;

    /* renamed from: f */
    public final C6807a1 f29508f = new a(this);

    /* renamed from: a */
    public final ArrayList<C6864y0> f29503a = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i/h$a.class
     */
    /* renamed from: i.h$a */
    /* loaded from: combined.jar:classes1.jar:i/h$a.class */
    public class a extends C6807a1 {

        /* renamed from: a */
        public boolean f29509a = false;

        /* renamed from: b */
        public int f29510b = 0;

        /* renamed from: c */
        public final C5140h f29511c;

        public a(C5140h c5140h) {
            this.f29511c = c5140h;
        }

        @Override // p235o0.InterfaceC6866z0
        /* renamed from: b */
        public void mo1239b(View view) {
            int i10 = this.f29510b + 1;
            this.f29510b = i10;
            if (i10 == this.f29511c.f29503a.size()) {
                InterfaceC6866z0 interfaceC6866z0 = this.f29511c.f29506d;
                if (interfaceC6866z0 != null) {
                    interfaceC6866z0.mo1239b(null);
                }
                m25772d();
            }
        }

        @Override // p235o0.C6807a1, p235o0.InterfaceC6866z0
        /* renamed from: c */
        public void mo1240c(View view) {
            if (this.f29509a) {
                return;
            }
            this.f29509a = true;
            InterfaceC6866z0 interfaceC6866z0 = this.f29511c.f29506d;
            if (interfaceC6866z0 != null) {
                interfaceC6866z0.mo1240c(null);
            }
        }

        /* renamed from: d */
        public void m25772d() {
            this.f29510b = 0;
            this.f29509a = false;
            this.f29511c.m25765b();
        }
    }

    /* renamed from: a */
    public void m25764a() {
        if (this.f29507e) {
            Iterator<C6864y0> it = this.f29503a.iterator();
            while (it.hasNext()) {
                it.next().m31672b();
            }
            this.f29507e = false;
        }
    }

    /* renamed from: b */
    public void m25765b() {
        this.f29507e = false;
    }

    /* renamed from: c */
    public C5140h m25766c(C6864y0 c6864y0) {
        if (!this.f29507e) {
            this.f29503a.add(c6864y0);
        }
        return this;
    }

    /* renamed from: d */
    public C5140h m25767d(C6864y0 c6864y0, C6864y0 c6864y02) {
        this.f29503a.add(c6864y0);
        c6864y02.m31680j(c6864y0.m31673c());
        this.f29503a.add(c6864y02);
        return this;
    }

    /* renamed from: e */
    public C5140h m25768e(long j10) {
        if (!this.f29507e) {
            this.f29504b = j10;
        }
        return this;
    }

    /* renamed from: f */
    public C5140h m25769f(Interpolator interpolator) {
        if (!this.f29507e) {
            this.f29505c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C5140h m25770g(InterfaceC6866z0 interfaceC6866z0) {
        if (!this.f29507e) {
            this.f29506d = interfaceC6866z0;
        }
        return this;
    }

    /* renamed from: h */
    public void m25771h() {
        if (this.f29507e) {
            return;
        }
        Iterator<C6864y0> it = this.f29503a.iterator();
        while (it.hasNext()) {
            C6864y0 next = it.next();
            long j10 = this.f29504b;
            if (j10 >= 0) {
                next.m31676f(j10);
            }
            Interpolator interpolator = this.f29505c;
            if (interpolator != null) {
                next.m31677g(interpolator);
            }
            if (this.f29506d != null) {
                next.m31678h(this.f29508f);
            }
            next.m31682l();
        }
        this.f29507e = true;
    }
}
