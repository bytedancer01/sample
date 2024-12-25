package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/ob.class
 */
/* renamed from: ra.ob */
/* loaded from: combined.jar:classes2.jar:ra/ob.class */
public final class C8281ob implements InterfaceC8266nb {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39226a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39227b;

    /* renamed from: c */
    public static final AbstractC8408x3<Long> f39228c;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39226a = c8378v3.m35959b("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f39227b = c8378v3.m35959b("measurement.collection.redundant_engagement_removal_enabled", false);
        f39228c = c8378v3.m35958a("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // p305ra.InterfaceC8266nb
    public final boolean zza() {
        return f39227b.m36065e().booleanValue();
    }
}
