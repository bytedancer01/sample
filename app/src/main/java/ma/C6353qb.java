package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/qb.class
 */
/* renamed from: ma.qb */
/* loaded from: combined.jar:classes2.jar:ma/qb.class */
public final class C6353qb extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6353qb zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C6353qb c6353qb = new C6353qb();
        zzb = c6353qb;
        AbstractC6295ng.m29902j(C6353qb.class, c6353qb);
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzb, "\u0001\u0003��\u0001\u0001\u0003\u0003����\u0001\u0001ᔌ��\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", C6327p6.m29951a(), "zzf", "zzg", C6183i9.m29672a()});
        }
        if (i11 == 3) {
            return new C6353qb();
        }
        if (i11 == 4) {
            return new C6332pb(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (obj == null) {
            b10 = 0;
        }
        this.zzh = b10;
        return null;
    }
}
