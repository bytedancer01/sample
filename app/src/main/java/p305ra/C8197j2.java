package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/j2.class
 */
/* renamed from: ra.j2 */
/* loaded from: combined.jar:classes2.jar:ra/j2.class */
public final class C8197j2 extends AbstractC8231l6<C8197j2, C8182i2> implements InterfaceC8322r7 {
    private static final C8197j2 zzk;
    private int zza;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C8197j2 c8197j2 = new C8197j2();
        zzk = c8197j2;
        AbstractC8231l6.m35581u(C8197j2.class, c8197j2);
    }

    /* renamed from: J */
    public static C8182i2 m35489J() {
        return zzk.m35589q();
    }

    /* renamed from: L */
    public static /* synthetic */ void m35491L(C8197j2 c8197j2, long j10) {
        c8197j2.zza |= 1;
        c8197j2.zze = j10;
    }

    /* renamed from: M */
    public static /* synthetic */ void m35492M(C8197j2 c8197j2, String str) {
        str.getClass();
        c8197j2.zza |= 2;
        c8197j2.zzf = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m35493N(C8197j2 c8197j2, String str) {
        str.getClass();
        c8197j2.zza |= 4;
        c8197j2.zzg = str;
    }

    /* renamed from: O */
    public static /* synthetic */ void m35494O(C8197j2 c8197j2) {
        c8197j2.zza &= -5;
        c8197j2.zzg = zzk.zzg;
    }

    /* renamed from: P */
    public static /* synthetic */ void m35495P(C8197j2 c8197j2, long j10) {
        c8197j2.zza |= 8;
        c8197j2.zzh = j10;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m35496Q(C8197j2 c8197j2) {
        c8197j2.zza &= -9;
        c8197j2.zzh = 0L;
    }

    /* renamed from: R */
    public static /* synthetic */ void m35497R(C8197j2 c8197j2, double d10) {
        c8197j2.zza |= 32;
        c8197j2.zzj = d10;
    }

    /* renamed from: S */
    public static /* synthetic */ void m35498S(C8197j2 c8197j2) {
        c8197j2.zza &= -33;
        c8197j2.zzj = 0.0d;
    }

    /* renamed from: A */
    public final long m35499A() {
        return this.zze;
    }

    /* renamed from: C */
    public final String m35500C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final boolean m35501D() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: E */
    public final String m35502E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final boolean m35503F() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: G */
    public final long m35504G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean m35505H() {
        return (this.zza & 32) != 0;
    }

    /* renamed from: I */
    public final double m35506I() {
        return this.zzj;
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzk, "\u0001\u0006��\u0001\u0001\u0006\u0006������\u0001ဂ��\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C8197j2();
        }
        if (i11 == 4) {
            return new C8182i2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzk;
    }

    /* renamed from: z */
    public final boolean m35507z() {
        return (this.zza & 1) != 0;
    }
}
