package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/hc.class
 */
/* renamed from: ra.hc */
/* loaded from: combined.jar:classes2.jar:ra/hc.class */
public final class C8177hc implements InterfaceC8162gc {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39108a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39109b;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39108a = c8378v3.m35959b("measurement.sdk.screen.manual_screen_view_logging", true);
        f39109b = c8378v3.m35959b("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // p305ra.InterfaceC8162gc
    /* renamed from: k */
    public final boolean mo35392k() {
        return f39108a.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8162gc
    /* renamed from: l */
    public final boolean mo35393l() {
        return f39109b.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8162gc
    public final boolean zza() {
        return true;
    }
}
