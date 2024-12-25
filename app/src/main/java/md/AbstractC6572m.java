package md;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/m.class
 */
/* renamed from: md.m */
/* loaded from: combined.jar:classes2.jar:md/m.class */
public abstract class AbstractC6572m {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/m$a.class
     */
    /* renamed from: md.m$a */
    /* loaded from: combined.jar:classes2.jar:md/m$a.class */
    public class a extends AbstractC6572m {

        /* renamed from: a */
        public final Method f34395a;

        /* renamed from: b */
        public final Object f34396b;

        public a(Method method, Object obj) {
            this.f34395a = method;
            this.f34396b = obj;
        }

        @Override // md.AbstractC6572m
        /* renamed from: c */
        public <T> T mo30339c(Class<T> cls) {
            AbstractC6572m.m30337a(cls);
            return (T) this.f34395a.invoke(this.f34396b, cls);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/m$b.class
     */
    /* renamed from: md.m$b */
    /* loaded from: combined.jar:classes2.jar:md/m$b.class */
    public class b extends AbstractC6572m {

        /* renamed from: a */
        public final Method f34397a;

        /* renamed from: b */
        public final int f34398b;

        public b(Method method, int i10) {
            this.f34397a = method;
            this.f34398b = i10;
        }

        @Override // md.AbstractC6572m
        /* renamed from: c */
        public <T> T mo30339c(Class<T> cls) {
            AbstractC6572m.m30337a(cls);
            return (T) this.f34397a.invoke(null, cls, Integer.valueOf(this.f34398b));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/m$c.class
     */
    /* renamed from: md.m$c */
    /* loaded from: combined.jar:classes2.jar:md/m$c.class */
    public class c extends AbstractC6572m {

        /* renamed from: a */
        public final Method f34399a;

        public c(Method method) {
            this.f34399a = method;
        }

        @Override // md.AbstractC6572m
        /* renamed from: c */
        public <T> T mo30339c(Class<T> cls) {
            AbstractC6572m.m30337a(cls);
            return (T) this.f34399a.invoke(null, cls, Object.class);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/m$d.class
     */
    /* renamed from: md.m$d */
    /* loaded from: combined.jar:classes2.jar:md/m$d.class */
    public class d extends AbstractC6572m {
        @Override // md.AbstractC6572m
        /* renamed from: c */
        public <T> T mo30339c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    public static void m30337a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static AbstractC6572m m30338b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception e10) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception e11) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception e12) {
                    return new d();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo30339c(Class<T> cls);
}
