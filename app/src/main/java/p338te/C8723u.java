package p338te;

import android.os.Looper;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/u.class
 */
/* renamed from: te.u */
/* loaded from: combined.jar:classes2.jar:te/u.class */
public class C8723u {
    /* renamed from: a */
    public static void m37274a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
