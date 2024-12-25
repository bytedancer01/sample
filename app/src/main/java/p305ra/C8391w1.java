package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/w1.class
 */
/* renamed from: ra.w1 */
/* loaded from: combined.jar:classes2.jar:ra/w1.class */
public final class C8391w1 extends AbstractC8231l6<C8391w1, C8376v1> implements InterfaceC8322r7 {
    private static final C8391w1 zze;
    private InterfaceC8351t6<C8421y1> zza = AbstractC8231l6.m35578o();

    static {
        C8391w1 c8391w1 = new C8391w1();
        zze = c8391w1;
        AbstractC8231l6.m35581u(C8391w1.class, c8391w1);
    }

    /* renamed from: C */
    public static C8376v1 m35980C() {
        return zze.m35589q();
    }

    /* renamed from: E */
    public static /* synthetic */ void m35982E(C8391w1 c8391w1, C8421y1 c8421y1) {
        c8421y1.getClass();
        InterfaceC8351t6<C8421y1> interfaceC8351t6 = c8391w1.zza;
        if (!interfaceC8351t6.zza()) {
            c8391w1.zza = AbstractC8231l6.m35579p(interfaceC8351t6);
        }
        c8391w1.zza.add(c8421y1);
    }

    /* renamed from: A */
    public final C8421y1 m35983A(int i10) {
        return this.zza.get(0);
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zze, "\u0001\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"zza", C8421y1.class});
        }
        if (i11 == 3) {
            return new C8391w1();
        }
        if (i11 == 4) {
            return new C8376v1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zze;
    }

    /* renamed from: z */
    public final List<C8421y1> m35984z() {
        return this.zza;
    }
}
