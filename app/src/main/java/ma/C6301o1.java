package ma;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/o1.class
 */
/* renamed from: ma.o1 */
/* loaded from: combined.jar:classes2.jar:ma/o1.class */
public final class C6301o1 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final C6322p1 f33919a;

    public C6301o1(C6322p1 c6322p1) {
        this.f33919a = c6322p1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.f33919a.m29948e(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C6322p1.m29946c(this.f33919a, network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        C6322p1.m29945b(this.f33919a);
    }
}
