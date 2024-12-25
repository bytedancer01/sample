package p363v4;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v4/d.class
 */
/* renamed from: v4.d */
/* loaded from: combined.jar:classes1.jar:v4/d.class */
public final class C9238d {

    /* renamed from: a */
    public static final double f42228a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m38951a(long j10) {
        return (m38952b() - j10) * f42228a;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m38952b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
