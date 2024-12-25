package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/MediaPlayerProxy.class */
public class MediaPlayerProxy implements IMediaPlayer {
    public final IMediaPlayer mBackEndMediaPlayer;

    public MediaPlayerProxy(IMediaPlayer iMediaPlayer) {
        this.mBackEndMediaPlayer = iMediaPlayer;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
        return this.mBackEndMediaPlayer.getAudioSessionId();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        return this.mBackEndMediaPlayer.getCurrentPosition();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public String getDataSource() {
        return this.mBackEndMediaPlayer.getDataSource();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
        return this.mBackEndMediaPlayer.getDuration();
    }

    public IMediaPlayer getInternalMediaPlayer() {
        return this.mBackEndMediaPlayer;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
        return this.mBackEndMediaPlayer.getMediaInfo();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public ITrackInfo[] getTrackInfo() {
        return this.mBackEndMediaPlayer.getTrackInfo();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return this.mBackEndMediaPlayer.getVideoHeight();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return this.mBackEndMediaPlayer.getVideoSarDen();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return this.mBackEndMediaPlayer.getVideoSarNum();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return this.mBackEndMediaPlayer.getVideoWidth();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
        return this.mBackEndMediaPlayer.isLooping();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        return this.mBackEndMediaPlayer.isPlaying();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() {
        this.mBackEndMediaPlayer.pause();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() {
        this.mBackEndMediaPlayer.prepareAsync();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
        this.mBackEndMediaPlayer.release();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
        this.mBackEndMediaPlayer.reset();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j10) {
        this.mBackEndMediaPlayer.seekTo(j10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i10) {
        this.mBackEndMediaPlayer.setAudioStreamType(i10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) {
        this.mBackEndMediaPlayer.setDataSource(context, uri);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        this.mBackEndMediaPlayer.setDataSource(context, uri, map);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) {
        this.mBackEndMediaPlayer.setDataSource(fileDescriptor);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) {
        this.mBackEndMediaPlayer.setDataSource(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        this.mBackEndMediaPlayer.setDataSource(iMediaDataSource);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.mBackEndMediaPlayer.setDisplay(surfaceHolder);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z10) {
        this.mBackEndMediaPlayer.setKeepInBackground(z10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z10) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z10) {
        this.mBackEndMediaPlayer.setLooping(z10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (onBufferingUpdateListener != null) {
            this.mBackEndMediaPlayer.setOnBufferingUpdateListener(new IMediaPlayer.OnBufferingUpdateListener(this, onBufferingUpdateListener) { // from class: tv.danmaku.ijk.media.player.MediaPlayerProxy.3
                public final MediaPlayerProxy this$0;
                public final IMediaPlayer.OnBufferingUpdateListener val$finalListener;

                {
                    this.this$0 = this;
                    this.val$finalListener = onBufferingUpdateListener;
                }

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
                public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
                    this.val$finalListener.onBufferingUpdate(this.this$0, i10);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnBufferingUpdateListener(null);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            this.mBackEndMediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener(this, onCompletionListener) { // from class: tv.danmaku.ijk.media.player.MediaPlayerProxy.2
                public final MediaPlayerProxy this$0;
                public final IMediaPlayer.OnCompletionListener val$finalListener;

                {
                    this.this$0 = this;
                    this.val$finalListener = onCompletionListener;
                }

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
                public void onCompletion(IMediaPlayer iMediaPlayer) {
                    this.val$finalListener.onCompletion(this.this$0);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnCompletionListener(null);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        if (onErrorListener != null) {
            this.mBackEndMediaPlayer.setOnErrorListener(new IMediaPlayer.OnErrorListener(this, onErrorListener) { // from class: tv.danmaku.ijk.media.player.MediaPlayerProxy.6
                public final MediaPlayerProxy this$0;
                public final IMediaPlayer.OnErrorListener val$finalListener;

                {
                    this.this$0 = this;
                    this.val$finalListener = onErrorListener;
                }

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
                public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
                    return this.val$finalListener.onError(this.this$0, i10, i11);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnErrorListener(null);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        if (onInfoListener != null) {
            this.mBackEndMediaPlayer.setOnInfoListener(new IMediaPlayer.OnInfoListener(this, onInfoListener) { // from class: tv.danmaku.ijk.media.player.MediaPlayerProxy.7
                public final MediaPlayerProxy this$0;
                public final IMediaPlayer.OnInfoListener val$finalListener;

                {
                    this.this$0 = this;
                    this.val$finalListener = onInfoListener;
                }

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
                public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
                    return this.val$finalListener.onInfo(this.this$0, i10, i11);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnInfoListener(null);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        if (onPreparedListener != null) {
            this.mBackEndMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener(this, onPreparedListener) { // from class: tv.danmaku.ijk.media.player.MediaPlayerProxy.1
                public final MediaPlayerProxy this$0;
                public final IMediaPlayer.OnPreparedListener val$finalListener;

                {
                    this.this$0 = this;
                    this.val$finalListener = onPreparedListener;
                }

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
                public void onPrepared(IMediaPlayer iMediaPlayer) {
                    this.val$finalListener.onPrepared(this.this$0);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnPreparedListener(null);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        if (onSeekCompleteListener != null) {
            this.mBackEndMediaPlayer.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener(this, onSeekCompleteListener) { // from class: tv.danmaku.ijk.media.player.MediaPlayerProxy.4
                public final MediaPlayerProxy this$0;
                public final IMediaPlayer.OnSeekCompleteListener val$finalListener;

                {
                    this.this$0 = this;
                    this.val$finalListener = onSeekCompleteListener;
                }

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
                public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                    this.val$finalListener.onSeekComplete(this.this$0);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnSeekCompleteListener(null);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        if (onTimedTextListener != null) {
            this.mBackEndMediaPlayer.setOnTimedTextListener(new IMediaPlayer.OnTimedTextListener(this, onTimedTextListener) { // from class: tv.danmaku.ijk.media.player.MediaPlayerProxy.8
                public final MediaPlayerProxy this$0;
                public final IMediaPlayer.OnTimedTextListener val$finalListener;

                {
                    this.this$0 = this;
                    this.val$finalListener = onTimedTextListener;
                }

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
                public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
                    this.val$finalListener.onTimedText(this.this$0, ijkTimedText);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnTimedTextListener(null);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (onVideoSizeChangedListener != null) {
            this.mBackEndMediaPlayer.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener(this, onVideoSizeChangedListener) { // from class: tv.danmaku.ijk.media.player.MediaPlayerProxy.5
                public final MediaPlayerProxy this$0;
                public final IMediaPlayer.OnVideoSizeChangedListener val$finalListener;

                {
                    this.this$0 = this;
                    this.val$finalListener = onVideoSizeChangedListener;
                }

                @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
                public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
                    this.val$finalListener.onVideoSizeChanged(this.this$0, i10, i11, i12, i13);
                }
            });
        } else {
            this.mBackEndMediaPlayer.setOnVideoSizeChangedListener(null);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z10) {
        this.mBackEndMediaPlayer.setScreenOnWhilePlaying(z10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setSurface(Surface surface) {
        this.mBackEndMediaPlayer.setSurface(surface);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f10, float f11) {
        this.mBackEndMediaPlayer.setVolume(f10, f11);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setWakeMode(Context context, int i10) {
        this.mBackEndMediaPlayer.setWakeMode(context, i10);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() {
        this.mBackEndMediaPlayer.start();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() {
        this.mBackEndMediaPlayer.stop();
    }
}
