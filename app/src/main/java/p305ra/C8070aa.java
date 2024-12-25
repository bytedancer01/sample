package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/aa.class
 */
/* renamed from: ra.aa */
/* loaded from: combined.jar:classes2.jar:ra/aa.class */
public final class C8070aa implements InterfaceC8444z9 {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f38932a;

    /* renamed from: b */
    public static final AbstractC8408x3<Long> f38933b;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f38932a = c8378v3.m35959b("measurement.sdk.attribution.cache", true);
        f38933b = c8378v3.m35958a("measurement.sdk.attribution.cache.ttl", 604800000L);
    }

    @Override // p305ra.InterfaceC8444z9
    /* renamed from: k */
    public final long mo35017k() {
        return f38933b.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8444z9
    public final boolean zza() {
        return f38932a.m36065e().booleanValue();
    }
}
