package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/g.class
 */
/* renamed from: l9.g */
/* loaded from: combined.jar:classes2.jar:l9/g.class */
public class C5766g extends AbstractC10125a {
    public static final Parcelable.Creator<C5766g> CREATOR = new C5815w();

    /* renamed from: d */
    public final String f32234d;

    /* renamed from: e */
    public final String f32235e;

    public C5766g(String str, String str2) {
        this.f32234d = str;
        this.f32235e = str2;
    }

    /* renamed from: P */
    public String m28196P() {
        return this.f32234d;
    }

    /* renamed from: Q */
    public String m28197Q() {
        return this.f32235e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5766g)) {
            return false;
        }
        C5766g c5766g = (C5766g) obj;
        return C9932n.m41832b(this.f32234d, c5766g.f32234d) && C9932n.m41832b(this.f32235e, c5766g.f32235e);
    }

    public int hashCode() {
        return C9932n.m41833c(this.f32234d, this.f32235e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 1, m28196P(), false);
        C10127c.m42536s(parcel, 2, m28197Q(), false);
        C10127c.m42519b(parcel, m42518a);
    }
}
