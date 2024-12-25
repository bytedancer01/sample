package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/CircularProgressBackgroundDrawable.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/CircularProgressBackgroundDrawable.class */
class CircularProgressBackgroundDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow = true;

    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mShow) {
            super.draw(canvas);
        }
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShow;
    }

    @Override // me.zhanghai.android.materialprogressbar.BaseSingleCircularProgressDrawable
    public void onDrawRing(Canvas canvas, Paint paint) {
        drawRing(canvas, paint, 0.0f, 360.0f);
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z10) {
        if (this.mShow != z10) {
            this.mShow = z10;
            invalidateSelf();
        }
    }
}
