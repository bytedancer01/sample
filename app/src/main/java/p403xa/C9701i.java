package p403xa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xa/i.class
 */
/* renamed from: xa.i */
/* loaded from: combined.jar:classes2.jar:xa/i.class */
public final class C9701i implements Parcelable.Creator<C9700h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9700h createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                arrayList = C10126b.m42498h(parcel, m42509s);
            } else if (m42502l != 2) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                str = C10126b.m42496f(parcel, m42509s);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9700h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9700h[] newArray(int i10) {
        return new C9700h[i10];
    }
}
