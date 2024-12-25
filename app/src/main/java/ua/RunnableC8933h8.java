package ua;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p305ra.InterfaceC8358td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/h8.class
 */
/* renamed from: ua.h8 */
/* loaded from: combined.jar:classes2.jar:ua/h8.class */
public final class RunnableC8933h8 implements Runnable {

    /* renamed from: b */
    public final InterfaceC8358td f41163b;

    /* renamed from: c */
    public final String f41164c;

    /* renamed from: d */
    public final String f41165d;

    /* renamed from: e */
    public final boolean f41166e;

    /* renamed from: f */
    public final AppMeasurementDynamiteService f41167f;

    public RunnableC8933h8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC8358td interfaceC8358td, String str, String str2, boolean z10) {
        this.f41167f = appMeasurementDynamiteService;
        this.f41163b = interfaceC8358td;
        this.f41164c = str;
        this.f41165d = str2;
        this.f41166e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41167f.f14864b.m37776R().m38300Q(this.f41163b, this.f41164c, this.f41165d, this.f41166e);
    }
}
