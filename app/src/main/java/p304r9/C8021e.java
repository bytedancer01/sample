package p304r9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p200l9.C5754d;
import p200l9.C5824z;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/e.class
 */
/* renamed from: r9.e */
/* loaded from: combined.jar:classes2.jar:r9/e.class */
public final class C8021e extends AbstractC10125a {
    public static final Parcelable.Creator<C8021e> CREATOR = new C8023f();

    /* renamed from: d */
    public double f38807d;

    /* renamed from: e */
    public boolean f38808e;

    /* renamed from: f */
    public int f38809f;

    /* renamed from: g */
    public C5754d f38810g;

    /* renamed from: h */
    public int f38811h;

    /* renamed from: i */
    public C5824z f38812i;

    /* renamed from: j */
    public double f38813j;

    public C8021e() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public C8021e(double d10, boolean z10, int i10, C5754d c5754d, int i11, C5824z c5824z, double d11) {
        this.f38807d = d10;
        this.f38808e = z10;
        this.f38809f = i10;
        this.f38810g = c5754d;
        this.f38811h = i11;
        this.f38812i = c5824z;
        this.f38813j = d11;
    }

    /* renamed from: P */
    public final double m34883P() {
        return this.f38813j;
    }

    /* renamed from: Q */
    public final double m34884Q() {
        return this.f38807d;
    }

    /* renamed from: R */
    public final int m34885R() {
        return this.f38809f;
    }

    /* renamed from: S */
    public final int m34886S() {
        return this.f38811h;
    }

    /* renamed from: T */
    public final C5754d m34887T() {
        return this.f38810g;
    }

    /* renamed from: U */
    public final C5824z m34888U() {
        return this.f38812i;
    }

    /* renamed from: V */
    public final boolean m34889V() {
        return this.f38808e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8021e)) {
            return false;
        }
        C8021e c8021e = (C8021e) obj;
        if (this.f38807d != c8021e.f38807d || this.f38808e != c8021e.f38808e || this.f38809f != c8021e.f38809f || !C8013a.m34870k(this.f38810g, c8021e.f38810g) || this.f38811h != c8021e.f38811h) {
            return false;
        }
        C5824z c5824z = this.f38812i;
        return C8013a.m34870k(c5824z, c5824z) && this.f38813j == c8021e.f38813j;
    }

    public final int hashCode() {
        return C9932n.m41833c(Double.valueOf(this.f38807d), Boolean.valueOf(this.f38808e), Integer.valueOf(this.f38809f), this.f38810g, Integer.valueOf(this.f38811h), this.f38812i, Double.valueOf(this.f38813j));
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f38807d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42524g(parcel, 2, this.f38807d);
        C10127c.m42520c(parcel, 3, this.f38808e);
        C10127c.m42529l(parcel, 4, this.f38809f);
        C10127c.m42535r(parcel, 5, this.f38810g, i10, false);
        C10127c.m42529l(parcel, 6, this.f38811h);
        C10127c.m42535r(parcel, 7, this.f38812i, i10, false);
        C10127c.m42524g(parcel, 8, this.f38813j);
        C10127c.m42519b(parcel, m42518a);
    }
}
