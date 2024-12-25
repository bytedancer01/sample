package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.achartengine.ChartFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import p304r9.C8013a;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/a.class
 */
/* renamed from: l9.a */
/* loaded from: combined.jar:classes2.jar:l9/a.class */
public class C5742a extends AbstractC10125a {
    public static final Parcelable.Creator<C5742a> CREATOR = new C5812v();

    /* renamed from: d */
    public final String f32165d;

    /* renamed from: e */
    public final String f32166e;

    /* renamed from: f */
    public final long f32167f;

    /* renamed from: g */
    public final String f32168g;

    /* renamed from: h */
    public final String f32169h;

    /* renamed from: i */
    public final String f32170i;

    /* renamed from: j */
    public String f32171j;

    /* renamed from: k */
    public final String f32172k;

    /* renamed from: l */
    public final String f32173l;

    /* renamed from: m */
    public final long f32174m;

    /* renamed from: n */
    public final String f32175n;

    /* renamed from: o */
    public final C5806t f32176o;

    /* renamed from: p */
    public JSONObject f32177p;

    public C5742a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, C5806t c5806t) {
        JSONObject jSONObject;
        this.f32165d = str;
        this.f32166e = str2;
        this.f32167f = j10;
        this.f32168g = str3;
        this.f32169h = str4;
        this.f32170i = str5;
        this.f32171j = str6;
        this.f32172k = str7;
        this.f32173l = str8;
        this.f32174m = j11;
        this.f32175n = str9;
        this.f32176o = c5806t;
        if (TextUtils.isEmpty(str6)) {
            jSONObject = new JSONObject();
        } else {
            try {
                this.f32177p = new JSONObject(this.f32171j);
                return;
            } catch (JSONException e10) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e10.getMessage()));
                this.f32171j = null;
                jSONObject = new JSONObject();
            }
        }
        this.f32177p = jSONObject;
    }

    /* renamed from: P */
    public String m28132P() {
        return this.f32170i;
    }

    /* renamed from: Q */
    public String m28133Q() {
        return this.f32172k;
    }

    /* renamed from: R */
    public String m28134R() {
        return this.f32168g;
    }

    /* renamed from: S */
    public long m28135S() {
        return this.f32167f;
    }

    /* renamed from: T */
    public String m28136T() {
        return this.f32175n;
    }

    /* renamed from: U */
    public String m28137U() {
        return this.f32165d;
    }

    /* renamed from: V */
    public String m28138V() {
        return this.f32173l;
    }

    /* renamed from: W */
    public String m28139W() {
        return this.f32169h;
    }

    /* renamed from: X */
    public String m28140X() {
        return this.f32166e;
    }

    /* renamed from: Y */
    public C5806t m28141Y() {
        return this.f32176o;
    }

    /* renamed from: Z */
    public long m28142Z() {
        return this.f32174m;
    }

    /* renamed from: a0 */
    public final JSONObject m28143a0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Name.MARK, this.f32165d);
            jSONObject.put("duration", C8013a.m34861b(this.f32167f));
            long j10 = this.f32174m;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", C8013a.m34861b(j10));
            }
            String str = this.f32172k;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f32169h;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f32166e;
            if (str3 != null) {
                jSONObject.put(ChartFactory.TITLE, str3);
            }
            String str4 = this.f32168g;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f32170i;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f32177p;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f32173l;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f32175n;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            C5806t c5806t = this.f32176o;
            if (c5806t != null) {
                jSONObject.put("vastAdsRequest", c5806t.m28358R());
            }
        } catch (JSONException e10) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5742a)) {
            return false;
        }
        C5742a c5742a = (C5742a) obj;
        return C8013a.m34870k(this.f32165d, c5742a.f32165d) && C8013a.m34870k(this.f32166e, c5742a.f32166e) && this.f32167f == c5742a.f32167f && C8013a.m34870k(this.f32168g, c5742a.f32168g) && C8013a.m34870k(this.f32169h, c5742a.f32169h) && C8013a.m34870k(this.f32170i, c5742a.f32170i) && C8013a.m34870k(this.f32171j, c5742a.f32171j) && C8013a.m34870k(this.f32172k, c5742a.f32172k) && C8013a.m34870k(this.f32173l, c5742a.f32173l) && this.f32174m == c5742a.f32174m && C8013a.m34870k(this.f32175n, c5742a.f32175n) && C8013a.m34870k(this.f32176o, c5742a.f32176o);
    }

    public int hashCode() {
        return C9932n.m41833c(this.f32165d, this.f32166e, Long.valueOf(this.f32167f), this.f32168g, this.f32169h, this.f32170i, this.f32171j, this.f32172k, this.f32173l, Long.valueOf(this.f32174m), this.f32175n, this.f32176o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, m28137U(), false);
        C10127c.m42536s(parcel, 3, m28140X(), false);
        C10127c.m42532o(parcel, 4, m28135S());
        C10127c.m42536s(parcel, 5, m28134R(), false);
        C10127c.m42536s(parcel, 6, m28139W(), false);
        C10127c.m42536s(parcel, 7, m28132P(), false);
        C10127c.m42536s(parcel, 8, this.f32171j, false);
        C10127c.m42536s(parcel, 9, m28133Q(), false);
        C10127c.m42536s(parcel, 10, m28138V(), false);
        C10127c.m42532o(parcel, 11, m28142Z());
        C10127c.m42536s(parcel, 12, m28136T(), false);
        C10127c.m42535r(parcel, 13, m28141Y(), i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
