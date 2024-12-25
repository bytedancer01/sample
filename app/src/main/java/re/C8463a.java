package re;

import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:re/a.class
 */
/* renamed from: re.a */
/* loaded from: combined.jar:classes2.jar:re/a.class */
public final class C8463a extends C8701p {

    /* renamed from: c */
    public final float f39555c;

    public C8463a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f39555c = f12;
    }

    /* renamed from: f */
    public boolean m36353f(float f10, float f11, float f12) {
        if (Math.abs(f11 - m37223d()) > f10 || Math.abs(f12 - m37222c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f39555c);
        return abs <= 1.0f || abs <= this.f39555c;
    }

    /* renamed from: g */
    public C8463a m36354g(float f10, float f11, float f12) {
        return new C8463a((m37222c() + f11) / 2.0f, (m37223d() + f10) / 2.0f, (this.f39555c + f12) / 2.0f);
    }
}
