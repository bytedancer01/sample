package p443zc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p423ya.C9966a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/x.class
 */
/* renamed from: zc.x */
/* loaded from: combined.jar:classes2.jar:zc/x.class */
public final class C10190x {

    /* renamed from: a */
    public static final long f46661a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f46662b = new Object();

    /* renamed from: c */
    public static C9966a f46663c;

    /* renamed from: a */
    public static void m42650a(Context context) {
        if (f46663c == null) {
            C9966a c9966a = new C9966a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f46663c = c9966a;
            c9966a.m41897c(true);
        }
    }

    /* renamed from: b */
    public static void m42651b(Intent intent) {
        synchronized (f46662b) {
            if (f46663c != null && m42652c(intent)) {
                m42653d(intent, false);
                f46663c.m41896b();
            }
        }
    }

    /* renamed from: c */
    public static boolean m42652c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    public static void m42653d(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* renamed from: e */
    public static ComponentName m42654e(Context context, Intent intent) {
        synchronized (f46662b) {
            m42650a(context);
            boolean m42652c = m42652c(intent);
            m42653d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!m42652c) {
                f46663c.m41895a(f46661a);
            }
            return startService;
        }
    }
}
