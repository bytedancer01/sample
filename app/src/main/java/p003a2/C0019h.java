package p003a2;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/h.class
 */
/* renamed from: a2.h */
/* loaded from: combined.jar:classes1.jar:a2/h.class */
public class C0019h {
    /* renamed from: a */
    public static PropertyValuesHolder m105a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
