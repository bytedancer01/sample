package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/w9.class
 */
/* renamed from: ma.w9 */
/* loaded from: combined.jar:classes2.jar:ma/w9.class */
public final class C6475w9 extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6475w9 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C6475w9 c6475w9 = new C6475w9();
        zzb = c6475w9;
        AbstractC6295ng.m29902j(C6475w9.class, c6475w9);
    }

    /* renamed from: A */
    public static /* synthetic */ void m30088A(C6475w9 c6475w9, String str) {
        str.getClass();
        c6475w9.zzd |= 1;
        c6475w9.zze = str;
    }

    /* renamed from: B */
    public static /* synthetic */ void m30089B(C6475w9 c6475w9, String str) {
        str.getClass();
        c6475w9.zzd |= 2;
        c6475w9.zzf = str;
    }

    /* renamed from: y */
    public static C6455v9 m30090y() {
        return (C6455v9) zzb.m29917s();
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
            return new C6475w9();
        }
        if (i11 == 4) {
            return new C6455v9(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
