package p304r9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/d.class
 */
/* renamed from: r9.d */
/* loaded from: combined.jar:classes2.jar:r9/d.class */
public final class C8019d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 3) {
                z10 = C10126b.m42503m(parcel, m42509s);
            } else if (m42502l != 4) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                z11 = C10126b.m42503m(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8052t0(i10, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8052t0[i10];
    }
}
