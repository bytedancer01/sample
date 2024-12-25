package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/z0.class
 */
/* renamed from: l9.z0 */
/* loaded from: combined.jar:classes2.jar:l9/z0.class */
public final class C5825z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        boolean z10 = false;
        String str = null;
        C5766g c5766g = null;
        boolean z11 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                z10 = C10126b.m42503m(parcel, m42509s);
            } else if (m42502l == 3) {
                str = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l == 4) {
                z11 = C10126b.m42503m(parcel, m42509s);
            } else if (m42502l != 5) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                c5766g = (C5766g) C10126b.m42495e(parcel, m42509s, C5766g.CREATOR);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5770h(z10, str, z11, c5766g);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5770h[i10];
    }
}
