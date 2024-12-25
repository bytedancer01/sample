package p403xa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/c.class
 */
/* renamed from: xa.c */
/* loaded from: combined.jar:classes2.jar:xa/c.class */
public final class C9695c implements Parcelable.Creator<C9694b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9694b createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 2) {
                i11 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 3) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                intent = (Intent) C10126b.m42495e(parcel, m42509s, Intent.CREATOR);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9694b(i10, i11, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9694b[] newArray(int i10) {
        return new C9694b[i10];
    }
}
