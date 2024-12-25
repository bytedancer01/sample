package p230n9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/f.class
 */
/* renamed from: n9.f */
/* loaded from: combined.jar:classes2.jar:n9/f.class */
public class C6713f extends AbstractC10125a {
    public static final Parcelable.Creator<C6713f> CREATOR = new C6718g1();

    /* renamed from: d */
    public final String f35096d;

    /* renamed from: e */
    public final int f35097e;

    /* renamed from: f */
    public final String f35098f;

    public C6713f(String str, int i10, String str2) {
        this.f35096d = str;
        this.f35097e = i10;
        this.f35098f = str2;
    }

    /* renamed from: P */
    public String m30912P() {
        return this.f35096d;
    }

    /* renamed from: Q */
    public String m30913Q() {
        return this.f35098f;
    }

    /* renamed from: R */
    public int m30914R() {
        return this.f35097e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, m30912P(), false);
        C10127c.m42529l(parcel, 3, m30914R());
        C10127c.m42536s(parcel, 4, m30913Q(), false);
        C10127c.m42519b(parcel, m42518a);
    }
}
