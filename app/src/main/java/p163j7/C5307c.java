package p163j7;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import p057d7.C4335r;
import p059d9.C4401z0;
import p267p6.C7583h;
import p366v7.C9303k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j7/c.class
 */
/* renamed from: j7.c */
/* loaded from: combined.jar:classes2.jar:j7/c.class */
public final class C5307c implements InterfaceC5311g {

    /* renamed from: a */
    public final long[] f30476a;

    /* renamed from: b */
    public final long[] f30477b;

    /* renamed from: c */
    public final long f30478c;

    public C5307c(long[] jArr, long[] jArr2, long j10) {
        this.f30476a = jArr;
        this.f30477b = jArr2;
        this.f30478c = j10 == -9223372036854775807L ? C7583h.m32760d(jArr2[jArr2.length - 1]) : j10;
    }

    /* renamed from: a */
    public static C5307c m26500a(long j10, C9303k c9303k, long j11) {
        int length = c9303k.f42434f.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += c9303k.f42432d + c9303k.f42434f[i12];
            j12 += c9303k.f42433e + c9303k.f42435g[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new C5307c(jArr, jArr2, j11);
    }

    /* renamed from: c */
    public static Pair<Long, Long> m26501c(long j10, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int m22389i = C4401z0.m22389i(jArr, j10, true, true);
        long j11 = jArr[m22389i];
        long j12 = jArr2[m22389i];
        int i10 = m22389i + 1;
        if (i10 == jArr.length) {
            valueOf = Long.valueOf(j11);
            valueOf2 = Long.valueOf(j12);
        } else {
            long j13 = (long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r0 - j11)) * (jArr2[i10] - j12));
            valueOf = Long.valueOf(j10);
            valueOf2 = Long.valueOf(j13 + j12);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // p163j7.InterfaceC5311g
    /* renamed from: b */
    public long mo26495b(long j10) {
        return C7583h.m32760d(((Long) m26501c(j10, this.f30476a, this.f30477b).second).longValue());
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: e */
    public InterfaceC2348g.a mo12034e(long j10) {
        Pair<Long, Long> m26501c = m26501c(C7583h.m32761e(C4401z0.m22411t(j10, 0L, this.f30478c)), this.f30477b, this.f30476a);
        return new InterfaceC2348g.a(new C4335r(C7583h.m32760d(((Long) m26501c.first).longValue()), ((Long) m26501c.second).longValue()));
    }

    @Override // p163j7.InterfaceC5311g
    /* renamed from: f */
    public long mo26496f() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: g */
    public boolean mo12035g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: i */
    public long mo12036i() {
        return this.f30478c;
    }
}
