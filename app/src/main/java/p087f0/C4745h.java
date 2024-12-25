package p087f0;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/h.class
 */
/* renamed from: f0.h */
/* loaded from: combined.jar:classes1.jar:f0/h.class */
public class C4745h extends C4744g {
    @Override // p087f0.C4744g
    /* renamed from: h */
    public Typeface mo24017h(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f27987g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f27993m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p087f0.C4744g
    /* renamed from: t */
    public Method mo24026t(Class<?> cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
