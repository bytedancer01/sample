package ua;

import android.content.ComponentName;
import android.content.Context;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/r8.class
 */
/* renamed from: ua.r8 */
/* loaded from: combined.jar:classes2.jar:ua/r8.class */
public final class RunnableC9053r8 implements Runnable {

    /* renamed from: b */
    public final ServiceConnectionC9077t8 f41601b;

    public RunnableC9053r8(ServiceConnectionC9077t8 serviceConnectionC9077t8) {
        this.f41601b = serviceConnectionC9077t8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9089u8 c9089u8 = this.f41601b.f41648d;
        Context mo37779b = c9089u8.f41723a.mo37779b();
        this.f41601b.f41648d.f41723a.mo37783f();
        C9089u8.m38283x(c9089u8, new ComponentName(mo37779b, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
