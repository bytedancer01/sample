package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.appcompat.widget.C0337n1;
import me.zhanghai.android.materialprogressbar.internal.DrawableCompat;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/MaterialProgressBar.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/MaterialProgressBar.class */
public class MaterialProgressBar extends ProgressBar {
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_DYNAMIC = 1;
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_NORMAL = 0;
    public static final int PROGRESS_STYLE_CIRCULAR = 0;
    public static final int PROGRESS_STYLE_HORIZONTAL = 1;
    private static final String TAG = MaterialProgressBar.class.getSimpleName();
    private int mProgressStyle;
    private TintInfo mProgressTintInfo;
    private boolean mSuperInitialized;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:me/zhanghai/android/materialprogressbar/MaterialProgressBar$TintInfo.class
     */
    /* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/MaterialProgressBar$TintInfo.class */
    public static class TintInfo {
        public boolean mHasIndeterminateTint;
        public boolean mHasIndeterminateTintMode;
        public boolean mHasProgressBackgroundTint;
        public boolean mHasProgressBackgroundTintMode;
        public boolean mHasProgressTint;
        public boolean mHasProgressTintMode;
        public boolean mHasSecondaryProgressTint;
        public boolean mHasSecondaryProgressTintMode;
        public ColorStateList mIndeterminateTint;
        public PorterDuff.Mode mIndeterminateTintMode;
        public ColorStateList mProgressBackgroundTint;
        public PorterDuff.Mode mProgressBackgroundTintMode;
        public ColorStateList mProgressTint;
        public PorterDuff.Mode mProgressTintMode;
        public ColorStateList mSecondaryProgressTint;
        public PorterDuff.Mode mSecondaryProgressTintMode;

        private TintInfo() {
        }
    }

    public MaterialProgressBar(Context context) {
        super(context);
        this.mSuperInitialized = true;
        this.mProgressTintInfo = new TintInfo();
        init(null, 0, 0);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSuperInitialized = true;
        this.mProgressTintInfo = new TintInfo();
        init(attributeSet, 0, 0);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mSuperInitialized = true;
        this.mProgressTintInfo = new TintInfo();
        init(attributeSet, i10, 0);
    }

