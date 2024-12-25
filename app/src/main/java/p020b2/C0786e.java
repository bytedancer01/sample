package p020b2;

import android.animation.TypeEvaluator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b2/e.class
 */
/* renamed from: b2.e */
/* loaded from: combined.jar:classes1.jar:b2/e.class */
public class C0786e implements TypeEvaluator {

    /* renamed from: a */
    public static final C0786e f5449a = new C0786e();

    /* renamed from: a */
    public static C0786e m5045a() {
        return f5449a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((intValue >> 24) & 255) / 255.0f;
        float f12 = ((intValue >> 16) & 255) / 255.0f;
        float f13 = ((intValue >> 8) & 255) / 255.0f;
        float f14 = (intValue & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f15 = ((intValue2 >> 24) & 255) / 255.0f;
        float f16 = ((intValue2 >> 16) & 255) / 255.0f;
        float f17 = ((intValue2 >> 8) & 255) / 255.0f;
        float f18 = (intValue2 & 255) / 255.0f;
        float pow = (float) Math.pow(f12, 2.2d);
        float pow2 = (float) Math.pow(f13, 2.2d);
        float pow3 = (float) Math.pow(f14, 2.2d);
        float pow4 = (float) Math.pow(f16, 2.2d);
        float pow5 = (float) Math.pow(f17, 2.2d);
        float pow6 = (float) Math.pow(f18, 2.2d);
        return Integer.valueOf((Math.round(((float) Math.pow(pow + ((pow4 - pow) * f10), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f11 + ((f15 - f11) * f10)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow2 + ((pow5 - pow2) * f10), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + (f10 * (pow6 - pow3)), 0.45454545454545453d)) * 255.0f));
    }
}
