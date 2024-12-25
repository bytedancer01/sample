package p026b8;

import android.net.Uri;
import java.util.Arrays;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7604o;
import p267p6.InterfaceC7579g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b8/a.class
 */
/* renamed from: b8.a */
/* loaded from: combined.jar:classes2.jar:b8/a.class */
public final class C0820a {

    /* renamed from: g */
    public static final C0820a f5682g = new C0820a(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h */
    public static final a f5683h = new a(0).m5242g(0);

    /* renamed from: i */
    public static final InterfaceC7579g<C0820a> f5684i = new C7604o();

    /* renamed from: a */
    public final Object f5685a;

    /* renamed from: b */
    public final int f5686b;

    /* renamed from: c */
    public final long f5687c;

    /* renamed from: d */
    public final long f5688d;

    /* renamed from: e */
    public final int f5689e;

    /* renamed from: f */
    public final a[] f5690f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b8/a$a.class
     */
    /* renamed from: b8.a$a */
    /* loaded from: combined.jar:classes2.jar:b8/a$a.class */
    public static final class a {

        /* renamed from: h */
        public static final InterfaceC7579g<a> f5691h = new C7604o();

        /* renamed from: a */
        public final long f5692a;

        /* renamed from: b */
        public final int f5693b;

        /* renamed from: c */
        public final Uri[] f5694c;

        /* renamed from: d */
        public final int[] f5695d;

        /* renamed from: e */
        public final long[] f5696e;

        /* renamed from: f */
        public final long f5697f;

        /* renamed from: g */
        public final boolean f5698g;

        public a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            C4349a.m21878a(iArr.length == uriArr.length);
            this.f5692a = j10;
            this.f5693b = i10;
            this.f5695d = iArr;
            this.f5694c = uriArr;
            this.f5696e = jArr;
            this.f5697f = j11;
            this.f5698g = z10;
        }

        /* renamed from: a */
        public static long[] m5236a(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        /* renamed from: b */
        public static int[] m5237b(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* renamed from: c */
        public int m5238c() {
            return m5239d(-1);
        }

        /* renamed from: d */
        public int m5239d(int i10) {
            int i11;
            do {
                i10++;
                int[] iArr = this.f5695d;
                if (i10 >= iArr.length || this.f5698g || (i11 = iArr[i10]) == 0) {
                    break;
                }
            } while (i11 != 1);
            return i10;
        }

        /* renamed from: e */
        public boolean m5240e() {
            if (this.f5693b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f5693b; i10++) {
                int i11 = this.f5695d[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f5692a != aVar.f5692a || this.f5693b != aVar.f5693b || !Arrays.equals(this.f5694c, aVar.f5694c) || !Arrays.equals(this.f5695d, aVar.f5695d) || !Arrays.equals(this.f5696e, aVar.f5696e) || this.f5697f != aVar.f5697f || this.f5698g != aVar.f5698g) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: f */
        public boolean m5241f() {
            return this.f5693b == -1 || m5238c() < this.f5693b;
        }

        /* renamed from: g */
        public a m5242g(int i10) {
            int[] m5237b = m5237b(this.f5695d, i10);
            long[] m5236a = m5236a(this.f5696e, i10);
            return new a(this.f5692a, i10, m5237b, (Uri[]) Arrays.copyOf(this.f5694c, i10), m5236a, this.f5697f, this.f5698g);
        }

        /* renamed from: h */
        public a m5243h(long[] jArr) {
            long[] jArr2;
            int length = jArr.length;
            Uri[] uriArr = this.f5694c;
            if (length < uriArr.length) {
                jArr2 = m5236a(jArr, uriArr.length);
            } else {
                jArr2 = jArr;
                if (this.f5693b != -1) {
                    jArr2 = jArr;
                    if (jArr.length > uriArr.length) {
                        jArr2 = Arrays.copyOf(jArr, uriArr.length);
                    }
                }
            }
            return new a(this.f5692a, this.f5693b, this.f5695d, this.f5694c, jArr2, this.f5697f, this.f5698g);
        }

        public int hashCode() {
            int i10 = this.f5693b;
            long j10 = this.f5692a;
            int i11 = (int) (j10 ^ (j10 >>> 32));
            int hashCode = Arrays.hashCode(this.f5694c);
            int hashCode2 = Arrays.hashCode(this.f5695d);
            int hashCode3 = Arrays.hashCode(this.f5696e);
            long j11 = this.f5697f;
            return (((((((((((i10 * 31) + i11) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f5698g ? 1 : 0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        
            if (r0 == r13) goto L15;
         */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p026b8.C0820a.a m5244i(int r13, int r14) {
            /*
                r12 = this;
                r0 = r12
                int r0 = r0.f5693b
                r15 = r0
                r0 = 0
                r17 = r0
                r0 = r15
                r1 = -1
                if (r0 == r1) goto L1b
                r0 = r14
                r1 = r15
                if (r0 >= r1) goto L15
                goto L1b
            L15:
                r0 = 0
                r16 = r0
                goto L1e
            L1b:
                r0 = 1
                r16 = r0
            L1e:
                r0 = r16
                p059d9.C4349a.m21878a(r0)
                r0 = r12
                int[] r0 = r0.f5695d
                r1 = r14
                r2 = 1
                int r1 = r1 + r2
                int[] r0 = m5237b(r0, r1)
                r20 = r0
                r0 = r20
                r1 = r14
                r0 = r0[r1]
                r15 = r0
                r0 = r15
                if (r0 == 0) goto L46
                r0 = r15
                r1 = 1
                if (r0 == r1) goto L46
                r0 = r17
                r16 = r0
                r0 = r15
                r1 = r13
                if (r0 != r1) goto L49
            L46:
                r0 = 1
                r16 = r0
            L49:
                r0 = r16
                p059d9.C4349a.m21878a(r0)
                r0 = r12
                long[] r0 = r0.f5696e
                r18 = r0
                r0 = r18
                int r0 = r0.length
                r1 = r20
                int r1 = r1.length
                if (r0 != r1) goto L60
                goto L6a
            L60:
                r0 = r18
                r1 = r20
                int r1 = r1.length
                long[] r0 = m5236a(r0, r1)
                r18 = r0
            L6a:
                r0 = r12
                android.net.Uri[] r0 = r0.f5694c
                r19 = r0
                r0 = r19
                int r0 = r0.length
                r1 = r20
                int r1 = r1.length
                if (r0 != r1) goto L7c
                goto L89
            L7c:
                r0 = r19
                r1 = r20
                int r1 = r1.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                android.net.Uri[] r0 = (android.net.Uri[]) r0
                r19 = r0
            L89:
                r0 = r20
                r1 = r14
                r2 = r13
                r0[r1] = r2
                b8.a$a r0 = new b8.a$a
                r1 = r0
                r2 = r12
                long r2 = r2.f5692a
                r3 = r12
                int r3 = r3.f5693b
                r4 = r20
                r5 = r19
                r6 = r18
                r7 = r12
                long r7 = r7.f5697f
                r8 = r12
                boolean r8 = r8.f5698g
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p026b8.C0820a.a.m5244i(int, int):b8.a$a");
        }

        /* renamed from: j */
        public a m5245j(Uri uri, int i10) {
            int[] m5237b = m5237b(this.f5695d, i10 + 1);
            long[] jArr = this.f5696e;
            if (jArr.length != m5237b.length) {
                jArr = m5236a(jArr, m5237b.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f5694c, m5237b.length);
            uriArr[i10] = uri;
            m5237b[i10] = 1;
            return new a(this.f5692a, this.f5693b, m5237b, uriArr, jArr, this.f5697f, this.f5698g);
        }

        /* renamed from: k */
        public a m5246k() {
            if (this.f5693b == -1) {
                return new a(this.f5692a, 0, new int[0], new Uri[0], new long[0], this.f5697f, this.f5698g);
            }
            int[] iArr = this.f5695d;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = copyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    copyOf[i10] = 2;
                }
            }
            return new a(this.f5692a, length, copyOf, this.f5694c, this.f5696e, this.f5697f, this.f5698g);
        }
    }

    public C0820a(Object obj, long... jArr) {
        this(obj, m5221a(jArr), 0L, -9223372036854775807L, 0);
    }

    public C0820a(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f5685a = obj;
        this.f5687c = j10;
        this.f5688d = j11;
        this.f5686b = aVarArr.length + i10;
        this.f5690f = aVarArr;
        this.f5689e = i10;
    }

    /* renamed from: a */
    public static a[] m5221a(long[] jArr) {
        int length = jArr.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = new a(jArr[i10]);
        }
        return aVarArr;
    }

    /* renamed from: b */
    public a m5222b(int i10) {
        int i11 = this.f5689e;
        return i10 < i11 ? f5683h : this.f5690f[i10 - i11];
    }

    /* renamed from: c */
    public int m5223c(long j10, long j11) {
        int i10 = -1;
        if (j10 != Long.MIN_VALUE) {
            if (j11 == -9223372036854775807L || j10 < j11) {
                int i11 = this.f5689e;
                while (i11 < this.f5686b && ((m5222b(i11).f5692a != Long.MIN_VALUE && m5222b(i11).f5692a <= j10) || !m5222b(i11).m5241f())) {
                    i11++;
                }
                i10 = -1;
                if (i11 < this.f5686b) {
                    i10 = i11;
                }
            } else {
                i10 = -1;
            }
        }
        return i10;
    }

    /* renamed from: d */
    public int m5224d(long j10, long j11) {
        int i10 = this.f5686b - 1;
        while (i10 >= 0 && m5226f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !m5222b(i10).m5240e()) {
            i10 = -1;
        }
        return i10;
    }

    /* renamed from: e */
    public boolean m5225e(int i10, int i11) {
        if (i10 >= this.f5686b) {
            return false;
        }
        a m5222b = m5222b(i10);
        int i12 = m5222b.f5693b;
        boolean z10 = false;
        if (i12 != -1) {
            if (i11 >= i12) {
                z10 = false;
            } else {
                z10 = false;
                if (m5222b.f5695d[i11] == 4) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0820a.class != obj.getClass()) {
            return false;
        }
        C0820a c0820a = (C0820a) obj;
        if (!C4401z0.m22371c(this.f5685a, c0820a.f5685a) || this.f5686b != c0820a.f5686b || this.f5687c != c0820a.f5687c || this.f5688d != c0820a.f5688d || this.f5689e != c0820a.f5689e || !Arrays.equals(this.f5690f, c0820a.f5690f)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: f */
    public final boolean m5226f(long j10, long j11, int i10) {
        boolean z10 = false;
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = m5222b(i10).f5692a;
        if (j12 == Long.MIN_VALUE) {
            if (j11 == -9223372036854775807L || j10 < j11) {
                z10 = true;
            }
            return z10;
        }
        boolean z11 = false;
        if (j10 < j12) {
            z11 = true;
        }
        return z11;
    }

    /* renamed from: g */
    public C0820a m5227g(int i10, int i11) {
        C4349a.m21878a(i11 > 0);
        int i12 = i10 - this.f5689e;
        a[] aVarArr = this.f5690f;
        if (aVarArr[i12].f5693b == i11) {
            return this;
        }
        a[] aVarArr2 = (a[]) C4401z0.m22328H0(aVarArr, aVarArr.length);
        aVarArr2[i12] = this.f5690f[i12].m5242g(i11);
        return new C0820a(this.f5685a, aVarArr2, this.f5687c, this.f5688d, this.f5689e);
    }

    /* renamed from: h */
    public C0820a m5228h(long[][] jArr) {
        C4349a.m21884g(this.f5689e == 0);
        a[] aVarArr = this.f5690f;
        a[] aVarArr2 = (a[]) C4401z0.m22328H0(aVarArr, aVarArr.length);
        for (int i10 = 0; i10 < this.f5686b; i10++) {
            aVarArr2[i10] = aVarArr2[i10].m5243h(jArr[i10]);
        }
        return new C0820a(this.f5685a, aVarArr2, this.f5687c, this.f5688d, this.f5689e);
    }

    public int hashCode() {
        int i10 = this.f5686b;
        Object obj = this.f5685a;
        return (((((((((i10 * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f5687c)) * 31) + ((int) this.f5688d)) * 31) + this.f5689e) * 31) + Arrays.hashCode(this.f5690f);
    }

    /* renamed from: i */
    public C0820a m5229i(int i10, int i11) {
        int i12 = i10 - this.f5689e;
        a[] aVarArr = this.f5690f;
        a[] aVarArr2 = (a[]) C4401z0.m22328H0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].m5244i(4, i11);
        return new C0820a(this.f5685a, aVarArr2, this.f5687c, this.f5688d, this.f5689e);
    }

    /* renamed from: j */
    public C0820a m5230j(long j10) {
        return this.f5687c == j10 ? this : new C0820a(this.f5685a, this.f5690f, j10, this.f5688d, this.f5689e);
    }

    /* renamed from: k */
    public C0820a m5231k(int i10, int i11, Uri uri) {
        int i12 = i10 - this.f5689e;
        a[] aVarArr = this.f5690f;
        a[] aVarArr2 = (a[]) C4401z0.m22328H0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].m5245j(uri, i11);
        return new C0820a(this.f5685a, aVarArr2, this.f5687c, this.f5688d, this.f5689e);
    }

    /* renamed from: l */
    public C0820a m5232l(long j10) {
        return this.f5688d == j10 ? this : new C0820a(this.f5685a, this.f5690f, this.f5687c, j10, this.f5689e);
    }

    /* renamed from: m */
    public C0820a m5233m(int i10, int i11) {
        int i12 = i10 - this.f5689e;
        a[] aVarArr = this.f5690f;
        a[] aVarArr2 = (a[]) C4401z0.m22328H0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].m5244i(3, i11);
        return new C0820a(this.f5685a, aVarArr2, this.f5687c, this.f5688d, this.f5689e);
    }

    /* renamed from: n */
    public C0820a m5234n(int i10, int i11) {
        int i12 = i10 - this.f5689e;
        a[] aVarArr = this.f5690f;
        a[] aVarArr2 = (a[]) C4401z0.m22328H0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].m5244i(2, i11);
        return new C0820a(this.f5685a, aVarArr2, this.f5687c, this.f5688d, this.f5689e);
    }

    /* renamed from: o */
    public C0820a m5235o(int i10) {
        int i11 = i10 - this.f5689e;
        a[] aVarArr = this.f5690f;
        a[] aVarArr2 = (a[]) C4401z0.m22328H0(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].m5246k();
        return new C0820a(this.f5685a, aVarArr2, this.f5687c, this.f5688d, this.f5689e);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f5685a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f5687c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f5690f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f5690f[i10].f5692a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f5690f[i10].f5695d.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f5690f[i10].f5695d[i11];
                sb2.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb2.append(", durationUs=");
                sb2.append(this.f5690f[i10].f5696e[i11]);
                sb2.append(')');
                if (i11 < this.f5690f[i10].f5695d.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f5690f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
