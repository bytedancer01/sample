package p056d6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d6/k.class
 */
/* renamed from: d6.k */
/* loaded from: combined.jar:classes1.jar:d6/k.class */
public class C4315k implements InterfaceC4309e {

    /* renamed from: a */
    public final a f26455a;

    /* renamed from: b */
    public final C4313i f26456b;

    /* renamed from: c */
    public final Map<String, InterfaceC4317m> f26457c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d6/k$a.class
     */
    /* renamed from: d6.k$a */
    /* loaded from: combined.jar:classes1.jar:d6/k$a.class */
    public static class a {

        /* renamed from: a */
        public final Context f26458a;

        /* renamed from: b */
        public Map<String, String> f26459b = null;

        public a(Context context) {
            this.f26458a = context;
        }

        /* renamed from: d */
        public static Bundle m21789d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public final Map<String, String> m21790a(Context context) {
            Bundle m21789d = m21789d(context);
            if (m21789d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m21789d.keySet()) {
                Object obj = m21789d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        public InterfaceC4308d m21791b(String str) {
            String format;
            String format2;
            String str2 = m21792c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC4308d) Class.forName(str2).asSubclass(InterfaceC4308d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                e = e10;
                format2 = String.format("Class %s is not found.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (IllegalAccessException e11) {
                e = e11;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (InstantiationException e12) {
                e = e12;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (NoSuchMethodException e13) {
                e = e13;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            } catch (InvocationTargetException e14) {
                e = e14;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            }
        }

        /* renamed from: c */
        public final Map<String, String> m21792c() {
            if (this.f26459b == null) {
                this.f26459b = m21790a(this.f26458a);
            }
            return this.f26459b;
        }
    }

    public C4315k(Context context, C4313i c4313i) {
        this(new a(context), c4313i);
    }

    public C4315k(a aVar, C4313i c4313i) {
        this.f26457c = new HashMap();
        this.f26455a = aVar;
        this.f26456b = c4313i;
    }

    @Override // p056d6.InterfaceC4309e
    public InterfaceC4317m get(String str) {
        synchronized (this) {
            if (this.f26457c.containsKey(str)) {
                return this.f26457c.get(str);
            }
            InterfaceC4308d m21791b = this.f26455a.m21791b(str);
            if (m21791b == null) {
                return null;
            }
            InterfaceC4317m create = m21791b.create(this.f26456b.m21785a(str));
            this.f26457c.put(str, create);
            return create;
        }
    }
}
