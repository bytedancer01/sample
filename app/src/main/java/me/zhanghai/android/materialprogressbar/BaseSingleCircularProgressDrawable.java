package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/BaseSingleCircularProgressDrawable.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/BaseSingleCircularProgressDrawable.class */
abstract class BaseSingleCircularProgressDrawable extends BaseProgressDrawable {
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    public void drawRing(Canvas canvas, Paint paint, float f10, float f11) {
        canvas.drawArc(RECT_PROGRESS, f10 - 90.0f, f11, false, paint);
    }

    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onDraw(Canvas canvas, int i10, int i11, Paint paint) {
        float f10 = i10;
        RectF rectF = this.mUseIntrinsicPadding ? RECT_PADDED_BOUND : RECT_BOUND;
        canvas.scale(f10 / rectF.width(), i11 / rectF.height());
        canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        onDrawRing(canvas, paint);
    }

    public abstract void onDrawRing(Canvas canvas, Paint paint);

    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onPreparePaint(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }
}
