package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/c1.class
 */
/* renamed from: l9.c1 */
/* loaded from: combined.jar:classes2.jar:l9/c1.class */
public final class C5752c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                j10 = C10126b.m42513w(parcel, m42509s);
            } else if (m42502l == 3) {
                j11 = C10126b.m42513w(parcel, m42509s);
            } else if (m42502l == 4) {
                z10 = C10126b.m42503m(parcel, m42509s);
            } else if (m42502l != 5) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                z11 = C10126b.m42503m(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5773i(j10, j11, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5773i[i10];
    }
}
