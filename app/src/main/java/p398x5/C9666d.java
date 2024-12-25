package p398x5;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x5/d.class
 */
/* renamed from: x5.d */
/* loaded from: combined.jar:classes1.jar:x5/d.class */
public class C9666d extends AbstractC9667e {
    @Override // p398x5.AbstractC9667e
    /* renamed from: J */
    public void mo40591J(Canvas canvas, Paint paint) {
        if (m40606d() != null) {
            paint.setStyle(Paint.Style.STROKE);
            int min = Math.min(m40606d().width(), m40606d().height()) / 2;
            paint.setStrokeWidth(min / 12);
            canvas.drawCircle(m40606d().centerX(), m40606d().centerY(), min, paint);
        }
    }
}
