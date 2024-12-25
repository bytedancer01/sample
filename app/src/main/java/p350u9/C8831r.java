package p350u9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/r.class
 */
/* renamed from: u9.r */
/* loaded from: combined.jar:classes2.jar:u9/r.class */
public final class C8831r implements Parcelable.Creator<C8808d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8808d createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                str = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l == 2) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 3) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                j10 = C10126b.m42513w(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8808d(str, i10, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8808d[] newArray(int i10) {
        return new C8808d[i10];
    }
}
