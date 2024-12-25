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
import p304r9.C8015b;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/k.class
 */
/* renamed from: l9.k */
/* loaded from: combined.jar:classes2.jar:l9/k.class */
public class C5779k extends AbstractC10125a {

    /* renamed from: d */
    public final MediaInfo f32272d;

    /* renamed from: e */
    public final C5788n f32273e;

    /* renamed from: f */
    public final Boolean f32274f;

    /* renamed from: g */
    public final long f32275g;

    /* renamed from: h */
    public final double f32276h;

    /* renamed from: i */
    public final long[] f32277i;

    /* renamed from: j */
    public String f32278j;

    /* renamed from: k */
    public final JSONObject f32279k;

    /* renamed from: l */
    public final String f32280l;

    /* renamed from: m */
    public final String f32281m;

    /* renamed from: n */
    public final String f32282n;

    /* renamed from: o */
    public final String f32283o;

    /* renamed from: p */
    public long f32284p;

    /* renamed from: q */
    public static final C8015b f32271q = new C8015b("MediaLoadRequestData");
    public static final Parcelable.Creator<C5779k> CREATOR = new C5768g1();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/k$a.class
     */
    /* renamed from: l9.k$a */
    /* loaded from: combined.jar:classes2.jar:l9/k$a.class */
    public static class a {

        /* renamed from: a */
        public MediaInfo f32285a;

        /* renamed from: b */
        public C5788n f32286b;

        /* renamed from: c */
        public Boolean f32287c = Boolean.TRUE;

        /* renamed from: d */
        public long f32288d = -1;

        /* renamed from: e */
        public double f32289e = 1.0d;

        /* renamed from: f */
        public long[] f32290f;

        /* renamed from: g */
        public JSONObject f32291g;

        /* renamed from: h */
        public String f32292h;

        /* renamed from: i */
        public String f32293i;

        /* renamed from: j */
        public String f32294j;

        /* renamed from: k */
        public String f32295k;

        /* renamed from: l */
        public long f32296l;

        /* renamed from: a */
        public C5779k m28232a() {
            return new C5779k(this.f32285a, this.f32286b, this.f32287c, this.f32288d, this.f32289e, this.f32290f, this.f32291g, this.f32292h, this.f32293i, this.f32294j, this.f32295k, this.f32296l);
        }

        /* renamed from: b */
        public a m28233b(long[] jArr) {
            this.f32290f = jArr;
            return this;
        }

        /* renamed from: c */
        public a m28234c(Boolean bool) {
            this.f32287c = bool;
            return this;
        }

        /* renamed from: d */
        public a m28235d(String str) {
            this.f32292h = str;
            return this;
        }

        /* renamed from: e */
        public a m28236e(String str) {
            this.f32293i = str;
            return this;
        }

        /* renamed from: f */
        public a m28237f(long j10) {
            this.f32288d = j10;
            return this;
        }

        /* renamed from: g */
        public a m28238g(JSONObject jSONObject) {
            this.f32291g = jSONObject;
            return this;
        }

        /* renamed from: h */
        public a m28239h(MediaInfo mediaInfo) {
            this.f32285a = mediaInfo;
            return this;
        }

        /* renamed from: i */
        public a m28240i(double d10) {
            if (Double.compare(d10, 2.0d) > 0 || Double.compare(d10, 0.5d) < 0) {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
            this.f32289e = d10;
            return this;
        }

        /* renamed from: j */
        public a m28241j(C5788n c5788n) {
            this.f32286b = c5788n;
            return this;
        }
    }

    public C5779k(MediaInfo mediaInfo, C5788n c5788n, Boolean bool, long j10, double d10, long[] jArr, String str, String str2, String str3, String str4, String str5, long j11) {
        this(mediaInfo, c5788n, bool, j10, d10, jArr, C8013a.m34860a(str), str2, str3, str4, str5, j11);
    }

    public C5779k(MediaInfo mediaInfo, C5788n c5788n, Boolean bool, long j10, double d10, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j11) {
        this.f32272d = mediaInfo;
        this.f32273e = c5788n;
        this.f32274f = bool;
        this.f32275g = j10;
        this.f32276h = d10;
        this.f32277i = jArr;
        this.f32279k = jSONObject;
        this.f32280l = str;
        this.f32281m = str2;
        this.f32282n = str3;
        this.f32283o = str4;
        this.f32284p = j11;
    }

