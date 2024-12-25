package p275q;

import android.graphics.drawable.Drawable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q/e.class
 */
/* renamed from: q.e */
/* loaded from: combined.jar:classes1.jar:q/e.class */
public class C7743e extends Drawable {

    /* renamed from: a */
    public static final double f37558a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m33835a(float f10, float f11, boolean z10) {
        float f12 = f10;
        if (z10) {
            f12 = (float) (f10 + ((1.0d - f37558a) * f11));
        }
        return f12;
    }

    /* renamed from: b */
    public static float m33836b(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        float f13 = f12;
        if (z10) {
            f13 = (float) (f12 + ((1.0d - f37558a) * f11));
        }
        return f13;
    }
}
