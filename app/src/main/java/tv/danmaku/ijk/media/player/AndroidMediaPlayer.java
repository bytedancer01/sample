package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.media.TimedText;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import tv.danmaku.ijk.media.player.misc.AndroidTrackInfo;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.pragma.DebugLog;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/AndroidMediaPlayer.class */
public class AndroidMediaPlayer extends AbstractMediaPlayer {
    private static MediaInfo sMediaInfo;
    private String mDataSource;
    private final Object mInitLock;
    private final AndroidMediaPlayerListenerHolder mInternalListenerAdapter;
    private final MediaPlayer mInternalMediaPlayer;
    private boolean mIsReleased;
    private MediaDataSource mMediaDataSource;

    /* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/AndroidMediaPlayer$AndroidMediaPlayerListenerHolder.class */
    public class AndroidMediaPlayerListenerHolder implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnTimedTextListener {
        public final WeakReference<AndroidMediaPlayer> mWeakMediaPlayer;
        public final AndroidMediaPlayer this$0;

        public AndroidMediaPlayerListenerHolder(AndroidMediaPlayer androidMediaPlayer, AndroidMediaPlayer androidMediaPlayer2) {
            this.this$0 = androidMediaPlayer;
            this.mWeakMediaPlayer = new WeakReference<>(androidMediaPlayer2);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            this.this$0.notifyOnBufferingUpdate(i10);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            this.this$0.notifyOnCompletion();
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            return this.mWeakMediaPlayer.get() != null && this.this$0.notifyOnError(i10, i11);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            return this.mWeakMediaPlayer.get() != null && this.this$0.notifyOnInfo(i10, i11);
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            this.this$0.notifyOnPrepared();
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            this.this$0.notifyOnSeekComplete();
        }

        @Override // android.media.MediaPlayer.OnTimedTextListener
        public void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            IjkTimedText ijkTimedText = null;
            if (timedText != null) {
                ijkTimedText = new IjkTimedText(timedText.getBounds(), timedText.getText());
            }
            this.this$0.notifyOnTimedText(ijkTimedText);
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            if (this.mWeakMediaPlayer.get() == null) {
                return;
            }
            this.this$0.notifyOnVideoSizeChanged(i10, i11, 1, 1);
        }
    }

    @TargetApi(23)
    /* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/AndroidMediaPlayer$MediaDataSourceProxy.class */
    public static class MediaDataSourceProxy extends MediaDataSource {
        private final IMediaDataSource mMediaDataSource;

        public MediaDataSourceProxy(IMediaDataSource iMediaDataSource) {
            this.mMediaDataSource = iMediaDataSource;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mMediaDataSource.close();
        }

        public long getSize() {
            return this.mMediaDataSource.getSize();
        }

        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            return this.mMediaDataSource.readAt(j10, bArr, i10, i11);
        }
    }

    public AndroidMediaPlayer() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.mInitLock = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.mInternalMediaPlayer = mediaPlayer;
        }
        mediaPlayer.setAudioStreamType(3);
        this.mInternalListenerAdapter = new AndroidMediaPlayerListenerHolder(this, this);
        attachInternalListeners();
    }

    private void attachInternalListeners() {
        this.mInternalMediaPlayer.setOnPreparedListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnBufferingUpdateListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnCompletionListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnSeekCompleteListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnVideoSizeChangedListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnErrorListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnInfoListener(this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnTimedTextListener(this.mInternalListenerAdapter);
    }

    private void releaseMediaDataSource() {
        MediaDataSource mediaDataSource = this.mMediaDataSource;
        if (mediaDataSource != null) {
            try {
                mediaDataSource.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            this.mMediaDataSource = null;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
        return this.mInternalMediaPlayer.getAudioSessionId();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        try {
            return this.mInternalMediaPlayer.getCurrentPosition();
        } catch (IllegalStateException e10) {
            DebugLog.printStackTrace(e10);
            return 0L;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return this.mDataSource;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
        try {
            return this.mInternalMediaPlayer.getDuration();
        } catch (IllegalStateException e10) {
            DebugLog.printStackTrace(e10);
            return 0L;
        }
    }

    public MediaPlayer getInternalMediaPlayer() {
        return this.mInternalMediaPlayer;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
        if (sMediaInfo == null) {
            MediaInfo mediaInfo = new MediaInfo();
            mediaInfo.mVideoDecoder = "android";
            mediaInfo.mVideoDecoderImpl = "HW";
            mediaInfo.mAudioDecoder = "android";
            mediaInfo.mAudioDecoderImpl = "HW";
            sMediaInfo = mediaInfo;
        }
        return sMediaInfo;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public ITrackInfo[] getTrackInfo() {
        return AndroidTrackInfo.fromMediaPlayer(this.mInternalMediaPlayer);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return this.mInternalMediaPlayer.getVideoHeight();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return 1;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return 1;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return this.mInternalMediaPlayer.getVideoWidth();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
        return this.mInternalMediaPlayer.isLooping();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        try {
            return this.mInternalMediaPlayer.isPlaying();
        } catch (IllegalStateException e10) {
            DebugLog.printStackTrace(e10);
            return false;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() {
        this.mInternalMediaPlayer.pause();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() {
        this.mInternalMediaPlayer.prepareAsync();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
        this.mIsReleased = true;
        this.mInternalMediaPlayer.release();
        releaseMediaDataSource();
        resetListeners();
        attachInternalListeners();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
        try {
            this.mInternalMediaPlayer.reset();
        } catch (IllegalStateException e10) {
            DebugLog.printStackTrace(e10);
        }
        releaseMediaDataSource();
        resetListeners();
        attachInternalListeners();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j10) {
        this.mInternalMediaPlayer.seekTo((int) j10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i10) {
        this.mInternalMediaPlayer.setAudioStreamType(i10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) {
        this.mInternalMediaPlayer.setDataSource(context, uri);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        this.mInternalMediaPlayer.setDataSource(context, uri, map);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) {
        this.mInternalMediaPlayer.setDataSource(fileDescriptor);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) {
        this.mDataSource = str;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE)) {
            this.mInternalMediaPlayer.setDataSource(str);
        } else {
            this.mInternalMediaPlayer.setDataSource(parse.getPath());
        }
    }

    @Override // tv.danmaku.ijk.media.player.AbstractMediaPlayer, tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(23)
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        releaseMediaDataSource();
        MediaDataSourceProxy mediaDataSourceProxy = new MediaDataSourceProxy(iMediaDataSource);
        this.mMediaDataSource = mediaDataSourceProxy;
        this.mInternalMediaPlayer.setDataSource(mediaDataSourceProxy);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        synchronized (this.mInitLock) {
            if (!this.mIsReleased) {
                this.mInternalMediaPlayer.setDisplay(surfaceHolder);
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z10) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z10) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z10) {
        this.mInternalMediaPlayer.setLooping(z10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z10) {
        this.mInternalMediaPlayer.setScreenOnWhilePlaying(z10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setSurface(Surface surface) {
        this.mInternalMediaPlayer.setSurface(surface);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f10, float f11) {
        this.mInternalMediaPlayer.setVolume(f10, f11);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setWakeMode(Context context, int i10) {
        this.mInternalMediaPlayer.setWakeMode(context, i10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() {
        this.mInternalMediaPlayer.start();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() {
        this.mInternalMediaPlayer.stop();
    }
}
