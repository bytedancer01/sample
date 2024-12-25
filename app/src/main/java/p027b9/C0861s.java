package p027b9;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.HashMap;
import java.util.Map;
import p027b9.InterfaceC0840f;
import p059d9.C4349a;
import p059d9.C4355c0;
import p059d9.C4377n0;
import p059d9.C4401z0;
import p059d9.InterfaceC4354c;
import p099fc.AbstractC4834t;
import p099fc.AbstractC4838v;
import p099fc.C4836u;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/s.class
 */
/* renamed from: b9.s */
/* loaded from: combined.jar:classes2.jar:b9/s.class */
public final class C0861s implements InterfaceC0840f, InterfaceC0853l0 {

    /* renamed from: p */
    public static final C4836u<String, Integer> f5877p = m5399k();

    /* renamed from: q */
    public static final AbstractC4834t<Long> f5878q = AbstractC4834t.m24543I(6200000L, 3900000L, 2300000L, 1300000L, 620000L);

    /* renamed from: r */
    public static final AbstractC4834t<Long> f5879r = AbstractC4834t.m24543I(248000L, 160000L, 142000L, 127000L, 113000L);

    /* renamed from: s */
    public static final AbstractC4834t<Long> f5880s = AbstractC4834t.m24543I(2200000L, 1300000L, 950000L, 760000L, 520000L);

    /* renamed from: t */
    public static final AbstractC4834t<Long> f5881t = AbstractC4834t.m24543I(4400000L, 2300000L, 1500000L, 1100000L, 640000L);

    /* renamed from: u */
    public static final AbstractC4834t<Long> f5882u = AbstractC4834t.m24543I(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);

    /* renamed from: v */
    public static final AbstractC4834t<Long> f5883v = AbstractC4834t.m24543I(2600000L, 2200000L, 2000000L, 1500000L, 470000L);

    /* renamed from: w */
    public static C0861s f5884w;

    /* renamed from: a */
    public final AbstractC4838v<Integer, Long> f5885a;

    /* renamed from: b */
    public final InterfaceC0840f.a.C10254a f5886b;

    /* renamed from: c */
    public final C4377n0 f5887c;

    /* renamed from: d */
    public final InterfaceC4354c f5888d;

    /* renamed from: e */
    public final boolean f5889e;

    /* renamed from: f */
    public int f5890f;

    /* renamed from: g */
    public long f5891g;

    /* renamed from: h */
    public long f5892h;

    /* renamed from: i */
    public int f5893i;

    /* renamed from: j */
    public long f5894j;

    /* renamed from: k */
    public long f5895k;

    /* renamed from: l */
    public long f5896l;

    /* renamed from: m */
    public long f5897m;

    /* renamed from: n */
    public boolean f5898n;

    /* renamed from: o */
    public int f5899o;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/s$b.class
     */
    /* renamed from: b9.s$b */
    /* loaded from: combined.jar:classes2.jar:b9/s$b.class */
    public static final class b {

        /* renamed from: a */
        public final Context f5900a;

        /* renamed from: b */
        public Map<Integer, Long> f5901b;

        /* renamed from: c */
        public int f5902c;

        /* renamed from: d */
        public InterfaceC4354c f5903d;

        /* renamed from: e */
        public boolean f5904e;

        public b(Context context) {
            this.f5900a = context == null ? null : context.getApplicationContext();
            this.f5901b = m5406c(C4401z0.m22341O(context));
            this.f5902c = 2000;
            this.f5903d = InterfaceC4354c.f26546a;
            this.f5904e = true;
        }

        /* renamed from: b */
        public static AbstractC4834t<Integer> m5405b(String str) {
            AbstractC4834t<Integer> abstractC4834t = C0861s.f5877p.get(str);
            AbstractC4834t<Integer> abstractC4834t2 = abstractC4834t;
            if (abstractC4834t.isEmpty()) {
                abstractC4834t2 = AbstractC4834t.m24544J(2, 2, 2, 2, 2, 2);
            }
            return abstractC4834t2;
        }

