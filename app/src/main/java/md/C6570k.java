package md;

import java.lang.reflect.Type;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/k.class
 */
/* renamed from: md.k */
/* loaded from: combined.jar:classes2.jar:md/k.class */
public final class C6570k {
    /* renamed from: a */
    public static boolean m30332a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    /* renamed from: b */
    public static <T> Class<T> m30333b(Class<T> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        Class<T> cls2 = cls;
        if (cls == Void.TYPE) {
            cls2 = Void.class;
        }
        return cls2;
    }
}
