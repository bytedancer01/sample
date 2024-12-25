package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/l1.class
 */
/* renamed from: ra.l1 */
/* loaded from: combined.jar:classes2.jar:ra/l1.class */
public final class C8226l1 extends AbstractC8231l6<C8226l1, C8211k1> implements InterfaceC8322r7 {
    private static final C8226l1 zzi;
    private int zza;
    private int zze;
    private C8137f2 zzf;
    private C8137f2 zzg;
    private boolean zzh;

    static {
        C8226l1 c8226l1 = new C8226l1();
        zzi = c8226l1;
        AbstractC8231l6.m35581u(C8226l1.class, c8226l1);
    }

    /* renamed from: H */
    public static C8211k1 m35554H() {
        return zzi.m35589q();
    }

    /* renamed from: J */
    public static /* synthetic */ void m35556J(C8226l1 c8226l1, int i10) {
        c8226l1.zza |= 1;
        c8226l1.zze = i10;
    }

    /* renamed from: K */
    public static /* synthetic */ void m35557K(C8226l1 c8226l1, C8137f2 c8137f2) {
        c8137f2.getClass();
        c8226l1.zzf = c8137f2;
        c8226l1.zza |= 2;
    }

    /* renamed from: L */
    public static /* synthetic */ void m35558L(C8226l1 c8226l1, C8137f2 c8137f2) {
        c8226l1.zzg = c8137f2;
        c8226l1.zza |= 4;
    }

    /* renamed from: M */
    public static /* synthetic */ void m35559M(C8226l1 c8226l1, boolean z10) {
        c8226l1.zza |= 8;
        c8226l1.zzh = z10;
    }

    /* renamed from: A */
    public final int m35560A() {
        return this.zze;
    }

    /* renamed from: C */
    public final C8137f2 m35561C() {
        C8137f2 c8137f2 = this.zzf;
        C8137f2 c8137f22 = c8137f2;
        if (c8137f2 == null) {
            c8137f22 = C8137f2.m35337L();
        }
        return c8137f22;
    }

    /* renamed from: D */
    public final boolean m35562D() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: E */
    public final C8137f2 m35563E() {
        C8137f2 c8137f2 = this.zzg;
        C8137f2 c8137f22 = c8137f2;
        if (c8137f2 == null) {
            c8137f22 = C8137f2.m35337L();
        }
        return c8137f22;
    }

    /* renamed from: F */
    public final boolean m35564F() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: G */
    public final boolean m35565G() {
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
            return AbstractC8231l6.m35582w(zzi, "\u0001\u0004��\u0001\u0001\u0004\u0004������\u0001င��\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C8226l1();
        }
        if (i11 == 4) {
            return new C8211k1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzi;
    }

    /* renamed from: z */
    public final boolean m35566z() {
        return (this.zza & 1) != 0;
    }
}
