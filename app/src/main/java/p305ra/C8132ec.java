package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/ec.class
 */
/* renamed from: ra.ec */
/* loaded from: combined.jar:classes2.jar:ra/ec.class */
public final class C8132ec implements InterfaceC8117dc {

    /* renamed from: a */
    public static final AbstractC8408x3<Long> f39062a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39063b;

    /* renamed from: c */
    public static final AbstractC8408x3<Boolean> f39064c;

    /* renamed from: d */
    public static final AbstractC8408x3<Boolean> f39065d;

    /* renamed from: e */
    public static final AbstractC8408x3<Long> f39066e;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39062a = c8378v3.m35958a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f39063b = c8378v3.m35959b("measurement.lifecycle.app_backgrounded_engagement", false);
        f39064c = c8378v3.m35959b("measurement.lifecycle.app_backgrounded_tracking", true);
        f39065d = c8378v3.m35959b("measurement.lifecycle.app_in_background_parameter", false);
        f39066e = c8378v3.m35958a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // p305ra.InterfaceC8117dc
    /* renamed from: k */
    public final boolean mo35218k() {
        return f39065d.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8117dc
    public final boolean zza() {
        return f39063b.m36065e().booleanValue();
    }
}
