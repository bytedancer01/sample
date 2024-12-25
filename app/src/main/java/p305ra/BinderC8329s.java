package p305ra;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/s.class
 */
/* renamed from: ra.s */
/* loaded from: combined.jar:classes2.jar:ra/s.class */
public class BinderC8329s extends Binder implements IInterface {
    public BinderC8329s(String str) {
        attachInterface(this, str);
    }

    /* renamed from: Z */
    public boolean mo35777Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo35777Z(i10, parcel, parcel2, i11);
    }
}
