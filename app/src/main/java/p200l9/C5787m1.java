package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/m1.class
 */
/* renamed from: l9.m1 */
/* loaded from: combined.jar:classes2.jar:l9/m1.class */
public final class C5787m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C5785m c5785m = null;
        ArrayList arrayList = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
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
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 5:
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 6:
                    c5785m = (C5785m) C10126b.m42495e(parcel, m42509s, C5785m.CREATOR);
                    break;
                case 7:
                    i11 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 8:
                    arrayList = C10126b.m42500j(parcel, m42509s, C5791o.CREATOR);
                    break;
                case 9:
                    i12 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 10:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 11:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5788n(str, str2, i10, str3, c5785m, i11, arrayList, i12, j10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5788n[i10];
    }
}
