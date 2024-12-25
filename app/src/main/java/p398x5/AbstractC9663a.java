package p398x5;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x5/a.class
 */
/* renamed from: x5.a */
/* loaded from: combined.jar:classes1.jar:x5/a.class */
public abstract class AbstractC9663a extends AbstractC9669g {
    @Override // p398x5.AbstractC9669g
    /* renamed from: J */
    public void mo40590J(Canvas canvas) {
        for (int i10 = 0; i10 < m40651L(); i10++) {
            AbstractC9668f m40650K = m40650K(i10);
            int save = canvas.save();
            canvas.rotate((i10 * 360) / m40651L(), getBounds().centerX(), getBounds().centerY());
            m40650K.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // p398x5.AbstractC9669g, p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m40605a = m40605a(rect);
        int width = (int) (((m40605a.width() * 3.141592653589793d) / 3.5999999046325684d) / m40651L());
        int centerX = m40605a.centerX();
        int centerX2 = m40605a.centerX();
        for (int i10 = 0; i10 < m40651L(); i10++) {
            AbstractC9668f m40650K = m40650K(i10);
            int i11 = m40605a.top;
            m40650K.m40623v(centerX - width, i11, centerX2 + width, (width * 2) + i11);
        }
    }
}
