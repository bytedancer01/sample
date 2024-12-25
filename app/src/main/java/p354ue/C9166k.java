package p354ue;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ue/k.class
 */
/* renamed from: ue.k */
/* loaded from: combined.jar:classes2.jar:ue/k.class */
public class C9166k {

    /* renamed from: e */
    public static C9166k f41929e;

    /* renamed from: a */
    public Handler f41930a;

    /* renamed from: b */
    public HandlerThread f41931b;

    /* renamed from: c */
    public int f41932c = 0;

    /* renamed from: d */
    public final Object f41933d = new Object();

    /* renamed from: d */
    public static C9166k m38590d() {
        if (f41929e == null) {
            f41929e = new C9166k();
        }
        return f41929e;
    }

    /* renamed from: a */
    public final void m38591a() {
        synchronized (this.f41933d) {
            if (this.f41930a == null) {
                if (this.f41932c <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread = new HandlerThread("CameraThread");
                this.f41931b = handlerThread;
                handlerThread.start();
                this.f41930a = new Handler(this.f41931b.getLooper());
            }
        }
    }

    /* renamed from: b */
    public void m38592b() {
        synchronized (this.f41933d) {
            int i10 = this.f41932c - 1;
            this.f41932c = i10;
            if (i10 == 0) {
                m38595f();
            }
        }
    }

    /* renamed from: c */
    public void m38593c(Runnable runnable) {
        synchronized (this.f41933d) {
            m38591a();
            this.f41930a.post(runnable);
        }
    }

    /* renamed from: e */
    public void m38594e(Runnable runnable) {
        synchronized (this.f41933d) {
            this.f41932c++;
            m38593c(runnable);
        }
    }

    /* renamed from: f */
    public final void m38595f() {
        synchronized (this.f41933d) {
            this.f41931b.quit();
            this.f41931b = null;
            this.f41930a = null;
        }
    }
}
