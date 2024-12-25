package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import p304r9.C8013a;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/r1.class
 */
/* renamed from: l9.r1 */
/* loaded from: combined.jar:classes2.jar:l9/r1.class */
public final class C5802r1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 3:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 4:
                    str2 = C10126b.m42496f(parcel, m42509s);
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
                    i11 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 9:
                    arrayList = C10126b.m42498h(parcel, m42509s);
                    break;
                case 10:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new MediaTrack(j10, i10, str2, str3, str4, str5, i11, arrayList, C8013a.m34860a(str));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MediaTrack[i10];
    }
}
