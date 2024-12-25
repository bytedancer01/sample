package p383w9;

import java.util.concurrent.locks.Lock;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/w0.class
 */
/* renamed from: w9.w0 */
/* loaded from: combined.jar:classes2.jar:w9/w0.class */
public abstract class AbstractC9536w0 {

    /* renamed from: a */
    public final InterfaceC9532v0 f43474a;

    public AbstractC9536w0(InterfaceC9532v0 interfaceC9532v0) {
        this.f43474a = interfaceC9532v0;
    }

    /* renamed from: a */
    public abstract void mo39797a();

    /* renamed from: b */
    public final void m40071b(C9544y0 c9544y0) {
        Lock lock;
        Lock lock2;
        InterfaceC9532v0 interfaceC9532v0;
        lock = c9544y0.f43491b;
        lock.lock();
        try {
            interfaceC9532v0 = c9544y0.f43501l;
            if (interfaceC9532v0 == this.f43474a) {
                mo39797a();
            }
        } finally {
            lock2 = c9544y0.f43491b;
            lock2.unlock();
        }
    }
}
