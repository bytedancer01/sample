package la;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:la/b.class
 */
/* renamed from: la.b */
/* loaded from: combined.jar:classes2.jar:la/b.class */
public class BinderC5828b extends Binder implements IInterface {
    public BinderC5828b(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo28413y0(i10, parcel, parcel2, i11);
    }

    /* renamed from: y0 */
    public boolean mo28413y0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
