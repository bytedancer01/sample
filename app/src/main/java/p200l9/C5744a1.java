package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import p304r9.C8013a;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/a1.class
 */
/* renamed from: l9.a1 */
/* loaded from: combined.jar:classes2.jar:l9/a1.class */
public final class C5744a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        long j10 = 0;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 2) {
                str2 = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l == 3) {
                j10 = C10126b.m42513w(parcel, m42509s);
            } else if (m42502l == 4) {
                num = C10126b.m42512v(parcel, m42509s);
            } else if (m42502l == 5) {
                str3 = C10126b.m42496f(parcel, m42509s);
            } else if (m42502l != 6) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                str = C10126b.m42496f(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new MediaError(str2, j10, num, str3, C8013a.m34860a(str));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MediaError[i10];
    }
}
