package butterknife;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:butterknife/ButterKnife.class
 */
/* loaded from: combined.jar:classes1.jar:butterknife/ButterKnife.class */
public final class ButterKnife {

    /* renamed from: a */
    public static boolean f6078a;

    /* renamed from: b */
    public static final Map<Class<?>, Constructor<? extends Unbinder>> f6079b = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static Unbinder m5626a(Activity activity) {
        return m5627b(activity, activity.getWindow().getDecorView());
    }

    /* renamed from: b */
    public static Unbinder m5627b(Object obj, View view) {
        Class<?> cls = obj.getClass();
        if (f6078a) {
            Log.d("ButterKnife", "Looking up binding for " + cls.getName());
        }
        Constructor<? extends Unbinder> m5628c = m5628c(cls);
        if (m5628c == null) {
            return Unbinder.f6085a;
        }
        try {
            return m5628c.newInstance(obj, view);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Unable to invoke " + m5628c, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Unable to invoke " + m5628c, e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to create binding instance.", cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static Constructor<? extends Unbinder> m5628c(Class<?> cls) {
        Constructor<? extends Unbinder> m5628c;
        Map<Class<?>, Constructor<? extends Unbinder>> map = f6079b;
        Constructor<? extends Unbinder> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            if (f6078a) {
                Log.d("ButterKnife", "HIT: Cached in binding map.");
            }
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            if (!f6078a) {
                return null;
            }
            Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            return null;
        }
        try {
            Constructor<? extends Unbinder> constructor2 = cls.getClassLoader().loadClass(name + "_ViewBinding").getConstructor(cls, View.class);
            m5628c = constructor2;
            if (f6078a) {
                Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
                m5628c = constructor2;
            }
        } catch (ClassNotFoundException e10) {
            if (f6078a) {
                Log.d("ButterKnife", "Not found. Trying superclass " + cls.getSuperclass().getName());
            }
            m5628c = m5628c(cls.getSuperclass());
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Unable to find binding constructor for " + name, e11);
        }
        f6079b.put(cls, m5628c);
        return m5628c;
    }
}
