package ua;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p305ra.InterfaceC8388vd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/ia.class
 */
/* renamed from: ua.ia */
/* loaded from: combined.jar:classes2.jar:ua/ia.class */
public final class C8947ia implements InterfaceC8895e6 {

    /* renamed from: a */
    public final InterfaceC8388vd f41192a;

    /* renamed from: b */
    public final AppMeasurementDynamiteService f41193b;

    public C8947ia(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC8388vd interfaceC8388vd) {
        this.f41193b = appMeasurementDynamiteService;
        this.f41192a = interfaceC8388vd;
    }

    @Override // ua.InterfaceC8895e6
    /* renamed from: a */
    public final void mo37815a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f41192a.mo35954F(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            this.f41193b.f14864b.mo37780c().m38411r().m38327b("Event listener threw exception", e10);
        }
    }
}
