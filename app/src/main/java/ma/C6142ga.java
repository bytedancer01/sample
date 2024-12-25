package ma;

import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ga.class
 */
/* renamed from: ma.ga */
/* loaded from: combined.jar:classes2.jar:ma/ga.class */
public final class C6142ga extends AbstractC6295ng implements InterfaceC6463vh {
    private static final C6142ga zzb;
    private C6375rc zzC;
    private int zzD;
    private int zzE;
    private C6415ta zzF;
    private int zzG;
    private C6100ea zzH;
    private C6415ta zzJ;
    private int zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private C6145gd zzQ;
    private C6515y9 zzR;
    private C6267m9 zzS;
    private C6353qb zzT;
    private C6333pc zzU;
    private C6457vb zzV;
    private int zzX;
    private C6081dc zzY;
    private boolean zzaa;
    private boolean zzab;
    private int zzac;
    private C6351q9 zzad;
    private C6249lc zzae;
    private C6227kb zzaf;
    private C6226ka zzag;
    private C6039bc zzah;
    private C6518yc zzai;
    private C6268ma zzaj;
    private int zzak;
    private int zzal;
    private int zzam;
    private C6292nd zzao;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private C6143gb zzi;
    private C6207jc zzj;
    private C6101eb zzk;
    private C6536za zzl;
    private C6058ca zzm;
    private C6165hc zzn;
    private C6435u9 zzo;
    private C6103ed zzp;
    private C6496xa zzr;
    private C6449v3 zzs;
    private C6537zb zzv;
    private byte zzap = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzw = "";
    private InterfaceC6400sg zzx = AbstractC6295ng.m29904v();
    private InterfaceC6462vg zzy = AbstractC6295ng.m29906x();
    private InterfaceC6462vg zzz = AbstractC6295ng.m29906x();
    private InterfaceC6462vg zzA = AbstractC6295ng.m29906x();
    private InterfaceC6462vg zzB = AbstractC6295ng.m29906x();
    private InterfaceC6462vg zzI = AbstractC6295ng.m29906x();
    private InterfaceC6462vg zzW = AbstractC6295ng.m29906x();
    private InterfaceC6462vg zzZ = AbstractC6295ng.m29906x();
    private InterfaceC6462vg zzan = AbstractC6295ng.m29906x();

    static {
        C6142ga c6142ga = new C6142ga();
        zzb = c6142ga;
        AbstractC6295ng.m29902j(C6142ga.class, c6142ga);
    }

    /* renamed from: A */
    public static C6121fa m29622A(C6142ga c6142ga) {
        C6253lg m29917s = zzb.m29917s();
        m29917s.m29836c(c6142ga);
        return (C6121fa) m29917s;
    }

    /* renamed from: C */
    public static /* synthetic */ void m29624C(C6142ga c6142ga, int i10) {
        c6142ga.zzd |= NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
        c6142ga.zzP = i10;
    }

    /* renamed from: D */
    public static /* synthetic */ void m29625D(C6142ga c6142ga, C6515y9 c6515y9) {
        c6515y9.getClass();
        c6142ga.zzR = c6515y9;
        c6142ga.zze |= 1;
    }

    /* renamed from: E */
    public static /* synthetic */ void m29626E(C6142ga c6142ga, C6475w9 c6475w9) {
        c6475w9.getClass();
        InterfaceC6462vg interfaceC6462vg = c6142ga.zzW;
        if (!interfaceC6462vg.mo29641l()) {
            c6142ga.zzW = AbstractC6295ng.m29899b(interfaceC6462vg);
        }
        c6142ga.zzW.add(c6475w9);
    }

    /* renamed from: F */
    public static /* synthetic */ void m29627F(C6142ga c6142ga, C6351q9 c6351q9) {
        c6351q9.getClass();
        c6142ga.zzad = c6351q9;
        c6142ga.zze |= 1024;
    }

    /* renamed from: G */
    public static /* synthetic */ void m29628G(C6142ga c6142ga, C6226ka c6226ka) {
        c6226ka.getClass();
        c6142ga.zzag = c6226ka;
        c6142ga.zze |= NTLMEngineImpl.FLAG_WORKSTATION_PRESENT;
    }

    /* renamed from: H */
    public static /* synthetic */ void m29629H(C6142ga c6142ga, long j10) {
        c6142ga.zzd |= 2;
        c6142ga.zzg = j10;
    }

    /* renamed from: I */
    public static /* synthetic */ void m29630I(C6142ga c6142ga, String str) {
        c6142ga.zzd |= 2048;
        c6142ga.zzq = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m29631J(C6142ga c6142ga, String str) {
        str.getClass();
        c6142ga.zzd |= 16384;
        c6142ga.zzt = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m29632K(C6142ga c6142ga, String str) {
        str.getClass();
        c6142ga.zzd |= 32768;
        c6142ga.zzu = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m29633L(C6142ga c6142ga, String str) {
        c6142ga.zzd |= 131072;
        c6142ga.zzw = str;
    }

    /* renamed from: z */
    public static C6121fa m29634z() {
        return (C6121fa) zzb.m29917s();
    }

    @Override // ma.AbstractC6295ng
    /* renamed from: o */
    public final Object mo29386o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzap);
        }
        byte b10 = 1;
        if (i11 != 2) {
            if (i11 == 3) {
                return new C6142ga();
            }
            if (i11 == 4) {
                return new C6121fa(null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzap = b10;
            return null;
        }
        return AbstractC6295ng.m29901d(zzb, "\u0001>��\u0002\u0001>>��\t\u0001\u0001ဂ��\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0010\u0011ဈ\u0011\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017ဌ\u0013\u0018ဉ\u0017\u0019\u001b\u001aဉ\u0018\u001bဌ\u001a\u001cင\u001b\u001dင\u001c\u001eင\u001d\u001fဆ\u001e ဉ\u001f!ဉ \"ဉ!#ဌ\u0014$ဉ\u0015%ᐉ\"&ဉ#'ဉ$(\u001b)ဌ%*ဉ&+\u001b,ဌ\u0019-ဇ'.ဇ(/ဌ)0ဉ*1င\u00162ဉ+3ဉ,4ဉ.5ဉ/6ဉ07ဌ18ဌ29ဌ3:\u001b;ဈ\u000f<ဉ4=ဉ->ဉ\u0012", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C6203j8.m29773a(), "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzv", "zzw", "zzx", "zzy", C6185ib.class, "zzz", C6269mb.class, "zzA", C6310oa.class, "zzB", C6438uc.class, "zzD", C6077d8.m29547a(), "zzH", "zzI", C6415ta.class, "zzJ", "zzL", C6180i6.m29671a(), "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzE", C6493x7.m30107a(), "zzF", "zzT", "zzU", "zzV", "zzW", C6475w9.class, "zzX", C6014a8.m29384a(), "zzY", "zzZ", C6016aa.class, "zzK", C6117f6.m29585a(), "zzaa", "zzab", "zzac", C6531z5.m30187a(), "zzad", "zzG", "zzae", "zzaf", "zzah", "zzai", "zzaj", "zzak", C6430u4.m30064a(), "zzal", C6034b7.m29438a(), "zzam", C6367r4.m29996a(), "zzan", C6019ad.class, "zzu", "zzao", "zzag", "zzC"});
    }

    /* renamed from: y */
    public final C6515y9 m29635y() {
        C6515y9 c6515y9 = this.zzR;
        C6515y9 c6515y92 = c6515y9;
        if (c6515y9 == null) {
            c6515y92 = C6515y9.m30160B();
        }
        return c6515y92;
    }
}
