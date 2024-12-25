package p267p6;

import p009a8.C0083a1;
import p009a8.C0089d;
import p009a8.C0105l;
import p009a8.InterfaceC0120s0;
import p009a8.InterfaceC0121t;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0832b;
import p059d9.C4349a;
import p059d9.C4392v;
import p421y8.AbstractC9891o;
import p421y8.C9892p;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/d1.class
 */
/* renamed from: p6.d1 */
/* loaded from: combined.jar:classes2.jar:p6/d1.class */
public final class C7569d1 {

    /* renamed from: a */
    public final InterfaceC0121t f36679a;

    /* renamed from: b */
    public final Object f36680b;

    /* renamed from: c */
    public final InterfaceC0120s0[] f36681c;

    /* renamed from: d */
    public boolean f36682d;

    /* renamed from: e */
    public boolean f36683e;

    /* renamed from: f */
    public C7573e1 f36684f;

    /* renamed from: g */
    public boolean f36685g;

    /* renamed from: h */
    public final boolean[] f36686h;

    /* renamed from: i */
    public final InterfaceC7633x1[] f36687i;

    /* renamed from: j */
    public final AbstractC9891o f36688j;

    /* renamed from: k */
    public final C7591j1 f36689k;

    /* renamed from: l */
    public C7569d1 f36690l;

    /* renamed from: m */
    public C0083a1 f36691m;

    /* renamed from: n */
    public C9892p f36692n;

    /* renamed from: o */
    public long f36693o;

    public C7569d1(InterfaceC7633x1[] interfaceC7633x1Arr, long j10, AbstractC9891o abstractC9891o, InterfaceC0832b interfaceC0832b, C7591j1 c7591j1, C7573e1 c7573e1, C9892p c9892p) {
        this.f36687i = interfaceC7633x1Arr;
        this.f36693o = j10;
        this.f36688j = abstractC9891o;
        this.f36689k = c7591j1;
        InterfaceC0127w.a aVar = c7573e1.f36697a;
        this.f36680b = aVar.f544a;
        this.f36684f = c7573e1;
        this.f36691m = C0083a1.f260e;
        this.f36692n = c9892p;
        this.f36681c = new InterfaceC0120s0[interfaceC7633x1Arr.length];
        this.f36686h = new boolean[interfaceC7633x1Arr.length];
        this.f36679a = m32610e(aVar, c7591j1, interfaceC0832b, c7573e1.f36698b, c7573e1.f36700d);
    }

    /* renamed from: e */
    public static InterfaceC0121t m32610e(InterfaceC0127w.a aVar, C7591j1 c7591j1, InterfaceC0832b interfaceC0832b, long j10, long j11) {
        InterfaceC0121t m32796h = c7591j1.m32796h(aVar, interfaceC0832b, j10);
        InterfaceC0121t interfaceC0121t = m32796h;
        if (j11 != -9223372036854775807L) {
            interfaceC0121t = new C0089d(m32796h, true, 0L, j11);
        }
        return interfaceC0121t;
    }

