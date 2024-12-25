package p135hh;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import p135hh.InterfaceC5102j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/i.class
 */
/* renamed from: hh.i */
/* loaded from: combined.jar:classes2.jar:hh/i.class */
public interface InterfaceC5101i extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/i$a.class
     */
    /* renamed from: hh.i$a */
    /* loaded from: combined.jar:classes2.jar:hh/i$a.class */
    public static abstract class a extends Binder implements InterfaceC5101i {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:hh/i$a$a.class
         */
        /* renamed from: hh.i$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:hh/i$a$a.class */
        public static class C10297a implements InterfaceC5101i {

            /* renamed from: c */
            public static InterfaceC5101i f29286c;

            /* renamed from: b */
            public IBinder f29287b;

            public C10297a(IBinder iBinder) {
                this.f29287b = iBinder;
            }

            @Override // p135hh.InterfaceC5101i
            /* renamed from: G0 */
            public void mo25512G0(String str, int i10, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.core.IServiceStatus");
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (this.f29287b.transact(4, obtain, obtain2, 0) || a.m25518y0() == null) {
                        obtain2.readException();
                    } else {
                        a.m25518y0().mo25512G0(str, i10, str2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29287b;
            }
        }

        public a() {
            attachInterface(this, "de.blinkt.openvpn.core.IServiceStatus");
        }

        /* renamed from: Z */
        public static InterfaceC5101i m25517Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IServiceStatus");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5101i)) ? new C10297a(iBinder) : (InterfaceC5101i) queryLocalInterface;
        }

        /* renamed from: y0 */
        public static InterfaceC5101i m25518y0() {
            return C10297a.f29286c;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
                ParcelFileDescriptor mo25516u0 = mo25516u0(InterfaceC5102j.a.m25523Z(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (mo25516u0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                mo25516u0.writeToParcel(parcel2, 1);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
                mo25514e0(InterfaceC5102j.a.m25523Z(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
                String mo25513a1 = mo25513a1();
                parcel2.writeNoException();
                parcel2.writeString(mo25513a1);
                return true;
            }
            if (i10 == 4) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
                mo25512G0(parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i10 != 5) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("de.blinkt.openvpn.core.IServiceStatus");
                return true;
            }
            parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
            C5091b0 mo25515l0 = mo25515l0();
            parcel2.writeNoException();
            if (mo25515l0 == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            mo25515l0.writeToParcel(parcel2, 1);
            return true;
        }
    }

    /* renamed from: G0 */
    void mo25512G0(String str, int i10, String str2);

    /* renamed from: a1 */
    String mo25513a1();

    /* renamed from: e0 */
    void mo25514e0(InterfaceC5102j interfaceC5102j);

    /* renamed from: l0 */
    C5091b0 mo25515l0();

    /* renamed from: u0 */
    ParcelFileDescriptor mo25516u0(InterfaceC5102j interfaceC5102j);
}
