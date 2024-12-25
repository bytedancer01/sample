package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Path;
import android.util.Property;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/zhanghai/android/materialprogressbar/internal/ObjectAnimatorCompatLollipop.class
 */
@TargetApi(21)
/* loaded from: combined.jar:classes2.jar:me/zhanghai/android/materialprogressbar/internal/ObjectAnimatorCompatLollipop.class */
class ObjectAnimatorCompatLollipop {
    private ObjectAnimatorCompatLollipop() {
    }

    public static <T> ObjectAnimator ofArgb(T t10, Property<T, Integer> property, int... iArr) {
        return ObjectAnimator.ofArgb(t10, property, iArr);
    }

    public static ObjectAnimator ofArgb(Object obj, String str, int... iArr) {
        return ObjectAnimator.ofArgb(obj, str, iArr);
    }

    public static <T> ObjectAnimator ofFloat(T t10, Property<T, Float> property, Property<T, Float> property2, Path path) {
        return ObjectAnimator.ofFloat(t10, property, property2, path);
    }

    public static ObjectAnimator ofFloat(Object obj, String str, String str2, Path path) {
        return ObjectAnimator.ofFloat(obj, str, str2, path);
    }

    public static <T> ObjectAnimator ofInt(T t10, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        return ObjectAnimator.ofInt(t10, property, property2, path);
    }

    public static ObjectAnimator ofInt(Object obj, String str, String str2, Path path) {
        return ObjectAnimator.ofInt(obj, str, str2, path);
    }
}
