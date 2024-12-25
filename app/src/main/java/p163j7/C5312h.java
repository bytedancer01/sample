package p163j7;

import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import p057d7.C4335r;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p301r6.C7985j0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j7/h.class
 */
/* renamed from: j7.h */
/* loaded from: combined.jar:classes2.jar:j7/h.class */
public final class C5312h implements InterfaceC5311g {

    /* renamed from: a */
    public final long[] f30501a;

    /* renamed from: b */
    public final long[] f30502b;

    /* renamed from: c */
    public final long f30503c;

    /* renamed from: d */
    public final long f30504d;

    public C5312h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f30501a = jArr;
        this.f30502b = jArr2;
        this.f30503c = j10;
        this.f30504d = j11;
    }

    /* renamed from: a */
    public static C5312h m26521a(long j10, long j11, C7985j0.a aVar, C4361f0 c4361f0) {
        int m21971D;
        c4361f0.m21984Q(10);
        int m21998n = c4361f0.m21998n();
        if (m21998n <= 0) {
            return null;
        }
        int i10 = aVar.f38632d;
        long m22346Q0 = C4401z0.m22346Q0(m21998n, 1000000 * (i10 >= 32000 ? 1152 : 576), i10);
        int m21977J = c4361f0.m21977J();
        int m21977J2 = c4361f0.m21977J();
        int m21977J3 = c4361f0.m21977J();
        c4361f0.m21984Q(2);
        long j12 = j11 + aVar.f38631c;
        long[] jArr = new long[m21977J];
        long[] jArr2 = new long[m21977J];
        for (int i11 = 0; i11 < m21977J; i11++) {
            jArr[i11] = (i11 * m22346Q0) / m21977J;
            jArr2[i11] = Math.max(j11, j12);
            if (m21977J3 == 1) {
                m21971D = c4361f0.m21971D();
            } else if (m21977J3 == 2) {
                m21971D = c4361f0.m21977J();
            } else if (m21977J3 == 3) {
                m21971D = c4361f0.m21974G();
            } else {
                if (m21977J3 != 4) {
                    return null;
                }
                m21971D = c4361f0.m21975H();
            }
            j11 += m21971D * m21977J2;
        }
        if (j10 != -1 && j10 != j11) {
            C4392v.m22275i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j11);
        }
        return new C5312h(jArr, jArr2, m22346Q0, j11);
    }

    @Override // p163j7.InterfaceC5311g
    /* renamed from: b */
    public long mo26495b(long j10) {
        return this.f30501a[C4401z0.m22389i(this.f30502b, j10, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: e */
    public InterfaceC2348g.a mo12034e(long j10) {
        int m22389i = C4401z0.m22389i(this.f30501a, j10, true, true);
        C4335r c4335r = new C4335r(this.f30501a[m22389i], this.f30502b[m22389i]);
        if (c4335r.f26493a >= j10 || m22389i == this.f30501a.length - 1) {
            return new InterfaceC2348g.a(c4335r);
        }
        int i10 = m22389i + 1;
        return new InterfaceC2348g.a(c4335r, new C4335r(this.f30501a[i10], this.f30502b[i10]));
    }

    @Override // p163j7.InterfaceC5311g
    /* renamed from: f */
    public long mo26496f() {
        return this.f30504d;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: g */
    public boolean mo12035g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: i */
    public long mo12036i() {
        return this.f30503c;
    }
}
