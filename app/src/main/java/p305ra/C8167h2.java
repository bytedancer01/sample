package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/h2.class
 */
/* renamed from: ra.h2 */
/* loaded from: combined.jar:classes2.jar:ra/h2.class */
public final class C8167h2 extends AbstractC8231l6<C8167h2, C8152g2> implements InterfaceC8322r7 {
    private static final C8167h2 zzg;
    private int zza;
    private int zze;
    private InterfaceC8321r6 zzf = AbstractC8231l6.m35576m();

    static {
        C8167h2 c8167h2 = new C8167h2();
        zzg = c8167h2;
        AbstractC8231l6.m35581u(C8167h2.class, c8167h2);
    }

    /* renamed from: F */
    public static C8152g2 m35405F() {
        return zzg.m35589q();
    }

    /* renamed from: H */
    public static /* synthetic */ void m35407H(C8167h2 c8167h2, int i10) {
        c8167h2.zza |= 1;
        c8167h2.zze = i10;
    }

    /* renamed from: I */
    public static /* synthetic */ void m35408I(C8167h2 c8167h2, Iterable iterable) {
        InterfaceC8321r6 interfaceC8321r6 = c8167h2.zzf;
        if (!interfaceC8321r6.zza()) {
            c8167h2.zzf = AbstractC8231l6.m35577n(interfaceC8321r6);
        }
        AbstractC8349t4.m35810j(iterable, c8167h2.zzf);
    }

    /* renamed from: A */
    public final int m35409A() {
        return this.zze;
    }

    /* renamed from: C */
    public final List<Long> m35410C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final int m35411D() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final long m35412E(int i10) {
        return this.zzf.mo35367u(i10);
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001င��\u0002\u0014", new Object[]{"zza", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C8167h2();
        }
        if (i11 == 4) {
            return new C8152g2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzg;
    }

    /* renamed from: z */
    public final boolean m35413z() {
        return (this.zza & 1) != 0;
    }
}
