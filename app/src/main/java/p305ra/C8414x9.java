package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/x9.class
 */
/* renamed from: ra.x9 */
/* loaded from: combined.jar:classes2.jar:ra/x9.class */
public final class C8414x9 implements InterfaceC8399w9 {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39387a;

    /* renamed from: b */
    public static final AbstractC8408x3<Long> f39388b;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39387a = c8378v3.m35959b("measurement.service.directly_maybe_log_error_events", false);
        f39388b = c8378v3.m35958a("measurement.id.service.directly_maybe_log_error_events", 0L);
    }

    @Override // p305ra.InterfaceC8399w9
    /* renamed from: k */
    public final boolean mo35993k() {
        return f39387a.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8399w9
    public final boolean zza() {
        return true;
    }
}
