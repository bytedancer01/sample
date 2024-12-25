package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/g1.class
 */
/* renamed from: l9.g1 */
/* loaded from: combined.jar:classes2.jar:l9/g1.class */
public final class C5768g1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        long j10 = 0;
        long j11 = 0;
        MediaInfo mediaInfo = null;
        C5788n c5788n = null;
        Boolean bool = null;
        long[] jArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        double d10 = 0.0d;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    mediaInfo = (MediaInfo) C10126b.m42495e(parcel, m42509s, MediaInfo.CREATOR);
                    break;
                case 3:
                    c5788n = (C5788n) C10126b.m42495e(parcel, m42509s, C5788n.CREATOR);
                    break;
                case 4:
                    bool = C10126b.m42504n(parcel, m42509s);
                    break;
                case 5:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 6:
                    d10 = C10126b.m42505o(parcel, m42509s);
                    break;
                case 7:
                    jArr = C10126b.m42494d(parcel, m42509s);
                    break;
                case 8:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 9:
                    str2 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 10:
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 11:
                    str4 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 12:
                    str5 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 13:
                    j11 = C10126b.m42513w(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5779k(mediaInfo, c5788n, bool, j10, d10, jArr, str, str2, str3, str4, str5, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5779k[i10];
    }
}
