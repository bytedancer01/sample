package p422y9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p245oa.C6954a;
import p245oa.C6956c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/r1.class
 */
/* renamed from: y9.r1 */
/* loaded from: combined.jar:classes2.jar:y9/r1.class */
public final class C9946r1 extends C6954a implements InterfaceC9917i {
    public C9946r1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p422y9.InterfaceC9917i
    /* renamed from: k */
    public final Account mo41803k() {
        Parcel m31947Z = m31947Z(2, m31948y0());
        Account account = (Account) C6956c.m31950a(m31947Z, Account.CREATOR);
        m31947Z.recycle();
        return account;
    }
}
