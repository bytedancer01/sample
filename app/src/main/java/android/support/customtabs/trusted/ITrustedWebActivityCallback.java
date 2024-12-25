package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/customtabs/trusted/ITrustedWebActivityCallback.class
 */
/* loaded from: combined.jar:classes1.jar:android/support/customtabs/trusted/ITrustedWebActivityCallback.class */
public interface ITrustedWebActivityCallback extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/customtabs/trusted/ITrustedWebActivityCallback$Default.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/customtabs/trusted/ITrustedWebActivityCallback$Default.class */
    public static class Default implements ITrustedWebActivityCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        public void onExtraCallback(String str, Bundle bundle) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/customtabs/trusted/ITrustedWebActivityCallback$Stub.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/customtabs/trusted/ITrustedWebActivityCallback$Stub.class */
    public static abstract class Stub extends Binder implements ITrustedWebActivityCallback {
        private static final String DESCRIPTOR = "android.support.customtabs.trusted.ITrustedWebActivityCallback";
        public static final int TRANSACTION_onExtraCallback = 2;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/customtabs/trusted/ITrustedWebActivityCallback$Stub$Proxy.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/customtabs/trusted/ITrustedWebActivityCallback$Stub$Proxy.class */
        public static class Proxy implements ITrustedWebActivityCallback {
            public static ITrustedWebActivityCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
            public void onExtraCallback(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onExtraCallback(str, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITrustedWebActivityCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITrustedWebActivityCallback)) ? new Proxy(iBinder) : (ITrustedWebActivityCallback) queryLocalInterface;
        }

        public static ITrustedWebActivityCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ITrustedWebActivityCallback iTrustedWebActivityCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iTrustedWebActivityCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iTrustedWebActivityCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onExtraCallback(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onExtraCallback(String str, Bundle bundle);
}
