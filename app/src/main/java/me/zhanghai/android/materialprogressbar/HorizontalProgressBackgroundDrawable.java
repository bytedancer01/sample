package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/HorizontalProgressBackgroundDrawable.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/HorizontalProgressBackgroundDrawable.class */
class HorizontalProgressBackgroundDrawable extends BaseSingleHorizontalProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow;

    public HorizontalProgressBackgroundDrawable(Context context) {
        super(context);
        this.mShow = true;
    }

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

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z10) {
        if (this.mShow != z10) {
            this.mShow = z10;
            invalidateSelf();
        }
    }
}
