package p216m9;

import android.os.IBinder;
import android.os.IInterface;
import ma.BinderC6485x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/e0.class
 */
/* renamed from: m9.e0 */
/* loaded from: combined.jar:classes2.jar:m9/e0.class */
public abstract class AbstractBinderC5948e0 extends BinderC6485x implements InterfaceC5951f0 {
    /* renamed from: y0 */
    public static InterfaceC5951f0 m29294y0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
        return queryLocalInterface instanceof InterfaceC5951f0 ? (InterfaceC5951f0) queryLocalInterface : new C5945d0(iBinder);
    }
}
