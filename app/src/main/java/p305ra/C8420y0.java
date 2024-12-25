package p305ra;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/y0.class
 */
/* renamed from: ra.y0 */
/* loaded from: combined.jar:classes2.jar:ra/y0.class */
public final class C8420y0 extends AbstractC8231l6<C8420y0, C8360u0> implements InterfaceC8322r7 {
    private static final C8420y0 zzi;
    private int zza;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private InterfaceC8351t6<String> zzh = AbstractC8231l6.m35578o();

    static {
        C8420y0 c8420y0 = new C8420y0();
        zzi = c8420y0;
        AbstractC8231l6.m35581u(C8420y0.class, c8420y0);
    }

    /* renamed from: I */
    public static C8420y0 m36089I() {
        return zzi;
    }

    /* renamed from: A */
    public final EnumC8405x0 m36091A() {
        EnumC8405x0 zza = EnumC8405x0.zza(this.zze);
        EnumC8405x0 enumC8405x0 = zza;
        if (zza == null) {
            enumC8405x0 = EnumC8405x0.UNKNOWN_MATCH_TYPE;
        }
        return enumC8405x0;
    }

    /* renamed from: C */
    public final boolean m36092C() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: D */
    public final String m36093D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final boolean m36094E() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: F */
    public final boolean m36095F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final List<String> m36096G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final int m36097H() {
        return this.zzh.size();
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzi, "\u0001\u0004��\u0001\u0001\u0004\u0004��\u0001��\u0001ဌ��\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zza", "zze", EnumC8405x0.zzb(), "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C8420y0();
        }
        if (i11 == 4) {
            return new C8360u0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzi;
    }

    /* renamed from: z */
    public final boolean m36098z() {
        return (this.zza & 1) != 0;
    }
}
