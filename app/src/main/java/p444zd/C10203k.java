package p444zd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zd/k.class
 */
/* renamed from: zd.k */
/* loaded from: combined.jar:classes2.jar:zd/k.class */
public final class C10203k {

    /* renamed from: a */
    public final float f46692a;

    /* renamed from: b */
    public final float f46693b;

    /* renamed from: c */
    public final float f46694c;

    /* renamed from: d */
    public final float f46695d;

    /* renamed from: e */
    public final float f46696e;

    /* renamed from: f */
    public final float f46697f;

    /* renamed from: g */
    public final float f46698g;

    /* renamed from: h */
    public final float f46699h;

    /* renamed from: i */
    public final float f46700i;

    public C10203k(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f46692a = f10;
        this.f46693b = f13;
        this.f46694c = f16;
        this.f46695d = f11;
        this.f46696e = f14;
        this.f46697f = f17;
        this.f46698g = f12;
        this.f46699h = f15;
        this.f46700i = f18;
    }

    /* renamed from: b */
    public static C10203k m42713b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return m42715d(f18, f19, f20, f21, f22, f23, f24, f25).m42717e(m42714c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    /* renamed from: c */
    public static C10203k m42714c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return m42715d(f10, f11, f12, f13, f14, f15, f16, f17).m42716a();
    }

    /* renamed from: d */
    public static C10203k m42715d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new C10203k(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new C10203k((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    /* renamed from: a */
    public C10203k m42716a() {
        float f10 = this.f46696e;
        float f11 = this.f46700i;
        float f12 = this.f46697f;
        float f13 = this.f46699h;
        float f14 = this.f46698g;
        float f15 = this.f46695d;
        float f16 = this.f46694c;
        float f17 = this.f46693b;
        float f18 = this.f46692a;
        return new C10203k((f10 * f11) - (f12 * f13), (f12 * f14) - (f15 * f11), (f15 * f13) - (f10 * f14), (f16 * f13) - (f17 * f11), (f11 * f18) - (f16 * f14), (f14 * f17) - (f13 * f18), (f17 * f12) - (f16 * f10), (f16 * f15) - (f12 * f18), (f18 * f10) - (f17 * f15));
    }

    /* renamed from: e */
    public C10203k m42717e(C10203k c10203k) {
        float f10 = this.f46692a;
        float f11 = c10203k.f46692a;
        float f12 = this.f46695d;
        float f13 = c10203k.f46693b;
        float f14 = this.f46698g;
        float f15 = c10203k.f46694c;
        float f16 = c10203k.f46695d;
        float f17 = c10203k.f46696e;
        float f18 = c10203k.f46697f;
        float f19 = c10203k.f46698g;
        float f20 = c10203k.f46699h;
        float f21 = c10203k.f46700i;
        float f22 = this.f46693b;
        float f23 = this.f46696e;
        float f24 = this.f46699h;
        float f25 = this.f46694c;
        float f26 = this.f46697f;
        float f27 = this.f46700i;
        return new C10203k((f10 * f11) + (f12 * f13) + (f14 * f15), (f10 * f16) + (f12 * f17) + (f14 * f18), (f10 * f19) + (f12 * f20) + (f14 * f21), (f22 * f11) + (f23 * f13) + (f24 * f15), (f22 * f16) + (f23 * f17) + (f24 * f18), (f24 * f21) + (f22 * f19) + (f23 * f20), (f15 * f27) + (f11 * f25) + (f13 * f26), (f16 * f25) + (f17 * f26) + (f18 * f27), (f25 * f19) + (f26 * f20) + (f27 * f21));
    }

    /* renamed from: f */
    public void m42718f(float[] fArr) {
        float f10 = this.f46692a;
        float f11 = this.f46693b;
        float f12 = this.f46694c;
        float f13 = this.f46695d;
        float f14 = this.f46696e;
        float f15 = this.f46697f;
        float f16 = this.f46698g;
        float f17 = this.f46699h;
        float f18 = this.f46700i;
        int length = fArr.length;
        for (int i10 = 0; i10 < length - 1; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }
}
