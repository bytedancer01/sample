package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/pd.class
 */
/* renamed from: ra.pd */
/* loaded from: combined.jar:classes2.jar:ra/pd.class */
public final class C8298pd implements InterfaceC8283od {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39237a;

    /* renamed from: b */
    public static final AbstractC8408x3<Long> f39238b;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39237a = c8378v3.m35959b("measurement.upload.file_lock_state_check", false);
        f39238b = c8378v3.m35958a("measurement.id.upload.file_lock_state_check", 0L);
    }

    @Override // p305ra.InterfaceC8283od
    public final boolean zza() {
        return f39237a.m36065e().booleanValue();
    }
}
