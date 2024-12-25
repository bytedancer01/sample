package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ed.class
 */
/* renamed from: ma.ed */
/* loaded from: combined.jar:classes2.jar:ma/ed.class */
public final class C6103ed extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6103ed zzb;
    private int zzd;
    private int zze;
    private InterfaceC6462vg zzf = AbstractC6295ng.m29906x();
    private InterfaceC6462vg zzg = AbstractC6295ng.m29906x();
    private int zzh;

    static {
        C6103ed c6103ed = new C6103ed();
        zzb = c6103ed;
        AbstractC6295ng.m29902j(C6103ed.class, c6103ed);
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzb, "\u0001\u0004��\u0001\u0001\u0004\u0004��\u0002��\u0001ဌ��\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", C6266m8.m29843a(), "zzf", C6123fc.class, "zzg", C6123fc.class, "zzh"});
        }
        if (i11 == 3) {
            return new C6103ed();
        }
        if (i11 == 4) {
            return new C6082dd(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
