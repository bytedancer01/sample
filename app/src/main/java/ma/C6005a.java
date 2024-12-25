package ma;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/a.class
 */
/* renamed from: ma.a */
/* loaded from: combined.jar:classes2.jar:ma/a.class */
public class C6005a implements IInterface {

    /* renamed from: b */
    public final IBinder f33640b;

    /* renamed from: c */
    public final String f33641c;

    public C6005a(IBinder iBinder, String str) {
        this.f33640b = iBinder;
        this.f33641c = str;
    }

    /* renamed from: B1 */
    public final void m29371B1(int i10, Parcel parcel) {
        try {
            this.f33640b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: U0 */
    public final void m29372U0(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f33640b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: Z */
    public final Parcel m29373Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f33641c);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f33640b;
    }

    /* renamed from: y0 */
    public final Parcel m29374y0(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f33640b.transact(i10, parcel, obtain, 0);
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
