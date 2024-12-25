package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/t0.class
 */
/* renamed from: ra.t0 */
/* loaded from: combined.jar:classes2.jar:ra/t0.class */
public final class C8345t0 extends AbstractC8231l6<C8345t0, C8330s0> implements InterfaceC8322r7 {
    private static final C8345t0 zzk;
    private int zza;
    private int zze;
    private String zzf = "";
    private C8225l0 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C8345t0 c8345t0 = new C8345t0();
        zzk = c8345t0;
        AbstractC8231l6.m35581u(C8345t0.class, c8345t0);
    }

    /* renamed from: I */
    public static C8330s0 m35788I() {
        return zzk.m35589q();
    }

    /* renamed from: K */
    public static /* synthetic */ void m35790K(C8345t0 c8345t0, String str) {
        c8345t0.zza |= 2;
        c8345t0.zzf = str;
    }

    /* renamed from: A */
    public final int m35791A() {
        return this.zze;
    }

    /* renamed from: C */
    public final String m35792C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final C8225l0 m35793D() {
        C8225l0 c8225l0 = this.zzg;
        C8225l0 c8225l02 = c8225l0;
        if (c8225l0 == null) {
            c8225l02 = C8225l0.m35543I();
        }
        return c8225l02;
    }

    /* renamed from: E */
    public final boolean m35794E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final boolean m35795F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final boolean m35796G() {
        return (this.zza & 32) != 0;
    }

    /* renamed from: H */
    public final boolean m35797H() {
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
            return AbstractC8231l6.m35582w(zzk, "\u0001\u0006��\u0001\u0001\u0006\u0006������\u0001င��\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C8345t0();
        }
        if (i11 == 4) {
            return new C8330s0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzk;
    }

    /* renamed from: z */
    public final boolean m35798z() {
        return (this.zza & 1) != 0;
    }
}
