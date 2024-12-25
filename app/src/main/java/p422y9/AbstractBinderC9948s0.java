package p422y9;

import android.os.IBinder;
import android.os.IInterface;
import p245oa.BinderC6955b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/s0.class
 */
/* renamed from: y9.s0 */
/* loaded from: combined.jar:classes2.jar:y9/s0.class */
public abstract class AbstractBinderC9948s0 extends BinderC6955b implements InterfaceC9951t0 {
    /* renamed from: y0 */
    public static InterfaceC9951t0 m41880y0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof InterfaceC9951t0 ? (InterfaceC9951t0) queryLocalInterface : new C9945r0(iBinder);
    }
}
