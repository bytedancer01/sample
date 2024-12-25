package p422y9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p350u9.C8804b;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/n0.class
 */
/* renamed from: y9.n0 */
/* loaded from: combined.jar:classes2.jar:y9/n0.class */
public final class C9933n0 implements Parcelable.Creator<C9930m0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9930m0 createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        IBinder iBinder = null;
        C8804b c8804b = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 2) {
                iBinder = C10126b.m42510t(parcel, m42509s);
            } else if (m42502l == 3) {
                c8804b = (C8804b) C10126b.m42495e(parcel, m42509s, C8804b.CREATOR);
            } else if (m42502l == 4) {
                z10 = C10126b.m42503m(parcel, m42509s);
            } else if (m42502l != 5) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                z11 = C10126b.m42503m(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9930m0(i10, iBinder, c8804b, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9930m0[] newArray(int i10) {
        return new C9930m0[i10];
    }
}
