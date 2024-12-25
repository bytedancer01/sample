package ua;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p350u9.C8822k;
import p422y9.AbstractC9899c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/u3.class
 */
/* renamed from: ua.u3 */
/* loaded from: combined.jar:classes2.jar:ua/u3.class */
public final class C9084u3 extends AbstractC9899c<InterfaceC9024p3> {
    public C9084u3(Context context, Looper looper, AbstractC9899c.a aVar, AbstractC9899c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [ua.p3] */
    @Override // p422y9.AbstractC9899c
    public final /* bridge */ /* synthetic */ InterfaceC9024p3 createServiceInterface(IBinder iBinder) {
        C9000n3 c9000n3;
        if (iBinder == null) {
            c9000n3 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
            c9000n3 = queryLocalInterface instanceof InterfaceC9024p3 ? (InterfaceC9024p3) queryLocalInterface : new C9000n3(iBinder);
        }
        return c9000n3;
    }

    @Override // p422y9.AbstractC9899c, com.google.android.gms.common.api.C2414a.f
    public final int getMinApkVersion() {
        return C8822k.f40857a;
    }

    @Override // p422y9.AbstractC9899c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p422y9.AbstractC9899c
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
