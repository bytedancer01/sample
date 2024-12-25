package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser$ItemCallback;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p030c0.C0950k;
import p139i1.C5147a;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/v4/media/MediaBrowserCompat.class
 */
/* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat.class */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    private final MediaBrowserImpl mImpl;
    public static final String TAG = "MediaBrowserCompat";
    public static final boolean DEBUG = Log.isLoggable(TAG, 3);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$Api21Impl.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$Api21Impl.class */
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static MediaDescription getDescription(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        public static int getFlags(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$CallbackHandler.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$CallbackHandler.class */
    public static class CallbackHandler extends Handler {
        private final WeakReference<MediaBrowserServiceCallbackImpl> mCallbackImplRef;
        private WeakReference<Messenger> mCallbacksMessengerRef;

        public CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.mCallbackImplRef = new WeakReference<>(mediaBrowserServiceCallbackImpl);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.mCallbacksMessengerRef;
            if (weakReference == null || weakReference.get() == null || this.mCallbackImplRef.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.ensureClassLoader(data);
            MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.mCallbackImplRef.get();
            Messenger messenger = this.mCallbacksMessengerRef.get();
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    mediaBrowserServiceCallbackImpl.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i10 == 2) {
                    mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                } else if (i10 != 3) {
                    Log.w(MediaBrowserCompat.TAG, "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException e10) {
                Log.e(MediaBrowserCompat.TAG, "Could not unparcel the data.");
                if (message.what == 1) {
                    mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                }
            }
        }

        public void setCallbacksMessenger(Messenger messenger) {
            this.mCallbacksMessengerRef = new WeakReference<>(messenger);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$ConnectionCallback.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$ConnectionCallback.class */
    public static class ConnectionCallback {
        public final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new ConnectionCallbackApi21(this);
        public ConnectionCallbackInternal mConnectionCallbackInternal;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$ConnectionCallback$ConnectionCallbackApi21.class */
        public class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {
            public final ConnectionCallback this$0;

            public ConnectionCallbackApi21(ConnectionCallback connectionCallback) {
                this.this$0 = connectionCallback;
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                ConnectionCallbackInternal connectionCallbackInternal = this.this$0.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnected();
                }
                this.this$0.onConnected();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                ConnectionCallbackInternal connectionCallbackInternal = this.this$0.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionFailed();
                }
                this.this$0.onConnectionFailed();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                ConnectionCallbackInternal connectionCallbackInternal = this.this$0.mConnectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionSuspended();
                }
                this.this$0.onConnectionSuspended();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal.class */
        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.mConnectionCallbackInternal = connectionCallbackInternal;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$CustomActionCallback.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$CustomActionCallback.class */
    public static abstract class CustomActionCallback {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver.class */
    public static class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final CustomActionCallback mCallback;
        private final Bundle mExtras;

        public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.mAction = str;
            this.mExtras = bundle;
            this.mCallback = customActionCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int i10, Bundle bundle) {
            if (this.mCallback == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i10 == -1) {
                this.mCallback.onError(this.mAction, this.mExtras, bundle);
                return;
            }
            if (i10 == 0) {
                this.mCallback.onResult(this.mAction, this.mExtras, bundle);
                return;
            }
            if (i10 == 1) {
                this.mCallback.onProgressUpdate(this.mAction, this.mExtras, bundle);
                return;
            }
            Log.w(MediaBrowserCompat.TAG, "Unknown result code: " + i10 + " (extras=" + this.mExtras + ", resultData=" + bundle + ")");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$ItemCallback.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$ItemCallback.class */
    public static abstract class ItemCallback {
        public final MediaBrowser$ItemCallback mItemCallbackFwk;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/MediaBrowserCompat$ItemCallback$ItemCallbackApi23.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$ItemCallback$ItemCallbackApi23.class */
        public class ItemCallbackApi23 extends MediaBrowser$ItemCallback {
            public final ItemCallback this$0;

            public ItemCallbackApi23(ItemCallback itemCallback) {
                this.this$0 = itemCallback;
            }

            public void onError(String str) {
                this.this$0.onError(str);
            }

            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                this.this$0.onItemLoaded(MediaItem.fromMediaItem(mediaItem));
            }
        }

        public ItemCallback() {
            this.mItemCallbackFwk = Build.VERSION.SDK_INT >= 23 ? new ItemCallbackApi23(this) : null;
        }

        public void onError(String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$ItemReceiver.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$ItemReceiver.class */
    public static class ItemReceiver extends ResultReceiver {
        private final ItemCallback mCallback;
        private final String mMediaId;

        public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.mMediaId = str;
            this.mCallback = itemCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int i10, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (bundle != null) {
                bundle2 = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i10 != 0 || bundle2 == null || !bundle2.containsKey("media_item")) {
                this.mCallback.onError(this.mMediaId);
                return;
            }
            Parcelable parcelable = bundle2.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.mCallback.onItemLoaded((MediaItem) parcelable);
            } else {
                this.mCallback.onError(this.mMediaId);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImpl.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImpl.class */
    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, ItemCallback itemCallback);

        Bundle getNotifyChildrenChangedOptions();

        String getRoot();

        ComponentName getServiceComponent();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(String str, Bundle bundle, SearchCallback searchCallback);

        void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback);

        void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        void unsubscribe(String str, SubscriptionCallback subscriptionCallback);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplApi21.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplApi21.class */
    public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {
        public final MediaBrowser mBrowserFwk;
        public Messenger mCallbacksMessenger;
        public final Context mContext;
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        public final Bundle mRootHints;
        public ServiceBinderWrapper mServiceBinderWrapper;
        public int mServiceVersion;
        public final CallbackHandler mHandler = new CallbackHandler(this);
        private final C7928a<String, Subscription> mSubscriptions = new C7928a<>();

        public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.mContext = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.mRootHints = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            connectionCallback.setInternalConnectionCallback(this);
            this.mBrowserFwk = new MediaBrowser(context, componentName, connectionCallback.mConnectionCallbackFwk, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            this.mBrowserFwk.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            Messenger messenger;
            ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
            if (serviceBinderWrapper != null && (messenger = this.mCallbacksMessenger) != null) {
                try {
                    serviceBinderWrapper.unregisterCallbackMessenger(messenger);
                } catch (RemoteException e10) {
                    Log.i(MediaBrowserCompat.TAG, "Remote error unregistering client messenger.");
                }
            }
            this.mBrowserFwk.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
            return this.mBrowserFwk.getExtras();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
            Runnable runnable;
            CallbackHandler callbackHandler;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!this.mBrowserFwk.isConnected()) {
                Log.i(MediaBrowserCompat.TAG, "Not connected, unable to retrieve the MediaItem.");
                CallbackHandler callbackHandler2 = this.mHandler;
                runnable = new Runnable(this, itemCallback, str) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.1
                    public final MediaBrowserImplApi21 this$0;
                    public final ItemCallback val$cb;
                    public final String val$mediaId;

                    {
                        this.this$0 = this;
                        this.val$cb = itemCallback;
                        this.val$mediaId = str;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$cb.onError(this.val$mediaId);
                    }
                };
                callbackHandler = callbackHandler2;
            } else {
                if (this.mServiceBinderWrapper != null) {
                    try {
                        this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
                        return;
                    } catch (RemoteException e10) {
                        Log.i(MediaBrowserCompat.TAG, "Remote error getting media item: " + str);
                        this.mHandler.post(new Runnable(this, itemCallback, str) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.3
                            public final MediaBrowserImplApi21 this$0;
                            public final ItemCallback val$cb;
                            public final String val$mediaId;

                            {
                                this.this$0 = this;
                                this.val$cb = itemCallback;
                                this.val$mediaId = str;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                this.val$cb.onError(this.val$mediaId);
                            }
                        });
                        return;
                    }
                }
                CallbackHandler callbackHandler3 = this.mHandler;
                runnable = new Runnable(this, itemCallback, str) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.2
                    public final MediaBrowserImplApi21 this$0;
                    public final ItemCallback val$cb;
                    public final String val$mediaId;

                    {
                        this.this$0 = this;
                        this.val$cb = itemCallback;
                        this.val$mediaId = str;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$cb.onError(this.val$mediaId);
                    }
                };
                callbackHandler = callbackHandler3;
            }
            callbackHandler.post(runnable);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
            return this.mBrowserFwk.getRoot();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
            return this.mBrowserFwk.getServiceComponent();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            if (this.mMediaSessionToken == null) {
                this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken());
            }
            return this.mMediaSessionToken;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return this.mBrowserFwk.isConnected();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
            try {
                Bundle extras = this.mBrowserFwk.getExtras();
                if (extras == null) {
                    return;
                }
                this.mServiceVersion = extras.getInt("extra_service_version", 0);
                IBinder m5671a = C0950k.m5671a(extras, "extra_messenger");
                if (m5671a != null) {
                    this.mServiceBinderWrapper = new ServiceBinderWrapper(m5671a, this.mRootHints);
                    Messenger messenger = new Messenger(this.mHandler);
                    this.mCallbacksMessenger = messenger;
                    this.mHandler.setCallbacksMessenger(messenger);
                    try {
                        this.mServiceBinderWrapper.registerCallbackMessenger(this.mContext, this.mCallbacksMessenger);
                    } catch (RemoteException e10) {
                        Log.i(MediaBrowserCompat.TAG, "Remote error registering client messenger.");
                    }
                }
                IMediaSession asInterface = IMediaSession.Stub.asInterface(C0950k.m5671a(extras, "extra_session_binder"));
                if (asInterface != null) {
                    this.mMediaSessionToken = MediaSessionCompat.Token.fromToken(this.mBrowserFwk.getSessionToken(), asInterface);
                }
            } catch (IllegalStateException e11) {
                Log.e(MediaBrowserCompat.TAG, "Unexpected IllegalStateException", e11);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mMediaSessionToken = null;
            this.mHandler.setCallbacksMessenger(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.mCallbacksMessenger != messenger) {
                return;
            }
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                if (MediaBrowserCompat.DEBUG) {
                    Log.d(MediaBrowserCompat.TAG, "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            SubscriptionCallback callback = subscription.getCallback(bundle);
            if (callback != null) {
                if (bundle == null) {
                    if (list == null) {
                        callback.onError(str);
                        return;
                    } else {
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list);
                    }
                } else if (list == null) {
                    callback.onError(str, bundle);
                    return;
                } else {
                    this.mNotifyChildrenChangedOptions = bundle2;
                    callback.onChildrenLoaded(str, list, bundle);
                }
                this.mNotifyChildrenChangedOptions = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(String str, Bundle bundle, SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            }
            if (this.mServiceBinderWrapper == null) {
                Log.i(MediaBrowserCompat.TAG, "The connected service doesn't support search.");
                this.mHandler.post(new Runnable(this, searchCallback, str, bundle) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.4
                    public final MediaBrowserImplApi21 this$0;
                    public final SearchCallback val$callback;
                    public final Bundle val$extras;
                    public final String val$query;

                    {
                        this.this$0 = this;
                        this.val$callback = searchCallback;
                        this.val$query = str;
                        this.val$extras = bundle;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$callback.onError(this.val$query, this.val$extras);
                    }
                });
                return;
            }
            try {
                this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException e10) {
                Log.i(MediaBrowserCompat.TAG, "Remote error searching items with query: " + str, e10);
                this.mHandler.post(new Runnable(this, searchCallback, str, bundle) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.5
                    public final MediaBrowserImplApi21 this$0;
                    public final SearchCallback val$callback;
                    public final Bundle val$extras;
                    public final String val$query;

                    {
                        this.this$0 = this;
                        this.val$callback = searchCallback;
                        this.val$query = str;
                        this.val$extras = bundle;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$callback.onError(this.val$query, this.val$extras);
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            if (this.mServiceBinderWrapper == null) {
                Log.i(MediaBrowserCompat.TAG, "The connected service doesn't support sendCustomAction.");
                if (customActionCallback != null) {
                    this.mHandler.post(new Runnable(this, customActionCallback, str, bundle) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.6
                        public final MediaBrowserImplApi21 this$0;
                        public final String val$action;
                        public final CustomActionCallback val$callback;
                        public final Bundle val$extras;

                        {
                            this.this$0 = this;
                            this.val$callback = customActionCallback;
                            this.val$action = str;
                            this.val$extras = bundle;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.val$callback.onError(this.val$action, this.val$extras, null);
                        }
                    });
                }
            }
            try {
                this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException e10) {
                Log.i(MediaBrowserCompat.TAG, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e10);
                if (customActionCallback != null) {
                    this.mHandler.post(new Runnable(this, customActionCallback, str, bundle) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.7
                        public final MediaBrowserImplApi21 this$0;
                        public final String val$action;
                        public final CustomActionCallback val$callback;
                        public final Bundle val$extras;

                        {
                            this.this$0 = this;
                            this.val$callback = customActionCallback;
                            this.val$action = str;
                            this.val$extras = bundle;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.val$callback.onError(this.val$action, this.val$extras, null);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.mSubscriptions.get(str);
            Subscription subscription2 = subscription;
            if (subscription == null) {
                subscription2 = new Subscription();
                this.mSubscriptions.put(str, subscription2);
            }
            subscriptionCallback.setSubscription(subscription2);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            subscription2.putCallback(bundle2, subscriptionCallback);
            ServiceBinderWrapper serviceBinderWrapper = this.mServiceBinderWrapper;
            if (serviceBinderWrapper == null) {
                this.mBrowserFwk.subscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);
                return;
            }
            try {
                serviceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
            } catch (RemoteException e10) {
                Log.i(MediaBrowserCompat.TAG, "Remote error subscribing media item: " + str);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        
            if (r0.size() == 0) goto L9;
         */
        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void unsubscribe(java.lang.String r6, android.support.v4.media.MediaBrowserCompat.SubscriptionCallback r7) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.unsubscribe(java.lang.String, android.support.v4.media.MediaBrowserCompat$SubscriptionCallback):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplApi23.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplApi23.class */
    public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
            if (this.mServiceBinderWrapper == null) {
                this.mBrowserFwk.getItem(str, itemCallback.mItemCallbackFwk);
            } else {
                super.getItem(str, itemCallback);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplApi26.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplApi26.class */
    public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.subscribe(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                this.mBrowserFwk.subscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);
            } else {
                this.mBrowserFwk.subscribe(str, bundle, subscriptionCallback.mSubscriptionCallbackFwk);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                super.unsubscribe(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                this.mBrowserFwk.unsubscribe(str);
            } else {
                this.mBrowserFwk.unsubscribe(str, subscriptionCallback.mSubscriptionCallbackFwk);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplBase.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplBase.class */
    public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        public static final int CONNECT_STATE_CONNECTED = 3;
        public static final int CONNECT_STATE_CONNECTING = 2;
        public static final int CONNECT_STATE_DISCONNECTED = 1;
        public static final int CONNECT_STATE_DISCONNECTING = 0;
        public static final int CONNECT_STATE_SUSPENDED = 4;
        public final ConnectionCallback mCallback;
        public Messenger mCallbacksMessenger;
        public final Context mContext;
        private Bundle mExtras;
        private MediaSessionCompat.Token mMediaSessionToken;
        private Bundle mNotifyChildrenChangedOptions;
        public final Bundle mRootHints;
        private String mRootId;
        public ServiceBinderWrapper mServiceBinderWrapper;
        public final ComponentName mServiceComponent;
        public MediaServiceConnection mServiceConnection;
        public final CallbackHandler mHandler = new CallbackHandler(this);
        private final C7928a<String, Subscription> mSubscriptions = new C7928a<>();
        public int mState = 1;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.class */
        public class MediaServiceConnection implements ServiceConnection {
            public final MediaBrowserImplBase this$0;

            public MediaServiceConnection(MediaBrowserImplBase mediaBrowserImplBase) {
                this.this$0 = mediaBrowserImplBase;
            }

            private void postOrRun(Runnable runnable) {
                if (Thread.currentThread() == this.this$0.mHandler.getLooper().getThread()) {
                    runnable.run();
                } else {
                    this.this$0.mHandler.post(runnable);
                }
            }

            public boolean isCurrent(String str) {
                int i10;
                MediaBrowserImplBase mediaBrowserImplBase = this.this$0;
                if (mediaBrowserImplBase.mServiceConnection == this && (i10 = mediaBrowserImplBase.mState) != 0 && i10 != 1) {
                    return true;
                }
                int i11 = mediaBrowserImplBase.mState;
                if (i11 == 0 || i11 == 1) {
                    return false;
                }
                Log.i(MediaBrowserCompat.TAG, str + " for " + this.this$0.mServiceComponent + " with mServiceConnection=" + this.this$0.mServiceConnection + " this=" + this);
                return false;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                postOrRun(new Runnable(this, componentName, iBinder) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.1
                    public final MediaServiceConnection this$1;
                    public final IBinder val$binder;
                    public final ComponentName val$name;

                    {
                        this.this$1 = this;
                        this.val$name = componentName;
                        this.val$binder = iBinder;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z10 = MediaBrowserCompat.DEBUG;
                        if (z10) {
                            Log.d(MediaBrowserCompat.TAG, "MediaServiceConnection.onServiceConnected name=" + this.val$name + " binder=" + this.val$binder);
                            this.this$1.this$0.dump();
                        }
                        if (this.this$1.isCurrent("onServiceConnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = this.this$1.this$0;
                            mediaBrowserImplBase.mServiceBinderWrapper = new ServiceBinderWrapper(this.val$binder, mediaBrowserImplBase.mRootHints);
                            this.this$1.this$0.mCallbacksMessenger = new Messenger(this.this$1.this$0.mHandler);
                            MediaBrowserImplBase mediaBrowserImplBase2 = this.this$1.this$0;
                            mediaBrowserImplBase2.mHandler.setCallbacksMessenger(mediaBrowserImplBase2.mCallbacksMessenger);
                            this.this$1.this$0.mState = 2;
                            if (z10) {
                                try {
                                    Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                                    this.this$1.this$0.dump();
                                } catch (RemoteException e10) {
                                    Log.w(MediaBrowserCompat.TAG, "RemoteException during connect for " + this.this$1.this$0.mServiceComponent);
                                    if (MediaBrowserCompat.DEBUG) {
                                        Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                                        this.this$1.this$0.dump();
                                        return;
                                    }
                                    return;
                                }
                            }
                            MediaBrowserImplBase mediaBrowserImplBase3 = this.this$1.this$0;
                            mediaBrowserImplBase3.mServiceBinderWrapper.connect(mediaBrowserImplBase3.mContext, mediaBrowserImplBase3.mCallbacksMessenger);
                        }
                    }
                });
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                postOrRun(new Runnable(this, componentName) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.2
                    public final MediaServiceConnection this$1;
                    public final ComponentName val$name;

                    {
                        this.this$1 = this;
                        this.val$name = componentName;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (MediaBrowserCompat.DEBUG) {
                            Log.d(MediaBrowserCompat.TAG, "MediaServiceConnection.onServiceDisconnected name=" + this.val$name + " this=" + this + " mServiceConnection=" + this.this$1.this$0.mServiceConnection);
                            this.this$1.this$0.dump();
                        }
                        if (this.this$1.isCurrent("onServiceDisconnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = this.this$1.this$0;
                            mediaBrowserImplBase.mServiceBinderWrapper = null;
                            mediaBrowserImplBase.mCallbacksMessenger = null;
                            mediaBrowserImplBase.mHandler.setCallbacksMessenger(null);
                            MediaBrowserImplBase mediaBrowserImplBase2 = this.this$1.this$0;
                            mediaBrowserImplBase2.mState = 4;
                            mediaBrowserImplBase2.mCallback.onConnectionSuspended();
                        }
                    }
                });
            }
        }

        public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (connectionCallback == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.mContext = context;
            this.mServiceComponent = componentName;
            this.mCallback = connectionCallback;
            this.mRootHints = bundle == null ? null : new Bundle(bundle);
        }

        private static String getStateLabel(int i10) {
            if (i10 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i10 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i10 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i10 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i10 == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i10;
        }

        private boolean isCurrent(Messenger messenger, String str) {
            int i10;
            if (this.mCallbacksMessenger == messenger && (i10 = this.mState) != 0 && i10 != 1) {
                return true;
            }
            int i11 = this.mState;
            if (i11 == 0 || i11 == 1) {
                return false;
            }
            Log.i(MediaBrowserCompat.TAG, str + " for " + this.mServiceComponent + " with mCallbacksMessenger=" + this.mCallbacksMessenger + " this=" + this);
            return false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            int i10 = this.mState;
            if (i10 == 0 || i10 == 1) {
                this.mState = 2;
                this.mHandler.post(new Runnable(this) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.1
                    public final MediaBrowserImplBase this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z10;
                        MediaBrowserImplBase mediaBrowserImplBase = this.this$0;
                        if (mediaBrowserImplBase.mState == 0) {
                            return;
                        }
                        mediaBrowserImplBase.mState = 2;
                        if (MediaBrowserCompat.DEBUG && mediaBrowserImplBase.mServiceConnection != null) {
                            throw new RuntimeException("mServiceConnection should be null. Instead it is " + this.this$0.mServiceConnection);
                        }
                        if (mediaBrowserImplBase.mServiceBinderWrapper != null) {
                            throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + this.this$0.mServiceBinderWrapper);
                        }
                        if (mediaBrowserImplBase.mCallbacksMessenger != null) {
                            throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + this.this$0.mCallbacksMessenger);
                        }
                        Intent intent = new Intent("android.media.browse.MediaBrowserService");
                        intent.setComponent(this.this$0.mServiceComponent);
                        MediaBrowserImplBase mediaBrowserImplBase2 = this.this$0;
                        mediaBrowserImplBase2.mServiceConnection = new MediaServiceConnection(mediaBrowserImplBase2);
                        try {
                            MediaBrowserImplBase mediaBrowserImplBase3 = this.this$0;
                            z10 = mediaBrowserImplBase3.mContext.bindService(intent, mediaBrowserImplBase3.mServiceConnection, 1);
                        } catch (Exception e10) {
                            Log.e(MediaBrowserCompat.TAG, "Failed binding to service " + this.this$0.mServiceComponent);
                            z10 = false;
                        }
                        if (!z10) {
                            this.this$0.forceCloseConnection();
                            this.this$0.mCallback.onConnectionFailed();
                        }
                        if (MediaBrowserCompat.DEBUG) {
                            Log.d(MediaBrowserCompat.TAG, "connect...");
                            this.this$0.dump();
                        }
                    }
                });
            } else {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + getStateLabel(this.mState) + ")");
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            this.mState = 0;
            this.mHandler.post(new Runnable(this) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.2
                public final MediaBrowserImplBase this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserImplBase mediaBrowserImplBase = this.this$0;
                    Messenger messenger = mediaBrowserImplBase.mCallbacksMessenger;
                    if (messenger != null) {
                        try {
                            mediaBrowserImplBase.mServiceBinderWrapper.disconnect(messenger);
                        } catch (RemoteException e10) {
                            Log.w(MediaBrowserCompat.TAG, "RemoteException during connect for " + this.this$0.mServiceComponent);
                        }
                    }
                    MediaBrowserImplBase mediaBrowserImplBase2 = this.this$0;
                    int i10 = mediaBrowserImplBase2.mState;
                    mediaBrowserImplBase2.forceCloseConnection();
                    if (i10 != 0) {
                        this.this$0.mState = i10;
                    }
                    if (MediaBrowserCompat.DEBUG) {
                        Log.d(MediaBrowserCompat.TAG, "disconnect...");
                        this.this$0.dump();
                    }
                }
            });
        }

        public void dump() {
            Log.d(MediaBrowserCompat.TAG, "MediaBrowserCompat...");
            Log.d(MediaBrowserCompat.TAG, "  mServiceComponent=" + this.mServiceComponent);
            Log.d(MediaBrowserCompat.TAG, "  mCallback=" + this.mCallback);
            Log.d(MediaBrowserCompat.TAG, "  mRootHints=" + this.mRootHints);
            Log.d(MediaBrowserCompat.TAG, "  mState=" + getStateLabel(this.mState));
            Log.d(MediaBrowserCompat.TAG, "  mServiceConnection=" + this.mServiceConnection);
            Log.d(MediaBrowserCompat.TAG, "  mServiceBinderWrapper=" + this.mServiceBinderWrapper);
            Log.d(MediaBrowserCompat.TAG, "  mCallbacksMessenger=" + this.mCallbacksMessenger);
            Log.d(MediaBrowserCompat.TAG, "  mRootId=" + this.mRootId);
            Log.d(MediaBrowserCompat.TAG, "  mMediaSessionToken=" + this.mMediaSessionToken);
        }

        public void forceCloseConnection() {
            MediaServiceConnection mediaServiceConnection = this.mServiceConnection;
            if (mediaServiceConnection != null) {
                this.mContext.unbindService(mediaServiceConnection);
            }
            this.mState = 1;
            this.mServiceConnection = null;
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mHandler.setCallbacksMessenger(null);
            this.mRootId = null;
            this.mMediaSessionToken = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
            if (isConnected()) {
                return this.mExtras;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + getStateLabel(this.mState) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!isConnected()) {
                Log.i(MediaBrowserCompat.TAG, "Not connected, unable to retrieve the MediaItem.");
                this.mHandler.post(new Runnable(this, itemCallback, str) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.3
                    public final MediaBrowserImplBase this$0;
                    public final ItemCallback val$cb;
                    public final String val$mediaId;

                    {
                        this.this$0 = this;
                        this.val$cb = itemCallback;
                        this.val$mediaId = str;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$cb.onError(this.val$mediaId);
                    }
                });
                return;
            }
            try {
                this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException e10) {
                Log.i(MediaBrowserCompat.TAG, "Remote error getting media item: " + str);
                this.mHandler.post(new Runnable(this, itemCallback, str) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.4
                    public final MediaBrowserImplBase this$0;
                    public final ItemCallback val$cb;
                    public final String val$mediaId;

                    {
                        this.this$0 = this;
                        this.val$cb = itemCallback;
                        this.val$mediaId = str;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$cb.onError(this.val$mediaId);
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
            return this.mNotifyChildrenChangedOptions;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
            if (isConnected()) {
                return this.mRootId;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + getStateLabel(this.mState) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
            if (isConnected()) {
                return this.mServiceComponent;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.mState + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            if (isConnected()) {
                return this.mMediaSessionToken;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.mState + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return this.mState == 3;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
            Log.e(MediaBrowserCompat.TAG, "onConnectFailed for " + this.mServiceComponent);
            if (isCurrent(messenger, "onConnectFailed")) {
                if (this.mState == 2) {
                    forceCloseConnection();
                    this.mCallback.onConnectionFailed();
                    return;
                }
                Log.w(MediaBrowserCompat.TAG, "onConnect from service while mState=" + getStateLabel(this.mState) + "... ignoring");
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (isCurrent(messenger, "onLoadChildren")) {
                boolean z10 = MediaBrowserCompat.DEBUG;
                if (z10) {
                    Log.d(MediaBrowserCompat.TAG, "onLoadChildren for " + this.mServiceComponent + " id=" + str);
                }
                Subscription subscription = this.mSubscriptions.get(str);
                if (subscription == null) {
                    if (z10) {
                        Log.d(MediaBrowserCompat.TAG, "onLoadChildren for id that isn't subscribed id=" + str);
                        return;
                    }
                    return;
                }
                SubscriptionCallback callback = subscription.getCallback(bundle);
                if (callback != null) {
                    if (bundle == null) {
                        if (list == null) {
                            callback.onError(str);
                            return;
                        } else {
                            this.mNotifyChildrenChangedOptions = bundle2;
                            callback.onChildrenLoaded(str, list);
                        }
                    } else if (list == null) {
                        callback.onError(str, bundle);
                        return;
                    } else {
                        this.mNotifyChildrenChangedOptions = bundle2;
                        callback.onChildrenLoaded(str, list, bundle);
                    }
                    this.mNotifyChildrenChangedOptions = null;
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (isCurrent(messenger, "onConnect")) {
                if (this.mState != 2) {
                    Log.w(MediaBrowserCompat.TAG, "onConnect from service while mState=" + getStateLabel(this.mState) + "... ignoring");
                    return;
                }
                this.mRootId = str;
                this.mMediaSessionToken = token;
                this.mExtras = bundle;
                this.mState = 3;
                if (MediaBrowserCompat.DEBUG) {
                    Log.d(MediaBrowserCompat.TAG, "ServiceCallbacks.onConnect...");
                    dump();
                }
                this.mCallback.onConnected();
                try {
                    for (Map.Entry<String, Subscription> entry : this.mSubscriptions.entrySet()) {
                        String key = entry.getKey();
                        Subscription value = entry.getValue();
                        List<SubscriptionCallback> callbacks = value.getCallbacks();
                        List<Bundle> optionsList = value.getOptionsList();
                        for (int i10 = 0; i10 < callbacks.size(); i10++) {
                            this.mServiceBinderWrapper.addSubscription(key, callbacks.get(i10).mToken, optionsList.get(i10), this.mCallbacksMessenger);
                        }
                    }
                } catch (RemoteException e10) {
                    Log.d(MediaBrowserCompat.TAG, "addSubscription failed with RemoteException.");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(String str, Bundle bundle, SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected (state=" + getStateLabel(this.mState) + ")");
            }
            try {
                this.mServiceBinderWrapper.search(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException e10) {
                Log.i(MediaBrowserCompat.TAG, "Remote error searching items with query: " + str, e10);
                this.mHandler.post(new Runnable(this, searchCallback, str, bundle) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.5
                    public final MediaBrowserImplBase this$0;
                    public final SearchCallback val$callback;
                    public final Bundle val$extras;
                    public final String val$query;

                    {
                        this.this$0 = this;
                        this.val$callback = searchCallback;
                        this.val$query = str;
                        this.val$extras = bundle;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$callback.onError(this.val$query, this.val$extras);
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            try {
                this.mServiceBinderWrapper.sendCustomAction(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.mHandler), this.mCallbacksMessenger);
            } catch (RemoteException e10) {
                Log.i(MediaBrowserCompat.TAG, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e10);
                if (customActionCallback != null) {
                    this.mHandler.post(new Runnable(this, customActionCallback, str, bundle) { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.6
                        public final MediaBrowserImplBase this$0;
                        public final String val$action;
                        public final CustomActionCallback val$callback;
                        public final Bundle val$extras;

                        {
                            this.this$0 = this;
                            this.val$callback = customActionCallback;
                            this.val$action = str;
                            this.val$extras = bundle;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            this.val$callback.onError(this.val$action, this.val$extras, null);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.mSubscriptions.get(str);
            Subscription subscription2 = subscription;
            if (subscription == null) {
                subscription2 = new Subscription();
                this.mSubscriptions.put(str, subscription2);
            }
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            subscription2.putCallback(bundle2, subscriptionCallback);
            if (isConnected()) {
                try {
                    this.mServiceBinderWrapper.addSubscription(str, subscriptionCallback.mToken, bundle2, this.mCallbacksMessenger);
                } catch (RemoteException e10) {
                    Log.d(MediaBrowserCompat.TAG, "addSubscription failed with RemoteException parentId=" + str);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.mSubscriptions.get(str);
            if (subscription == null) {
                return;
            }
            try {
                if (subscriptionCallback != null) {
                    List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                    List<Bundle> optionsList = subscription.getOptionsList();
                    for (int size = callbacks.size() - 1; size >= 0; size--) {
                        if (callbacks.get(size) == subscriptionCallback) {
                            if (isConnected()) {
                                this.mServiceBinderWrapper.removeSubscription(str, subscriptionCallback.mToken, this.mCallbacksMessenger);
                            }
                            callbacks.remove(size);
                            optionsList.remove(size);
                        }
                    }
                } else if (isConnected()) {
                    this.mServiceBinderWrapper.removeSubscription(str, null, this.mCallbacksMessenger);
                }
            } catch (RemoteException e10) {
                Log.d(MediaBrowserCompat.TAG, "removeSubscription failed with RemoteException parentId=" + str);
            }
            if (subscription.isEmpty() || subscriptionCallback == null) {
                this.mSubscriptions.remove(str);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserServiceCallbackImpl.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaBrowserServiceCallbackImpl.class */
    public interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaItem.class
     */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$MediaItem.class */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i10) {
                return new MediaItem[i10];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        public MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.mFlags = i10;
            this.mDescription = mediaDescriptionCompat;
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.fromMediaDescription(Api21Impl.getDescription(mediaItem)), Api21Impl.getFlags(mediaItem));
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromMediaItem(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public int getFlags() {
            return this.mFlags;
        }

        public String getMediaId() {
            return this.mDescription.getMediaId();
        }

        public boolean isBrowsable() {
            boolean z10 = true;
            if ((this.mFlags & 1) == 0) {
                z10 = false;
            }
            return z10;
        }

        public boolean isPlayable() {
            return (this.mFlags & 2) != 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$SearchCallback.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$SearchCallback.class */
    public static abstract class SearchCallback {
        public void onError(String str, Bundle bundle) {
        }

        public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$SearchResultReceiver.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$SearchResultReceiver.class */
    public static class SearchResultReceiver extends ResultReceiver {
        private final SearchCallback mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.mQuery = str;
            this.mExtras = bundle;
            this.mCallback = searchCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int i10, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (bundle != null) {
                bundle2 = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i10 != 0 || bundle2 == null || !bundle2.containsKey("search_results")) {
                this.mCallback.onError(this.mQuery, this.mExtras);
                return;
            }
            Parcelable[] parcelableArray = bundle2.getParcelableArray("search_results");
            if (parcelableArray == null) {
                this.mCallback.onError(this.mQuery, this.mExtras);
                return;
            }
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            this.mCallback.onSearchResult(this.mQuery, this.mExtras, arrayList);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$ServiceBinderWrapper.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$ServiceBinderWrapper.class */
    public static class ServiceBinderWrapper {
        private Messenger mMessenger;
        private Bundle mRootHints;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.mMessenger = new Messenger(iBinder);
            this.mRootHints = bundle;
        }

        private void sendRequest(int i10, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.mMessenger.send(obtain);
        }

        public void addSubscription(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0950k.m5672b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            sendRequest(3, bundle2, messenger);
        }

        public void connect(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.mRootHints);
            sendRequest(1, bundle, messenger);
        }

        public void disconnect(Messenger messenger) {
            sendRequest(2, null, messenger);
        }

        public void getMediaItem(String str, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(5, bundle, messenger);
        }

        public void registerCallbackMessenger(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.mRootHints);
            sendRequest(6, bundle, messenger);
        }

        public void removeSubscription(String str, IBinder iBinder, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            C0950k.m5672b(bundle, "data_callback_token", iBinder);
            sendRequest(4, bundle, messenger);
        }

        public void search(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", str);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(8, bundle2, messenger);
        }

        public void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", str);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            sendRequest(9, bundle2, messenger);
        }

        public void unregisterCallbackMessenger(Messenger messenger) {
            sendRequest(7, null, messenger);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$Subscription.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$Subscription.class */
    public static class Subscription {
        private final List<SubscriptionCallback> mCallbacks = new ArrayList();
        private final List<Bundle> mOptionsList = new ArrayList();

        public SubscriptionCallback getCallback(Bundle bundle) {
            for (int i10 = 0; i10 < this.mOptionsList.size(); i10++) {
                if (C5147a.m25780a(this.mOptionsList.get(i10), bundle)) {
                    return this.mCallbacks.get(i10);
                }
            }
            return null;
        }

        public List<SubscriptionCallback> getCallbacks() {
            return this.mCallbacks;
        }

        public List<Bundle> getOptionsList() {
            return this.mOptionsList;
        }

        public boolean isEmpty() {
            return this.mCallbacks.isEmpty();
        }

        public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i10 = 0; i10 < this.mOptionsList.size(); i10++) {
                if (C5147a.m25780a(this.mOptionsList.get(i10), bundle)) {
                    this.mCallbacks.set(i10, subscriptionCallback);
                    return;
                }
            }
            this.mCallbacks.add(subscriptionCallback);
            this.mOptionsList.add(bundle);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/MediaBrowserCompat$SubscriptionCallback.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$SubscriptionCallback.class */
    public static abstract class SubscriptionCallback {
        public final MediaBrowser.SubscriptionCallback mSubscriptionCallbackFwk;
        public WeakReference<Subscription> mSubscriptionRef;
        public final IBinder mToken = new Binder();

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi21.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi21.class */
        public class SubscriptionCallbackApi21 extends MediaBrowser.SubscriptionCallback {
            public final SubscriptionCallback this$0;

            public SubscriptionCallbackApi21(SubscriptionCallback subscriptionCallback) {
                this.this$0 = subscriptionCallback;
            }

            public List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i10 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                int i11 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                if (i10 == -1 && i11 == -1) {
                    return list;
                }
                int i12 = i11 * i10;
                int i13 = i12 + i11;
                if (i10 < 0 || i11 < 1 || i12 >= list.size()) {
                    return Collections.emptyList();
                }
                int i14 = i13;
                if (i13 > list.size()) {
                    i14 = list.size();
                }
                return list.subList(i12, i14);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<Subscription> weakReference = this.this$0.mSubscriptionRef;
                Subscription subscription = weakReference == null ? null : weakReference.get();
                if (subscription == null) {
                    this.this$0.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> fromMediaItemList = MediaItem.fromMediaItemList(list);
                List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                List<Bundle> optionsList = subscription.getOptionsList();
                for (int i10 = 0; i10 < callbacks.size(); i10++) {
                    Bundle bundle = optionsList.get(i10);
                    if (bundle == null) {
                        this.this$0.onChildrenLoaded(str, fromMediaItemList);
                    } else {
                        this.this$0.onChildrenLoaded(str, applyOptions(fromMediaItemList, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                this.this$0.onError(str);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi26.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/MediaBrowserCompat$SubscriptionCallback$SubscriptionCallbackApi26.class */
        public class SubscriptionCallbackApi26 extends SubscriptionCallbackApi21 {
            public final SubscriptionCallback this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubscriptionCallbackApi26(SubscriptionCallback subscriptionCallback) {
                super(subscriptionCallback);
                this.this$0 = subscriptionCallback;
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                this.this$0.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                this.this$0.onError(str, bundle);
            }
        }

        public SubscriptionCallback() {
            this.mSubscriptionCallbackFwk = Build.VERSION.SDK_INT >= 26 ? new SubscriptionCallbackApi26(this) : new SubscriptionCallbackApi21(this);
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str) {
        }

        public void onError(String str, Bundle bundle) {
        }

        public void setSubscription(Subscription subscription) {
            this.mSubscriptionRef = new WeakReference<>(subscription);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        int i10 = Build.VERSION.SDK_INT;
        this.mImpl = i10 >= 26 ? new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle) : i10 >= 23 ? new MediaBrowserImplApi23(context, componentName, connectionCallback, bundle) : new MediaBrowserImplApi21(context, componentName, connectionCallback, bundle);
    }

    public void connect() {
        Log.d(TAG, "Connecting to a MediaBrowserService.");
        this.mImpl.connect();
    }

    public void disconnect() {
        this.mImpl.disconnect();
    }

    public Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public void getItem(String str, ItemCallback itemCallback) {
        this.mImpl.getItem(str, itemCallback);
    }

    public Bundle getNotifyChildrenChangedOptions() {
        return this.mImpl.getNotifyChildrenChangedOptions();
    }

    public String getRoot() {
        return this.mImpl.getRoot();
    }

    public ComponentName getServiceComponent() {
        return this.mImpl.getServiceComponent();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public boolean isConnected() {
        return this.mImpl.isConnected();
    }

    public void search(String str, Bundle bundle, SearchCallback searchCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (searchCallback == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.mImpl.search(str, bundle, searchCallback);
    }

    public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("action cannot be empty");
        }
        this.mImpl.sendCustomAction(str, bundle, customActionCallback);
    }

    public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options are null");
        }
        this.mImpl.subscribe(str, bundle, subscriptionCallback);
    }

    public void subscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.mImpl.subscribe(str, null, subscriptionCallback);
    }

    public void unsubscribe(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.mImpl.unsubscribe(str, null);
    }

    public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.mImpl.unsubscribe(str, subscriptionCallback);
    }
}
