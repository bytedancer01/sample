package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.achartengine.renderer.DefaultRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/BasePaintDrawable.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/BasePaintDrawable.class */
abstract class BasePaintDrawable extends BaseDrawable {
    private Paint mPaint;

    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable
    public final void onDraw(Canvas canvas, int i10, int i11) {
        if (this.mPaint == null) {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(DefaultRenderer.BACKGROUND_COLOR);
            onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(getColorFilterForDrawing());
        onDraw(canvas, i10, i11, this.mPaint);
    }

    public abstract void onDraw(Canvas canvas, int i10, int i11, Paint paint);

    public abstract void onPreparePaint(Paint paint);
}
