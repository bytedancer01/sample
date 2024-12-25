package p383w9;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.locks.Lock;
import p350u9.C8804b;
import p384wa.InterfaceC9556f;
import p422y9.C9902d;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/m0.class
 */
/* renamed from: w9.m0 */
/* loaded from: combined.jar:classes2.jar:w9/m0.class */
public final class C9493m0 implements GoogleApiClient.InterfaceC2412b, GoogleApiClient.InterfaceC2413c {

    /* renamed from: b */
    public final C9508p0 f43335b;

    public /* synthetic */ C9493m0(C9508p0 c9508p0, C9488l0 c9488l0) {
        this.f43335b = c9508p0;
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnected(Bundle bundle) {
        C9902d c9902d;
        InterfaceC9556f interfaceC9556f;
        c9902d = this.f43335b.f43387r;
        interfaceC9556f = this.f43335b.f43380k;
        ((InterfaceC9556f) C9935o.m41850j(interfaceC9556f)).mo40089a(new BinderC9483k0(this.f43335b));
    }

    @Override // p383w9.InterfaceC9487l
    public final void onConnectionFailed(C8804b c8804b) {
        Lock lock;
        Lock lock2;
        boolean m40008p;
        lock = this.f43335b.f43371b;
        lock.lock();
        try {
            m40008p = this.f43335b.m40008p(c8804b);
            if (m40008p) {
                this.f43335b.m40000h();
                this.f43335b.m40005m();
            } else {
                this.f43335b.m40003k(c8804b);
            }
        } finally {
            lock2 = this.f43335b.f43371b;
            lock2.unlock();
        }
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnectionSuspended(int i10) {
    }
}
