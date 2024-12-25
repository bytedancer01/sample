package p242o7;

import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import p057d7.C4335r;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o7/e.class
 */
/* renamed from: o7.e */
/* loaded from: combined.jar:classes2.jar:o7/e.class */
public final class C6918e implements InterfaceC2348g {

    /* renamed from: a */
    public final C6916c f35789a;

    /* renamed from: b */
    public final int f35790b;

    /* renamed from: c */
    public final long f35791c;

    /* renamed from: d */
    public final long f35792d;

    /* renamed from: e */
    public final long f35793e;

    public C6918e(C6916c c6916c, int i10, long j10, long j11) {
        this.f35789a = c6916c;
        this.f35790b = i10;
        this.f35791c = j10;
        long j12 = (j11 - j10) / c6916c.f35784e;
        this.f35792d = j12;
        this.f35793e = m31855a(j12);
    }

    /* renamed from: a */
    public final long m31855a(long j10) {
        return C4401z0.m22346Q0(j10 * this.f35790b, 1000000L, this.f35789a.f35782c);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: e */
    public InterfaceC2348g.a mo12034e(long j10) {
        long m22411t = C4401z0.m22411t((this.f35789a.f35782c * j10) / (this.f35790b * 1000000), 0L, this.f35792d - 1);
        long j11 = this.f35791c;
        long j12 = this.f35789a.f35784e;
        long m31855a = m31855a(m22411t);
        C4335r c4335r = new C4335r(m31855a, j11 + (j12 * m22411t));
        if (m31855a >= j10 || m22411t == this.f35792d - 1) {
            return new InterfaceC2348g.a(c4335r);
        }
        long j13 = m22411t + 1;
        return new InterfaceC2348g.a(c4335r, new C4335r(m31855a(j13), this.f35791c + (this.f35789a.f35784e * j13)));
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: g */
    public boolean mo12035g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: i */
    public long mo12036i() {
        return this.f35793e;
    }
}
