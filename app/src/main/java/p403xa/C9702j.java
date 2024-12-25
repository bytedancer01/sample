package p403xa;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9924k0;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/j.class
 */
/* renamed from: xa.j */
/* loaded from: combined.jar:classes2.jar:xa/j.class */
public final class C9702j extends AbstractC10125a {
    public static final Parcelable.Creator<C9702j> CREATOR = new C9703k();

    /* renamed from: d */
    public final int f44245d;

    /* renamed from: e */
    public final C9924k0 f44246e;

    public C9702j(int i10, C9924k0 c9924k0) {
        this.f44245d = i10;
        this.f44246e = c9924k0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, this.f44245d);
        C10127c.m42535r(parcel, 2, this.f44246e, i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
