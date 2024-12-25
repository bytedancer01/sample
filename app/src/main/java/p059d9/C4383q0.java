package p059d9;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/q0.class
 */
/* renamed from: d9.q0 */
/* loaded from: combined.jar:classes2.jar:d9/q0.class */
public class C4383q0 implements InterfaceC4354c {
    @Override // p059d9.InterfaceC4354c
    /* renamed from: b */
    public long mo21913b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p059d9.InterfaceC4354c
    /* renamed from: c */
    public long mo21914c() {
        return SystemClock.uptimeMillis();
    }

    @Override // p059d9.InterfaceC4354c
    /* renamed from: d */
    public InterfaceC4380p mo21915d(Looper looper, Handler.Callback callback) {
        return new C4385r0(new Handler(looper, callback));
    }

    @Override // p059d9.InterfaceC4354c
    /* renamed from: e */
    public void mo21916e() {
    }
}
