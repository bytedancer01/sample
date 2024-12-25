package p350u9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/g0.class
 */
/* renamed from: u9.g0 */
/* loaded from: combined.jar:classes2.jar:u9/g0.class */
public final class C8815g0 implements Parcelable.Creator<C8813f0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8813f0 createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        boolean z10 = false;
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                z10 = C10126b.m42503m(parcel, m42509s);
            } else if (m42502l == 2) {
                str = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l != 3) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                i10 = C10126b.m42511u(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8813f0(z10, str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8813f0[] newArray(int i10) {
        return new C8813f0[i10];
    }
}
