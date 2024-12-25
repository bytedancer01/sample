package p406xd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xd/e.class
 */
/* renamed from: xd.e */
/* loaded from: combined.jar:classes2.jar:xd/e.class */
public final class C9728e {

    /* renamed from: d */
    public static final String f44384d = "e";

    /* renamed from: a */
    public final Context f44385a;

    /* renamed from: b */
    public boolean f44386b = true;

    /* renamed from: c */
    public boolean f44387c = false;

    public C9728e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f44385a = activity.getApplicationContext();
    }

    /* renamed from: c */
    public static /* synthetic */ void m41010c(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m41011d(MediaPlayer mediaPlayer, int i10, int i11) {
        Log.w(f44384d, "Failed to beep " + i10 + ", " + i11);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    /* renamed from: e */
    public MediaPlayer m41012e() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: xd.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                C9728e.m41010c(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: xd.d
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                boolean m41011d;
                m41011d = C9728e.m41011d(mediaPlayer2, i10, i11);
                return m41011d;
            }
        });
        try {
            AssetFileDescriptor openRawResourceFd = this.f44385a.getResources().openRawResourceFd(C9736m.f44426a);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th2) {
                openRawResourceFd.close();
                throw th2;
            }
        } catch (IOException e10) {
            Log.w(f44384d, e10);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: f */
    public void m41013f() {
        Vibrator vibrator;
        synchronized (this) {
            if (this.f44386b) {
                m41012e();
            }
            if (this.f44387c && (vibrator = (Vibrator) this.f44385a.getSystemService("vibrator")) != null) {
                vibrator.vibrate(200L);
            }
        }
    }

    /* renamed from: g */
    public void m41014g(boolean z10) {
        this.f44386b = z10;
    }
}
