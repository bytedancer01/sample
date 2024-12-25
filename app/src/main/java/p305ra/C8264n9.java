package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/n9.class
 */
/* renamed from: ra.n9 */
/* loaded from: combined.jar:classes2.jar:ra/n9.class */
public final class C8264n9 implements InterfaceC8249m9 {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39211a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39212b;

    /* renamed from: c */
    public static final AbstractC8408x3<Boolean> f39213c;

    /* renamed from: d */
    public static final AbstractC8408x3<Long> f39214d;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39211a = c8378v3.m35959b("measurement.client.ad_impression", true);
        f39212b = c8378v3.m35959b("measurement.service.separate_public_internal_event_blacklisting", true);
        f39213c = c8378v3.m35959b("measurement.service.ad_impression", true);
        f39214d = c8378v3.m35958a("measurement.id.service.ad_impression", 0L);
    }

    @Override // p305ra.InterfaceC8249m9
    /* renamed from: k */
    public final boolean mo35626k() {
        return f39211a.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8249m9
    /* renamed from: l */
    public final boolean mo35627l() {
        return f39212b.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8249m9
    /* renamed from: o */
    public final boolean mo35628o() {
        return f39213c.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8249m9
    public final boolean zza() {
        return true;
    }
}
