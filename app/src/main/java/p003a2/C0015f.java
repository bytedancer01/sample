package p003a2;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/f.class
 */
/* renamed from: a2.f */
/* loaded from: combined.jar:classes1.jar:a2/f.class */
public class C0015f {
    /* renamed from: a */
    public static <T> ObjectAnimator m100a(T t10, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path);
    }
}
