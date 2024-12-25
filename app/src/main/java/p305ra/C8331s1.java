package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/s1.class
 */
/* renamed from: ra.s1 */
/* loaded from: combined.jar:classes2.jar:ra/s1.class */
public final class C8331s1 extends AbstractC8231l6<C8331s1, C8316r1> implements InterfaceC8322r7 {
    private static final C8331s1 zzg;
    private int zza;
    private String zze = "";
    private long zzf;

    static {
        C8331s1 c8331s1 = new C8331s1();
        zzg = c8331s1;
        AbstractC8231l6.m35581u(C8331s1.class, c8331s1);
    }

    /* renamed from: C */
    public static /* synthetic */ void m35780C(C8331s1 c8331s1, String str) {
        str.getClass();
        c8331s1.zza |= 1;
        c8331s1.zze = str;
    }

    /* renamed from: D */
    public static /* synthetic */ void m35781D(C8331s1 c8331s1, long j10) {
        c8331s1.zza |= 2;
        c8331s1.zzf = j10;
    }

    /* renamed from: z */
    public static C8316r1 m35782z() {
        return zzg.m35589q();
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001ဈ��\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C8331s1();
        }
        if (i11 == 4) {
            return new C8316r1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzg;
    }
}
