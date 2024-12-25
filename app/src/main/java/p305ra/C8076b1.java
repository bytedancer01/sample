package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/b1.class
 */
/* renamed from: ra.b1 */
/* loaded from: combined.jar:classes2.jar:ra/b1.class */
public final class C8076b1 extends AbstractC8231l6<C8076b1, C8061a1> implements InterfaceC8322r7 {
    private static final C8076b1 zzi;
    private int zza;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C8076b1 c8076b1 = new C8076b1();
        zzi = c8076b1;
        AbstractC8231l6.m35581u(C8076b1.class, c8076b1);
    }

    /* renamed from: G */
    public static /* synthetic */ void m35025G(C8076b1 c8076b1, String str) {
        str.getClass();
        c8076b1.zza |= 1;
        c8076b1.zze = str;
    }

    /* renamed from: A */
    public final boolean m35026A() {
        return this.zzf;
    }

    /* renamed from: C */
    public final boolean m35027C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean m35028D() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: E */
    public final int m35029E() {
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
            return AbstractC8231l6.m35582w(zzi, "\u0001\u0004��\u0001\u0001\u0004\u0004������\u0001ဈ��\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C8076b1();
        }
        if (i11 == 4) {
            return new C8061a1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzi;
    }

    /* renamed from: z */
    public final String m35031z() {
        return this.zze;
    }
}
