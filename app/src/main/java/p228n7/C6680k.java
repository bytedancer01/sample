package p228n7;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;
import p301r6.C7979g0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/k.class
 */
/* renamed from: n7.k */
/* loaded from: combined.jar:classes2.jar:n7/k.class */
public final class C6680k implements InterfaceC6683m {

    /* renamed from: b */
    public final String f34841b;

    /* renamed from: c */
    public String f34842c;

    /* renamed from: d */
    public InterfaceC4337t f34843d;

    /* renamed from: f */
    public int f34845f;

    /* renamed from: g */
    public int f34846g;

    /* renamed from: h */
    public long f34847h;

    /* renamed from: i */
    public C7629w0 f34848i;

    /* renamed from: j */
    public int f34849j;

    /* renamed from: k */
    public long f34850k;

    /* renamed from: a */
    public final C4361f0 f34840a = new C4361f0(new byte[18]);

    /* renamed from: e */
    public int f34844e = 0;

    public C6680k(String str) {
        this.f34841b = str;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        C4349a.m21886i(this.f34843d);
        while (c4361f0.m21985a() > 0) {
            int i10 = this.f34844e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c4361f0.m21985a(), this.f34849j - this.f34845f);
                    this.f34843d.mo606e(c4361f0, min);
                    int i11 = this.f34845f + min;
                    this.f34845f = i11;
                    int i12 = this.f34849j;
                    if (i11 == i12) {
                        this.f34843d.mo600b(this.f34850k, 1, i12, 0, null);
                        this.f34850k += this.f34847h;
                        this.f34844e = 0;
                    }
                } else if (m30767b(c4361f0, this.f34840a.m21988d(), 18)) {
                    m30768g();
                    this.f34840a.m21983P(0);
                    this.f34843d.mo606e(this.f34840a, 18);
                    this.f34844e = 2;
                }
            } else if (m30769h(c4361f0)) {
                this.f34844e = 1;
            }
        }
    }

    /* renamed from: b */
    public final boolean m30767b(C4361f0 c4361f0, byte[] bArr, int i10) {
        int min = Math.min(c4361f0.m21985a(), i10 - this.f34845f);
        c4361f0.m21994j(bArr, this.f34845f, min);
        int i11 = this.f34845f + min;
        this.f34845f = i11;
        return i11 == i10;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        this.f34844e = 0;
        this.f34845f = 0;
        this.f34846g = 0;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        this.f34842c = dVar.m30756b();
        this.f34843d = interfaceC4325h.mo479e(dVar.m30757c(), 1);
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        this.f34850k = j10;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void m30768g() {
        byte[] m21988d = this.f34840a.m21988d();
        if (this.f34848i == null) {
            C7629w0 m34690g = C7979g0.m34690g(m21988d, this.f34842c, this.f34841b, null);
            this.f34848i = m34690g;
            this.f34843d.mo608f(m34690g);
        }
        this.f34849j = C7979g0.m34684a(m21988d);
        this.f34847h = (int) ((C7979g0.m34689f(m21988d) * 1000000) / this.f34848i.f37068A);
    }

    /* renamed from: h */
    public final boolean m30769h(C4361f0 c4361f0) {
        while (c4361f0.m21985a() > 0) {
            int i10 = this.f34846g << 8;
            this.f34846g = i10;
            int m21971D = i10 | c4361f0.m21971D();
            this.f34846g = m21971D;
            if (C7979g0.m34687d(m21971D)) {
                byte[] m21988d = this.f34840a.m21988d();
                int i11 = this.f34846g;
                m21988d[0] = (byte) ((i11 >> 24) & 255);
                m21988d[1] = (byte) ((i11 >> 16) & 255);
                m21988d[2] = (byte) ((i11 >> 8) & 255);
                m21988d[3] = (byte) (i11 & 255);
                this.f34845f = 4;
                this.f34846g = 0;
                return true;
            }
        }
        return false;
    }
}
