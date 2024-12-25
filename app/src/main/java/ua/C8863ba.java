package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/ba.class
 */
/* renamed from: ua.ba */
/* loaded from: combined.jar:classes2.jar:ua/ba.class */
public final class C8863ba implements Parcelable.Creator<C8851aa> {
    /* renamed from: a */
    public static void m37752a(C8851aa c8851aa, Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, c8851aa.f40905d);
        C10127c.m42536s(parcel, 2, c8851aa.f40906e, false);
        C10127c.m42532o(parcel, 3, c8851aa.f40907f);
        C10127c.m42534q(parcel, 4, c8851aa.f40908g, false);
        C10127c.m42527j(parcel, 5, null, false);
        C10127c.m42536s(parcel, 6, c8851aa.f40909h, false);
        C10127c.m42536s(parcel, 7, c8851aa.f40910i, false);
        C10127c.m42525h(parcel, 8, c8851aa.f40911j, false);
        C10127c.m42519b(parcel, m42518a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8851aa createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 1:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 2:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 3:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 4:
                    l10 = C10126b.m42514x(parcel, m42509s);
                    break;
                case 5:
                    f10 = C10126b.m42508r(parcel, m42509s);
                    break;
                case 6:
                    str2 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 7:
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 8:
                    d10 = C10126b.m42506p(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8851aa(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8851aa[] newArray(int i10) {
        return new C8851aa[i10];
    }
}
