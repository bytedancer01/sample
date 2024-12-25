package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/j0.class
 */
/* renamed from: ra.j0 */
/* loaded from: combined.jar:classes2.jar:ra/j0.class */
public final class C8195j0 extends AbstractC8231l6<C8195j0, C8180i0> implements InterfaceC8322r7 {
    private static final C8195j0 zzm;
    private int zza;
    private int zze;
    private String zzf = "";
    private InterfaceC8351t6<C8225l0> zzg = AbstractC8231l6.m35578o();
    private boolean zzh;
    private C8315r0 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C8195j0 c8195j0 = new C8195j0();
        zzm = c8195j0;
        AbstractC8231l6.m35581u(C8195j0.class, c8195j0);
    }

    /* renamed from: M */
    public static C8180i0 m35473M() {
        return zzm.m35589q();
    }

    /* renamed from: O */
    public static /* synthetic */ void m35475O(C8195j0 c8195j0, String str) {
        c8195j0.zza |= 2;
        c8195j0.zzf = str;
    }

    /* renamed from: P */
    public static /* synthetic */ void m35476P(C8195j0 c8195j0, int i10, C8225l0 c8225l0) {
        c8225l0.getClass();
        InterfaceC8351t6<C8225l0> interfaceC8351t6 = c8195j0.zzg;
        if (!interfaceC8351t6.zza()) {
            c8195j0.zzg = AbstractC8231l6.m35579p(interfaceC8351t6);
        }
        c8195j0.zzg.set(i10, c8225l0);
    }

    /* renamed from: A */
    public final int m35477A() {
        return this.zze;
    }

    /* renamed from: C */
    public final String m35478C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final List<C8225l0> m35479D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final int m35480E() {
        return this.zzg.size();
    }

    /* renamed from: F */
    public final C8225l0 m35481F(int i10) {
        return this.zzg.get(i10);
    }

    /* renamed from: G */
    public final boolean m35482G() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: H */
    public final C8315r0 m35483H() {
        C8315r0 c8315r0 = this.zzi;
        C8315r0 c8315r02 = c8315r0;
        if (c8315r0 == null) {
            c8315r02 = C8315r0.m35745K();
        }
        return c8315r02;
    }

    /* renamed from: I */
    public final boolean m35484I() {
        return this.zzj;
    }

    /* renamed from: J */
    public final boolean m35485J() {
        return this.zzk;
    }

    /* renamed from: K */
    public final boolean m35486K() {
        return (this.zza & 64) != 0;
    }

    /* renamed from: L */
    public final boolean m35487L() {
        return this.zzl;
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzm, "\u0001\b��\u0001\u0001\b\b��\u0001��\u0001င��\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zza", "zze", "zzf", "zzg", C8225l0.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new C8195j0();
        }
        if (i11 == 4) {
            return new C8180i0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzm;
    }

    /* renamed from: z */
    public final boolean m35488z() {
        return (this.zza & 1) != 0;
    }
}
