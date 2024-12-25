package p418y5;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import p364v5.C9246d;
import p398x5.AbstractC9668f;
import p398x5.AbstractC9669g;
import p398x5.C9665c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/c.class
 */
/* renamed from: y5.c */
/* loaded from: combined.jar:classes1.jar:y5/c.class */
public class C9827c extends AbstractC9669g {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y5/c$b.class
     */
    /* renamed from: y5.c$b */
    /* loaded from: combined.jar:classes1.jar:y5/c$b.class */
    public class b extends C9665c {

        /* renamed from: I */
        public final C9827c f45160I;

        public b(C9827c c9827c) {
            this.f45160I = c9827c;
        }

        @Override // p398x5.AbstractC9668f
        /* renamed from: r */
        public ValueAnimator mo40620r() {
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            C9246d c9246d = new C9246d(this);
            Float valueOf = Float.valueOf(1.0f);
            return c9246d.m38996l(fArr, valueOf, Float.valueOf(0.0f), valueOf, valueOf).m38987c(1300L).m38988d(fArr).m38986b();
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: O */
    public AbstractC9668f[] mo40654O() {
        b[] bVarArr = new b[9];
        for (int i10 = 0; i10 < 9; i10++) {
            b bVar = new b();
            bVarArr[i10] = bVar;
            bVar.m40622t(new int[]{200, 300, 400, 100, 200, 300, 0, 100, 200}[i10]);
        }
        return bVarArr;
    }

    @Override // p398x5.AbstractC9669g, p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m40605a = m40605a(rect);
        int width = (int) (m40605a.width() * 0.33f);
        int height = (int) (m40605a.height() * 0.33f);
        for (int i10 = 0; i10 < m40651L(); i10++) {
            int i11 = m40605a.left + ((i10 % 3) * width);
            int i12 = m40605a.top + ((i10 / 3) * height);
            m40650K(i10).m40623v(i11, i12, i11 + width, i12 + height);
        }
    }
}
