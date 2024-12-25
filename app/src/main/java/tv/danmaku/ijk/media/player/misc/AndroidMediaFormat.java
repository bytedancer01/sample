package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/misc/AndroidMediaFormat.class */
public class AndroidMediaFormat implements IMediaFormat {
    private final MediaFormat mMediaFormat;

    public AndroidMediaFormat(MediaFormat mediaFormat) {
        this.mMediaFormat = mediaFormat;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    @TargetApi(16)
    public int getInteger(String str) {
        MediaFormat mediaFormat = this.mMediaFormat;
        if (mediaFormat == null) {
            return 0;
        }
        return mediaFormat.getInteger(str);
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    @TargetApi(16)
    public String getString(String str) {
        MediaFormat mediaFormat = this.mMediaFormat;
        if (mediaFormat == null) {
            return null;
        }
        return mediaFormat.getString(str);
    }

    @TargetApi(16)
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getName());
        sb2.append('{');
        MediaFormat mediaFormat = this.mMediaFormat;
        sb2.append(mediaFormat != null ? mediaFormat.toString() : "null");
        sb2.append('}');
        return sb2.toString();
    }
}
