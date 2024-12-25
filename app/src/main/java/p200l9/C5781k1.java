package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p402x9.C9691a;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/k1.class
 */
/* renamed from: l9.k1 */
/* loaded from: combined.jar:classes2.jar:l9/k1.class */
public final class C5781k1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        double d10 = 0.0d;
        int i10 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 3) {
                str = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l == 4) {
                arrayList = C10126b.m42500j(parcel, m42509s, C5782l.CREATOR);
            } else if (m42502l == 5) {
                arrayList2 = C10126b.m42500j(parcel, m42509s, C9691a.CREATOR);
            } else if (m42502l != 6) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                d10 = C10126b.m42505o(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5785m(i10, str, arrayList, arrayList2, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5785m[i10];
    }
}
