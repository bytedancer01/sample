package p422y9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/j0.class
 */
/* renamed from: y9.j0 */
/* loaded from: combined.jar:classes2.jar:y9/j0.class */
public final class C9921j0 implements Parcelable.Creator<C9929m> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9929m createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 1:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 2:
                    i11 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 3:
                    i12 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 4:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 5:
                    j11 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 6:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 7:
                    str2 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 8:
                    i13 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 9:
                    i14 = C10126b.m42511u(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9929m(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9929m[] newArray(int i10) {
        return new C9929m[i10];
    }
}
