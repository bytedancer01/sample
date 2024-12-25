package p244o9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/q.class
 */
/* renamed from: o9.q */
/* loaded from: combined.jar:classes2.jar:o9/q.class */
public final class C6947q implements InterfaceC6931a {

    /* renamed from: a */
    public final C6952v f35901a;

    public C6947q(C6952v c6952v) {
        this.f35901a = c6952v;
    }

    @Override // p244o9.InterfaceC6931a
    /* renamed from: a */
    public final void mo29921a(Bitmap bitmap) {
        Bitmap bitmap2;
        C8015b c8015b = C6952v.f35905w;
        if (bitmap == null) {
            bitmap2 = null;
        } else {
            int width = bitmap.getWidth();
            float f10 = width;
            int i10 = (int) (((9.0f * f10) / 16.0f) + 0.5f);
            float f11 = (i10 - r0) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, bitmap.getHeight() + f11);
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = config;
            if (config == null) {
                config2 = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, i10, config2);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        this.f35901a.m31934p(bitmap2, 0);
    }
}
