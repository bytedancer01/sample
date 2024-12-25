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
  classes2.jar:l9/i.class
 */
/* renamed from: l9.i */
/* loaded from: combined.jar:classes2.jar:l9/i.class */
public class C5773i extends AbstractC10125a {

    /* renamed from: d */
    public final long f32251d;

    /* renamed from: e */
    public final long f32252e;

    /* renamed from: f */
    public final boolean f32253f;

    /* renamed from: g */
    public final boolean f32254g;

    /* renamed from: h */
    public static final C8015b f32250h = new C8015b("MediaLiveSeekableRange");
    public static final Parcelable.Creator<C5773i> CREATOR = new C5752c1();

    public C5773i(long j10, long j11, boolean z10, boolean z11) {
        this.f32251d = Math.max(j10, 0L);
        this.f32252e = Math.max(j11, 0L);
        this.f32253f = z10;
        this.f32254g = z11;
    }

    /* renamed from: T */
    public static C5773i m28207T(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("start") || !jSONObject.has("end")) {
            return null;
        }
        try {
            return new C5773i(C8013a.m34863d(jSONObject.getDouble("start")), C8013a.m34863d(jSONObject.getDouble("end")), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
        } catch (JSONException e10) {
            f32250h.m34875c("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObject.toString()), new Object[0]);
            return null;
        }
    }

    /* renamed from: P */
    public long m28208P() {
        return this.f32252e;
    }

    /* renamed from: Q */
    public long m28209Q() {
        return this.f32251d;
    }

    /* renamed from: R */
    public boolean m28210R() {
        return this.f32254g;
    }

    /* renamed from: S */
    public boolean m28211S() {
        return this.f32253f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5773i)) {
            return false;
        }
        C5773i c5773i = (C5773i) obj;
        return this.f32251d == c5773i.f32251d && this.f32252e == c5773i.f32252e && this.f32253f == c5773i.f32253f && this.f32254g == c5773i.f32254g;
    }

    public int hashCode() {
        return C9932n.m41833c(Long.valueOf(this.f32251d), Long.valueOf(this.f32252e), Boolean.valueOf(this.f32253f), Boolean.valueOf(this.f32254g));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42532o(parcel, 2, m28209Q());
        C10127c.m42532o(parcel, 3, m28208P());
        C10127c.m42520c(parcel, 4, m28211S());
        C10127c.m42520c(parcel, 5, m28210R());
        C10127c.m42519b(parcel, m42518a);
    }
}
