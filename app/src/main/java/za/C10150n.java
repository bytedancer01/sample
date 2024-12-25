package za;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/n.class
 */
/* renamed from: za.n */
/* loaded from: combined.jar:classes2.jar:za/n.class */
public final class C10150n implements InterfaceC10151o {

    /* renamed from: a */
    public final CountDownLatch f46574a = new CountDownLatch(1);

    public /* synthetic */ C10150n(C10149m c10149m) {
    }

    /* renamed from: a */
    public final void m42590a() {
        this.f46574a.await();
    }

    @Override // za.InterfaceC10132c
    /* renamed from: b */
    public final void mo42548b() {
        this.f46574a.countDown();
    }

    /* renamed from: c */
    public final boolean m42591c(long j10, TimeUnit timeUnit) {
        return this.f46574a.await(j10, timeUnit);
    }

    @Override // za.InterfaceC10136e
    public final void onFailure(Exception exc) {
        this.f46574a.countDown();
    }

    @Override // za.InterfaceC10138f
    public final void onSuccess(Object obj) {
        this.f46574a.countDown();
    }
}
