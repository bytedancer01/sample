package p414y1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p433z1.C10030b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y1/a.class
 */
/* renamed from: y1.a */
/* loaded from: combined.jar:classes1.jar:y1/a.class */
public final class C9800a {

    /* renamed from: d */
    public static volatile C9800a f45098d;

    /* renamed from: e */
    public static final Object f45099e = new Object();

    /* renamed from: c */
    public final Context f45102c;

    /* renamed from: b */
    public final Set<Class<? extends InterfaceC9801b<?>>> f45101b = new HashSet();

    /* renamed from: a */
    public final Map<Class<?>, Object> f45100a = new HashMap();

    public C9800a(Context context) {
        this.f45102c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C9800a m41284c(Context context) {
        if (f45098d == null) {
            synchronized (f45099e) {
                if (f45098d == null) {
                    f45098d = new C9800a(context);
                }
            }
        }
        return f45098d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m41285a() {
        try {
            try {
                C10030b.m42182a("Startup");
                Bundle bundle = this.f45102c.getPackageManager().getProviderInfo(new ComponentName(this.f45102c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.f45102c.getString(C9802c.f45103a);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (InterfaceC9801b.class.isAssignableFrom(cls)) {
                                this.f45101b.add(cls);
                                m41286b(cls, hashSet);
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e10) {
                throw new C9803d(e10);
            }
        } finally {
            C10030b.m42183b();
        }
    }

    /* renamed from: b */
    public <T> T m41286b(Class<? extends InterfaceC9801b<?>> cls, Set<Class<?>> set) {
        Object obj;
        synchronized (f45099e) {
            if (C10030b.m42185d()) {
                try {
                    C10030b.m42182a(cls.getSimpleName());
                } catch (Throwable th2) {
                    C10030b.m42183b();
                    throw th2;
                }
            }
            if (set.contains(cls)) {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
            if (this.f45100a.containsKey(cls)) {
                obj = this.f45100a.get(cls);
            } else {
                set.add(cls);
                try {
                    InterfaceC9801b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends InterfaceC9801b<?>>> mo4839a = newInstance.mo4839a();
                    if (!mo4839a.isEmpty()) {
                        for (Class<? extends InterfaceC9801b<?>> cls2 : mo4839a) {
                            if (!this.f45100a.containsKey(cls2)) {
                                m41286b(cls2, set);
                            }
                        }
                    }
                    Object mo4840b = newInstance.mo4840b(this.f45102c);
                    set.remove(cls);
                    this.f45100a.put(cls, mo4840b);
                    obj = mo4840b;
                } catch (Throwable th3) {
                    throw new C9803d(th3);
                }
            }
            C10030b.m42183b();
        }
        return (T) obj;
    }
}
