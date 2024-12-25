package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/t9.class
 */
/* renamed from: ra.t9 */
/* loaded from: combined.jar:classes2.jar:ra/t9.class */
public final class C8354t9 implements InterfaceC8339s9 {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39285a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39286b;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39285a = c8378v3.m35959b("measurement.androidId.delete_feature", true);
        f39286b = c8378v3.m35959b("measurement.log_androidId_enabled", false);
    }

    @Override // p305ra.InterfaceC8339s9
    public final boolean zza() {
        return f39285a.m36065e().booleanValue();
    }
}
