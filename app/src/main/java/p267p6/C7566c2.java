package p267p6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/c2.class
 */
/* renamed from: p6.c2 */
/* loaded from: combined.jar:classes2.jar:p6/c2.class */
public final class C7566c2 {

    /* renamed from: a */
    public final Context f36657a;

    /* renamed from: b */
    public final Handler f36658b;

    /* renamed from: c */
    public final b f36659c;

    /* renamed from: d */
    public final AudioManager f36660d;

    /* renamed from: e */
    public c f36661e;

    /* renamed from: f */
    public int f36662f;

    /* renamed from: g */
    public int f36663g;

    /* renamed from: h */
    public boolean f36664h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/c2$b.class
     */
    /* renamed from: p6.c2$b */
    /* loaded from: combined.jar:classes2.jar:p6/c2$b.class */
    public interface b {
        /* renamed from: g */
        void mo32521g(int i10);

        /* renamed from: w */
        void mo32526w(int i10, boolean z10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/c2$c.class
     */
    /* renamed from: p6.c2$c */
    /* loaded from: combined.jar:classes2.jar:p6/c2$c.class */
    public final class c extends BroadcastReceiver {

        /* renamed from: a */
        public final C7566c2 f36665a;

        public c(C7566c2 c7566c2) {
            this.f36665a = c7566c2;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = this.f36665a.f36658b;
            final C7566c2 c7566c2 = this.f36665a;
            handler.post(new Runnable(c7566c2) { // from class: p6.d2

                /* renamed from: b */
                public final C7566c2 f36694b;

                {
                    this.f36694b = c7566c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7566c2.m32581b(this.f36694b);
                }
            });
        }
    }

    public C7566c2(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f36657a = applicationContext;
        this.f36658b = handler;
        this.f36659c = bVar;
        AudioManager audioManager = (AudioManager) C4349a.m21886i((AudioManager) applicationContext.getSystemService("audio"));
        this.f36660d = audioManager;
        this.f36662f = 3;
        this.f36663g = m32583f(audioManager, 3);
        this.f36664h = m32582e(audioManager, this.f36662f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f36661e = cVar;
        } catch (RuntimeException e10) {
            C4392v.m22276j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m32581b(C7566c2 c7566c2) {
        c7566c2.m32588i();
    }

    /* renamed from: e */
    public static boolean m32582e(AudioManager audioManager, int i10) {
        boolean isStreamMute;
        if (C4401z0.f26679a < 23) {
            return m32583f(audioManager, i10) == 0;
        }
        isStreamMute = audioManager.isStreamMute(i10);
        return isStreamMute;
    }

    /* renamed from: f */
    public static int m32583f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            C4392v.m22276j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* renamed from: c */
    public int m32584c() {
        return this.f36660d.getStreamMaxVolume(this.f36662f);
    }

    /* renamed from: d */
    public int m32585d() {
        int i10;
        int streamMinVolume;
        if (C4401z0.f26679a >= 28) {
            streamMinVolume = this.f36660d.getStreamMinVolume(this.f36662f);
            i10 = streamMinVolume;
        } else {
            i10 = 0;
        }
        return i10;
    }

    /* renamed from: g */
    public void m32586g() {
        c cVar = this.f36661e;
        if (cVar != null) {
            try {
                this.f36657a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                C4392v.m22276j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f36661e = null;
        }
    }

    /* renamed from: h */
    public void m32587h(int i10) {
        if (this.f36662f == i10) {
            return;
        }
        this.f36662f = i10;
        m32588i();
        this.f36659c.mo32521g(i10);
    }

    /* renamed from: i */
    public final void m32588i() {
        int m32583f = m32583f(this.f36660d, this.f36662f);
        boolean m32582e = m32582e(this.f36660d, this.f36662f);
        if (this.f36663g == m32583f && this.f36664h == m32582e) {
            return;
        }
        this.f36663g = m32583f;
        this.f36664h = m32582e;
        this.f36659c.mo32526w(m32583f, m32582e);
    }
}