        /* renamed from: c */
        public static Map<Integer, Long> m5406c(String str) {
            AbstractC4834t<Integer> m5405b = m5405b(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            AbstractC4834t<Long> abstractC4834t = C0861s.f5878q;
            hashMap.put(2, abstractC4834t.get(m5405b.get(0).intValue()));
            hashMap.put(3, C0861s.f5879r.get(m5405b.get(1).intValue()));
            hashMap.put(4, C0861s.f5880s.get(m5405b.get(2).intValue()));
            hashMap.put(5, C0861s.f5881t.get(m5405b.get(3).intValue()));
            hashMap.put(10, C0861s.f5882u.get(m5405b.get(4).intValue()));
            hashMap.put(9, C0861s.f5883v.get(m5405b.get(5).intValue()));
            hashMap.put(7, abstractC4834t.get(m5405b.get(0).intValue()));
            return hashMap;
        }

        /* renamed from: a */
        public C0861s m5407a() {
            return new C0861s(this.f5900a, this.f5901b, this.f5902c, this.f5903d, this.f5904e);
        }
    }

    public C0861s(Context context, Map<Integer, Long> map, int i10, InterfaceC4354c interfaceC4354c, boolean z10) {
        this.f5885a = AbstractC4838v.m24567d(map);
        this.f5886b = new InterfaceC0840f.a.C10254a();
        this.f5887c = new C4377n0(i10);
        this.f5888d = interfaceC4354c;
        this.f5889e = z10;
        if (context == null) {
            this.f5893i = 0;
            this.f5896l = m5402l(0);
            return;
        }
        C4355c0 m21920d = C4355c0.m21920d(context);
        int m21924f = m21920d.m21924f();
        this.f5893i = m21924f;
        this.f5896l = m5402l(m21924f);
        m21920d.m21925i(new C4355c0.c(this) { // from class: b9.r

            /* renamed from: a */
            public final C0861s f5876a;

            {
                this.f5876a = this;
            }

            @Override // p059d9.C4355c0.c
            /* renamed from: a */
            public final void mo5397a(int i11) {
                this.f5876a.m5404p(i11);
            }
        });
    }

