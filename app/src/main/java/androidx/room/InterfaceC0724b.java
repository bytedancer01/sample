package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.InterfaceC0723a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/room/b.class
 */
/* renamed from: androidx.room.b */
/* loaded from: combined.jar:classes1.jar:androidx/room/b.class */
public interface InterfaceC0724b extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/b$a.class
     */
    /* renamed from: androidx.room.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/room/b$a.class */
    public static abstract class a extends Binder implements InterfaceC0724b {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/room/b$a$a.class
         */
        /* renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:androidx/room/b$a$a.class */
        public static class C10252a implements InterfaceC0724b {

            /* renamed from: b */
            public IBinder f4987b;

            public C10252a(IBinder iBinder) {
                this.f4987b = iBinder;
            }

            @Override // androidx.room.InterfaceC0724b
            /* renamed from: K0 */
            public int mo4704K0(InterfaceC0723a interfaceC0723a, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC0723a != null ? interfaceC0723a.asBinder() : null);
                    obtain.writeString(str);
                    this.f4987b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4987b;
            }

            @Override // androidx.room.InterfaceC0724b
            /* renamed from: r0 */
            public void mo4705r0(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f4987b.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC0724b
            /* renamed from: x1 */
            public void mo4706x1(InterfaceC0723a interfaceC0723a, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC0723a != null ? interfaceC0723a.asBinder() : null);
                    obtain.writeInt(i10);
                    this.f4987b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: Z */
        public static InterfaceC0724b m4709Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0724b)) ? new C10252a(iBinder) : (InterfaceC0724b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int mo4704K0 = mo4704K0(InterfaceC0723a.a.m4708Z(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(mo4704K0);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo4706x1(InterfaceC0723a.a.m4708Z(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo4705r0(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    /* renamed from: K0 */
    int mo4704K0(InterfaceC0723a interfaceC0723a, String str);

    /* renamed from: r0 */
    void mo4705r0(int i10, String[] strArr);

    /* renamed from: x1 */
    void mo4706x1(InterfaceC0723a interfaceC0723a, int i10);
}
