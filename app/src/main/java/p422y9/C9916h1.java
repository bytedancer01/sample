package p422y9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/h1.class
 */
/* renamed from: y9.h1 */
/* loaded from: combined.jar:classes2.jar:y9/h1.class */
public final class C9916h1 implements Parcelable.Creator<C9905e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9905e createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        C9941q c9941q = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 1:
                    c9941q = (C9941q) C10126b.m42495e(parcel, m42509s, C9941q.CREATOR);
                    break;
                case 2:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 3:
                    z11 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 4:
                    iArr = C10126b.m42493c(parcel, m42509s);
                    break;
                case 5:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 6:
                    iArr2 = C10126b.m42493c(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9905e(c9941q, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9905e[] newArray(int i10) {
        return new C9905e[i10];
    }
}
