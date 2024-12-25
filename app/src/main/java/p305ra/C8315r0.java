package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/r0.class
 */
/* renamed from: ra.r0 */
/* loaded from: combined.jar:classes2.jar:ra/r0.class */
public final class C8315r0 extends AbstractC8231l6<C8315r0, C8240m0> implements InterfaceC8322r7 {
    private static final C8315r0 zzj;
    private int zza;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C8315r0 c8315r0 = new C8315r0();
        zzj = c8315r0;
        AbstractC8231l6.m35581u(C8315r0.class, c8315r0);
    }

    /* renamed from: K */
    public static C8315r0 m35745K() {
        return zzj;
    }

    /* renamed from: A */
    public final EnumC8300q0 m35747A() {
        EnumC8300q0 zza = EnumC8300q0.zza(this.zze);
        EnumC8300q0 enumC8300q0 = zza;
        if (zza == null) {
            enumC8300q0 = EnumC8300q0.UNKNOWN_COMPARISON_TYPE;
        }
        return enumC8300q0;
    }

    /* renamed from: C */
    public final boolean m35748C() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: D */
    public final boolean m35749D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final boolean m35750E() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: F */
    public final String m35751F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m35752G() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: H */
    public final String m35753H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean m35754I() {
        return (this.zza & 16) != 0;
    }

    /* renamed from: J */
    public final String m35755J() {
        return this.zzi;
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzj, "\u0001\u0005��\u0001\u0001\u0005\u0005������\u0001ဌ��\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zza", "zze", EnumC8300q0.zzb(), "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C8315r0();
        }
        if (i11 == 4) {
            return new C8240m0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzj;
    }

    /* renamed from: z */
    public final boolean m35756z() {
        return (this.zza & 1) != 0;
    }
}
