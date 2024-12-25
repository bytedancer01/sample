package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/y.class
 */
/* renamed from: l9.y */
/* loaded from: combined.jar:classes2.jar:l9/y.class */
public final class C5821y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                f10 = C10126b.m42507q(parcel, m42509s);
            } else if (m42502l == 3) {
                f11 = C10126b.m42507q(parcel, m42509s);
            } else if (m42502l != 4) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                f12 = C10126b.m42507q(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5818x(f10, f11, f12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5818x[i10];
    }
}
