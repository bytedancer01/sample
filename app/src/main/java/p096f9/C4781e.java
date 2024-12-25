package p096f9;

import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f9/e.class
 */
/* renamed from: f9.e */
/* loaded from: combined.jar:classes2.jar:f9/e.class */
public final class C4781e {

    /* renamed from: a */
    public final a f28158a;

    /* renamed from: b */
    public final a f28159b;

    /* renamed from: c */
    public final int f28160c;

    /* renamed from: d */
    public final boolean f28161d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:f9/e$a.class
     */
    /* renamed from: f9.e$a */
    /* loaded from: combined.jar:classes2.jar:f9/e$a.class */
    public static final class a {

        /* renamed from: a */
        public final b[] f28162a;

        public a(b... bVarArr) {
            this.f28162a = bVarArr;
        }

        /* renamed from: a */
        public b m24201a(int i10) {
            return this.f28162a[i10];
        }

        /* renamed from: b */
        public int m24202b() {
            return this.f28162a.length;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:f9/e$b.class
     */
    /* renamed from: f9.e$b */
    /* loaded from: combined.jar:classes2.jar:f9/e$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f28163a;

        /* renamed from: b */
        public final int f28164b;

        /* renamed from: c */
        public final float[] f28165c;

        /* renamed from: d */
        public final float[] f28166d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f28163a = i10;
            C4349a.m21878a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f28165c = fArr;
            this.f28166d = fArr2;
            this.f28164b = i11;
        }

        /* renamed from: a */
        public int m24203a() {
            return this.f28165c.length / 3;
        }
    }

    public C4781e(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public C4781e(a aVar, a aVar2, int i10) {
        this.f28158a = aVar;
        this.f28159b = aVar2;
        this.f28160c = i10;
        this.f28161d = aVar == aVar2;
    }

    /* renamed from: a */
    public static C4781e m24199a(float f10, int i10, int i11, float f11, float f12, int i12) {
        C4349a.m21878a(f10 > 0.0f);
        C4349a.m21878a(i10 >= 1);
        C4349a.m21878a(i11 >= 1);
        C4349a.m21878a(f11 > 0.0f && f11 <= 180.0f);
        C4349a.m21878a(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f13 = radians / i10;
        float f14 = radians2 / i11;
        int i13 = i11 + 1;
        int i14 = ((i13 * 2) + 2) * i10;
        float[] fArr = new float[i14 * 3];
        float[] fArr2 = new float[i14 * 2];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i10) {
            float f15 = radians / 2.0f;
            float f16 = (i15 * f13) - f15;
            int i18 = i15 + 1;
            float f17 = (i18 * f13) - f15;
            int i19 = 0;
            int i20 = i15;
            i15 = i18;
            while (i19 < i13) {
                int i21 = 0;
                int i22 = i19;
                while (i21 < 2) {
                    float f18 = i21 == 0 ? f16 : f17;
                    float f19 = i22 * f14;
                    float f20 = radians2 / 2.0f;
                    int i23 = i16 + 1;
                    double d10 = f10;
                    double d11 = (f19 + 3.1415927f) - f20;
                    double sin = Math.sin(d11);
                    double d12 = f18;
                    fArr[i16] = -((float) (sin * d10 * Math.cos(d12)));
                    int i24 = i23 + 1;
                    fArr[i23] = (float) (d10 * Math.sin(d12));
                    int i25 = i24 + 1;
                    fArr[i24] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    int i26 = i17 + 1;
                    fArr2[i17] = f19 / radians2;
                    int i27 = i26 + 1;
                    fArr2[i26] = ((i20 + i21) * f13) / radians;
                    if ((i22 == 0 && i21 == 0) || (i22 == i11 && i21 == 1)) {
                        System.arraycopy(fArr, i25 - 3, fArr, i25, 3);
                        i25 += 3;
                        System.arraycopy(fArr2, i27 - 2, fArr2, i27, 2);
                        i27 += 2;
                    }
                    i17 = i27;
                    i21++;
                    i16 = i25;
                }
                i19 = i22 + 1;
            }
        }
        return new C4781e(new a(new b(0, fArr, fArr2, 1)), i12);
    }

    /* renamed from: b */
    public static C4781e m24200b(int i10) {
        return m24199a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }
}
