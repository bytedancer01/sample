package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C0565c0;
import androidx.savedstate.InterfaceC0733c;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/z.class
 */
/* renamed from: androidx.lifecycle.z */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/z.class */
public final class C0592z extends C0565c0.c {

    /* renamed from: f */
    public static final Class<?>[] f3799f = {Application.class, C0591y.class};

    /* renamed from: g */
    public static final Class<?>[] f3800g = {C0591y.class};

    /* renamed from: a */
    public final Application f3801a;

    /* renamed from: b */
    public final C0565c0.b f3802b;

    /* renamed from: c */
    public final Bundle f3803c;

    /* renamed from: d */
    public final AbstractC0572g f3804d;

    /* renamed from: e */
    public final SavedStateRegistry f3805e;

    @SuppressLint({"LambdaLast"})
    public C0592z(Application application, InterfaceC0733c interfaceC0733c, Bundle bundle) {
        this.f3805e = interfaceC0733c.getSavedStateRegistry();
        this.f3804d = interfaceC0733c.getLifecycle();
        this.f3803c = bundle;
        this.f3801a = application;
        this.f3802b = application != null ? C0565c0.a.m3138c(application) : C0565c0.d.m3140b();
    }

    /* renamed from: d */
    public static <T> Constructor<T> m3204d(Class<T> cls, Class<?>[] clsArr) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.C0565c0.c, androidx.lifecycle.C0565c0.b
    /* renamed from: a */
    public <T extends AbstractC0563b0> T mo2298a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo3139c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C0565c0.e
    /* renamed from: b */
    public void mo3141b(AbstractC0563b0 abstractC0563b0) {
        SavedStateHandleController.m3111c(abstractC0563b0, this.f3805e, this.f3804d);
    }

    @Override // androidx.lifecycle.C0565c0.c
    /* renamed from: c */
    public <T extends AbstractC0563b0> T mo3139c(String str, Class<T> cls) {
        Object newInstance;
        boolean isAssignableFrom = C0560a.class.isAssignableFrom(cls);
        Constructor m3204d = (!isAssignableFrom || this.f3801a == null) ? m3204d(cls, f3800g) : m3204d(cls, f3799f);
        if (m3204d == null) {
            return (T) this.f3802b.mo2298a(cls);
        }
        SavedStateHandleController m3112i = SavedStateHandleController.m3112i(this.f3805e, this.f3804d, str, this.f3803c);
        if (isAssignableFrom) {
            try {
                Application application = this.f3801a;
                if (application != null) {
                    newInstance = m3204d.newInstance(application, m3112i.m3115k());
                    T t10 = (T) newInstance;
                    t10.m3135e("androidx.lifecycle.savedstate.vm.tag", m3112i);
                    return t10;
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to access " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
            }
        }
        newInstance = m3204d.newInstance(m3112i.m3115k());
        T t102 = (T) newInstance;
        t102.m3135e("androidx.lifecycle.savedstate.vm.tag", m3112i);
        return t102;
    }
}
