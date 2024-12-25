package p245oa;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oa/b.class
 */
/* renamed from: oa.b */
/* loaded from: combined.jar:classes2.jar:oa/b.class */
public class BinderC6955b extends Binder implements IInterface {
    public BinderC6955b(String str) {
        attachInterface(this, str);
    }

    /* renamed from: Z */
    public boolean mo31949Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
        return false;
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
        return mo31949Z(i10, parcel, parcel2, i11);
    }
}
