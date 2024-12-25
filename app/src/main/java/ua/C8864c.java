package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/c.class
 */
/* renamed from: ua.c */
/* loaded from: combined.jar:classes2.jar:ua/c.class */
public final class C8864c implements Parcelable.Creator<C8852b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8852b createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        C8851aa c8851aa = null;
        String str3 = null;
        C9068t c9068t = null;
        C9068t c9068t2 = null;
        C9068t c9068t3 = null;
        boolean z10 = false;
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
                    c8851aa = (C8851aa) C10126b.m42495e(parcel, m42509s, C8851aa.CREATOR);
                    break;
                case 5:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 6:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 7:
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 8:
                    c9068t = (C9068t) C10126b.m42495e(parcel, m42509s, C9068t.CREATOR);
                    break;
                case 9:
                    j11 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 10:
                    c9068t2 = (C9068t) C10126b.m42495e(parcel, m42509s, C9068t.CREATOR);
                    break;
                case 11:
                    j12 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 12:
                    c9068t3 = (C9068t) C10126b.m42495e(parcel, m42509s, C9068t.CREATOR);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8852b(str, str2, c8851aa, j10, z10, str3, c9068t, j11, c9068t2, j12, c9068t3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8852b[] newArray(int i10) {
        return new C8852b[i10];
    }
}
