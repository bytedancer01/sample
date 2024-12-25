package p250of;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:of/a.class
 */
/* renamed from: of.a */
/* loaded from: combined.jar:classes2.jar:of/a.class */
public class ServiceC6971a extends Service {

    /* renamed from: b */
    public static IMediaPlayer f35951b;

    /* renamed from: a */
    public static IMediaPlayer m31979a() {
        return f35951b;
    }

    /* renamed from: b */
    public static void m31980b(Context context) {
        context.startService(m31981c(context));
    }

    /* renamed from: c */
    public static Intent m31981c(Context context) {
        return new Intent(context, (Class<?>) ServiceC6971a.class);
    }

    /* renamed from: d */
    public static void m31982d(IMediaPlayer iMediaPlayer) {
        IMediaPlayer iMediaPlayer2 = f35951b;
        if (iMediaPlayer2 != null && iMediaPlayer2 != iMediaPlayer) {
            if (iMediaPlayer2.isPlaying()) {
                f35951b.stop();
            }
            f35951b.release();
            f35951b = null;
        }
        f35951b = iMediaPlayer;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }
}
