package p228n7;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;
import p301r6.C7985j0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/t.class
 */
/* renamed from: n7.t */
/* loaded from: combined.jar:classes2.jar:n7/t.class */
public final class C6690t implements InterfaceC6683m {

    /* renamed from: a */
    public final C4361f0 f35010a;

    /* renamed from: b */
    public final C7985j0.a f35011b;

    /* renamed from: c */
    public final String f35012c;

    /* renamed from: d */
    public InterfaceC4337t f35013d;

    /* renamed from: e */
    public String f35014e;

    /* renamed from: f */
    public int f35015f;

    /* renamed from: g */
    public int f35016g;

    /* renamed from: h */
    public boolean f35017h;

    /* renamed from: i */
    public boolean f35018i;

    /* renamed from: j */
    public long f35019j;

    /* renamed from: k */
    public int f35020k;

    /* renamed from: l */
    public long f35021l;

    public C6690t() {
        this(null);
    }

    public C6690t(String str) {
        this.f35015f = 0;
        C4361f0 c4361f0 = new C4361f0(4);
        this.f35010a = c4361f0;
        c4361f0.m21988d()[0] = -1;
        this.f35011b = new C7985j0.a();
        this.f35012c = str;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        C4349a.m21886i(this.f35013d);
        while (c4361f0.m21985a() > 0) {
            int i10 = this.f35015f;
            if (i10 == 0) {
                m30825b(c4361f0);
            } else if (i10 == 1) {
                m30827h(c4361f0);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                m30826g(c4361f0);
            }
        }
    }

    /* renamed from: b */
    public final void m30825b(C4361f0 c4361f0) {
        byte[] m21988d = c4361f0.m21988d();
        int m21990f = c4361f0.m21990f();
        for (int m21989e = c4361f0.m21989e(); m21989e < m21990f; m21989e++) {
            byte b10 = m21988d[m21989e];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f35018i && (b10 & 224) == 224;
            this.f35018i = z10;
            if (z11) {
                c4361f0.m21983P(m21989e + 1);
                this.f35018i = false;
                this.f35010a.m21988d()[1] = m21988d[m21989e];
                this.f35016g = 2;
                this.f35015f = 1;
                return;
            }
        }
        c4361f0.m21983P(m21990f);
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        this.f35015f = 0;
        this.f35016g = 0;
        this.f35018i = false;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        this.f35014e = dVar.m30756b();
        this.f35013d = interfaceC4325h.mo479e(dVar.m30757c(), 1);
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        this.f35021l = j10;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void m30826g(C4361f0 c4361f0) {
        int min = Math.min(c4361f0.m21985a(), this.f35020k - this.f35016g);
        this.f35013d.mo606e(c4361f0, min);
        int i10 = this.f35016g + min;
        this.f35016g = i10;
        int i11 = this.f35020k;
        if (i10 < i11) {
            return;
        }
        this.f35013d.mo600b(this.f35021l, 1, i11, 0, null);
        this.f35021l += this.f35019j;
        this.f35016g = 0;
        this.f35015f = 0;
    }

    @RequiresNonNull({"output"})
    /* renamed from: h */
    public final void m30827h(C4361f0 c4361f0) {
        int min = Math.min(c4361f0.m21985a(), 4 - this.f35016g);
        c4361f0.m21994j(this.f35010a.m21988d(), this.f35016g, min);
        int i10 = this.f35016g + min;
        this.f35016g = i10;
        if (i10 < 4) {
            return;
        }
        this.f35010a.m21983P(0);
        if (!this.f35011b.m34729a(this.f35010a.m21998n())) {
            this.f35016g = 0;
            this.f35015f = 1;
            return;
        }
        this.f35020k = this.f35011b.f38631c;
        if (!this.f35017h) {
            this.f35019j = (r0.f38635g * 1000000) / r0.f38632d;
            this.f35013d.mo608f(new C7629w0.b().m33208S(this.f35014e).m33220e0(this.f35011b.f38630b).m33212W(4096).m33197H(this.f35011b.f38633e).m33221f0(this.f35011b.f38632d).m33211V(this.f35012c).m33194E());
            this.f35017h = true;
        }
        this.f35010a.m21983P(0);
        this.f35013d.mo606e(this.f35010a, 4);
        this.f35015f = 2;
    }
}
