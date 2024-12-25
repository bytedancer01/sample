package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/BaseDrawable.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/BaseDrawable.class */
abstract class BaseDrawable extends Drawable implements TintableDrawable {
    public ColorFilter mColorFilter;
    public PorterDuffColorFilter mTintFilter;
    public ColorStateList mTintList;
    public int mAlpha = 255;
    public PorterDuff.Mode mTintMode = PorterDuff.Mode.SRC_IN;
    private DummyConstantState mConstantState = new DummyConstantState();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:me/zhanghai/android/materialprogressbar/BaseDrawable$DummyConstantState.class
     */
    /* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/BaseDrawable$DummyConstantState.class */
    public class DummyConstantState extends Drawable.ConstantState {
        public final BaseDrawable this$0;

        private DummyConstantState(BaseDrawable baseDrawable) {
            this.this$0 = baseDrawable;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return this.this$0;
        }
    }

    private boolean updateTintFilter() {
        ColorStateList colorStateList = this.mTintList;
        boolean z10 = true;
        if (colorStateList != null && this.mTintMode != null) {
            this.mTintFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.mTintMode);
            return true;
        }
        if (this.mTintFilter == null) {
            z10 = false;
        }
        this.mTintFilter = null;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        onDraw(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    public ColorFilter getColorFilterForDrawing() {
        ColorFilter colorFilter = this.mColorFilter;
        if (colorFilter == null) {
            colorFilter = this.mTintFilter;
        }
        return colorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.mConstantState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.mTintList;
        return colorStateList != null && colorStateList.isStateful();
    }

    public abstract void onDraw(Canvas canvas, int i10, int i11);

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return updateTintFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.mAlpha != i10) {
            this.mAlpha = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mColorFilter = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        if (updateTintFilter()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        if (updateTintFilter()) {
            invalidateSelf();
        }
    }
}
