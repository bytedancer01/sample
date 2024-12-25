package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.notifications;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Patterns;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p030c0.C0964r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/notifications/NotificationUtils.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/notifications/NotificationUtils.class */
public class NotificationUtils {

    /* renamed from: a */
    public Context f16340a;

    public NotificationUtils(Context context) {
        this.f16340a = context;
    }

    /* renamed from: b */
    public static boolean m14717b(Context context) {
        boolean z10 = true;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.importance == 100) {
                String[] strArr = runningAppProcessInfo.pkgList;
                int length = strArr.length;
                int i10 = 0;
                boolean z11 = z10;
                while (true) {
                    z10 = z11;
                    if (i10 < length) {
                        if (strArr[i10].equals(context.getPackageName())) {
                            z11 = false;
                        }
                        i10++;
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: a */
    public Bitmap m14718a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public void m14719c() {
        try {
            RingtoneManager.getRingtone(this.f16340a, Uri.parse("android.resource://" + this.f16340a.getPackageName() + "/raw/notification")).play();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void m14720d(Bitmap bitmap, C0964r.e eVar, int i10, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        Notification m5773c;
        Notification.Builder channelId;
        new C0964r.b();
        NotificationManager notificationManager = (NotificationManager) this.f16340a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        C0964r.e eVar2 = new C0964r.e(this.f16340a);
        if (Build.VERSION.SDK_INT >= 26) {
            new C0964r.g().m5797h(str2);
            NotificationChannel notificationChannel = new NotificationChannel("ksjadf87", this.f16340a.getResources().getString(2132018447), 2);
            channelId = new Notification.Builder(this.f16340a).setContentTitle(str).setContentText(str2).setAutoCancel(true).setSound(uri).setContentIntent(pendingIntent).setSmallIcon(2131755009).setChannelId("ksjadf87");
            m5773c = channelId.build();
            notificationManager.createNotificationChannel(notificationChannel);
        } else {
            C0964r.g gVar = new C0964r.g();
            gVar.m5797h(str2);
            eVar2.m5783n(str).m5782m(str2).m5777h(true).m5765E(uri).m5766F(gVar).m5781l(pendingIntent).m5764D(2131755009);
            m5773c = eVar2.m5773c();
        }
        notificationManager.notify(234231, m5773c);
    }

    /* renamed from: e */
    public void m14721e(String str, String str2, String str3, Intent intent) {
        m14722f(str, str2, str3, intent, null);
    }

    /* renamed from: f */
    public void m14722f(String str, String str2, String str3, Intent intent, String str4) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        intent.setFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(this.f16340a, 0, intent, 134217728);
        C0964r.e eVar = new C0964r.e(this.f16340a);
        Uri parse = Uri.parse("android.resource://" + this.f16340a.getPackageName() + "/raw/notification");
        if (TextUtils.isEmpty(str4)) {
            m14723g(eVar, 2131755009, str, str2, str3, activity, parse);
            m14719c();
        } else {
            if (str4 == null || str4.length() <= 4 || !Patterns.WEB_URL.matcher(str4).matches()) {
                return;
            }
            Bitmap m14718a = m14718a(str4);
            if (m14718a != null) {
                m14720d(m14718a, eVar, 2131755009, str, str2, str3, activity, parse);
            } else {
                m14723g(eVar, 2131755009, str, str2, str3, activity, parse);
            }
        }
    }

    /* renamed from: g */
    public final void m14723g(C0964r.e eVar, int i10, String str, String str2, String str3, PendingIntent pendingIntent, Uri uri) {
        Notification m5773c;
        Notification.Builder channelId;
        NotificationManager notificationManager = (NotificationManager) this.f16340a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        C0964r.e eVar2 = new C0964r.e(this.f16340a);
        if (Build.VERSION.SDK_INT >= 26) {
            new C0964r.g().m5797h(str2);
            NotificationChannel notificationChannel = new NotificationChannel("ksjadf87", this.f16340a.getResources().getString(2132018447), 2);
            channelId = new Notification.Builder(this.f16340a).setContentTitle(str).setContentText(str2).setAutoCancel(true).setSound(uri).setContentIntent(pendingIntent).setSmallIcon(2131755009).setChannelId("ksjadf87");
            m5773c = channelId.build();
            notificationManager.createNotificationChannel(notificationChannel);
        } else {
            C0964r.g gVar = new C0964r.g();
            gVar.m5797h(str2);
            eVar2.m5783n(str).m5782m(str2).m5777h(true).m5765E(uri).m5766F(gVar).m5781l(pendingIntent).m5764D(2131755009);
            m5773c = eVar2.m5773c();
        }
        notificationManager.notify(234231, m5773c);
    }
}
