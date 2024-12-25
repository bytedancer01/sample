package me.zhanghai.android.materialprogressbar;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/BaseProgressDrawable.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/BaseProgressDrawable.class */
abstract class BaseProgressDrawable extends BasePaintDrawable implements IntrinsicPaddingDrawable {
    public boolean mUseIntrinsicPadding = true;

    @Override // me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public boolean getUseIntrinsicPadding() {
        return this.mUseIntrinsicPadding;
    }

    @Override // me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public void setUseIntrinsicPadding(boolean z10) {
        if (this.mUseIntrinsicPadding != z10) {
            this.mUseIntrinsicPadding = z10;
            invalidateSelf();
        }
    }
}
