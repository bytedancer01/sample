package p147i9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i9/a.class
 */
/* renamed from: i9.a */
/* loaded from: combined.jar:classes2.jar:i9/a.class */
public final class C5211a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 1:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
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
                    uri = (Uri) C10126b.m42495e(parcel, m42509s, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 8:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 9:
                    str6 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 10:
                    arrayList = C10126b.m42500j(parcel, m42509s, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C10126b.m42496f(parcel, m42509s);
                    break;
                case 12:
                    str8 = C10126b.m42496f(parcel, m42509s);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
