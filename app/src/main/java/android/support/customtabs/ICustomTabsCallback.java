package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/customtabs/ICustomTabsCallback.class
 */
/* loaded from: combined.jar:classes1.jar:android/support/customtabs/ICustomTabsCallback.class */
public interface ICustomTabsCallback extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/customtabs/ICustomTabsCallback$Default.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/customtabs/ICustomTabsCallback$Default.class */
    public static class Default implements ICustomTabsCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/customtabs/ICustomTabsCallback$Stub.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/customtabs/ICustomTabsCallback$Stub.class */
    public static abstract class Stub extends Binder implements ICustomTabsCallback {
        private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsCallback";
        public static final int TRANSACTION_extraCallback = 3;
        public static final int TRANSACTION_extraCallbackWithResult = 7;
        public static final int TRANSACTION_onMessageChannelReady = 4;
        public static final int TRANSACTION_onNavigationEvent = 2;
        public static final int TRANSACTION_onPostMessage = 5;
        public static final int TRANSACTION_onRelationshipValidationResult = 6;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/customtabs/ICustomTabsCallback$Stub$Proxy.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/customtabs/ICustomTabsCallback$Stub$Proxy.class */
        public static class Proxy implements ICustomTabsCallback {
            public static ICustomTabsCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void extraCallback(String str, Bundle bundle) {
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
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().extraCallback(str, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public Bundle extraCallbackWithResult(String str, Bundle bundle) {
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
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().extraCallbackWithResult(str, bundle);
                    }
                    obtain2.readException();
                    Bundle bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMessageChannelReady(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onMessageChannelReady(bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onNavigationEvent(int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onNavigationEvent(i10, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onPostMessage(String str, Bundle bundle) {
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
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPostMessage(str, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i10);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z10 ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onRelationshipValidationResult(i10, uri, z10, bundle);
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

        public static ICustomTabsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICustomTabsCallback)) ? new Proxy(iBinder) : (ICustomTabsCallback) queryLocalInterface;
        }

        public static ICustomTabsCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ICustomTabsCallback iCustomTabsCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iCustomTabsCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iCustomTabsCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            boolean z10 = false;
            Bundle bundle = null;
            Bundle bundle2 = null;
            switch (i10) {
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt = parcel.readInt();
                    Bundle bundle3 = null;
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    onNavigationEvent(readInt, bundle3);
                    break;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    Bundle bundle4 = null;
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    extraCallback(readString, bundle4);
                    break;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    Bundle bundle5 = null;
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    onMessageChannelReady(bundle5);
                    break;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    onPostMessage(readString2, bundle2);
                    break;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt2 = parcel.readInt();
                    Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    onRelationshipValidationResult(readInt2, uri, z10, bundle);
                    break;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString3 = parcel.readString();
                    Bundle bundle6 = null;
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    Bundle extraCallbackWithResult = extraCallbackWithResult(readString3, bundle6);
                    parcel2.writeNoException();
                    if (extraCallbackWithResult == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    extraCallbackWithResult.writeToParcel(parcel2, 1);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void extraCallback(String str, Bundle bundle);

    Bundle extraCallbackWithResult(String str, Bundle bundle);

    void onMessageChannelReady(Bundle bundle);

    void onNavigationEvent(int i10, Bundle bundle);

    void onPostMessage(String str, Bundle bundle);

    void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle);
}
