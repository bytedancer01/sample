package p422y9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/w0.class
 */
/* renamed from: y9.w0 */
/* loaded from: combined.jar:classes2.jar:y9/w0.class */
public final class C9959w0 implements Parcelable.Creator<C9941q> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9941q createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 2) {
                z10 = C10126b.m42503m(parcel, m42509s);
            } else if (m42502l == 3) {
                z11 = C10126b.m42503m(parcel, m42509s);
            } else if (m42502l == 4) {
                i11 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 5) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                i12 = C10126b.m42511u(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9941q(i10, z10, z11, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9941q[] newArray(int i10) {
        return new C9941q[i10];
    }
}
