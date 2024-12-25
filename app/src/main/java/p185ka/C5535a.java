package p185ka;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ka/a.class
 */
/* renamed from: ka.a */
/* loaded from: combined.jar:classes2.jar:ka/a.class */
public class C5535a implements IInterface {

    /* renamed from: b */
    public final IBinder f31609b;

    /* renamed from: c */
    public final String f31610c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C5535a(IBinder iBinder, String str) {
        this.f31609b = iBinder;
    }

    /* renamed from: Z */
    public final Parcel m27521Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f31610c);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31609b;
    }

    /* renamed from: y0 */
    public final Parcel m27522y0(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f31609b.transact(i10, parcel, obtain, 0);
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
}
