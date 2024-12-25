package androidx.lifecycle;

import androidx.lifecycle.AbstractC0572g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/b.class
 */
/* renamed from: androidx.lifecycle.b */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/b.class */
public final class C0562b {

    /* renamed from: c */
    public static C0562b f3747c = new C0562b();

    /* renamed from: a */
    public final Map<Class<?>, a> f3748a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f3749b = new HashMap();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/b$a.class
     */
    /* renamed from: androidx.lifecycle.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/b$a.class */
    public static class a {

        /* renamed from: a */
        public final Map<AbstractC0572g.b, List<b>> f3750a = new HashMap();

        /* renamed from: b */
        public final Map<b, AbstractC0572g.b> f3751b;

        public a(Map<b, AbstractC0572g.b> map) {
            this.f3751b = map;
            for (Map.Entry<b, AbstractC0572g.b> entry : map.entrySet()) {
                AbstractC0572g.b value = entry.getValue();
                List<b> list = this.f3750a.get(value);
                List<b> list2 = list;
                if (list == null) {
                    list2 = new ArrayList();
                    this.f3750a.put(value, list2);
                }
                list2.add(entry.getKey());
            }
        }

        /* renamed from: b */
        public static void m3129b(List<b> list, InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m3131a(interfaceC0579m, bVar, obj);
                }
            }
        }

        /* renamed from: a */
        public void m3130a(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar, Object obj) {
            m3129b(this.f3750a.get(bVar), interfaceC0579m, bVar, obj);
            m3129b(this.f3750a.get(AbstractC0572g.b.ON_ANY), interfaceC0579m, bVar, obj);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/b$b.class
     */
    /* renamed from: androidx.lifecycle.b$b */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/b$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f3752a;

        /* renamed from: b */
        public final Method f3753b;

        public b(int i10, Method method) {
            this.f3752a = i10;
            this.f3753b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void m3131a(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar, Object obj) {
            try {
                int i10 = this.f3752a;
                if (i10 == 0) {
                    this.f3753b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f3753b.invoke(obj, interfaceC0579m);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f3753b.invoke(obj, interfaceC0579m, bVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f3752a != bVar.f3752a || !this.f3753b.getName().equals(bVar.f3753b.getName())) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return (this.f3752a * 31) + this.f3753b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final a m3124a(Class<?> cls, Method[] methodArr) {
        int i10;
        a m3126c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m3126c = m3126c(superclass)) != null) {
            hashMap.putAll(m3126c.f3751b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0572g.b> entry : m3126c(cls2).f3751b.entrySet()) {
                m3128e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m3125b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            InterfaceC0587u interfaceC0587u = (InterfaceC0587u) method.getAnnotation(InterfaceC0587u.class);
            if (interfaceC0587u != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0579m.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC0572g.b value = interfaceC0587u.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0572g.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC0572g.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m3128e(hashMap, new b(i10, method), value, cls);
                z10 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f3748a.put(cls, aVar);
        this.f3749b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    /* renamed from: b */
    public final Method[] m3125b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    /* renamed from: c */
    public a m3126c(Class<?> cls) {
        a aVar = this.f3748a.get(cls);
        return aVar != null ? aVar : m3124a(cls, null);
    }

    /* renamed from: d */
    public boolean m3127d(Class<?> cls) {
        Boolean bool = this.f3749b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m3125b = m3125b(cls);
        for (Method method : m3125b) {
            if (((InterfaceC0587u) method.getAnnotation(InterfaceC0587u.class)) != null) {
                m3124a(cls, m3125b);
                return true;
            }
        }
        this.f3749b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void m3128e(Map<b, AbstractC0572g.b> map, b bVar, AbstractC0572g.b bVar2, Class<?> cls) {
        AbstractC0572g.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f3753b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }
}
