package p422y9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/l0.class
 */
/* renamed from: y9.l0 */
/* loaded from: combined.jar:classes2.jar:y9/l0.class */
public final class C9927l0 implements Parcelable.Creator<C9924k0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C9924k0 createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            int m42502l = C10126b.m42502l(m42509s);
            if (m42502l == 1) {
                i10 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l == 2) {
                account = (Account) C10126b.m42495e(parcel, m42509s, Account.CREATOR);
            } else if (m42502l == 3) {
                i11 = C10126b.m42511u(parcel, m42509s);
            } else if (m42502l != 4) {
                C10126b.m42516z(parcel, m42509s);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C10126b.m42495e(parcel, m42509s, GoogleSignInAccount.CREATOR);
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C9924k0(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C9924k0[] newArray(int i10) {
        return new C9924k0[i10];
    }
}
