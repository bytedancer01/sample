package ua;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p305ra.InterfaceC8358td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/ga.class
 */
/* renamed from: ua.ga */
/* loaded from: combined.jar:classes2.jar:ua/ga.class */
public final class RunnableC8923ga implements Runnable {

    /* renamed from: b */
    public final InterfaceC8358td f41138b;

    /* renamed from: c */
    public final AppMeasurementDynamiteService f41139c;

    public RunnableC8923ga(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC8358td interfaceC8358td) {
        this.f41139c = appMeasurementDynamiteService;
        this.f41138b = interfaceC8358td;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41139c.f14864b.m37765G().m37843V(this.f41138b, this.f41139c.f14864b.m37786j());
    }
}
