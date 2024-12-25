package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/x.class
 */
/* renamed from: l9.x */
/* loaded from: combined.jar:classes2.jar:l9/x.class */
public final class C5818x extends AbstractC10125a {
    public static final Parcelable.Creator<C5818x> CREATOR = new C5821y();

    /* renamed from: d */
    public final float f32442d;

    /* renamed from: e */
    public final float f32443e;

    /* renamed from: f */
    public final float f32444f;

    public C5818x(float f10, float f11, float f12) {
        this.f32442d = f10;
        this.f32443e = f11;
        this.f32444f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5818x)) {
            return false;
        }
        C5818x c5818x = (C5818x) obj;
        return this.f32442d == c5818x.f32442d && this.f32443e == c5818x.f32443e && this.f32444f == c5818x.f32444f;
    }

    public final int hashCode() {
        return C9932n.m41833c(Float.valueOf(this.f32442d), Float.valueOf(this.f32443e), Float.valueOf(this.f32444f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42526i(parcel, 2, this.f32442d);
        C10127c.m42526i(parcel, 3, this.f32443e);
        C10127c.m42526i(parcel, 4, this.f32444f);
        C10127c.m42519b(parcel, m42518a);
    }
}
