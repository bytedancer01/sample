package p418y5;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import p364v5.C9246d;
import p398x5.C9665c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/l.class
 */
/* renamed from: y5.l */
/* loaded from: combined.jar:classes1.jar:y5/l.class */
public class C9836l extends C9665c {
    @Override // p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        m40624w(m40605a(rect));
    }

    @Override // p398x5.AbstractC9668f
    /* renamed from: r */
    public ValueAnimator mo40620r() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        return new C9246d(this).m38994j(fArr, 0, -180, -180).m38995k(fArr, 0, 0, -180).m38987c(1200L).m38988d(fArr).m38986b();
    }
}
