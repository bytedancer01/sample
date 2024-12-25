package p304r9;

import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import org.achartengine.chart.TimeChart;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p200l9.C5750c;
import p200l9.C5773i;
import p200l9.C5779k;
import p200l9.C5791o;
import p200l9.C5797q;
import p323s9.C8550a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/s.class
 */
/* renamed from: r9.s */
/* loaded from: combined.jar:classes2.jar:r9/s.class */
public final class C8049s extends C8058z {

    /* renamed from: C */
    public static final String f38883C;

    /* renamed from: A */
    public final C8056x f38884A;

    /* renamed from: B */
    public final C8056x f38885B;

    /* renamed from: e */
    public long f38886e;

    /* renamed from: f */
    public C5797q f38887f;

    /* renamed from: g */
    public Long f38888g;

    /* renamed from: h */
    public InterfaceC8043p f38889h;

    /* renamed from: i */
    public int f38890i;

    /* renamed from: j */
    public final C8056x f38891j;

    /* renamed from: k */
    public final C8056x f38892k;

    /* renamed from: l */
    public final C8056x f38893l;

    /* renamed from: m */
    public final C8056x f38894m;

    /* renamed from: n */
    public final C8056x f38895n;

    /* renamed from: o */
    public final C8056x f38896o;

    /* renamed from: p */
    public final C8056x f38897p;

    /* renamed from: q */
    public final C8056x f38898q;

    /* renamed from: r */
    public final C8056x f38899r;

    /* renamed from: s */
    public final C8056x f38900s;

    /* renamed from: t */
    public final C8056x f38901t;

    /* renamed from: u */
    public final C8056x f38902u;

    /* renamed from: v */
    public final C8056x f38903v;

    /* renamed from: w */
    public final C8056x f38904w;

    /* renamed from: x */
    public final C8056x f38905x;

    /* renamed from: y */
    public final C8056x f38906y;

    /* renamed from: z */
    public final C8056x f38907z;

    static {
        Pattern pattern = C8013a.f38794a;
        f38883C = "urn:x-cast:com.google.cast.media";
    }

    public C8049s(String str) {
        super(f38883C, "MediaControlChannel", null);
        this.f38890i = -1;
        C8056x c8056x = new C8056x(TimeChart.DAY);
        this.f38891j = c8056x;
        C8056x c8056x2 = new C8056x(TimeChart.DAY);
        this.f38892k = c8056x2;
        C8056x c8056x3 = new C8056x(TimeChart.DAY);
        this.f38893l = c8056x3;
        C8056x c8056x4 = new C8056x(TimeChart.DAY);
        this.f38894m = c8056x4;
        C8056x c8056x5 = new C8056x(10000L);
        this.f38895n = c8056x5;
        C8056x c8056x6 = new C8056x(TimeChart.DAY);
        this.f38896o = c8056x6;
        C8056x c8056x7 = new C8056x(TimeChart.DAY);
        this.f38897p = c8056x7;
        C8056x c8056x8 = new C8056x(TimeChart.DAY);
        this.f38898q = c8056x8;
        C8056x c8056x9 = new C8056x(TimeChart.DAY);
        this.f38899r = c8056x9;
        C8056x c8056x10 = new C8056x(TimeChart.DAY);
        this.f38900s = c8056x10;
        C8056x c8056x11 = new C8056x(TimeChart.DAY);
        this.f38901t = c8056x11;
        C8056x c8056x12 = new C8056x(TimeChart.DAY);
        this.f38902u = c8056x12;
        C8056x c8056x13 = new C8056x(TimeChart.DAY);
        this.f38903v = c8056x13;
        C8056x c8056x14 = new C8056x(TimeChart.DAY);
        this.f38904w = c8056x14;
        C8056x c8056x15 = new C8056x(TimeChart.DAY);
        this.f38905x = c8056x15;
        C8056x c8056x16 = new C8056x(TimeChart.DAY);
        this.f38907z = c8056x16;
        this.f38906y = new C8056x(TimeChart.DAY);
        C8056x c8056x17 = new C8056x(TimeChart.DAY);
        this.f38884A = c8056x17;
        C8056x c8056x18 = new C8056x(TimeChart.DAY);
        this.f38885B = c8056x18;
        m34983h(c8056x);
        m34983h(c8056x2);
        m34983h(c8056x3);
        m34983h(c8056x4);
        m34983h(c8056x5);
        m34983h(c8056x6);
        m34983h(c8056x7);
        m34983h(c8056x8);
        m34983h(c8056x9);
        m34983h(c8056x10);
        m34983h(c8056x11);
        m34983h(c8056x12);
        m34983h(c8056x13);
        m34983h(c8056x14);
        m34983h(c8056x15);
        m34983h(c8056x16);
        m34983h(c8056x16);
        m34983h(c8056x17);
        m34983h(c8056x18);
        m34967w();
    }

