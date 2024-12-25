package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/u1.class
 */
/* renamed from: ra.u1 */
/* loaded from: combined.jar:classes2.jar:ra/u1.class */
public final class C8361u1 extends AbstractC8231l6<C8361u1, C8346t1> implements InterfaceC8322r7 {
    private static final C8361u1 zzk;
    private int zza;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private InterfaceC8351t6<C8361u1> zzj = AbstractC8231l6.m35578o();

    static {
        C8361u1 c8361u1 = new C8361u1();
        zzk = c8361u1;
        AbstractC8231l6.m35581u(C8361u1.class, c8361u1);
    }

    /* renamed from: M */
    public static C8346t1 m35839M() {
        return zzk.m35589q();
    }

    /* renamed from: O */
    public static /* synthetic */ void m35841O(C8361u1 c8361u1, String str) {
        str.getClass();
        c8361u1.zza |= 1;
        c8361u1.zze = str;
    }

    /* renamed from: P */
    public static /* synthetic */ void m35842P(C8361u1 c8361u1, String str) {
        str.getClass();
        c8361u1.zza |= 2;
        c8361u1.zzf = str;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m35843Q(C8361u1 c8361u1) {
        c8361u1.zza &= -3;
        c8361u1.zzf = zzk.zzf;
    }

    /* renamed from: R */
    public static /* synthetic */ void m35844R(C8361u1 c8361u1, long j10) {
        c8361u1.zza |= 4;
        c8361u1.zzg = j10;
    }

    /* renamed from: S */
    public static /* synthetic */ void m35845S(C8361u1 c8361u1) {
        c8361u1.zza &= -5;
        c8361u1.zzg = 0L;
    }

    /* renamed from: T */
    public static /* synthetic */ void m35846T(C8361u1 c8361u1, double d10) {
        c8361u1.zza |= 16;
        c8361u1.zzi = d10;
    }

    /* renamed from: U */
    public static /* synthetic */ void m35847U(C8361u1 c8361u1) {
        c8361u1.zza &= -17;
        c8361u1.zzi = 0.0d;
    }

    /* renamed from: V */
    public static /* synthetic */ void m35848V(C8361u1 c8361u1, C8361u1 c8361u12) {
        c8361u12.getClass();
        c8361u1.m35862Y();
        c8361u1.zzj.add(c8361u12);
    }

    /* renamed from: W */
    public static /* synthetic */ void m35849W(C8361u1 c8361u1, Iterable iterable) {
        c8361u1.m35862Y();
        AbstractC8349t4.m35810j(iterable, c8361u1.zzj);
    }

    /* renamed from: A */
    public final String m35851A() {
        return this.zze;
    }

    /* renamed from: C */
    public final boolean m35852C() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: D */
    public final String m35853D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final boolean m35854E() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: F */
    public final long m35855F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m35856G() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: H */
    public final float m35857H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean m35858I() {
        return (this.zza & 16) != 0;
    }

    /* renamed from: J */
    public final double m35859J() {
        return this.zzi;
    }

    /* renamed from: K */
    public final List<C8361u1> m35860K() {
        return this.zzj;
    }

    /* renamed from: L */
    public final int m35861L() {
        return this.zzj.size();
    }

    /* renamed from: Y */
    public final void m35862Y() {
        InterfaceC8351t6<C8361u1> interfaceC8351t6 = this.zzj;
        if (interfaceC8351t6.zza()) {
            return;
        }
        this.zzj = AbstractC8231l6.m35579p(interfaceC8351t6);
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzk, "\u0001\u0006��\u0001\u0001\u0006\u0006��\u0001��\u0001ဈ��\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C8361u1.class});
        }
        if (i11 == 3) {
            return new C8361u1();
        }
        if (i11 == 4) {
            return new C8346t1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzk;
    }

    /* renamed from: z */
    public final boolean m35863z() {
        return (this.zza & 1) != 0;
    }
}
