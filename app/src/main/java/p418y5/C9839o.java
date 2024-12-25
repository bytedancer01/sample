package p418y5;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import p364v5.C9246d;
import p398x5.AbstractC9668f;
import p398x5.AbstractC9669g;
import p398x5.C9665c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/o.class
 */
/* renamed from: y5.o */
/* loaded from: combined.jar:classes1.jar:y5/o.class */
public class C9839o extends AbstractC9669g {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y5/o$a.class
     */
    /* renamed from: y5.o$a */
    /* loaded from: combined.jar:classes1.jar:y5/o$a.class */
    public class a extends C9665c {

        /* renamed from: I */
        public final C9839o f45168I;

        public a(C9839o c9839o) {
            this.f45168I = c9839o;
            m40600E(0.4f);
        }

        @Override // p398x5.AbstractC9668f
        /* renamed from: r */
        public ValueAnimator mo40620r() {
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            C9246d c9246d = new C9246d(this);
            Float valueOf = Float.valueOf(0.4f);
            return c9246d.m38997m(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).m38987c(1200L).m38988d(fArr).m38986b();
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: O */
    public AbstractC9668f[] mo40654O() {
        a[] aVarArr = new a[5];
        for (int i10 = 0; i10 < 5; i10++) {
            a aVar = new a(this);
            aVarArr[i10] = aVar;
            aVar.m40622t(Build.VERSION.SDK_INT >= 24 ? (i10 * 100) + 600 : (i10 * 100) - 1200);
        }
        return aVarArr;
    }

    @Override // p398x5.AbstractC9669g, p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m40605a = m40605a(rect);
        int width = m40605a.width() / m40651L();
        int width2 = ((m40605a.width() / 5) * 3) / 5;
        for (int i10 = 0; i10 < m40651L(); i10++) {
            AbstractC9668f m40650K = m40650K(i10);
            int i11 = m40605a.left + (i10 * width) + (width / 5);
            m40650K.m40623v(i11, m40605a.top, i11 + width2, m40605a.bottom);
        }
    }
}
