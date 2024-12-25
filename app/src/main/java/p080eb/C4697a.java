package p080eb;

import p404xb.C9711f;
import p404xb.C9718m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:eb/a.class
 */
/* renamed from: eb.a */
/* loaded from: combined.jar:classes2.jar:eb/a.class */
public class C4697a extends C9711f implements Cloneable {

    /* renamed from: b */
    public float f27704b;

    /* renamed from: c */
    public float f27705c;

    /* renamed from: d */
    public float f27706d;

    /* renamed from: e */
    public float f27707e;

    /* renamed from: f */
    public float f27708f;

    @Override // p404xb.C9711f
    /* renamed from: b */
    public void mo23621b(float f10, float f11, float f12, C9718m c9718m) {
        float f13 = this.f27706d;
        if (f13 == 0.0f) {
            c9718m.m40964m(f10, 0.0f);
            return;
        }
        float f14 = ((this.f27705c * 2.0f) + f13) / 2.0f;
        float f15 = f12 * this.f27704b;
        float f16 = f11 + this.f27708f;
        float f17 = (this.f27707e * f12) + ((1.0f - f12) * f14);
        if (f17 / f14 >= 1.0f) {
            c9718m.m40964m(f10, 0.0f);
            return;
        }
        float f18 = f14 + f15;
        float f19 = f17 + f15;
        float sqrt = (float) Math.sqrt((f18 * f18) - (f19 * f19));
        float f20 = f16 - sqrt;
        float f21 = f16 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f19));
        float f22 = 90.0f - degrees;
        c9718m.m40964m(f20, 0.0f);
        float f23 = f15 * 2.0f;
        c9718m.m40952a(f20 - f15, 0.0f, f20 + f15, f23, 270.0f, degrees);
        c9718m.m40952a(f16 - f14, (-f14) - f17, f16 + f14, f14 - f17, 180.0f - f22, (f22 * 2.0f) - 180.0f);
        c9718m.m40952a(f21 - f15, 0.0f, f21 + f15, f23, 270.0f - degrees, degrees);
        c9718m.m40964m(f10, 0.0f);
    }

    /* renamed from: c */
    public float m23622c() {
        return this.f27707e;
    }

    /* renamed from: d */
    public float m23623d() {
        return this.f27705c;
    }

    /* renamed from: e */
    public float m23624e() {
        return this.f27704b;
    }

    /* renamed from: g */
    public float m23625g() {
        return this.f27706d;
    }

    /* renamed from: h */
    public void m23626h(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f27707e = f10;
    }

    /* renamed from: i */
    public void m23627i(float f10) {
        this.f27705c = f10;
    }

    /* renamed from: j */
    public void m23628j(float f10) {
        this.f27704b = f10;
    }

    /* renamed from: k */
    public void m23629k(float f10) {
        this.f27706d = f10;
    }

    /* renamed from: l */
    public void m23630l(float f10) {
        this.f27708f = f10;
    }
}
