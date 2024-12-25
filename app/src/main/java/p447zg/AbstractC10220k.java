package p447zg;

import java.lang.reflect.InvocationTargetException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/k.class
 */
/* renamed from: zg.k */
/* loaded from: combined.jar:classes2.jar:zg/k.class */
public abstract class AbstractC10220k {
    /* renamed from: a */
    public static <T> T m42756a(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e10, e10);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e11, e11);
        } catch (InstantiationException e12) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e12, e12);
        } catch (NoSuchMethodException e13) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e13, e13);
        } catch (SecurityException e14) {
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e14, e14);
        } catch (InvocationTargetException e15) {
            if (e15.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e15.getCause());
            }
            throw new IllegalArgumentException("Can't create an instance of " + cls + ", requires a public no-arg constructor: " + e15, e15);
        }
    }
}
