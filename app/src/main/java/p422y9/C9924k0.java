package p422y9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/k0.class
 */
/* renamed from: y9.k0 */
/* loaded from: combined.jar:classes2.jar:y9/k0.class */
public final class C9924k0 extends AbstractC10125a {
    public static final Parcelable.Creator<C9924k0> CREATOR = new C9927l0();

    /* renamed from: d */
    public final int f45589d;

    /* renamed from: e */
    public final Account f45590e;

    /* renamed from: f */
    public final int f45591f;

    /* renamed from: g */
    public final GoogleSignInAccount f45592g;

    public C9924k0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f45589d = i10;
        this.f45590e = account;
        this.f45591f = i11;
        this.f45592g = googleSignInAccount;
    }

    public C9924k0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, this.f45589d);
        C10127c.m42535r(parcel, 2, this.f45590e, i10, false);
        C10127c.m42529l(parcel, 3, this.f45591f);
        C10127c.m42535r(parcel, 4, this.f45592g, i10, false);
        C10127c.m42519b(parcel, m42518a);
    }
}
