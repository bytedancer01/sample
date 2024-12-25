package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/gb.class
 */
/* renamed from: ma.gb */
/* loaded from: combined.jar:classes2.jar:ma/gb.class */
public final class C6143gb extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6143gb zzb;
    private int zzd;
    private int zze;

    static {
        C6143gb c6143gb = new C6143gb();
        zzb = c6143gb;
        AbstractC6295ng.m29902j(C6143gb.class, c6143gb);
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzb, "\u0001\u0001��\u0001\u0001\u0001\u0001������\u0001ဌ��", new Object[]{"zzd", "zze", C6054c6.m29487a()});
        }
        if (i11 == 3) {
            return new C6143gb();
        }
        if (i11 == 4) {
            return new C6122fb(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
