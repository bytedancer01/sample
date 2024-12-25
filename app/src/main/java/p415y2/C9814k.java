package p415y2;

import android.os.Looper;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y2/k.class
 */
/* renamed from: y2.k */
/* loaded from: combined.jar:classes1.jar:y2/k.class */
public final class C9814k {
    /* renamed from: a */
    public static void m41345a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
    }
}
