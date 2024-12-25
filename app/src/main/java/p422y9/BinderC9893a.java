package p422y9;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import p422y9.InterfaceC9917i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/a.class
 */
/* renamed from: y9.a */
/* loaded from: combined.jar:classes2.jar:y9/a.class */
public class BinderC9893a extends InterfaceC9917i.a {
    /* renamed from: U0 */
    public static Account m41751U0(InterfaceC9917i interfaceC9917i) {
        Account account;
        Account account2 = null;
        if (interfaceC9917i != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC9917i.mo41803k();
                } catch (RemoteException e10) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                    account = null;
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
                account2 = account;
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th2;
            }
        }
        return account2;
    }
}
