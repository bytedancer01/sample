package p350u9;

import android.os.Parcel;
import android.os.Parcelable;
import org.apache.http.cookie.ClientCookie;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/d.class
 */
/* renamed from: u9.d */
/* loaded from: combined.jar:classes2.jar:u9/d.class */
public class C8808d extends AbstractC10125a {
    public static final Parcelable.Creator<C8808d> CREATOR = new C8831r();

    /* renamed from: d */
    public final String f40838d;

    /* renamed from: e */
    @Deprecated
    public final int f40839e;

    /* renamed from: f */
    public final long f40840f;

    public C8808d(String str, int i10, long j10) {
        this.f40838d = str;
        this.f40839e = i10;
        this.f40840f = j10;
    }

    public C8808d(String str, long j10) {
        this.f40838d = str;
        this.f40840f = j10;
        this.f40839e = -1;
    }

    /* renamed from: P */
    public long m37672P() {
        long j10 = this.f40840f;
        long j11 = j10;
        if (j10 == -1) {
            j11 = this.f40839e;
        }
        return j11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8808d)) {
            return false;
        }
        C8808d c8808d = (C8808d) obj;
        return ((getName() != null && getName().equals(c8808d.getName())) || (getName() == null && c8808d.getName() == null)) && m37672P() == c8808d.m37672P();
    }

    public String getName() {
        return this.f40838d;
    }

    public final int hashCode() {
        return C9932n.m41833c(getName(), Long.valueOf(m37672P()));
    }

    public final String toString() {
        C9932n.a m41834d = C9932n.m41834d(this);
        m41834d.m41835a("name", getName());
        m41834d.m41835a(ClientCookie.VERSION_ATTR, Long.valueOf(m37672P()));
        return m41834d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 1, getName(), false);
        C10127c.m42529l(parcel, 2, this.f40839e);
        C10127c.m42532o(parcel, 3, m37672P());
        C10127c.m42519b(parcel, m42518a);
    }
}
