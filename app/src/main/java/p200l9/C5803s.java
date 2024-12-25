package p200l9;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p060da.C4413l;
import p304r9.C8013a;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/s.class
 */
/* renamed from: l9.s */
/* loaded from: combined.jar:classes2.jar:l9/s.class */
public final class C5803s extends AbstractC10125a {
    public static final Parcelable.Creator<C5803s> CREATOR = new C5811u1();

    /* renamed from: d */
    public float f32390d;

    /* renamed from: e */
    public int f32391e;

    /* renamed from: f */
    public int f32392f;

    /* renamed from: g */
    public int f32393g;

    /* renamed from: h */
    public int f32394h;

    /* renamed from: i */
    public int f32395i;

    /* renamed from: j */
    public int f32396j;

    /* renamed from: k */
    public int f32397k;

    /* renamed from: l */
    public String f32398l;

    /* renamed from: m */
    public int f32399m;

    /* renamed from: n */
    public int f32400n;

    /* renamed from: o */
    public String f32401o;

    /* renamed from: p */
    public JSONObject f32402p;

    public C5803s() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public C5803s(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f32390d = f10;
        this.f32391e = i10;
        this.f32392f = i11;
        this.f32393g = i12;
        this.f32394h = i13;
        this.f32395i = i14;
        this.f32396j = i15;
        this.f32397k = i16;
        this.f32398l = str;
        this.f32399m = i17;
        this.f32400n = i18;
        this.f32401o = str2;
        if (str2 == null) {
            this.f32402p = null;
            return;
        }
        try {
            this.f32402p = new JSONObject(this.f32401o);
        } catch (JSONException e10) {
            this.f32402p = null;
            this.f32401o = null;
        }
    }

    /* renamed from: b0 */
    public static final int m28340b0(String str) {
        if (str == null || str.length() != 9 || str.charAt(0) != '#') {
            return 0;
        }
        try {
            return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
        } catch (NumberFormatException e10) {
            return 0;
        }
    }

    /* renamed from: c0 */
    public static final String m28341c0(int i10) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Integer.valueOf(Color.alpha(i10)));
    }

    /* renamed from: P */
    public int m28342P() {
        return this.f32392f;
    }

    /* renamed from: Q */
    public int m28343Q() {
        return this.f32394h;
    }

    /* renamed from: R */
    public int m28344R() {
        return this.f32393g;
    }

    /* renamed from: S */
    public String m28345S() {
        return this.f32398l;
    }

    /* renamed from: T */
    public int m28346T() {
        return this.f32399m;
    }

    /* renamed from: U */
    public float m28347U() {
        return this.f32390d;
    }

    /* renamed from: V */
    public int m28348V() {
        return this.f32400n;
    }

    /* renamed from: W */
    public int m28349W() {
        return this.f32391e;
    }

    /* renamed from: X */
    public int m28350X() {
        return this.f32396j;
    }

    /* renamed from: Y */
    public int m28351Y() {
        return this.f32397k;
    }

    /* renamed from: Z */
    public int m28352Z() {
        return this.f32395i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x016d, code lost:
    
        r0 = r5.f32400n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0173, code lost:
    
        if (r0 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0178, code lost:
    
        if (r0 == 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017d, code lost:
    
        if (r0 == 2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
    
        if (r0 == 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0188, code lost:
    
        r7 = "BOLD_ITALIC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
    
        r0.put("fontStyle", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ac, code lost:
    
        r0 = r5.f32402p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b1, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b4, code lost:
    
        r0.put("customData", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
    
        r7 = "ITALIC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
    
        r7 = "BOLD";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a2, code lost:
    
        r0.put("fontStyle", "NORMAL");
     */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject m28353a0() {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200l9.C5803s.m28353a0():org.json.JSONObject");
    }

    /* renamed from: b */
    public void m28354b(JSONObject jSONObject) {
        int i10;
        this.f32390d = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.f32391e = m28340b0(jSONObject.optString("foregroundColor"));
        this.f32392f = m28340b0(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.f32393g = 0;
            } else if ("OUTLINE".equals(string)) {
                this.f32393g = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.f32393g = 2;
            } else if ("RAISED".equals(string)) {
                this.f32393g = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.f32393g = 4;
            }
        }
        this.f32394h = m28340b0(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.f32395i = 0;
            } else if ("NORMAL".equals(string2)) {
                this.f32395i = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.f32395i = 2;
            }
        }
        this.f32396j = m28340b0(jSONObject.optString("windowColor"));
        if (this.f32395i == 2) {
            this.f32397k = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.f32398l = C8013a.m34862c(jSONObject, CognitoUserPoolsSignInProvider.AttributeKeys.FONT_FAMILY);
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.f32399m = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.f32399m = 1;
            } else if ("SERIF".equals(string3)) {
                this.f32399m = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.f32399m = 3;
            } else if ("CASUAL".equals(string3)) {
                this.f32399m = 4;
            } else {
                if ("CURSIVE".equals(string3)) {
                    i10 = 5;
                } else if ("SMALL_CAPITALS".equals(string3)) {
                    i10 = 6;
                }
                this.f32399m = i10;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.f32400n = 0;
            } else if ("BOLD".equals(string4)) {
                this.f32400n = 1;
            } else if ("ITALIC".equals(string4)) {
                this.f32400n = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.f32400n = 3;
            }
        }
        this.f32402p = jSONObject.optJSONObject("customData");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5803s)) {
            return false;
        }
        C5803s c5803s = (C5803s) obj;
        JSONObject jSONObject = this.f32402p;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = c5803s.f32402p;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C4413l.m22449a(jSONObject, jSONObject2)) && this.f32390d == c5803s.f32390d && this.f32391e == c5803s.f32391e && this.f32392f == c5803s.f32392f && this.f32393g == c5803s.f32393g && this.f32394h == c5803s.f32394h && this.f32395i == c5803s.f32395i && this.f32396j == c5803s.f32396j && this.f32397k == c5803s.f32397k && C8013a.m34870k(this.f32398l, c5803s.f32398l) && this.f32399m == c5803s.f32399m && this.f32400n == c5803s.f32400n;
    }

    public int hashCode() {
        return C9932n.m41833c(Float.valueOf(this.f32390d), Integer.valueOf(this.f32391e), Integer.valueOf(this.f32392f), Integer.valueOf(this.f32393g), Integer.valueOf(this.f32394h), Integer.valueOf(this.f32395i), Integer.valueOf(this.f32396j), Integer.valueOf(this.f32397k), this.f32398l, Integer.valueOf(this.f32399m), Integer.valueOf(this.f32400n), String.valueOf(this.f32402p));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f32402p;
        this.f32401o = jSONObject == null ? null : jSONObject.toString();
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42526i(parcel, 2, m28347U());
        C10127c.m42529l(parcel, 3, m28349W());
        C10127c.m42529l(parcel, 4, m28342P());
        C10127c.m42529l(parcel, 5, m28344R());
        C10127c.m42529l(parcel, 6, m28343Q());
        C10127c.m42529l(parcel, 7, m28352Z());
        C10127c.m42529l(parcel, 8, m28350X());
        C10127c.m42529l(parcel, 9, m28351Y());
        C10127c.m42536s(parcel, 10, m28345S(), false);
        C10127c.m42529l(parcel, 11, m28346T());
        C10127c.m42529l(parcel, 12, m28348V());
        C10127c.m42536s(parcel, 13, this.f32401o, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
