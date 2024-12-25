package p182k7;

import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/d.class
 */
/* renamed from: k7.d */
/* loaded from: combined.jar:classes2.jar:k7/d.class */
public final class C5513d {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/d$b.class
     */
    /* renamed from: k7.d$b */
    /* loaded from: combined.jar:classes2.jar:k7/d$b.class */
    public static final class b {

        /* renamed from: a */
        public final long[] f31425a;

        /* renamed from: b */
        public final int[] f31426b;

        /* renamed from: c */
        public final int f31427c;

        /* renamed from: d */
        public final long[] f31428d;

        /* renamed from: e */
        public final int[] f31429e;

        /* renamed from: f */
        public final long f31430f;

        public b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f31425a = jArr;
            this.f31426b = iArr;
            this.f31427c = i10;
            this.f31428d = jArr2;
            this.f31429e = iArr2;
            this.f31430f = j10;
        }
    }

    /* renamed from: a */
    public static b m27383a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = NTLMEngineImpl.FLAG_WORKSTATION_PRESENT / i10;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += C4401z0.m22395l(i13, i11);
        }
        long[] jArr2 = new long[i12];
        int[] iArr2 = new int[i12];
        long[] jArr3 = new long[i12];
        int[] iArr3 = new int[i12];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            long j11 = jArr[i17];
            while (i18 > 0) {
                int min = Math.min(i11, i18);
                jArr2[i14] = j11;
                int i19 = i10 * min;
                iArr2[i14] = i19;
                i15 = Math.max(i15, i19);
                jArr3[i14] = i16 * j10;
                iArr3[i14] = 1;
                j11 += iArr2[i14];
                i16 += min;
                i18 -= min;
                i14++;
            }
        }
        return new b(jArr2, iArr2, i15, jArr3, iArr3, j10 * i16);
    }
}
