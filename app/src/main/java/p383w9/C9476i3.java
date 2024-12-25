package p383w9;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import p350u9.C8804b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/i3.class
 */
/* renamed from: w9.i3 */
/* loaded from: combined.jar:classes2.jar:w9/i3.class */
public final class C9476i3 implements InterfaceC9504o1 {

    /* renamed from: a */
    public final C9523t f43298a;

    public /* synthetic */ C9476i3(C9523t c9523t, C9471h3 c9471h3) {
        this.f43298a = c9523t;
    }

    @Override // p383w9.InterfaceC9504o1
    /* renamed from: a */
    public final void mo39926a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f43298a.f43429n;
        lock.lock();
        try {
            C9523t.m40042u(this.f43298a, bundle);
            this.f43298a.f43426k = C8804b.f40818h;
            C9523t.m40043v(this.f43298a);
        } finally {
            lock2 = this.f43298a.f43429n;
            lock2.unlock();
        }
    }

    @Override // p383w9.InterfaceC9504o1
    /* renamed from: b */
    public final void mo39927b(C8804b c8804b) {
        Lock lock;
        Lock lock2;
        lock = this.f43298a.f43429n;
        lock.lock();
        try {
            this.f43298a.f43426k = c8804b;
            C9523t.m40043v(this.f43298a);
        } finally {
            lock2 = this.f43298a.f43429n;
            lock2.unlock();
        }
    }

    @Override // p383w9.InterfaceC9504o1
    /* renamed from: c */
    public final void mo39928c(int i10, boolean z10) {
        Lock lock;
        Lock lock2;
        boolean z11;
        C8804b c8804b;
        C8804b c8804b2;
        C9544y0 c9544y0;
        lock = this.f43298a.f43429n;
        lock.lock();
        try {
            C9523t c9523t = this.f43298a;
            z11 = c9523t.f43428m;
            if (!z11) {
                c8804b = c9523t.f43427l;
                if (c8804b != null) {
                    c8804b2 = c9523t.f43427l;
                    if (c8804b2.m37663T()) {
                        this.f43298a.f43428m = true;
                        c9544y0 = this.f43298a.f43421f;
                        c9544y0.onConnectionSuspended(i10);
                    }
                }
            }
            this.f43298a.f43428m = false;
            C9523t.m40041t(this.f43298a, i10, z10);
        } finally {
            lock2 = this.f43298a.f43429n;
            lock2.unlock();
        }
    }
}
