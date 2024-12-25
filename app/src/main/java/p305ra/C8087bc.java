package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/bc.class
 */
/* renamed from: ra.bc */
/* loaded from: combined.jar:classes2.jar:ra/bc.class */
public final class C8087bc implements InterfaceC8072ac {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f38954a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f38955b;

    /* renamed from: c */
    public static final AbstractC8408x3<Boolean> f38956c;

    /* renamed from: d */
    public static final AbstractC8408x3<Boolean> f38957d;

    /* renamed from: e */
    public static final AbstractC8408x3<Long> f38958e;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f38954a = c8378v3.m35959b("measurement.sdk.collection.enable_extend_user_property_size", true);
        f38955b = c8378v3.m35959b("measurement.sdk.collection.last_deep_link_referrer2", true);
        f38956c = c8378v3.m35959b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f38957d = c8378v3.m35959b("measurement.sdk.collection.last_gclid_from_referrer2", false);
        f38958e = c8378v3.m35958a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // p305ra.InterfaceC8072ac
    /* renamed from: k */
    public final boolean mo35021k() {
        return f38955b.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8072ac
    /* renamed from: l */
    public final boolean mo35022l() {
        return f38956c.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8072ac
    /* renamed from: o */
    public final boolean mo35023o() {
        return f38957d.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8072ac
    public final boolean zza() {
        return f38954a.m36065e().booleanValue();
    }
}
