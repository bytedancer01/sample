package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p304r9.C8015b;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/u.class
 */
/* renamed from: l9.u */
/* loaded from: combined.jar:classes2.jar:l9/u.class */
public final class C5809u extends AbstractC10125a {

    /* renamed from: d */
    public final int f32411d;

    /* renamed from: e */
    public final int f32412e;

    /* renamed from: f */
    public final int f32413f;

    /* renamed from: g */
    public static final C8015b f32410g = new C8015b("VideoInfo");
    public static final Parcelable.Creator<C5809u> CREATOR = new C5817w1();

    public C5809u(int i10, int i11, int i12) {
        this.f32411d = i10;
        this.f32412e = i11;
        this.f32413f = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p200l9.C5809u m28359Q(org.json.JSONObject r7) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p200l9.C5809u.m28359Q(org.json.JSONObject):l9.u");
    }

    /* renamed from: P */
    public int m28360P() {
        return this.f32413f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5809u)) {
            return false;
        }
        C5809u c5809u = (C5809u) obj;
        return this.f32412e == c5809u.getHeight() && this.f32411d == c5809u.getWidth() && this.f32413f == c5809u.m28360P();
    }

    public int getHeight() {
        return this.f32412e;
    }

    public int getWidth() {
        return this.f32411d;
    }

    public int hashCode() {
        return C9932n.m41833c(Integer.valueOf(this.f32412e), Integer.valueOf(this.f32411d), Integer.valueOf(this.f32413f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 2, getWidth());
        C10127c.m42529l(parcel, 3, getHeight());
        C10127c.m42529l(parcel, 4, m28360P());
        C10127c.m42519b(parcel, m42518a);
    }
}
