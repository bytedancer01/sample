package p422y9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p350u9.C8808d;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/f1.class
 */
/* renamed from: y9.f1 */
/* loaded from: combined.jar:classes2.jar:y9/f1.class */
public final class C9910f1 extends AbstractC10125a {
    public static final Parcelable.Creator<C9910f1> CREATOR = new C9913g1();

    /* renamed from: d */
    public Bundle f45563d;

    /* renamed from: e */
    public C8808d[] f45564e;

    /* renamed from: f */
    public int f45565f;

    /* renamed from: g */
    public C9905e f45566g;

    public C9910f1() {
    }

    public C9910f1(Bundle bundle, C8808d[] c8808dArr, int i10, C9905e c9905e) {
        this.f45563d = bundle;
        this.f45564e = c8808dArr;
        this.f45565f = i10;
        this.f45566g = c9905e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42522e(parcel, 1, this.f45563d, false);
        C10127c.m42539v(parcel, 2, this.f45564e, i10, false);
        C10127c.m42529l(parcel, 3, this.f45565f);
        C10127c.m42535r(parcel, 4, this.f45566g, i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
