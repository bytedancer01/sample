package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NotificationActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NotificationActivity.class */
public class NotificationActivity extends Activity {

    /* renamed from: b */
    public SharedPreferences f17902b;

    /* renamed from: c */
    public final String f17903c = "CANCELLED";

    /* renamed from: a */
    public static PendingIntent m16200a(int i10, Context context) {
        Intent intent = new Intent(context, (Class<?>) NotificationActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("NOTIFICATION_ID", i10);
        return PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 67108864 : 268435456);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f17902b = defaultSharedPreferences;
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        edit.putBoolean("CANCELLED", true);
        edit.apply();
        notificationManager.cancel(getIntent().getIntExtra("NOTIFICATION_ID", -1));
        finish();
    }
}
