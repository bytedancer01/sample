package p422y9;

import android.os.Bundle;
import p383w9.InterfaceC9452e;
import p422y9.AbstractC9899c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/e0.class
 */
/* renamed from: y9.e0 */
/* loaded from: combined.jar:classes2.jar:y9/e0.class */
public final class C9906e0 implements AbstractC9899c.a {

    /* renamed from: b */
    public final InterfaceC9452e f45547b;

    public C9906e0(InterfaceC9452e interfaceC9452e) {
        this.f45547b = interfaceC9452e;
    }

    @Override // p422y9.AbstractC9899c.a
    public final void onConnected(Bundle bundle) {
        this.f45547b.onConnected(bundle);
    }

    @Override // p422y9.AbstractC9899c.a
    public final void onConnectionSuspended(int i10) {
        this.f45547b.onConnectionSuspended(i10);
    }
}
