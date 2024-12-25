package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/r2.class
 */
/* renamed from: ra.r2 */
/* loaded from: combined.jar:classes2.jar:ra/r2.class */
public final class C8317r2 extends AbstractC8231l6<C8317r2, C8302q2> implements InterfaceC8322r7 {
    private static final C8317r2 zzg;
    private int zza;
    private InterfaceC8351t6<C8392w2> zze = AbstractC8231l6.m35578o();
    private C8242m2 zzf;

    static {
        C8317r2 c8317r2 = new C8317r2();
        zzg = c8317r2;
        AbstractC8231l6.m35581u(C8317r2.class, c8317r2);
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001\u001b\u0002ဉ��", new Object[]{"zza", "zze", C8392w2.class, "zzf"});
        }
        if (i11 == 3) {
            return new C8317r2();
        }
        if (i11 == 4) {
            return new C8302q2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzg;
    }
}
