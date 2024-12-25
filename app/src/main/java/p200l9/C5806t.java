package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p304r9.C8013a;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/t.class
 */
/* renamed from: l9.t */
/* loaded from: combined.jar:classes2.jar:l9/t.class */
public class C5806t extends AbstractC10125a {
    public static final Parcelable.Creator<C5806t> CREATOR = new C5814v1();

    /* renamed from: d */
    public final String f32405d;

    /* renamed from: e */
    public final String f32406e;

    public C5806t(String str, String str2) {
        this.f32405d = str;
        this.f32406e = str2;
    }

    /* renamed from: b */
    public static C5806t m28355b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C5806t(C8013a.m34862c(jSONObject, "adTagUrl"), C8013a.m34862c(jSONObject, "adsResponse"));
    }

    /* renamed from: P */
    public String m28356P() {
        return this.f32405d;
    }

    /* renamed from: Q */
    public String m28357Q() {
        return this.f32406e;
    }

    /* renamed from: R */
    public final JSONObject m28358R() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f32405d;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f32406e;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException e10) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5806t)) {
            return false;
        }
        C5806t c5806t = (C5806t) obj;
        return C8013a.m34870k(this.f32405d, c5806t.f32405d) && C8013a.m34870k(this.f32406e, c5806t.f32406e);
    }

    public int hashCode() {
        return C9932n.m41833c(this.f32405d, this.f32406e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, m28356P(), false);
        C10127c.m42536s(parcel, 3, m28357Q(), false);
        C10127c.m42519b(parcel, m42518a);
    }
}
