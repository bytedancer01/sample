package p383w9;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import p350u9.C8804b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/u2.class
 */
/* renamed from: w9.u2 */
/* loaded from: combined.jar:classes2.jar:w9/u2.class */
public final class C9530u2 implements GoogleApiClient.InterfaceC2413c {

    /* renamed from: b */
    public final int f43462b;

    /* renamed from: c */
    public final GoogleApiClient f43463c;

    /* renamed from: d */
    public final GoogleApiClient.InterfaceC2413c f43464d;

    /* renamed from: e */
    public final C9534v2 f43465e;

    public C9530u2(C9534v2 c9534v2, int i10, GoogleApiClient googleApiClient, GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        this.f43465e = c9534v2;
        this.f43462b = i10;
        this.f43463c = googleApiClient;
        this.f43464d = interfaceC2413c;
    }

    @Override // p383w9.InterfaceC9487l
    public final void onConnectionFailed(C8804b c8804b) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(c8804b)));
        this.f43465e.m39808s(c8804b, this.f43462b);
    }
}