    /* renamed from: k */
    public static C4836u<String, Integer> m5399k() {
        return C4836u.m24556s().m24564i("AD", 1, 2, 0, 0, 2, 2).m24564i("AE", 1, 4, 4, 4, 2, 2).m24564i("AF", 4, 4, 3, 4, 2, 2).m24564i("AG", 4, 2, 1, 4, 2, 2).m24564i("AI", 1, 2, 2, 2, 2, 2).m24564i("AL", 1, 1, 1, 1, 2, 2).m24564i("AM", 2, 2, 1, 3, 2, 2).m24564i("AO", 3, 4, 3, 1, 2, 2).m24564i("AR", 2, 4, 2, 1, 2, 2).m24564i("AS", 2, 2, 3, 3, 2, 2).m24564i("AT", 0, 1, 0, 0, 0, 2).m24564i("AU", 0, 2, 0, 1, 1, 2).m24564i("AW", 1, 2, 0, 4, 2, 2).m24564i("AX", 0, 2, 2, 2, 2, 2).m24564i("AZ", 3, 3, 3, 4, 4, 2).m24564i("BA", 1, 1, 0, 1, 2, 2).m24564i("BB", 0, 2, 0, 0, 2, 2).m24564i("BD", 2, 0, 3, 3, 2, 2).m24564i("BE", 0, 0, 2, 3, 2, 2).m24564i("BF", 4, 4, 4, 2, 2, 2).m24564i("BG", 0, 1, 0, 0, 2, 2).m24564i("BH", 1, 0, 2, 4, 2, 2).m24564i("BI", 4, 4, 4, 4, 2, 2).m24564i("BJ", 4, 4, 4, 4, 2, 2).m24564i("BL", 1, 2, 2, 2, 2, 2).m24564i("BM", 0, 2, 0, 0, 2, 2).m24564i("BN", 3, 2, 1, 0, 2, 2).m24564i("BO", 1, 2, 4, 2, 2, 2).m24564i("BQ", 1, 2, 1, 2, 2, 2).m24564i("BR", 2, 4, 3, 2, 2, 2).m24564i("BS", 2, 2, 1, 3, 2, 2).m24564i("BT", 3, 0, 3, 2, 2, 2).m24564i("BW", 3, 4, 1, 1, 2, 2).m24564i("BY", 1, 1, 1, 2, 2, 2).m24564i("BZ", 2, 2, 2, 2, 2, 2).m24564i("CA", 0, 3, 1, 2, 4, 2).m24564i("CD", 4, 2, 2, 1, 2, 2).m24564i("CF", 4, 2, 3, 2, 2, 2).m24564i("CG", 3, 4, 2, 2, 2, 2).m24564i("CH", 0, 0, 0, 0, 1, 2).m24564i("CI", 3, 3, 3, 3, 2, 2).m24564i("CK", 2, 2, 3, 0, 2, 2).m24564i("CL", 1, 1, 2, 2, 2, 2).m24564i("CM", 3, 4, 3, 2, 2, 2).m24564i("CN", 2, 2, 2, 1, 3, 2).m24564i("CO", 2, 3, 4, 2, 2, 2).m24564i("CR", 2, 3, 4, 4, 2, 2).m24564i("CU", 4, 4, 2, 2, 2, 2).m24564i("CV", 2, 3, 1, 0, 2, 2).m24564i("CW", 1, 2, 0, 0, 2, 2).m24564i("CY", 1, 1, 0, 0, 2, 2).m24564i("CZ", 0, 1, 0, 0, 1, 2).m24564i("DE", 0, 0, 1, 1, 0, 2).m24564i("DJ", 4, 0, 4, 4, 2, 2).m24564i("DK", 0, 0, 1, 0, 0, 2).m24564i("DM", 1, 2, 2, 2, 2, 2).m24564i("DO", 3, 4, 4, 4, 2, 2).m24564i("DZ", 3, 3, 4, 4, 2, 4).m24564i("EC", 2, 4, 3, 1, 2, 2).m24564i("EE", 0, 1, 0, 0, 2, 2).m24564i("EG", 3, 4, 3, 3, 2, 2).m24564i("EH", 2, 2, 2, 2, 2, 2).m24564i("ER", 4, 2, 2, 2, 2, 2).m24564i("ES", 0, 1, 1, 1, 2, 2).m24564i("ET", 4, 4, 4, 1, 2, 2).m24564i("FI", 0, 0, 0, 0, 0, 2).m24564i("FJ", 3, 0, 2, 3, 2, 2).m24564i("FK", 4, 2, 2, 2, 2, 2).m24564i("FM", 3, 2, 4, 4, 2, 2).m24564i("FO", 1, 2, 0, 1, 2, 2).m24564i("FR", 1, 1, 2, 0, 1, 2).m24564i("GA", 3, 4, 1, 1, 2, 2).m24564i("GB", 0, 0, 1, 1, 1, 2).m24564i("GD", 1, 2, 2, 2, 2, 2).m24564i("GE", 1, 1, 1, 2, 2, 2).m24564i("GF", 2, 2, 2, 3, 2, 2).m24564i("GG", 1, 2, 0, 0, 2, 2).m24564i("GH", 3, 1, 3, 2, 2, 2).m24564i("GI", 0, 2, 0, 0, 2, 2).m24564i("GL", 1, 2, 0, 0, 2, 2).m24564i("GM", 4, 3, 2, 4, 2, 2).m24564i("GN", 4, 3, 4, 2, 2, 2).m24564i("GP", 2, 1, 2, 3, 2, 2).m24564i("GQ", 4, 2, 2, 4, 2, 2).m24564i("GR", 1, 2, 0, 0, 2, 2).m24564i("GT", 3, 2, 3, 1, 2, 2).m24564i("GU", 1, 2, 3, 4, 2, 2).m24564i("GW", 4, 4, 4, 4, 2, 2).m24564i("GY", 3, 3, 3, 4, 2, 2).m24564i("HK", 0, 1, 2, 3, 2, 0).m24564i("HN", 3, 1, 3, 3, 2, 2).m24564i("HR", 1, 1, 0, 0, 3, 2).m24564i("HT", 4, 4, 4, 4, 2, 2).m24564i("HU", 0, 0, 0, 0, 0, 2).m24564i("ID", 3, 2, 3, 3, 2, 2).m24564i("IE", 0, 0, 1, 1, 3, 2).m24564i("IL", 1, 0, 2, 3, 4, 2).m24564i("IM", 0, 2, 0, 1, 2, 2).m24564i("IN", 2, 1, 3, 3, 2, 2).m24564i("IO", 4, 2, 2, 4, 2, 2).m24564i("IQ", 3, 3, 4, 4, 2, 2).m24564i("IR", 3, 2, 3, 2, 2, 2).m24564i("IS", 0, 2, 0, 0, 2, 2).m24564i("IT", 0, 4, 0, 1, 2, 2).m24564i("JE", 2, 2, 1, 2, 2, 2).m24564i("JM", 3, 3, 4, 4, 2, 2).m24564i("JO", 2, 2, 1, 1, 2, 2).m24564i("JP", 0, 0, 0, 0, 2, 1).m24564i("KE", 3, 4, 2, 2, 2, 2).m24564i("KG", 2, 0, 1, 1, 2, 2).m24564i("KH", 1, 0, 4, 3, 2, 2).m24564i("KI", 4, 2, 4, 3, 2, 2).m24564i("KM", 4, 3, 2, 3, 2, 2).m24564i("KN", 1, 2, 2, 2, 2, 2).m24564i("KP", 4, 2, 2, 2, 2, 2).m24564i("KR", 0, 0, 1, 3, 1, 2).m24564i("KW", 1, 3, 1, 1, 1, 2).m24564i("KY", 1, 2, 0, 2, 2, 2).m24564i("KZ", 2, 2, 2, 3, 2, 2).m24564i("LA", 1, 2, 1, 1, 2, 2).m24564i("LB", 3, 2, 0, 0, 2, 2).m24564i("LC", 1, 2, 0, 0, 2, 2).m24564i("LI", 0, 2, 2, 2, 2, 2).m24564i("LK", 2, 0, 2, 3, 2, 2).m24564i("LR", 3, 4, 4, 3, 2, 2).m24564i("LS", 3, 3, 2, 3, 2, 2).m24564i("LT", 0, 0, 0, 0, 2, 2).m24564i("LU", 1, 0, 1, 1, 2, 2).m24564i("LV", 0, 0, 0, 0, 2, 2).m24564i("LY", 4, 2, 4, 3, 2, 2).m24564i("MA", 3, 2, 2, 1, 2, 2).m24564i("MC", 0, 2, 0, 0, 2, 2).m24564i("MD", 1, 2, 0, 0, 2, 2).m24564i("ME", 1, 2, 0, 1, 2, 2).m24564i("MF", 2, 2, 1, 1, 2, 2).m24564i("MG", 3, 4, 2, 2, 2, 2).m24564i("MH", 4, 2, 2, 4, 2, 2).m24564i("MK", 1, 1, 0, 0, 2, 2).m24564i("ML", 4, 4, 2, 2, 2, 2).m24564i("MM", 2, 3, 3, 3, 2, 2).m24564i("MN", 2, 4, 2, 2, 2, 2).m24564i("MO", 0, 2, 4, 4, 2, 2).m24564i("MP", 0, 2, 2, 2, 2, 2).m24564i("MQ", 2, 2, 2, 3, 2, 2).m24564i("MR", 3, 0, 4, 3, 2, 2).m24564i("MS", 1, 2, 2, 2, 2, 2).m24564i("MT", 0, 2, 0, 0, 2, 2).m24564i("MU", 2, 1, 1, 2, 2, 2).m24564i("MV", 4, 3, 2, 4, 2, 2).m24564i("MW", 4, 2, 1, 0, 2, 2).m24564i("MX", 2, 4, 4, 4, 4, 2).m24564i("MY", 1, 0, 3, 2, 2, 2).m24564i("MZ", 3, 3, 2, 1, 2, 2).m24564i("NA", 4, 3, 3, 2, 2, 2).m24564i("NC", 3, 0, 4, 4, 2, 2).m24564i("NE", 4, 4, 4, 4, 2, 2).m24564i("NF", 2, 2, 2, 2, 2, 2).m24564i("NG", 3, 3, 2, 3, 2, 2).m24564i("NI", 2, 1, 4, 4, 2, 2).m24564i("NL", 0, 2, 3, 2, 0, 2).m24564i("NO", 0, 1, 2, 0, 0, 2).m24564i("NP", 2, 0, 4, 2, 2, 2).m24564i("NR", 3, 2, 3, 1, 2, 2).m24564i("NU", 4, 2, 2, 2, 2, 2).m24564i("NZ", 0, 2, 1, 2, 4, 2).m24564i("OM", 2, 2, 1, 3, 3, 2).m24564i("PA", 1, 3, 3, 3, 2, 2).m24564i("PE", 2, 3, 4, 4, 2, 2).m24564i("PF", 2, 2, 2, 1, 2, 2).m24564i("PG", 4, 4, 3, 2, 2, 2).m24564i("PH", 2, 1, 3, 3, 3, 2).m24564i("PK", 3, 2, 3, 3, 2, 2).m24564i("PL", 1, 0, 1, 2, 3, 2).m24564i("PM", 0, 2, 2, 2, 2, 2).m24564i("PR", 2, 1, 2, 2, 4, 3).m24564i("PS", 3, 3, 2, 2, 2, 2).m24564i("PT", 0, 1, 1, 0, 2, 2).m24564i("PW", 1, 2, 4, 1, 2, 2).m24564i("PY", 2, 0, 3, 2, 2, 2).m24564i("QA", 2, 3, 1, 2, 3, 2).m24564i("RE", 1, 0, 2, 2, 2, 2).m24564i("RO", 0, 1, 0, 1, 0, 2).m24564i("RS", 1, 2, 0, 0, 2, 2).m24564i("RU", 0, 1, 0, 1, 4, 2).m24564i("RW", 3, 3, 3, 1, 2, 2).m24564i("SA", 2, 2, 2, 1, 1, 2).m24564i("SB", 4, 2, 3, 2, 2, 2).m24564i("SC", 4, 2, 1, 3, 2, 2).m24564i("SD", 4, 4, 4, 4, 2, 2).m24564i("SE", 0, 0, 0, 0, 0, 2).m24564i("SG", 1, 0, 1, 2, 3, 2).m24564i("SH", 4, 2, 2, 2, 2, 2).m24564i("SI", 0, 0, 0, 0, 2, 2).m24564i("SJ", 2, 2, 2, 2, 2, 2).m24564i("SK", 0, 1, 0, 0, 2, 2).m24564i("SL", 4, 3, 4, 0, 2, 2).m24564i("SM", 0, 2, 2, 2, 2, 2).m24564i("SN", 4, 4, 4, 4, 2, 2).m24564i("SO", 3, 3, 3, 4, 2, 2).m24564i("SR", 3, 2, 2, 2, 2, 2).m24564i("SS", 4, 4, 3, 3, 2, 2).m24564i("ST", 2, 2, 1, 2, 2, 2).m24564i("SV", 2, 1, 4, 3, 2, 2).m24564i("SX", 2, 2, 1, 0, 2, 2).m24564i("SY", 4, 3, 3, 2, 2, 2).m24564i("SZ", 3, 3, 2, 4, 2, 2).m24564i("TC", 2, 2, 2, 0, 2, 2).m24564i("TD", 4, 3, 4, 4, 2, 2).m24564i("TG", 3, 2, 2, 4, 2, 2).m24564i("TH", 0, 3, 2, 3, 2, 2).m24564i("TJ", 4, 4, 4, 4, 2, 2).m24564i("TL", 4, 0, 4, 4, 2, 2).m24564i("TM", 4, 2, 4, 3, 2, 2).m24564i("TN", 2, 1, 1, 2, 2, 2).m24564i("TO", 3, 3, 4, 3, 2, 2).m24564i("TR", 1, 2, 1, 1, 2, 2).m24564i("TT", 1, 4, 0, 1, 2, 2).m24564i("TV", 3, 2, 2, 4, 2, 2).m24564i("TW", 0, 0, 0, 0, 1, 0).m24564i("TZ", 3, 3, 3, 2, 2, 2).m24564i("UA", 0, 3, 1, 1, 2, 2).m24564i("UG", 3, 2, 3, 3, 2, 2).m24564i("US", 1, 1, 2, 2, 4, 2).m24564i("UY", 2, 2, 1, 1, 2, 2).m24564i("UZ", 2, 1, 3, 4, 2, 2).m24564i("VC", 1, 2, 2, 2, 2, 2).m24564i("VE", 4, 4, 4, 4, 2, 2).m24564i("VG", 2, 2, 1, 1, 2, 2).m24564i("VI", 1, 2, 1, 2, 2, 2).m24564i("VN", 0, 1, 3, 4, 2, 2).m24564i("VU", 4, 0, 3, 1, 2, 2).m24564i("WF", 4, 2, 2, 4, 2, 2).m24564i("WS", 3, 1, 3, 1, 2, 2).m24564i("XK", 0, 1, 1, 0, 2, 2).m24564i("YE", 4, 4, 4, 3, 2, 2).m24564i("YT", 4, 2, 2, 3, 2, 2).m24564i("ZA", 3, 3, 2, 1, 2, 2).m24564i("ZM", 3, 2, 3, 3, 2, 2).m24564i("ZW", 3, 2, 4, 3, 2, 2).m24561f();
    }

