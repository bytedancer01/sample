package ie;

import p132he.AbstractC5069k;
import td.C8695j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ie/a.class
 */
/* renamed from: ie.a */
/* loaded from: combined.jar:classes2.jar:ie/a.class */
public abstract class AbstractC5245a extends AbstractC5069k {

    /* renamed from: b */
    public final int[] f29981b;

    /* renamed from: e */
    public final int[] f29984e;

    /* renamed from: f */
    public final int[] f29985f;

    /* renamed from: a */
    public final int[] f29980a = new int[4];

    /* renamed from: c */
    public final float[] f29982c = new float[4];

    /* renamed from: d */
    public final float[] f29983d = new float[4];

    public AbstractC5245a() {
        int[] iArr = new int[8];
        this.f29981b = iArr;
        this.f29984e = new int[iArr.length / 2];
        this.f29985f = new int[iArr.length / 2];
    }

    /* renamed from: h */
    public static void m26162h(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        int i11 = 1;
        while (i11 < iArr.length) {
            float f11 = fArr[i11];
            float f12 = f10;
            if (f11 < f10) {
                i10 = i11;
                f12 = f11;
            }
            i11++;
            f10 = f12;
        }
        iArr[i10] = iArr[i10] - 1;
    }

    /* renamed from: o */
    public static void m26163o(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        int i11 = 1;
        while (i11 < iArr.length) {
            float f11 = fArr[i11];
            float f12 = f10;
            if (f11 > f10) {
                i10 = i11;
                f12 = f11;
            }
            i11++;
            f10 = f12;
        }
        iArr[i10] = iArr[i10] + 1;
    }

    /* renamed from: p */
    public static boolean m26164p(int[] iArr) {
        float f10 = (iArr[0] + iArr[1]) / ((iArr[2] + r0) + iArr[3]);
        if (f10 < 0.7916667f || f10 > 0.89285713f) {
            return false;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int length = iArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = iArr[i12];
            int i14 = i11;
            if (i13 > i11) {
                i14 = i13;
            }
            int i15 = i10;
            if (i13 < i10) {
                i15 = i13;
            }
            i12++;
            i10 = i15;
            i11 = i14;
        }
        return i11 < i10 * 10;
    }

    /* renamed from: q */
    public static int m26165q(int[] iArr, int[][] iArr2) {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (AbstractC5069k.m25328e(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw C8695j.m37209a();
    }

    /* renamed from: i */
    public final int[] m26166i() {
        return this.f29981b;
    }

    /* renamed from: j */
    public final int[] m26167j() {
        return this.f29980a;
    }

    /* renamed from: k */
    public final int[] m26168k() {
        return this.f29985f;
    }

    /* renamed from: l */
    public final float[] m26169l() {
        return this.f29983d;
    }

    /* renamed from: m */
    public final int[] m26170m() {
        return this.f29984e;
    }

    /* renamed from: n */
    public final float[] m26171n() {
        return this.f29982c;
    }
}
