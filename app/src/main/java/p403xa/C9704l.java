package p403xa;

import android.os.Parcel;
import android.os.Parcelable;
import p350u9.C8804b;
import p422y9.C9930m0;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/l.class
 */
/* renamed from: xa.l */
/* loaded from: combined.jar:classes2.jar:xa/l.class */
public final class C9704l extends AbstractC10125a {
    public static final Parcelable.Creator<C9704l> CREATOR = new C9705m();

    /* renamed from: d */
    public final int f44247d;

    /* renamed from: e */
    public final C8804b f44248e;

    /* renamed from: f */
    public final C9930m0 f44249f;

    public C9704l(int i10, C8804b c8804b, C9930m0 c9930m0) {
        this.f44247d = i10;
        this.f44248e = c8804b;
        this.f44249f = c9930m0;
    }

    /* renamed from: P */
    public final C8804b m40807P() {
        return this.f44248e;
    }

    /* renamed from: Q */
    public final C9930m0 m40808Q() {
        return this.f44249f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, this.f44247d);
        C10127c.m42535r(parcel, 2, this.f44248e, i10, false);
        C10127c.m42535r(parcel, 3, this.f44249f, i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
