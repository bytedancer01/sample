package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p030c0.C0950k;
import p032c2.C0977a;
import p032c2.InterfaceC0980d;
import p139i1.AbstractC5153g;
import p139i1.C5148b;
import p176k1.C5453a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/support/v4/media/session/MediaSessionCompat.class
 */
/* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat.class */
public class MediaSessionCompat {
    public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    public static final String ACTION_ARGUMENT_PLAYBACK_SPEED = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
    public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
    public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
    public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    public static final String ACTION_SET_PLAYBACK_SPEED = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
    public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
    public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    private static final String DATA_CALLING_PACKAGE = "data_calling_pkg";
    private static final String DATA_CALLING_PID = "data_calling_pid";
    private static final String DATA_CALLING_UID = "data_calling_uid";
    private static final String DATA_EXTRAS = "data_extras";

    @Deprecated
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;

    @Deprecated
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
    public static final String KEY_SESSION2_TOKEN = "android.support.v4.media.session.SESSION_TOKEN2";
    public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    private static final int MAX_BITMAP_SIZE_IN_DP = 320;
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
    public static final String TAG = "MediaSessionCompat";
    public static int sMaxBitmapSize;
    private final ArrayList<OnActiveChangeListener> mActiveListeners;
    private final MediaControllerCompat mController;
    private final MediaSessionImpl mImpl;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$Callback.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$Callback.class */
    public static abstract class Callback {
        public CallbackHandler mCallbackHandler;
        private boolean mMediaPlayPausePendingOnHandler;
        public final Object mLock = new Object();
        public final MediaSession.Callback mCallbackFwk = new MediaSessionCallbackApi21(this);
        public WeakReference<MediaSessionImpl> mSessionImpl = new WeakReference<>(null);

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/session/MediaSessionCompat$Callback$CallbackHandler.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$Callback$CallbackHandler.class */
        public class CallbackHandler extends Handler {
            private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;
            public final Callback this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackHandler(Callback callback, Looper looper) {
                super(looper);
                this.this$0 = callback;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MediaSessionImpl mediaSessionImpl;
                Callback callback;
                CallbackHandler callbackHandler;
                if (message.what == 1) {
                    synchronized (this.this$0.mLock) {
                        mediaSessionImpl = this.this$0.mSessionImpl.get();
                        callback = this.this$0;
                        callbackHandler = callback.mCallbackHandler;
                    }
                    if (mediaSessionImpl == null || callback != mediaSessionImpl.getCallback() || callbackHandler == null) {
                        return;
                    }
                    mediaSessionImpl.setCurrentControllerInfo((C5148b) message.obj);
                    this.this$0.handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
                    mediaSessionImpl.setCurrentControllerInfo(null);
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/session/MediaSessionCompat$Callback$MediaSessionCallbackApi21.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$Callback$MediaSessionCallbackApi21.class */
        public class MediaSessionCallbackApi21 extends MediaSession.Callback {
            public final Callback this$0;

            public MediaSessionCallbackApi21(Callback callback) {
                this.this$0 = callback;
            }

            private void clearCurrentControllerInfo(MediaSessionImpl mediaSessionImpl) {
                mediaSessionImpl.setCurrentControllerInfo(null);
            }

            private MediaSessionImplApi21 getSessionImplIfCallbackIsSet() {
                MediaSessionImplApi21 mediaSessionImplApi21;
                synchronized (this.this$0.mLock) {
                    mediaSessionImplApi21 = (MediaSessionImplApi21) this.this$0.mSessionImpl.get();
                }
                if (mediaSessionImplApi21 == null || this.this$0 != mediaSessionImplApi21.getCallback()) {
                    mediaSessionImplApi21 = null;
                }
                return mediaSessionImplApi21;
            }

            private void setCurrentControllerInfo(MediaSessionImpl mediaSessionImpl) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String callingPackage = mediaSessionImpl.getCallingPackage();
                String str = callingPackage;
                if (TextUtils.isEmpty(callingPackage)) {
                    str = "android.media.session.MediaController";
                }
                mediaSessionImpl.setCurrentControllerInfo(new C5148b(str, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                MediaDescriptionCompat description;
                Callback callback;
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                try {
                    if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                        Bundle bundle2 = new Bundle();
                        Token sessionToken = sessionImplIfCallbackIsSet.getSessionToken();
                        IMediaSession extraBinder = sessionToken.getExtraBinder();
                        C0950k.m5672b(bundle2, MediaSessionCompat.KEY_EXTRA_BINDER, extraBinder == null ? null : extraBinder.asBinder());
                        C0977a.m5836c(bundle2, MediaSessionCompat.KEY_SESSION2_TOKEN, sessionToken.getSession2Token());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                        this.this$0.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
                    } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                        this.this$0.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                    } else {
                        if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                            callback = this.this$0;
                            description = (MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION);
                        } else if (!str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                            this.this$0.onCommand(str, bundle, resultReceiver);
                        } else if (sessionImplIfCallbackIsSet.mQueue != null) {
                            int i10 = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                            QueueItem queueItem = null;
                            if (i10 >= 0) {
                                queueItem = null;
                                if (i10 < sessionImplIfCallbackIsSet.mQueue.size()) {
                                    queueItem = sessionImplIfCallbackIsSet.mQueue.get(i10);
                                }
                            }
                            if (queueItem != null) {
                                Callback callback2 = this.this$0;
                                description = queueItem.getDescription();
                                callback = callback2;
                            }
                        }
                        callback.onRemoveQueueItem(description);
                    }
                } catch (BadParcelableException e10) {
                    Log.e(MediaSessionCompat.TAG, "Could not unparcel the extra data.");
                }
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                try {
                    if (str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
                        Uri uri = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                        Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle2);
                        this.this$0.onPlayFromUri(uri, bundle2);
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                        this.this$0.onPrepare();
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                        String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                        Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle3);
                        this.this$0.onPrepareFromMediaId(string, bundle3);
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                        String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                        Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle4);
                        this.this$0.onPrepareFromSearch(string2, bundle4);
                    } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                        Uri uri2 = (Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI);
                        Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle5);
                        this.this$0.onPrepareFromUri(uri2, bundle5);
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                        this.this$0.onSetCaptioningEnabled(bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED));
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                        this.this$0.onSetRepeatMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                        this.this$0.onSetShuffleMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING);
                        Bundle bundle6 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        MediaSessionCompat.ensureClassLoader(bundle6);
                        this.this$0.onSetRating(ratingCompat, bundle6);
                    } else if (str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                        this.this$0.onSetPlaybackSpeed(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
                    } else {
                        this.this$0.onCustomAction(str, bundle);
                    }
                } catch (BadParcelableException e10) {
                    Log.e(MediaSessionCompat.TAG, "Could not unparcel the data.");
                }
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onFastForward();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                boolean z10 = false;
                if (sessionImplIfCallbackIsSet == null) {
                    return false;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                boolean onMediaButtonEvent = this.this$0.onMediaButtonEvent(intent);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
                if (onMediaButtonEvent || super.onMediaButtonEvent(intent)) {
                    z10 = true;
                }
                return z10;
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onPause();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onPlay();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onPlayFromMediaId(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onPlayFromSearch(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onPlayFromUri(uri, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onPrepare();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onPrepareFromMediaId(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onPrepareFromSearch(str, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                MediaSessionCompat.ensureClassLoader(bundle);
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onPrepareFromUri(uri, bundle);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onRewind();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j10) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onSeekTo(j10);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f10) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onSetPlaybackSpeed(f10);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onSetRating(RatingCompat.fromRating(rating));
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            public void onSetRating(Rating rating, Bundle bundle) {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onSkipToNext();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onSkipToPrevious();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j10) {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onSkipToQueueItem(j10);
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
                if (sessionImplIfCallbackIsSet == null) {
                    return;
                }
                setCurrentControllerInfo(sessionImplIfCallbackIsSet);
                this.this$0.onStop();
                clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            }
        }

        public void handleMediaPlayPauseIfPendingOnHandler(MediaSessionImpl mediaSessionImpl, Handler handler) {
            if (this.mMediaPlayPausePendingOnHandler) {
                boolean z10 = false;
                this.mMediaPlayPausePendingOnHandler = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                long actions = playbackState == null ? 0L : playbackState.getActions();
                boolean z11 = playbackState != null && playbackState.getState() == 3;
                boolean z12 = (516 & actions) != 0;
                if ((actions & 514) != 0) {
                    z10 = true;
                }
                if (z11 && z10) {
                    onPause();
                } else {
                    if (z11 || !z12) {
                        return;
                    }
                    onPlay();
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            MediaSessionImpl mediaSessionImpl;
            CallbackHandler callbackHandler;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.mLock) {
                mediaSessionImpl = this.mSessionImpl.get();
                callbackHandler = this.mCallbackHandler;
            }
            if (mediaSessionImpl == null || callbackHandler == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C5148b currentControllerInfo = mediaSessionImpl.getCurrentControllerInfo();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                handleMediaPlayPauseIfPendingOnHandler(mediaSessionImpl, callbackHandler);
                return true;
            }
            if (!this.mMediaPlayPausePendingOnHandler) {
                this.mMediaPlayPausePendingOnHandler = true;
                callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(1, currentControllerInfo), ViewConfiguration.getDoubleTapTimeout());
                return true;
            }
            callbackHandler.removeMessages(1);
            this.mMediaPlayPausePendingOnHandler = false;
            PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
            if (((playbackState == null ? 0L : playbackState.getActions()) & 32) == 0) {
                return true;
            }
            onSkipToNext();
            return true;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i10) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j10) {
        }

        public void onSetCaptioningEnabled(boolean z10) {
        }

        public void onSetPlaybackSpeed(float f10) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void onSetRepeatMode(int i10) {
        }

        public void onSetShuffleMode(int i10) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j10) {
        }

        public void onStop() {
        }

        public void setSessionImpl(MediaSessionImpl mediaSessionImpl, Handler handler) {
            synchronized (this.mLock) {
                this.mSessionImpl = new WeakReference<>(mediaSessionImpl);
                CallbackHandler callbackHandler = this.mCallbackHandler;
                if (callbackHandler != null) {
                    callbackHandler.removeCallbacksAndMessages(null);
                }
                CallbackHandler callbackHandler2 = null;
                if (mediaSessionImpl != null) {
                    callbackHandler2 = handler == null ? null : new CallbackHandler(this, handler.getLooper());
                }
                this.mCallbackHandler = callbackHandler2;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImpl.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImpl.class */
    public interface MediaSessionImpl {
        Callback getCallback();

        String getCallingPackage();

        C5148b getCurrentControllerInfo();

        Object getMediaSession();

        PlaybackStateCompat getPlaybackState();

        Object getRemoteControlClient();

        Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(String str, Bundle bundle);

        void setActive(boolean z10);

        void setCallback(Callback callback, Handler handler);

        void setCaptioningEnabled(boolean z10);

        void setCurrentControllerInfo(C5148b c5148b);

        void setExtras(Bundle bundle);

        void setFlags(int i10);

        void setMediaButtonReceiver(PendingIntent pendingIntent);

        void setMetadata(MediaMetadataCompat mediaMetadataCompat);

        void setPlaybackState(PlaybackStateCompat playbackStateCompat);

        void setPlaybackToLocal(int i10);

        void setPlaybackToRemote(AbstractC5153g abstractC5153g);

        void setQueue(List<QueueItem> list);

        void setQueueTitle(CharSequence charSequence);

        void setRatingType(int i10);

        void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler);

        void setRepeatMode(int i10);

        void setSessionActivity(PendingIntent pendingIntent);

        void setShuffleMode(int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi18.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi18.class */
    public static class MediaSessionImplApi18 extends MediaSessionImplBase {
        private static boolean sIsMbrPendingIntentSupported = true;

        public MediaSessionImplApi18(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, InterfaceC0980d interfaceC0980d, Bundle bundle) {
            super(context, str, componentName, pendingIntent, interfaceC0980d, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public int getRccTransportControlFlagsFromActions(long j10) {
            int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j10);
            int i10 = rccTransportControlFlagsFromActions;
            if ((j10 & 256) != 0) {
                i10 = rccTransportControlFlagsFromActions | 256;
            }
            return i10;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            if (sIsMbrPendingIntentSupported) {
                try {
                    this.mAudioManager.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException e10) {
                    Log.w(MediaSessionCompat.TAG, "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    sIsMbrPendingIntentSupported = false;
                }
            }
            if (sIsMbrPendingIntentSupported) {
                return;
            }
            super.registerMediaButtonEventReceiver(pendingIntent, componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.mRcc.setPlaybackPositionUpdateListener(null);
            } else {
                this.mRcc.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener(this) { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.1
                    public final MediaSessionImplApi18 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
                    public void onPlaybackPositionUpdate(long j10) {
                        this.this$0.postToHandler(18, -1, -1, Long.valueOf(j10), null);
                    }
                });
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void setRccState(PlaybackStateCompat playbackStateCompat) {
            long position = playbackStateCompat.getPosition();
            float playbackSpeed = playbackStateCompat.getPlaybackSpeed();
            long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = position;
            if (playbackStateCompat.getState() == 3) {
                j10 = position;
                if (position > 0) {
                    long j11 = 0;
                    if (lastPositionUpdateTime > 0) {
                        long j12 = elapsedRealtime - lastPositionUpdateTime;
                        j11 = j12;
                        if (playbackSpeed > 0.0f) {
                            j11 = j12;
                            if (playbackSpeed != 1.0f) {
                                j11 = (long) (j12 * playbackSpeed);
                            }
                        }
                    }
                    j10 = position + j11;
                }
            }
            this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()), j10, playbackSpeed);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            if (sIsMbrPendingIntentSupported) {
                this.mAudioManager.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.unregisterMediaButtonEventReceiver(pendingIntent, componentName);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi19.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi19.class */
    public static class MediaSessionImplApi19 extends MediaSessionImplApi18 {
        public MediaSessionImplApi19(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, InterfaceC0980d interfaceC0980d, Bundle bundle) {
            super(context, str, componentName, pendingIntent, interfaceC0980d, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {
            RemoteControlClient.MetadataEditor buildRccMetadata = super.buildRccMetadata(bundle);
            PlaybackStateCompat playbackStateCompat = this.mState;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.getActions()) & 128) != 0) {
                buildRccMetadata.addEditableKey(268435457);
            }
            if (bundle == null) {
                return buildRccMetadata;
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
                buildRccMetadata.putLong(8, bundle.getLong(MediaMetadataCompat.METADATA_KEY_YEAR));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_RATING)) {
                buildRccMetadata.putObject(101, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_USER_RATING)) {
                buildRccMetadata.putObject(268435457, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
            }
            return buildRccMetadata;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        public int getRccTransportControlFlagsFromActions(long j10) {
            int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j10);
            int i10 = rccTransportControlFlagsFromActions;
            if ((j10 & 128) != 0) {
                i10 = rccTransportControlFlagsFromActions | 512;
            }
            return i10;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            super.setCallback(callback, handler);
            if (callback == null) {
                this.mRcc.setMetadataUpdateListener(null);
            } else {
                this.mRcc.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener(this) { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi19.1
                    public final MediaSessionImplApi19 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
                    public void onMetadataUpdate(int i10, Object obj) {
                        if (i10 == 268435457 && (obj instanceof Rating)) {
                            this.this$0.postToHandler(19, -1, -1, RatingCompat.fromRating(obj), null);
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21.class */
    public static class MediaSessionImplApi21 implements MediaSessionImpl {
        public Callback mCallback;
        public boolean mCaptioningEnabled;
        public MediaMetadataCompat mMetadata;
        public PlaybackStateCompat mPlaybackState;
        public List<QueueItem> mQueue;
        public int mRatingType;
        public RegistrationCallbackHandler mRegistrationCallbackHandler;
        public C5148b mRemoteUserInfo;
        public int mRepeatMode;
        public final MediaSession mSessionFwk;
        public Bundle mSessionInfo;
        public int mShuffleMode;
        public final Token mToken;
        public final Object mLock = new Object();
        public boolean mDestroyed = false;
        public final RemoteCallbackList<IMediaControllerCallback> mExtraControllerCallbacks = new RemoteCallbackList<>();

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21$ExtraSession.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi21$ExtraSession.class */
        public class ExtraSession extends IMediaSession.Stub {
            public final MediaSessionImplApi21 this$0;

            public ExtraSession(MediaSessionImplApi21 mediaSessionImplApi21) {
                this.this$0 = mediaSessionImplApi21;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i10, int i11, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                MediaSessionImplApi21 mediaSessionImplApi21 = this.this$0;
                return MediaSessionCompat.getStateWithUpdatedPosition(mediaSessionImplApi21.mPlaybackState, mediaSessionImplApi21.mMetadata);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                return this.this$0.mRatingType;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                return this.this$0.mRepeatMode;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getSessionInfo() {
                return this.this$0.mSessionInfo == null ? null : new Bundle(this.this$0.mSessionInfo);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                return this.this$0.mShuffleMode;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                return this.this$0.mCaptioningEnabled;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                if (this.this$0.mDestroyed) {
                    return;
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                this.this$0.mExtraControllerCallbacks.register(iMediaControllerCallback, new C5148b("android.media.session.MediaController", callingPid, callingUid));
                synchronized (this.this$0.mLock) {
                    RegistrationCallbackHandler registrationCallbackHandler = this.this$0.mRegistrationCallbackHandler;
                    if (registrationCallbackHandler != null) {
                        registrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                    }
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z10) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i10, int i11, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                this.this$0.mExtraControllerCallbacks.unregister(iMediaControllerCallback);
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                synchronized (this.this$0.mLock) {
                    RegistrationCallbackHandler registrationCallbackHandler = this.this$0.mRegistrationCallbackHandler;
                    if (registrationCallbackHandler != null) {
                        registrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                    }
                }
            }
        }

        public MediaSessionImplApi21(Context context, String str, InterfaceC0980d interfaceC0980d, Bundle bundle) {
            MediaSession createFwkMediaSession = createFwkMediaSession(context, str, bundle);
            this.mSessionFwk = createFwkMediaSession;
            this.mToken = new Token(createFwkMediaSession.getSessionToken(), new ExtraSession(this), interfaceC0980d);
            this.mSessionInfo = bundle;
            setFlags(3);
        }

        public MediaSessionImplApi21(Object obj) {
            if (!(obj instanceof MediaSession)) {
                throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
            }
            MediaSession mediaSession = (MediaSession) obj;
            this.mSessionFwk = mediaSession;
            this.mToken = new Token(mediaSession.getSessionToken(), new ExtraSession(this));
            this.mSessionInfo = null;
            setFlags(3);
        }

        public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Callback getCallback() {
            Callback callback;
            synchronized (this.mLock) {
                callback = this.mCallback;
            }
            return callback;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public String getCallingPackage() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.mSessionFwk.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.mSessionFwk, new Object[0]);
            } catch (Exception e10) {
                Log.e(MediaSessionCompat.TAG, "Cannot execute MediaSession.getCallingPackage()", e10);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public C5148b getCurrentControllerInfo() {
            C5148b c5148b;
            synchronized (this.mLock) {
                c5148b = this.mRemoteUserInfo;
            }
            return c5148b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getMediaSession() {
            return this.mSessionFwk;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
            return this.mPlaybackState;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getRemoteControlClient() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Token getSessionToken() {
            return this.mToken;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
            return this.mSessionFwk.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
            this.mDestroyed = true;
            this.mExtraControllerCallbacks.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.mSessionFwk.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.mSessionFwk);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e10) {
                    Log.w(MediaSessionCompat.TAG, "Exception happened while accessing MediaSession.mCallback.", e10);
                }
            }
            this.mSessionFwk.setCallback(null);
            this.mSessionFwk.release();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0058
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(java.lang.String r5, android.os.Bundle r6) {
            /*
                r4 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 >= r1) goto L4e
                r0 = r4
                java.lang.Object r0 = r0.mLock
                r8 = r0
                r0 = r8
                monitor-enter(r0)
                r0 = r4
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L48
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L48
                r1 = 1
                int r0 = r0 - r1
                r7 = r0
            L1b:
                r0 = r7
                if (r0 < 0) goto L3b
                r0 = r4
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L48
                r1 = r7
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L48
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L48
                r9 = r0
                r0 = r9
                r1 = r5
                r2 = r6
                r0.onEvent(r1, r2)     // Catch: java.lang.Throwable -> L48 android.os.RemoteException -> L58
            L35:
                int r7 = r7 + (-1)
                goto L1b
            L3b:
                r0 = r4
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L48
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L48
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
                goto L4e
            L48:
                r5 = move-exception
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
                r0 = r5
                throw r0
            L4e:
                r0 = r4
                android.media.session.MediaSession r0 = r0.mSessionFwk
                r1 = r5
                r2 = r6
                r0.sendSessionEvent(r1, r2)
                return
            L58:
                r9 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.sendSessionEvent(java.lang.String, android.os.Bundle):void");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean z10) {
            this.mSessionFwk.setActive(z10);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            synchronized (this.mLock) {
                this.mCallback = callback;
                this.mSessionFwk.setCallback(callback == null ? null : callback.mCallbackFwk, handler);
                if (callback != null) {
                    callback.setSessionImpl(this, handler);
                }
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0051
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean r4) {
            /*
                r3 = this;
                r0 = r3
                boolean r0 = r0.mCaptioningEnabled
                r1 = r4
                if (r0 == r1) goto L50
                r0 = r3
                r1 = r4
                r0.mCaptioningEnabled = r1
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L49
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L49
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L1e:
                r0 = r5
                if (r0 < 0) goto L3d
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L49
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L49
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L49
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onCaptioningEnabledChanged(r1)     // Catch: java.lang.Throwable -> L49 android.os.RemoteException -> L51
            L37:
                int r5 = r5 + (-1)
                goto L1e
            L3d:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L49
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L49
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                goto L50
            L49:
                r7 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                r0 = r7
                throw r0
            L50:
                return
            L51:
                r7 = move-exception
                goto L37
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.setCaptioningEnabled(boolean):void");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(C5148b c5148b) {
            synchronized (this.mLock) {
                this.mRemoteUserInfo = c5148b;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(Bundle bundle) {
            this.mSessionFwk.setExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        @SuppressLint({"WrongConstant"})
        public void setFlags(int i10) {
            this.mSessionFwk.setFlags(i10 | 1 | 2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
            this.mSessionFwk.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            this.mMetadata = mediaMetadataCompat;
            this.mSessionFwk.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.getMediaMetadata());
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x005f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat r4) {
            /*
                r3 = this;
                r0 = r3
                r1 = r4
                r0.mPlaybackState = r1
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L5a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L5a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L16:
                r0 = r5
                if (r0 < 0) goto L35
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L5a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L5a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L5a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onPlaybackStateChanged(r1)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5f
            L2f:
                int r5 = r5 + (-1)
                goto L16
            L35:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L5a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L5a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
                r0 = r3
                android.media.session.MediaSession r0 = r0.mSessionFwk
                r6 = r0
                r0 = r4
                if (r0 != 0) goto L4c
                r0 = 0
                r4 = r0
                goto L54
            L4c:
                r0 = r4
                java.lang.Object r0 = r0.getPlaybackState()
                android.media.session.PlaybackState r0 = (android.media.session.PlaybackState) r0
                r4 = r0
            L54:
                r0 = r6
                r1 = r4
                r0.setPlaybackState(r1)
                return
            L5a:
                r4 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
                r0 = r4
                throw r0
            L5f:
                r7 = move-exception
                goto L2f
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.setPlaybackState(android.support.v4.media.session.PlaybackStateCompat):void");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int i10) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            this.mSessionFwk.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(AbstractC5153g abstractC5153g) {
            this.mSessionFwk.setPlaybackToRemote((VolumeProvider) abstractC5153g.m25785d());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(List<QueueItem> list) {
            ArrayList arrayList;
            MediaSession mediaSession;
            this.mQueue = list;
            if (list == null) {
                mediaSession = this.mSessionFwk;
                arrayList = null;
            } else {
                arrayList = new ArrayList(list.size());
                Iterator<QueueItem> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((MediaSession.QueueItem) it.next().getQueueItem());
                }
                mediaSession = this.mSessionFwk;
            }
            mediaSession.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(CharSequence charSequence) {
            this.mSessionFwk.setQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i10) {
            this.mRatingType = i10;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {
            synchronized (this.mLock) {
                RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;
                if (registrationCallbackHandler != null) {
                    registrationCallbackHandler.removeCallbacksAndMessages(null);
                }
                if (registrationCallback != null) {
                    this.mRegistrationCallbackHandler = new RegistrationCallbackHandler(handler.getLooper(), registrationCallback);
                } else {
                    this.mRegistrationCallbackHandler = null;
                }
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0051
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int r4) {
            /*
                r3 = this;
                r0 = r3
                int r0 = r0.mRepeatMode
                r1 = r4
                if (r0 == r1) goto L50
                r0 = r3
                r1 = r4
                r0.mRepeatMode = r1
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L49
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L49
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L1e:
                r0 = r5
                if (r0 < 0) goto L3d
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L49
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L49
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L49
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onRepeatModeChanged(r1)     // Catch: java.lang.Throwable -> L49 android.os.RemoteException -> L51
            L37:
                int r5 = r5 + (-1)
                goto L1e
            L3d:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L49
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L49
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                goto L50
            L49:
                r7 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                r0 = r7
                throw r0
            L50:
                return
            L51:
                r7 = move-exception
                goto L37
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.setRepeatMode(int):void");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(PendingIntent pendingIntent) {
            this.mSessionFwk.setSessionActivity(pendingIntent);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x0051
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int r4) {
            /*
                r3 = this;
                r0 = r3
                int r0 = r0.mShuffleMode
                r1 = r4
                if (r0 == r1) goto L50
                r0 = r3
                r1 = r4
                r0.mShuffleMode = r1
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L49
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L49
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L1e:
                r0 = r5
                if (r0 < 0) goto L3d
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L49
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L49
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L49
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onShuffleModeChanged(r1)     // Catch: java.lang.Throwable -> L49 android.os.RemoteException -> L51
            L37:
                int r5 = r5 + (-1)
                goto L1e
            L3d:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L49
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L49
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                goto L50
            L49:
                r7 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
                r0 = r7
                throw r0
            L50:
                return
            L51:
                r7 = move-exception
                goto L37
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.setShuffleMode(int):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi22.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi22.class */
    public static class MediaSessionImplApi22 extends MediaSessionImplApi21 {
        public MediaSessionImplApi22(Context context, String str, InterfaceC0980d interfaceC0980d, Bundle bundle) {
            super(context, str, interfaceC0980d, bundle);
        }

        public MediaSessionImplApi22(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i10) {
            this.mSessionFwk.setRatingType(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi28.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi28.class */
    public static class MediaSessionImplApi28 extends MediaSessionImplApi22 {
        public MediaSessionImplApi28(Context context, String str, InterfaceC0980d interfaceC0980d, Bundle bundle) {
            super(context, str, interfaceC0980d, bundle);
        }

        public MediaSessionImplApi28(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public final C5148b getCurrentControllerInfo() {
            MediaSessionManager$RemoteUserInfo currentControllerInfo;
            currentControllerInfo = this.mSessionFwk.getCurrentControllerInfo();
            return new C5148b(currentControllerInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(C5148b c5148b) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi29.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplApi29.class */
    public static class MediaSessionImplApi29 extends MediaSessionImplApi28 {
        public MediaSessionImplApi29(Context context, String str, InterfaceC0980d interfaceC0980d, Bundle bundle) {
            super(context, str, interfaceC0980d, bundle);
        }

        public MediaSessionImplApi29(Object obj) {
            super(obj);
            Bundle sessionInfo;
            sessionInfo = ((MediaSession) obj).getController().getSessionInfo();
            this.mSessionInfo = sessionInfo;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21
        public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplBase.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplBase.class */
    public static class MediaSessionImplBase implements MediaSessionImpl {
        public static final int RCC_PLAYSTATE_NONE = 0;
        public final AudioManager mAudioManager;
        public volatile Callback mCallback;
        public boolean mCaptioningEnabled;
        private final Context mContext;
        public Bundle mExtras;
        private MessageHandler mHandler;
        public int mLocalStream;
        private final ComponentName mMediaButtonReceiverComponentName;
        private final PendingIntent mMediaButtonReceiverIntent;
        public MediaMetadataCompat mMetadata;
        public final String mPackageName;
        public List<QueueItem> mQueue;
        public CharSequence mQueueTitle;
        public int mRatingType;
        public final RemoteControlClient mRcc;
        public RegistrationCallbackHandler mRegistrationCallbackHandler;
        private C5148b mRemoteUserInfo;
        public int mRepeatMode;
        public PendingIntent mSessionActivity;
        public final Bundle mSessionInfo;
        public int mShuffleMode;
        public PlaybackStateCompat mState;
        private final MediaSessionStub mStub;
        public final String mTag;
        private final Token mToken;
        public AbstractC5153g mVolumeProvider;
        public int mVolumeType;
        public final Object mLock = new Object();
        public final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks = new RemoteCallbackList<>();
        public boolean mDestroyed = false;
        public boolean mIsActive = false;
        public int mFlags = 3;
        private AbstractC5153g.d mVolumeCallback = new AbstractC5153g.d(this) { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.1
            public final MediaSessionImplBase this$0;

            {
                this.this$0 = this;
            }

            @Override // p139i1.AbstractC5153g.d
            public void onVolumeChanged(AbstractC5153g abstractC5153g) {
                if (this.this$0.mVolumeProvider != abstractC5153g) {
                    return;
                }
                MediaSessionImplBase mediaSessionImplBase = this.this$0;
                this.this$0.sendVolumeInfoChanged(new ParcelableVolumeInfo(mediaSessionImplBase.mVolumeType, mediaSessionImplBase.mLocalStream, abstractC5153g.m25784c(), abstractC5153g.m25783b(), abstractC5153g.m25782a()));
            }
        };

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplBase$Command.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplBase$Command.class */
        public static final class Command {
            public final String command;
            public final Bundle extras;
            public final ResultReceiver stub;

            public Command(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.command = str;
                this.extras = bundle;
                this.stub = resultReceiver;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplBase$MediaSessionStub.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplBase$MediaSessionStub.class */
        public class MediaSessionStub extends IMediaSession.Stub {
            public final MediaSessionImplBase this$0;

            public MediaSessionStub(MediaSessionImplBase mediaSessionImplBase) {
                this.this$0 = mediaSessionImplBase;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                postToHandler(26, mediaDescriptionCompat, i10);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int i10, int i11, String str) {
                this.this$0.adjustVolume(i10, i11);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() {
                postToHandler(16);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                Bundle bundle;
                synchronized (this.this$0.mLock) {
                    bundle = this.this$0.mExtras;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                long j10;
                synchronized (this.this$0.mLock) {
                    j10 = this.this$0.mFlags;
                }
                return j10;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PendingIntent getLaunchPendingIntent() {
                PendingIntent pendingIntent;
                synchronized (this.this$0.mLock) {
                    pendingIntent = this.this$0.mSessionActivity;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                return this.this$0.mMetadata;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getPackageName() {
                return this.this$0.mPackageName;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (this.this$0.mLock) {
                    MediaSessionImplBase mediaSessionImplBase = this.this$0;
                    playbackStateCompat = mediaSessionImplBase.mState;
                    mediaMetadataCompat = mediaSessionImplBase.mMetadata;
                }
                return MediaSessionCompat.getStateWithUpdatedPosition(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public List<QueueItem> getQueue() {
                List<QueueItem> list;
                synchronized (this.this$0.mLock) {
                    list = this.this$0.mQueue;
                }
                return list;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public CharSequence getQueueTitle() {
                return this.this$0.mQueueTitle;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                return this.this$0.mRatingType;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                return this.this$0.mRepeatMode;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getSessionInfo() {
                return this.this$0.mSessionInfo == null ? null : new Bundle(this.this$0.mSessionInfo);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                return this.this$0.mShuffleMode;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public String getTag() {
                return this.this$0.mTag;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public ParcelableVolumeInfo getVolumeAttributes() {
                int i10;
                int i11;
                int streamVolume;
                int i12;
                int i13;
                synchronized (this.this$0.mLock) {
                    MediaSessionImplBase mediaSessionImplBase = this.this$0;
                    i10 = mediaSessionImplBase.mVolumeType;
                    i11 = mediaSessionImplBase.mLocalStream;
                    AbstractC5153g abstractC5153g = mediaSessionImplBase.mVolumeProvider;
                    if (i10 == 2) {
                        i13 = abstractC5153g.m25784c();
                        i12 = abstractC5153g.m25783b();
                        streamVolume = abstractC5153g.m25782a();
                    } else {
                        int streamMaxVolume = mediaSessionImplBase.mAudioManager.getStreamMaxVolume(i11);
                        streamVolume = this.this$0.mAudioManager.getStreamVolume(i11);
                        i12 = streamMaxVolume;
                        i13 = 2;
                    }
                }
                return new ParcelableVolumeInfo(i10, i11, i13, i12, streamVolume);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                return this.this$0.mCaptioningEnabled;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() {
                postToHandler(14);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() {
                postToHandler(12);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() {
                postToHandler(7);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(String str, Bundle bundle) {
                postToHandler(8, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(String str, Bundle bundle) {
                postToHandler(9, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(Uri uri, Bundle bundle) {
                postToHandler(10, uri, bundle);
            }

            public void postToHandler(int i10) {
                this.this$0.postToHandler(i10, 0, 0, null, null);
            }

            public void postToHandler(int i10, int i11) {
                this.this$0.postToHandler(i10, i11, 0, null, null);
            }

            public void postToHandler(int i10, int i11, int i12) {
                this.this$0.postToHandler(i10, i11, i12, null, null);
            }

            public void postToHandler(int i10, Object obj) {
                this.this$0.postToHandler(i10, 0, 0, obj, null);
            }

            public void postToHandler(int i10, Object obj, int i11) {
                this.this$0.postToHandler(i10, i11, 0, obj, null);
            }

            public void postToHandler(int i10, Object obj, Bundle bundle) {
                this.this$0.postToHandler(i10, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() {
                postToHandler(3);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(String str, Bundle bundle) {
                postToHandler(4, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(String str, Bundle bundle) {
                postToHandler(5, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(Uri uri, Bundle bundle) {
                postToHandler(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() {
                postToHandler(15);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(RatingCompat ratingCompat) {
                postToHandler(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
                postToHandler(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                if (this.this$0.mDestroyed) {
                    try {
                        iMediaControllerCallback.onSessionDestroyed();
                        return;
                    } catch (Exception e10) {
                        return;
                    }
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                this.this$0.mControllerCallbacks.register(iMediaControllerCallback, new C5148b(this.this$0.getPackageNameForUid(callingUid), callingPid, callingUid));
                synchronized (this.this$0.mLock) {
                    RegistrationCallbackHandler registrationCallbackHandler = this.this$0.mRegistrationCallbackHandler;
                    if (registrationCallbackHandler != null) {
                        registrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                    }
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int i10) {
                postToHandler(28, i10);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() {
                postToHandler(17);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long j10) {
                postToHandler(18, Long.valueOf(j10));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                postToHandler(1, new Command(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.mResultReceiver));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(String str, Bundle bundle) {
                postToHandler(20, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(KeyEvent keyEvent) {
                postToHandler(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean z10) {
                postToHandler(29, Boolean.valueOf(z10));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setPlaybackSpeed(float f10) {
                postToHandler(32, Float.valueOf(f10));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int i10) {
                postToHandler(23, i10);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int i10) {
                postToHandler(30, i10);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean z10) {
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int i10, int i11, String str) {
                this.this$0.setVolumeTo(i10, i11);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long j10) {
                postToHandler(11, Long.valueOf(j10));
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() {
                postToHandler(13);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                this.this$0.mControllerCallbacks.unregister(iMediaControllerCallback);
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                synchronized (this.this$0.mLock) {
                    RegistrationCallbackHandler registrationCallbackHandler = this.this$0.mRegistrationCallbackHandler;
                    if (registrationCallbackHandler != null) {
                        registrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                    }
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplBase$MessageHandler.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$MediaSessionImplBase$MessageHandler.class */
        public class MessageHandler extends Handler {
            private static final int KEYCODE_MEDIA_PAUSE = 127;
            private static final int KEYCODE_MEDIA_PLAY = 126;
            private static final int MSG_ADD_QUEUE_ITEM = 25;
            private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
            private static final int MSG_ADJUST_VOLUME = 2;
            private static final int MSG_COMMAND = 1;
            private static final int MSG_CUSTOM_ACTION = 20;
            private static final int MSG_FAST_FORWARD = 16;
            private static final int MSG_MEDIA_BUTTON = 21;
            private static final int MSG_NEXT = 14;
            private static final int MSG_PAUSE = 12;
            private static final int MSG_PLAY = 7;
            private static final int MSG_PLAY_MEDIA_ID = 8;
            private static final int MSG_PLAY_SEARCH = 9;
            private static final int MSG_PLAY_URI = 10;
            private static final int MSG_PREPARE = 3;
            private static final int MSG_PREPARE_MEDIA_ID = 4;
            private static final int MSG_PREPARE_SEARCH = 5;
            private static final int MSG_PREPARE_URI = 6;
            private static final int MSG_PREVIOUS = 15;
            private static final int MSG_RATE = 19;
            private static final int MSG_RATE_EXTRA = 31;
            private static final int MSG_REMOVE_QUEUE_ITEM = 27;
            private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
            private static final int MSG_REWIND = 17;
            private static final int MSG_SEEK_TO = 18;
            private static final int MSG_SET_CAPTIONING_ENABLED = 29;
            private static final int MSG_SET_PLAYBACK_SPEED = 32;
            private static final int MSG_SET_REPEAT_MODE = 23;
            private static final int MSG_SET_SHUFFLE_MODE = 30;
            private static final int MSG_SET_VOLUME = 22;
            private static final int MSG_SKIP_TO_ITEM = 11;
            private static final int MSG_STOP = 13;
            public final MediaSessionImplBase this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MessageHandler(MediaSessionImplBase mediaSessionImplBase, Looper looper) {
                super(looper);
                this.this$0 = mediaSessionImplBase;
            }

            private void onMediaButtonEvent(KeyEvent keyEvent, Callback callback) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = this.this$0.mState;
                long actions = playbackStateCompat == null ? 0L : playbackStateCompat.getActions();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 126) {
                        if ((actions & 4) != 0) {
                            callback.onPlay();
                            return;
                        }
                        return;
                    }
                    if (keyCode == KEYCODE_MEDIA_PAUSE) {
                        if ((actions & 2) != 0) {
                            callback.onPause();
                            return;
                        }
                        return;
                    }
                    switch (keyCode) {
                        case 86:
                            if ((actions & 1) != 0) {
                                callback.onStop();
                                break;
                            }
                            break;
                        case 87:
                            if ((actions & 32) != 0) {
                                callback.onSkipToNext();
                                break;
                            }
                            break;
                        case 88:
                            if ((actions & 16) != 0) {
                                callback.onSkipToPrevious();
                                break;
                            }
                            break;
                        case 89:
                            if ((actions & 8) != 0) {
                                callback.onRewind();
                                break;
                            }
                            break;
                        case 90:
                            if ((actions & 64) != 0) {
                                callback.onFastForward();
                                break;
                            }
                            break;
                    }
                }
                Log.w(MediaSessionCompat.TAG, "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MediaDescriptionCompat mediaDescriptionCompat;
                Callback callback = this.this$0.mCallback;
                if (callback == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.ensureClassLoader(data);
                this.this$0.setCurrentControllerInfo(new C5148b(data.getString(MediaSessionCompat.DATA_CALLING_PACKAGE), data.getInt(MediaSessionCompat.DATA_CALLING_PID), data.getInt(MediaSessionCompat.DATA_CALLING_UID)));
                Bundle bundle = data.getBundle(MediaSessionCompat.DATA_EXTRAS);
                MediaSessionCompat.ensureClassLoader(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            Command command = (Command) message.obj;
                            callback.onCommand(command.command, command.extras, command.stub);
                            break;
                        case 2:
                            this.this$0.adjustVolume(message.arg1, 0);
                            break;
                        case 3:
                            callback.onPrepare();
                            break;
                        case 4:
                            callback.onPrepareFromMediaId((String) message.obj, bundle);
                            break;
                        case 5:
                            callback.onPrepareFromSearch((String) message.obj, bundle);
                            break;
                        case 6:
                            callback.onPrepareFromUri((Uri) message.obj, bundle);
                            break;
                        case 7:
                            callback.onPlay();
                            break;
                        case 8:
                            callback.onPlayFromMediaId((String) message.obj, bundle);
                            break;
                        case 9:
                            callback.onPlayFromSearch((String) message.obj, bundle);
                            break;
                        case 10:
                            callback.onPlayFromUri((Uri) message.obj, bundle);
                            break;
                        case 11:
                            callback.onSkipToQueueItem(((Long) message.obj).longValue());
                            break;
                        case 12:
                            callback.onPause();
                            break;
                        case 13:
                            callback.onStop();
                            break;
                        case 14:
                            callback.onSkipToNext();
                            break;
                        case 15:
                            callback.onSkipToPrevious();
                            break;
                        case 16:
                            callback.onFastForward();
                            break;
                        case 17:
                            callback.onRewind();
                            break;
                        case 18:
                            callback.onSeekTo(((Long) message.obj).longValue());
                            break;
                        case 19:
                            callback.onSetRating((RatingCompat) message.obj);
                            break;
                        case 20:
                            callback.onCustomAction((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!callback.onMediaButtonEvent(intent)) {
                                onMediaButtonEvent(keyEvent, callback);
                                break;
                            }
                            break;
                        case 22:
                            this.this$0.setVolumeTo(message.arg1, 0);
                            break;
                        case 23:
                            callback.onSetRepeatMode(message.arg1);
                            break;
                        case 25:
                            callback.onAddQueueItem((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            callback.onAddQueueItem((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            mediaDescriptionCompat = (MediaDescriptionCompat) message.obj;
                            callback.onRemoveQueueItem(mediaDescriptionCompat);
                            break;
                        case 28:
                            List<QueueItem> list = this.this$0.mQueue;
                            if (list != null) {
                                int i10 = message.arg1;
                                QueueItem queueItem = (i10 < 0 || i10 >= list.size()) ? null : this.this$0.mQueue.get(message.arg1);
                                if (queueItem != null) {
                                    mediaDescriptionCompat = queueItem.getDescription();
                                    callback.onRemoveQueueItem(mediaDescriptionCompat);
                                    break;
                                }
                            }
                            break;
                        case 29:
                            callback.onSetCaptioningEnabled(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            callback.onSetShuffleMode(message.arg1);
                            break;
                        case 31:
                            callback.onSetRating((RatingCompat) message.obj, bundle);
                            break;
                        case 32:
                            callback.onSetPlaybackSpeed(((Float) message.obj).floatValue());
                            break;
                    }
                } finally {
                    this.this$0.setCurrentControllerInfo(null);
                }
            }
        }

        public MediaSessionImplBase(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, InterfaceC0980d interfaceC0980d, Bundle bundle) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
            }
            this.mContext = context;
            this.mPackageName = context.getPackageName();
            this.mSessionInfo = bundle;
            this.mAudioManager = (AudioManager) context.getSystemService("audio");
            this.mTag = str;
            this.mMediaButtonReceiverComponentName = componentName;
            this.mMediaButtonReceiverIntent = pendingIntent;
            MediaSessionStub mediaSessionStub = new MediaSessionStub(this);
            this.mStub = mediaSessionStub;
            this.mToken = new Token(mediaSessionStub, null, interfaceC0980d);
            this.mRatingType = 0;
            this.mVolumeType = 1;
            this.mLocalStream = 3;
            this.mRcc = new RemoteControlClient(pendingIntent);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0041
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendCaptioningEnabled(boolean r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L11:
                r0 = r5
                if (r0 < 0) goto L30
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onCaptioningEnabledChanged(r1)     // Catch: java.lang.Throwable -> L3a android.os.RemoteException -> L41
            L2a:
                int r5 = r5 + (-1)
                goto L11
            L30:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r7 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                r0 = r7
                throw r0
            L41:
                r7 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendCaptioningEnabled(boolean):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0044
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendEvent(java.lang.String r5, android.os.Bundle r6) {
            /*
                r4 = this;
                r0 = r4
                java.lang.Object r0 = r0.mLock
                r8 = r0
                r0 = r8
                monitor-enter(r0)
                r0 = r4
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3e
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3e
                r1 = 1
                int r0 = r0 - r1
                r7 = r0
            L13:
                r0 = r7
                if (r0 < 0) goto L33
                r0 = r4
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3e
                r1 = r7
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3e
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3e
                r9 = r0
                r0 = r9
                r1 = r5
                r2 = r6
                r0.onEvent(r1, r2)     // Catch: java.lang.Throwable -> L3e android.os.RemoteException -> L44
            L2d:
                int r7 = r7 + (-1)
                goto L13
            L33:
                r0 = r4
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3e
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3e
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
                return
            L3e:
                r5 = move-exception
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
                r0 = r5
                throw r0
            L44:
                r9 = move-exception
                goto L2d
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendEvent(java.lang.String, android.os.Bundle):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendExtras(android.os.Bundle r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L11:
                r0 = r5
                if (r0 < 0) goto L30
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onExtrasChanged(r1)     // Catch: java.lang.Throwable -> L3a android.os.RemoteException -> L3f
            L2a:
                int r5 = r5 + (-1)
                goto L11
            L30:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r4 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                r0 = r4
                throw r0
            L3f:
                r7 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendExtras(android.os.Bundle):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendMetadata(android.support.v4.media.MediaMetadataCompat r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L11:
                r0 = r5
                if (r0 < 0) goto L30
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onMetadataChanged(r1)     // Catch: java.lang.Throwable -> L3a android.os.RemoteException -> L3f
            L2a:
                int r5 = r5 + (-1)
                goto L11
            L30:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r4 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                r0 = r4
                throw r0
            L3f:
                r7 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendMetadata(android.support.v4.media.MediaMetadataCompat):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L11:
                r0 = r5
                if (r0 < 0) goto L30
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onQueueChanged(r1)     // Catch: java.lang.Throwable -> L3a android.os.RemoteException -> L3f
            L2a:
                int r5 = r5 + (-1)
                goto L11
            L30:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r4 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                r0 = r4
                throw r0
            L3f:
                r7 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendQueue(java.util.List):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendQueueTitle(java.lang.CharSequence r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L11:
                r0 = r5
                if (r0 < 0) goto L30
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onQueueTitleChanged(r1)     // Catch: java.lang.Throwable -> L3a android.os.RemoteException -> L3f
            L2a:
                int r5 = r5 + (-1)
                goto L11
            L30:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r4 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                r0 = r4
                throw r0
            L3f:
                r7 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendQueueTitle(java.lang.CharSequence):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0041
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendRepeatMode(int r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L11:
                r0 = r5
                if (r0 < 0) goto L30
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onRepeatModeChanged(r1)     // Catch: java.lang.Throwable -> L3a android.os.RemoteException -> L41
            L2a:
                int r5 = r5 + (-1)
                goto L11
            L30:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r7 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                r0 = r7
                throw r0
            L41:
                r7 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendRepeatMode(int):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0043
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendSessionDestroyed() {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r5 = r0
                r0 = r5
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3e
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3e
                r1 = 1
                int r0 = r0 - r1
                r4 = r0
            L11:
                r0 = r4
                if (r0 < 0) goto L2d
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3e
                r1 = r4
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3e
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3e
                r6 = r0
                r0 = r6
                r0.onSessionDestroyed()     // Catch: java.lang.Throwable -> L3e android.os.RemoteException -> L43
            L27:
                int r4 = r4 + (-1)
                goto L11
            L2d:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3e
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3e
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3e
                r0.kill()     // Catch: java.lang.Throwable -> L3e
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
                return
            L3e:
                r6 = move-exception
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
                r0 = r6
                throw r0
            L43:
                r6 = move-exception
                goto L27
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendSessionDestroyed():void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0041
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendShuffleMode(int r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L11:
                r0 = r5
                if (r0 < 0) goto L30
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onShuffleModeChanged(r1)     // Catch: java.lang.Throwable -> L3a android.os.RemoteException -> L41
            L2a:
                int r5 = r5 + (-1)
                goto L11
            L30:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r7 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                r0 = r7
                throw r0
            L41:
                r7 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendShuffleMode(int):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        private void sendState(android.support.v4.media.session.PlaybackStateCompat r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L11:
                r0 = r5
                if (r0 < 0) goto L30
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onPlaybackStateChanged(r1)     // Catch: java.lang.Throwable -> L3a android.os.RemoteException -> L3f
            L2a:
                int r5 = r5 + (-1)
                goto L11
            L30:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r4 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                r0 = r4
                throw r0
            L3f:
                r7 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendState(android.support.v4.media.session.PlaybackStateCompat):void");
        }

        public void adjustVolume(int i10, int i11) {
            if (this.mVolumeType != 2) {
                this.mAudioManager.adjustStreamVolume(this.mLocalStream, i10, i11);
                return;
            }
            AbstractC5153g abstractC5153g = this.mVolumeProvider;
            if (abstractC5153g != null) {
                abstractC5153g.mo25786e(i10);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        
            r7 = r8.copy(r8.getConfig(), false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        
            r0.putBitmap(100, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0058, code lost:
        
            if (r8 != null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            if (r8 != null) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.media.RemoteControlClient.MetadataEditor buildRccMetadata(android.os.Bundle r6) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.buildRccMetadata(android.os.Bundle):android.media.RemoteControlClient$MetadataEditor");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Callback getCallback() {
            Callback callback;
            synchronized (this.mLock) {
                callback = this.mCallback;
            }
            return callback;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public String getCallingPackage() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public C5148b getCurrentControllerInfo() {
            C5148b c5148b;
            synchronized (this.mLock) {
                c5148b = this.mRemoteUserInfo;
            }
            return c5148b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getMediaSession() {
            return null;
        }

        public String getPackageNameForUid(int i10) {
            String nameForUid = this.mContext.getPackageManager().getNameForUid(i10);
            String str = nameForUid;
            if (TextUtils.isEmpty(nameForUid)) {
                str = "android.media.session.MediaController";
            }
            return str;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.mLock) {
                playbackStateCompat = this.mState;
            }
            return playbackStateCompat;
        }

        public int getRccStateFromState(int i10) {
            switch (i10) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public int getRccTransportControlFlagsFromActions(long j10) {
            int i10 = (1 & j10) != 0 ? 32 : 0;
            int i11 = i10;
            if ((2 & j10) != 0) {
                i11 = i10 | 16;
            }
            int i12 = i11;
            if ((4 & j10) != 0) {
                i12 = i11 | 4;
            }
            int i13 = i12;
            if ((8 & j10) != 0) {
                i13 = i12 | 2;
            }
            int i14 = i13;
            if ((16 & j10) != 0) {
                i14 = i13 | 1;
            }
            int i15 = i14;
            if ((32 & j10) != 0) {
                i15 = i14 | 128;
            }
            int i16 = i15;
            if ((64 & j10) != 0) {
                i16 = i15 | 64;
            }
            int i17 = i16;
            if ((j10 & 512) != 0) {
                i17 = i16 | 8;
            }
            return i17;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Object getRemoteControlClient() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public Token getSessionToken() {
            return this.mToken;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
            return this.mIsActive;
        }

        public void postToHandler(int i10, int i11, int i12, Object obj, Bundle bundle) {
            synchronized (this.mLock) {
                MessageHandler messageHandler = this.mHandler;
                if (messageHandler != null) {
                    Message obtainMessage = messageHandler.obtainMessage(i10, i11, i12, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt(MediaSessionCompat.DATA_CALLING_UID, callingUid);
                    bundle2.putString(MediaSessionCompat.DATA_CALLING_PACKAGE, getPackageNameForUid(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt(MediaSessionCompat.DATA_CALLING_PID, callingPid);
                    } else {
                        bundle2.putInt(MediaSessionCompat.DATA_CALLING_PID, -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle(MediaSessionCompat.DATA_EXTRAS, bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            this.mAudioManager.registerMediaButtonEventReceiver(componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
            this.mIsActive = false;
            this.mDestroyed = true;
            updateMbrAndRcc();
            sendSessionDestroyed();
            setCallback(null, null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(String str, Bundle bundle) {
            sendEvent(str, bundle);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        public void sendVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo r4) {
            /*
                r3 = this;
                r0 = r3
                java.lang.Object r0 = r0.mLock
                r6 = r0
                r0 = r6
                monitor-enter(r0)
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                int r0 = r0.beginBroadcast()     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                int r0 = r0 - r1
                r5 = r0
            L11:
                r0 = r5
                if (r0 < 0) goto L30
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r1 = r5
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L3a
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0     // Catch: java.lang.Throwable -> L3a
                r7 = r0
                r0 = r7
                r1 = r4
                r0.onVolumeInfoChanged(r1)     // Catch: java.lang.Throwable -> L3a android.os.RemoteException -> L3f
            L2a:
                int r5 = r5 + (-1)
                goto L11
            L30:
                r0 = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks     // Catch: java.lang.Throwable -> L3a
                r0.finishBroadcast()     // Catch: java.lang.Throwable -> L3a
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r4 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
                r0 = r4
                throw r0
            L3f:
                r7 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.sendVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo):void");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean z10) {
            if (z10 == this.mIsActive) {
                return;
            }
            this.mIsActive = z10;
            updateMbrAndRcc();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(Callback callback, Handler handler) {
            synchronized (this.mLock) {
                MessageHandler messageHandler = this.mHandler;
                if (messageHandler != null) {
                    messageHandler.removeCallbacksAndMessages(null);
                }
                this.mHandler = (callback == null || handler == null) ? null : new MessageHandler(this, handler.getLooper());
                if (this.mCallback != callback && this.mCallback != null) {
                    this.mCallback.setSessionImpl(null, null);
                }
                this.mCallback = callback;
                if (this.mCallback != null) {
                    this.mCallback.setSessionImpl(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean z10) {
            if (this.mCaptioningEnabled != z10) {
                this.mCaptioningEnabled = z10;
                sendCaptioningEnabled(z10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(C5148b c5148b) {
            synchronized (this.mLock) {
                this.mRemoteUserInfo = c5148b;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(Bundle bundle) {
            this.mExtras = bundle;
            sendExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setFlags(int i10) {
            synchronized (this.mLock) {
                this.mFlags = i10 | 1 | 2;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadataCompat mediaMetadataCompat2 = mediaMetadataCompat;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat2 = new MediaMetadataCompat.Builder(mediaMetadataCompat, MediaSessionCompat.sMaxBitmapSize).build();
            }
            synchronized (this.mLock) {
                this.mMetadata = mediaMetadataCompat2;
            }
            sendMetadata(mediaMetadataCompat2);
            if (this.mIsActive) {
                buildRccMetadata(mediaMetadataCompat2 == null ? null : mediaMetadataCompat2.getBundle()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.mLock) {
                this.mState = playbackStateCompat;
            }
            sendState(playbackStateCompat);
            if (this.mIsActive) {
                if (playbackStateCompat == null) {
                    this.mRcc.setPlaybackState(0);
                    this.mRcc.setTransportControlFlags(0);
                } else {
                    setRccState(playbackStateCompat);
                    this.mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackStateCompat.getActions()));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int i10) {
            AbstractC5153g abstractC5153g = this.mVolumeProvider;
            if (abstractC5153g != null) {
                abstractC5153g.m25788g(null);
            }
            this.mLocalStream = i10;
            this.mVolumeType = 1;
            int i11 = this.mVolumeType;
            int i12 = this.mLocalStream;
            sendVolumeInfoChanged(new ParcelableVolumeInfo(i11, i12, 2, this.mAudioManager.getStreamMaxVolume(i12), this.mAudioManager.getStreamVolume(this.mLocalStream)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(AbstractC5153g abstractC5153g) {
            if (abstractC5153g == null) {
                throw new IllegalArgumentException("volumeProvider may not be null");
            }
            AbstractC5153g abstractC5153g2 = this.mVolumeProvider;
            if (abstractC5153g2 != null) {
                abstractC5153g2.m25788g(null);
            }
            this.mVolumeType = 2;
            this.mVolumeProvider = abstractC5153g;
            sendVolumeInfoChanged(new ParcelableVolumeInfo(this.mVolumeType, this.mLocalStream, this.mVolumeProvider.m25784c(), this.mVolumeProvider.m25783b(), this.mVolumeProvider.m25782a()));
            abstractC5153g.m25788g(this.mVolumeCallback);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(List<QueueItem> list) {
            this.mQueue = list;
            sendQueue(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(CharSequence charSequence) {
            this.mQueueTitle = charSequence;
            sendQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int i10) {
            this.mRatingType = i10;
        }

        public void setRccState(PlaybackStateCompat playbackStateCompat) {
            this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {
            synchronized (this.mLock) {
                RegistrationCallbackHandler registrationCallbackHandler = this.mRegistrationCallbackHandler;
                if (registrationCallbackHandler != null) {
                    registrationCallbackHandler.removeCallbacksAndMessages(null);
                }
                if (registrationCallback != null) {
                    this.mRegistrationCallbackHandler = new RegistrationCallbackHandler(handler.getLooper(), registrationCallback);
                } else {
                    this.mRegistrationCallbackHandler = null;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int i10) {
            if (this.mRepeatMode != i10) {
                this.mRepeatMode = i10;
                sendRepeatMode(i10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(PendingIntent pendingIntent) {
            synchronized (this.mLock) {
                this.mSessionActivity = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int i10) {
            if (this.mShuffleMode != i10) {
                this.mShuffleMode = i10;
                sendShuffleMode(i10);
            }
        }

        public void setVolumeTo(int i10, int i11) {
            if (this.mVolumeType != 2) {
                this.mAudioManager.setStreamVolume(this.mLocalStream, i10, i11);
                return;
            }
            AbstractC5153g abstractC5153g = this.mVolumeProvider;
            if (abstractC5153g != null) {
                abstractC5153g.mo25787f(i10);
            }
        }

        public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
            this.mAudioManager.unregisterMediaButtonEventReceiver(componentName);
        }

        public void updateMbrAndRcc() {
            if (!this.mIsActive) {
                unregisterMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
                this.mRcc.setPlaybackState(0);
                this.mAudioManager.unregisterRemoteControlClient(this.mRcc);
            } else {
                registerMediaButtonEventReceiver(this.mMediaButtonReceiverIntent, this.mMediaButtonReceiverComponentName);
                this.mAudioManager.registerRemoteControlClient(this.mRcc);
                setMetadata(this.mMetadata);
                setPlaybackState(this.mState);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$OnActiveChangeListener.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$OnActiveChangeListener.class */
    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$QueueItem.class
     */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$QueueItem.class */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        };
        public static final int UNKNOWN_ID = -1;
        private final MediaDescriptionCompat mDescription;
        private final long mId;
        private MediaSession.QueueItem mItemFwk;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:android/support/v4/media/session/MediaSessionCompat$QueueItem$Api21Impl.class
         */
        /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$QueueItem$Api21Impl.class */
        public static class Api21Impl {
            private Api21Impl() {
            }

            public static MediaSession.QueueItem createQueueItem(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            public static MediaDescription getDescription(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long getQueueId(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.mDescription = mediaDescriptionCompat;
            this.mId = j10;
            this.mItemFwk = queueItem;
        }

        public QueueItem(Parcel parcel) {
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            this(null, mediaDescriptionCompat, j10);
        }

        public static QueueItem fromQueueItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.fromMediaDescription(Api21Impl.getDescription(queueItem)), Api21Impl.getQueueId(queueItem));
        }

        public static List<QueueItem> fromQueueItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromQueueItem(it.next()));
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

        public long getQueueId() {
            return this.mId;
        }

        public Object getQueueItem() {
            MediaSession.QueueItem queueItem = this.mItemFwk;
            MediaSession.QueueItem queueItem2 = queueItem;
            if (queueItem == null) {
                queueItem2 = Api21Impl.createQueueItem((MediaDescription) this.mDescription.getMediaDescription(), this.mId);
                this.mItemFwk = queueItem2;
            }
            return queueItem2;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.mDescription + ", Id=" + this.mId + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.mDescription.writeToParcel(parcel, i10);
            parcel.writeLong(this.mId);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$RegistrationCallback.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$RegistrationCallback.class */
    public interface RegistrationCallback {
        void onCallbackRegistered(int i10, int i11);

        void onCallbackUnregistered(int i10, int i11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$RegistrationCallbackHandler.class
     */
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$RegistrationCallbackHandler.class */
    public static final class RegistrationCallbackHandler extends Handler {
        private static final int MSG_CALLBACK_REGISTERED = 1001;
        private static final int MSG_CALLBACK_UNREGISTERED = 1002;
        private final RegistrationCallback mCallback;

        public RegistrationCallbackHandler(Looper looper, RegistrationCallback registrationCallback) {
            super(looper);
            this.mCallback = registrationCallback;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1001) {
                this.mCallback.onCallbackRegistered(message.arg1, message.arg2);
            } else {
                if (i10 != 1002) {
                    return;
                }
                this.mCallback.onCallbackUnregistered(message.arg1, message.arg2);
            }
        }

        public void postCallbackRegistered(int i10, int i11) {
            obtainMessage(1001, i10, i11).sendToTarget();
        }

        public void postCallbackUnregistered(int i10, int i11) {
            obtainMessage(1002, i10, i11).sendToTarget();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper.class
     */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper.class */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        };
        public ResultReceiver mResultReceiver;

        public ResultReceiverWrapper(Parcel parcel) {
            this.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.mResultReceiver = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.mResultReceiver.writeToParcel(parcel, i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:android/support/v4/media/session/MediaSessionCompat$Token.class
     */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: combined.jar:classes1.jar:android/support/v4/media/session/MediaSessionCompat$Token.class */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        };
        private IMediaSession mExtraBinder;
        private final Object mInner;
        private final Object mLock;
        private InterfaceC0980d mSession2Token;

        public Token(Object obj) {
            this(obj, null, null);
        }

        public Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        public Token(Object obj, IMediaSession iMediaSession, InterfaceC0980d interfaceC0980d) {
            this.mLock = new Object();
            this.mInner = obj;
            this.mExtraBinder = iMediaSession;
            this.mSession2Token = interfaceC0980d;
        }

        public static Token fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            IMediaSession asInterface = IMediaSession.Stub.asInterface(C0950k.m5671a(bundle, MediaSessionCompat.KEY_EXTRA_BINDER));
            InterfaceC0980d m5835b = C0977a.m5835b(bundle, MediaSessionCompat.KEY_SESSION2_TOKEN);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.KEY_TOKEN);
            return token == null ? null : new Token(token.mInner, asInterface, m5835b);
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, null);
        }

        public static Token fromToken(Object obj, IMediaSession iMediaSession) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, iMediaSession);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.mInner;
            Object obj3 = ((Token) obj).mInner;
            if (obj2 == null) {
                if (obj3 != null) {
                    z10 = false;
                }
                return z10;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public IMediaSession getExtraBinder() {
            IMediaSession iMediaSession;
            synchronized (this.mLock) {
                iMediaSession = this.mExtraBinder;
            }
            return iMediaSession;
        }

        public InterfaceC0980d getSession2Token() {
            InterfaceC0980d interfaceC0980d;
            synchronized (this.mLock) {
                interfaceC0980d = this.mSession2Token;
            }
            return interfaceC0980d;
        }

        public Object getToken() {
            return this.mInner;
        }

        public int hashCode() {
            Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void setExtraBinder(IMediaSession iMediaSession) {
            synchronized (this.mLock) {
                this.mExtraBinder = iMediaSession;
            }
        }

        public void setSession2Token(InterfaceC0980d interfaceC0980d) {
            synchronized (this.mLock) {
                this.mSession2Token = interfaceC0980d;
            }
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.KEY_TOKEN, this);
            synchronized (this.mLock) {
                IMediaSession iMediaSession = this.mExtraBinder;
                if (iMediaSession != null) {
                    C0950k.m5672b(bundle, MediaSessionCompat.KEY_EXTRA_BINDER, iMediaSession.asBinder());
                }
                InterfaceC0980d interfaceC0980d = this.mSession2Token;
                if (interfaceC0980d != null) {
                    C0977a.m5836c(bundle, MediaSessionCompat.KEY_SESSION2_TOKEN, interfaceC0980d);
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.mInner, i10);
        }
    }

    private MediaSessionCompat(Context context, MediaSessionImpl mediaSessionImpl) {
        this.mActiveListeners = new ArrayList<>();
        this.mImpl = mediaSessionImpl;
        this.mController = new MediaControllerCompat(context, this);
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, InterfaceC0980d interfaceC0980d) {
        this.mActiveListeners = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        ComponentName componentName2 = componentName;
        if (componentName == null) {
            ComponentName m27209a = C5453a.m27209a(context);
            componentName2 = m27209a;
            if (m27209a == null) {
                Log.w(TAG, "Couldn't find a unique registered media button receiver in the given context.");
                componentName2 = m27209a;
            }
        }
        PendingIntent pendingIntent2 = pendingIntent;
        if (componentName2 != null) {
            pendingIntent2 = pendingIntent;
            if (pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName2);
                pendingIntent2 = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        this.mImpl = i10 >= 29 ? new MediaSessionImplApi29(context, str, interfaceC0980d, bundle) : i10 >= 28 ? new MediaSessionImplApi28(context, str, interfaceC0980d, bundle) : i10 >= 22 ? new MediaSessionImplApi22(context, str, interfaceC0980d, bundle) : new MediaSessionImplApi21(context, str, interfaceC0980d, bundle);
        setCallback(new Callback(this) { // from class: android.support.v4.media.session.MediaSessionCompat.1
            public final MediaSessionCompat this$0;

            {
                this.this$0 = this;
            }
        }, new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.mImpl.setMediaButtonReceiver(pendingIntent2);
        this.mController = new MediaControllerCompat(context, this);
        if (sMaxBitmapSize == 0) {
            sMaxBitmapSize = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object obj) {
        int i10 = Build.VERSION.SDK_INT;
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, i10 >= 29 ? new MediaSessionImplApi29(obj) : i10 >= 28 ? new MediaSessionImplApi28(obj) : new MediaSessionImplApi21(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r8.getState() == 5) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.session.PlaybackStateCompat getStateWithUpdatedPosition(android.support.v4.media.session.PlaybackStateCompat r8, android.support.v4.media.MediaMetadataCompat r9) {
        /*
            r0 = r8
            r18 = r0
            r0 = r8
            if (r0 == 0) goto Lb5
            r0 = r8
            long r0 = r0.getPosition()
            r10 = r0
            r0 = -1
            r12 = r0
            r0 = r10
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1f
            r0 = r8
            r18 = r0
            goto Lb5
        L1f:
            r0 = r8
            int r0 = r0.getState()
            r1 = 3
            if (r0 == r1) goto L3a
            r0 = r8
            int r0 = r0.getState()
            r1 = 4
            if (r0 == r1) goto L3a
            r0 = r8
            r18 = r0
            r0 = r8
            int r0 = r0.getState()
            r1 = 5
            if (r0 != r1) goto Lb5
        L3a:
            r0 = r8
            long r0 = r0.getLastPositionUpdateTime()
            r10 = r0
            r0 = r8
            r18 = r0
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            long r0 = android.os.SystemClock.elapsedRealtime()
            r16 = r0
            r0 = r8
            float r0 = r0.getPlaybackSpeed()
            r1 = r16
            r2 = r10
            long r1 = r1 - r2
            float r1 = (float) r1
            float r0 = r0 * r1
            long r0 = (long) r0
            r1 = r8
            long r1 = r1.getPosition()
            long r0 = r0 + r1
            r14 = r0
            r0 = r12
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L7b
            r0 = r12
            r10 = r0
            r0 = r9
            java.lang.String r1 = "android.media.metadata.DURATION"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L7b
            r0 = r9
            java.lang.String r1 = "android.media.metadata.DURATION"
            long r0 = r0.getLong(r1)
            r10 = r0
        L7b:
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L8b
            r0 = r14
            r1 = r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8b
            goto L9a
        L8b:
            r0 = r14
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L97
            r0 = 0
            r10 = r0
            goto L9a
        L97:
            r0 = r14
            r10 = r0
        L9a:
            android.support.v4.media.session.PlaybackStateCompat$Builder r0 = new android.support.v4.media.session.PlaybackStateCompat$Builder
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r1 = r8
            int r1 = r1.getState()
            r2 = r10
            r3 = r8
            float r3 = r3.getPlaybackSpeed()
            r4 = r16
            android.support.v4.media.session.PlaybackStateCompat$Builder r0 = r0.setState(r1, r2, r3, r4)
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.build()
            r18 = r0
        Lb5:
            r0 = r18
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.getStateWithUpdatedPosition(android.support.v4.media.session.PlaybackStateCompat, android.support.v4.media.MediaMetadataCompat):android.support.v4.media.session.PlaybackStateCompat");
    }

    public static Bundle unparcelWithClassLoader(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ensureClassLoader(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException e10) {
            Log.e(TAG, "Could not unparcel the data.");
            return null;
        }
    }

    public void addOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.mActiveListeners.add(onActiveChangeListener);
    }

    public String getCallingPackage() {
        return this.mImpl.getCallingPackage();
    }

    public MediaControllerCompat getController() {
        return this.mController;
    }

    public final C5148b getCurrentControllerInfo() {
        return this.mImpl.getCurrentControllerInfo();
    }

    public Object getMediaSession() {
        return this.mImpl.getMediaSession();
    }

    public Object getRemoteControlClient() {
        return this.mImpl.getRemoteControlClient();
    }

    public Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public boolean isActive() {
        return this.mImpl.isActive();
    }

    public void release() {
        this.mImpl.release();
    }

    public void removeOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.mActiveListeners.remove(onActiveChangeListener);
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.mImpl.sendSessionEvent(str, bundle);
    }

    public void setActive(boolean z10) {
        this.mImpl.setActive(z10);
        Iterator<OnActiveChangeListener> it = this.mActiveListeners.iterator();
        while (it.hasNext()) {
            it.next().onActiveChanged();
        }
    }

    public void setCallback(Callback callback) {
        setCallback(callback, null);
    }

    public void setCallback(Callback callback, Handler handler) {
        if (callback == null) {
            this.mImpl.setCallback(null, null);
            return;
        }
        MediaSessionImpl mediaSessionImpl = this.mImpl;
        if (handler == null) {
            handler = new Handler();
        }
        mediaSessionImpl.setCallback(callback, handler);
    }

    public void setCaptioningEnabled(boolean z10) {
        this.mImpl.setCaptioningEnabled(z10);
    }

    public void setExtras(Bundle bundle) {
        this.mImpl.setExtras(bundle);
    }

    public void setFlags(int i10) {
        this.mImpl.setFlags(i10);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.mImpl.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.mImpl.setMetadata(mediaMetadataCompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.mImpl.setPlaybackState(playbackStateCompat);
    }

    public void setPlaybackToLocal(int i10) {
        this.mImpl.setPlaybackToLocal(i10);
    }

    public void setPlaybackToRemote(AbstractC5153g abstractC5153g) {
        if (abstractC5153g == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.mImpl.setPlaybackToRemote(abstractC5153g);
    }

    public void setQueue(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.getQueueId()))) {
                    Log.e(TAG, "Found duplicate queue id: " + queueItem.getQueueId(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(queueItem.getQueueId()));
            }
        }
        this.mImpl.setQueue(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mImpl.setQueueTitle(charSequence);
    }

    public void setRatingType(int i10) {
        this.mImpl.setRatingType(i10);
    }

    public void setRegistrationCallback(RegistrationCallback registrationCallback, Handler handler) {
        this.mImpl.setRegistrationCallback(registrationCallback, handler);
    }

    public void setRepeatMode(int i10) {
        this.mImpl.setRepeatMode(i10);
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.mImpl.setSessionActivity(pendingIntent);
    }

    public void setShuffleMode(int i10) {
        this.mImpl.setShuffleMode(i10);
    }
}
