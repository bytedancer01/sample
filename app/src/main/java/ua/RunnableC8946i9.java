package ua;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/i9.class
 */
/* renamed from: ua.i9 */
/* loaded from: combined.jar:classes2.jar:ua/i9.class */
public final class RunnableC8946i9 implements Runnable {

    /* renamed from: b */
    public final C8935ha f41190b;

    /* renamed from: c */
    public final AppMeasurementDynamiteService f41191c;

    public RunnableC8946i9(AppMeasurementDynamiteService appMeasurementDynamiteService, C8935ha c8935ha) {
        this.f41191c = appMeasurementDynamiteService;
        this.f41190b = c8935ha;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41191c.f14864b.m37764F().m37947v(this.f41190b);
    }
}
