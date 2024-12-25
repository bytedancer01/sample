package id;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C2574d;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p030c0.C0964r;
import p050d0.C4290b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/a.class
 */
/* renamed from: id.a */
/* loaded from: combined.jar:classes2.jar:id/a.class */
public final class C5219a {

    /* renamed from: a */
    public static final AtomicInteger f29908a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:id/a$a.class
     */
    /* renamed from: id.a$a */
    /* loaded from: combined.jar:classes2.jar:id/a$a.class */
    public static class a {

        /* renamed from: a */
        public final C0964r.e f29909a;

        /* renamed from: b */
        public final String f29910b;

        /* renamed from: c */
        public final int f29911c = 0;

        public a(C0964r.e eVar, String str, int i10) {
            this.f29909a = eVar;
            this.f29910b = str;
        }
    }

    /* renamed from: a */
    public static PendingIntent m26069a(Context context, C2574d c2574d, String str, PackageManager packageManager) {
        Intent m26074f = m26074f(str, c2574d, packageManager);
        if (m26074f == null) {
            return null;
        }
        m26074f.addFlags(67108864);
        m26074f.putExtras(c2574d.m14380y());
        PendingIntent activity = PendingIntent.getActivity(context, m26075g(), m26074f, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
        return m26084p(c2574d) ? m26085q(context, c2574d, activity) : activity;
    }

    /* renamed from: b */
    public static PendingIntent m26070b(Context context, C2574d c2574d) {
        if (m26084p(c2574d)) {
            return m26071c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c2574d.m14379x()));
        }
        return null;
    }

    /* renamed from: c */
    public static PendingIntent m26071c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m26075g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
    }

    /* renamed from: d */
    public static a m26072d(Context context, C2574d c2574d) {
        Bundle m26078j = m26078j(context.getPackageManager(), context.getPackageName());
        return m26073e(context, context.getPackageName(), c2574d, m26079k(context, c2574d.m14370k(), m26078j), context.getResources(), context.getPackageManager(), m26078j);
    }

    /* renamed from: e */
    public static a m26073e(Context context, String str, C2574d c2574d, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        C0964r.e eVar = new C0964r.e(context, str2);
        String m14373n = c2574d.m14373n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(m14373n)) {
            eVar.m5783n(m14373n);
        }
        String m14373n2 = c2574d.m14373n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(m14373n2)) {
            eVar.m5782m(m14373n2);
            eVar.m5766F(new C0964r.c().m5758h(m14373n2));
        }
        eVar.m5764D(m26080l(packageManager, resources, str, c2574d.m14375p("gcm.n.icon"), bundle));
        Uri m26081m = m26081m(str, c2574d, resources);
        if (m26081m != null) {
            eVar.m5765E(m26081m);
        }
        eVar.m5781l(m26069a(context, c2574d, str, packageManager));
        PendingIntent m26070b = m26070b(context, c2574d);
        if (m26070b != null) {
            eVar.m5785p(m26070b);
        }
        Integer m26076h = m26076h(context, c2574d.m14375p("gcm.n.color"), bundle);
        if (m26076h != null) {
            eVar.m5779j(m26076h.intValue());
        }
        eVar.m5777h(!c2574d.m14361a("gcm.n.sticky"));
        eVar.m5792w(c2574d.m14361a("gcm.n.local_only"));
        String m14375p = c2574d.m14375p("gcm.n.ticker");
        if (m14375p != null) {
            eVar.m5767G(m14375p);
        }
        Integer m14372m = c2574d.m14372m();
        if (m14372m != null) {
            eVar.m5761A(m14372m.intValue());
        }
        Integer m14377r = c2574d.m14377r();
        if (m14377r != null) {
            eVar.m5769I(m14377r.intValue());
        }
        Integer m14371l = c2574d.m14371l();
        if (m14371l != null) {
            eVar.m5793x(m14371l.intValue());
        }
        Long m14369j = c2574d.m14369j("gcm.n.event_time");
        if (m14369j != null) {
            eVar.m5763C(true);
            eVar.m5770J(m14369j.longValue());
        }
        long[] m14376q = c2574d.m14376q();
        if (m14376q != null) {
            eVar.m5768H(m14376q);
        }
        int[] m14364e = c2574d.m14364e();
        if (m14364e != null) {
            eVar.m5791v(m14364e[0], m14364e[1], m14364e[2]);
        }
        eVar.m5784o(m26077i(c2574d));
        return new a(eVar, m26082n(c2574d), 0);
    }

    /* renamed from: f */
    public static Intent m26074f(String str, C2574d c2574d, PackageManager packageManager) {
        String m14375p = c2574d.m14375p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m14375p)) {
            Intent intent = new Intent(m14375p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m14365f = c2574d.m14365f();
        if (m14365f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m14365f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    public static int m26075g() {
        return f29908a.incrementAndGet();
    }

    /* renamed from: h */
    public static Integer m26076h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException e10) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 56);
                sb2.append("Color is invalid: ");
                sb2.append(str);
                sb2.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C4290b.m21724c(context, i10));
        } catch (Resources.NotFoundException e11) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* renamed from: i */
    public static int m26077i(C2574d c2574d) {
        boolean m14361a = c2574d.m14361a("gcm.n.default_sound");
        int i10 = m14361a ? 1 : 0;
        if (c2574d.m14361a("gcm.n.default_vibrate_timings")) {
            i10 = (m14361a ? 1 : 0) | 2;
        }
        return c2574d.m14361a("gcm.n.default_light_settings") ? i10 | 4 : i10;
    }

    /* renamed from: j */
    public static Bundle m26078j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
            sb2.append("Couldn't get own application info: ");
            sb2.append(valueOf);
            Log.w("FirebaseMessaging", sb2.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: k */
    public static String m26079k(Context context, String str, Bundle bundle) {
        Object systemService;
        String str2;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            systemService = context.getSystemService((Class<Object>) NotificationManager.class);
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 122);
                sb2.append("Notification Channel requested (");
                sb2.append(str);
                sb2.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb2.toString());
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel != null) {
                return "fcm_fallback_notification_channel";
            }
            int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
            if (identifier == 0) {
                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                string = "Misc";
            } else {
                string = context.getString(identifier);
            }
            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException e10) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (m26083o(r6, r0) == false) goto L35;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m26080l(android.content.pm.PackageManager r5, android.content.res.Resources r6, java.lang.String r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: id.C5219a.m26080l(android.content.pm.PackageManager, android.content.res.Resources, java.lang.String, java.lang.String, android.os.Bundle):int");
    }

    /* renamed from: m */
    public static Uri m26081m(String str, C2574d c2574d, Resources resources) {
        String m14374o = c2574d.m14374o();
        if (TextUtils.isEmpty(m14374o)) {
            return null;
        }
        if (CookieSpecs.DEFAULT.equals(m14374o) || resources.getIdentifier(m14374o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(m14374o).length());
        sb2.append("android.resource://");
        sb2.append(str);
        sb2.append("/raw/");
        sb2.append(m14374o);
        return Uri.parse(sb2.toString());
    }

    /* renamed from: n */
    public static String m26082n(C2574d c2574d) {
        String m14375p = c2574d.m14375p("gcm.n.tag");
        if (!TextUtils.isEmpty(m14375p)) {
            return m14375p;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("FCM-Notification:");
        sb2.append(uptimeMillis);
        return sb2.toString();
    }

    @TargetApi(26)
    /* renamed from: o */
    public static boolean m26083o(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb2.append(i10);
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        } catch (Resources.NotFoundException e10) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Couldn't find resource ");
            sb3.append(i10);
            sb3.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb3.toString());
            return false;
        }
    }

    /* renamed from: p */
    public static boolean m26084p(C2574d c2574d) {
        return c2574d.m14361a("google.c.a.e");
    }

    /* renamed from: q */
    public static PendingIntent m26085q(Context context, C2574d c2574d, PendingIntent pendingIntent) {
        return m26071c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(c2574d.m14379x()).putExtra("pending_intent", pendingIntent));
    }
}
