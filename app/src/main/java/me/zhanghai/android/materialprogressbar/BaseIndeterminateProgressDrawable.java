package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;
import org.achartengine.renderer.DefaultRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/BaseIndeterminateProgressDrawable.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/BaseIndeterminateProgressDrawable.class */
abstract class BaseIndeterminateProgressDrawable extends BaseProgressDrawable implements Animatable {
    public Animator[] mAnimators;

    @SuppressLint({"NewApi"})
    public BaseIndeterminateProgressDrawable(Context context) {
        setTint(ThemeUtils.getColorFromAttrRes(C6586R.attr.colorControlActivated, DefaultRenderer.BACKGROUND_COLOR, context));
    }

    private boolean isStarted() {
        for (Animator animator : this.mAnimators) {
            if (animator.isStarted()) {
                return true;
            }
        }
        return false;
    }

    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        for (Animator animator : this.mAnimators) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isStarted()) {
            return;
        }
        for (Animator animator : this.mAnimators) {
            animator.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        for (Animator animator : this.mAnimators) {
            animator.end();
        }
    }
}
