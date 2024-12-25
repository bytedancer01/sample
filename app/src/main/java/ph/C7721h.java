package ph;

import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ph/h.class
 */
/* renamed from: ph.h */
/* loaded from: combined.jar:classes2.jar:ph/h.class */
public final class C7721h {

    /* renamed from: a */
    @NotNull
    public static final C7721h f37483a = new C7721h();

    /* renamed from: b */
    @NotNull
    public static final a f37484b = new a(null, null, null);

    /* renamed from: c */
    @Nullable
    public static a f37485c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ph/h$a.class
     */
    /* renamed from: ph.h$a */
    /* loaded from: combined.jar:classes2.jar:ph/h$a.class */
    public static final class a {

        /* renamed from: a */
        @Nullable
        public final Method f37486a;

        /* renamed from: b */
        @Nullable
        public final Method f37487b;

        /* renamed from: c */
        @Nullable
        public final Method f37488c;

        public a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f37486a = method;
            this.f37487b = method2;
            this.f37488c = method3;
        }
    }

    /* renamed from: a */
    public final a m33721a(AbstractC7714a abstractC7714a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC7714a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC7714a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f37485c = aVar;
            return aVar;
        } catch (Exception e10) {
            a aVar2 = f37484b;
            f37485c = aVar2;
            return aVar2;
        }
    }

    @Nullable
    /* renamed from: b */
    public final String m33722b(@NotNull AbstractC7714a abstractC7714a) {
        C9367f.m39526e(abstractC7714a, "continuation");
        a aVar = f37485c;
        a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = m33721a(abstractC7714a);
        }
        if (aVar2 == f37484b) {
            return null;
        }
        Method method = aVar2.f37486a;
        Object invoke = method != null ? method.invoke(abstractC7714a.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f37487b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f37488c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        String str = null;
        if (invoke3 instanceof String) {
            str = (String) invoke3;
        }
        return str;
    }
}
