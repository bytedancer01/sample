package p011aa;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import la.C5830d;
import p350u9.C8808d;
import p383w9.InterfaceC9452e;
import p383w9.InterfaceC9487l;
import p422y9.AbstractC9911g;
import p422y9.C9902d;
import p422y9.C9956v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:aa/e.class
 */
/* renamed from: aa.e */
/* loaded from: combined.jar:classes2.jar:aa/e.class */
public final class C0140e extends AbstractC9911g<C0136a> {

    /* renamed from: b */
    public final C9956v f627b;

    public C0140e(Context context, Looper looper, C9902d c9902d, C9956v c9956v, InterfaceC9452e interfaceC9452e, InterfaceC9487l interfaceC9487l) {
        super(context, looper, 270, c9902d, interfaceC9452e, interfaceC9487l);
        this.f627b = c9956v;
    }

    @Override // p422y9.AbstractC9899c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        C0136a c0136a;
        if (iBinder == null) {
            c0136a = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            c0136a = queryLocalInterface instanceof C0136a ? (C0136a) queryLocalInterface : new C0136a(iBinder);
        }
        return c0136a;
    }

    @Override // p422y9.AbstractC9899c
    public final C8808d[] getApiFeatures() {
        return C5830d.f32452b;
    }

    @Override // p422y9.AbstractC9899c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f627b.m41887d();
    }

    @Override // p422y9.AbstractC9899c, com.google.android.gms.common.api.C2414a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // p422y9.AbstractC9899c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p422y9.AbstractC9899c
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p422y9.AbstractC9899c
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
