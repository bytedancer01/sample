package p368v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v9/o.class
 */
/* renamed from: v9.o */
/* loaded from: combined.jar:classes2.jar:v9/o.class */
public final class C9329o implements Parcelable.Creator<Scope> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Scope createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 2) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                str = C10126b.m42496f(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new Scope(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i10) {
        return new Scope[i10];
    }
}
