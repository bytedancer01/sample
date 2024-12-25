package p245oa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oa/a.class
 */
/* renamed from: oa.a */
/* loaded from: combined.jar:classes2.jar:oa/a.class */
public class C6954a implements IInterface {

    /* renamed from: b */
    public final IBinder f35929b;

    /* renamed from: c */
    public final String f35930c;

    public C6954a(IBinder iBinder, String str) {
        this.f35929b = iBinder;
        this.f35930c = str;
    }

    /* renamed from: Z */
    public final Parcel m31947Z(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f35929b.transact(i10, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f35929b;
    }

    /* renamed from: y0 */
    public final Parcel m31948y0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f35930c);
        return obtain;
    }
}
