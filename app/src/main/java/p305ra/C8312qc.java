package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/qc.class
 */
/* renamed from: ra.qc */
/* loaded from: combined.jar:classes2.jar:ra/qc.class */
public final class C8312qc implements InterfaceC8297pc {

    /* renamed from: a */
    public static final AbstractC8408x3<Boolean> f39249a;

    /* renamed from: b */
    public static final AbstractC8408x3<Double> f39250b;

    /* renamed from: c */
    public static final AbstractC8408x3<Long> f39251c;

    /* renamed from: d */
    public static final AbstractC8408x3<Long> f39252d;

    /* renamed from: e */
    public static final AbstractC8408x3<String> f39253e;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39249a = c8378v3.m35959b("measurement.test.boolean_flag", false);
        f39250b = c8378v3.m35960c("measurement.test.double_flag", -3.0d);
        f39251c = c8378v3.m35958a("measurement.test.int_flag", -2L);
        f39252d = c8378v3.m35958a("measurement.test.long_flag", -1L);
        f39253e = c8378v3.m35961d("measurement.test.string_flag", "---");
    }

    @Override // p305ra.InterfaceC8297pc
    /* renamed from: c */
    public final String mo35687c() {
        return f39253e.m36065e();
    }

    @Override // p305ra.InterfaceC8297pc
    /* renamed from: k */
    public final double mo35688k() {
        return f39250b.m36065e().doubleValue();
    }

    @Override // p305ra.InterfaceC8297pc
    /* renamed from: l */
    public final long mo35689l() {
        return f39251c.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8297pc
    /* renamed from: o */
    public final long mo35690o() {
        return f39252d.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8297pc
    public final boolean zza() {
        return f39249a.m36065e().booleanValue();
    }
}
