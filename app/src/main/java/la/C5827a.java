package la;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:la/a.class
 */
/* renamed from: la.a */
/* loaded from: combined.jar:classes2.jar:la/a.class */
public class C5827a implements IInterface {

    /* renamed from: b */
    public final IBinder f32448b;

    /* renamed from: c */
    public final String f32449c;

    public C5827a(IBinder iBinder, String str) {
        this.f32448b = iBinder;
        this.f32449c = str;
    }

    /* renamed from: U0 */
    public final void m28410U0(int i10, Parcel parcel) {
        try {
            this.f32448b.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: Z */
    public final Parcel m28411Z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32449c);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32448b;
    }

    /* renamed from: y0 */
    public final void m28412y0(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f32448b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
