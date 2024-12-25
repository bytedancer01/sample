package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.customtabs.ICustomTabsCallback;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/customtabs/ICustomTabsService.class
 */
/* loaded from: combined.jar:classes1.jar:android/support/customtabs/ICustomTabsService.class */
public interface ICustomTabsService extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/customtabs/ICustomTabsService$Default.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/customtabs/ICustomTabsService$Default.class */
    public static class Default implements ICustomTabsService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i10, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i10, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j10) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/customtabs/ICustomTabsService$Stub.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/customtabs/ICustomTabsService$Stub.class */
    public static abstract class Stub extends Binder implements ICustomTabsService {
        private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsService";
        public static final int TRANSACTION_extraCommand = 5;
        public static final int TRANSACTION_mayLaunchUrl = 4;
        public static final int TRANSACTION_newSession = 3;
        public static final int TRANSACTION_newSessionWithExtras = 10;
        public static final int TRANSACTION_postMessage = 8;
        public static final int TRANSACTION_receiveFile = 12;
        public static final int TRANSACTION_requestPostMessageChannel = 7;
        public static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        public static final int TRANSACTION_updateVisuals = 6;
        public static final int TRANSACTION_validateRelationship = 9;
        public static final int TRANSACTION_warmup = 2;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/customtabs/ICustomTabsService$Stub$Proxy.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/customtabs/ICustomTabsService$Stub$Proxy.class */
        public static class Proxy implements ICustomTabsService {
            public static ICustomTabsService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public Bundle extraCommand(String str, Bundle bundle) {
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
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().extraCommand(str, bundle);
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

            @Override // android.support.customtabs.ICustomTabsService
            public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    boolean z10 = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().mayLaunchUrl(iCustomTabsCallback, uri, bundle, list);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    boolean z10 = false;
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().newSession(iCustomTabsCallback);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    boolean z10 = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().newSessionWithExtras(iCustomTabsCallback, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
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
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().postMessage(iCustomTabsCallback, str, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    boolean z10 = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().receiveFile(iCustomTabsCallback, uri, i10, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    boolean z10 = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().requestPostMessageChannel(iCustomTabsCallback, uri);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    boolean z10 = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().requestPostMessageChannelWithExtras(iCustomTabsCallback, uri, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    boolean z10 = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateVisuals(iCustomTabsCallback, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i10, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iCustomTabsCallback != null ? iCustomTabsCallback.asBinder() : null);
                    obtain.writeInt(i10);
                    boolean z10 = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().validateRelationship(iCustomTabsCallback, i10, uri, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z10 = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean warmup(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j10);
                    boolean z10 = false;
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().warmup(j10);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICustomTabsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICustomTabsService)) ? new Proxy(iBinder) : (ICustomTabsService) queryLocalInterface;
        }

        public static ICustomTabsService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ICustomTabsService iCustomTabsService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iCustomTabsService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iCustomTabsService;
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
            Bundle bundle = null;
            Bundle bundle2 = null;
            switch (i10) {
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean warmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(warmup ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean newSession = newSession(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(newSession ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICustomTabsCallback asInterface = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle3 = null;
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean mayLaunchUrl = mayLaunchUrl(asInterface, uri, bundle3, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(mayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    Bundle bundle4 = null;
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    Bundle extraCommand = extraCommand(readString, bundle4);
                    parcel2.writeNoException();
                    if (extraCommand == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    extraCommand.writeToParcel(parcel2, 1);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICustomTabsCallback asInterface2 = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle5 = null;
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean updateVisuals = updateVisuals(asInterface2, bundle5);
                    parcel2.writeNoException();
                    parcel2.writeInt(updateVisuals ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICustomTabsCallback asInterface3 = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri2 = null;
                    if (parcel.readInt() != 0) {
                        uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                    }
                    boolean requestPostMessageChannel = requestPostMessageChannel(asInterface3, uri2);
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICustomTabsCallback asInterface4 = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    int postMessage = postMessage(asInterface4, readString2, bundle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(postMessage);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICustomTabsCallback asInterface5 = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    int readInt = parcel.readInt();
                    Uri uri3 = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean validateRelationship = validateRelationship(asInterface5, readInt, uri3, bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(validateRelationship ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICustomTabsCallback asInterface6 = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle6 = null;
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean newSessionWithExtras = newSessionWithExtras(asInterface6, bundle6);
                    parcel2.writeNoException();
                    parcel2.writeInt(newSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICustomTabsCallback asInterface7 = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri4 = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle7 = null;
                    if (parcel.readInt() != 0) {
                        bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean requestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(asInterface7, uri4, bundle7);
                    parcel2.writeNoException();
                    parcel2.writeInt(requestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    ICustomTabsCallback asInterface8 = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri5 = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    int readInt2 = parcel.readInt();
                    Bundle bundle8 = null;
                    if (parcel.readInt() != 0) {
                        bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    boolean receiveFile = receiveFile(asInterface8, uri5, readInt2, bundle8);
                    parcel2.writeNoException();
                    parcel2.writeInt(receiveFile ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    Bundle extraCommand(String str, Bundle bundle);

    boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list);

    boolean newSession(ICustomTabsCallback iCustomTabsCallback);

    boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);

    boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i10, Bundle bundle);

    boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri);

    boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle);

    boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i10, Uri uri, Bundle bundle);

    boolean warmup(long j10);
}
