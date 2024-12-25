package p422y9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/q.class
 */
/* renamed from: y9.q */
/* loaded from: combined.jar:classes2.jar:y9/q.class */
public class C9941q extends AbstractC10125a {
    public static final Parcelable.Creator<C9941q> CREATOR = new C9959w0();

    /* renamed from: d */
    public final int f45632d;

    /* renamed from: e */
    public final boolean f45633e;

    /* renamed from: f */
    public final boolean f45634f;

    /* renamed from: g */
    public final int f45635g;

    /* renamed from: h */
    public final int f45636h;

    public C9941q(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f45632d = i10;
        this.f45633e = z10;
        this.f45634f = z11;
        this.f45635g = i11;
        this.f45636h = i12;
    }

    /* renamed from: P */
    public int m41864P() {
        return this.f45635g;
    }

    /* renamed from: Q */
    public int m41865Q() {
        return this.f45636h;
    }

    /* renamed from: R */
    public boolean m41866R() {
        return this.f45633e;
    }

    /* renamed from: S */
    public boolean m41867S() {
        return this.f45634f;
    }

    /* renamed from: T */
    public int m41868T() {
        return this.f45632d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, m41868T());
        C10127c.m42520c(parcel, 2, m41866R());
        C10127c.m42520c(parcel, 3, m41867S());
        C10127c.m42529l(parcel, 4, m41864P());
        C10127c.m42529l(parcel, 5, m41865Q());
        C10127c.m42519b(parcel, m42518a);
    }
}
