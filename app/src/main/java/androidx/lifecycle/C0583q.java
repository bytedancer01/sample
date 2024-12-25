package androidx.lifecycle;

import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/q.class
 */
/* renamed from: androidx.lifecycle.q */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/q.class */
public class C0583q {

    /* renamed from: a */
    public static Map<Class<?>, Integer> f3777a = new HashMap();

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends InterfaceC0570f>>> f3778b = new HashMap();

    /* renamed from: a */
    public static InterfaceC0570f m3175a(Constructor<? extends InterfaceC0570f> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* renamed from: b */
    public static Constructor<? extends InterfaceC0570f> m3176b(Class<?> cls) {
        String str;
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String m3177c = m3177c(canonicalName);
            if (name.isEmpty()) {
                str = m3177c;
            } else {
                str = name + InstructionFileId.DOT + m3177c;
            }
            Constructor declaredConstructor = Class.forName(str).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException e10) {
            return null;
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* renamed from: c */
    public static String m3177c(String str) {
        return str.replace(InstructionFileId.DOT, AWSAppSyncClient.DATABASE_NAME_DELIMITER) + "_LifecycleAdapter";
    }

    /* renamed from: d */
    public static int m3178d(Class<?> cls) {
        Integer num = f3777a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m3181g = m3181g(cls);
        f3777a.put(cls, Integer.valueOf(m3181g));
        return m3181g;
    }

    /* renamed from: e */
    public static boolean m3179e(Class<?> cls) {
        return cls != null && InterfaceC0578l.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    public static InterfaceC0577k m3180f(Object obj) {
        boolean z10 = obj instanceof InterfaceC0577k;
        boolean z11 = obj instanceof InterfaceC0568e;
        if (z10 && z11) {
            return new FullLifecycleObserverAdapter((InterfaceC0568e) obj, (InterfaceC0577k) obj);
        }
        if (z11) {
            return new FullLifecycleObserverAdapter((InterfaceC0568e) obj, null);
        }
        if (z10) {
            return (InterfaceC0577k) obj;
        }
        Class<?> cls = obj.getClass();
        if (m3178d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends InterfaceC0570f>> list = f3778b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m3175a(list.get(0), obj));
        }
        InterfaceC0570f[] interfaceC0570fArr = new InterfaceC0570f[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            interfaceC0570fArr[i10] = m3175a(list.get(i10), obj);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0570fArr);
    }

    /* renamed from: g */
    public static int m3181g(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0570f> m3176b = m3176b(cls);
        if (m3176b != null) {
            f3778b.put(cls, Collections.singletonList(m3176b));
            return 2;
        }
        if (C0562b.f3747c.m3127d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList2 = null;
        if (m3179e(superclass)) {
            if (m3178d(superclass) == 1) {
                return 1;
            }
            arrayList2 = new ArrayList(f3778b.get(superclass));
        }
        Class<?>[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        int i10 = 0;
        while (i10 < length) {
            Class<?> cls2 = interfaces[i10];
            if (!m3179e(cls2)) {
                arrayList = arrayList2;
            } else {
                if (m3178d(cls2) == 1) {
                    return 1;
                }
                arrayList = arrayList2;
                if (arrayList2 == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f3778b.get(cls2));
            }
            i10++;
            arrayList2 = arrayList;
        }
        if (arrayList2 == null) {
            return 1;
        }
        f3778b.put(cls, arrayList2);
        return 2;
    }
}
