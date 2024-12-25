package p059d9;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/d0.class
 */
@SuppressLint({"InlinedApi"})
/* renamed from: d9.d0 */
/* loaded from: combined.jar:classes2.jar:d9/d0.class */
public final class C4357d0 {
    /* renamed from: a */
    public static void m21938a(Context context, String str, int i10, int i11, int i12) {
        if (C4401z0.f26679a >= 26) {
            NotificationManager notificationManager = (NotificationManager) C4349a.m21882e((NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION));
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i10), i12);
            if (i11 != 0) {
                notificationChannel.setDescription(context.getString(i11));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: b */
    public static void m21939b(Context context, int i10, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) C4349a.m21882e((NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION));
        if (notification != null) {
            notificationManager.notify(i10, notification);
        } else {
            notificationManager.cancel(i10);
        }
    }
}
