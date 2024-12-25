package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/ja.class
 */
/* renamed from: ra.ja */
/* loaded from: combined.jar:classes2.jar:ra/ja.class */
public final class C8205ja implements InterfaceC8190ia {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39137a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39138b;

    /* renamed from: c */
    public static final AbstractC8408x3<Boolean> f39139c;

    /* renamed from: d */
    public static final AbstractC8408x3<Long> f39140d;

    /* renamed from: e */
    public static final AbstractC8408x3<Long> f39141e;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39137a = c8378v3.m35959b("measurement.client.consent_state_v1", false);
        f39138b = c8378v3.m35959b("measurement.client.3p_consent_state_v1", false);
        f39139c = c8378v3.m35959b("measurement.service.consent_state_v1_W36", true);
        f39140d = c8378v3.m35958a("measurement.id.service.consent_state_v1_W36", 0L);
        f39141e = c8378v3.m35958a("measurement.service.storage_consent_support_version", 203590L);
    }

    @Override // p305ra.InterfaceC8190ia
    /* renamed from: c */
    public final long mo35467c() {
        return f39141e.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8190ia
    /* renamed from: k */
    public final boolean mo35468k() {
        return f39137a.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8190ia
    /* renamed from: l */
    public final boolean mo35469l() {
        return f39138b.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8190ia
    /* renamed from: o */
    public final boolean mo35470o() {
        return f39139c.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8190ia
    public final boolean zza() {
        return true;
    }
}
