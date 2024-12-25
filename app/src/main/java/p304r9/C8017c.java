package p304r9;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/c.class
 */
/* renamed from: r9.c */
/* loaded from: combined.jar:classes2.jar:r9/c.class */
public final class C8017c extends AbstractC10125a {
    public static final Parcelable.Creator<C8017c> CREATOR = new C8057y();

    /* renamed from: d */
    public final String f38804d;

    public C8017c() {
        this.f38804d = null;
    }

    public C8017c(String str) {
        this.f38804d = str;
    }

    /* renamed from: P */
    public final String m34882P() {
        return this.f38804d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8017c) {
            return C8013a.m34870k(this.f38804d, ((C8017c) obj).f38804d);
        }
        return false;
    }

    public final int hashCode() {
        return C9932n.m41833c(this.f38804d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, this.f38804d, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
