package p422y9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/e.class
 */
/* renamed from: y9.e */
/* loaded from: combined.jar:classes2.jar:y9/e.class */
public class C9905e extends AbstractC10125a {
    public static final Parcelable.Creator<C9905e> CREATOR = new C9916h1();

    /* renamed from: d */
    public final C9941q f45541d;

    /* renamed from: e */
    public final boolean f45542e;

    /* renamed from: f */
    public final boolean f45543f;

    /* renamed from: g */
    public final int[] f45544g;

    /* renamed from: h */
    public final int f45545h;

    /* renamed from: i */
    public final int[] f45546i;

    public C9905e(C9941q c9941q, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f45541d = c9941q;
        this.f45542e = z10;
        this.f45543f = z11;
        this.f45544g = iArr;
        this.f45545h = i10;
        this.f45546i = iArr2;
    }

    /* renamed from: P */
    public int m41782P() {
        return this.f45545h;
    }

    /* renamed from: Q */
    public int[] m41783Q() {
        return this.f45544g;
    }

    /* renamed from: R */
    public int[] m41784R() {
        return this.f45546i;
    }

    /* renamed from: S */
    public boolean m41785S() {
        return this.f45542e;
    }

    /* renamed from: T */
    public boolean m41786T() {
        return this.f45543f;
    }

    /* renamed from: U */
    public final C9941q m41787U() {
        return this.f45541d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42535r(parcel, 1, this.f45541d, i10, false);
        C10127c.m42520c(parcel, 2, m41785S());
        C10127c.m42520c(parcel, 3, m41786T());
        C10127c.m42530m(parcel, 4, m41783Q(), false);
        C10127c.m42529l(parcel, 5, m41782P());
        C10127c.m42530m(parcel, 6, m41784R(), false);
        C10127c.m42519b(parcel, m42518a);
    }
}
