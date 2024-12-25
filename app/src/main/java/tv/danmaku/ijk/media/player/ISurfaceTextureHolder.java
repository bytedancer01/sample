package tv.danmaku.ijk.media.player;

import android.graphics.SurfaceTexture;

/* loaded from: combined.jar:classes3.jar:tv/danmaku/ijk/media/player/ISurfaceTextureHolder.class */
public interface ISurfaceTextureHolder {
    SurfaceTexture getSurfaceTexture();

    void setSurfaceTexture(SurfaceTexture surfaceTexture);

    void setSurfaceTextureHost(ISurfaceTextureHost iSurfaceTextureHost);
}
