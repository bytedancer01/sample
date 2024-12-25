package p304r9;

import android.os.Parcel;
import android.os.Parcelable;
import p200l9.C5754d;
import p200l9.C5824z;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/f.class
 */
/* renamed from: r9.f */
/* loaded from: combined.jar:classes2.jar:r9/f.class */
public final class C8023f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        C5754d c5754d = null;
        C5824z c5824z = null;
        double d10 = 0.0d;
        double d11 = 0.0d;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    d10 = C10126b.m42505o(parcel, m42509s);
                    break;
                case 3:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 4:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 5:
                    c5754d = (C5754d) C10126b.m42495e(parcel, m42509s, C5754d.CREATOR);
                    break;
                case 6:
                    i11 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 7:
                    c5824z = (C5824z) C10126b.m42495e(parcel, m42509s, C5824z.CREATOR);
                    break;
                case 8:
                    d11 = C10126b.m42505o(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8021e(d10, z10, i10, c5754d, i11, c5824z, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8021e[i10];
    }
}
