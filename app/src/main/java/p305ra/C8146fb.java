package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/fb.class
 */
/* renamed from: ra.fb */
/* loaded from: combined.jar:classes2.jar:ra/fb.class */
public final class C8146fb implements InterfaceC8131eb {

    /* renamed from: a */
    public static final AbstractC8408x3<Long> f39080a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39081b;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39080a = c8378v3.m35958a("measurement.id.service.use_appinfo_modified", 0L);
        f39081b = c8378v3.m35959b("measurement.service.use_appinfo_modified", false);
    }

    @Override // p305ra.InterfaceC8131eb
    /* renamed from: k */
    public final boolean mo35329k() {
        return f39081b.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8131eb
    public final boolean zza() {
        return true;
    }
}
