package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p304r9.C8013a;
import p304r9.C8015b;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/c.class
 */
/* renamed from: l9.c */
/* loaded from: combined.jar:classes2.jar:l9/c.class */
public class C5750c extends AbstractC10125a {

    /* renamed from: d */
    public final long f32200d;

    /* renamed from: e */
    public final long f32201e;

    /* renamed from: f */
    public final String f32202f;

    /* renamed from: g */
    public final String f32203g;

    /* renamed from: h */
    public final long f32204h;

    /* renamed from: i */
    public static final C8015b f32199i = new C8015b("AdBreakStatus");
    public static final Parcelable.Creator<C5750c> CREATOR = new C5756d1();

    public C5750c(long j10, long j11, String str, String str2, long j12) {
        this.f32200d = j10;
        this.f32201e = j11;
        this.f32202f = str;
        this.f32203g = str2;
        this.f32204h = j12;
    }

    /* renamed from: U */
    public static C5750c m28164U(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("currentBreakTime") || !jSONObject.has("currentBreakClipTime")) {
            return null;
        }
        try {
            long m34864e = C8013a.m34864e(jSONObject.getLong("currentBreakTime"));
            long m34864e2 = C8013a.m34864e(jSONObject.getLong("currentBreakClipTime"));
            String m34862c = C8013a.m34862c(jSONObject, "breakId");
            String m34862c2 = C8013a.m34862c(jSONObject, "breakClipId");
            long optLong = jSONObject.optLong("whenSkippable", -1L);
            if (optLong != -1) {
                optLong = C8013a.m34864e(optLong);
            }
            return new C5750c(m34864e, m34864e2, m34862c, m34862c2, optLong);
        } catch (JSONException e10) {
            f32199i.m34876d(e10, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            return null;
        }
    }

    /* renamed from: P */
    public String m28165P() {
        return this.f32203g;
    }

    /* renamed from: Q */
    public String m28166Q() {
        return this.f32202f;
    }

    /* renamed from: R */
    public long m28167R() {
        return this.f32201e;
    }

    /* renamed from: S */
    public long m28168S() {
        return this.f32200d;
    }

    /* renamed from: T */
    public long m28169T() {
        return this.f32204h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5750c)) {
            return false;
        }
        C5750c c5750c = (C5750c) obj;
        return this.f32200d == c5750c.f32200d && this.f32201e == c5750c.f32201e && C8013a.m34870k(this.f32202f, c5750c.f32202f) && C8013a.m34870k(this.f32203g, c5750c.f32203g) && this.f32204h == c5750c.f32204h;
    }

    public int hashCode() {
        return C9932n.m41833c(Long.valueOf(this.f32200d), Long.valueOf(this.f32201e), this.f32202f, this.f32203g, Long.valueOf(this.f32204h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42532o(parcel, 2, m28168S());
        C10127c.m42532o(parcel, 3, m28167R());
        C10127c.m42536s(parcel, 4, m28166Q(), false);
        C10127c.m42536s(parcel, 5, m28165P(), false);
        C10127c.m42532o(parcel, 6, m28169T());
        C10127c.m42519b(parcel, m42518a);
    }
}
