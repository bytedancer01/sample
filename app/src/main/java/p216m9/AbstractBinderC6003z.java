package p216m9;

import android.os.IBinder;
import android.os.IInterface;
import ma.BinderC6485x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/z.class
 */
/* renamed from: m9.z */
/* loaded from: combined.jar:classes2.jar:m9/z.class */
public abstract class AbstractBinderC6003z extends BinderC6485x implements InterfaceC5936a0 {
    /* renamed from: y0 */
    public static InterfaceC5936a0 m29370y0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
        return queryLocalInterface instanceof InterfaceC5936a0 ? (InterfaceC5936a0) queryLocalInterface : new C6001y(iBinder);
    }
}
