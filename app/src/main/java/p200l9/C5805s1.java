package p200l9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p402x9.C9691a;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/s1.class
 */
/* renamed from: l9.s1 */
/* loaded from: combined.jar:classes2.jar:l9/s1.class */
public final class C5805s1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
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
                    arrayList = C10126b.m42500j(parcel, m42509s, C9691a.CREATOR);
                    break;
                case 5:
                    arrayList2 = C10126b.m42498h(parcel, m42509s);
                    break;
                case 6:
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 7:
                    uri = (Uri) C10126b.m42495e(parcel, m42509s, Uri.CREATOR);
                    break;
                case 8:
                    str4 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 9:
                    str5 = C10126b.m42496f(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5754d(str, str2, arrayList, arrayList2, str3, uri, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5754d[i10];
    }
}
