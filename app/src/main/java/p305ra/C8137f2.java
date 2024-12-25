package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/f2.class
 */
/* renamed from: ra.f2 */
/* loaded from: combined.jar:classes2.jar:ra/f2.class */
public final class C8137f2 extends AbstractC8231l6<C8137f2, C8122e2> implements InterfaceC8322r7 {
    private static final C8137f2 zzh;
    private InterfaceC8321r6 zza = AbstractC8231l6.m35576m();
    private InterfaceC8321r6 zze = AbstractC8231l6.m35576m();
    private InterfaceC8351t6<C8256n1> zzf = AbstractC8231l6.m35578o();
    private InterfaceC8351t6<C8167h2> zzg = AbstractC8231l6.m35578o();

    static {
        C8137f2 c8137f2 = new C8137f2();
        zzh = c8137f2;
        AbstractC8231l6.m35581u(C8137f2.class, c8137f2);
    }

    /* renamed from: K */
    public static C8122e2 m35336K() {
        return zzh.m35589q();
    }

    /* renamed from: L */
    public static C8137f2 m35337L() {
        return zzh;
    }

    /* renamed from: N */
    public static /* synthetic */ void m35339N(C8137f2 c8137f2, Iterable iterable) {
        InterfaceC8321r6 interfaceC8321r6 = c8137f2.zza;
        if (!interfaceC8321r6.zza()) {
            c8137f2.zza = AbstractC8231l6.m35577n(interfaceC8321r6);
        }
        AbstractC8349t4.m35810j(iterable, c8137f2.zza);
    }

    /* renamed from: P */
    public static /* synthetic */ void m35341P(C8137f2 c8137f2, Iterable iterable) {
        InterfaceC8321r6 interfaceC8321r6 = c8137f2.zze;
        if (!interfaceC8321r6.zza()) {
            c8137f2.zze = AbstractC8231l6.m35577n(interfaceC8321r6);
        }
        AbstractC8349t4.m35810j(iterable, c8137f2.zze);
    }

    /* renamed from: R */
    public static /* synthetic */ void m35343R(C8137f2 c8137f2, Iterable iterable) {
        c8137f2.m35356V();
        AbstractC8349t4.m35810j(iterable, c8137f2.zzf);
    }

    /* renamed from: S */
    public static /* synthetic */ void m35344S(C8137f2 c8137f2, int i10) {
        c8137f2.m35356V();
        c8137f2.zzf.remove(i10);
    }

    /* renamed from: T */
    public static /* synthetic */ void m35345T(C8137f2 c8137f2, Iterable iterable) {
        c8137f2.m35357W();
        AbstractC8349t4.m35810j(iterable, c8137f2.zzg);
    }

    /* renamed from: U */
    public static /* synthetic */ void m35346U(C8137f2 c8137f2, int i10) {
        c8137f2.m35357W();
        c8137f2.zzg.remove(i10);
    }

    /* renamed from: A */
    public final int m35347A() {
        return this.zza.size();
    }

    /* renamed from: C */
    public final List<Long> m35348C() {
        return this.zze;
    }

    /* renamed from: D */
    public final int m35349D() {
        return this.zze.size();
    }

    /* renamed from: E */
    public final List<C8256n1> m35350E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final int m35351F() {
        return this.zzf.size();
    }

    /* renamed from: G */
    public final C8256n1 m35352G(int i10) {
        return this.zzf.get(i10);
    }

    /* renamed from: H */
    public final List<C8167h2> m35353H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final int m35354I() {
        return this.zzg.size();
    }

    /* renamed from: J */
    public final C8167h2 m35355J(int i10) {
        return this.zzg.get(i10);
    }

    /* renamed from: V */
    public final void m35356V() {
        InterfaceC8351t6<C8256n1> interfaceC8351t6 = this.zzf;
        if (interfaceC8351t6.zza()) {
            return;
        }
        this.zzf = AbstractC8231l6.m35579p(interfaceC8351t6);
    }

    /* renamed from: W */
    public final void m35357W() {
        InterfaceC8351t6<C8167h2> interfaceC8351t6 = this.zzg;
        if (interfaceC8351t6.zza()) {
            return;
        }
        this.zzg = AbstractC8231l6.m35579p(interfaceC8351t6);
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzh, "\u0001\u0004����\u0001\u0004\u0004��\u0004��\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zza", "zze", "zzf", C8256n1.class, "zzg", C8167h2.class});
        }
        if (i11 == 3) {
            return new C8137f2();
        }
        if (i11 == 4) {
            return new C8122e2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzh;
    }

    /* renamed from: z */
    public final List<Long> m35358z() {
        return this.zza;
    }
}
