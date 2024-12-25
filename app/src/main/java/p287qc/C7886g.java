package p287qc;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import bd.InterfaceC0891b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/g.class
 */
/* renamed from: qc.g */
/* loaded from: combined.jar:classes2.jar:qc/g.class */
public final class C7886g<T> {

    /* renamed from: a */
    public final T f37989a;

    /* renamed from: b */
    public final c<T> f37990b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qc/g$b.class
     */
    /* renamed from: qc.g$b */
    /* loaded from: combined.jar:classes2.jar:qc/g$b.class */
    public static class b implements c<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f37991a;

        public b(Class<? extends Service> cls) {
            this.f37991a = cls;
        }

        /* renamed from: b */
        public final Bundle m34197b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f37991a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f37991a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p287qc.C7886g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> mo34196a(Context context) {
            Bundle m34197b = m34197b(context);
            if (m34197b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m34197b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m34197b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qc/g$c.class
     */
    /* renamed from: qc.g$c */
    /* loaded from: combined.jar:classes2.jar:qc/g$c.class */
    public interface c<T> {
        /* renamed from: a */
        List<String> mo34196a(T t10);
    }

    public C7886g(T t10, c<T> cVar) {
        this.f37989a = t10;
        this.f37990b = cVar;
    }

    /* renamed from: b */
    public static C7886g<Context> m34192b(Context context, Class<? extends Service> cls) {
        return new C7886g<>(context, new b(cls));
    }

    /* renamed from: c */
    public static InterfaceC7888i m34193c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (InterfaceC7888i.class.isAssignableFrom(cls)) {
                return (InterfaceC7888i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C7901v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException e10) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e11) {
            throw new C7901v(String.format("Could not instantiate %s.", str), e11);
        } catch (InstantiationException e12) {
            throw new C7901v(String.format("Could not instantiate %s.", str), e12);
        } catch (NoSuchMethodException e13) {
            throw new C7901v(String.format("Could not instantiate %s", str), e13);
        } catch (InvocationTargetException e14) {
            throw new C7901v(String.format("Could not instantiate %s", str), e14);
        }
    }

    /* renamed from: a */
    public List<InterfaceC0891b<InterfaceC7888i>> m34195a() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f37990b.mo34196a(this.f37989a).iterator();
        while (it.hasNext()) {
            arrayList.add(C7885f.m34191a(it.next()));
        }
        return arrayList;
    }
}
