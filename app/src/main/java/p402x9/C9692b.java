package p402x9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x9/b.class
 */
/* renamed from: x9.b */
/* loaded from: combined.jar:classes2.jar:x9/b.class */
public final class C9692b implements Parcelable.Creator<C9691a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9691a createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        int i10 = 0;
        Uri uri = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 2) {
                uri = (Uri) C10126b.m42495e(parcel, m42509s, Uri.CREATOR);
            } else if (m42502l == 3) {
                i11 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 4) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                i12 = C10126b.m42511u(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9691a(i10, uri, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9691a[] newArray(int i10) {
        return new C9691a[i10];
    }
}
