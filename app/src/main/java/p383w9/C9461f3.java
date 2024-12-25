package p383w9;

import android.os.Bundle;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.GoogleApiClient;
import p350u9.C8804b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/f3.class
 */
/* renamed from: w9.f3 */
/* loaded from: combined.jar:classes2.jar:w9/f3.class */
public final class C9461f3 implements GoogleApiClient.InterfaceC2412b, GoogleApiClient.InterfaceC2413c {

    /* renamed from: b */
    public final C2414a<?> f43260b;

    /* renamed from: c */
    public final boolean f43261c;

    /* renamed from: d */
    public InterfaceC9466g3 f43262d;

    public C9461f3(C2414a<?> c2414a, boolean z10) {
        this.f43260b = c2414a;
        this.f43261c = z10;
    }

    /* renamed from: a */
    public final void m39866a(InterfaceC9466g3 interfaceC9466g3) {
        this.f43262d = interfaceC9466g3;
    }

    /* renamed from: b */
    public final InterfaceC9466g3 m39867b() {
        C9935o.m41851k(this.f43262d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f43262d;
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnected(Bundle bundle) {
        m39867b().onConnected(bundle);
    }

    @Override // p383w9.InterfaceC9487l
    public final void onConnectionFailed(C8804b c8804b) {
        m39867b().mo39892Z(c8804b, this.f43260b, this.f43261c);
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnectionSuspended(int i10) {
        m39867b().onConnectionSuspended(i10);
    }
}
