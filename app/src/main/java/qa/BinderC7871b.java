package qa;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qa/b.class
 */
/* renamed from: qa.b */
/* loaded from: combined.jar:classes2.jar:qa/b.class */
public class BinderC7871b extends Binder implements IInterface {
    public BinderC7871b(String str) {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    /* renamed from: Z */
    public boolean mo26065Z(int i10, Parcel parcel, Parcel parcel2, int i11) {
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
        return mo26065Z(i10, parcel, parcel2, i11);
    }
}
