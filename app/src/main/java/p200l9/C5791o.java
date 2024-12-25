package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p060da.C4413l;
import p304r9.C8013a;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/o.class
 */
/* renamed from: l9.o */
/* loaded from: combined.jar:classes2.jar:l9/o.class */
public class C5791o extends AbstractC10125a {
    public static final Parcelable.Creator<C5791o> CREATOR = new C5793o1();

    /* renamed from: d */
    public MediaInfo f32330d;

    /* renamed from: e */
    public int f32331e;

    /* renamed from: f */
    public boolean f32332f;

    /* renamed from: g */
    public double f32333g;

    /* renamed from: h */
    public double f32334h;

    /* renamed from: i */
    public double f32335i;

    /* renamed from: j */
    public long[] f32336j;

    /* renamed from: k */
    public String f32337k;

    /* renamed from: l */
    public JSONObject f32338l;

    /* renamed from: m */
    public final b f32339m;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/o$a.class
     */
    /* renamed from: l9.o$a */
    /* loaded from: combined.jar:classes2.jar:l9/o$a.class */
    public static class a {

        /* renamed from: a */
        public final C5791o f32340a;

        public a(MediaInfo mediaInfo) {
            this.f32340a = new C5791o(mediaInfo, (C5790n1) null);
        }

        public a(C5791o c5791o) {
            this.f32340a = new C5791o(c5791o, (C5790n1) null);
        }

        public a(JSONObject jSONObject) {
            this.f32340a = new C5791o(jSONObject);
        }

        /* renamed from: a */
        public C5791o m28291a() {
            this.f32340a.m28289a0();
            return this.f32340a;
        }

        /* renamed from: b */
        public a m28292b() {
            this.f32340a.m28287X().m28293a(0);
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/o$b.class
     */
    /* renamed from: l9.o$b */
    /* loaded from: combined.jar:classes2.jar:l9/o$b.class */
    public class b {

        /* renamed from: a */
        public final C5791o f32341a;

        public b(C5791o c5791o) {
            this.f32341a = c5791o;
        }

        /* renamed from: a */
        public void m28293a(int i10) {
            this.f32341a.f32331e = i10;
        }
    }

    public C5791o(MediaInfo mediaInfo, int i10, boolean z10, double d10, double d11, double d12, long[] jArr, String str) {
        this.f32333g = Double.NaN;
        this.f32339m = new b(this);
        this.f32330d = mediaInfo;
        this.f32331e = i10;
        this.f32332f = z10;
        this.f32333g = d10;
        this.f32334h = d11;
        this.f32335i = d12;
        this.f32336j = jArr;
        this.f32337k = str;
        if (str == null) {
            this.f32338l = null;
            return;
        }
        try {
            this.f32338l = new JSONObject(this.f32337k);
        } catch (JSONException e10) {
            this.f32338l = null;
            this.f32337k = null;
        }
    }

    public /* synthetic */ C5791o(MediaInfo mediaInfo, C5790n1 c5790n1) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    public /* synthetic */ C5791o(C5791o c5791o, C5790n1 c5790n1) {
        this(c5791o.m28283T(), c5791o.m28282S(), c5791o.m28280Q(), c5791o.m28286W(), c5791o.m28284U(), c5791o.m28285V(), c5791o.m28279P(), null);
        if (this.f32330d == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.f32338l = c5791o.m28281R();
    }

    public C5791o(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        m28290b(jSONObject);
    }

    /* renamed from: P */
    public long[] m28279P() {
        return this.f32336j;
    }

    /* renamed from: Q */
    public boolean m28280Q() {
        return this.f32332f;
    }

    /* renamed from: R */
    public JSONObject m28281R() {
        return this.f32338l;
    }

    /* renamed from: S */
    public int m28282S() {
        return this.f32331e;
    }

    /* renamed from: T */
    public MediaInfo m28283T() {
        return this.f32330d;
    }

    /* renamed from: U */
    public double m28284U() {
        return this.f32334h;
    }

    /* renamed from: V */
    public double m28285V() {
        return this.f32335i;
    }

    /* renamed from: W */
    public double m28286W() {
        return this.f32333g;
    }

    /* renamed from: X */
    public b m28287X() {
        return this.f32339m;
    }

    /* renamed from: Y */
    public JSONObject m28288Y() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f32330d;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.m13072f0());
            }
            int i10 = this.f32331e;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.f32332f);
            if (!Double.isNaN(this.f32333g)) {
                jSONObject.put("startTime", this.f32333g);
            }
            double d10 = this.f32334h;
            if (d10 != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d10);
            }
            jSONObject.put("preloadTime", this.f32335i);
            if (this.f32336j != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.f32336j) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f32338l;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException e10) {
        }
        return jSONObject;
    }

    /* renamed from: a0 */
    public final void m28289a0() {
        if (this.f32330d == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(this.f32333g) && this.f32333g < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(this.f32334h)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(this.f32335i) || this.f32335i < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if (java.lang.Math.abs(r0 - r6.f32333g) > 1.0E-7d) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m28290b(org.json.JSONObject r7) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200l9.C5791o.m28290b(org.json.JSONObject):boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5791o)) {
            return false;
        }
        C5791o c5791o = (C5791o) obj;
        JSONObject jSONObject = this.f32338l;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = c5791o.f32338l;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || C4413l.m22449a(jSONObject, jSONObject2)) && C8013a.m34870k(this.f32330d, c5791o.f32330d) && this.f32331e == c5791o.f32331e && this.f32332f == c5791o.f32332f) {
            return ((Double.isNaN(this.f32333g) && Double.isNaN(c5791o.f32333g)) || this.f32333g == c5791o.f32333g) && this.f32334h == c5791o.f32334h && this.f32335i == c5791o.f32335i && Arrays.equals(this.f32336j, c5791o.f32336j);
        }
        return false;
    }

    public int hashCode() {
        return C9932n.m41833c(this.f32330d, Integer.valueOf(this.f32331e), Boolean.valueOf(this.f32332f), Double.valueOf(this.f32333g), Double.valueOf(this.f32334h), Double.valueOf(this.f32335i), Integer.valueOf(Arrays.hashCode(this.f32336j)), String.valueOf(this.f32338l));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f32338l;
        this.f32337k = jSONObject == null ? null : jSONObject.toString();
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42535r(parcel, 2, m28283T(), i10, false);
        C10127c.m42529l(parcel, 3, m28282S());
        C10127c.m42520c(parcel, 4, m28280Q());
        C10127c.m42524g(parcel, 5, m28286W());
        C10127c.m42524g(parcel, 6, m28284U());
        C10127c.m42524g(parcel, 7, m28285V());
        C10127c.m42533p(parcel, 8, m28279P(), false);
        C10127c.m42536s(parcel, 9, this.f32337k, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
