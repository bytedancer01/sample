package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/d1.class
 */
/* renamed from: ra.d1 */
/* loaded from: combined.jar:classes2.jar:ra/d1.class */
public final class C8106d1 extends AbstractC8231l6<C8106d1, C8091c1> implements InterfaceC8322r7 {
    private static final C8106d1 zzn;
    private int zza;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private InterfaceC8351t6<C8136f1> zzh = AbstractC8231l6.m35578o();
    private InterfaceC8351t6<C8076b1> zzi = AbstractC8231l6.m35578o();
    private InterfaceC8351t6<C8165h0> zzj = AbstractC8231l6.m35578o();
    private String zzk = "";
    private InterfaceC8351t6<C8317r2> zzm = AbstractC8231l6.m35578o();

    static {
        C8106d1 c8106d1 = new C8106d1();
        zzn = c8106d1;
        AbstractC8231l6.m35581u(C8106d1.class, c8106d1);
    }

    /* renamed from: J */
    public static C8091c1 m35177J() {
        return zzn.m35589q();
    }

    /* renamed from: K */
    public static C8106d1 m35178K() {
        return zzn;
    }

    /* renamed from: M */
    public static /* synthetic */ void m35180M(C8106d1 c8106d1, int i10, C8076b1 c8076b1) {
        c8076b1.getClass();
        InterfaceC8351t6<C8076b1> interfaceC8351t6 = c8106d1.zzi;
        if (!interfaceC8351t6.zza()) {
            c8106d1.zzi = AbstractC8231l6.m35579p(interfaceC8351t6);
        }
        c8106d1.zzi.set(i10, c8076b1);
    }

    /* renamed from: A */
    public final long m35182A() {
        return this.zze;
    }

    /* renamed from: C */
    public final boolean m35183C() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: D */
    public final String m35184D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final List<C8136f1> m35185E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final int m35186F() {
        return this.zzi.size();
    }

    /* renamed from: G */
    public final C8076b1 m35187G(int i10) {
        return this.zzi.get(i10);
    }

    /* renamed from: H */
    public final List<C8165h0> m35188H() {
        return this.zzj;
    }

    /* renamed from: I */
    public final boolean m35189I() {
        return this.zzl;
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzn, "\u0001\t��\u0001\u0001\t\t��\u0004��\u0001ဂ��\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", C8136f1.class, "zzi", C8076b1.class, "zzj", C8165h0.class, "zzk", "zzl", "zzm", C8317r2.class});
        }
        if (i11 == 3) {
            return new C8106d1();
        }
        if (i11 == 4) {
            return new C8091c1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzn;
    }

    /* renamed from: z */
    public final boolean m35190z() {
        return (this.zza & 1) != 0;
    }
}
