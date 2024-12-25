package p422y9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/q0.class
 */
/* renamed from: y9.q0 */
/* loaded from: combined.jar:classes2.jar:y9/q0.class */
public final class C9942q0 implements InterfaceC9926l {

    /* renamed from: b */
    public final IBinder f45637b;

    public C9942q0(IBinder iBinder) {
        this.f45637b = iBinder;
    }

    @Override // p422y9.InterfaceC9926l
    /* renamed from: J */
    public final void mo41826J(InterfaceC9923k interfaceC9923k, C9908f c9908f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC9923k != null ? interfaceC9923k.asBinder() : null);
            if (c9908f != null) {
                obtain.writeInt(1);
                C9919i1.m41808a(c9908f, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f45637b.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45637b;
    }
}
