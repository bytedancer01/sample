package p127h9;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h9/c.class
 */
/* renamed from: h9.c */
/* loaded from: combined.jar:classes2.jar:h9/c.class */
public final class C5045c extends Thread {

    /* renamed from: b */
    public final WeakReference<C5043a> f29119b;

    /* renamed from: c */
    public final long f29120c;

    /* renamed from: d */
    public final CountDownLatch f29121d = new CountDownLatch(1);

    /* renamed from: e */
    public boolean f29122e = false;

    public C5045c(C5043a c5043a, long j10) {
        this.f29119b = new WeakReference<>(c5043a);
        this.f29120c = j10;
        start();
    }

    /* renamed from: a */
    public final void m25272a() {
        C5043a c5043a = this.f29119b.get();
        if (c5043a != null) {
            c5043a.m25266e();
            this.f29122e = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f29121d.await(this.f29120c, TimeUnit.MILLISECONDS)) {
                return;
            }
            m25272a();
        } catch (InterruptedException e10) {
            m25272a();
        }
    }
}
