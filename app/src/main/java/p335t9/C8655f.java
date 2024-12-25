package p335t9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/f.class
 */
/* renamed from: t9.f */
/* loaded from: combined.jar:classes2.jar:t9/f.class */
public final class C8655f implements Parcelable.Creator<C8646a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8646a createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            if (C10126b.m42502l(m42509s) != 1) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                intent = (Intent) C10126b.m42495e(parcel, m42509s, Intent.CREATOR);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8646a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8646a[] newArray(int i10) {
        return new C8646a[i10];
    }
}
