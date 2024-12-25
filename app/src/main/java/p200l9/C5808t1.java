package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p304r9.C8013a;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/t1.class
 */
/* renamed from: l9.t1 */
/* loaded from: combined.jar:classes2.jar:l9/t1.class */
public final class C5808t1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        C5779k c5779k = null;
        String str = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                c5779k = (C5779k) C10126b.m42495e(parcel, m42509s, C5779k.CREATOR);
            } else if (m42502l != 3) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                str = C10126b.m42496f(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5800r(c5779k, C8013a.m34860a(str));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5800r[i10];
    }
}
