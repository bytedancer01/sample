package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/room/a.class
 */
/* renamed from: androidx.room.a */
/* loaded from: combined.jar:classes1.jar:androidx/room/a.class */
public interface InterfaceC0723a extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/a$a.class
     */
    /* renamed from: androidx.room.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/room/a$a.class */
    public static abstract class a extends Binder implements InterfaceC0723a {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/room/a$a$a.class
         */
        /* renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:androidx/room/a$a$a.class */
        public static class C10251a implements InterfaceC0723a {

            /* renamed from: b */
            public IBinder f4986b;

            public C10251a(IBinder iBinder) {
                this.f4986b = iBinder;
            }

            @Override // androidx.room.InterfaceC0723a
            /* renamed from: G */
            public void mo4707G(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f4986b.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4986b;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: Z */
        public static InterfaceC0723a m4708Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0723a)) ? new C10251a(iBinder) : (InterfaceC0723a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo4707G(parcel.createStringArray());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    /* renamed from: G */
    void mo4707G(String[] strArr);
}
