package tv.danmaku.ijk.media.player.misc;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/misc/IMediaDataSource.class */
public interface IMediaDataSource {
    void close();

    long getSize();

    int readAt(long j10, byte[] bArr, int i10, int i11);
}
