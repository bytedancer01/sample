package p422y9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import p245oa.BinderC6955b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/i.class
 */
/* renamed from: y9.i */
/* loaded from: combined.jar:classes2.jar:y9/i.class */
public interface InterfaceC9917i extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y9/i$a.class
     */
    /* renamed from: y9.i$a */
    /* loaded from: combined.jar:classes2.jar:y9/i$a.class */
    public static abstract class a extends BinderC6955b implements InterfaceC9917i {
        /* renamed from: y0 */
        public static InterfaceC9917i m41804y0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC9917i ? (InterfaceC9917i) queryLocalInterface : new C9946r1(iBinder);
        }
    }

    /* renamed from: k */
    Account mo41803k();
}
