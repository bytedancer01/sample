package p230n9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/y0.class
 */
/* renamed from: n9.y0 */
/* loaded from: combined.jar:classes2.jar:n9/y0.class */
public final class C6754y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 3) {
                i11 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 4) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                i12 = C10126b.m42511u(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C6701b(i10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6701b[i10];
    }
}
