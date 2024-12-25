package p191l0;

import android.os.Handler;
import android.os.Looper;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l0/b.class
 */
/* renamed from: l0.b */
/* loaded from: combined.jar:classes1.jar:l0/b.class */
public class C5639b {
    /* renamed from: a */
    public static Handler m27824a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
