package p200l9;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p060da.C4413l;
import p304r9.C8013a;
import p304r9.C8015b;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/q.class
 */
/* renamed from: l9.q */
/* loaded from: combined.jar:classes2.jar:l9/q.class */
public class C5797q extends AbstractC10125a {

    /* renamed from: C */
    public static final C8015b f32354C = new C8015b("MediaStatus");
    public static final Parcelable.Creator<C5797q> CREATOR = new C5799q1();

    /* renamed from: A */
    public final SparseArray f32355A;

    /* renamed from: B */
    public final a f32356B;

    /* renamed from: d */
    public MediaInfo f32357d;

    /* renamed from: e */
    public long f32358e;

    /* renamed from: f */
    public int f32359f;

    /* renamed from: g */
    public double f32360g;

    /* renamed from: h */
    public int f32361h;

    /* renamed from: i */
    public int f32362i;

    /* renamed from: j */
    public long f32363j;

    /* renamed from: k */
    public long f32364k;

    /* renamed from: l */
    public double f32365l;

    /* renamed from: m */
    public boolean f32366m;

    /* renamed from: n */
    public long[] f32367n;

    /* renamed from: o */
    public int f32368o;

    /* renamed from: p */
    public int f32369p;

    /* renamed from: q */
    public String f32370q;

    /* renamed from: r */
    public JSONObject f32371r;

    /* renamed from: s */
    public int f32372s;

    /* renamed from: t */
    public final List f32373t;

    /* renamed from: u */
    public boolean f32374u;

    /* renamed from: v */
    public C5750c f32375v;

    /* renamed from: w */
    public C5809u f32376w;

    /* renamed from: x */
    public C5773i f32377x;

    /* renamed from: y */
    public C5788n f32378y;

    /* renamed from: z */
    public boolean f32379z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/q$a.class
     */
    /* renamed from: l9.q$a */
    /* loaded from: combined.jar:classes2.jar:l9/q$a.class */
    public class a {

        /* renamed from: a */
        public final C5797q f32380a;

        public a(C5797q c5797q) {
            this.f32380a = c5797q;
        }

        /* renamed from: a */
        public void m28336a(boolean z10) {
            this.f32380a.f32374u = z10;
        }
    }

    @SuppressLint({"NonSdkVisibleApi"})
    public C5797q(MediaInfo mediaInfo, long j10, int i10, double d10, int i11, int i12, long j11, long j12, double d11, boolean z10, long[] jArr, int i13, int i14, String str, int i15, List list, boolean z11, C5750c c5750c, C5809u c5809u, C5773i c5773i, C5788n c5788n) {
        this.f32373t = new ArrayList();
        this.f32355A = new SparseArray();
        this.f32356B = new a(this);
        this.f32357d = mediaInfo;
        this.f32358e = j10;
        this.f32359f = i10;
        this.f32360g = d10;
        this.f32361h = i11;
        this.f32362i = i12;
        this.f32363j = j11;
        this.f32364k = j12;
        this.f32365l = d11;
        this.f32366m = z10;
        this.f32367n = jArr;
        this.f32368o = i13;
        this.f32369p = i14;
        this.f32370q = str;
        if (str != null) {
            try {
                this.f32371r = new JSONObject(this.f32370q);
            } catch (JSONException e10) {
                this.f32371r = null;
                this.f32370q = null;
            }
        } else {
            this.f32371r = null;
        }
        this.f32372s = i15;
        if (list != null && !list.isEmpty()) {
            m28335u0(list);
        }
        this.f32374u = z11;
        this.f32375v = c5750c;
        this.f32376w = c5809u;
        this.f32377x = c5773i;
        this.f32378y = c5788n;
        boolean z12 = false;
        if (c5788n != null) {
            z12 = false;
            if (c5788n.m28274Z()) {
                z12 = true;
            }
        }
        this.f32379z = z12;
    }

    public C5797q(JSONObject jSONObject) {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        m28332r0(jSONObject, 0);
    }

