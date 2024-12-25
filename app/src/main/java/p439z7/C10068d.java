package p439z7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import p059d9.C4349a;
import p059d9.C4401z0;
import p439z7.C10068d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z7/d.class
 */
/* renamed from: z7.d */
/* loaded from: combined.jar:classes2.jar:z7/d.class */
public final class C10068d {

    /* renamed from: a */
    public final Context f46225a;

    /* renamed from: b */
    public final c f46226b;

    /* renamed from: c */
    public final C10067c f46227c;

    /* renamed from: d */
    public final Handler f46228d = C4401z0.m22313A();

    /* renamed from: e */
    public b f46229e;

    /* renamed from: f */
    public int f46230f;

    /* renamed from: g */
    public d f46231g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z7/d$b.class
     */
    /* renamed from: z7.d$b */
    /* loaded from: combined.jar:classes2.jar:z7/d$b.class */
    public class b extends BroadcastReceiver {

        /* renamed from: a */
        public final C10068d f46232a;

        public b(C10068d c10068d) {
            this.f46232a = c10068d;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            this.f46232a.m42382e();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z7/d$c.class
     */
    /* renamed from: z7.d$c */
    /* loaded from: combined.jar:classes2.jar:z7/d$c.class */
    public interface c {
        /* renamed from: a */
        void mo41466a(C10068d c10068d, int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z7/d$d.class
     */
    /* renamed from: z7.d$d */
    /* loaded from: combined.jar:classes2.jar:z7/d$d.class */
    public final class d extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public boolean f46233a;

        /* renamed from: b */
        public boolean f46234b;

        /* renamed from: c */
        public final C10068d f46235c;

        public d(C10068d c10068d) {
            this.f46235c = c10068d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m42391c() {
            if (this.f46235c.f46231g != null) {
                this.f46235c.m42382e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m42392d() {
            if (this.f46235c.f46231g != null) {
                this.f46235c.m42384g();
            }
        }

        /* renamed from: e */
        public final void m42393e() {
            this.f46235c.f46228d.post(new Runnable(this) { // from class: z7.f

                /* renamed from: b */
                public final C10068d.d f46237b;

                {
                    this.f46237b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f46237b.m42391c();
                }
            });
        }

        /* renamed from: f */
        public final void m42394f() {
            this.f46235c.f46228d.post(new Runnable(this) { // from class: z7.e

                /* renamed from: b */
                public final C10068d.d f46236b;

                {
                    this.f46236b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f46236b.m42392d();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            m42393e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z10) {
            if (z10) {
                return;
            }
            m42394f();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.f46233a && this.f46234b == hasCapability) {
                if (hasCapability) {
                    m42394f();
                }
            } else {
                this.f46233a = true;
                this.f46234b = hasCapability;
                m42393e();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            m42393e();
        }
    }

    public C10068d(Context context, c cVar, C10067c c10067c) {
        this.f46225a = context.getApplicationContext();
        this.f46226b = cVar;
        this.f46227c = c10067c;
    }

    /* renamed from: e */
    public final void m42382e() {
        int m42366j = this.f46227c.m42366j(this.f46225a);
        if (this.f46230f != m42366j) {
            this.f46230f = m42366j;
            this.f46226b.mo41466a(this, m42366j);
        }
    }

    /* renamed from: f */
    public C10067c m42383f() {
        return this.f46227c;
    }

    /* renamed from: g */
    public final void m42384g() {
        if ((this.f46230f & 3) == 0) {
            return;
        }
        m42382e();
    }

    /* renamed from: h */
    public final void m42385h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C4349a.m21882e((ConnectivityManager) this.f46225a.getSystemService("connectivity"));
        d dVar = new d();
        this.f46231g = dVar;
        connectivityManager.registerDefaultNetworkCallback(dVar);
    }

    /* renamed from: i */
    public int m42386i() {
        String str;
        this.f46230f = this.f46227c.m42366j(this.f46225a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f46227c.m42372r()) {
            if (C4401z0.f26679a >= 24) {
                m42385h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f46227c.m42368l()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f46227c.m42371o()) {
            if (C4401z0.f26679a >= 23) {
                str = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                str = "android.intent.action.SCREEN_OFF";
            }
            intentFilter.addAction(str);
        }
        if (this.f46227c.m42374u()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        b bVar = new b();
        this.f46229e = bVar;
        this.f46225a.registerReceiver(bVar, intentFilter, null, this.f46228d);
        return this.f46230f;
    }

    /* renamed from: j */
    public void m42387j() {
        this.f46225a.unregisterReceiver((BroadcastReceiver) C4349a.m21882e(this.f46229e));
        this.f46229e = null;
        if (C4401z0.f26679a < 24 || this.f46231g == null) {
            return;
        }
        m42388k();
    }

    /* renamed from: k */
    public final void m42388k() {
        ((ConnectivityManager) C4349a.m21882e((ConnectivityManager) this.f46225a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) C4349a.m21882e(this.f46231g));
        this.f46231g = null;
    }
}
