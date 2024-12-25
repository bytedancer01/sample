package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/f1.class
 */
/* renamed from: ra.f1 */
/* loaded from: combined.jar:classes2.jar:ra/f1.class */
public final class C8136f1 extends AbstractC8231l6<C8136f1, C8121e1> implements InterfaceC8322r7 {
    private static final C8136f1 zzg;
    private int zza;
    private String zze = "";
    private String zzf = "";

    static {
        C8136f1 c8136f1 = new C8136f1();
        zzg = c8136f1;
        AbstractC8231l6.m35581u(C8136f1.class, c8136f1);
    }

    /* renamed from: A */
    public final String m35334A() {
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
            return AbstractC8231l6.m35582w(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001ဈ��\u0002ဈ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C8136f1();
        }
        if (i11 == 4) {
            return new C8121e1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzg;
    }

    /* renamed from: z */
    public final String m35335z() {
        return this.zze;
    }
}
