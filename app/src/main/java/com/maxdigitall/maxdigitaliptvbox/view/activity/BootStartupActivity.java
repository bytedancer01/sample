package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BootStartupActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BootStartupActivity.class */
public class BootStartupActivity extends BroadcastReceiver {

    /* renamed from: a */
    public SharedPreferences f16998a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
        this.f16998a = sharedPreferences;
        if (sharedPreferences.getBoolean("auto_start", true) && intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            Intent intent2 = new Intent(context, (Class<?>) SplashActivity.class);
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        }
    }
}
