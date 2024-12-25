package p418y5;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;
import p364v5.C9246d;
import p398x5.AbstractC9668f;
import p398x5.AbstractC9669g;
import p398x5.C9665c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y5/f.class
 */
/* renamed from: y5.f */
/* loaded from: combined.jar:classes1.jar:y5/f.class */
public class C9830f extends AbstractC9669g {

    /* renamed from: H */
    public boolean f45163H = false;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:y5/f$a.class
     */
    /* renamed from: y5.f$a */
    /* loaded from: combined.jar:classes1.jar:y5/f$a.class */
    public class a extends C9665c {

        /* renamed from: I */
        public final C9830f f45164I;

        public a(C9830f c9830f) {
            this.f45164I = c9830f;
            setAlpha(0);
            m40596A(-180);
        }

        @Override // p398x5.AbstractC9668f
        /* renamed from: r */
        public ValueAnimator mo40620r() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            return new C9246d(this).m38985a(fArr, 0, 0, 255, 255, 0, 0).m38994j(fArr, -180, -180, 0, 0, 0, 0).m38995k(fArr, 0, 0, 0, 0, 180, 180).m38987c(2400L).m38992h(new LinearInterpolator()).m38986b();
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: J */
    public void mo40590J(Canvas canvas) {
        Rect m40605a = m40605a(getBounds());
        for (int i10 = 0; i10 < m40651L(); i10++) {
            int save = canvas.save();
            canvas.rotate((i10 * 90) + 45, m40605a.centerX(), m40605a.centerY());
            m40650K(i10).draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // p398x5.AbstractC9669g
    /* renamed from: O */
    public AbstractC9668f[] mo40654O() {
        a[] aVarArr = new a[4];
        for (int i10 = 0; i10 < 4; i10++) {
            a aVar = new a(this);
            aVarArr[i10] = aVar;
            aVar.m40622t(Build.VERSION.SDK_INT >= 24 ? i10 * 300 : (i10 * 300) - 1200);
        }
        return aVarArr;
    }

    @Override // p398x5.AbstractC9669g, p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m40605a = m40605a(rect);
        int min = Math.min(m40605a.width(), m40605a.height());
        Rect rect2 = m40605a;
        if (this.f45163H) {
            min = (int) Math.sqrt((r0 * r0) / 2);
            int width = (m40605a.width() - min) / 2;
            int height = (m40605a.height() - min) / 2;
            rect2 = new Rect(m40605a.left + width, m40605a.top + height, m40605a.right - width, m40605a.bottom - height);
        }
        int i10 = rect2.left;
        int i11 = min / 2;
        int i12 = rect2.top;
        for (int i13 = 0; i13 < m40651L(); i13++) {
            AbstractC9668f m40650K = m40650K(i13);
            m40650K.m40623v(rect2.left, rect2.top, i10 + i11 + 1, i12 + i11 + 1);
            m40650K.m40625x(m40650K.m40606d().right);
            m40650K.m40626y(m40650K.m40606d().bottom);
        }
    }
}
