package p113g7;

import p057d7.InterfaceC4337t;
import p059d9.C4350a0;
import p059d9.C4361f0;
import p078e9.C4663a;
import p113g7.AbstractC4966e;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g7/f.class
 */
/* renamed from: g7.f */
/* loaded from: combined.jar:classes2.jar:g7/f.class */
public final class C4967f extends AbstractC4966e {

    /* renamed from: b */
    public final C4361f0 f28798b;

    /* renamed from: c */
    public final C4361f0 f28799c;

    /* renamed from: d */
    public int f28800d;

    /* renamed from: e */
    public boolean f28801e;

    /* renamed from: f */
    public boolean f28802f;

    /* renamed from: g */
    public int f28803g;

    public C4967f(InterfaceC4337t interfaceC4337t) {
        super(interfaceC4337t);
        this.f28798b = new C4361f0(C4350a0.f26520a);
        this.f28799c = new C4361f0(4);
    }

    @Override // p113g7.AbstractC4966e
    /* renamed from: b */
    public boolean mo24984b(C4361f0 c4361f0) {
        int m21971D = c4361f0.m21971D();
        int i10 = (m21971D >> 4) & 15;
        int i11 = m21971D & 15;
        if (i11 == 7) {
            this.f28803g = i10;
            return i10 != 5;
        }
        throw new AbstractC4966e.a("Video format not supported: " + i11);
    }

    @Override // p113g7.AbstractC4966e
    /* renamed from: c */
    public boolean mo24985c(C4361f0 c4361f0, long j10) {
        int m21971D = c4361f0.m21971D();
        long m21999o = c4361f0.m21999o();
        if (m21971D == 0 && !this.f28801e) {
            C4361f0 c4361f02 = new C4361f0(new byte[c4361f0.m21985a()]);
            c4361f0.m21994j(c4361f02.m21988d(), 0, c4361f0.m21985a());
            C4663a m23398b = C4663a.m23398b(c4361f02);
            this.f28800d = m23398b.f27500b;
            this.f28797a.mo608f(new C7629w0.b().m33220e0("video/avc").m33198I(m23398b.f27504f).m33225j0(m23398b.f27501c).m33206Q(m23398b.f27502d).m33216a0(m23398b.f27503e).m33209T(m23398b.f27499a).m33194E());
            this.f28801e = true;
            return false;
        }
        if (m21971D != 1 || !this.f28801e) {
            return false;
        }
        int i10 = this.f28803g == 1 ? 1 : 0;
        if (!this.f28802f && i10 == 0) {
            return false;
        }
        byte[] m21988d = this.f28799c.m21988d();
        m21988d[0] = 0;
        m21988d[1] = 0;
        m21988d[2] = 0;
        int i11 = this.f28800d;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (c4361f0.m21985a() <= 0) {
                this.f28797a.mo600b(j10 + (m21999o * 1000), i10, i13, 0, null);
                this.f28802f = true;
                return true;
            }
            c4361f0.m21994j(this.f28799c.m21988d(), 4 - i11, this.f28800d);
            this.f28799c.m21983P(0);
            int m21975H = this.f28799c.m21975H();
            this.f28798b.m21983P(0);
            this.f28797a.mo606e(this.f28798b, 4);
            this.f28797a.mo606e(c4361f0, m21975H);
            i12 = i13 + 4 + m21975H;
        }
    }
}
