package p228n7;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p228n7.InterfaceC6677i0;
import p267p6.C7629w0;
import p301r6.C7970c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/f.class
 */
/* renamed from: n7.f */
/* loaded from: combined.jar:classes2.jar:n7/f.class */
public final class C6670f implements InterfaceC6683m {

    /* renamed from: a */
    public final C4359e0 f34742a;

    /* renamed from: b */
    public final C4361f0 f34743b;

    /* renamed from: c */
    public final String f34744c;

    /* renamed from: d */
    public String f34745d;

    /* renamed from: e */
    public InterfaceC4337t f34746e;

    /* renamed from: f */
    public int f34747f;

    /* renamed from: g */
    public int f34748g;

    /* renamed from: h */
    public boolean f34749h;

    /* renamed from: i */
    public boolean f34750i;

    /* renamed from: j */
    public long f34751j;

    /* renamed from: k */
    public C7629w0 f34752k;

    /* renamed from: l */
    public int f34753l;

    /* renamed from: m */
    public long f34754m;

    public C6670f() {
        this(null);
    }

    public C6670f(String str) {
        C4359e0 c4359e0 = new C4359e0(new byte[16]);
        this.f34742a = c4359e0;
        this.f34743b = new C4361f0(c4359e0.f26561a);
        this.f34747f = 0;
        this.f34748g = 0;
        this.f34749h = false;
        this.f34750i = false;
        this.f34744c = str;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: a */
    public void mo30677a(C4361f0 c4361f0) {
        C4349a.m21886i(this.f34746e);
        while (c4361f0.m21985a() > 0) {
            int i10 = this.f34747f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c4361f0.m21985a(), this.f34753l - this.f34748g);
                        this.f34746e.mo606e(c4361f0, min);
                        int i11 = this.f34748g + min;
                        this.f34748g = i11;
                        int i12 = this.f34753l;
                        if (i11 == i12) {
                            this.f34746e.mo600b(this.f34754m, 1, i12, 0, null);
                            this.f34754m += this.f34751j;
                            this.f34747f = 0;
                        }
                    }
                } else if (m30693b(c4361f0, this.f34743b.m21988d(), 16)) {
                    m30694g();
                    this.f34743b.m21983P(0);
                    this.f34746e.mo606e(this.f34743b, 16);
                    this.f34747f = 2;
                }
            } else if (m30695h(c4361f0)) {
                this.f34747f = 1;
                this.f34743b.m21988d()[0] = -84;
                this.f34743b.m21988d()[1] = (byte) (this.f34750i ? 65 : 64);
                this.f34748g = 2;
            }
        }
    }

    /* renamed from: b */
    public final boolean m30693b(C4361f0 c4361f0, byte[] bArr, int i10) {
        int min = Math.min(c4361f0.m21985a(), i10 - this.f34748g);
        c4361f0.m21994j(bArr, this.f34748g, min);
        int i11 = this.f34748g + min;
        this.f34748g = i11;
        return i11 == i10;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: c */
    public void mo30679c() {
        this.f34747f = 0;
        this.f34748g = 0;
        this.f34749h = false;
        this.f34750i = false;
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: d */
    public void mo30680d(InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        dVar.m30755a();
        this.f34745d = dVar.m30756b();
        this.f34746e = interfaceC4325h.mo479e(dVar.m30757c(), 1);
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: e */
    public void mo30681e() {
    }

    @Override // p228n7.InterfaceC6683m
    /* renamed from: f */
    public void mo30682f(long j10, int i10) {
        this.f34754m = j10;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void m30694g() {
        this.f34742a.m21958p(0);
        C7970c.b m34571d = C7970c.m34571d(this.f34742a);
        C7629w0 c7629w0 = this.f34752k;
        if (c7629w0 == null || m34571d.f38498c != c7629w0.f37099z || m34571d.f38497b != c7629w0.f37068A || !"audio/ac4".equals(c7629w0.f37086m)) {
            C7629w0 m33194E = new C7629w0.b().m33208S(this.f34745d).m33220e0("audio/ac4").m33197H(m34571d.f38498c).m33221f0(m34571d.f38497b).m33211V(this.f34744c).m33194E();
            this.f34752k = m33194E;
            this.f34746e.mo608f(m33194E);
        }
        this.f34753l = m34571d.f38499d;
        this.f34751j = (m34571d.f38500e * 1000000) / this.f34752k.f37068A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r0 != 65) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r3.f34750i = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        return true;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m30695h(p059d9.C4361f0 r4) {
        /*
            r3 = this;
        L0:
            r0 = r4
            int r0 = r0.m21985a()
            r5 = r0
            r0 = 0
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 <= 0) goto L5f
            r0 = r3
            boolean r0 = r0.f34749h
            if (r0 != 0) goto L29
            r0 = r4
            int r0 = r0.m21971D()
            r1 = 172(0xac, float:2.41E-43)
            if (r0 != r1) goto L21
            r0 = 1
            r6 = r0
        L21:
            r0 = r3
            r1 = r6
            r0.f34749h = r1
            goto L0
        L29:
            r0 = r4
            int r0 = r0.m21971D()
            r5 = r0
            r0 = r5
            r1 = 172(0xac, float:2.41E-43)
            if (r0 != r1) goto L3a
            r0 = 1
            r6 = r0
            goto L3c
        L3a:
            r0 = 0
            r6 = r0
        L3c:
            r0 = r3
            r1 = r6
            r0.f34749h = r1
            r0 = r5
            r1 = 64
            if (r0 == r1) goto L4d
            r0 = r5
            r1 = 65
            if (r0 != r1) goto L0
        L4d:
            r0 = r7
            r6 = r0
            r0 = r5
            r1 = 65
            if (r0 != r1) goto L58
            r0 = 1
            r6 = r0
        L58:
            r0 = r3
            r1 = r6
            r0.f34750i = r1
            r0 = 1
            return r0
        L5f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p228n7.C6670f.m30695h(d9.f0):boolean");
    }
}
