package ua;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/s.class
 */
/* renamed from: ua.s */
/* loaded from: combined.jar:classes2.jar:ua/s.class */
public final class C9056s implements Parcelable.Creator<C9044r> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9044r createFromParcel(Parcel parcel) {
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
        return new C9044r(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9044r[] newArray(int i10) {
        return new C9044r[i10];
    }
}
