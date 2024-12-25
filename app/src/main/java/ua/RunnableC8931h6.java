package ua;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p305ra.InterfaceC8358td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/h6.class
 */
/* renamed from: ua.h6 */
/* loaded from: combined.jar:classes2.jar:ua/h6.class */
public final class RunnableC8931h6 implements Runnable {

    /* renamed from: b */
    public final InterfaceC8358td f41157b;

    /* renamed from: c */
    public final AppMeasurementDynamiteService f41158c;

    public RunnableC8931h6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC8358td interfaceC8358td) {
        this.f41158c = appMeasurementDynamiteService;
        this.f41157b = interfaceC8358td;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41158c.f14864b.m37776R().m38304U(this.f41157b);
    }
}
