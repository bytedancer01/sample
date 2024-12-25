package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/o2.class
 */
/* renamed from: ra.o2 */
/* loaded from: combined.jar:classes2.jar:ra/o2.class */
public final class C8272o2 extends AbstractC8231l6<C8272o2, C8257n2> implements InterfaceC8322r7 {
    private static final C8272o2 zzg;
    private int zza;
    private String zze = "";
    private InterfaceC8351t6<C8392w2> zzf = AbstractC8231l6.m35578o();

    static {
        C8272o2 c8272o2 = new C8272o2();
        zzg = c8272o2;
        AbstractC8231l6.m35581u(C8272o2.class, c8272o2);
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001ဈ��\u0002\u001b", new Object[]{"zza", "zze", "zzf", C8392w2.class});
        }
        if (i11 == 3) {
            return new C8272o2();
        }
        if (i11 == 4) {
            return new C8257n2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzg;
    }
}
