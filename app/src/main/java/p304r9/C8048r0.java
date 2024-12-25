package p304r9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.GoogleApiClient;
import p200l9.C5747b0;
import p350u9.C8808d;
import p422y9.AbstractC9911g;
import p422y9.C9902d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/r0.class
 */
/* renamed from: r9.r0 */
/* loaded from: combined.jar:classes2.jar:r9/r0.class */
public final class C8048r0 extends AbstractC9911g {

    /* renamed from: f */
    public static final C8015b f38878f = new C8015b("CastClientImplCxless");

    /* renamed from: b */
    public final CastDevice f38879b;

    /* renamed from: c */
    public final long f38880c;

    /* renamed from: d */
    public final Bundle f38881d;

    /* renamed from: e */
    public final String f38882e;

    public C8048r0(Context context, Looper looper, C9902d c9902d, CastDevice castDevice, long j10, Bundle bundle, String str, GoogleApiClient.InterfaceC2412b interfaceC2412b, GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        super(context, looper, 10, c9902d, interfaceC2412b, interfaceC2413c);
        this.f38879b = castDevice;
        this.f38880c = j10;
        this.f38881d = bundle;
        this.f38882e = str;
    }

    @Override // p422y9.AbstractC9899c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        C8029i c8029i;
        if (iBinder == null) {
            c8029i = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            c8029i = queryLocalInterface instanceof C8029i ? (C8029i) queryLocalInterface : new C8029i(iBinder);
        }
        return c8029i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p422y9.AbstractC9899c, com.google.android.gms.common.api.C2414a.f
    public final void disconnect() {
        try {
            try {
                ((C8029i) getService()).m34902d();
            } catch (RemoteException | IllegalStateException e10) {
                f38878f.m34874b(e10, "Error while disconnecting the controller interface", new Object[0]);
            }
        } finally {
            super.disconnect();
        }
    }

    @Override // p422y9.AbstractC9899c
    public final C8808d[] getApiFeatures() {
        return C5747b0.f32198n;
    }

    @Override // p422y9.AbstractC9899c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f38878f.m34873a("getRemoteService()", new Object[0]);
        this.f38879b.m13046X(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f38880c);
        bundle.putString("connectionless_client_record_id", this.f38882e);
        Bundle bundle2 = this.f38881d;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // p422y9.AbstractC9899c, com.google.android.gms.common.api.C2414a.f
    public final int getMinApkVersion() {
        return 19390000;
    }

    @Override // p422y9.AbstractC9899c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
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
