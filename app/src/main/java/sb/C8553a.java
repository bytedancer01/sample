package sb;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:sb/a.class
 */
/* renamed from: sb.a */
/* loaded from: combined.jar:classes2.jar:sb/a.class */
public final class C8553a {
    /* renamed from: a */
    public static float m36782a(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    /* renamed from: b */
    public static float m36783b(float f10, float f11, float f12, float f13, float f14, float f15) {
        return m36785d(m36782a(f10, f11, f12, f13), m36782a(f10, f11, f14, f13), m36782a(f10, f11, f14, f15), m36782a(f10, f11, f12, f15));
    }

    /* renamed from: c */
    public static float m36784c(float f10, float f11, float f12) {
        return ((1.0f - f12) * f10) + (f12 * f11);
    }

    /* renamed from: d */
    public static float m36785d(float f10, float f11, float f12, float f13) {
        if (f10 <= f11 || f10 <= f12 || f10 <= f13) {
            f10 = (f11 <= f12 || f11 <= f13) ? f12 > f13 ? f12 : f13 : f11;
        }
        return f10;
    }
}
