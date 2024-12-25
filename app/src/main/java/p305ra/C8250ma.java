package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/ma.class
 */
/* renamed from: ra.ma */
/* loaded from: combined.jar:classes2.jar:ra/ma.class */
public final class C8250ma implements InterfaceC8235la {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39192a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39193b;

    /* renamed from: c */
    public static final AbstractC8408x3<Boolean> f39194c;

    /* renamed from: d */
    public static final AbstractC8408x3<Long> f39195d;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39192a = c8378v3.m35959b("measurement.sdk.dynamite.allow_remote_dynamite3", true);
        f39193b = c8378v3.m35959b("measurement.collection.init_params_control_enabled", true);
        f39194c = c8378v3.m35959b("measurement.sdk.dynamite.use_dynamite3", true);
        f39195d = c8378v3.m35958a("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // p305ra.InterfaceC8235la
    public final boolean zza() {
        return f39192a.m36065e().booleanValue();
    }
}
