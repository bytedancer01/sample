package p135hh;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/h.class
 */
/* renamed from: hh.h */
/* loaded from: combined.jar:classes2.jar:hh/h.class */
public interface InterfaceC5100h extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/h$a.class
     */
    /* renamed from: hh.h$a */
    /* loaded from: combined.jar:classes2.jar:hh/h$a.class */
    public static abstract class a extends Binder implements InterfaceC5100h {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:hh/h$a$a.class
         */
        /* renamed from: hh.h$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:hh/h$a$a.class */
        public static class C10296a implements InterfaceC5100h {

            /* renamed from: c */
            public static InterfaceC5100h f29284c;

            /* renamed from: b */
            public IBinder f29285b;

            public C10296a(IBinder iBinder) {
                this.f29285b = iBinder;
            }

            @Override // p135hh.InterfaceC5100h
            /* renamed from: a */
            public boolean mo25506a(boolean z10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    obtain.writeInt(z10 ? 1 : 0);
                    if (!this.f29285b.transact(3, obtain, obtain2, 0) && a.m25511y0() != null) {
                        return a.m25511y0().mo25506a(z10);
                    }
                    obtain2.readException();
                    boolean z11 = obtain2.readInt() != 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return z11;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29285b;
            }

            @Override // p135hh.InterfaceC5100h
            /* renamed from: k1 */
            public void mo25507k1(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    obtain.writeString(str);
                    if (this.f29285b.transact(4, obtain, obtain2, 0) || a.m25511y0() == null) {
                        obtain2.readException();
                    } else {
                        a.m25511y0().mo25507k1(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "de.blinkt.openvpn.core.IOpenVPNServiceInternal");
        }

        /* renamed from: Z */
        public static InterfaceC5100h m25510Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5100h)) ? new C10296a(iBinder) : (InterfaceC5100h) queryLocalInterface;
        }

        /* renamed from: y0 */
        public static InterfaceC5100h m25511y0() {
            return C10296a.f29284c;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                parcel2.writeString("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                return true;
            }
            boolean z10 = false;
            switch (i10) {
                case 1:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    boolean protect = protect(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(protect ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    boolean z11 = false;
                    if (parcel.readInt() != 0) {
                        z11 = true;
                    }
                    mo25508o0(z11);
                    break;
                case 3:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    boolean mo25506a = mo25506a(z10);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo25506a ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    mo25507k1(parcel.readString());
                    break;
                case 5:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    boolean mo25505O = mo25505O(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo25505O ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    mo25509o1(parcel.readString());
                    break;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: O */
    boolean mo25505O(String str);

    /* renamed from: a */
    boolean mo25506a(boolean z10);

    /* renamed from: k1 */
    void mo25507k1(String str);

    /* renamed from: o0 */
    void mo25508o0(boolean z10);

    /* renamed from: o1 */
    void mo25509o1(String str);

    boolean protect(int i10);
}
