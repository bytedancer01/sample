package p406xd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p406xd.C9731h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xd/h.class
 */
/* renamed from: xd.h */
/* loaded from: combined.jar:classes2.jar:xd/h.class */
public final class C9731h {

    /* renamed from: a */
    public final Context f44399a;

    /* renamed from: e */
    public Runnable f44403e;

    /* renamed from: f */
    public boolean f44404f;

    /* renamed from: c */
    public boolean f44401c = false;

    /* renamed from: b */
    public final BroadcastReceiver f44400b = new b();

    /* renamed from: d */
    public Handler f44402d = new Handler();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xd/h$b.class
     */
    /* renamed from: xd.h$b */
    /* loaded from: combined.jar:classes2.jar:xd/h$b.class */
    public final class b extends BroadcastReceiver {

        /* renamed from: a */
        public final C9731h f44405a;

        public b(C9731h c9731h) {
            this.f44405a = c9731h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m41028b(boolean z10) {
            this.f44405a.m41023f(z10);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z10 = intent.getIntExtra("plugged", -1) <= 0;
                this.f44405a.f44402d.post(new Runnable(this, z10) { // from class: xd.i

                    /* renamed from: b */
                    public final C9731h.b f44406b;

                    /* renamed from: c */
                    public final boolean f44407c;

                    {
                        this.f44406b = this;
                        this.f44407c = z10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44406b.m41028b(this.f44407c);
                    }
                });
            }
        }
    }

    public C9731h(Context context, Runnable runnable) {
        this.f44399a = context;
        this.f44403e = runnable;
    }

    /* renamed from: c */
    public void m41020c() {
        m41022e();
        if (this.f44404f) {
            this.f44402d.postDelayed(this.f44403e, 300000L);
        }
    }

    /* renamed from: d */
    public void m41021d() {
        m41022e();
        m41026i();
    }

    /* renamed from: e */
    public final void m41022e() {
        this.f44402d.removeCallbacksAndMessages(null);
    }

    /* renamed from: f */
    public final void m41023f(boolean z10) {
        this.f44404f = z10;
        if (this.f44401c) {
            m41020c();
        }
    }

    /* renamed from: g */
    public final void m41024g() {
        if (this.f44401c) {
            return;
        }
        this.f44399a.registerReceiver(this.f44400b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f44401c = true;
    }

    /* renamed from: h */
    public void m41025h() {
        m41024g();
        m41020c();
    }

    /* renamed from: i */
    public final void m41026i() {
        if (this.f44401c) {
            this.f44399a.unregisterReceiver(this.f44400b);
            this.f44401c = false;
        }
    }
}
