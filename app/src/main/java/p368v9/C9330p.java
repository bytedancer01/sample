package p368v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p350u9.C8804b;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v9/p.class
 */
/* renamed from: v9.p */
/* loaded from: combined.jar:classes2.jar:v9/p.class */
public final class C9330p implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C8804b c8804b = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i11 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 2) {
                str = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l == 3) {
                pendingIntent = (PendingIntent) C10126b.m42495e(parcel, m42509s, PendingIntent.CREATOR);
            } else if (m42502l == 4) {
                c8804b = (C8804b) C10126b.m42495e(parcel, m42509s, C8804b.CREATOR);
            } else if (m42502l != 1000) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                i10 = C10126b.m42511u(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new Status(i10, i11, str, pendingIntent, c8804b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i10) {
        return new Status[i10];
    }
}
