package p163j7;

import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import p057d7.C4335r;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p301r6.C7985j0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j7/i.class
 */
/* renamed from: j7.i */
/* loaded from: combined.jar:classes2.jar:j7/i.class */
public final class C5313i implements InterfaceC5311g {

    /* renamed from: a */
    public final long f30505a;

    /* renamed from: b */
    public final int f30506b;

    /* renamed from: c */
    public final long f30507c;

    /* renamed from: d */
    public final long f30508d;

    /* renamed from: e */
    public final long f30509e;

    /* renamed from: f */
    public final long[] f30510f;

    public C5313i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public C5313i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f30505a = j10;
        this.f30506b = i10;
        this.f30507c = j11;
        this.f30510f = jArr;
        this.f30508d = j12;
        this.f30509e = j12 == -1 ? -1L : j10 + j12;
    }

    /* renamed from: a */
    public static C5313i m26522a(long j10, long j11, C7985j0.a aVar, C4361f0 c4361f0) {
        int m21975H;
        int i10 = aVar.f38635g;
        int i11 = aVar.f38632d;
        int m21998n = c4361f0.m21998n();
        if ((m21998n & 1) != 1 || (m21975H = c4361f0.m21975H()) == 0) {
            return null;
        }
        long m22346Q0 = C4401z0.m22346Q0(m21975H, i10 * 1000000, i11);
        if ((m21998n & 6) != 6) {
            return new C5313i(j11, aVar.f38631c, m22346Q0);
        }
        long m21973F = c4361f0.m21973F();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = c4361f0.m21971D();
        }
        if (j10 != -1) {
            long j12 = j11 + m21973F;
            if (j10 != j12) {
                C4392v.m22275i("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new C5313i(j11, aVar.f38631c, m22346Q0, m21973F, jArr);
    }

    @Override // p163j7.InterfaceC5311g
    /* renamed from: b */
    public long mo26495b(long j10) {
        long j11 = j10 - this.f30505a;
        if (!mo12035g() || j11 <= this.f30506b) {
            return 0L;
        }
        long[] jArr = (long[]) C4349a.m21886i(this.f30510f);
        double d10 = (j11 * 256.0d) / this.f30508d;
        int m22389i = C4401z0.m22389i(jArr, (long) d10, true, true);
        long m26523c = m26523c(m22389i);
        long j12 = jArr[m22389i];
        int i10 = m22389i + 1;
        long m26523c2 = m26523c(i10);
        return m26523c + Math.round((j12 == (m22389i == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r10 - j12)) * (m26523c2 - m26523c));
    }

    /* renamed from: c */
    public final long m26523c(int i10) {
        return (this.f30507c * i10) / 100;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: e */
    public InterfaceC2348g.a mo12034e(long j10) {
        if (!mo12035g()) {
            return new InterfaceC2348g.a(new C4335r(0L, this.f30505a + this.f30506b));
        }
        long m22411t = C4401z0.m22411t(j10, 0L, this.f30507c);
        double d10 = (m22411t * 100.0d) / this.f30507c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) C4349a.m21886i(this.f30510f))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : r0[i10 + 1]) - d12));
            }
        }
        return new InterfaceC2348g.a(new C4335r(m22411t, this.f30505a + C4401z0.m22411t(Math.round((d11 / 256.0d) * this.f30508d), this.f30506b, this.f30508d - 1)));
    }

    @Override // p163j7.InterfaceC5311g
    /* renamed from: f */
    public long mo26496f() {
        return this.f30509e;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: g */
    public boolean mo12035g() {
        return this.f30510f != null;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: i */
    public long mo12036i() {
        return this.f30507c;
    }
}
