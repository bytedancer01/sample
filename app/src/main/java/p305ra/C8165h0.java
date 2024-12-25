package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/h0.class
 */
/* renamed from: ra.h0 */
/* loaded from: combined.jar:classes2.jar:ra/h0.class */
public final class C8165h0 extends AbstractC8231l6<C8165h0, C8150g0> implements InterfaceC8322r7 {
    private static final C8165h0 zzj;
    private int zza;
    private int zze;
    private InterfaceC8351t6<C8345t0> zzf = AbstractC8231l6.m35578o();
    private InterfaceC8351t6<C8195j0> zzg = AbstractC8231l6.m35578o();
    private boolean zzh;
    private boolean zzi;

    static {
        C8165h0 c8165h0 = new C8165h0();
        zzj = c8165h0;
        AbstractC8231l6.m35581u(C8165h0.class, c8165h0);
    }

    /* renamed from: J */
    public static /* synthetic */ void m35395J(C8165h0 c8165h0, int i10, C8345t0 c8345t0) {
        c8345t0.getClass();
        InterfaceC8351t6<C8345t0> interfaceC8351t6 = c8165h0.zzf;
        if (!interfaceC8351t6.zza()) {
            c8165h0.zzf = AbstractC8231l6.m35579p(interfaceC8351t6);
        }
        c8165h0.zzf.set(i10, c8345t0);
    }

    /* renamed from: K */
    public static /* synthetic */ void m35396K(C8165h0 c8165h0, int i10, C8195j0 c8195j0) {
        c8195j0.getClass();
        InterfaceC8351t6<C8195j0> interfaceC8351t6 = c8165h0.zzg;
        if (!interfaceC8351t6.zza()) {
            c8165h0.zzg = AbstractC8231l6.m35579p(interfaceC8351t6);
        }
        c8165h0.zzg.set(i10, c8195j0);
    }

    /* renamed from: A */
    public final int m35397A() {
        return this.zze;
    }

    /* renamed from: C */
    public final List<C8345t0> m35398C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final int m35399D() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final C8345t0 m35400E(int i10) {
        return this.zzf.get(i10);
    }

    /* renamed from: F */
    public final List<C8195j0> m35401F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final int m35402G() {
        return this.zzg.size();
    }

    /* renamed from: H */
    public final C8195j0 m35403H(int i10) {
        return this.zzg.get(i10);
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzj, "\u0001\u0005��\u0001\u0001\u0005\u0005��\u0002��\u0001င��\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zza", "zze", "zzf", C8345t0.class, "zzg", C8195j0.class, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C8165h0();
        }
        if (i11 == 4) {
            return new C8150g0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzj;
    }

    /* renamed from: z */
    public final boolean m35404z() {
        return (this.zza & 1) != 0;
    }
}
