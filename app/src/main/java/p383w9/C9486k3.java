package p383w9;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import p350u9.C8804b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/k3.class
 */
/* renamed from: w9.k3 */
/* loaded from: combined.jar:classes2.jar:w9/k3.class */
public final class C9486k3 implements InterfaceC9504o1 {

    /* renamed from: a */
    public final C9523t f43325a;

    public /* synthetic */ C9486k3(C9523t c9523t, C9481j3 c9481j3) {
        this.f43325a = c9523t;
    }

    @Override // p383w9.InterfaceC9504o1
    /* renamed from: a */
    public final void mo39926a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f43325a.f43429n;
        lock.lock();
        try {
            this.f43325a.f43427l = C8804b.f40818h;
            C9523t.m40043v(this.f43325a);
        } finally {
            lock2 = this.f43325a.f43429n;
            lock2.unlock();
        }
    }

    @Override // p383w9.InterfaceC9504o1
    /* renamed from: b */
    public final void mo39927b(C8804b c8804b) {
        Lock lock;
        Lock lock2;
        lock = this.f43325a.f43429n;
        lock.lock();
        try {
            this.f43325a.f43427l = c8804b;
            C9523t.m40043v(this.f43325a);
        } finally {
            lock2 = this.f43325a.f43429n;
            lock2.unlock();
        }
    }

    @Override // p383w9.InterfaceC9504o1
    /* renamed from: c */
    public final void mo39928c(int i10, boolean z10) {
        Lock lock;
        Lock lock2;
        boolean z11;
        C9544y0 c9544y0;
        lock = this.f43325a.f43429n;
        lock.lock();
        try {
            C9523t c9523t = this.f43325a;
            z11 = c9523t.f43428m;
            if (z11) {
                c9523t.f43428m = false;
                C9523t.m40041t(this.f43325a, i10, z10);
            } else {
                c9523t.f43428m = true;
                c9544y0 = this.f43325a.f43420e;
                c9544y0.onConnectionSuspended(i10);
            }
        } finally {
            lock2 = this.f43325a.f43429n;
            lock2.unlock();
        }
    }
}
