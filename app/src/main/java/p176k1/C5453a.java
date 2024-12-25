package p176k1;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k1/a.class
 */
/* renamed from: k1.a */
/* loaded from: combined.jar:classes1.jar:k1/a.class */
public class C5453a extends BroadcastReceiver {
    /* renamed from: a */
    public static ComponentName m27209a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (queryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }
}
