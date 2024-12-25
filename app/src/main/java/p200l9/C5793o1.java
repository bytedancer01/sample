package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/o1.class
 */
/* renamed from: l9.o1 */
/* loaded from: combined.jar:classes2.jar:l9/o1.class */
public final class C5793o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    mediaInfo = (MediaInfo) C10126b.m42495e(parcel, m42509s, MediaInfo.CREATOR);
                    break;
                case 3:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 4:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 5:
                    d10 = C10126b.m42505o(parcel, m42509s);
                    break;
                case 6:
                    d11 = C10126b.m42505o(parcel, m42509s);
                    break;
                case 7:
                    d12 = C10126b.m42505o(parcel, m42509s);
                    break;
                case 8:
                    jArr = C10126b.m42494d(parcel, m42509s);
                    break;
                case 9:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5791o(mediaInfo, i10, z10, d10, d11, d12, jArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5791o[i10];
    }
}
