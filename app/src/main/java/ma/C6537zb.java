package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/zb.class
 */
/* renamed from: ma.zb */
/* loaded from: combined.jar:classes2.jar:ma/zb.class */
public final class C6537zb extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6537zb zzb;
    private int zzd;
    private long zze;
    private InterfaceC6442ug zzf = AbstractC6295ng.m29905w();
    private InterfaceC6442ug zzg = AbstractC6295ng.m29905w();

    static {
        C6537zb c6537zb = new C6537zb();
        zzb = c6537zb;
        AbstractC6295ng.m29902j(C6537zb.class, c6537zb);
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzb, "\u0001\u0003��\u0001\u0001\u0003\u0003��\u0002��\u0001စ��\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C6537zb();
        }
        if (i11 == 4) {
            return new C6517yb(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
