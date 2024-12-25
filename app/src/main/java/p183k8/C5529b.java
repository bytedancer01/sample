package p183k8;

import ec.C4699b;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p164j8.C5322h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k8/b.class
 */
/* renamed from: k8.b */
/* loaded from: combined.jar:classes2.jar:k8/b.class */
public final class C5529b implements InterfaceC5532e {

    /* renamed from: a */
    public final C5322h f31568a;

    /* renamed from: b */
    public final C4359e0 f31569b = new C4359e0();

    /* renamed from: c */
    public final int f31570c;

    /* renamed from: d */
    public final int f31571d;

    /* renamed from: e */
    public final int f31572e;

    /* renamed from: f */
    public final int f31573f;

    /* renamed from: g */
    public long f31574g;

    /* renamed from: h */
    public InterfaceC4337t f31575h;

    /* renamed from: i */
    public long f31576i;

    public C5529b(C5322h c5322h) {
        int i10;
        this.f31568a = c5322h;
        this.f31570c = c5322h.f30580b;
        String str = (String) C4349a.m21882e(c5322h.f30582d.get("mode"));
        if (C4699b.m23634a(str, "AAC-hbr")) {
            this.f31571d = 13;
            i10 = 3;
        } else {
            if (!C4699b.m23634a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f31571d = 6;
            i10 = 2;
        }
        this.f31572e = i10;
        this.f31573f = this.f31572e + this.f31571d;
    }

    /* renamed from: e */
    public static void m27503e(InterfaceC4337t interfaceC4337t, long j10, int i10) {
        interfaceC4337t.mo600b(j10, 1, i10, 0, null);
    }

    /* renamed from: f */
    public static long m27504f(long j10, long j11, long j12, int i10) {
        return j10 + C4401z0.m22346Q0(j11 - j12, 1000000L, i10);
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: a */
    public void mo27505a(long j10, long j11) {
        this.f31574g = j10;
        this.f31576i = j11;
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: b */
    public void mo27506b(C4361f0 c4361f0, long j10, int i10, boolean z10) {
        C4349a.m21882e(this.f31575h);
        short m22010z = c4361f0.m22010z();
        int i11 = m22010z / this.f31573f;
        long m27504f = m27504f(this.f31576i, j10, this.f31574g, this.f31570c);
        this.f31569b.m21955m(c4361f0);
        if (i11 == 1) {
            int m21950h = this.f31569b.m21950h(this.f31571d);
            this.f31569b.m21960r(this.f31572e);
            this.f31575h.mo606e(c4361f0, c4361f0.m21985a());
            if (z10) {
                m27503e(this.f31575h, m27504f, m21950h);
                return;
            }
            return;
        }
        c4361f0.m21984Q((m22010z + 7) / 8);
        for (int i12 = 0; i12 < i11; i12++) {
            int m21950h2 = this.f31569b.m21950h(this.f31571d);
            this.f31569b.m21960r(this.f31572e);
            this.f31575h.mo606e(c4361f0, m21950h2);
            m27503e(this.f31575h, m27504f, m21950h2);
            m27504f += C4401z0.m22346Q0(i11, 1000000L, this.f31570c);
        }
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: c */
    public void mo27507c(InterfaceC4325h interfaceC4325h, int i10) {
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(i10, 1);
        this.f31575h = mo479e;
        mo479e.mo608f(this.f31568a.f30581c);
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: d */
    public void mo27508d(long j10, int i10) {
        this.f31574g = j10;
    }
}
