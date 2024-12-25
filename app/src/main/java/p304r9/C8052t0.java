package p304r9;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/t0.class
 */
/* renamed from: r9.t0 */
/* loaded from: combined.jar:classes2.jar:r9/t0.class */
public final class C8052t0 extends AbstractC10125a {
    public static final Parcelable.Creator<C8052t0> CREATOR = new C8019d();

    /* renamed from: d */
    public final int f38908d;

    /* renamed from: e */
    public final boolean f38909e;

    /* renamed from: f */
    public final boolean f38910f;

    public C8052t0(int i10, boolean z10, boolean z11) {
        this.f38908d = i10;
        this.f38909e = z10;
        this.f38910f = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8052t0)) {
            return false;
        }
        C8052t0 c8052t0 = (C8052t0) obj;
        return this.f38908d == c8052t0.f38908d && this.f38909e == c8052t0.f38909e && this.f38910f == c8052t0.f38910f;
    }

    public final int hashCode() {
        return C9932n.m41833c(Integer.valueOf(this.f38908d), Boolean.valueOf(this.f38909e), Boolean.valueOf(this.f38910f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 2, this.f38908d);
        C10127c.m42520c(parcel, 3, this.f38909e);
        C10127c.m42520c(parcel, 4, this.f38910f);
        C10127c.m42519b(parcel, m42518a);
    }
}
