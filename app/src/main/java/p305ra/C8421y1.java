package p305ra;

import com.amazonaws.services.p045s3.internal.Constants;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/y1.class
 */
/* renamed from: ra.y1 */
/* loaded from: combined.jar:classes2.jar:ra/y1.class */
public final class C8421y1 extends AbstractC8231l6<C8421y1, C8406x1> implements InterfaceC8322r7 {
    private static final C8421y1 zzZ;
    public static final int zza = 0;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private C8107d2 zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private InterfaceC8351t6<C8301q1> zzh = AbstractC8231l6.m35578o();
    private InterfaceC8351t6<C8197j2> zzi = AbstractC8231l6.m35578o();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzA = "";
    private String zzD = "";
    private String zzE = "";
    private InterfaceC8351t6<C8226l1> zzG = AbstractC8231l6.m35578o();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private InterfaceC8306q6 zzT = AbstractC8231l6.m35575l();
    private String zzW = "";
    private String zzX = "";

    static {
        C8421y1 c8421y1 = new C8421y1();
        zzZ = c8421y1;
        AbstractC8231l6.m35581u(C8421y1.class, c8421y1);
    }

    /* renamed from: K0 */
    public static C8406x1 m36100K0() {
        return zzZ.m35589q();
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m36102M0(C8421y1 c8421y1, int i10) {
        c8421y1.zze |= 1;
        c8421y1.zzg = 1;
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m36103N0(C8421y1 c8421y1, int i10, C8301q1 c8301q1) {
        c8301q1.getClass();
        c8421y1.m36207c1();
        c8421y1.zzh.set(i10, c8301q1);
    }

    /* renamed from: O0 */
    public static /* synthetic */ void m36104O0(C8421y1 c8421y1, C8301q1 c8301q1) {
        c8301q1.getClass();
        c8421y1.m36207c1();
        c8421y1.zzh.add(c8301q1);
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m36105P0(C8421y1 c8421y1, Iterable iterable) {
        c8421y1.m36207c1();
        AbstractC8349t4.m35810j(iterable, c8421y1.zzh);
    }

    /* renamed from: R0 */
    public static /* synthetic */ void m36107R0(C8421y1 c8421y1, int i10) {
        c8421y1.m36207c1();
        c8421y1.zzh.remove(i10);
    }

    /* renamed from: S0 */
    public static /* synthetic */ void m36108S0(C8421y1 c8421y1, int i10, C8197j2 c8197j2) {
        c8197j2.getClass();
        c8421y1.m36208d1();
        c8421y1.zzi.set(i10, c8197j2);
    }

    /* renamed from: T0 */
    public static /* synthetic */ void m36109T0(C8421y1 c8421y1, C8197j2 c8197j2) {
        c8197j2.getClass();
        c8421y1.m36208d1();
        c8421y1.zzi.add(c8197j2);
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m36110U0(C8421y1 c8421y1, Iterable iterable) {
        c8421y1.m36208d1();
        AbstractC8349t4.m35810j(iterable, c8421y1.zzi);
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m36111V0(C8421y1 c8421y1, int i10) {
        c8421y1.m36208d1();
        c8421y1.zzi.remove(i10);
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m36112W0(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= 2;
        c8421y1.zzj = j10;
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m36113X0(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= 4;
        c8421y1.zzk = j10;
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m36114Y0(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= 8;
        c8421y1.zzl = j10;
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m36115Z0(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= 16;
        c8421y1.zzm = j10;
    }

    /* renamed from: a1 */
    public static /* synthetic */ void m36116a1(C8421y1 c8421y1) {
        c8421y1.zze &= -17;
        c8421y1.zzm = 0L;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m36117b0(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= 32;
        c8421y1.zzn = j10;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m36118c0(C8421y1 c8421y1) {
        c8421y1.zze &= -33;
        c8421y1.zzn = 0L;
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m36119d0(C8421y1 c8421y1, String str) {
        c8421y1.zze |= 64;
        c8421y1.zzo = "android";
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m36120e0(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= 128;
        c8421y1.zzp = str;
    }

    /* renamed from: e1 */
    public static /* synthetic */ void m36121e1(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= 16777216;
        c8421y1.zzH = str;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m36122f0(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= 256;
        c8421y1.zzq = str;
    }

    /* renamed from: f1 */
    public static /* synthetic */ void m36123f1(C8421y1 c8421y1, int i10) {
        c8421y1.zze |= NTLMEngineImpl.FLAG_REQUEST_VERSION;
        c8421y1.zzI = i10;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m36124g0(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= 512;
        c8421y1.zzr = str;
    }

    /* renamed from: g1 */
    public static /* synthetic */ void m36125g1(C8421y1 c8421y1) {
        c8421y1.zze &= -268435457;
        c8421y1.zzL = zzZ.zzL;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m36126h0(C8421y1 c8421y1, int i10) {
        c8421y1.zze |= 1024;
        c8421y1.zzs = i10;
    }

    /* renamed from: h1 */
    public static /* synthetic */ void m36127h1(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH;
        c8421y1.zzM = j10;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m36128i0(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= 2048;
        c8421y1.zzt = str;
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m36129i1(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
        c8421y1.zzN = j10;
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m36130j0(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= 4096;
        c8421y1.zzu = str;
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m36131j1(C8421y1 c8421y1) {
        c8421y1.zze &= Integer.MAX_VALUE;
        c8421y1.zzO = zzZ.zzO;
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m36132k0(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= NTLMEngineImpl.FLAG_WORKSTATION_PRESENT;
        c8421y1.zzv = str;
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m36133k1(C8421y1 c8421y1, int i10) {
        c8421y1.zzf |= 2;
        c8421y1.zzQ = i10;
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m36134l0(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= 16384;
        c8421y1.zzw = j10;
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m36135l1(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zzf |= 4;
        c8421y1.zzR = str;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m36136m0(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= 32768;
        c8421y1.zzx = 37000L;
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m36137m1(C8421y1 c8421y1, C8107d2 c8107d2) {
        c8107d2.getClass();
        c8421y1.zzS = c8107d2;
        c8421y1.zzf |= 8;
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m36138n0(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= 65536;
        c8421y1.zzy = str;
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m36139n1(C8421y1 c8421y1, Iterable iterable) {
        InterfaceC8306q6 interfaceC8306q6 = c8421y1.zzT;
        if (!interfaceC8306q6.zza()) {
            int size = interfaceC8306q6.size();
            c8421y1.zzT = interfaceC8306q6.mo35006n(size == 0 ? 10 : size + size);
        }
        AbstractC8349t4.m35810j(iterable, c8421y1.zzT);
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m36140o0(C8421y1 c8421y1) {
        c8421y1.zze &= -65537;
        c8421y1.zzy = zzZ.zzy;
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m36141o1(C8421y1 c8421y1, long j10) {
        c8421y1.zzf |= 16;
        c8421y1.zzU = j10;
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m36142p0(C8421y1 c8421y1, boolean z10) {
        c8421y1.zze |= 131072;
        c8421y1.zzz = z10;
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m36143p1(C8421y1 c8421y1, long j10) {
        c8421y1.zzf |= 32;
        c8421y1.zzV = j10;
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m36144q0(C8421y1 c8421y1) {
        c8421y1.zze &= -131073;
        c8421y1.zzz = false;
    }

    /* renamed from: q1 */
    public static /* synthetic */ void m36145q1(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zzf |= 64;
        c8421y1.zzW = str;
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m36146r0(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= 262144;
        c8421y1.zzA = str;
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m36147r1(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zzf |= 128;
        c8421y1.zzX = str;
    }

    /* renamed from: s0 */
    public static /* synthetic */ void m36148s0(C8421y1 c8421y1) {
        c8421y1.zze &= -262145;
        c8421y1.zzA = zzZ.zzA;
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m36149t0(C8421y1 c8421y1, long j10) {
        c8421y1.zze |= NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION;
        c8421y1.zzB = j10;
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m36150u0(C8421y1 c8421y1, int i10) {
        c8421y1.zze |= Constants.f7590MB;
        c8421y1.zzC = i10;
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m36151v0(C8421y1 c8421y1, String str) {
        c8421y1.zze |= 2097152;
        c8421y1.zzD = str;
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m36152w0(C8421y1 c8421y1) {
        c8421y1.zze &= -2097153;
        c8421y1.zzD = zzZ.zzD;
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m36153x0(C8421y1 c8421y1, String str) {
        str.getClass();
        c8421y1.zze |= 4194304;
        c8421y1.zzE = str;
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m36154y0(C8421y1 c8421y1, boolean z10) {
        c8421y1.zze |= NTLMEngineImpl.FLAG_TARGETINFO_PRESENT;
        c8421y1.zzF = z10;
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m36155z0(C8421y1 c8421y1, Iterable iterable) {
        InterfaceC8351t6<C8226l1> interfaceC8351t6 = c8421y1.zzG;
        if (!interfaceC8351t6.zza()) {
            c8421y1.zzG = AbstractC8231l6.m35579p(interfaceC8351t6);
        }
        AbstractC8349t4.m35810j(iterable, c8421y1.zzG);
    }

    /* renamed from: A */
    public final String m36156A() {
        return this.zzv;
    }

    /* renamed from: A1 */
    public final boolean m36157A1() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: B0 */
    public final String m36158B0() {
        return this.zzO;
    }

    /* renamed from: B1 */
    public final long m36159B1() {
        return this.zzk;
    }

    /* renamed from: C */
    public final boolean m36160C() {
        return (this.zze & 16384) != 0;
    }

    /* renamed from: C0 */
    public final boolean m36161C0() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: C1 */
    public final boolean m36162C1() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: D */
    public final long m36163D() {
        return this.zzw;
    }

    /* renamed from: D0 */
    public final int m36164D0() {
        return this.zzQ;
    }

    /* renamed from: D1 */
    public final long m36165D1() {
        return this.zzl;
    }

    /* renamed from: E */
    public final boolean m36166E() {
        return (this.zze & 32768) != 0;
    }

    /* renamed from: E0 */
    public final String m36167E0() {
        return this.zzR;
    }

    /* renamed from: E1 */
    public final boolean m36168E1() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: F */
    public final long m36169F() {
        return this.zzx;
    }

    /* renamed from: F0 */
    public final boolean m36170F0() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: F1 */
    public final long m36171F1() {
        return this.zzm;
    }

    /* renamed from: G */
    public final String m36172G() {
        return this.zzy;
    }

    /* renamed from: G0 */
    public final long m36173G0() {
        return this.zzU;
    }

    /* renamed from: G1 */
    public final boolean m36174G1() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: H */
    public final boolean m36175H() {
        return (this.zze & 131072) != 0;
    }

    /* renamed from: H0 */
    public final String m36176H0() {
        return this.zzW;
    }

    /* renamed from: H1 */
    public final long m36177H1() {
        return this.zzn;
    }

    /* renamed from: I */
    public final boolean m36178I() {
        return this.zzz;
    }

    /* renamed from: I0 */
    public final boolean m36179I0() {
        return (this.zzf & 128) != 0;
    }

    /* renamed from: I1 */
    public final String m36180I1() {
        return this.zzo;
    }

    /* renamed from: J */
    public final String m36181J() {
        return this.zzA;
    }

    /* renamed from: J0 */
    public final String m36182J0() {
        return this.zzX;
    }

    /* renamed from: J1 */
    public final String m36183J1() {
        return this.zzp;
    }

    /* renamed from: K */
    public final boolean m36184K() {
        return (this.zze & NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION) != 0;
    }

    /* renamed from: K1 */
    public final String m36185K1() {
        return this.zzq;
    }

    /* renamed from: L */
    public final long m36186L() {
        return this.zzB;
    }

    /* renamed from: L1 */
    public final String m36187L1() {
        return this.zzr;
    }

    /* renamed from: M */
    public final boolean m36188M() {
        return (this.zze & Constants.f7590MB) != 0;
    }

    /* renamed from: M1 */
    public final boolean m36189M1() {
        return (this.zze & 1024) != 0;
    }

    /* renamed from: N */
    public final int m36190N() {
        return this.zzC;
    }

    /* renamed from: N1 */
    public final int m36191N1() {
        return this.zzs;
    }

    /* renamed from: O */
    public final String m36192O() {
        return this.zzD;
    }

    /* renamed from: O1 */
    public final String m36193O1() {
        return this.zzt;
    }

    /* renamed from: P */
    public final String m36194P() {
        return this.zzE;
    }

    /* renamed from: Q */
    public final boolean m36195Q() {
        return (this.zze & NTLMEngineImpl.FLAG_TARGETINFO_PRESENT) != 0;
    }

    /* renamed from: R */
    public final boolean m36196R() {
        return this.zzF;
    }

    /* renamed from: S */
    public final List<C8226l1> m36197S() {
        return this.zzG;
    }

    /* renamed from: T */
    public final String m36198T() {
        return this.zzH;
    }

    /* renamed from: U */
    public final boolean m36199U() {
        return (this.zze & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0;
    }

    /* renamed from: V */
    public final int m36200V() {
        return this.zzI;
    }

    /* renamed from: W */
    public final boolean m36201W() {
        return (this.zze & NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH) != 0;
    }

    /* renamed from: X */
    public final long m36202X() {
        return this.zzM;
    }

    /* renamed from: Y */
    public final boolean m36203Y() {
        return (this.zze & NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH) != 0;
    }

    /* renamed from: Z */
    public final long m36204Z() {
        return this.zzN;
    }

    /* renamed from: a0 */
    public final boolean m36205a0() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: b1 */
    public final int m36206b1() {
        return this.zzg;
    }

    /* renamed from: c1 */
    public final void m36207c1() {
        InterfaceC8351t6<C8301q1> interfaceC8351t6 = this.zzh;
        if (interfaceC8351t6.zza()) {
            return;
        }
        this.zzh = AbstractC8231l6.m35579p(interfaceC8351t6);
    }

    /* renamed from: d1 */
    public final void m36208d1() {
        InterfaceC8351t6<C8197j2> interfaceC8351t6 = this.zzi;
        if (interfaceC8351t6.zza()) {
            return;
        }
        this.zzi = AbstractC8231l6.m35579p(interfaceC8351t6);
    }

    /* renamed from: s1 */
    public final List<C8301q1> m36209s1() {
        return this.zzh;
    }

    /* renamed from: t1 */
    public final int m36210t1() {
        return this.zzh.size();
    }

    /* renamed from: u1 */
    public final C8301q1 m36211u1(int i10) {
        return this.zzh.get(i10);
    }

    /* renamed from: v1 */
    public final List<C8197j2> m36212v1() {
        return this.zzi;
    }

    /* renamed from: w1 */
    public final int m36213w1() {
        return this.zzi.size();
    }

    @Override // p305ra.AbstractC8231l6
    /* renamed from: x */
    public final Object mo35030x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC8231l6.m35582w(zzZ, "\u0001-��\u0002\u00015-��\u0004��\u0001င��\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(", new Object[]{"zze", "zzf", "zzg", "zzh", C8301q1.class, "zzi", C8197j2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", C8226l1.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", EnumC8196j1.zzb()});
        }
        if (i11 == 3) {
            return new C8421y1();
        }
        if (i11 == 4) {
            return new C8406x1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzZ;
    }

    /* renamed from: x1 */
    public final C8197j2 m36214x1(int i10) {
        return this.zzi.get(i10);
    }

    /* renamed from: y1 */
    public final boolean m36215y1() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: z */
    public final String m36216z() {
        return this.zzu;
    }

    /* renamed from: z1 */
    public final long m36217z1() {
        return this.zzj;
    }
}