    /* renamed from: v0 */
    public static final boolean m28303v0(int i10, int i11, int i12, int i13) {
        if (i10 != 1) {
            return false;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                return i13 != 2;
            }
            if (i11 != 3) {
                return true;
            }
        }
        return i12 == 0;
    }

    /* renamed from: P */
    public long[] m28304P() {
        return this.f32367n;
    }

    /* renamed from: Q */
    public C5750c m28305Q() {
        return this.f32375v;
    }

    /* renamed from: R */
    public C5742a m28306R() {
        MediaInfo mediaInfo;
        List<C5742a> m13056P;
        C5750c c5750c = this.f32375v;
        if (c5750c == null) {
            return null;
        }
        String m28165P = c5750c.m28165P();
        if (TextUtils.isEmpty(m28165P) || (mediaInfo = this.f32357d) == null || (m13056P = mediaInfo.m13056P()) == null || m13056P.isEmpty()) {
            return null;
        }
        for (C5742a c5742a : m13056P) {
            if (m28165P.equals(c5742a.m28137U())) {
                return c5742a;
            }
        }
        return null;
    }

    /* renamed from: S */
    public int m28307S() {
        return this.f32359f;
    }

    /* renamed from: T */
    public JSONObject m28308T() {
        return this.f32371r;
    }

    /* renamed from: U */
    public int m28309U() {
        return this.f32362i;
    }

    /* renamed from: V */
    public Integer m28310V(int i10) {
        return (Integer) this.f32355A.get(i10);
    }

    /* renamed from: W */
    public C5791o m28311W(int i10) {
        Integer num = (Integer) this.f32355A.get(i10);
        if (num == null) {
            return null;
        }
        return (C5791o) this.f32373t.get(num.intValue());
    }

    /* renamed from: X */
    public C5791o m28312X(int i10) {
        if (i10 < 0 || i10 >= this.f32373t.size()) {
            return null;
        }
        return (C5791o) this.f32373t.get(i10);
    }

    /* renamed from: Y */
    public C5773i m28313Y() {
        return this.f32377x;
    }

    /* renamed from: Z */
    public int m28314Z() {
        return this.f32368o;
    }

    /* renamed from: a0 */
    public MediaInfo m28315a0() {
        return this.f32357d;
    }

    /* renamed from: b0 */
    public double m28316b0() {
        return this.f32360g;
    }

    /* renamed from: c0 */
    public int m28317c0() {
        return this.f32361h;
    }

    /* renamed from: d0 */
    public int m28318d0() {
        return this.f32369p;
    }

    /* renamed from: e0 */
    public C5788n m28319e0() {
        return this.f32378y;
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5797q)) {
            return false;
        }
        C5797q c5797q = (C5797q) obj;
        if ((this.f32371r == null) != (c5797q.f32371r == null) || this.f32358e != c5797q.f32358e || this.f32359f != c5797q.f32359f || this.f32360g != c5797q.f32360g || this.f32361h != c5797q.f32361h || this.f32362i != c5797q.f32362i || this.f32363j != c5797q.f32363j || this.f32365l != c5797q.f32365l || this.f32366m != c5797q.f32366m || this.f32368o != c5797q.f32368o || this.f32369p != c5797q.f32369p || this.f32372s != c5797q.f32372s || !Arrays.equals(this.f32367n, c5797q.f32367n) || !C8013a.m34870k(Long.valueOf(this.f32364k), Long.valueOf(c5797q.f32364k)) || !C8013a.m34870k(this.f32373t, c5797q.f32373t) || !C8013a.m34870k(this.f32357d, c5797q.f32357d)) {
            return false;
        }
        JSONObject jSONObject2 = this.f32371r;
        return (jSONObject2 == null || (jSONObject = c5797q.f32371r) == null || C4413l.m22449a(jSONObject2, jSONObject)) && this.f32374u == c5797q.m28331q0() && C8013a.m34870k(this.f32375v, c5797q.f32375v) && C8013a.m34870k(this.f32376w, c5797q.f32376w) && C8013a.m34870k(this.f32377x, c5797q.f32377x) && C9932n.m41832b(this.f32378y, c5797q.f32378y) && this.f32379z == c5797q.f32379z;
    }

    /* renamed from: f0 */
    public C5791o m28320f0(int i10) {
        return m28312X(i10);
    }

    /* renamed from: g0 */
    public C5791o m28321g0(int i10) {
        return m28311W(i10);
    }

    /* renamed from: h0 */
    public int m28322h0() {
        return this.f32373t.size();
    }

    public int hashCode() {
        return C9932n.m41833c(this.f32357d, Long.valueOf(this.f32358e), Integer.valueOf(this.f32359f), Double.valueOf(this.f32360g), Integer.valueOf(this.f32361h), Integer.valueOf(this.f32362i), Long.valueOf(this.f32363j), Long.valueOf(this.f32364k), Double.valueOf(this.f32365l), Boolean.valueOf(this.f32366m), Integer.valueOf(Arrays.hashCode(this.f32367n)), Integer.valueOf(this.f32368o), Integer.valueOf(this.f32369p), String.valueOf(this.f32371r), Integer.valueOf(this.f32372s), this.f32373t, Boolean.valueOf(this.f32374u), this.f32375v, this.f32376w, this.f32377x, this.f32378y);
    }

    /* renamed from: i0 */
    public List<C5791o> m28323i0() {
        return this.f32373t;
    }

    /* renamed from: j0 */
    public int m28324j0() {
        return this.f32372s;
    }

    /* renamed from: k0 */
    public long m28325k0() {
        return this.f32363j;
    }

    /* renamed from: l0 */
    public double m28326l0() {
        return this.f32365l;
    }

    /* renamed from: m0 */
    public C5809u m28327m0() {
        return this.f32376w;
    }

    /* renamed from: n0 */
    public a m28328n0() {
        return this.f32356B;
    }

    /* renamed from: o0 */
    public boolean m28329o0(long j10) {
        return (j10 & this.f32364k) != 0;
    }

    /* renamed from: p0 */
    public boolean m28330p0() {
        return this.f32366m;
    }

    /* renamed from: q0 */
    public boolean m28331q0() {
        return this.f32374u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x05ae, code lost:
    
        if (r11 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0635, code lost:
    
        if (r0.m28165P() != null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0678, code lost:
    
        if (r0.equals(r0) == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0618, code lost:
    
        if (r0.equals(r0) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0329, code lost:
    
        if (r0 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0391, code lost:
    
        if (r0.equals(r0) == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x066f  */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m28332r0(org.json.JSONObject r6, int r7) {
        /*
            Method dump skipped, instructions count: 1847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200l9.C5797q.m28332r0(org.json.JSONObject, int):int");
    }

    /* renamed from: s0 */
    public final long m28333s0() {
        return this.f32358e;
    }

    /* renamed from: t0 */
    public final boolean m28334t0() {
        MediaInfo mediaInfo = this.f32357d;
        return m28303v0(this.f32361h, this.f32362i, this.f32368o, mediaInfo == null ? -1 : mediaInfo.m13068b0());
    }

    /* renamed from: u0 */
    public final void m28335u0(List list) {
        this.f32373t.clear();
        this.f32355A.clear();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                C5791o c5791o = (C5791o) list.get(i10);
                this.f32373t.add(c5791o);
                this.f32355A.put(c5791o.m28282S(), Integer.valueOf(i10));
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f32371r;
        this.f32370q = jSONObject == null ? null : jSONObject.toString();
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42535r(parcel, 2, m28315a0(), i10, false);
        C10127c.m42532o(parcel, 3, this.f32358e);
        C10127c.m42529l(parcel, 4, m28307S());
        C10127c.m42524g(parcel, 5, m28316b0());
        C10127c.m42529l(parcel, 6, m28317c0());
        C10127c.m42529l(parcel, 7, m28309U());
        C10127c.m42532o(parcel, 8, m28325k0());
        C10127c.m42532o(parcel, 9, this.f32364k);
        C10127c.m42524g(parcel, 10, m28326l0());
        C10127c.m42520c(parcel, 11, m28330p0());
        C10127c.m42533p(parcel, 12, m28304P(), false);
        C10127c.m42529l(parcel, 13, m28314Z());
        C10127c.m42529l(parcel, 14, m28318d0());
        C10127c.m42536s(parcel, 15, this.f32370q, false);
        C10127c.m42529l(parcel, 16, this.f32372s);
        C10127c.m42540w(parcel, 17, this.f32373t, false);
        C10127c.m42520c(parcel, 18, m28331q0());
        C10127c.m42535r(parcel, 19, m28305Q(), i10, false);
        C10127c.m42535r(parcel, 20, m28327m0(), i10, false);
        C10127c.m42535r(parcel, 21, m28313Y(), i10, false);
        C10127c.m42535r(parcel, 22, m28319e0(), i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
