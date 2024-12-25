package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/u1.class
 */
/* renamed from: l9.u1 */
/* loaded from: combined.jar:classes2.jar:l9/u1.class */
public final class C5811u1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    f10 = C10126b.m42507q(parcel, m42509s);
                    break;
                case 3:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 4:
                    i11 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 5:
                    i12 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 6:
                    i13 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 7:
                    i14 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 8:
                    i15 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 9:
                    i16 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 10:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 11:
                    i17 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 12:
                    i18 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 13:
                    str2 = C10126b.m42496f(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5803s(f10, i10, i11, i12, i13, i14, i15, i16, str, i17, i18, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5803s[i10];
    }
}
