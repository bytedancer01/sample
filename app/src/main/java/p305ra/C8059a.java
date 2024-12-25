package p305ra;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/a.class
 */
/* renamed from: ra.a */
/* loaded from: combined.jar:classes2.jar:ra/a.class */
public class C8059a implements IInterface {

    /* renamed from: b */
    public final IBinder f38920b;

    /* renamed from: c */
    public final String f38921c;

    public C8059a(IBinder iBinder, String str) {
        this.f38920b = iBinder;
        this.f38921c = str;
    }

    /* renamed from: U0 */
    public final Parcel m34984U0(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f38920b.transact(i10, parcel, obtain, 0);
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

    /* renamed from: Z */
    public final Parcel m34985Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f38921c);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38920b;
    }

    /* renamed from: y0 */
    public final void m34986y0(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f38920b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
