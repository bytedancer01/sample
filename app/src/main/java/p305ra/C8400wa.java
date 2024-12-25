package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/wa.class
 */
/* renamed from: ra.wa */
/* loaded from: combined.jar:classes2.jar:ra/wa.class */
public final class C8400wa implements InterfaceC8370ua {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39365a;

    /* renamed from: b */
    public static final AbstractC8408x3<Boolean> f39366b;

    /* renamed from: c */
    public static final AbstractC8408x3<Boolean> f39367c;

    /* renamed from: d */
    public static final AbstractC8408x3<Boolean> f39368d;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39365a = c8378v3.m35959b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f39366b = c8378v3.m35959b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f39367c = c8378v3.m35959b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f39368d = c8378v3.m35959b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // p305ra.InterfaceC8370ua
    /* renamed from: k */
    public final boolean mo35948k() {
        return f39366b.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8370ua
    /* renamed from: l */
    public final boolean mo35949l() {
        return f39367c.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8370ua
    /* renamed from: o */
    public final boolean mo35950o() {
        return f39368d.m36065e().booleanValue();
    }

    @Override // p305ra.InterfaceC8370ua
    public final boolean zza() {
        return true;
    }
}
