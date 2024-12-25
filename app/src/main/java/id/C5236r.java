package id;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C2575e;
import p441z9.C10126b;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/r.class
 */
/* renamed from: id.r */
/* loaded from: combined.jar:classes2.jar:id/r.class */
public class C5236r implements Parcelable.Creator<C2575e> {
    /* renamed from: c */
    public static void m26112c(C2575e c2575e, Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42522e(parcel, 2, c2575e.f15810d, false);
        C10127c.m42519b(parcel, m42518a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2575e createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            if (C10126b.m42502l(m42509s) != 2) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                bundle = C10126b.m42491a(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C2575e(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2575e[] newArray(int i10) {
        return new C2575e[i10];
    }
}
