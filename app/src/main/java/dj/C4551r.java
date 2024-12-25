package dj;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import dj.InterfaceC4536c;
import dj.InterfaceC4539f;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: dj.r */
/* loaded from: combined.jar:classes3.jar:dj/r.class */
public class C4551r {

    /* renamed from: c */
    public static final C4551r f27074c = m22914e();

    /* renamed from: a */
    public final boolean f27075a;

    /* renamed from: b */
    public final Constructor<MethodHandles.Lookup> f27076b;

    /* renamed from: dj.r$a */
    /* loaded from: combined.jar:classes3.jar:dj/r$a.class */
    public static final class a extends C4551r {

        /* renamed from: dj.r$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes3.jar:dj/r$a$a.class */
        public static final class ExecutorC10286a implements Executor {

            /* renamed from: b */
            public final Handler f27077b = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f27077b.post(runnable);
            }
        }

        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // dj.C4551r
        /* renamed from: b */
        public Executor mo22917b() {
            return new ExecutorC10286a();
        }

        @Override // dj.C4551r
        /* renamed from: g */
        public Object mo22920g(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.mo22920g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public C4551r(boolean z10) {
        this.f27075a = z10;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z10) {
            constructor = null;
            try {
                Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor = declaredConstructor;
                declaredConstructor.setAccessible(true);
                constructor = declaredConstructor;
            } catch (NoClassDefFoundError | NoSuchMethodException e10) {
            }
        }
        this.f27076b = constructor;
    }

    /* renamed from: e */
    public static C4551r m22914e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new C4551r(true);
    }

    /* renamed from: f */
    public static C4551r m22915f() {
        return f27074c;
    }

    /* renamed from: a */
    public List<? extends InterfaceC4536c.a> m22916a(Executor executor) {
        C4540g c4540g = new C4540g(executor);
        return this.f27075a ? Arrays.asList(C4538e.f26966a, c4540g) : Collections.singletonList(c4540g);
    }

    /* renamed from: b */
    public Executor mo22917b() {
        return null;
    }

    /* renamed from: c */
    public List<? extends InterfaceC4539f.a> m22918c() {
        return this.f27075a ? Collections.singletonList(C4548o.f27027a) : Collections.emptyList();
    }

    /* renamed from: d */
    public int m22919d() {
        return this.f27075a ? 1 : 0;
    }

    @IgnoreJRERequirement
    /* renamed from: g */
    public Object mo22920g(Method method, Class<?> cls, Object obj, Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.f27076b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    /* renamed from: h */
    public boolean m22921h(Method method) {
        boolean z10;
        boolean isDefault;
        if (this.f27075a) {
            isDefault = method.isDefault();
            if (isDefault) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }
}
