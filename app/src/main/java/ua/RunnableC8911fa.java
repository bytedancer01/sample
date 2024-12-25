package ua;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p305ra.InterfaceC8358td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/fa.class
 */
/* renamed from: ua.fa */
/* loaded from: combined.jar:classes2.jar:ua/fa.class */
public final class RunnableC8911fa implements Runnable {

    /* renamed from: b */
    public final InterfaceC8358td f41088b;

    /* renamed from: c */
    public final String f41089c;

    /* renamed from: d */
    public final String f41090d;

    /* renamed from: e */
    public final AppMeasurementDynamiteService f41091e;

    public RunnableC8911fa(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC8358td interfaceC8358td, String str, String str2) {
        this.f41091e = appMeasurementDynamiteService;
        this.f41088b = interfaceC8358td;
        this.f41089c = str;
        this.f41090d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41091e.f14864b.m37776R().m38298O(this.f41088b, this.f41089c, this.f41090d);
    }
}
