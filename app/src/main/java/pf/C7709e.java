package pf;

import android.content.Context;
import android.content.pm.PackageManager;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.MediaPlayerProxy;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pf/e.class
 */
/* renamed from: pf.e */
/* loaded from: combined.jar:classes2.jar:pf/e.class */
public class C7709e {
    /* renamed from: a */
    public static long m33680a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: b */
    public static void m33681b(IMediaPlayer iMediaPlayer, int i10) {
        IjkMediaPlayer m33682c = m33682c(iMediaPlayer);
        if (m33682c == null) {
            return;
        }
        m33682c.deselectTrack(i10);
    }

    /* renamed from: c */
    public static IjkMediaPlayer m33682c(IMediaPlayer iMediaPlayer) {
        IjkMediaPlayer ijkMediaPlayer;
        if (iMediaPlayer == null) {
            return null;
        }
        if (!(iMediaPlayer instanceof IjkMediaPlayer)) {
            ijkMediaPlayer = null;
            if (iMediaPlayer instanceof MediaPlayerProxy) {
                MediaPlayerProxy mediaPlayerProxy = (MediaPlayerProxy) iMediaPlayer;
                ijkMediaPlayer = null;
                if (mediaPlayerProxy.getInternalMediaPlayer() instanceof IjkMediaPlayer) {
                    iMediaPlayer = mediaPlayerProxy.getInternalMediaPlayer();
                }
            }
            return ijkMediaPlayer;
        }
        ijkMediaPlayer = (IjkMediaPlayer) iMediaPlayer;
        return ijkMediaPlayer;
    }

    /* renamed from: d */
    public static int m33683d(IMediaPlayer iMediaPlayer, int i10) {
        IjkMediaPlayer m33682c = m33682c(iMediaPlayer);
        if (m33682c == null) {
            return -1;
        }
        return m33682c.getSelectedTrack(i10);
    }

    /* renamed from: e */
    public static void m33684e(IMediaPlayer iMediaPlayer, int i10) {
        IjkMediaPlayer m33682c = m33682c(iMediaPlayer);
        if (m33682c == null) {
            return;
        }
        m33682c.selectTrack(i10);
    }
}
