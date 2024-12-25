package td;

import ae.C0156a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:td/p.class
 */
/* renamed from: td.p */
/* loaded from: combined.jar:classes2.jar:td/p.class */
public class C8701p {

    /* renamed from: a */
    public final float f40485a;

    /* renamed from: b */
    public final float f40486b;

    public C8701p(float f10, float f11) {
        this.f40485a = f10;
        this.f40486b = f11;
    }

    /* renamed from: a */
    public static float m37219a(C8701p c8701p, C8701p c8701p2, C8701p c8701p3) {
        float f10 = c8701p2.f40485a;
        float f11 = c8701p2.f40486b;
        return ((c8701p3.f40485a - f10) * (c8701p.f40486b - f11)) - ((c8701p3.f40486b - f11) * (c8701p.f40485a - f10));
    }

    /* renamed from: b */
    public static float m37220b(C8701p c8701p, C8701p c8701p2) {
        return C0156a.m675a(c8701p.f40485a, c8701p.f40486b, c8701p2.f40485a, c8701p2.f40486b);
    }

    /* renamed from: e */
    public static void m37221e(C8701p[] c8701pArr) {
        C8701p c8701p;
        C8701p c8701p2;
        C8701p c8701p3;
        float m37220b = m37220b(c8701pArr[0], c8701pArr[1]);
        float m37220b2 = m37220b(c8701pArr[1], c8701pArr[2]);
        float m37220b3 = m37220b(c8701pArr[0], c8701pArr[2]);
        if (m37220b2 >= m37220b && m37220b2 >= m37220b3) {
            c8701p = c8701pArr[0];
            c8701p2 = c8701pArr[1];
            c8701p3 = c8701pArr[2];
        } else if (m37220b3 < m37220b2 || m37220b3 < m37220b) {
            c8701p = c8701pArr[2];
            c8701p2 = c8701pArr[0];
            c8701p3 = c8701pArr[1];
        } else {
            c8701p = c8701pArr[1];
            c8701p2 = c8701pArr[0];
            c8701p3 = c8701pArr[2];
        }
        C8701p c8701p4 = c8701p2;
        C8701p c8701p5 = c8701p3;
        if (m37219a(c8701p2, c8701p, c8701p3) < 0.0f) {
            c8701p5 = c8701p2;
            c8701p4 = c8701p3;
        }
        c8701pArr[0] = c8701p4;
        c8701pArr[1] = c8701p;
        c8701pArr[2] = c8701p5;
    }

    /* renamed from: c */
    public final float m37222c() {
        return this.f40485a;
    }

    /* renamed from: d */
    public final float m37223d() {
        return this.f40486b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8701p)) {
            return false;
        }
        C8701p c8701p = (C8701p) obj;
        return this.f40485a == c8701p.f40485a && this.f40486b == c8701p.f40486b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f40485a) * 31) + Float.floatToIntBits(this.f40486b);
    }

    public final String toString() {
        return "(" + this.f40485a + ',' + this.f40486b + ')';
    }
}
