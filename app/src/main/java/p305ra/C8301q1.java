package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/q1.class
 */
/* renamed from: ra.q1 */
/* loaded from: combined.jar:classes2.jar:ra/q1.class */
public final class C8301q1 extends AbstractC8231l6<C8301q1, C8286p1> implements InterfaceC8322r7 {
    private static final C8301q1 zzj;
    private int zza;
    private InterfaceC8351t6<C8361u1> zze = AbstractC8231l6.m35578o();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C8301q1 c8301q1 = new C8301q1();
        zzj = c8301q1;
        AbstractC8231l6.m35581u(C8301q1.class, c8301q1);
    }

    /* renamed from: K */
    public static C8286p1 m35691K() {
        return zzj.m35589q();
    }

    /* renamed from: M */
    public static /* synthetic */ void m35693M(C8301q1 c8301q1, int i10, C8361u1 c8361u1) {
        c8361u1.getClass();
        c8301q1.m35710U();
        c8301q1.zze.set(i10, c8361u1);
    }

    /* renamed from: N */
    public static /* synthetic */ void m35694N(C8301q1 c8301q1, C8361u1 c8361u1) {
        c8361u1.getClass();
        c8301q1.m35710U();
        c8301q1.zze.add(c8361u1);
    }

    /* renamed from: O */
    public static /* synthetic */ void m35695O(C8301q1 c8301q1, Iterable iterable) {
        c8301q1.m35710U();
        AbstractC8349t4.m35810j(iterable, c8301q1.zze);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m35697Q(C8301q1 c8301q1, int i10) {
        c8301q1.m35710U();
        c8301q1.zze.remove(i10);
    }

    /* renamed from: R */
    public static /* synthetic */ void m35698R(C8301q1 c8301q1, String str) {
        str.getClass();
        c8301q1.zza |= 1;
        c8301q1.zzf = str;
    }

    /* renamed from: S */
    public static /* synthetic */ void m35699S(C8301q1 c8301q1, long j10) {
        c8301q1.zza |= 2;
        c8301q1.zzg = j10;
    }

    /* renamed from: T */
    public static /* synthetic */ void m35700T(C8301q1 c8301q1, long j10) {
        c8301q1.zza |= 4;
        c8301q1.zzh = j10;
    }

    /* renamed from: A */
    public final int m35701A() {
        return this.zze.size();
    }

    /* renamed from: C */
    public final C8361u1 m35702C(int i10) {
        return this.zze.get(i10);
    }

    /* renamed from: D */
    public final String m35703D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final boolean m35704E() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: F */
    public final long m35705F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m35706G() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: H */
    public final long m35707H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean m35708I() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: J */
    public final int m35709J() {
        return this.zzi;
    }

    /* renamed from: U */
    public final void m35710U() {
        InterfaceC8351t6<C8361u1> interfaceC8351t6 = this.zze;
        if (interfaceC8351t6.zza()) {
            return;
        }
        this.zze = AbstractC8231l6.m35579p(interfaceC8351t6);
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzj, "\u0001\u0005��\u0001\u0001\u0005\u0005��\u0001��\u0001\u001b\u0002ဈ��\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zza", "zze", C8361u1.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C8301q1();
        }
        if (i11 == 4) {
            return new C8286p1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzj;
    }

    /* renamed from: z */
    public final List<C8361u1> m35711z() {
        return this.zze;
    }
}
