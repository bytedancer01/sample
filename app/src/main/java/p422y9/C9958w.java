package p422y9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/w.class
 */
/* renamed from: y9.w */
/* loaded from: combined.jar:classes2.jar:y9/w.class */
public final class C9958w implements Parcelable.Creator<C9947s> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9947s createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 2) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                arrayList = C10126b.m42500j(parcel, m42509s, C9929m.CREATOR);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9947s(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9947s[] newArray(int i10) {
        return new C9947s[i10];
    }
}
