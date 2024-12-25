package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/m2.class
 */
/* renamed from: ra.m2 */
/* loaded from: combined.jar:classes2.jar:ra/m2.class */
public final class C8242m2 extends AbstractC8231l6<C8242m2, C8227l2> implements InterfaceC8322r7 {
    private static final C8242m2 zze;
    private InterfaceC8351t6<C8272o2> zza = AbstractC8231l6.m35578o();

    static {
        C8242m2 c8242m2 = new C8242m2();
        zze = c8242m2;
        AbstractC8231l6.m35581u(C8242m2.class, c8242m2);
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zze, "\u0001\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"zza", C8272o2.class});
        }
        if (i11 == 3) {
            return new C8242m2();
        }
        if (i11 == 4) {
            return new C8227l2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zze;
    }
}
