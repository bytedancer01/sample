package p403xa;

import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9924k0;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/k.class
 */
/* renamed from: xa.k */
/* loaded from: combined.jar:classes2.jar:xa/k.class */
public final class C9703k implements Parcelable.Creator<C9702j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9702j createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        int i10 = 0;
        C9924k0 c9924k0 = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 2) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                c9924k0 = (C9924k0) C10126b.m42495e(parcel, m42509s, C9924k0.CREATOR);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9702j(i10, c9924k0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9702j[] newArray(int i10) {
        return new C9702j[i10];
    }
}
