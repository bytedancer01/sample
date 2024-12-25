package ua;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p305ra.InterfaceC8358td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/h7.class
 */
/* renamed from: ua.h7 */
/* loaded from: combined.jar:classes2.jar:ua/h7.class */
public final class RunnableC8932h7 implements Runnable {

    /* renamed from: b */
    public final InterfaceC8358td f41159b;

    /* renamed from: c */
    public final C9068t f41160c;

    /* renamed from: d */
    public final String f41161d;

    /* renamed from: e */
    public final AppMeasurementDynamiteService f41162e;

    public RunnableC8932h7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC8358td interfaceC8358td, C9068t c9068t, String str) {
        this.f41162e = appMeasurementDynamiteService;
        this.f41159b = interfaceC8358td;
        this.f41160c = c9068t;
        this.f41161d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41162e.f14864b.m37776R().m38313u(this.f41159b, this.f41160c, this.f41161d);
    }
}
