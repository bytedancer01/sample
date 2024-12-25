package ua;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p305ra.InterfaceC8388vd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/ha.class
 */
/* renamed from: ua.ha */
/* loaded from: combined.jar:classes2.jar:ua/ha.class */
public final class C8935ha implements InterfaceC8883d6 {

    /* renamed from: a */
    public final InterfaceC8388vd f41172a;

    /* renamed from: b */
    public final AppMeasurementDynamiteService f41173b;

    public C8935ha(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC8388vd interfaceC8388vd) {
        this.f41173b = appMeasurementDynamiteService;
        this.f41172a = interfaceC8388vd;
    }

    @Override // ua.InterfaceC8883d6
    /* renamed from: a */
    public final void mo37808a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f41172a.mo35954F(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            this.f41173b.f14864b.mo37780c().m38411r().m38327b("Event interceptor threw exception", e10);
        }
    }
}
