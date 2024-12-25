package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/tb.class
 */
/* renamed from: ma.tb */
/* loaded from: combined.jar:classes2.jar:ma/tb.class */
public final class C6416tb extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6416tb zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C6416tb c6416tb = new C6416tb();
        zzb = c6416tb;
        AbstractC6295ng.m29902j(C6416tb.class, c6416tb);
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzb, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001ဈ��\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C6416tb();
        }
        if (i11 == 4) {
            return new C6395sb(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
