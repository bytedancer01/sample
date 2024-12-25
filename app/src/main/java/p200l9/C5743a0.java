package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/a0.class
 */
/* renamed from: l9.a0 */
/* loaded from: combined.jar:classes2.jar:l9/a0.class */
public final class C5743a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        C5818x c5818x = null;
        C5818x c5818x2 = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                c5818x = (C5818x) C10126b.m42495e(parcel, m42509s, C5818x.CREATOR);
            } else if (m42502l != 3) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                c5818x2 = (C5818x) C10126b.m42495e(parcel, m42509s, C5818x.CREATOR);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5824z(c5818x, c5818x2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5824z[i10];
    }
}
