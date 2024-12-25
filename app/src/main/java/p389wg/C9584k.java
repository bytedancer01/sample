package p389wg;

import java.util.concurrent.CountDownLatch;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/k.class
 */
/* renamed from: wg.k */
/* loaded from: combined.jar:classes2.jar:wg/k.class */
public final class C9584k {

    /* renamed from: a */
    public final CountDownLatch f43655a = new CountDownLatch(1);

    /* renamed from: b */
    public long f43656b = -1;

    /* renamed from: c */
    public long f43657c = -1;

    /* renamed from: a */
    public void m40274a() {
        if (this.f43657c == -1) {
            long j10 = this.f43656b;
            if (j10 != -1) {
                this.f43657c = j10 - 1;
                this.f43655a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void m40275b() {
        if (this.f43657c != -1 || this.f43656b == -1) {
            throw new IllegalStateException();
        }
        this.f43657c = System.nanoTime();
        this.f43655a.countDown();
    }

    /* renamed from: c */
    public void m40276c() {
        if (this.f43656b != -1) {
            throw new IllegalStateException();
        }
        this.f43656b = System.nanoTime();
    }
}
