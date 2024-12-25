package p350u9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/q.class
 */
/* renamed from: u9.q */
/* loaded from: combined.jar:classes2.jar:u9/q.class */
public final class C8830q implements Parcelable.Creator<C8804b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8804b createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 2) {
                i11 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 3) {
                pendingIntent = (PendingIntent) C10126b.m42495e(parcel, m42509s, PendingIntent.CREATOR);
            } else if (m42502l != 4) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                str = C10126b.m42496f(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8804b(i10, i11, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8804b[] newArray(int i10) {
        return new C8804b[i10];
    }
}
