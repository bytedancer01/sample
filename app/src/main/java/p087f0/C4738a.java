package p087f0;

import android.graphics.Color;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/a.class
 */
/* renamed from: f0.a */
/* loaded from: combined.jar:classes1.jar:f0/a.class */
public final class C4738a {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f27965a = new ThreadLocal<>();

    /* renamed from: a */
    public static void m23962a(int i10, int i11, int i12, float[] fArr) {
        float f10;
        float abs;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float f13 = i12 / 255.0f;
        float max = Math.max(f11, Math.max(f12, f13));
        float min = Math.min(f11, Math.min(f12, f13));
        float f14 = max - min;
        float f15 = (max + min) / 2.0f;
        if (max == min) {
            f10 = 0.0f;
            abs = 0.0f;
        } else {
            f10 = max == f11 ? ((f12 - f13) / f14) % 6.0f : max == f12 ? ((f13 - f11) / f14) + 2.0f : 4.0f + ((f11 - f12) / f14);
            abs = f14 / (1.0f - Math.abs((2.0f * f15) - 1.0f));
        }
        float f16 = (f10 * 60.0f) % 360.0f;
        float f17 = f16;
        if (f16 < 0.0f) {
            f17 = f16 + 360.0f;
        }
        fArr[0] = m23972k(f17, 0.0f, 360.0f);
        fArr[1] = m23972k(abs, 0.0f, 1.0f);
        fArr[2] = m23972k(f15, 0.0f, 1.0f);
    }

    /* renamed from: b */
    public static void m23963b(int i10, int i11, int i12, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = i10 / 255.0d;
        double pow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = i11 / 255.0d;
        double pow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = i12 / 255.0d;
        double pow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
    }

    /* renamed from: c */
    public static double m23964c(int i10, int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        int i12 = i10;
        if (Color.alpha(i10) < 255) {
            i12 = m23970i(i10, i11);
        }
        double m23965d = m23965d(i12) + 0.05d;
        double m23965d2 = m23965d(i11) + 0.05d;
        return Math.max(m23965d, m23965d2) / Math.min(m23965d, m23965d2);
    }

    /* renamed from: d */
    public static double m23965d(int i10) {
        double[] m23973l = m23973l();
        m23968g(i10, m23973l);
        return m23973l[1] / 100.0d;
    }

    /* renamed from: e */
    public static int m23966e(int i10, int i11, float f10) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
        }
        double d10 = f10;
        if (m23964c(m23974m(i10, 255), i11) < d10) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (m23964c(m23974m(i10, i15), i11) < d10) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    /* renamed from: f */
    public static void m23967f(int i10, float[] fArr) {
        m23962a(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    /* renamed from: g */
    public static void m23968g(int i10, double[] dArr) {
        m23963b(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    /* renamed from: h */
    public static int m23969h(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    /* renamed from: i */
    public static int m23970i(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int m23969h = m23969h(alpha2, alpha);
        return Color.argb(m23969h, m23971j(Color.red(i10), alpha2, Color.red(i11), alpha, m23969h), m23971j(Color.green(i10), alpha2, Color.green(i11), alpha, m23969h), m23971j(Color.blue(i10), alpha2, Color.blue(i11), alpha, m23969h));
    }

    /* renamed from: j */
    public static int m23971j(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    /* renamed from: k */
    public static float m23972k(float f10, float f11, float f12) {
        if (f10 >= f11) {
            f11 = f10;
            if (f10 > f12) {
                f11 = f12;
            }
        }
        return f11;
    }

    /* renamed from: l */
    public static double[] m23973l() {
        ThreadLocal<double[]> threadLocal = f27965a;
        double[] dArr = threadLocal.get();
        double[] dArr2 = dArr;
        if (dArr == null) {
            dArr2 = new double[3];
            threadLocal.set(dArr2);
        }
        return dArr2;
    }

    /* renamed from: m */
    public static int m23974m(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
