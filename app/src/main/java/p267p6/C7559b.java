package p267p6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/b.class
 */
/* renamed from: p6.b */
/* loaded from: combined.jar:classes2.jar:p6/b.class */
public final class C7559b {

    /* renamed from: a */
    public final Context f36439a;

    /* renamed from: b */
    public final a f36440b;

    /* renamed from: c */
    public boolean f36441c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b$a.class
     */
    /* renamed from: p6.b$a */
    /* loaded from: combined.jar:classes2.jar:p6/b$a.class */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: b */
        public final b f36442b;

        /* renamed from: c */
        public final Handler f36443c;

        /* renamed from: d */
        public final C7559b f36444d;

        public a(C7559b c7559b, Handler handler, b bVar) {
            this.f36444d = c7559b;
            this.f36443c = handler;
            this.f36442b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f36443c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36444d.f36441c) {
                this.f36442b.mo32343l();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/b$b.class
     */
    /* renamed from: p6.b$b */
    /* loaded from: combined.jar:classes2.jar:p6/b$b.class */
    public interface b {
        /* renamed from: l */
        void mo32343l();
    }

    public C7559b(Context context, Handler handler, b bVar) {
        this.f36439a = context.getApplicationContext();
        this.f36440b = new a(this, handler, bVar);
    }

    /* renamed from: b */
    public void m32342b(boolean z10) {
        boolean z11;
        if (z10 && !this.f36441c) {
            this.f36439a.registerReceiver(this.f36440b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z11 = true;
        } else {
            if (z10 || !this.f36441c) {
                return;
            }
            this.f36439a.unregisterReceiver(this.f36440b);
            z11 = false;
        }
        this.f36441c = z11;
    }
}
