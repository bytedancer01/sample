package p418y5;

import android.animation.ValueAnimator;
import p364v5.C9246d;
import p379w5.InterpolatorC9418b;
import p398x5.C9666d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/j.class
 */
/* renamed from: y5.j */
/* loaded from: combined.jar:classes1.jar:y5/j.class */
public class C9834j extends C9666d {
    public C9834j() {
        m40598C(0.0f);
    }

    @Override // p398x5.AbstractC9668f
    /* renamed from: r */
    public ValueAnimator mo40620r() {
        float[] fArr = {0.0f, 0.7f, 1.0f};
        C9246d c9246d = new C9246d(this);
        Float valueOf = Float.valueOf(1.0f);
        return c9246d.m38996l(fArr, Float.valueOf(0.0f), valueOf, valueOf).m38985a(fArr, 255, 178, 0).m38987c(1000L).m38992h(InterpolatorC9418b.m39771b(0.21f, 0.53f, 0.56f, 0.8f, fArr)).m38986b();
    }
}
