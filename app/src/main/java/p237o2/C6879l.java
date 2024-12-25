package p237o2;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;
import p071e2.AbstractC4582k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o2/l.class
 */
/* renamed from: o2.l */
/* loaded from: combined.jar:classes1.jar:o2/l.class */
public class C6879l {

    /* renamed from: a */
    public static final String f35648a = AbstractC4582k.m23128f("WakeLocks");

    /* renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f35649b = new WeakHashMap<>();

    /* renamed from: a */
    public static void m31718a() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f35649b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC4582k.m23126c().mo23133h(f35648a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    /* renamed from: b */
    public static PowerManager.WakeLock m31719b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f35649b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
