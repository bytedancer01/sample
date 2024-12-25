package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/v4/media/session/IMediaControllerCallback.class
 */
/* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/IMediaControllerCallback.class */
public interface IMediaControllerCallback extends IInterface {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/IMediaControllerCallback$Default.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/IMediaControllerCallback$Default.class */
    public static class Default implements IMediaControllerCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onCaptioningEnabledChanged(boolean z10) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onEvent(String str, Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onExtrasChanged(Bundle bundle) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onRepeatModeChanged(int i10) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onSessionDestroyed() {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onSessionReady() {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChanged(int i10) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChangedRemoved(boolean z10) {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/IMediaControllerCallback$Stub.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/IMediaControllerCallback$Stub.class */
    public static abstract class Stub extends Binder implements IMediaControllerCallback {
        private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
        public static final int TRANSACTION_onCaptioningEnabledChanged = 11;
        public static final int TRANSACTION_onEvent = 1;
        public static final int TRANSACTION_onExtrasChanged = 7;
        public static final int TRANSACTION_onMetadataChanged = 4;
        public static final int TRANSACTION_onPlaybackStateChanged = 3;
        public static final int TRANSACTION_onQueueChanged = 5;
        public static final int TRANSACTION_onQueueTitleChanged = 6;
        public static final int TRANSACTION_onRepeatModeChanged = 9;
        public static final int TRANSACTION_onSessionDestroyed = 2;
        public static final int TRANSACTION_onSessionReady = 13;
        public static final int TRANSACTION_onShuffleModeChanged = 12;
        public static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
        public static final int TRANSACTION_onVolumeInfoChanged = 8;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/session/IMediaControllerCallback$Stub$Proxy.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/IMediaControllerCallback$Stub$Proxy.class */
        public static class Proxy implements IMediaControllerCallback {
            public static IMediaControllerCallback sDefaultImpl;
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

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z10) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z10 ? 1 : 0);
                    if (this.mRemote.transact(11, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCaptioningEnabledChanged(z10);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onEvent(str, bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(7, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onExtrasChanged(bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(4, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onMetadataChanged(mediaMetadataCompat);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPlaybackStateChanged(playbackStateCompat);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(5, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onQueueChanged(list);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(6, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onQueueTitleChanged(charSequence);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i10) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i10);
                    if (this.mRemote.transact(9, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onRepeatModeChanged(i10);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSessionDestroyed();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(13, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSessionReady();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int i10) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i10);
                    if (this.mRemote.transact(12, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onShuffleModeChanged(i10);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z10) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z10 ? 1 : 0);
                    if (this.mRemote.transact(10, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onShuffleModeChangedRemoved(z10);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(8, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onVolumeInfoChanged(parcelableVolumeInfo);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMediaControllerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaControllerCallback)) ? new Proxy(iBinder) : (IMediaControllerCallback) queryLocalInterface;
        }

        public static IMediaControllerCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMediaControllerCallback iMediaControllerCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaControllerCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMediaControllerCallback;
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
            switch (i10) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    Bundle bundle = null;
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    onEvent(readString, bundle);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSessionDestroyed();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    PlaybackStateCompat playbackStateCompat = null;
                    if (parcel.readInt() != 0) {
                        playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    }
                    onPlaybackStateChanged(playbackStateCompat);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    MediaMetadataCompat mediaMetadataCompat = null;
                    if (parcel.readInt() != 0) {
                        mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    onMetadataChanged(mediaMetadataCompat);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onQueueChanged(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    CharSequence charSequence = null;
                    if (parcel.readInt() != 0) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    onQueueTitleChanged(charSequence);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    Bundle bundle2 = null;
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    onExtrasChanged(bundle2);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    ParcelableVolumeInfo parcelableVolumeInfo = null;
                    if (parcel.readInt() != 0) {
                        parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    onVolumeInfoChanged(parcelableVolumeInfo);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    onShuffleModeChangedRemoved(z10);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean z11 = false;
                    if (parcel.readInt() != 0) {
                        z11 = true;
                    }
                    onCaptioningEnabledChanged(z11);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    onShuffleModeChanged(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSessionReady();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void onCaptioningEnabledChanged(boolean z10);

    void onEvent(String str, Bundle bundle);

    void onExtrasChanged(Bundle bundle);

    void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat);

    void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat);

    void onQueueChanged(List<MediaSessionCompat.QueueItem> list);

    void onQueueTitleChanged(CharSequence charSequence);

    void onRepeatModeChanged(int i10);

    void onSessionDestroyed();

    void onSessionReady();

    void onShuffleModeChanged(int i10);

    void onShuffleModeChangedRemoved(boolean z10);

    void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo);
}
