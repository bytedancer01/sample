package p244o9;

import android.os.IBinder;
import android.os.IInterface;
import ma.BinderC6485x;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/h.class
 */
/* renamed from: o9.h */
/* loaded from: combined.jar:classes2.jar:o9/h.class */
public abstract class AbstractBinderC6938h extends BinderC6485x implements InterfaceC6939i {
    /* renamed from: y0 */
    public static InterfaceC6939i m31908y0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
        return queryLocalInterface instanceof InterfaceC6939i ? (InterfaceC6939i) queryLocalInterface : new C6937g(iBinder);
    }
}
