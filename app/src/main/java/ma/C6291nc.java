package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/nc.class
 */
/* renamed from: ma.nc */
/* loaded from: combined.jar:classes2.jar:ma/nc.class */
public final class C6291nc extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6291nc zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C6291nc c6291nc = new C6291nc();
        zzb = c6291nc;
        AbstractC6295ng.m29902j(C6291nc.class, c6291nc);
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzb, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001ဌ��\u0002ဌ\u0001", new Object[]{"zzd", "zze", C6307o7.m29923a(), "zzf", C6307o7.m29923a()});
        }
        if (i11 == 3) {
            return new C6291nc();
        }
        if (i11 == 4) {
            return new C6270mc(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
