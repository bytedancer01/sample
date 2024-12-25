package p289qe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/g.class
 */
/* renamed from: qe.g */
/* loaded from: combined.jar:classes2.jar:qe/g.class */
public final class C7916g {

    /* renamed from: c */
    public static final int[][] f38055c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    public final EnumC7915f f38056a;

    /* renamed from: b */
    public final byte f38057b;

    public C7916g(int i10) {
        this.f38056a = EnumC7915f.forBits((i10 >> 3) & 3);
        this.f38057b = (byte) (i10 & 7);
    }

    /* renamed from: a */
    public static C7916g m34281a(int i10, int i11) {
        C7916g m34282b = m34282b(i10, i11);
        return m34282b != null ? m34282b : m34282b(i10 ^ 21522, i11 ^ 21522);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        return new p289qe.C7916g(r0[1]);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p289qe.C7916g m34282b(int r5, int r6) {
        /*
            int[][] r0 = p289qe.C7916g.f38055c
            r15 = r0
            r0 = r15
            int r0 = r0.length
            r13 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r8 = r0
        L13:
            r0 = r11
            r1 = r13
            if (r0 >= r1) goto L8e
            r0 = r15
            r1 = r11
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            r1 = 0
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            r1 = r5
            if (r0 == r1) goto L82
            r0 = r12
            r1 = r6
            if (r0 != r1) goto L36
            goto L82
        L36:
            r0 = r5
            r1 = r12
            int r0 = m34283e(r0, r1)
            r9 = r0
            r0 = r10
            r7 = r0
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L50
            r0 = r14
            r1 = 1
            r0 = r0[r1]
            r8 = r0
            r0 = r9
            r7 = r0
        L50:
            r0 = r7
            r10 = r0
            r0 = r8
            r9 = r0
            r0 = r5
            r1 = r6
            if (r0 == r1) goto L79
            r0 = r6
            r1 = r12
            int r0 = m34283e(r0, r1)
            r12 = r0
            r0 = r7
            r10 = r0
            r0 = r8
            r9 = r0
            r0 = r12
            r1 = r7
            if (r0 >= r1) goto L79
            r0 = r14
            r1 = 1
            r0 = r0[r1]
            r9 = r0
            r0 = r12
            r10 = r0
        L79:
            int r11 = r11 + 1
            r0 = r9
            r8 = r0
            goto L13
        L82:
            qe.g r0 = new qe.g
            r1 = r0
            r2 = r14
            r3 = 1
            r2 = r2[r3]
            r1.<init>(r2)
            return r0
        L8e:
            r0 = r10
            r1 = 3
            if (r0 > r1) goto L9d
            qe.g r0 = new qe.g
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            return r0
        L9d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p289qe.C7916g.m34282b(int, int):qe.g");
    }

    /* renamed from: e */
    public static int m34283e(int i10, int i11) {
        return Integer.bitCount(i10 ^ i11);
    }

    /* renamed from: c */
    public byte m34284c() {
        return this.f38057b;
    }

    /* renamed from: d */
    public EnumC7915f m34285d() {
        return this.f38056a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7916g)) {
            return false;
        }
        C7916g c7916g = (C7916g) obj;
        return this.f38056a == c7916g.f38056a && this.f38057b == c7916g.f38057b;
    }

    public int hashCode() {
        return (this.f38056a.ordinal() << 3) | this.f38057b;
    }
}
