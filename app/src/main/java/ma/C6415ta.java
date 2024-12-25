package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ta.class
 */
/* renamed from: ma.ta */
/* loaded from: combined.jar:classes2.jar:ma/ta.class */
public final class C6415ta extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6415ta zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C6415ta c6415ta = new C6415ta();
        zzb = c6415ta;
        AbstractC6295ng.m29902j(C6415ta.class, c6415ta);
    }

    /* renamed from: A */
    public static /* synthetic */ void m30039A(C6415ta c6415ta, String str) {
        str.getClass();
        c6415ta.zzd |= 1;
        c6415ta.zze = str;
    }

    /* renamed from: y */
    public static C6394sa m30040y() {
        return (C6394sa) zzb.m29917s();
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
            return new C6415ta();
        }
        if (i11 == 4) {
            return new C6394sa(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
