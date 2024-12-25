package gb;

import android.graphics.Canvas;
import android.os.Build;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gb/a.class
 */
/* renamed from: gb.a */
/* loaded from: combined.jar:classes2.jar:gb/a.class */
public class C4996a {
    /* renamed from: a */
    public static int m25162a(Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f10, f11, f12, f13, i10) : canvas.saveLayerAlpha(f10, f11, f12, f13, i10, 31);
    }
}