    /* renamed from: P */
    public long[] m28222P() {
        return this.f32277i;
    }

    /* renamed from: Q */
    public Boolean m28223Q() {
        return this.f32274f;
    }

    /* renamed from: R */
    public String m28224R() {
        return this.f32280l;
    }

    /* renamed from: S */
    public String m28225S() {
        return this.f32281m;
    }

    /* renamed from: T */
    public long m28226T() {
        return this.f32275g;
    }

    /* renamed from: U */
    public MediaInfo m28227U() {
        return this.f32272d;
    }

    /* renamed from: V */
    public double m28228V() {
        return this.f32276h;
    }

    /* renamed from: W */
    public C5788n m28229W() {
        return this.f32273e;
    }

    /* renamed from: X */
    public long m28230X() {
        return this.f32284p;
    }

    /* renamed from: Y */
    public JSONObject m28231Y() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f32272d;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.m13072f0());
            }
            C5788n c5788n = this.f32273e;
            if (c5788n != null) {
                jSONObject.put("queueData", c5788n.m28273X());
            }
            jSONObject.putOpt("autoplay", this.f32274f);
            long j10 = this.f32275g;
            if (j10 != -1) {
                jSONObject.put("currentTime", C8013a.m34861b(j10));
            }
            jSONObject.put("playbackRate", this.f32276h);
            jSONObject.putOpt("credentials", this.f32280l);
            jSONObject.putOpt("credentialsType", this.f32281m);
            jSONObject.putOpt("atvCredentials", this.f32282n);
            jSONObject.putOpt("atvCredentialsType", this.f32283o);
            if (this.f32277i != null) {
                JSONArray jSONArray = new JSONArray();
                int i10 = 0;
                while (true) {
                    long[] jArr = this.f32277i;
                    if (i10 >= jArr.length) {
                        break;
                    }
                    jSONArray.put(i10, jArr[i10]);
                    i10++;
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            jSONObject.putOpt("customData", this.f32279k);
            jSONObject.put("requestId", this.f32284p);
            return jSONObject;
        } catch (JSONException e10) {
            f32271q.m34875c("Error transforming MediaLoadRequestData into JSONObject", e10);
            return new JSONObject();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5779k)) {
            return false;
        }
        C5779k c5779k = (C5779k) obj;
        return C4413l.m22449a(this.f32279k, c5779k.f32279k) && C9932n.m41832b(this.f32272d, c5779k.f32272d) && C9932n.m41832b(this.f32273e, c5779k.f32273e) && C9932n.m41832b(this.f32274f, c5779k.f32274f) && this.f32275g == c5779k.f32275g && this.f32276h == c5779k.f32276h && Arrays.equals(this.f32277i, c5779k.f32277i) && C9932n.m41832b(this.f32280l, c5779k.f32280l) && C9932n.m41832b(this.f32281m, c5779k.f32281m) && C9932n.m41832b(this.f32282n, c5779k.f32282n) && C9932n.m41832b(this.f32283o, c5779k.f32283o) && this.f32284p == c5779k.f32284p;
    }

    public int hashCode() {
        return C9932n.m41833c(this.f32272d, this.f32273e, this.f32274f, Long.valueOf(this.f32275g), Double.valueOf(this.f32276h), this.f32277i, String.valueOf(this.f32279k), this.f32280l, this.f32281m, this.f32282n, this.f32283o, Long.valueOf(this.f32284p));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f32279k;
        this.f32278j = jSONObject == null ? null : jSONObject.toString();
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42535r(parcel, 2, m28227U(), i10, false);
        C10127c.m42535r(parcel, 3, m28229W(), i10, false);
        C10127c.m42521d(parcel, 4, m28223Q(), false);
        C10127c.m42532o(parcel, 5, m28226T());
        C10127c.m42524g(parcel, 6, m28228V());
        C10127c.m42533p(parcel, 7, m28222P(), false);
        C10127c.m42536s(parcel, 8, this.f32278j, false);
        C10127c.m42536s(parcel, 9, m28224R(), false);
        C10127c.m42536s(parcel, 10, m28225S(), false);
        C10127c.m42536s(parcel, 11, this.f32282n, false);
        C10127c.m42536s(parcel, 12, this.f32283o, false);
        C10127c.m42532o(parcel, 13, m28230X());
        C10127c.m42519b(parcel, m42518a);
    }
}
