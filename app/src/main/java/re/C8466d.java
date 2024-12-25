package re;

import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:re/d.class
 */
/* renamed from: re.d */
/* loaded from: combined.jar:classes2.jar:re/d.class */
public final class C8466d extends C8701p {

    /* renamed from: c */
    public final float f39567c;

    /* renamed from: d */
    public final int f39568d;

    public C8466d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    public C8466d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f39567c = f12;
        this.f39568d = i10;
    }

    /* renamed from: f */
    public boolean m36370f(float f10, float f11, float f12) {
        if (Math.abs(f11 - m37223d()) > f10 || Math.abs(f12 - m37222c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f39567c);
        return abs <= 1.0f || abs <= this.f39567c;
    }

    /* renamed from: g */
    public C8466d m36371g(float f10, float f11, float f12) {
        int i10 = this.f39568d;
        int i11 = i10 + 1;
        float f13 = i11;
        return new C8466d(((i10 * m37222c()) + f11) / f13, ((this.f39568d * m37223d()) + f10) / f13, ((this.f39568d * this.f39567c) + f12) / f13, i11);
    }

    /* renamed from: h */
    public int m36372h() {
        return this.f39568d;
    }

    /* renamed from: i */
    public float m36373i() {
        return this.f39567c;
    }
}
