package ma;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/q9.class
 */
/* renamed from: ma.q9 */
/* loaded from: combined.jar:classes2.jar:ma/q9.class */
public final class C6351q9 extends AbstractC6295ng implements InterfaceC6463vh {
    private static final InterfaceC6421tg zzb = new C6288n9();
    private static final C6351q9 zzd;
    private int zze;
    private C6475w9 zzf;
    private C6416tb zzg;
    private InterfaceC6462vg zzh = AbstractC6295ng.m29906x();
    private InterfaceC6400sg zzi = AbstractC6295ng.m29904v();

    static {
        C6351q9 c6351q9 = new C6351q9();
        zzd = c6351q9;
        AbstractC6295ng.m29902j(C6351q9.class, c6351q9);
    }

    /* renamed from: A */
    public static /* synthetic */ void m29980A(C6351q9 c6351q9, C6475w9 c6475w9) {
        c6475w9.getClass();
        c6351q9.zzf = c6475w9;
        c6351q9.zze |= 1;
    }

    /* renamed from: B */
    public static /* synthetic */ void m29981B(C6351q9 c6351q9, Iterable iterable) {
        InterfaceC6400sg interfaceC6400sg = c6351q9.zzi;
        if (!interfaceC6400sg.mo29641l()) {
            int size = interfaceC6400sg.size();
            c6351q9.zzi = interfaceC6400sg.mo29429m(size == 0 ? 10 : size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c6351q9.zzi.mo29936z(((EnumC6057c9) it.next()).zza());
        }
    }

    /* renamed from: y */
    public static C6309o9 m29982y() {
        return (C6309o9) zzd.m29917s();
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzd, "\u0001\u0004��\u0001\u0001\u0004\u0004��\u0002��\u0001ဉ��\u0002ဉ\u0001\u0003\u001b\u0004\u001e", new Object[]{"zze", "zzf", "zzg", "zzh", C6311ob.class, "zzi", EnumC6057c9.zzb()});
        }
        if (i11 == 3) {
            return new C6351q9();
        }
        if (i11 == 4) {
            return new C6309o9(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
