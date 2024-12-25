package ca;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ca/c.class
 */
@Deprecated
/* renamed from: ca.c */
/* loaded from: combined.jar:classes2.jar:ca/c.class */
public class C1053c {
    /* renamed from: a */
    public static String m6231a(PowerManager.WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
