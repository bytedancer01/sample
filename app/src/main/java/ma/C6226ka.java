package ma;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ka.class
 */
/* renamed from: ma.ka */
/* loaded from: combined.jar:classes2.jar:ma/ka.class */
public final class C6226ka extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6226ka zzb;
    private int zzd;
    private long zzf;
    private long zzg;
    private int zzi;
    private boolean zzj;
    private long zzl;
    private long zzm;
    private String zze = "";
    private InterfaceC6462vg zzh = AbstractC6295ng.m29906x();
    private String zzk = "";

    static {
        C6226ka c6226ka = new C6226ka();
        zzb = c6226ka;
        AbstractC6295ng.m29902j(C6226ka.class, c6226ka);
    }

    /* renamed from: A */
    public static /* synthetic */ void m29808A(C6226ka c6226ka, String str) {
        str.getClass();
        c6226ka.zzd |= 1;
        c6226ka.zze = str;
    }

    /* renamed from: B */
    public static /* synthetic */ void m29809B(C6226ka c6226ka, long j10) {
        c6226ka.zzd |= 2;
        c6226ka.zzf = j10;
    }

    /* renamed from: C */
    public static /* synthetic */ void m29810C(C6226ka c6226ka, long j10) {
        c6226ka.zzd |= 4;
        c6226ka.zzg = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static /* synthetic */ void m29811D(C6226ka c6226ka, Iterable iterable) {
        InterfaceC6462vg interfaceC6462vg = c6226ka.zzh;
        if (!interfaceC6462vg.mo29641l()) {
            c6226ka.zzh = AbstractC6295ng.m29899b(interfaceC6462vg);
        }
        List list = c6226ka.zzh;
        Charset charset = C6482wg.f34130a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    /* renamed from: E */
    public static /* synthetic */ void m29812E(C6226ka c6226ka, int i10) {
        c6226ka.zzd |= 8;
        c6226ka.zzi = i10;
    }

    /* renamed from: F */
    public static /* synthetic */ void m29813F(C6226ka c6226ka, boolean z10) {
        c6226ka.zzd |= 16;
        c6226ka.zzj = z10;
    }

    /* renamed from: G */
    public static /* synthetic */ void m29814G(C6226ka c6226ka, String str) {
        str.getClass();
        c6226ka.zzd |= 32;
        c6226ka.zzk = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m29815H(C6226ka c6226ka, long j10) {
        c6226ka.zzd |= 64;
        c6226ka.zzl = j10;
    }

    /* renamed from: I */
    public static /* synthetic */ void m29816I(C6226ka c6226ka, long j10) {
        c6226ka.zzd |= 128;
        c6226ka.zzm = j10;
    }

    /* renamed from: y */
    public static C6205ja m29817y() {
        return (C6205ja) zzb.m29917s();
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzb, "\u0001\t��\u0001\u0001\t\t��\u0001��\u0001ဈ��\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u001b\u0005င\u0003\u0006ဇ\u0004\u0007ဈ\u0005\bဂ\u0006\tဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C6184ia.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C6226ka();
        }
        if (i11 == 4) {
            return new C6205ja(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
