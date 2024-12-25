package p030c0;

import android.os.Bundle;
import android.os.IBinder;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c0/k.class
 */
/* renamed from: c0.k */
/* loaded from: combined.jar:classes1.jar:c0/k.class */
public final class C0950k {
    /* renamed from: a */
    public static IBinder m5671a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    /* renamed from: b */
    public static void m5672b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
