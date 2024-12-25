package p422y9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p350u9.C8808d;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/g1.class
 */
/* renamed from: y9.g1 */
/* loaded from: combined.jar:classes2.jar:y9/g1.class */
public final class C9913g1 implements Parcelable.Creator<C9910f1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9910f1 createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        Bundle bundle = null;
        C8808d[] c8808dArr = null;
        C9905e c9905e = null;
        int i10 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                bundle = C10126b.m42491a(parcel, m42509s);
            } else if (m42502l == 2) {
                c8808dArr = (C8808d[]) C10126b.m42499i(parcel, m42509s, C8808d.CREATOR);
            } else if (m42502l == 3) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 4) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                c9905e = (C9905e) C10126b.m42495e(parcel, m42509s, C9905e.CREATOR);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9910f1(bundle, c8808dArr, i10, c9905e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9910f1[] newArray(int i10) {
        return new C9910f1[i10];
    }
}
