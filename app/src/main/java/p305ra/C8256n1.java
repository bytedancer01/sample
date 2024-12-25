package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/n1.class
 */
/* renamed from: ra.n1 */
/* loaded from: combined.jar:classes2.jar:ra/n1.class */
public final class C8256n1 extends AbstractC8231l6<C8256n1, C8241m1> implements InterfaceC8322r7 {
    private static final C8256n1 zzg;
    private int zza;
    private int zze;
    private long zzf;

    static {
        C8256n1 c8256n1 = new C8256n1();
        zzg = c8256n1;
        AbstractC8231l6.m35581u(C8256n1.class, c8256n1);
    }

    /* renamed from: E */
    public static C8241m1 m35637E() {
        return zzg.m35589q();
    }

    /* renamed from: G */
    public static /* synthetic */ void m35639G(C8256n1 c8256n1, int i10) {
        c8256n1.zza |= 1;
        c8256n1.zze = i10;
    }

    /* renamed from: H */
    public static /* synthetic */ void m35640H(C8256n1 c8256n1, long j10) {
        c8256n1.zza |= 2;
        c8256n1.zzf = j10;
    }

    /* renamed from: A */
    public final int m35641A() {
        return this.zze;
    }

    /* renamed from: C */
    public final boolean m35642C() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: D */
    public final long m35643D() {
        return this.zzf;
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001င��\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C8256n1();
        }
        if (i11 == 4) {
            return new C8241m1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzg;
    }

    /* renamed from: z */
    public final boolean m35644z() {
        return (this.zza & 1) != 0;
    }
}