    @TargetApi(21)
    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mSuperInitialized = true;
        this.mProgressTintInfo = new TintInfo();
        init(attributeSet, i10, i11);
    }

    private void applyIndeterminateTint() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        TintInfo tintInfo = this.mProgressTintInfo;
        if (tintInfo.mHasIndeterminateTint || tintInfo.mHasIndeterminateTintMode) {
            indeterminateDrawable.mutate();
            TintInfo tintInfo2 = this.mProgressTintInfo;
            applyTintForDrawable(indeterminateDrawable, tintInfo2.mIndeterminateTint, tintInfo2.mHasIndeterminateTint, tintInfo2.mIndeterminateTintMode, tintInfo2.mHasIndeterminateTintMode);
        }
    }

    private void applyPrimaryProgressTint() {
        Drawable tintTargetFromProgressDrawable;
        if (getProgressDrawable() == null) {
            return;
        }
        TintInfo tintInfo = this.mProgressTintInfo;
        if ((tintInfo.mHasProgressTint || tintInfo.mHasProgressTintMode) && (tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(android.R.id.progress, true)) != null) {
            TintInfo tintInfo2 = this.mProgressTintInfo;
            applyTintForDrawable(tintTargetFromProgressDrawable, tintInfo2.mProgressTint, tintInfo2.mHasProgressTint, tintInfo2.mProgressTintMode, tintInfo2.mHasProgressTintMode);
        }
    }

    private void applyProgressBackgroundTint() {
        Drawable tintTargetFromProgressDrawable;
        if (getProgressDrawable() == null) {
            return;
        }
        TintInfo tintInfo = this.mProgressTintInfo;
        if ((tintInfo.mHasProgressBackgroundTint || tintInfo.mHasProgressBackgroundTintMode) && (tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(android.R.id.background, false)) != null) {
            TintInfo tintInfo2 = this.mProgressTintInfo;
            applyTintForDrawable(tintTargetFromProgressDrawable, tintInfo2.mProgressBackgroundTint, tintInfo2.mHasProgressBackgroundTint, tintInfo2.mProgressBackgroundTintMode, tintInfo2.mHasProgressBackgroundTintMode);
        }
    }

    private void applyProgressTints() {
        if (getProgressDrawable() == null) {
            return;
        }
        applyPrimaryProgressTint();
        applyProgressBackgroundTint();
        applySecondaryProgressTint();
    }

    private void applySecondaryProgressTint() {
        Drawable tintTargetFromProgressDrawable;
        if (getProgressDrawable() == null) {
            return;
        }
        TintInfo tintInfo = this.mProgressTintInfo;
        if ((tintInfo.mHasSecondaryProgressTint || tintInfo.mHasSecondaryProgressTintMode) && (tintTargetFromProgressDrawable = getTintTargetFromProgressDrawable(android.R.id.secondaryProgress, false)) != null) {
            TintInfo tintInfo2 = this.mProgressTintInfo;
            applyTintForDrawable(tintTargetFromProgressDrawable, tintInfo2.mSecondaryProgressTint, tintInfo2.mHasSecondaryProgressTint, tintInfo2.mSecondaryProgressTintMode, tintInfo2.mHasSecondaryProgressTintMode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    private void applyTintForDrawable(Drawable drawable, ColorStateList colorStateList, boolean z10, PorterDuff.Mode mode, boolean z11) {
        if (z10 || z11) {
            if (z10) {
                if (drawable instanceof TintableDrawable) {
                    ((TintableDrawable) drawable).setTintList(colorStateList);
                } else {
                    Log.w(TAG, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    drawable.setTintList(colorStateList);
                }
            }
            if (z11) {
                if (drawable instanceof TintableDrawable) {
                    ((TintableDrawable) drawable).setTintMode(mode);
                } else {
                    Log.w(TAG, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    private void fixCanvasScalingAndColorFilterWhenHardwareAccelerated() {
    }

    private Drawable getTintTargetFromProgressDrawable(int i10, boolean z10) {
        Drawable progressDrawable = getProgressDrawable();
        Drawable drawable = null;
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        if (progressDrawable instanceof LayerDrawable) {
            drawable = ((LayerDrawable) progressDrawable).findDrawableByLayerId(i10);
        }
        if (drawable == null && z10) {
            drawable = progressDrawable;
        }
        return drawable;
    }

    private void init(AttributeSet attributeSet, int i10, int i11) {
        Drawable circularProgressDrawable;
        Context context = getContext();
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, C6586R.styleable.MaterialProgressBar, i10, i11);
        this.mProgressStyle = m1505v.m1516k(C6586R.styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean m1506a = m1505v.m1506a(C6586R.styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean m1506a2 = m1505v.m1506a(C6586R.styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean m1506a3 = m1505v.m1506a(C6586R.styleable.MaterialProgressBar_mpb_showProgressBackground, this.mProgressStyle == 1);
        int m1516k = m1505v.m1516k(C6586R.styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        int i12 = C6586R.styleable.MaterialProgressBar_mpb_progressTint;
        if (m1505v.m1524s(i12)) {
            this.mProgressTintInfo.mProgressTint = m1505v.m1508c(i12);
            this.mProgressTintInfo.mHasProgressTint = true;
        }
        int i13 = C6586R.styleable.MaterialProgressBar_mpb_progressTintMode;
        if (m1505v.m1524s(i13)) {
            this.mProgressTintInfo.mProgressTintMode = DrawableCompat.parseTintMode(m1505v.m1516k(i13, -1), null);
            this.mProgressTintInfo.mHasProgressTintMode = true;
        }
        int i14 = C6586R.styleable.MaterialProgressBar_mpb_secondaryProgressTint;
        if (m1505v.m1524s(i14)) {
            this.mProgressTintInfo.mSecondaryProgressTint = m1505v.m1508c(i14);
            this.mProgressTintInfo.mHasSecondaryProgressTint = true;
        }
        int i15 = C6586R.styleable.MaterialProgressBar_mpb_secondaryProgressTintMode;
        if (m1505v.m1524s(i15)) {
            this.mProgressTintInfo.mSecondaryProgressTintMode = DrawableCompat.parseTintMode(m1505v.m1516k(i15, -1), null);
            this.mProgressTintInfo.mHasSecondaryProgressTintMode = true;
        }
        int i16 = C6586R.styleable.MaterialProgressBar_mpb_progressBackgroundTint;
        if (m1505v.m1524s(i16)) {
            this.mProgressTintInfo.mProgressBackgroundTint = m1505v.m1508c(i16);
            this.mProgressTintInfo.mHasProgressBackgroundTint = true;
        }
        int i17 = C6586R.styleable.MaterialProgressBar_mpb_progressBackgroundTintMode;
        if (m1505v.m1524s(i17)) {
            this.mProgressTintInfo.mProgressBackgroundTintMode = DrawableCompat.parseTintMode(m1505v.m1516k(i17, -1), null);
            this.mProgressTintInfo.mHasProgressBackgroundTintMode = true;
        }
        int i18 = C6586R.styleable.MaterialProgressBar_mpb_indeterminateTint;
        if (m1505v.m1524s(i18)) {
            this.mProgressTintInfo.mIndeterminateTint = m1505v.m1508c(i18);
            this.mProgressTintInfo.mHasIndeterminateTint = true;
        }
        int i19 = C6586R.styleable.MaterialProgressBar_mpb_indeterminateTintMode;
        if (m1505v.m1524s(i19)) {
            this.mProgressTintInfo.mIndeterminateTintMode = DrawableCompat.parseTintMode(m1505v.m1516k(i19, -1), null);
            this.mProgressTintInfo.mHasIndeterminateTintMode = true;
        }
        m1505v.m1525w();
        int i20 = this.mProgressStyle;
        if (i20 == 0) {
            if ((isIndeterminate() || m1506a) && !isInEditMode()) {
                setIndeterminateDrawable(new IndeterminateCircularProgressDrawable(context));
            }
            if (!isIndeterminate() || m1506a) {
                circularProgressDrawable = new CircularProgressDrawable(m1516k, context);
                setProgressDrawable(circularProgressDrawable);
            }
        } else {
            if (i20 != 1) {
                throw new IllegalArgumentException("Unknown progress style: " + this.mProgressStyle);
            }
            if ((isIndeterminate() || m1506a) && !isInEditMode()) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!isIndeterminate() || m1506a) {
                circularProgressDrawable = new HorizontalProgressDrawable(context);
                setProgressDrawable(circularProgressDrawable);
            }
        }
        setUseIntrinsicPadding(m1506a2);
        setShowProgressBackground(m1506a3);
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    public ColorStateList getIndeterminateTintList() {
        return this.mProgressTintInfo.mIndeterminateTint;
    }

    @Override // android.widget.ProgressBar
    public PorterDuff.Mode getIndeterminateTintMode() {
        return this.mProgressTintInfo.mIndeterminateTintMode;
    }

    @Override // android.widget.ProgressBar
    public ColorStateList getProgressBackgroundTintList() {
        return this.mProgressTintInfo.mProgressBackgroundTint;
    }

    @Override // android.widget.ProgressBar
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        return this.mProgressTintInfo.mProgressBackgroundTintMode;
    }

    public int getProgressStyle() {
        return this.mProgressStyle;
    }

    @Override // android.widget.ProgressBar
    public ColorStateList getProgressTintList() {
        return this.mProgressTintInfo.mProgressTint;
    }

    @Override // android.widget.ProgressBar
    public PorterDuff.Mode getProgressTintMode() {
        return this.mProgressTintInfo.mProgressTintMode;
    }

    @Override // android.widget.ProgressBar
    public ColorStateList getSecondaryProgressTintList() {
        return this.mProgressTintInfo.mSecondaryProgressTint;
    }

    @Override // android.widget.ProgressBar
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        return this.mProgressTintInfo.mSecondaryProgressTintMode;
    }

    public boolean getShowProgressBackground() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof ShowBackgroundDrawable) {
            return ((ShowBackgroundDrawable) currentDrawable).getShowBackground();
        }
        return false;
    }

    public boolean getUseIntrinsicPadding() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof IntrinsicPaddingDrawable) {
            return ((IntrinsicPaddingDrawable) currentDrawable).getUseIntrinsicPadding();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fixCanvasScalingAndColorFilterWhenHardwareAccelerated();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminate(boolean z10) {
        synchronized (this) {
            super.setIndeterminate(z10);
            if (this.mSuperInitialized && !(getCurrentDrawable() instanceof MaterialProgressDrawable)) {
                Log.w(TAG, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.mProgressTintInfo != null) {
            applyIndeterminateTint();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mIndeterminateTint = colorStateList;
        tintInfo.mHasIndeterminateTint = true;
        applyIndeterminateTint();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mIndeterminateTintMode = mode;
        tintInfo.mHasIndeterminateTintMode = true;
        applyIndeterminateTint();
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressBackgroundTint = colorStateList;
        tintInfo.mHasProgressBackgroundTint = true;
        applyProgressBackgroundTint();
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressBackgroundTintMode = mode;
        tintInfo.mHasProgressBackgroundTintMode = true;
        applyProgressBackgroundTint();
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.mProgressTintInfo != null) {
            applyProgressTints();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressTint = colorStateList;
        tintInfo.mHasProgressTint = true;
        applyPrimaryProgressTint();
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintMode(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mProgressTintMode = mode;
        tintInfo.mHasProgressTintMode = true;
        applyPrimaryProgressTint();
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(ColorStateList colorStateList) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mSecondaryProgressTint = colorStateList;
        tintInfo.mHasSecondaryProgressTint = true;
        applySecondaryProgressTint();
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.mProgressTintInfo;
        tintInfo.mSecondaryProgressTintMode = mode;
        tintInfo.mHasSecondaryProgressTintMode = true;
        applySecondaryProgressTint();
    }

    public void setShowProgressBackground(boolean z10) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable) currentDrawable).setShowBackground(z10);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof ShowBackgroundDrawable) {
            ((ShowBackgroundDrawable) indeterminateDrawable).setShowBackground(z10);
        }
    }

    public void setUseIntrinsicPadding(boolean z10) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable) currentDrawable).setUseIntrinsicPadding(z10);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof IntrinsicPaddingDrawable) {
            ((IntrinsicPaddingDrawable) indeterminateDrawable).setUseIntrinsicPadding(z10);
        }
    }
}
