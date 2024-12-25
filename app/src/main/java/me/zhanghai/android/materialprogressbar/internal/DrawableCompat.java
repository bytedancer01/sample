package me.zhanghai.android.materialprogressbar.internal;

import android.graphics.PorterDuff;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/internal/DrawableCompat.class
 */
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/internal/DrawableCompat.class */
public class DrawableCompat {
    public static PorterDuff.Mode parseTintMode(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