    /* renamed from: m */
    public static C0861s m5400m(Context context) {
        C0861s c0861s;
        synchronized (C0861s.class) {
            try {
                if (f5884w == null) {
                    f5884w = new b(context).m5407a();
                }
                c0861s = f5884w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0861s;
    }

    /* renamed from: n */
    public static boolean m5401n(C0858p c0858p, boolean z10) {
        return z10 && !c0858p.m5379d(8);
    }

    @Override // p027b9.InterfaceC0840f
    /* renamed from: a */
    public void mo5338a(InterfaceC0840f.a aVar) {
        this.f5886b.m5348e(aVar);
    }

    @Override // p027b9.InterfaceC0840f
    /* renamed from: b */
    public /* synthetic */ long mo5339b() {
        return C0836d.m5309a(this);
    }

    @Override // p027b9.InterfaceC0840f
    /* renamed from: c */
    public void mo5340c(Handler handler, InterfaceC0840f.a aVar) {
        C4349a.m21882e(handler);
        C4349a.m21882e(aVar);
        this.f5886b.m5346b(handler, aVar);
    }

    @Override // p027b9.InterfaceC0840f
    /* renamed from: d */
    public InterfaceC0853l0 mo5341d() {
        return this;
    }

    @Override // p027b9.InterfaceC0840f
    /* renamed from: e */
    public long mo5342e() {
        long j10;
        synchronized (this) {
            j10 = this.f5896l;
        }
        return j10;
    }

    @Override // p027b9.InterfaceC0853l0
    /* renamed from: f */
    public void mo5370f(InterfaceC0854m interfaceC0854m, C0858p c0858p, boolean z10, int i10) {
        synchronized (this) {
            if (m5401n(c0858p, z10)) {
                this.f5892h += i10;
            }
        }
    }

    @Override // p027b9.InterfaceC0853l0
    /* renamed from: g */
    public void mo5371g(InterfaceC0854m interfaceC0854m, C0858p c0858p, boolean z10) {
    }

    @Override // p027b9.InterfaceC0853l0
    /* renamed from: h */
    public void mo5372h(InterfaceC0854m interfaceC0854m, C0858p c0858p, boolean z10) {
        synchronized (this) {
            if (m5401n(c0858p, z10)) {
                if (this.f5890f == 0) {
                    this.f5891g = this.f5888d.mo21913b();
                }
                this.f5890f++;
            }
        }
    }

    @Override // p027b9.InterfaceC0853l0
    /* renamed from: i */
    public void mo5373i(InterfaceC0854m interfaceC0854m, C0858p c0858p, boolean z10) {
        synchronized (this) {
            if (m5401n(c0858p, z10)) {
                C4349a.m21884g(this.f5890f > 0);
                long mo21913b = this.f5888d.mo21913b();
                int i10 = (int) (mo21913b - this.f5891g);
                this.f5894j += i10;
                long j10 = this.f5895k;
                long j11 = this.f5892h;
                this.f5895k = j10 + j11;
                if (i10 > 0) {
                    this.f5887c.m22165c((int) Math.sqrt(j11), (j11 * 8000.0f) / i10);
                    if (this.f5894j >= 2000 || this.f5895k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        this.f5896l = (long) this.f5887c.m22168f(0.5f);
                    }
                    m5403o(i10, this.f5892h, this.f5896l);
                    this.f5891g = mo21913b;
                    this.f5892h = 0L;
                }
                this.f5890f--;
            }
        }
    }

    /* renamed from: l */
    public final long m5402l(int i10) {
        Long l10 = this.f5885a.get(Integer.valueOf(i10));
        Long l11 = l10;
        if (l10 == null) {
            l11 = this.f5885a.get(0);
        }
        Long l12 = l11;
        if (l11 == null) {
            l12 = 1000000L;
        }
        return l12.longValue();
    }

    /* renamed from: o */
    public final void m5403o(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f5897m) {
            return;
        }
        this.f5897m = j11;
        this.f5886b.m5347c(i10, j10, j11);
    }

    /* renamed from: p */
    public final void m5404p(int i10) {
        synchronized (this) {
            int i11 = this.f5893i;
            if (i11 == 0 || this.f5889e) {
                if (this.f5898n) {
                    i10 = this.f5899o;
                }
                if (i11 == i10) {
                    return;
                }
                this.f5893i = i10;
                if (i10 == 1 || i10 == 0 || i10 == 8) {
                    return;
                }
                this.f5896l = m5402l(i10);
                long mo21913b = this.f5888d.mo21913b();
                m5403o(this.f5890f > 0 ? (int) (mo21913b - this.f5891g) : 0, this.f5892h, this.f5896l);
                this.f5891g = mo21913b;
                this.f5892h = 0L;
                this.f5895k = 0L;
                this.f5894j = 0L;
                this.f5887c.m22169i();
            }
        }
    }
}
