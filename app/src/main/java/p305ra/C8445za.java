package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/za.class
 */
/* renamed from: ra.za */
/* loaded from: combined.jar:classes2.jar:ra/za.class */
public final class C8445za implements InterfaceC8430ya {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39443a;

    /* renamed from: b */
    public static final AbstractC8408x3<Long> f39444b;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39443a = c8378v3.m35959b("measurement.sdk.referrer.delayed_install_referrer_api", false);
        f39444b = c8378v3.m35958a("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }

    @Override // p305ra.InterfaceC8430ya
    /* renamed from: k */
    public final boolean mo36235k() {
        return f39443a.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8430ya
    public final boolean zza() {
        return true;
    }
}
