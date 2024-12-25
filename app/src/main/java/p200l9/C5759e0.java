package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/e0.class
 */
/* renamed from: l9.e0 */
/* loaded from: combined.jar:classes2.jar:l9/e0.class */
public final class C5759e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String[] strArr = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 3:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 4:
                    j11 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 5:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 6:
                    strArr = C10126b.m42497g(parcel, m42509s);
                    break;
                case 7:
                    z11 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 8:
                    z12 = C10126b.m42503m(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5746b(j10, str, j11, z10, strArr, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5746b[i10];
    }
}
