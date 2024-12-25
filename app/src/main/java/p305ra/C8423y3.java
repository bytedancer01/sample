package p305ra;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/y3.class
 */
/* renamed from: ra.y3 */
/* loaded from: combined.jar:classes2.jar:ra/y3.class */
public final class C8423y3 implements InterfaceC8168h3 {

    /* renamed from: b */
    public static final Map<String, C8423y3> f39406b = new C7928a();

    /* renamed from: a */
    public final SharedPreferences f39407a;

    /* renamed from: a */
    public static C8423y3 m36221a(Context context, String str) {
        C8423y3 c8423y3;
        if (C8437z2.m36239a()) {
            throw null;
        }
        synchronized (C8423y3.class) {
            try {
                c8423y3 = f39406b.get(null);
                if (c8423y3 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c8423y3;
    }

    /* renamed from: b */
    public static void m36222b() {
        synchronized (C8423y3.class) {
            try {
                Map<String, C8423y3> map = f39406b;
                Iterator<C8423y3> it = map.values().iterator();
                if (it.hasNext()) {
                    SharedPreferences sharedPreferences = it.next().f39407a;
                    throw null;
                }
                map.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p305ra.InterfaceC8168h3
    /* renamed from: g */
    public final Object mo35199g(String str) {
        throw null;
    }
}
