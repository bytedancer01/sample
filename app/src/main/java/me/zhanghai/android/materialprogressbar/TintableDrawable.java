package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/TintableDrawable.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/TintableDrawable.class */
public interface TintableDrawable {
    void setTint(int i10);

    void setTintList(ColorStateList colorStateList);

    void setTintMode(PorterDuff.Mode mode);
}
