package id;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.C2571a;
import java.io.IOException;
import p443zc.C10185s;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/z.class
 */
/* renamed from: id.z */
/* loaded from: combined.jar:classes2.jar:id/z.class */
public class RunnableC5244z implements Runnable {

    /* renamed from: g */
    public static final Object f29970g = new Object();

    /* renamed from: h */
    public static Boolean f29971h;

    /* renamed from: i */
    public static Boolean f29972i;

    /* renamed from: b */
    public final Context f29973b;

    /* renamed from: c */
    public final C10185s f29974c;

    /* renamed from: d */
    public final PowerManager.WakeLock f29975d;

    /* renamed from: e */
    public final C5243y f29976e;

    /* renamed from: f */
    public final long f29977f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:id/z$a.class
     */
    /* renamed from: id.z$a */
    /* loaded from: combined.jar:classes2.jar:id/z$a.class */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public RunnableC5244z f29978a;

        /* renamed from: b */
        public final RunnableC5244z f29979b;

        public a(RunnableC5244z runnableC5244z, RunnableC5244z runnableC5244z2) {
            this.f29979b = runnableC5244z;
            this.f29978a = runnableC5244z2;
        }

        /* renamed from: a */
        public void m26161a() {
            if (RunnableC5244z.m26159j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f29979b.f29973b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (this) {
                RunnableC5244z runnableC5244z = this.f29978a;
                if (runnableC5244z == null) {
                    return;
                }
                if (runnableC5244z.m26160i()) {
                    if (RunnableC5244z.m26159j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f29978a.f29976e.m26145l(this.f29978a, 0L);
                    context.unregisterReceiver(this);
                    this.f29978a = null;
                }
            }
        }
    }

    public RunnableC5244z(C5243y c5243y, Context context, C10185s c10185s, long j10) {
        this.f29976e = c5243y;
        this.f29973b = context;
        this.f29977f = j10;
        this.f29974c = c10185s;
        this.f29975d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    public static String m26155e(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 142);
        sb2.append("Missing Permission: ");
        sb2.append(str);
        sb2.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb2.toString();
    }

    /* renamed from: f */
    public static boolean m26156f(Context context) {
        boolean booleanValue;
        synchronized (f29970g) {
            Boolean bool = f29972i;
            Boolean valueOf = Boolean.valueOf(bool == null ? m26157g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f29972i = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    public static boolean m26157g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (z10 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z10;
        }
        Log.d("FirebaseMessaging", m26155e(str));
        return false;
    }

    /* renamed from: h */
    public static boolean m26158h(Context context) {
        boolean booleanValue;
        synchronized (f29970g) {
            Boolean bool = f29971h;
            Boolean valueOf = Boolean.valueOf(bool == null ? m26157g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f29971h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: j */
    public static boolean m26159j() {
        boolean z10 = false;
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT == 23) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return false;
                }
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    /* renamed from: i */
    public final boolean m26160i() {
        boolean z10;
        synchronized (this) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f29973b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (m26158h(this.f29973b)) {
            this.f29975d.acquire(C2571a.f15804a);
        }
        try {
            try {
                this.f29976e.m26146m(true);
                if (!this.f29974c.m42641g()) {
                    this.f29976e.m26146m(false);
                    if (m26158h(this.f29973b)) {
                        try {
                            this.f29975d.release();
                            return;
                        } catch (RuntimeException e10) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (m26156f(this.f29973b) && !m26160i()) {
                    new a(this, this).m26161a();
                    if (m26158h(this.f29973b)) {
                        try {
                            this.f29975d.release();
                            return;
                        } catch (RuntimeException e11) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f29976e.m26149p()) {
                    this.f29976e.m26146m(false);
                } else {
                    this.f29976e.m26150q(this.f29977f);
                }
                if (m26158h(this.f29973b)) {
                    try {
                        this.f29975d.release();
                    } catch (RuntimeException e12) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } catch (IOException e13) {
                String valueOf = String.valueOf(e13.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f29976e.m26146m(false);
                if (m26158h(this.f29973b)) {
                    try {
                        this.f29975d.release();
                    } catch (RuntimeException e14) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th2) {
            if (m26158h(this.f29973b)) {
                try {
                    this.f29975d.release();
                } catch (RuntimeException e15) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
