package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/l0.class
 */
/* renamed from: ra.l0 */
/* loaded from: combined.jar:classes2.jar:ra/l0.class */
public final class C8225l0 extends AbstractC8231l6<C8225l0, C8210k0> implements InterfaceC8322r7 {
    private static final C8225l0 zzi;
    private int zza;
    private C8420y0 zze;
    private C8315r0 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C8225l0 c8225l0 = new C8225l0();
        zzi = c8225l0;
        AbstractC8231l6.m35581u(C8225l0.class, c8225l0);
    }

    /* renamed from: I */
    public static C8225l0 m35543I() {
        return zzi;
    }

    /* renamed from: K */
    public static /* synthetic */ void m35545K(C8225l0 c8225l0, String str) {
        c8225l0.zza |= 8;
        c8225l0.zzh = str;
    }

    /* renamed from: A */
    public final C8420y0 m35546A() {
        C8420y0 c8420y0 = this.zze;
        C8420y0 c8420y02 = c8420y0;
        if (c8420y0 == null) {
            c8420y02 = C8420y0.m36089I();
        }
        return c8420y02;
    }

    /* renamed from: C */
    public final boolean m35547C() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: D */
    public final C8315r0 m35548D() {
        C8315r0 c8315r0 = this.zzf;
        C8315r0 c8315r02 = c8315r0;
        if (c8315r0 == null) {
            c8315r02 = C8315r0.m35745K();
        }
        return c8315r02;
    }

    /* renamed from: E */
    public final boolean m35549E() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: F */
    public final boolean m35550F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean m35551G() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: H */
    public final String m35552H() {
        return this.zzh;
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzi, "\u0001\u0004��\u0001\u0001\u0004\u0004������\u0001ဉ��\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C8225l0();
        }
        if (i11 == 4) {
            return new C8210k0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzi;
    }

    /* renamed from: z */
    public final boolean m35553z() {
        return (this.zza & 1) != 0;
    }
}