    /* renamed from: D */
    public static int[] m34934D(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    /* renamed from: v */
    public static C8047r m34938v(JSONObject jSONObject) {
        MediaError m13050T = MediaError.m13050T(jSONObject);
        C8047r c8047r = new C8047r();
        Pattern pattern = C8013a.f38794a;
        c8047r.f38876a = jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null;
        c8047r.f38877b = m13050T;
        return c8047r;
    }

    /* renamed from: A */
    public final void m34939A() {
        InterfaceC8043p interfaceC8043p = this.f38889h;
        if (interfaceC8043p != null) {
            interfaceC8043p.mo31057h();
        }
    }

    /* renamed from: B */
    public final void m34940B() {
        InterfaceC8043p interfaceC8043p = this.f38889h;
        if (interfaceC8043p != null) {
            interfaceC8043p.mo31056g();
        }
    }

    /* renamed from: C */
    public final boolean m34941C() {
        return this.f38890i != -1;
    }

    /* renamed from: F */
    public final long m34942F() {
        C5797q c5797q;
        C5750c m28305Q;
        if (this.f38886e == 0 || (c5797q = this.f38887f) == null || (m28305Q = c5797q.m28305Q()) == null) {
            return 0L;
        }
        double m28316b0 = c5797q.m28316b0();
        double d10 = m28316b0;
        if (m28316b0 == 0.0d) {
            d10 = 1.0d;
        }
        if (c5797q.m28317c0() != 2) {
            d10 = 0.0d;
        }
        return m34966u(d10, m28305Q.m28167R(), 0L);
    }

    /* renamed from: G */
    public final long m34943G() {
        C5773i m28313Y;
        C5797q c5797q = this.f38887f;
        if (c5797q == null || (m28313Y = c5797q.m28313Y()) == null) {
            return 0L;
        }
        long m28208P = m28313Y.m28208P();
        return !m28313Y.m28210R() ? m34966u(1.0d, m28208P, -1L) : m28208P;
    }

    /* renamed from: H */
    public final long m34944H() {
        C5773i m28313Y;
        C5797q c5797q = this.f38887f;
        if (c5797q == null || (m28313Y = c5797q.m28313Y()) == null) {
            return 0L;
        }
        long m28209Q = m28313Y.m28209Q();
        long j10 = m28209Q;
        if (m28313Y.m28211S()) {
            j10 = m34966u(1.0d, m28209Q, -1L);
        }
        return m28313Y.m28210R() ? Math.min(j10, m28313Y.m28208P()) : j10;
    }

    /* renamed from: I */
    public final long m34945I() {
        C5797q c5797q;
        MediaInfo m34961n = m34961n();
        if (m34961n == null || (c5797q = this.f38887f) == null) {
            return 0L;
        }
        Long l10 = this.f38888g;
        if (l10 == null) {
            if (this.f38886e == 0) {
                return 0L;
            }
            double m28316b0 = c5797q.m28316b0();
            long m28325k0 = c5797q.m28325k0();
            return (m28316b0 == 0.0d || c5797q.m28317c0() != 2) ? m28325k0 : m34966u(m28316b0, m28325k0, m34961n.m13067a0());
        }
        if (l10.equals(4294967296000L)) {
            if (this.f38887f.m28313Y() != null) {
                return Math.min(l10.longValue(), m34943G());
            }
            if (m34947K() >= 0) {
                return Math.min(l10.longValue(), m34947K());
            }
        }
        return l10.longValue();
    }

    /* renamed from: J */
    public final long m34946J() {
        C5797q c5797q = this.f38887f;
        if (c5797q != null) {
            return c5797q.m28333s0();
        }
        throw new C8045q();
    }

    /* renamed from: K */
    public final long m34947K() {
        MediaInfo m34961n = m34961n();
        if (m34961n != null) {
            return m34961n.m13067a0();
        }
        return 0L;
    }

    /* renamed from: L */
    public final long m34948L(InterfaceC8054v interfaceC8054v, C5779k c5779k) {
        if (c5779k.m28227U() == null && c5779k.m28229W() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject m28231Y = c5779k.m28231Y();
        if (m28231Y == null) {
            throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
        }
        long m34903a = m34903a();
        try {
            m28231Y.put("requestId", m34903a);
            m28231Y.put("type", "LOAD");
        } catch (JSONException e10) {
        }
        m34906d(m28231Y.toString(), m34903a, null);
        this.f38891j.m34974b(m34903a, interfaceC8054v);
        return m34903a;
    }

    /* renamed from: M */
    public final long m34949M(InterfaceC8054v interfaceC8054v, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject2.put("requestId", m34903a);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", m34946J());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e10) {
        }
        m34906d(jSONObject2.toString(), m34903a, null);
        this.f38892k.m34974b(m34903a, interfaceC8054v);
        return m34903a;
    }

    /* renamed from: N */
    public final long m34950N(InterfaceC8054v interfaceC8054v, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject2.put("requestId", m34903a);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", m34946J());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e10) {
        }
        m34906d(jSONObject2.toString(), m34903a, null);
        this.f38893l.m34974b(m34903a, interfaceC8054v);
        return m34903a;
    }

