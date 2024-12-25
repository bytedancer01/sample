package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/c0.class
 */
/* renamed from: androidx.lifecycle.c0 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/c0.class */
public class C0565c0 {

    /* renamed from: a */
    public final b f3756a;

    /* renamed from: b */
    public final C0567d0 f3757b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/c0$a.class
     */
    /* renamed from: androidx.lifecycle.c0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/c0$a.class */
    public static class a extends d {

        /* renamed from: c */
        public static a f3758c;

        /* renamed from: b */
        public Application f3759b;

        public a(Application application) {
            this.f3759b = application;
        }

        /* renamed from: c */
        public static a m3138c(Application application) {
            if (f3758c == null) {
                f3758c = new a(application);
            }
            return f3758c;
        }

        @Override // androidx.lifecycle.C0565c0.d, androidx.lifecycle.C0565c0.b
        /* renamed from: a */
        public <T extends AbstractC0563b0> T mo2298a(Class<T> cls) {
            if (!C0560a.class.isAssignableFrom(cls)) {
                return (T) super.mo2298a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f3759b);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/c0$b.class
     */
    /* renamed from: androidx.lifecycle.c0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/c0$b.class */
    public interface b {
        /* renamed from: a */
        <T extends AbstractC0563b0> T mo2298a(Class<T> cls);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/c0$c.class
     */
    /* renamed from: androidx.lifecycle.c0$c */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/c0$c.class */
    public static abstract class c extends e implements b {
        @Override // androidx.lifecycle.C0565c0.b
        /* renamed from: a */
        public <T extends AbstractC0563b0> T mo2298a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends AbstractC0563b0> T mo3139c(String str, Class<T> cls);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/c0$d.class
     */
    /* renamed from: androidx.lifecycle.c0$d */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/c0$d.class */
    public static class d implements b {

        /* renamed from: a */
        public static d f3760a;

        /* renamed from: b */
        public static d m3140b() {
            if (f3760a == null) {
                f3760a = new d();
            }
            return f3760a;
        }

        @Override // androidx.lifecycle.C0565c0.b
        /* renamed from: a */
        public <T extends AbstractC0563b0> T mo2298a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/c0$e.class
     */
    /* renamed from: androidx.lifecycle.c0$e */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/c0$e.class */
    public static class e {
        /* renamed from: b */
        public void mo3141b(AbstractC0563b0 abstractC0563b0) {
        }
    }

    public C0565c0(C0567d0 c0567d0, b bVar) {
        this.f3756a = bVar;
        this.f3757b = c0567d0;
    }

    /* renamed from: a */
    public <T extends AbstractC0563b0> T m3136a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m3137b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* renamed from: b */
    public <T extends AbstractC0563b0> T m3137b(String str, Class<T> cls) {
        T t10 = (T) this.f3757b.m3143b(str);
        if (cls.isInstance(t10)) {
            Object obj = this.f3756a;
            if (obj instanceof e) {
                ((e) obj).mo3141b(t10);
            }
            return t10;
        }
        b bVar = this.f3756a;
        AbstractC0563b0 mo3139c = bVar instanceof c ? ((c) bVar).mo3139c(str, cls) : bVar.mo2298a(cls);
        this.f3757b.m3145d(str, mo3139c);
        return (T) mo3139c;
    }
}
