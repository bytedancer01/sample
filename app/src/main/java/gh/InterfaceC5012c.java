package gh;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gh/c.class
 */
/* renamed from: gh.c */
/* loaded from: combined.jar:classes2.jar:gh/c.class */
public interface InterfaceC5012c extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gh/c$a.class
     */
    /* renamed from: gh.c$a */
    /* loaded from: combined.jar:classes2.jar:gh/c$a.class */
    public static abstract class a extends Binder implements InterfaceC5012c {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:gh/c$a$a.class
         */
        /* renamed from: gh.c$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:gh/c$a$a.class */
        public static class C10295a implements InterfaceC5012c {

            /* renamed from: c */
            public static InterfaceC5012c f29046c;

            /* renamed from: b */
            public IBinder f29047b;

            public C10295a(IBinder iBinder) {
                this.f29047b = iBinder;
            }

            @Override // gh.InterfaceC5012c
            /* renamed from: V */
            public byte[] mo25210V(String str, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    if (!this.f29047b.transact(1, obtain, obtain2, 0) && a.m25213y0() != null) {
                        return a.m25213y0().mo25210V(str, bArr);
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29047b;
            }

            @Override // gh.InterfaceC5012c
            public byte[] getCertificateChain(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
                    obtain.writeString(str);
                    if (!this.f29047b.transact(2, obtain, obtain2, 0) && a.m25213y0() != null) {
                        return a.m25213y0().getCertificateChain(str);
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // gh.InterfaceC5012c
            /* renamed from: l1 */
            public byte[] mo25211l1(String str, byte[] bArr, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f29047b.transact(4, obtain, obtain2, 0) && a.m25213y0() != null) {
                        return a.m25213y0().mo25211l1(str, bArr, bundle);
                    }
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: Z */
        public static InterfaceC5012c m25212Z(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.api.ExternalCertificateProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC5012c)) ? new C10295a(iBinder) : (InterfaceC5012c) queryLocalInterface;
        }

        /* renamed from: y0 */
        public static InterfaceC5012c m25213y0() {
            return C10295a.f29046c;
        }
    }

    /* renamed from: V */
    byte[] mo25210V(String str, byte[] bArr);

    byte[] getCertificateChain(String str);

    /* renamed from: l1 */
    byte[] mo25211l1(String str, byte[] bArr, Bundle bundle);
}
