package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import p304r9.C8013a;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/b.class
 */
/* renamed from: l9.b */
/* loaded from: combined.jar:classes2.jar:l9/b.class */
public class C5746b extends AbstractC10125a {
    public static final Parcelable.Creator<C5746b> CREATOR = new C5759e0();

    /* renamed from: d */
    public final long f32178d;

    /* renamed from: e */
    public final String f32179e;

    /* renamed from: f */
    public final long f32180f;

    /* renamed from: g */
    public final boolean f32181g;

    /* renamed from: h */
    public final String[] f32182h;

    /* renamed from: i */
    public final boolean f32183i;

    /* renamed from: j */
    public final boolean f32184j;

    public C5746b(long j10, String str, long j11, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f32178d = j10;
        this.f32179e = str;
        this.f32180f = j11;
        this.f32181g = z10;
        this.f32182h = strArr;
        this.f32183i = z11;
        this.f32184j = z12;
    }

    /* renamed from: P */
    public String[] m28148P() {
        return this.f32182h;
    }

    /* renamed from: Q */
    public long m28149Q() {
        return this.f32180f;
    }

    /* renamed from: R */
    public String m28150R() {
        return this.f32179e;
    }

    /* renamed from: S */
    public long m28151S() {
        return this.f32178d;
    }

    /* renamed from: T */
    public boolean m28152T() {
        return this.f32183i;
    }

    /* renamed from: U */
    public boolean m28153U() {
        return this.f32184j;
    }

    /* renamed from: V */
    public boolean m28154V() {
        return this.f32181g;
    }

    /* renamed from: W */
    public final JSONObject m28155W() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Name.MARK, this.f32179e);
            jSONObject.put("position", C8013a.m34861b(this.f32178d));
            jSONObject.put("isWatched", this.f32181g);
            jSONObject.put("isEmbedded", this.f32183i);
            jSONObject.put("duration", C8013a.m34861b(this.f32180f));
            jSONObject.put("expanded", this.f32184j);
            if (this.f32182h != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.f32182h) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException e10) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5746b)) {
            return false;
        }
        C5746b c5746b = (C5746b) obj;
        return C8013a.m34870k(this.f32179e, c5746b.f32179e) && this.f32178d == c5746b.f32178d && this.f32180f == c5746b.f32180f && this.f32181g == c5746b.f32181g && Arrays.equals(this.f32182h, c5746b.f32182h) && this.f32183i == c5746b.f32183i && this.f32184j == c5746b.f32184j;
    }

    public int hashCode() {
        return this.f32179e.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42532o(parcel, 2, m28151S());
        C10127c.m42536s(parcel, 3, m28150R(), false);
        C10127c.m42532o(parcel, 4, m28149Q());
        C10127c.m42520c(parcel, 5, m28154V());
        C10127c.m42537t(parcel, 6, m28148P(), false);
        C10127c.m42520c(parcel, 7, m28152T());
        C10127c.m42520c(parcel, 8, m28153U());
        C10127c.m42519b(parcel, m42518a);
    }
}
