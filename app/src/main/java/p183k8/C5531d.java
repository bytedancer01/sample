package p183k8;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jsoup.parser.CharacterReader;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4350a0;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p164j8.C5322h;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k8/d.class
 */
/* renamed from: k8.d */
/* loaded from: combined.jar:classes2.jar:k8/d.class */
public final class C5531d implements InterfaceC5532e {

    /* renamed from: c */
    public final C5322h f31586c;

    /* renamed from: d */
    public InterfaceC4337t f31587d;

    /* renamed from: e */
    public int f31588e;

    /* renamed from: h */
    public int f31591h;

    /* renamed from: i */
    public long f31592i;

    /* renamed from: b */
    public final C4361f0 f31585b = new C4361f0(C4350a0.f26520a);

    /* renamed from: a */
    public final C4361f0 f31584a = new C4361f0();

    /* renamed from: f */
    public long f31589f = -9223372036854775807L;

    /* renamed from: g */
    public int f31590g = -1;

    public C5531d(C5322h c5322h) {
        this.f31586c = c5322h;
    }

    /* renamed from: e */
    public static int m27515e(int i10) {
        return i10 == 5 ? 1 : 0;
    }

    /* renamed from: i */
    public static long m27516i(long j10, long j11, long j12) {
        return j10 + C4401z0.m22346Q0(j11 - j12, 1000000L, 90000L);
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: a */
    public void mo27505a(long j10, long j11) {
        this.f31589f = j10;
        this.f31591h = 0;
        this.f31592i = j11;
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: b */
    public void mo27506b(C4361f0 c4361f0, long j10, int i10, boolean z10) {
        try {
            int i11 = c4361f0.m21988d()[0] & 31;
            C4349a.m21886i(this.f31587d);
            if (i11 > 0 && i11 < 24) {
                m27518g(c4361f0);
            } else if (i11 == 24) {
                m27519h(c4361f0);
            } else {
                if (i11 != 28) {
                    throw C7594k1.m32824c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i11)), null);
                }
                m27517f(c4361f0, i10);
            }
            if (z10) {
                if (this.f31589f == -9223372036854775807L) {
                    this.f31589f = j10;
                }
                this.f31587d.mo600b(m27516i(this.f31592i, j10, this.f31589f), this.f31588e, this.f31591h, 0, null);
                this.f31591h = 0;
            }
            this.f31590g = i10;
        } catch (IndexOutOfBoundsException e10) {
            throw C7594k1.m32824c(null, e10);
        }
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: c */
    public void mo27507c(InterfaceC4325h interfaceC4325h, int i10) {
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(i10, 2);
        this.f31587d = mo479e;
        ((InterfaceC4337t) C4401z0.m22391j(mo479e)).mo608f(this.f31586c.f30581c);
    }

    @Override // p183k8.InterfaceC5532e
    /* renamed from: d */
    public void mo27508d(long j10, int i10) {
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: f */
    public final void m27517f(C4361f0 c4361f0, int i10) {
        byte b10 = c4361f0.m21988d()[0];
        byte b11 = c4361f0.m21988d()[1];
        int i11 = (b10 & 224) | (b11 & 31);
        boolean z10 = (b11 & 128) > 0;
        boolean z11 = (b11 & 64) > 0;
        if (z10) {
            this.f31591h += m27520j();
            c4361f0.m21988d()[1] = (byte) i11;
            this.f31584a.m21980M(c4361f0.m21988d());
            this.f31584a.m21983P(1);
        } else {
            int i12 = (this.f31590g + 1) % CharacterReader.EOF;
            if (i10 != i12) {
                C4392v.m22275i("RtpH264Reader", C4401z0.m22321E("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i12), Integer.valueOf(i10)));
                return;
            } else {
                this.f31584a.m21980M(c4361f0.m21988d());
                this.f31584a.m21983P(2);
            }
        }
        int m21985a = this.f31584a.m21985a();
        this.f31587d.mo606e(this.f31584a, m21985a);
        this.f31591h += m21985a;
        if (z11) {
            this.f31588e = m27515e(i11 & 31);
        }
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: g */
    public final void m27518g(C4361f0 c4361f0) {
        int m21985a = c4361f0.m21985a();
        this.f31591h += m27520j();
        this.f31587d.mo606e(c4361f0, m21985a);
        this.f31591h += m21985a;
        this.f31588e = m27515e(c4361f0.m21988d()[0] & 31);
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: h */
    public final void m27519h(C4361f0 c4361f0) {
        c4361f0.m21971D();
        while (c4361f0.m21985a() > 4) {
            int m21977J = c4361f0.m21977J();
            this.f31591h += m27520j();
            this.f31587d.mo606e(c4361f0, m21977J);
            this.f31591h += m21977J;
        }
        this.f31588e = 0;
    }

    /* renamed from: j */
    public final int m27520j() {
        this.f31585b.m21983P(0);
        int m21985a = this.f31585b.m21985a();
        ((InterfaceC4337t) C4349a.m21882e(this.f31587d)).mo606e(this.f31585b, m21985a);
        return m21985a;
    }
}
