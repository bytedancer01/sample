package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/j.class
 */
/* renamed from: androidx.fragment.app.j */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/j.class */
public class C0424j {

    /* renamed from: a */
    public static final C7936i<ClassLoader, C7936i<String, Class<?>>> f2904a = new C7936i<>();

    /* renamed from: b */
    public static boolean m2102b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m2103c(classLoader, str));
        } catch (ClassNotFoundException e10) {
            return false;
        }
    }

    /* renamed from: c */
    public static Class<?> m2103c(ClassLoader classLoader, String str) {
        C7936i<ClassLoader, C7936i<String, Class<?>>> c7936i = f2904a;
        C7936i<String, Class<?>> c7936i2 = c7936i.get(classLoader);
        C7936i<String, Class<?>> c7936i3 = c7936i2;
        if (c7936i2 == null) {
            c7936i3 = new C7936i<>();
            c7936i.put(classLoader, c7936i3);
        }
        Class<?> cls = c7936i3.get(str);
        Class<?> cls2 = cls;
        if (cls == null) {
            cls2 = Class.forName(str, false, classLoader);
            c7936i3.put(str, cls2);
        }
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m2104d(ClassLoader classLoader, String str) {
        try {
            return m2103c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.C0404j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.C0404j("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    /* renamed from: a */
    public Fragment mo2105a(ClassLoader classLoader, String str) {
        throw null;
    }
}
