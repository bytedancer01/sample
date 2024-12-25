package p350u9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/i0.class
 */
/* renamed from: u9.i0 */
/* loaded from: combined.jar:classes2.jar:u9/i0.class */
public final class C8819i0 implements Parcelable.Creator<C8817h0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8817h0 createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        boolean z10 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z11 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                str = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l == 2) {
                iBinder = C10126b.m42510t(parcel, m42509s);
            } else if (m42502l == 3) {
                z10 = C10126b.m42503m(parcel, m42509s);
            } else if (m42502l != 4) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                z11 = C10126b.m42503m(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8817h0(str, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8817h0[] newArray(int i10) {
        return new C8817h0[i10];
    }
}
