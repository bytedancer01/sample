package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/v.class
 */
/* renamed from: l9.v */
/* loaded from: combined.jar:classes2.jar:l9/v.class */
public final class C5812v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        C5806t c5806t = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 3:
                    str2 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 4:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 5:
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 6:
                    str4 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 7:
                    str5 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 8:
                    str6 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 9:
                    str7 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 10:
                    str8 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 11:
                    j11 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 12:
                    str9 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 13:
                    c5806t = (C5806t) C10126b.m42495e(parcel, m42509s, C5806t.CREATOR);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5742a(str, str2, j10, str3, str4, str5, str6, str7, str8, j11, str9, c5806t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5742a[i10];
    }
}
