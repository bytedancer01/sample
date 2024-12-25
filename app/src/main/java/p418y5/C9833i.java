package p418y5;

import android.animation.ValueAnimator;
import p364v5.C9246d;
import p398x5.C9664b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/i.class
 */
/* renamed from: y5.i */
/* loaded from: combined.jar:classes1.jar:y5/i.class */
public class C9833i extends C9664b {
    public C9833i() {
        m40598C(0.0f);
    }

    @Override // p398x5.AbstractC9668f
    /* renamed from: r */
    public ValueAnimator mo40620r() {
        float[] fArr = {0.0f, 1.0f};
        return new C9246d(this).m38996l(fArr, Float.valueOf(0.0f), Float.valueOf(1.0f)).m38985a(fArr, 255, 0).m38987c(1000L).m38988d(fArr).m38986b();
    }
}
