package ma;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/x.class
 */
/* renamed from: ma.x */
/* loaded from: combined.jar:classes2.jar:ma/x.class */
public class BinderC6485x extends Binder implements IInterface {
    public BinderC6485x(String str) {
        attachInterface(this, str);
    }

    /* renamed from: Z */
    public boolean mo29315Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
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
        return mo29315Z(i10, parcel, parcel2, i11);
    }
}
