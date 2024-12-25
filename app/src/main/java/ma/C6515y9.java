package ma;

import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/y9.class
 */
/* renamed from: ma.y9 */
/* loaded from: combined.jar:classes2.jar:ma/y9.class */
public final class C6515y9 extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6515y9 zzb;
    private int zzd;
    private C6415ta zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private C6291nc zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        C6515y9 c6515y9 = new C6515y9();
        zzb = c6515y9;
        AbstractC6295ng.m29902j(C6515y9.class, c6515y9);
    }

    /* renamed from: B */
    public static C6515y9 m30160B() {
        return zzb;
    }

    /* renamed from: C */
    public static /* synthetic */ void m30161C(C6515y9 c6515y9, C6415ta c6415ta) {
        c6415ta.getClass();
        c6515y9.zze = c6415ta;
        c6515y9.zzd |= 1;
    }

    /* renamed from: D */
    public static /* synthetic */ void m30162D(C6515y9 c6515y9, boolean z10) {
        c6515y9.zzd |= 2;
        c6515y9.zzf = z10;
    }

    /* renamed from: E */
    public static /* synthetic */ void m30163E(C6515y9 c6515y9, long j10) {
        c6515y9.zzd |= 4;
        c6515y9.zzg = j10;
    }

    /* renamed from: F */
    public static /* synthetic */ void m30164F(C6515y9 c6515y9, int i10) {
        c6515y9.zzd |= 64;
        c6515y9.zzk = i10;
    }

    /* renamed from: G */
    public static /* synthetic */ void m30165G(C6515y9 c6515y9, int i10) {
        c6515y9.zzd |= 128;
        c6515y9.zzl = i10;
    }

    /* renamed from: H */
    public static /* synthetic */ void m30166H(C6515y9 c6515y9, int i10) {
        c6515y9.zzd |= 1024;
        c6515y9.zzo = i10;
    }

    /* renamed from: I */
    public static /* synthetic */ void m30167I(C6515y9 c6515y9, boolean z10) {
        c6515y9.zzd |= 2048;
        c6515y9.zzp = z10;
    }

    /* renamed from: J */
    public static /* synthetic */ void m30168J(C6515y9 c6515y9, int i10) {
        c6515y9.zzd |= 4096;
        c6515y9.zzq = i10;
    }

    /* renamed from: K */
    public static /* synthetic */ void m30169K(C6515y9 c6515y9, int i10) {
        c6515y9.zzd |= NTLMEngineImpl.FLAG_WORKSTATION_PRESENT;
        c6515y9.zzr = i10;
    }

    /* renamed from: L */
    public static /* synthetic */ void m30170L(C6515y9 c6515y9, boolean z10) {
        c6515y9.zzd |= 16384;
        c6515y9.zzs = z10;
    }

    /* renamed from: y */
    public static C6495x9 m30171y() {
        return (C6495x9) zzb.m29917s();
    }

    /* renamed from: z */
    public static C6495x9 m30172z(C6515y9 c6515y9) {
        C6253lg m29917s = zzb.m29917s();
        m29917s.m29836c(c6515y9);
        return (C6495x9) m29917s;
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6295ng.m29901d(zzb, "\u0001\u000f��\u0001\u0001\u000f\u000f������\u0001ဉ��\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C6094e4.m29563a(), "zzj", C6031b4.m29437a(), "zzk", "zzl", "zzm", "zzn", C6410t5.m30037a(), "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new C6515y9();
        }
        if (i11 == 4) {
            return new C6495x9(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
