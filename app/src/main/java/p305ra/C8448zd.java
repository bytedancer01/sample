package p305ra;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/zd.class
 */
/* renamed from: ra.zd */
/* loaded from: combined.jar:classes2.jar:ra/zd.class */
public final class C8448zd implements Parcelable.Creator<C8433yd> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8433yd createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 1:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 2:
                    j11 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 3:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 4:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 5:
                    str2 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 6:
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 7:
                    bundle = C10126b.m42491a(parcel, m42509s);
                    break;
                case 8:
                    str4 = C10126b.m42496f(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8433yd(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8433yd[] newArray(int i10) {
        return new C8433yd[i10];
    }
}
