package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/u.class
 */
/* renamed from: ua.u */
/* loaded from: combined.jar:classes2.jar:ua/u.class */
public final class C9080u implements Parcelable.Creator<C9068t> {
    /* renamed from: a */
    public static void m38243a(C9068t c9068t, Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42536s(parcel, 2, c9068t.f41627d, false);
        C10127c.m42535r(parcel, 3, c9068t.f41628e, i10, false);
        C10127c.m42536s(parcel, 4, c9068t.f41629f, false);
        C10127c.m42532o(parcel, 5, c9068t.f41630g);
        C10127c.m42519b(parcel, m42518a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9068t createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        C9044r c9044r = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                str = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l == 3) {
                c9044r = (C9044r) C10126b.m42495e(parcel, m42509s, C9044r.CREATOR);
            } else if (m42502l == 4) {
                str2 = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l != 5) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                j10 = C10126b.m42513w(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9068t(str, c9044r, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9068t[] newArray(int i10) {
        return new C9068t[i10];
    }
}
