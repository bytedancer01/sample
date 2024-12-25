package p304r9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import p200l9.C5747b0;
import p350u9.C8808d;
import p350u9.C8822k;
import p422y9.AbstractC9911g;
import p422y9.C9902d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/i0.class
 */
/* renamed from: r9.i0 */
/* loaded from: combined.jar:classes2.jar:r9/i0.class */
public final class C8030i0 extends AbstractC9911g {
    public C8030i0(Context context, Looper looper, C9902d c9902d, GoogleApiClient.InterfaceC2412b interfaceC2412b, GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        super(context, looper, 161, c9902d, interfaceC2412b, interfaceC2413c);
    }

    @Override // p422y9.AbstractC9899c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        C8035l c8035l;
        if (iBinder == null) {
            c8035l = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
            c8035l = queryLocalInterface instanceof C8035l ? (C8035l) queryLocalInterface : new C8035l(iBinder);
        }
        return c8035l;
    }

    @Override // p422y9.AbstractC9899c
    public final C8808d[] getApiFeatures() {
        return C5747b0.f32198n;
    }

    @Override // p422y9.AbstractC9899c, com.google.android.gms.common.api.C2414a.f
    public final int getMinApkVersion() {
        return C8822k.f40857a;
    }

    @Override // p422y9.AbstractC9899c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // p422y9.AbstractC9899c
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // p422y9.AbstractC9899c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