    /* renamed from: u */
    public static void m32611u(C7591j1 c7591j1, InterfaceC0121t interfaceC0121t) {
        InterfaceC0121t interfaceC0121t2 = interfaceC0121t;
        try {
            if (interfaceC0121t instanceof C0089d) {
                interfaceC0121t2 = ((C0089d) interfaceC0121t).f276b;
            }
            c7591j1.m32808z(interfaceC0121t2);
        } catch (RuntimeException e10) {
            C4392v.m22271e("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* renamed from: A */
    public void m32612A() {
        InterfaceC0121t interfaceC0121t = this.f36679a;
        if (interfaceC0121t instanceof C0089d) {
            long j10 = this.f36684f.f36700d;
            long j11 = j10;
            if (j10 == -9223372036854775807L) {
                j11 = Long.MIN_VALUE;
            }
            ((C0089d) interfaceC0121t).m351t(0L, j11);
        }
    }

    /* renamed from: a */
    public long m32613a(C9892p c9892p, long j10, boolean z10) {
        return m32614b(c9892p, j10, z10, new boolean[this.f36687i.length]);
    }

    /* renamed from: b */
    public long m32614b(C9892p c9892p, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c9892p.f45509a) {
                break;
            }
            boolean[] zArr2 = this.f36686h;
            if (z10 || !c9892p.m41749b(this.f36692n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        m32618g(this.f36681c);
        m32617f();
        this.f36692n = c9892p;
        m32619h();
        long mo346m = this.f36679a.mo346m(c9892p.f45511c, this.f36686h, this.f36681c, zArr, j10);
        m32615c(this.f36681c);
        this.f36683e = false;
        int i11 = 0;
        while (true) {
            InterfaceC0120s0[] interfaceC0120s0Arr = this.f36681c;
            if (i11 >= interfaceC0120s0Arr.length) {
                return mo346m;
            }
            if (interfaceC0120s0Arr[i11] != null) {
                C4349a.m21884g(c9892p.m41750c(i11));
                if (this.f36687i[i11].getTrackType() != 7) {
                    this.f36683e = true;
                }
            } else {
                C4349a.m21884g(c9892p.f45511c[i11] == null);
            }
            i11++;
        }
    }

    /* renamed from: c */
    public final void m32615c(InterfaceC0120s0[] interfaceC0120s0Arr) {
        int i10 = 0;
        while (true) {
            InterfaceC7633x1[] interfaceC7633x1Arr = this.f36687i;
            if (i10 >= interfaceC7633x1Arr.length) {
                return;
            }
            if (interfaceC7633x1Arr[i10].getTrackType() == 7 && this.f36692n.m41750c(i10)) {
                interfaceC0120s0Arr[i10] = new C0105l();
            }
            i10++;
        }
    }

    /* renamed from: d */
    public void m32616d(long j10) {
        C4349a.m21884g(m32629r());
        this.f36679a.mo337d(m32635y(j10));
    }

    /* renamed from: f */
    public final void m32617f() {
        if (!m32629r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C9892p c9892p = this.f36692n;
            if (i10 >= c9892p.f45509a) {
                return;
            }
            boolean m41750c = c9892p.m41750c(i10);
            InterfaceC9884h interfaceC9884h = this.f36692n.f45511c[i10];
            if (m41750c && interfaceC9884h != null) {
                interfaceC9884h.disable();
            }
            i10++;
        }
    }

    /* renamed from: g */
    public final void m32618g(InterfaceC0120s0[] interfaceC0120s0Arr) {
        int i10 = 0;
        while (true) {
            InterfaceC7633x1[] interfaceC7633x1Arr = this.f36687i;
            if (i10 >= interfaceC7633x1Arr.length) {
                return;
            }
            if (interfaceC7633x1Arr[i10].getTrackType() == 7) {
                interfaceC0120s0Arr[i10] = null;
            }
            i10++;
        }
    }

    /* renamed from: h */
    public final void m32619h() {
        if (!m32629r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C9892p c9892p = this.f36692n;
            if (i10 >= c9892p.f45509a) {
                return;
            }
            boolean m41750c = c9892p.m41750c(i10);
            InterfaceC9884h interfaceC9884h = this.f36692n.f45511c[i10];
            if (m41750c && interfaceC9884h != null) {
                interfaceC9884h.enable();
            }
            i10++;
        }
    }

    /* renamed from: i */
    public long m32620i() {
        if (!this.f36682d) {
            return this.f36684f.f36698b;
        }
        long mo340g = this.f36683e ? this.f36679a.mo340g() : Long.MIN_VALUE;
        long j10 = mo340g;
        if (mo340g == Long.MIN_VALUE) {
            j10 = this.f36684f.f36701e;
        }
        return j10;
    }

    /* renamed from: j */
    public C7569d1 m32621j() {
        return this.f36690l;
    }

    /* renamed from: k */
    public long m32622k() {
        return !this.f36682d ? 0L : this.f36679a.mo336c();
    }

    /* renamed from: l */
    public long m32623l() {
        return this.f36693o;
    }

    /* renamed from: m */
    public long m32624m() {
        return this.f36684f.f36698b + this.f36693o;
    }

    /* renamed from: n */
    public C0083a1 m32625n() {
        return this.f36691m;
    }

    /* renamed from: o */
    public C9892p m32626o() {
        return this.f36692n;
    }

    /* renamed from: p */
    public void m32627p(float f10, AbstractC7574e2 abstractC7574e2) {
        this.f36682d = true;
        this.f36691m = this.f36679a.mo352v();
        C9892p m32632v = m32632v(f10, abstractC7574e2);
        C7573e1 c7573e1 = this.f36684f;
        long j10 = c7573e1.f36698b;
        long j11 = c7573e1.f36701e;
        long j12 = j10;
        if (j11 != -9223372036854775807L) {
            j12 = j10;
            if (j10 >= j11) {
                j12 = Math.max(0L, j11 - 1);
            }
        }
        long m32613a = m32613a(m32632v, j12, false);
        long j13 = this.f36693o;
        C7573e1 c7573e12 = this.f36684f;
        this.f36693o = j13 + (c7573e12.f36698b - m32613a);
        this.f36684f = c7573e12.m32661b(m32613a);
    }

    /* renamed from: q */
    public boolean m32628q() {
        return this.f36682d && (!this.f36683e || this.f36679a.mo340g() == Long.MIN_VALUE);
    }

    /* renamed from: r */
    public final boolean m32629r() {
        return this.f36690l == null;
    }

    /* renamed from: s */
    public void m32630s(long j10) {
        C4349a.m21884g(m32629r());
        if (this.f36682d) {
            this.f36679a.mo341h(m32635y(j10));
        }
    }

    /* renamed from: t */
    public void m32631t() {
        m32617f();
        m32611u(this.f36689k, this.f36679a);
    }

    /* renamed from: v */
    public C9892p m32632v(float f10, AbstractC7574e2 abstractC7574e2) {
        C9892p mo41704e = this.f36688j.mo41704e(this.f36687i, m32625n(), this.f36684f.f36697a, abstractC7574e2);
        for (InterfaceC9884h interfaceC9884h : mo41704e.f45511c) {
            if (interfaceC9884h != null) {
                interfaceC9884h.mo41597g(f10);
            }
        }
        return mo41704e;
    }

    /* renamed from: w */
    public void m32633w(C7569d1 c7569d1) {
        if (c7569d1 == this.f36690l) {
            return;
        }
        m32617f();
        this.f36690l = c7569d1;
        m32619h();
    }

    /* renamed from: x */
    public void m32634x(long j10) {
        this.f36693o = j10;
    }

    /* renamed from: y */
    public long m32635y(long j10) {
        return j10 - m32623l();
    }

    /* renamed from: z */
    public long m32636z(long j10) {
        return j10 + m32623l();
    }
}
