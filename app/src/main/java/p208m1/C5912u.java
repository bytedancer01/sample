package p208m1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/u.class
 */
/* renamed from: m1.u */
/* loaded from: combined.jar:classes1.jar:m1/u.class */
public final class C5912u extends BroadcastReceiver {
    /* renamed from: a */
    public static boolean m29081a(Context context) {
        Intent intent = new Intent(context, (Class<?>) C5912u.class);
        intent.setPackage(context.getPackageName());
        boolean z10 = false;
        if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
            z10 = true;
        }
        return z10;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
