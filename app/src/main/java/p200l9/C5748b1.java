package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/b1.class
 */
/* renamed from: l9.b1 */
/* loaded from: combined.jar:classes2.jar:l9/b1.class */
public final class C5748b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        C5782l c5782l = null;
        ArrayList arrayList = null;
        C5803s c5803s = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        C5806t c5806t = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i10 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 3:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 4:
                    str2 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 5:
                    c5782l = (C5782l) C10126b.m42495e(parcel, m42509s, C5782l.CREATOR);
                    break;
                case 6:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 7:
                    arrayList = C10126b.m42500j(parcel, m42509s, MediaTrack.CREATOR);
                    break;
                case 8:
                    c5803s = (C5803s) C10126b.m42495e(parcel, m42509s, C5803s.CREATOR);
                    break;
                case 9:
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 10:
                    arrayList2 = C10126b.m42500j(parcel, m42509s, C5746b.CREATOR);
                    break;
                case 11:
                    arrayList3 = C10126b.m42500j(parcel, m42509s, C5742a.CREATOR);
                    break;
                case 12:
                    str4 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 13:
                    c5806t = (C5806t) C10126b.m42495e(parcel, m42509s, C5806t.CREATOR);
                    break;
                case 14:
                    j11 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 15:
                    str5 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 16:
                    str6 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 17:
                    str7 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 18:
                    str8 = C10126b.m42496f(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new MediaInfo(str, i10, str2, c5782l, j10, arrayList, c5803s, str3, arrayList2, arrayList3, str4, c5806t, j11, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MediaInfo[i10];
    }
}
