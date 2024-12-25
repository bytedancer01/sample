package p230n9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/k.class
 */
/* renamed from: n9.k */
/* loaded from: combined.jar:classes2.jar:n9/k.class */
public final class C6725k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        C6719h c6719h = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 3:
                    str2 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 4:
                    iBinder = C10126b.m42510t(parcel, m42509s);
                    break;
                case 5:
                    c6719h = (C6719h) C10126b.m42495e(parcel, m42509s, C6719h.CREATOR);
                    break;
                case 6:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 7:
                    z11 = C10126b.m42503m(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C6698a(str, str2, iBinder, c6719h, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6698a[i10];
    }
}
