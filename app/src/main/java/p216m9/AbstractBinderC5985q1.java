package p216m9;

import android.os.IBinder;
import android.os.IInterface;
import ma.BinderC6485x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/q1.class
 */
/* renamed from: m9.q1 */
/* loaded from: combined.jar:classes2.jar:m9/q1.class */
public abstract class AbstractBinderC5985q1 extends BinderC6485x implements InterfaceC5988r1 {
    /* renamed from: y0 */
    public static InterfaceC5988r1 m29346y0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
        return queryLocalInterface instanceof InterfaceC5988r1 ? (InterfaceC5988r1) queryLocalInterface : new C5982p1(iBinder);
    }
}
