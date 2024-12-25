package p087f0;

import android.graphics.Path;
import android.util.Log;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/c.class
 */
/* renamed from: f0.c */
/* loaded from: combined.jar:classes1.jar:f0/c.class */
public class C4740c {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f0/c$a.class
     */
    /* renamed from: f0.c$a */
    /* loaded from: combined.jar:classes1.jar:f0/c$a.class */
    public static class a {

        /* renamed from: a */
        public int f27971a;

        /* renamed from: b */
        public boolean f27972b;
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f0/c$b.class
     */
    /* renamed from: f0.c$b */
    /* loaded from: combined.jar:classes1.jar:f0/c$b.class */
    public static class b {

        /* renamed from: a */
        public char f27973a;

        /* renamed from: b */
        public float[] f27974b;

        public b(char c10, float[] fArr) {
            this.f27973a = c10;
            this.f27974b = fArr;
        }

        public b(b bVar) {
            this.f27973a = bVar.f27973a;
            float[] fArr = bVar.f27974b;
            this.f27974b = C4740c.m23982c(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x0413, code lost:
        
            if (r27 == 'S') goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x03a4, code lost:
        
            if (r27 == 'T') goto L89;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void m23990a(android.graphics.Path r11, float[] r12, char r13, char r14, float[] r15) {
            /*
                Method dump skipped, instructions count: 2107
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p087f0.C4740c.b.m23990a(android.graphics.Path, float[], char, char, float[]):void");
        }

        /* renamed from: b */
        public static void m23991b(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
            int ceil = (int) Math.ceil(Math.abs((d18 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d16);
            double sin = Math.sin(d16);
            double cos2 = Math.cos(d17);
            double sin2 = Math.sin(d17);
            double d19 = -d12;
            double d20 = d19 * cos;
            double d21 = d13 * sin;
            double d22 = d19 * sin;
            double d23 = d13 * cos;
            double d24 = d18 / ceil;
            double d25 = d17;
            double d26 = (sin2 * d22) + (cos2 * d23);
            double d27 = (d20 * sin2) - (d21 * cos2);
            int i10 = 0;
            double d28 = d15;
            double d29 = d14;
            while (i10 < ceil) {
                double d30 = d25 + d24;
                double sin3 = Math.sin(d30);
                double cos3 = Math.cos(d30);
                double d31 = (d10 + ((d12 * cos) * cos3)) - (d21 * sin3);
                double d32 = d11 + (d12 * sin * cos3) + (d23 * sin3);
                double d33 = (d20 * sin3) - (d21 * cos3);
                double d34 = (sin3 * d22) + (cos3 * d23);
                double d35 = d30 - d25;
                double tan = Math.tan(d35 / 2.0d);
                double sin4 = (Math.sin(d35) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d29 + (d27 * sin4)), (float) (d28 + (d26 * sin4)), (float) (d31 - (sin4 * d33)), (float) (d32 - (sin4 * d34)), (float) d31, (float) d32);
                i10++;
                d29 = d31;
                d25 = d30;
                d26 = d34;
                d27 = d33;
                d28 = d32;
            }
        }

        /* renamed from: c */
        public static void m23992c(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = f10;
            double d13 = f11;
            double d14 = f14;
            double d15 = ((d12 * cos) + (d13 * sin)) / d14;
            double d16 = f15;
            double d17 = (((-f10) * sin) + (d13 * cos)) / d16;
            double d18 = f13;
            double d19 = ((f12 * cos) + (d18 * sin)) / d14;
            double d20 = (((-f12) * sin) + (d18 * cos)) / d16;
            double d21 = d15 - d19;
            double d22 = d17 - d20;
            double d23 = (d15 + d19) / 2.0d;
            double d24 = (d17 + d20) / 2.0d;
            double d25 = (d21 * d21) + (d22 * d22);
            if (d25 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d25);
                float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
                m23992c(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d26);
            double d27 = d21 * sqrt2;
            double d28 = sqrt2 * d22;
            if (z10 == z11) {
                d10 = d23 - d28;
                d11 = d24 + d27;
            } else {
                d10 = d23 + d28;
                d11 = d24 - d27;
            }
            double atan2 = Math.atan2(d17 - d11, d15 - d10);
            double atan22 = Math.atan2(d20 - d11, d19 - d10) - atan2;
            double d29 = atan22;
            if (z11 != (atan22 >= 0.0d)) {
                d29 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d30 = d10 * d14;
            double d31 = d11 * d16;
            m23991b(path, (d30 * cos) - (d31 * sin), (d30 * sin) + (d31 * cos), d14, d16, d12, d13, radians, atan2, d29);
        }

        /* renamed from: e */
        public static void m23993e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c10 = 'm';
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                b bVar = bVarArr[i10];
                m23990a(path, fArr, c10, bVar.f27973a, bVar.f27974b);
                c10 = bVarArr[i10].f27973a;
            }
        }

        /* renamed from: d */
        public void m23994d(b bVar, b bVar2, float f10) {
            this.f27973a = bVar.f27973a;
            int i10 = 0;
            while (true) {
                float[] fArr = bVar.f27974b;
                if (i10 >= fArr.length) {
                    return;
                }
                this.f27974b[i10] = (fArr[i10] * (1.0f - f10)) + (bVar2.f27974b[i10] * f10);
                i10++;
            }
        }
    }

    /* renamed from: a */
    public static void m23980a(ArrayList<b> arrayList, char c10, float[] fArr) {
        arrayList.add(new b(c10, fArr));
    }

    /* renamed from: b */
    public static boolean m23981b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            char c10 = bVar.f27973a;
            b bVar2 = bVarArr2[i10];
            if (c10 != bVar2.f27973a || bVar.f27974b.length != bVar2.f27974b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static float[] m23982c(float[] fArr, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i10 < 0 || i10 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        int min = Math.min(i12, length - i10);
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, i10, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: d */
    public static b[] m23983d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 0;
        while (i10 < str.length()) {
            int m23988i = m23988i(str, i10);
            String trim = str.substring(i11, m23988i).trim();
            if (trim.length() > 0) {
                m23980a(arrayList, trim.charAt(0), m23987h(trim));
            }
            i11 = m23988i;
            i10 = m23988i + 1;
        }
        if (i10 - i11 == 1 && i11 < str.length()) {
            m23980a(arrayList, str.charAt(i11), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* renamed from: e */
    public static Path m23984e(String str) {
        Path path = new Path();
        b[] m23983d = m23983d(str);
        if (m23983d == null) {
            return null;
        }
        try {
            b.m23993e(m23983d, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing " + str, e10);
        }
    }

    /* renamed from: f */
    public static b[] m23985f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = new b(bVarArr[i10]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r6 == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090 A[LOOP:0: B:2:0x0010->B:17:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m23986g(java.lang.String r3, int r4, p087f0.C4740c.a r5) {
        /*
            r0 = r5
            r1 = 0
            r0.f27972b = r1
            r0 = r4
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r8 = r0
        L10:
            r0 = r7
            r1 = r3
            int r1 = r1.length()
            if (r0 >= r1) goto L96
            r0 = r3
            r1 = r7
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r10
            r1 = 32
            if (r0 == r1) goto L83
            r0 = r10
            r1 = 69
            if (r0 == r1) goto L7e
            r0 = r10
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L7e
            r0 = r10
            switch(r0) {
                case 44: goto L83;
                case 45: goto L6c;
                case 46: goto L57;
                default: goto L54;
            }
        L54:
            goto L79
        L57:
            r0 = r9
            if (r0 != 0) goto L64
            r0 = 0
            r6 = r0
            r0 = 1
            r9 = r0
            goto L88
        L64:
            r0 = r5
            r1 = 1
            r0.f27972b = r1
            goto L83
        L6c:
            r0 = r7
            r1 = r4
            if (r0 == r1) goto L79
            r0 = r6
            if (r0 != 0) goto L79
            goto L64
        L79:
            r0 = 0
            r6 = r0
            goto L88
        L7e:
            r0 = 1
            r6 = r0
            goto L88
        L83:
            r0 = 0
            r6 = r0
            r0 = 1
            r8 = r0
        L88:
            r0 = r8
            if (r0 == 0) goto L90
            goto L96
        L90:
            int r7 = r7 + 1
            goto L10
        L96:
            r0 = r5
            r1 = r7
            r0.f27971a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p087f0.C4740c.m23986g(java.lang.String, int, f0.c$a):void");
    }

    /* renamed from: h */
    public static float[] m23987h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i10 = 1;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i10 >= length) {
                    return m23982c(fArr, 0, i12);
                }
                m23986g(str, i10, aVar);
                int i13 = aVar.f27971a;
                int i14 = i12;
                if (i10 < i13) {
                    fArr[i12] = Float.parseFloat(str.substring(i10, i13));
                    i14 = i12 + 1;
                }
                if (aVar.f27972b) {
                    i10 = i13;
                    i11 = i14;
                } else {
                    i10 = i13 + 1;
                    i11 = i14;
                }
            }
        } catch (NumberFormatException e10) {
            throw new RuntimeException("error in parsing \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, e10);
        }
    }

    /* renamed from: i */
    public static int m23988i(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    /* renamed from: j */
    public static void m23989j(b[] bVarArr, b[] bVarArr2) {
        for (int i10 = 0; i10 < bVarArr2.length; i10++) {
            bVarArr[i10].f27973a = bVarArr2[i10].f27973a;
            int i11 = 0;
            while (true) {
                float[] fArr = bVarArr2[i10].f27974b;
                if (i11 < fArr.length) {
                    bVarArr[i10].f27974b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }
}
