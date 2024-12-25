package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ia.class
 */
/* renamed from: ma.ia */
/* loaded from: combined.jar:classes2.jar:ma/ia.class */
public final class C6184ia extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6184ia zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        C6184ia c6184ia = new C6184ia();
        zzb = c6184ia;
        AbstractC6295ng.m29902j(C6184ia.class, c6184ia);
    }

    /* renamed from: A */
    public static /* synthetic */ void m29673A(C6184ia c6184ia, String str) {
        str.getClass();
        c6184ia.zzd |= 1;
        c6184ia.zze = str;
    }

    /* renamed from: B */
    public static /* synthetic */ void m29674B(C6184ia c6184ia, long j10) {
        c6184ia.zzd |= 2;
        c6184ia.zzf = j10;
    }

    /* renamed from: y */
    public static C6163ha m29675y() {
        return (C6163ha) zzb.m29917s();
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzb, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001ဈ��\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C6184ia();
        }
        if (i11 == 4) {
            return new C6163ha(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
