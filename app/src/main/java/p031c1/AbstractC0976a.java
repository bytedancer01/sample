package p031c1;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c1/a.class
 */
@Deprecated
/* renamed from: c1.a */
/* loaded from: combined.jar:classes1.jar:c1/a.class */
public abstract class AbstractC0976a extends BroadcastReceiver {

    /* renamed from: b */
    public static final SparseArray<PowerManager.WakeLock> f6725b = new SparseArray<>();

    /* renamed from: c */
    public static int f6726c = 1;

    /* renamed from: b */
    public static boolean m5832b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f6725b;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m5833c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f6725b;
        synchronized (sparseArray) {
            int i10 = f6726c;
            int i11 = i10 + 1;
            f6726c = i11;
            if (i11 <= 0) {
                f6726c = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i10);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            sparseArray.put(i10, newWakeLock);
            return startService;
        }
    }
}
