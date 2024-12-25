package p228n7;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;
import p301r6.C7968b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/c.class
 */
/* renamed from: n7.c */
/* loaded from: combined.jar:classes2.jar:n7/c.class */
public final class C6664c implements InterfaceC6683m {

    /* renamed from: a */
    public final C4359e0 f34714a;

    /* renamed from: b */
    public final C4361f0 f34715b;

    /* renamed from: c */
    public final String f34716c;

    /* renamed from: d */
    public String f34717d;

    /* renamed from: e */
    public InterfaceC4337t f34718e;

    /* renamed from: f */
    public int f34719f;

    /* renamed from: g */
    public int f34720g;

    /* renamed from: h */
    public boolean f34721h;

    /* renamed from: i */
    public long f34722i;

    /* renamed from: j */
    public C7629w0 f34723j;

    /* renamed from: k */
    public int f34724k;

    /* renamed from: l */
    public long f34725l;

    public C6664c() {
        this(null);
    }

    public C6664c(String str) {
        C4359e0 c4359e0 = new C4359e0(new byte[128]);
        this.f34714a = c4359e0;
        this.f34715b = new C4361f0(c4359e0.f26561a);
        this.f34719f = 0;
        this.f34716c = str;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        C4349a.m21886i(this.f34718e);
        while (c4361f0.m21985a() > 0) {
            int i10 = this.f34719f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c4361f0.m21985a(), this.f34724k - this.f34720g);
                        this.f34718e.mo606e(c4361f0, min);
                        int i11 = this.f34720g + min;
                        this.f34720g = i11;
                        int i12 = this.f34724k;
                        if (i11 == i12) {
                            this.f34718e.mo600b(this.f34725l, 1, i12, 0, null);
                            this.f34725l += this.f34722i;
                            this.f34719f = 0;
                        }
                    }
                } else if (m30678b(c4361f0, this.f34715b.m21988d(), 128)) {
                    m30683g();
                    this.f34715b.m21983P(0);
                    this.f34718e.mo606e(this.f34715b, 128);
                    this.f34719f = 2;
                }
            } else if (m30684h(c4361f0)) {
                this.f34719f = 1;
                this.f34715b.m21988d()[0] = 11;
                this.f34715b.m21988d()[1] = 119;
                this.f34720g = 2;
            }
        }
    }

    /* renamed from: b */
    public final boolean m30678b(C4361f0 c4361f0, byte[] bArr, int i10) {
        int min = Math.min(c4361f0.m21985a(), i10 - this.f34720g);
        c4361f0.m21994j(bArr, this.f34720g, min);
        int i11 = this.f34720g + min;
        this.f34720g = i11;
        return i11 == i10;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        this.f34719f = 0;
        this.f34720g = 0;
        this.f34721h = false;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        this.f34717d = dVar.m30756b();
        this.f34718e = interfaceC4325h.mo479e(dVar.m30757c(), 1);
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        this.f34725l = j10;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void m30683g() {
        this.f34714a.m21958p(0);
        C7968b.b m34540e = C7968b.m34540e(this.f34714a);
        C7629w0 c7629w0 = this.f34723j;
        if (c7629w0 == null || m34540e.f38470d != c7629w0.f37099z || m34540e.f38469c != c7629w0.f37068A || !C4401z0.m22371c(m34540e.f38467a, c7629w0.f37086m)) {
            C7629w0 m33194E = new C7629w0.b().m33208S(this.f34717d).m33220e0(m34540e.f38467a).m33197H(m34540e.f38470d).m33221f0(m34540e.f38469c).m33211V(this.f34716c).m33194E();
            this.f34723j = m33194E;
            this.f34718e.mo608f(m33194E);
        }
        this.f34724k = m34540e.f38471e;
        this.f34722i = (m34540e.f38472f * 1000000) / this.f34723j.f37068A;
    }

    /* renamed from: h */
    public final boolean m30684h(C4361f0 c4361f0) {
        while (true) {
            boolean z10 = false;
            if (c4361f0.m21985a() <= 0) {
                return false;
            }
            if (this.f34721h) {
                int m21971D = c4361f0.m21971D();
                if (m21971D == 119) {
                    this.f34721h = false;
                    return true;
                }
                if (m21971D != 11) {
                    this.f34721h = z10;
                }
                z10 = true;
                this.f34721h = z10;
            } else {
                if (c4361f0.m21971D() != 11) {
                    this.f34721h = z10;
                }
                z10 = true;
                this.f34721h = z10;
            }
        }
    }
}
