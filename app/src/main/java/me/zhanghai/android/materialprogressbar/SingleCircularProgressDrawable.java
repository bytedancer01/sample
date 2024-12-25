package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/SingleCircularProgressDrawable.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/SingleCircularProgressDrawable.class */
class SingleCircularProgressDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    public SingleCircularProgressDrawable(int i10) {
        float f10;
        if (i10 == 0) {
            f10 = 0.0f;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Invalid value for style");
            }
            f10 = 360.0f;
        }
        this.mStartAngleMax = f10;
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override // me.zhanghai.android.materialprogressbar.BaseSingleCircularProgressDrawable
    public void onDrawRing(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        float f10 = level / 10000.0f;
        float f11 = this.mStartAngleMax * f10;
        float f12 = f10 * 360.0f;
        drawRing(canvas, paint, f11, f12);
        if (this.mShowBackground) {
            drawRing(canvas, paint, f11, f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        invalidateSelf();
        return true;
    }

    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z10) {
        if (this.mShowBackground != z10) {
            this.mShowBackground = z10;
            invalidateSelf();
        }
    }
}
