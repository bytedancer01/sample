package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/yb.class
 */
/* renamed from: ra.yb */
/* loaded from: combined.jar:classes2.jar:ra/yb.class */
public final class C8431yb implements InterfaceC8416xb {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39420a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39421b;

    /* renamed from: c */
    public static final AbstractC8408x3<Boolean> f39422c;

    /* renamed from: d */
    public static final AbstractC8408x3<Long> f39423d;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39420a = c8378v3.m35959b("measurement.client.global_params", true);
        f39421b = c8378v3.m35959b("measurement.service.global_params_in_payload", true);
        f39422c = c8378v3.m35959b("measurement.service.global_params", true);
        f39423d = c8378v3.m35958a("measurement.id.service.global_params", 0L);
    }

    @Override // p305ra.InterfaceC8416xb
    /* renamed from: k */
    public final boolean mo36086k() {
        return f39420a.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8416xb
    /* renamed from: l */
    public final boolean mo36087l() {
        return f39421b.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8416xb
    /* renamed from: o */
    public final boolean mo36088o() {
        return f39422c.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8416xb
    public final boolean zza() {
        return true;
    }
}
