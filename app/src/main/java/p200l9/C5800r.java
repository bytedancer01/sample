package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import p060da.C4413l;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/r.class
 */
/* renamed from: l9.r */
/* loaded from: combined.jar:classes2.jar:l9/r.class */
public class C5800r extends AbstractC10125a {
    public static final Parcelable.Creator<C5800r> CREATOR = new C5808t1();

    /* renamed from: d */
    public final C5779k f32383d;

    /* renamed from: e */
    public String f32384e;

    /* renamed from: f */
    public final JSONObject f32385f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l9/r$a.class
     */
    /* renamed from: l9.r$a */
    /* loaded from: combined.jar:classes2.jar:l9/r$a.class */
    public static class a {

        /* renamed from: a */
        public C5779k f32386a;

        /* renamed from: b */
        public JSONObject f32387b;

        /* renamed from: a */
        public C5800r m28338a() {
            return new C5800r(this.f32386a, this.f32387b);
        }

        /* renamed from: b */
        public a m28339b(C5779k c5779k) {
            this.f32386a = c5779k;
            return this;
        }
    }

    public C5800r(C5779k c5779k, JSONObject jSONObject) {
        this.f32383d = c5779k;
        this.f32385f = jSONObject;
    }

    /* renamed from: P */
    public C5779k m28337P() {
        return this.f32383d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5800r)) {
            return false;
        }
        C5800r c5800r = (C5800r) obj;
        if (C4413l.m22449a(this.f32385f, c5800r.f32385f)) {
            return C9932n.m41832b(this.f32383d, c5800r.f32383d);
        }
        return false;
    }

    public int hashCode() {
        return C9932n.m41833c(this.f32383d, String.valueOf(this.f32385f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f32385f;
        this.f32384e = jSONObject == null ? null : jSONObject.toString();
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42535r(parcel, 2, m28337P(), i10, false);
        C10127c.m42536s(parcel, 3, this.f32384e, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
