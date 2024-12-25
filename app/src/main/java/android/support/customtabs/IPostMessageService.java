package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.customtabs.ICustomTabsCallback;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/customtabs/IPostMessageService.class
 */
/* loaded from: combined.jar:classes1.jar:android/support/customtabs/IPostMessageService.class */
public interface IPostMessageService extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/customtabs/IPostMessageService$Default.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/customtabs/IPostMessageService$Default.class */
    public static class Default implements IPostMessageService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/customtabs/IPostMessageService$Stub.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/customtabs/IPostMessageService$Stub.class */
    public static abstract class Stub extends Binder implements IPostMessageService {
        private static final String DESCRIPTOR = "android.support.customtabs.IPostMessageService";
        public static final int TRANSACTION_onMessageChannelReady = 2;
        public static final int TRANSACTION_onPostMessage = 3;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/customtabs/IPostMessageService$Stub$Proxy.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/customtabs/IPostMessageService$Stub$Proxy.class */
        public static class Proxy implements IPostMessageService {
            public static IPostMessageService sDefaultImpl;
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

            @Override // android.support.customtabs.IPostMessageService
            public void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onMessageChannelReady(iCustomTabsCallback, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IPostMessageService
            public void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPostMessage(iCustomTabsCallback, str, bundle);
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

        public static IPostMessageService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPostMessageService)) ? new Proxy(iBinder) : (IPostMessageService) queryLocalInterface;
        }

        public static IPostMessageService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPostMessageService iPostMessageService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iPostMessageService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPostMessageService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Bundle bundle = null;
            if (i10 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                ICustomTabsCallback asInterface = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle2 = null;
                if (parcel.readInt() != 0) {
                    bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                onMessageChannelReady(asInterface, bundle2);
            } else {
                if (i10 != 3) {
                    if (i10 != 1598968902) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                ICustomTabsCallback asInterface2 = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                onPostMessage(asInterface2, readString, bundle);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);
}
