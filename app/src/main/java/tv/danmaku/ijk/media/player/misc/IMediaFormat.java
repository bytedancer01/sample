package tv.danmaku.ijk.media.player.misc;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/misc/IMediaFormat.class */
public interface IMediaFormat {
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_MIME = "mime";
    public static final String KEY_WIDTH = "width";

    int getInteger(String str);

    String getString(String str);
}
