package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/ga.class
 */
/* renamed from: ra.ga */
/* loaded from: combined.jar:classes2.jar:ra/ga.class */
public final class C8160ga implements InterfaceC8145fa {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39091a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39092b;

    /* renamed from: c */
    public static final AbstractC8408x3<Long> f39093c;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39091a = c8378v3.m35959b("measurement.service.configurable_service_limits", true);
        f39092b = c8378v3.m35959b("measurement.client.configurable_service_limits", true);
        f39093c = c8378v3.m35958a("measurement.id.service.configurable_service_limits", 0L);
    }

    @Override // p305ra.InterfaceC8145fa
    /* renamed from: k */
    public final boolean mo35370k() {
        return f39091a.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8145fa
    /* renamed from: l */
    public final boolean mo35371l() {
        return f39092b.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8145fa
    public final boolean zza() {
        return true;
    }
}
