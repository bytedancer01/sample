package ua;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/ka.class
 */
/* renamed from: ua.ka */
/* loaded from: combined.jar:classes2.jar:ua/ka.class */
public final class C8971ka implements Parcelable.Creator<C8959ja> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8959ja createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j15 = -2147483648L;
        boolean z10 = true;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = true;
        boolean z13 = false;
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
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 5:
                    str4 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 6:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 7:
                    j11 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 8:
                    str5 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 9:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 10:
                    z11 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 11:
                    j15 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 12:
                    str6 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 13:
                    j12 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 14:
                    j13 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 15:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 16:
                    z12 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 17:
                case 20:
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
                case 18:
                    z13 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 19:
                    str7 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 21:
                    bool = C10126b.m42504n(parcel, m42509s);
                    break;
                case 22:
                    j14 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 23:
                    arrayList = C10126b.m42498h(parcel, m42509s);
                    break;
                case 24:
                    str8 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 25:
                    str9 = C10126b.m42496f(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C8959ja(str, str2, str3, str4, j10, j11, str5, z10, z11, j15, str6, j12, j13, i10, z12, z13, str7, bool, j14, arrayList, str8, str9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C8959ja[] newArray(int i10) {
        return new C8959ja[i10];
    }
}
