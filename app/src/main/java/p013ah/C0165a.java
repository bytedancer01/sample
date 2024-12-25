package p013ah;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ah/a.class
 */
/* renamed from: ah.a */
/* loaded from: combined.jar:classes2.jar:ah/a.class */
public class C0165a {

    /* renamed from: a */
    public static final Logger f1289a = Logger.getLogger(C0165a.class.getName());

    /* renamed from: b */
    public static final Method f1290b;

    /* renamed from: c */
    public static final Method f1291c;

    /* renamed from: d */
    public static final Method f1292d;

    /* renamed from: e */
    public static final Method f1293e;

    /* renamed from: f */
    public static final Method f1294f;

    /* renamed from: g */
    public static final Method f1295g;

    /* renamed from: h */
    public static final Method f1296h;

    /* renamed from: i */
    public static final Method f1297i;

    /* renamed from: j */
    public static final Method f1298j;

    /* renamed from: k */
    public static Constructor f1299k;

    static {
        Class m751g = m751g("java.lang.invoke.MethodHandles");
        Class m751g2 = m751g("java.lang.invoke.MethodHandle");
        Class m751g3 = m751g("java.lang.invoke.MethodHandles$Lookup");
        Class m751g4 = m751g("java.lang.invoke.MethodType");
        f1290b = m753i(Method.class, "isDefault", new Class[0]);
        f1291c = m753i(m751g, "lookup", new Class[0]);
        f1292d = m753i(m751g3, "in", Class.class);
        f1294f = m753i(m751g3, "unreflectSpecial", Method.class, Class.class);
        f1295g = m753i(m751g3, "findSpecial", Class.class, String.class, m751g4, Class.class);
        f1296h = m753i(m751g2, "bindTo", Object.class);
        f1297i = m753i(m751g2, "invokeWithArguments", Object[].class);
        f1293e = m753i(m751g, "privateLookupIn", Class.class, m751g3);
        f1298j = m753i(m751g4, "methodType", Class.class, Class[].class);
    }

    /* renamed from: a */
    public static Object m745a() {
        return f1291c.invoke(null, new Object[0]);
    }

    /* renamed from: b */
    public static Object m746b(Class cls, Object obj) {
        return f1293e.invoke(null, cls, obj);
    }

    /* renamed from: c */
    public static Constructor m747c() {
        if (f1299k == null) {
            f1299k = m752h(m751g("java.lang.invoke.MethodHandles$Lookup"), Class.class);
        }
        return f1299k;
    }

    /* renamed from: d */
    public static Object m748d(Method method) {
        try {
            return m754j(m746b(method.getDeclaringClass(), m745a()), method);
        } catch (Exception e10) {
            return m755k(m747c().newInstance(method.getDeclaringClass()), method);
        }
    }

    /* renamed from: e */
    public static Object m749e(Object obj, Object obj2, Object... objArr) {
        return f1297i.invoke(f1296h.invoke(obj2, obj), objArr);
    }

    /* renamed from: f */
    public static boolean m750f(Method method) {
        Method method2 = f1290b;
        if (method2 == null) {
            return false;
        }
        try {
            return ((Boolean) method2.invoke(method, new Object[0])).booleanValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (IllegalArgumentException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: g */
    public static Class m751g(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            f1289a.log(Level.FINE, "Failed to lookup class: " + str, (Throwable) e10);
            return null;
        }
    }

    /* renamed from: h */
    public static Constructor m752h(Class cls, Class... clsArr) {
        if (cls == null) {
            f1289a.log(Level.FINE, "Failed to lookup method: <init>#{1}({2})", new Object[]{cls, Arrays.toString(clsArr)});
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (Exception e10) {
            f1289a.log(Level.FINE, "Failed to lookup method: <init>#{1}({2})", new Object[]{cls, Arrays.toString(clsArr)});
            return null;
        }
    }

    /* renamed from: i */
    public static Method m753i(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            f1289a.log(Level.FINE, "Failed to lookup method: {0}#{1}({2})", new Object[]{cls, str, Arrays.toString(clsArr)});
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Exception e10) {
            f1289a.log(Level.FINE, "Failed to lookup method: {0}#{1}({2})", new Object[]{cls, str, Arrays.toString(clsArr)});
            return null;
        }
    }

    /* renamed from: j */
    public static Object m754j(Object obj, Method method) {
        return f1295g.invoke(obj, method.getDeclaringClass(), method.getName(), f1298j.invoke(null, method.getReturnType(), method.getParameterTypes()), method.getDeclaringClass());
    }

    /* renamed from: k */
    public static Object m755k(Object obj, Method method) {
        return f1294f.invoke(f1292d.invoke(obj, method.getDeclaringClass()), method, method.getDeclaringClass());
    }
}
