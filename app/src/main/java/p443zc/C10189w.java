package p443zc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.util.ArrayDeque;
import java.util.Queue;
import org.apache.http.HttpStatus;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/w.class
 */
/* renamed from: zc.w */
/* loaded from: combined.jar:classes2.jar:zc/w.class */
public class C10189w {

    /* renamed from: e */
    public static C10189w f46656e;

    /* renamed from: a */
    public String f46657a = null;

    /* renamed from: b */
    public Boolean f46658b = null;

    /* renamed from: c */
    public Boolean f46659c = null;

    /* renamed from: d */
    public final Queue<Intent> f46660d = new ArrayDeque();

    /* renamed from: b */
    public static C10189w m42643b() {
        C10189w c10189w;
        synchronized (C10189w.class) {
            try {
                if (f46656e == null) {
                    f46656e = new C10189w();
                }
                c10189w = f46656e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10189w;
    }

    /* renamed from: a */
    public final int m42644a(Context context, Intent intent) {
        ComponentName startService;
        String m42648f = m42648f(context, intent);
        if (m42648f != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", m42648f.length() != 0 ? "Restricting intent to a specific service: ".concat(m42648f) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), m42648f);
        }
        try {
            if (m42647e(context)) {
                startService = C10190x.m42654e(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf);
            Log.e("FirebaseInstanceId", sb2.toString());
            return HttpStatus.SC_PAYMENT_REQUIRED;
        } catch (SecurityException e11) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e11);
            return HttpStatus.SC_UNAUTHORIZED;
        }
    }

    /* renamed from: c */
    public Intent m42645c() {
        return this.f46660d.poll();
    }

    /* renamed from: d */
    public boolean m42646d(Context context) {
        if (this.f46659c == null) {
            this.f46659c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f46658b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f46659c.booleanValue();
    }

    /* renamed from: e */
    public boolean m42647e(Context context) {
        if (this.f46658b == null) {
            this.f46658b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f46658b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f46658b.booleanValue();
    }

    /* renamed from: f */
    public final String m42648f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        synchronized (this) {
            String str3 = this.f46657a;
            if (str3 != null) {
                return str3;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService == null || (serviceInfo = resolveService.serviceInfo) == null) {
                Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
                return null;
            }
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(InstructionFileId.DOT)) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    str2 = serviceInfo.name;
                }
                this.f46657a = str2;
                return this.f46657a;
            }
            String str4 = serviceInfo.packageName;
            String str5 = serviceInfo.name;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 94 + String.valueOf(str5).length());
            sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb2.append(str4);
            sb2.append("/");
            sb2.append(str5);
            Log.e("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    /* renamed from: g */
    public int m42649g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.f46660d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m42644a(context, intent2);
    }
}
