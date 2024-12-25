package p422y9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/m.class
 */
/* renamed from: y9.m */
/* loaded from: combined.jar:classes2.jar:y9/m.class */
public class C9929m extends AbstractC10125a {
    public static final Parcelable.Creator<C9929m> CREATOR = new C9921j0();

    /* renamed from: d */
    public final int f45600d;

    /* renamed from: e */
    public final int f45601e;

    /* renamed from: f */
    public final int f45602f;

    /* renamed from: g */
    public final long f45603g;

    /* renamed from: h */
    public final long f45604h;

    /* renamed from: i */
    public final String f45605i;

    /* renamed from: j */
    public final String f45606j;

    /* renamed from: k */
    public final int f45607k;

    /* renamed from: l */
    public final int f45608l;

    public C9929m(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f45600d = i10;
        this.f45601e = i11;
        this.f45602f = i12;
        this.f45603g = j10;
        this.f45604h = j11;
        this.f45605i = str;
        this.f45606j = str2;
        this.f45607k = i13;
        this.f45608l = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, this.f45600d);
        C10127c.m42529l(parcel, 2, this.f45601e);
        C10127c.m42529l(parcel, 3, this.f45602f);
        C10127c.m42532o(parcel, 4, this.f45603g);
        C10127c.m42532o(parcel, 5, this.f45604h);
        C10127c.m42536s(parcel, 6, this.f45605i, false);
        C10127c.m42536s(parcel, 7, this.f45606j, false);
        C10127c.m42529l(parcel, 8, this.f45607k);
        C10127c.m42529l(parcel, 9, this.f45608l);
        C10127c.m42519b(parcel, m42518a);
    }
}
