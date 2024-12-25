package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/x0.class
 */
/* renamed from: l9.x0 */
/* loaded from: combined.jar:classes2.jar:l9/x0.class */
public final class C5819x0 extends AbstractC10125a {
    public static final Parcelable.Creator<C5819x0> CREATOR = new C5822y0();

    /* renamed from: d */
    public final int f32445d;

    public C5819x0() {
        this.f32445d = 0;
    }

    public C5819x0(int i10) {
        this.f32445d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C5819x0) && this.f32445d == ((C5819x0) obj).f32445d;
    }

    public final int hashCode() {
        return C9932n.m41833c(Integer.valueOf(this.f32445d));
    }

    public final String toString() {
        int i10 = this.f32445d;
        return String.format("joinOptions(connectionType=%s)", i10 != 0 ? i10 != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 2, this.f32445d);
        C10127c.m42519b(parcel, m42518a);
    }
}
