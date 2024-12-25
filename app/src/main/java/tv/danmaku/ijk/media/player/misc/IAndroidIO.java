package tv.danmaku.ijk.media.player.misc;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/misc/IAndroidIO.class */
public interface IAndroidIO {
    int close();

    int open(String str);

    int read(byte[] bArr, int i10);

    long seek(long j10, int i10);
}
