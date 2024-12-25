package p216m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p200l9.C5770h;
import p230n9.C6698a;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/a1.class
 */
/* renamed from: m9.a1 */
/* loaded from: combined.jar:classes2.jar:m9/a1.class */
public final class C5937a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        C5770h c5770h = null;
        C6698a c6698a = null;
        ArrayList<String> arrayList2 = null;
        double d10 = 0.0d;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i10 = 0;
        boolean z17 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 3:
                    arrayList = C10126b.m42498h(parcel, m42509s);
                    break;
                case 4:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 5:
                    c5770h = (C5770h) C10126b.m42495e(parcel, m42509s, C5770h.CREATOR);
                    break;
                case 6:
                    z11 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 7:
                    c6698a = (C6698a) C10126b.m42495e(parcel, m42509s, C6698a.CREATOR);
                    break;
                case 8:
                    z12 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 9:
                    d10 = C10126b.m42505o(parcel, m42509s);
                    break;
                case 10:
                    z13 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 11:
                    z14 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 12:
                    z15 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 13:
                    arrayList2 = C10126b.m42498h(parcel, m42509s);
                    break;
                case 14:
                    z16 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 15:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 16:
                    z17 = C10126b.m42503m(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5941c(str, arrayList, z10, c5770h, z11, c6698a, z12, d10, z13, z14, z15, arrayList2, z16, i10, z17);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5941c[i10];
    }
}
