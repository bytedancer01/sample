package p418y5;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import p364v5.C9246d;
import p398x5.AbstractC9668f;
import p398x5.AbstractC9669g;
import p398x5.C9664b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/a.class
 */
/* renamed from: y5.a */
/* loaded from: combined.jar:classes1.jar:y5/a.class */
public class C9825a extends AbstractC9669g {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y5/a$a.class
     */
    /* renamed from: y5.a$a */
    /* loaded from: combined.jar:classes1.jar:y5/a$a.class */
    public class a extends C9664b {

        /* renamed from: I */
        public final C9825a f45158I;

        public a(C9825a c9825a) {
            this.f45158I = c9825a;
            m40598C(0.0f);
        }

        @Override // p398x5.AbstractC9668f
        /* renamed from: r */
        public ValueAnimator mo40620r() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            C9246d c9246d = new C9246d(this);
            Float valueOf = Float.valueOf(0.0f);
            return c9246d.m38996l(fArr, valueOf, Float.valueOf(1.0f), valueOf).m38987c(2000L).m38988d(fArr).m38986b();
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: N */
    public void mo40653N(AbstractC9668f... abstractC9668fArr) {
        AbstractC9668f abstractC9668f;
        int i10;
        super.mo40653N(abstractC9668fArr);
        if (Build.VERSION.SDK_INT >= 24) {
            abstractC9668f = abstractC9668fArr[1];
            i10 = 1000;
        } else {
            abstractC9668f = abstractC9668fArr[1];
            i10 = -1000;
        }
        abstractC9668f.m40622t(i10);
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: O */
    public AbstractC9668f[] mo40654O() {
        return new AbstractC9668f[]{new a(this), new a(this)};
    }

    @Override // p398x5.AbstractC9669g, p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m40605a = m40605a(rect);
        int width = (int) (m40605a.width() * 0.6f);
        AbstractC9668f m40650K = m40650K(0);
        int i10 = m40605a.right;
        int i11 = m40605a.top;
        m40650K.m40623v(i10 - width, i11, i10, i11 + width);
        AbstractC9668f m40650K2 = m40650K(1);
        int i12 = m40605a.right;
        int i13 = m40605a.bottom;
        m40650K2.m40623v(i12 - width, i13 - width, i12, i13);
    }

    @Override // p398x5.AbstractC9669g, p398x5.AbstractC9668f
    /* renamed from: r */
    public ValueAnimator mo40620r() {
        return new C9246d(this).m38993i(new float[]{0.0f, 1.0f}, 0, 360).m38987c(2000L).m38992h(new LinearInterpolator()).m38986b();
    }
}
