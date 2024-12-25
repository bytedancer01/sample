package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/ib.class
 */
/* renamed from: ra.ib */
/* loaded from: combined.jar:classes2.jar:ra/ib.class */
public final class C8191ib implements InterfaceC8176hb {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39126a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39127b;

    /* renamed from: c */
    public static final AbstractC8408x3<Boolean> f39128c;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39126a = c8378v3.m35959b("measurement.client.sessions.check_on_reset_and_enable2", true);
        f39127b = c8378v3.m35959b("measurement.client.sessions.check_on_startup", true);
        f39128c = c8378v3.m35959b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // p305ra.InterfaceC8176hb
    /* renamed from: k */
    public final boolean mo35424k() {
        return f39126a.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8176hb
    public final boolean zza() {
        return true;
    }
}
