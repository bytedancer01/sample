package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p304r9.C8013a;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/z.class
 */
/* renamed from: l9.z */
/* loaded from: combined.jar:classes2.jar:l9/z.class */
public final class C5824z extends AbstractC10125a {
    public static final Parcelable.Creator<C5824z> CREATOR = new C5743a0();

    /* renamed from: d */
    public final C5818x f32446d;

    /* renamed from: e */
    public final C5818x f32447e;

    public C5824z(C5818x c5818x, C5818x c5818x2) {
        this.f32446d = c5818x;
        this.f32447e = c5818x2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5824z)) {
            return false;
        }
        C5824z c5824z = (C5824z) obj;
        return C8013a.m34870k(this.f32446d, c5824z.f32446d) && C8013a.m34870k(this.f32447e, c5824z.f32447e);
    }

    public final int hashCode() {
        return C9932n.m41833c(this.f32446d, this.f32447e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42535r(parcel, 2, this.f32446d, i10, false);
        C10127c.m42535r(parcel, 3, this.f32447e, i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
