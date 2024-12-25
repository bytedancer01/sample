package kg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kg/a.class
 */
/* renamed from: kg.a */
/* loaded from: combined.jar:classes2.jar:kg/a.class */
public class C5603a {
    /* renamed from: a */
    public static boolean m27660a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        boolean z10 = false;
        if (queryBroadcastReceivers != null) {
            z10 = false;
            if (queryBroadcastReceivers.size() > 0) {
                z10 = true;
            }
        }
        return z10;
    }
}