    /* renamed from: O */
    public final long m34951O(InterfaceC8054v interfaceC8054v) {
        JSONObject jSONObject = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject.put("requestId", m34903a);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", m34946J());
        } catch (JSONException e10) {
        }
        m34906d(jSONObject.toString(), m34903a, null);
        this.f38905x.m34974b(m34903a, interfaceC8054v);
        return m34903a;
    }

    /* renamed from: P */
    public final long m34952P(InterfaceC8054v interfaceC8054v, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject.put("requestId", m34903a);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", m34946J());
            JSONArray jSONArray = new JSONArray();
            for (int i10 : iArr) {
                jSONArray.put(i10);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException e10) {
        }
        m34906d(jSONObject.toString(), m34903a, null);
        this.f38906y.m34974b(m34903a, interfaceC8054v);
        return m34903a;
    }

    /* renamed from: Q */
    public final long m34953Q(InterfaceC8054v interfaceC8054v, C5791o[] c5791oArr, int i10, int i11, long j10, JSONObject jSONObject) {
        int length;
        String m36776b;
        if (c5791oArr == null || (length = c5791oArr.length) == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        }
        if (i10 < 0 || i10 >= length) {
            throw new IllegalArgumentException("Invalid startIndex: " + i10);
        }
        if (j10 != -1 && j10 < 0) {
            throw new IllegalArgumentException("playPosition can not be negative: " + j10);
        }
        JSONObject jSONObject2 = new JSONObject();
        long m34903a = m34903a();
        this.f38891j.m34974b(m34903a, interfaceC8054v);
        try {
            jSONObject2.put("requestId", m34903a);
            jSONObject2.put("type", "QUEUE_LOAD");
            JSONArray jSONArray = new JSONArray();
            for (int i12 = 0; i12 < c5791oArr.length; i12++) {
                jSONArray.put(i12, c5791oArr[i12].m28288Y());
            }
            jSONObject2.put("items", jSONArray);
            m36776b = C8550a.m36776b(Integer.valueOf(i11));
        } catch (JSONException e10) {
        }
        if (m36776b == null) {
            throw new IllegalArgumentException("Invalid repeat mode: " + i11);
        }
        jSONObject2.put("repeatMode", m36776b);
        jSONObject2.put("startIndex", i10);
        if (j10 != -1) {
            jSONObject2.put("currentTime", C8013a.m34861b(j10));
        }
        if (jSONObject != null) {
            jSONObject2.put("customData", jSONObject);
        }
        if (m34941C()) {
            jSONObject2.put("sequenceNumber", this.f38890i);
        }
        m34906d(jSONObject2.toString(), m34903a, null);
        return m34903a;
    }

    /* renamed from: R */
    public final long m34954R(InterfaceC8054v interfaceC8054v, int[] iArr, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject2.put("requestId", m34903a);
            jSONObject2.put("type", "QUEUE_REMOVE");
            jSONObject2.put("mediaSessionId", m34946J());
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jSONArray.put(i10, iArr[i10]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (m34941C()) {
                jSONObject2.put("sequenceNumber", this.f38890i);
            }
        } catch (JSONException e10) {
        }
        m34906d(jSONObject2.toString(), m34903a, null);
        this.f38903v.m34974b(m34903a, new C8041o(this, interfaceC8054v));
        return m34903a;
    }

    /* renamed from: S */
    public final long m34955S(InterfaceC8054v interfaceC8054v, int[] iArr, int i10, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject2.put("requestId", m34903a);
            jSONObject2.put("type", "QUEUE_REORDER");
            jSONObject2.put("mediaSessionId", m34946J());
            JSONArray jSONArray = new JSONArray();
            for (int i11 = 0; i11 < iArr.length; i11++) {
                jSONArray.put(i11, iArr[i11]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (i10 != 0) {
                jSONObject2.put("insertBefore", i10);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (m34941C()) {
                jSONObject2.put("sequenceNumber", this.f38890i);
            }
        } catch (JSONException e10) {
        }
        m34906d(jSONObject2.toString(), m34903a, null);
        this.f38904w.m34974b(m34903a, new C8041o(this, interfaceC8054v));
        return m34903a;
    }

    @Override // p304r9.C8032j0
    /* renamed from: c */
    public final void mo34905c() {
        m34982g();
        m34967w();
    }

    /* renamed from: i */
    public final long m34956i(InterfaceC8054v interfaceC8054v, int i10, long j10, C5791o[] c5791oArr, int i11, Boolean bool, Integer num, JSONObject jSONObject) {
        if (j10 != -1 && j10 < 0) {
            throw new IllegalArgumentException("playPosition cannot be negative: " + j10);
        }
        JSONObject jSONObject2 = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject2.put("requestId", m34903a);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", m34946J());
            if (i10 != 0) {
                jSONObject2.put("currentItemId", i10);
            }
            if (i11 != 0) {
                jSONObject2.put("jump", i11);
            }
            if (c5791oArr != null && c5791oArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i12 = 0; i12 < c5791oArr.length; i12++) {
                    jSONArray.put(i12, c5791oArr[i12].m28288Y());
                }
                jSONObject2.put("items", jSONArray);
            }
            if (bool != null) {
                jSONObject2.put("shuffle", bool);
            }
            String m36776b = C8550a.m36776b(num);
            if (m36776b != null) {
                jSONObject2.put("repeatMode", m36776b);
            }
            if (j10 != -1) {
                jSONObject2.put("currentTime", C8013a.m34861b(j10));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (m34941C()) {
                jSONObject2.put("sequenceNumber", this.f38890i);
            }
        } catch (JSONException e10) {
        }
        m34906d(jSONObject2.toString(), m34903a, null);
        this.f38902u.m34974b(m34903a, new C8041o(this, interfaceC8054v));
        return m34903a;
    }

    /* renamed from: j */
    public final long m34957j(InterfaceC8054v interfaceC8054v) {
        JSONObject jSONObject = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject.put("requestId", m34903a);
            jSONObject.put("type", "GET_STATUS");
            C5797q c5797q = this.f38887f;
            if (c5797q != null) {
                jSONObject.put("mediaSessionId", c5797q.m28333s0());
            }
        } catch (JSONException e10) {
        }
        m34906d(jSONObject.toString(), m34903a, null);
        this.f38898q.m34974b(m34903a, interfaceC8054v);
        return m34903a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[Catch: JSONException -> 0x00c0, TryCatch #0 {JSONException -> 0x00c0, blocks: (B:5:0x0024, B:9:0x0065, B:10:0x0083, B:12:0x008a, B:18:0x0073), top: B:4:0x0024 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m34958k(p304r9.InterfaceC8054v r9, p200l9.C5794p r10) {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r8
            long r0 = r0.m34903a()
            r14 = r0
            r0 = r10
            boolean r0 = r0.m28297d()
            if (r0 == 0) goto L1e
            r0 = 4294967296000(0x3e800000000, double:2.1219957909653E-311)
            r12 = r0
            goto L24
        L1e:
            r0 = r10
            long r0 = r0.m28295b()
            r12 = r0
        L24:
            r0 = r17
            java.lang.String r1 = "requestId"
            r2 = r14
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
            r0 = r17
            java.lang.String r1 = "type"
            java.lang.String r2 = "SEEK"
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
            r0 = r17
            java.lang.String r1 = "mediaSessionId"
            r2 = r8
            long r2 = r2.m34946J()     // Catch: org.json.JSONException -> Lc0
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
            r0 = r17
            java.lang.String r1 = "currentTime"
            r2 = r12
            double r2 = p304r9.C8013a.m34861b(r2)     // Catch: org.json.JSONException -> Lc0
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
            r0 = r10
            int r0 = r0.m28296c()     // Catch: org.json.JSONException -> Lc0
            r11 = r0
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L73
            java.lang.String r0 = "PLAYBACK_START"
            r16 = r0
        L65:
            r0 = r17
            java.lang.String r1 = "resumeState"
            r2 = r16
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
            goto L83
        L73:
            r0 = r10
            int r0 = r0.m28296c()     // Catch: org.json.JSONException -> Lc0
            r1 = 2
            if (r0 != r1) goto L83
            java.lang.String r0 = "PLAYBACK_PAUSE"
            r16 = r0
            goto L65
        L83:
            r0 = r10
            org.json.JSONObject r0 = r0.m28294a()     // Catch: org.json.JSONException -> Lc0
            if (r0 == 0) goto L96
            r0 = r17
            java.lang.String r1 = "customData"
            r2 = r10
            org.json.JSONObject r2 = r2.m28294a()     // Catch: org.json.JSONException -> Lc0
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
        L96:
            r0 = r8
            r1 = r17
            java.lang.String r1 = r1.toString()
            r2 = r14
            r3 = 0
            r0.m34906d(r1, r2, r3)
            r0 = r8
            r1 = r12
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f38888g = r1
            r0 = r8
            r9.x r0 = r0.f38895n
            r1 = r14
            r9.n r2 = new r9.n
            r3 = r2
            r4 = r8
            r5 = r9
            r3.<init>(r4, r5)
            r0.m34974b(r1, r2)
            r0 = r14
            return r0
        Lc0:
            r10 = move-exception
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: p304r9.C8049s.m34958k(r9.v, l9.p):long");
    }

    /* renamed from: l */
    public final long m34959l(InterfaceC8054v interfaceC8054v, long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException("trackIds cannot be null");
        }
        JSONObject jSONObject = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject.put("requestId", m34903a);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", m34946J());
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < jArr.length; i10++) {
                jSONArray.put(i10, jArr[i10]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException e10) {
        }
        m34906d(jSONObject.toString(), m34903a, null);
        this.f38899r.m34974b(m34903a, interfaceC8054v);
        return m34903a;
    }

    /* renamed from: m */
    public final long m34960m(InterfaceC8054v interfaceC8054v) {
        JSONObject jSONObject = new JSONObject();
        long m34903a = m34903a();
        try {
            jSONObject.put("requestId", m34903a);
            jSONObject.put("type", "SKIP_AD");
            jSONObject.put("mediaSessionId", m34946J());
        } catch (JSONException e10) {
            this.f38820a.m34878f(String.format(Locale.ROOT, "Error creating SkipAd message: %s", e10.getMessage()), new Object[0]);
        }
        m34906d(jSONObject.toString(), m34903a, null);
        this.f38885B.m34974b(m34903a, interfaceC8054v);
        return m34903a;
    }

    /* renamed from: n */
    public final MediaInfo m34961n() {
        C5797q c5797q = this.f38887f;
        if (c5797q == null) {
            return null;
        }
        return c5797q.m28315a0();
    }

    /* renamed from: o */
    public final C5797q m34962o() {
        return this.f38887f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04a1 A[Catch: JSONException -> 0x05a2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x05a2, blocks: (B:3:0x0012, B:10:0x015b, B:12:0x0177, B:14:0x018d, B:16:0x0196, B:18:0x01b5, B:22:0x01c1, B:24:0x01dd, B:26:0x0203, B:39:0x028f, B:41:0x02b4, B:43:0x02e4, B:46:0x02f0, B:48:0x02fc, B:50:0x0308, B:64:0x0315, B:66:0x0331, B:68:0x0343, B:72:0x034f, B:74:0x035c, B:76:0x0364, B:78:0x037f, B:82:0x0389, B:84:0x039c, B:86:0x03b7, B:88:0x03bf, B:91:0x03da, B:93:0x03ed, B:95:0x0400, B:97:0x041b, B:99:0x0423, B:102:0x043e, B:104:0x0450, B:106:0x046d, B:112:0x04a1, B:114:0x04af, B:117:0x04dd, B:121:0x04f3, B:125:0x0506, B:129:0x0513, B:133:0x051e, B:137:0x0529, B:141:0x0534, B:143:0x0546, B:147:0x0554, B:149:0x0578, B:151:0x0584, B:153:0x058c, B:156:0x04bb, B:158:0x0481, B:160:0x048b, B:164:0x0562), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04dd A[Catch: JSONException -> 0x05a2, TRY_ENTER, TryCatch #0 {JSONException -> 0x05a2, blocks: (B:3:0x0012, B:10:0x015b, B:12:0x0177, B:14:0x018d, B:16:0x0196, B:18:0x01b5, B:22:0x01c1, B:24:0x01dd, B:26:0x0203, B:39:0x028f, B:41:0x02b4, B:43:0x02e4, B:46:0x02f0, B:48:0x02fc, B:50:0x0308, B:64:0x0315, B:66:0x0331, B:68:0x0343, B:72:0x034f, B:74:0x035c, B:76:0x0364, B:78:0x037f, B:82:0x0389, B:84:0x039c, B:86:0x03b7, B:88:0x03bf, B:91:0x03da, B:93:0x03ed, B:95:0x0400, B:97:0x041b, B:99:0x0423, B:102:0x043e, B:104:0x0450, B:106:0x046d, B:112:0x04a1, B:114:0x04af, B:117:0x04dd, B:121:0x04f3, B:125:0x0506, B:129:0x0513, B:133:0x051e, B:137:0x0529, B:141:0x0534, B:143:0x0546, B:147:0x0554, B:149:0x0578, B:151:0x0584, B:153:0x058c, B:156:0x04bb, B:158:0x0481, B:160:0x048b, B:164:0x0562), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04f3 A[Catch: JSONException -> 0x05a2, TRY_ENTER, TryCatch #0 {JSONException -> 0x05a2, blocks: (B:3:0x0012, B:10:0x015b, B:12:0x0177, B:14:0x018d, B:16:0x0196, B:18:0x01b5, B:22:0x01c1, B:24:0x01dd, B:26:0x0203, B:39:0x028f, B:41:0x02b4, B:43:0x02e4, B:46:0x02f0, B:48:0x02fc, B:50:0x0308, B:64:0x0315, B:66:0x0331, B:68:0x0343, B:72:0x034f, B:74:0x035c, B:76:0x0364, B:78:0x037f, B:82:0x0389, B:84:0x039c, B:86:0x03b7, B:88:0x03bf, B:91:0x03da, B:93:0x03ed, B:95:0x0400, B:97:0x041b, B:99:0x0423, B:102:0x043e, B:104:0x0450, B:106:0x046d, B:112:0x04a1, B:114:0x04af, B:117:0x04dd, B:121:0x04f3, B:125:0x0506, B:129:0x0513, B:133:0x051e, B:137:0x0529, B:141:0x0534, B:143:0x0546, B:147:0x0554, B:149:0x0578, B:151:0x0584, B:153:0x058c, B:156:0x04bb, B:158:0x0481, B:160:0x048b, B:164:0x0562), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0506 A[Catch: JSONException -> 0x05a2, TRY_ENTER, TryCatch #0 {JSONException -> 0x05a2, blocks: (B:3:0x0012, B:10:0x015b, B:12:0x0177, B:14:0x018d, B:16:0x0196, B:18:0x01b5, B:22:0x01c1, B:24:0x01dd, B:26:0x0203, B:39:0x028f, B:41:0x02b4, B:43:0x02e4, B:46:0x02f0, B:48:0x02fc, B:50:0x0308, B:64:0x0315, B:66:0x0331, B:68:0x0343, B:72:0x034f, B:74:0x035c, B:76:0x0364, B:78:0x037f, B:82:0x0389, B:84:0x039c, B:86:0x03b7, B:88:0x03bf, B:91:0x03da, B:93:0x03ed, B:95:0x0400, B:97:0x041b, B:99:0x0423, B:102:0x043e, B:104:0x0450, B:106:0x046d, B:112:0x04a1, B:114:0x04af, B:117:0x04dd, B:121:0x04f3, B:125:0x0506, B:129:0x0513, B:133:0x051e, B:137:0x0529, B:141:0x0534, B:143:0x0546, B:147:0x0554, B:149:0x0578, B:151:0x0584, B:153:0x058c, B:156:0x04bb, B:158:0x0481, B:160:0x048b, B:164:0x0562), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0513 A[Catch: JSONException -> 0x05a2, TRY_ENTER, TryCatch #0 {JSONException -> 0x05a2, blocks: (B:3:0x0012, B:10:0x015b, B:12:0x0177, B:14:0x018d, B:16:0x0196, B:18:0x01b5, B:22:0x01c1, B:24:0x01dd, B:26:0x0203, B:39:0x028f, B:41:0x02b4, B:43:0x02e4, B:46:0x02f0, B:48:0x02fc, B:50:0x0308, B:64:0x0315, B:66:0x0331, B:68:0x0343, B:72:0x034f, B:74:0x035c, B:76:0x0364, B:78:0x037f, B:82:0x0389, B:84:0x039c, B:86:0x03b7, B:88:0x03bf, B:91:0x03da, B:93:0x03ed, B:95:0x0400, B:97:0x041b, B:99:0x0423, B:102:0x043e, B:104:0x0450, B:106:0x046d, B:112:0x04a1, B:114:0x04af, B:117:0x04dd, B:121:0x04f3, B:125:0x0506, B:129:0x0513, B:133:0x051e, B:137:0x0529, B:141:0x0534, B:143:0x0546, B:147:0x0554, B:149:0x0578, B:151:0x0584, B:153:0x058c, B:156:0x04bb, B:158:0x0481, B:160:0x048b, B:164:0x0562), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x051e A[Catch: JSONException -> 0x05a2, TRY_ENTER, TryCatch #0 {JSONException -> 0x05a2, blocks: (B:3:0x0012, B:10:0x015b, B:12:0x0177, B:14:0x018d, B:16:0x0196, B:18:0x01b5, B:22:0x01c1, B:24:0x01dd, B:26:0x0203, B:39:0x028f, B:41:0x02b4, B:43:0x02e4, B:46:0x02f0, B:48:0x02fc, B:50:0x0308, B:64:0x0315, B:66:0x0331, B:68:0x0343, B:72:0x034f, B:74:0x035c, B:76:0x0364, B:78:0x037f, B:82:0x0389, B:84:0x039c, B:86:0x03b7, B:88:0x03bf, B:91:0x03da, B:93:0x03ed, B:95:0x0400, B:97:0x041b, B:99:0x0423, B:102:0x043e, B:104:0x0450, B:106:0x046d, B:112:0x04a1, B:114:0x04af, B:117:0x04dd, B:121:0x04f3, B:125:0x0506, B:129:0x0513, B:133:0x051e, B:137:0x0529, B:141:0x0534, B:143:0x0546, B:147:0x0554, B:149:0x0578, B:151:0x0584, B:153:0x058c, B:156:0x04bb, B:158:0x0481, B:160:0x048b, B:164:0x0562), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0529 A[Catch: JSONException -> 0x05a2, TRY_ENTER, TryCatch #0 {JSONException -> 0x05a2, blocks: (B:3:0x0012, B:10:0x015b, B:12:0x0177, B:14:0x018d, B:16:0x0196, B:18:0x01b5, B:22:0x01c1, B:24:0x01dd, B:26:0x0203, B:39:0x028f, B:41:0x02b4, B:43:0x02e4, B:46:0x02f0, B:48:0x02fc, B:50:0x0308, B:64:0x0315, B:66:0x0331, B:68:0x0343, B:72:0x034f, B:74:0x035c, B:76:0x0364, B:78:0x037f, B:82:0x0389, B:84:0x039c, B:86:0x03b7, B:88:0x03bf, B:91:0x03da, B:93:0x03ed, B:95:0x0400, B:97:0x041b, B:99:0x0423, B:102:0x043e, B:104:0x0450, B:106:0x046d, B:112:0x04a1, B:114:0x04af, B:117:0x04dd, B:121:0x04f3, B:125:0x0506, B:129:0x0513, B:133:0x051e, B:137:0x0529, B:141:0x0534, B:143:0x0546, B:147:0x0554, B:149:0x0578, B:151:0x0584, B:153:0x058c, B:156:0x04bb, B:158:0x0481, B:160:0x048b, B:164:0x0562), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0534 A[Catch: JSONException -> 0x05a2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x05a2, blocks: (B:3:0x0012, B:10:0x015b, B:12:0x0177, B:14:0x018d, B:16:0x0196, B:18:0x01b5, B:22:0x01c1, B:24:0x01dd, B:26:0x0203, B:39:0x028f, B:41:0x02b4, B:43:0x02e4, B:46:0x02f0, B:48:0x02fc, B:50:0x0308, B:64:0x0315, B:66:0x0331, B:68:0x0343, B:72:0x034f, B:74:0x035c, B:76:0x0364, B:78:0x037f, B:82:0x0389, B:84:0x039c, B:86:0x03b7, B:88:0x03bf, B:91:0x03da, B:93:0x03ed, B:95:0x0400, B:97:0x041b, B:99:0x0423, B:102:0x043e, B:104:0x0450, B:106:0x046d, B:112:0x04a1, B:114:0x04af, B:117:0x04dd, B:121:0x04f3, B:125:0x0506, B:129:0x0513, B:133:0x051e, B:137:0x0529, B:141:0x0534, B:143:0x0546, B:147:0x0554, B:149:0x0578, B:151:0x0584, B:153:0x058c, B:156:0x04bb, B:158:0x0481, B:160:0x048b, B:164:0x0562), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0554 A[Catch: JSONException -> 0x05a2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x05a2, blocks: (B:3:0x0012, B:10:0x015b, B:12:0x0177, B:14:0x018d, B:16:0x0196, B:18:0x01b5, B:22:0x01c1, B:24:0x01dd, B:26:0x0203, B:39:0x028f, B:41:0x02b4, B:43:0x02e4, B:46:0x02f0, B:48:0x02fc, B:50:0x0308, B:64:0x0315, B:66:0x0331, B:68:0x0343, B:72:0x034f, B:74:0x035c, B:76:0x0364, B:78:0x037f, B:82:0x0389, B:84:0x039c, B:86:0x03b7, B:88:0x03bf, B:91:0x03da, B:93:0x03ed, B:95:0x0400, B:97:0x041b, B:99:0x0423, B:102:0x043e, B:104:0x0450, B:106:0x046d, B:112:0x04a1, B:114:0x04af, B:117:0x04dd, B:121:0x04f3, B:125:0x0506, B:129:0x0513, B:133:0x051e, B:137:0x0529, B:141:0x0534, B:143:0x0546, B:147:0x0554, B:149:0x0578, B:151:0x0584, B:153:0x058c, B:156:0x04bb, B:158:0x0481, B:160:0x048b, B:164:0x0562), top: B:2:0x0012 }] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m34963r(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 1471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p304r9.C8049s.m34963r(java.lang.String):void");
    }

    /* renamed from: s */
    public final void m34964s(long j10, int i10) {
        Iterator it = m34981f().iterator();
        while (it.hasNext()) {
            ((C8056x) it.next()).m34976d(j10, i10, null);
        }
    }

    /* renamed from: t */
    public final void m34965t(InterfaceC8043p interfaceC8043p) {
        this.f38889h = interfaceC8043p;
    }

    /* renamed from: u */
    public final long m34966u(double d10, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f38886e;
        long j12 = elapsedRealtime;
        if (elapsedRealtime < 0) {
            j12 = 0;
        }
        if (j12 == 0) {
            return j10;
        }
        long j13 = j10 + ((long) (j12 * d10));
        if (j11 > 0 && j13 > j11) {
            j13 = j11;
        } else if (j13 < 0) {
            return 0L;
        }
        return j13;
    }

    /* renamed from: w */
    public final void m34967w() {
        this.f38886e = 0L;
        this.f38887f = null;
        Iterator it = m34981f().iterator();
        while (it.hasNext()) {
            ((C8056x) it.next()).m34975c(AdError.CACHE_ERROR_CODE);
        }
    }

    /* renamed from: x */
    public final void m34968x(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.f38890i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.f38820a.m34878f(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    /* renamed from: y */
    public final void m34969y() {
        InterfaceC8043p interfaceC8043p = this.f38889h;
        if (interfaceC8043p != null) {
            interfaceC8043p.mo31061l();
        }
    }

    /* renamed from: z */
    public final void m34970z() {
        InterfaceC8043p interfaceC8043p = this.f38889h;
        if (interfaceC8043p != null) {
            interfaceC8043p.mo31062o();
        }
    }
}
