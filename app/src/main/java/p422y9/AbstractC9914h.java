package p422y9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/h.class
 */
/* renamed from: y9.h */
/* loaded from: combined.jar:classes2.jar:y9/h.class */
public abstract class AbstractC9914h {

    /* renamed from: a */
    public static int f45567a = 4225;

    /* renamed from: b */
    public static final Object f45568b = new Object();

    /* renamed from: c */
    public static C9934n1 f45569c;

    /* renamed from: d */
    public static HandlerThread f45570d;

    /* renamed from: e */
    public static boolean f45571e;

    /* renamed from: a */
    public static int m41789a() {
        return f45567a;
    }

    /* renamed from: b */
    public static AbstractC9914h m41790b(Context context) {
        synchronized (f45568b) {
            if (f45569c == null) {
                f45569c = new C9934n1(context.getApplicationContext(), f45571e ? m41791c().getLooper() : context.getMainLooper());
            }
        }
        return f45569c;
    }

    /* renamed from: c */
    public static HandlerThread m41791c() {
        synchronized (f45568b) {
            HandlerThread handlerThread = f45570d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f45570d = handlerThread2;
            handlerThread2.start();
            return f45570d;
        }
    }

    /* renamed from: d */
    public abstract void mo41792d(C9922j1 c9922j1, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void m41793e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        mo41792d(new C9922j1(str, str2, i10, z10), serviceConnection, str3);
    }

    /* renamed from: f */
    public abstract boolean mo41794f(C9922j1 c9922j1, ServiceConnection serviceConnection, String str, Executor executor);
}
