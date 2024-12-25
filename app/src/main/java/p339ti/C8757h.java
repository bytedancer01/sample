package p339ti;

import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/h.class
 */
/* renamed from: ti.h */
/* loaded from: combined.jar:classes2.jar:ti/h.class */
public final class C8757h {

    /* renamed from: d */
    public static final a f40730d = new a(null);

    /* renamed from: a */
    public final Method f40731a;

    /* renamed from: b */
    public final Method f40732b;

    /* renamed from: c */
    public final Method f40733c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/h$a.class
     */
    /* renamed from: ti.h$a */
    /* loaded from: combined.jar:classes2.jar:ti/h$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C8757h m37568a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                Method method5 = cls.getMethod("open", String.class);
                method3 = method4;
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method2 = method5;
            } catch (Exception e10) {
                method = null;
                method2 = null;
            }
            return new C8757h(method3, method2, method);
        }
    }

    public C8757h(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
        this.f40731a = method;
        this.f40732b = method2;
        this.f40733c = method3;
    }

    @Nullable
    /* renamed from: a */
    public final Object m37566a(@NotNull String str) {
        C9367f.m39526e(str, "closer");
        Method method = this.f40731a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = this.f40732b;
            C9367f.m39524c(method2);
            method2.invoke(invoke, str);
            return invoke;
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean m37567b(@Nullable Object obj) {
        boolean z10 = false;
        if (obj != null) {
            try {
                Method method = this.f40733c;
                C9367f.m39524c(method);
                method.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception e10) {
                z10 = false;
            }
        }
        return z10;
    }
}
