package tv.danmaku.ijk.media.player.misc;

import android.text.TextUtils;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/misc/IjkTrackInfo.class */
public class IjkTrackInfo implements ITrackInfo {
    private IjkMediaMeta.IjkStreamMeta mStreamMeta;
    private int mTrackType = 0;

    public IjkTrackInfo(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public IMediaFormat getFormat() {
        return new IjkMediaFormat(this.mStreamMeta);
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public String getInfoInline() {
        String resolutionInline;
        StringBuilder sb2 = new StringBuilder(128);
        int i10 = this.mTrackType;
        if (i10 == 1) {
            sb2.append("VIDEO");
            sb2.append(", ");
            sb2.append(this.mStreamMeta.getCodecShortNameInline());
            sb2.append(", ");
            sb2.append(this.mStreamMeta.getBitrateInline());
            sb2.append(", ");
            resolutionInline = this.mStreamMeta.getResolutionInline();
        } else if (i10 == 2) {
            sb2.append("AUDIO");
            sb2.append(", ");
            sb2.append(this.mStreamMeta.getCodecShortNameInline());
            sb2.append(", ");
            sb2.append(this.mStreamMeta.getBitrateInline());
            sb2.append(", ");
            resolutionInline = this.mStreamMeta.getSampleRateInline();
        } else if (i10 != 3) {
            resolutionInline = i10 != 4 ? "UNKNOWN" : "SUBTITLE";
        } else {
            sb2.append("TIMEDTEXT");
            sb2.append(", ");
            resolutionInline = this.mStreamMeta.mLanguage;
        }
        sb2.append(resolutionInline);
        return sb2.toString();
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public String getLanguage() {
        IjkMediaMeta.IjkStreamMeta ijkStreamMeta = this.mStreamMeta;
        return (ijkStreamMeta == null || TextUtils.isEmpty(ijkStreamMeta.mLanguage)) ? "und" : this.mStreamMeta.mLanguage;
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public int getTrackType() {
        return this.mTrackType;
    }

    public void setMediaMeta(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    public void setTrackType(int i10) {
        this.mTrackType = i10;
    }

    public String toString() {
        return getClass().getSimpleName() + '{' + getInfoInline() + "}";
    }
}
