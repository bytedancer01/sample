package p230n9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/b.class
 */
/* renamed from: n9.b */
/* loaded from: combined.jar:classes2.jar:n9/b.class */
public class C6701b extends AbstractC10125a {
    public static final Parcelable.Creator<C6701b> CREATOR = new C6754y0();

    /* renamed from: d */
    public final int f35067d;

    /* renamed from: e */
    public final int f35068e;

    /* renamed from: f */
    public final int f35069f;

    public C6701b(int i10, int i11, int i12) {
        this.f35067d = i10;
        this.f35068e = i11;
        this.f35069f = i12;
    }

    /* renamed from: P */
    public int m30868P() {
        return this.f35069f;
    }

    /* renamed from: Q */
    public int m30869Q() {
        return this.f35067d;
    }

    /* renamed from: R */
    public int m30870R() {
        return this.f35068e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 2, m30869Q());
        C10127c.m42529l(parcel, 3, m30870R());
        C10127c.m42529l(parcel, 4, m30868P());
        C10127c.m42519b(parcel, m42518a);
    }
}
