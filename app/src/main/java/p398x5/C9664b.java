package p398x5;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x5/b.class
 */
/* renamed from: x5.b */
/* loaded from: combined.jar:classes1.jar:x5/b.class */
public class C9664b extends AbstractC9667e {
    @Override // p398x5.AbstractC9667e
    /* renamed from: J */
    public void mo40591J(Canvas canvas, Paint paint) {
        if (m40606d() != null) {
            canvas.drawCircle(m40606d().centerX(), m40606d().centerY(), Math.min(m40606d().width(), m40606d().height()) / 2, paint);
        }
    }
}
