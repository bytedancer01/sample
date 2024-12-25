package p418y5;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import p364v5.C9246d;
import p398x5.AbstractC9668f;
import p398x5.AbstractC9669g;
import p398x5.C9664b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/m.class
 */
/* renamed from: y5.m */
/* loaded from: combined.jar:classes1.jar:y5/m.class */
public class C9837m extends AbstractC9669g {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y5/m$a.class
     */
    /* renamed from: y5.m$a */
    /* loaded from: combined.jar:classes1.jar:y5/m$a.class */
    public class a extends C9664b {

        /* renamed from: I */
        public final C9837m f45165I;

        public a(C9837m c9837m) {
            this.f45165I = c9837m;
            m40598C(0.0f);
        }

        @Override // p398x5.AbstractC9668f
        /* renamed from: r */
        public ValueAnimator mo40620r() {
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            C9246d c9246d = new C9246d(this);
            Float valueOf = Float.valueOf(0.0f);
            return c9246d.m38996l(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).m38987c(1400L).m38988d(fArr).m38986b();
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: N */
    public void mo40653N(AbstractC9668f... abstractC9668fArr) {
        super.mo40653N(abstractC9668fArr);
        abstractC9668fArr[1].m40622t(160);
        abstractC9668fArr[2].m40622t(320);
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: O */
    public AbstractC9668f[] mo40654O() {
        return new AbstractC9668f[]{new a(this), new a(this), new a(this)};
    }

    @Override // p398x5.AbstractC9669g, p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m40605a = m40605a(rect);
        int width = m40605a.width() / 8;
        int centerY = m40605a.centerY();
        int centerY2 = m40605a.centerY();
        for (int i10 = 0; i10 < m40651L(); i10++) {
            int width2 = ((m40605a.width() * i10) / 3) + m40605a.left;
            m40650K(i10).m40623v(width2, centerY - width, (width * 2) + width2, centerY2 + width);
        }
    }
}
