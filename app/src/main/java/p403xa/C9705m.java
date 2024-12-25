package p403xa;

import android.os.Parcel;
import android.os.Parcelable;
import p350u9.C8804b;
import p422y9.C9930m0;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/m.class
 */
/* renamed from: xa.m */
/* loaded from: combined.jar:classes2.jar:xa/m.class */
public final class C9705m implements Parcelable.Creator<C9704l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9704l createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        C8804b c8804b = null;
        C9930m0 c9930m0 = null;
        int i10 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 2) {
                c8804b = (C8804b) C10126b.m42495e(parcel, m42509s, C8804b.CREATOR);
            } else if (m42502l != 3) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                c9930m0 = (C9930m0) C10126b.m42495e(parcel, m42509s, C9930m0.CREATOR);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9704l(i10, c8804b, c9930m0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9704l[] newArray(int i10) {
        return new C9704l[i10];
    }
}
