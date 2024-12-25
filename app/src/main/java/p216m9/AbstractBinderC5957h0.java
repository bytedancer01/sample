package p216m9;

import android.os.IBinder;
import android.os.IInterface;
import ma.BinderC6485x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/h0.class
 */
/* renamed from: m9.h0 */
/* loaded from: combined.jar:classes2.jar:m9/h0.class */
public abstract class AbstractBinderC5957h0 extends BinderC6485x implements InterfaceC5960i0 {
    /* renamed from: y0 */
    public static InterfaceC5960i0 m29308y0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
        return queryLocalInterface instanceof InterfaceC5960i0 ? (InterfaceC5960i0) queryLocalInterface : new C5954g0(iBinder);
    }
}
