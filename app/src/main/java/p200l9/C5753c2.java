package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import p304r9.C8052t0;
import p402x9.C9691a;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/c2.class
 */
/* renamed from: l9.c2 */
/* loaded from: combined.jar:classes2.jar:l9/c2.class */
public final class C5753c2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        C8052t0 c8052t0 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
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
                    str3 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 5:
                    str4 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 6:
                    str5 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 7:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 8:
                    arrayList = C10126b.m42500j(parcel, m42509s, C9691a.CREATOR);
                    break;
                case 9:
                    i11 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 10:
                    i12 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 11:
                    str6 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 12:
                    str7 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 13:
                    i13 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 14:
                    str8 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 15:
                    bArr = C10126b.m42492b(parcel, m42509s);
                    break;
                case 16:
                    str9 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 17:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 18:
                    c8052t0 = (C8052t0) C10126b.m42495e(parcel, m42509s, C8052t0.CREATOR);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new CastDevice(str, str2, str3, str4, str5, i10, arrayList, i11, i12, str6, str7, i13, str8, bArr, str9, z10, c8052t0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CastDevice[i10];
    }
}
