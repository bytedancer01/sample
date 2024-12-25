package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/d2.class
 */
/* renamed from: ra.d2 */
/* loaded from: combined.jar:classes2.jar:ra/d2.class */
public final class C8107d2 extends AbstractC8231l6<C8107d2, C8436z1> implements InterfaceC8322r7 {
    private static final C8107d2 zzg;
    private int zza;
    private int zze = 1;
    private InterfaceC8351t6<C8331s1> zzf = AbstractC8231l6.m35578o();

    static {
        C8107d2 c8107d2 = new C8107d2();
        zzg = c8107d2;
        AbstractC8231l6.m35581u(C8107d2.class, c8107d2);
    }

    /* renamed from: C */
    public static /* synthetic */ void m35192C(C8107d2 c8107d2, C8331s1 c8331s1) {
        c8331s1.getClass();
        InterfaceC8351t6<C8331s1> interfaceC8351t6 = c8107d2.zzf;
        if (!interfaceC8351t6.zza()) {
            c8107d2.zzf = AbstractC8231l6.m35579p(interfaceC8351t6);
        }
        c8107d2.zzf.add(c8331s1);
    }

    /* renamed from: z */
    public static C8436z1 m35193z() {
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
            return AbstractC8231l6.m35582w(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001ဌ��\u0002\u001b", new Object[]{"zza", "zze", EnumC8092c2.zzb(), "zzf", C8331s1.class});
        }
        if (i11 == 3) {
            return new C8107d2();
        }
        if (i11 == 4) {
            return new C8436z1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzg;
    }
}
