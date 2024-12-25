package p185ka;

import android.os.IBinder;
import android.os.IInterface;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ka/e.class
 */
/* renamed from: ka.e */
/* loaded from: combined.jar:classes2.jar:ka/e.class */
public abstract class AbstractBinderC5539e extends BinderC5536b implements InterfaceC5540f {
    /* renamed from: Z */
    public static InterfaceC5540f m27527Z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof InterfaceC5540f ? (InterfaceC5540f) queryLocalInterface : new C5538d(iBinder);
    }
}
