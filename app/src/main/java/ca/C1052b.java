package ca;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p060da.C4414m;
import p097fa.C4794e;
import p422y9.C9935o;
import p422y9.InterfaceC9937o1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ca/b.class
 */
/* renamed from: ca.b */
/* loaded from: combined.jar:classes2.jar:ca/b.class */
public class C1052b {

    /* renamed from: b */
    public static final Object f7038b = new Object();

    /* renamed from: c */
    public static volatile C1052b f7039c;

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f7040a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static C1052b m6223b() {
        if (f7039c == null) {
            synchronized (f7038b) {
                if (f7039c == null) {
                    f7039c = new C1052b();
                }
            }
        }
        C1052b c1052b = f7039c;
        C9935o.m41850j(c1052b);
        return c1052b;
    }

    /* renamed from: e */
    public static void m6224e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException e10) {
        }
    }

    /* renamed from: g */
    public static boolean m6225g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC9937o1);
    }

    /* renamed from: h */
    public static final boolean m6226h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean bindService;
        if (!C4414m.m22460k() || executor == null) {
            return context.bindService(intent, serviceConnection, i10);
        }
        bindService = context.bindService(intent, i10, executor, serviceConnection);
        return bindService;
    }

    /* renamed from: a */
    public boolean m6227a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return m6230f(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    /* renamed from: c */
    public void m6228c(Context context, ServiceConnection serviceConnection) {
        if (!m6225g(serviceConnection) || !this.f7040a.containsKey(serviceConnection)) {
            m6224e(context, serviceConnection);
            return;
        }
        try {
            m6224e(context, this.f7040a.get(serviceConnection));
        } finally {
            this.f7040a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean m6229d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return m6230f(context, str, intent, serviceConnection, i10, true, executor);
    }

    /* renamed from: f */
    public final boolean m6230f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        boolean m6226h;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C4794e.m24250a(context).m24245c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e10) {
            }
        }
        if (m6225g(serviceConnection)) {
            ServiceConnection putIfAbsent = this.f7040a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                m6226h = m6226h(context, intent, serviceConnection, i10, executor);
                if (!m6226h) {
                    this.f7040a.remove(serviceConnection, serviceConnection);
                    return false;
                }
            } catch (Throwable th2) {
                this.f7040a.remove(serviceConnection, serviceConnection);
                throw th2;
            }
        } else {
            m6226h = m6226h(context, intent, serviceConnection, i10, executor);
        }
        return m6226h;
    }
}
