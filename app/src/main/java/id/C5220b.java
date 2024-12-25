package id;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import com.google.firebase.messaging.C2574d;
import id.C5219a;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p030c0.C0964r;
import p060da.C4414m;
import za.C10148l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/b.class
 */
/* renamed from: id.b */
/* loaded from: combined.jar:classes2.jar:id/b.class */
public class C5220b {

    /* renamed from: a */
    public final Executor f29912a;

    /* renamed from: b */
    public final Context f29913b;

    /* renamed from: c */
    public final C2574d f29914c;

    public C5220b(Context context, C2574d c2574d, Executor executor) {
        this.f29912a = executor;
        this.f29913b = context;
        this.f29914c = c2574d;
    }

    /* renamed from: a */
    public boolean m26086a() {
        if (this.f29914c.m14361a("gcm.n.noui")) {
            return true;
        }
        if (m26087b()) {
            return false;
        }
        C5234p m26089d = m26089d();
        C5219a.a m26072d = C5219a.m26072d(this.f29913b, this.f29914c);
        m26090e(m26072d.f29909a, m26089d);
        m26088c(m26072d);
        return true;
    }

    /* renamed from: b */
    public final boolean m26087b() {
        if (((KeyguardManager) this.f29913b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C4414m.m22455f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f29913b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m26088c(C5219a.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f29913b.getSystemService(TransferService.INTENT_KEY_NOTIFICATION)).notify(aVar.f29910b, aVar.f29911c, aVar.f29909a.m5773c());
    }

    /* renamed from: d */
    public final C5234p m26089d() {
        C5234p m26107o = C5234p.m26107o(this.f29914c.m14375p("gcm.n.image"));
        if (m26107o != null) {
            m26107o.m26111q(this.f29912a);
        }
        return m26107o;
    }

    /* renamed from: e */
    public final void m26090e(C0964r.e eVar, C5234p c5234p) {
        if (c5234p == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) C10148l.m42584b(c5234p.m26110p(), 5L, TimeUnit.SECONDS);
            eVar.m5790u(bitmap);
            eVar.m5766F(new C0964r.b().m5752i(bitmap).m5751h(null));
        } catch (InterruptedException e10) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c5234p.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            String valueOf = String.valueOf(e11.getCause());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
            sb2.append("Failed to download image: ");
            sb2.append(valueOf);
            Log.w("FirebaseMessaging", sb2.toString());
        } catch (TimeoutException e12) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c5234p.close();
        }
    }
}
