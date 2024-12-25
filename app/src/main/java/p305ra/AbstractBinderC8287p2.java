package p305ra;

import android.os.IBinder;
import android.os.IInterface;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/p2.class
 */
/* renamed from: ra.p2 */
/* loaded from: combined.jar:classes2.jar:ra/p2.class */
public abstract class AbstractBinderC8287p2 extends BinderC8329s implements InterfaceC8303q3 {
    /* renamed from: y0 */
    public static InterfaceC8303q3 m35681y0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof InterfaceC8303q3 ? (InterfaceC8303q3) queryLocalInterface : new C8271o1(iBinder);
    }
}
