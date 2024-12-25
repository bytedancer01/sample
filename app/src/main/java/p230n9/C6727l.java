package p230n9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/l.class
 */
/* renamed from: n9.l */
/* loaded from: combined.jar:classes2.jar:n9/l.class */
public final class C6727l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    arrayList = C10126b.m42498h(parcel, m42509s);
                    break;
                case 3:
                    iArr = C10126b.m42493c(parcel, m42509s);
                    break;
                case 4:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 5:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 6:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 7:
                    i11 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 8:
                    i12 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 9:
                    i13 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 10:
                    i14 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 11:
                    i15 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 12:
                    i16 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 13:
                    i17 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 14:
                    i18 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 15:
                    i19 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 16:
                    i20 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 17:
                    i21 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 18:
                    i22 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 19:
                    i23 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 20:
                    i24 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 21:
                    i25 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 22:
                    i26 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 23:
                    i27 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 24:
                    i28 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 25:
                    i29 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 26:
                    i30 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 27:
                    i31 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 28:
                    i32 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 29:
                    i33 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 30:
                    i34 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 31:
                    i35 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 32:
                    i36 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 33:
                    iBinder = C10126b.m42510t(parcel, m42509s);
                    break;
                case 34:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 35:
                    z11 = C10126b.m42503m(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C6719h(arrayList, iArr, j10, str, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6719h[i10];
    }
}
