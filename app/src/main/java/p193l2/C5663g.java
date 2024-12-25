package p193l2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import p071e2.AbstractC4582k;
import p156j0.C5276a;
import p158j2.C5280b;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l2/g.class
 */
/* renamed from: l2.g */
/* loaded from: combined.jar:classes1.jar:l2/g.class */
public class C5663g extends AbstractC5660d<C5280b> {

    /* renamed from: j */
    public static final String f31922j = AbstractC4582k.m23128f("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f31923g;

    /* renamed from: h */
    public b f31924h;

    /* renamed from: i */
    public a f31925i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l2/g$a.class
     */
    /* renamed from: l2.g$a */
    /* loaded from: combined.jar:classes1.jar:l2/g$a.class */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public final C5663g f31926a;

        public a(C5663g c5663g) {
            this.f31926a = c5663g;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            AbstractC4582k.m23126c().mo23129a(C5663g.f31922j, "Network broadcast received", new Throwable[0]);
            C5663g c5663g = this.f31926a;
            c5663g.m27872d(c5663g.m27876g());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l2/g$b.class
     */
    /* renamed from: l2.g$b */
    /* loaded from: combined.jar:classes1.jar:l2/g$b.class */
    public class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final C5663g f31927a;

        public b(C5663g c5663g) {
            this.f31927a = c5663g;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC4582k.m23126c().mo23129a(C5663g.f31922j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            C5663g c5663g = this.f31927a;
            c5663g.m27872d(c5663g.m27876g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC4582k.m23126c().mo23129a(C5663g.f31922j, "Network connection lost", new Throwable[0]);
            C5663g c5663g = this.f31927a;
            c5663g.m27872d(c5663g.m27876g());
        }
    }

    public C5663g(Context context, InterfaceC7748a interfaceC7748a) {
        super(context, interfaceC7748a);
        this.f31923g = (ConnectivityManager) this.f31916b.getSystemService("connectivity");
        if (m27875j()) {
            this.f31924h = new b(this);
        } else {
            this.f31925i = new a(this);
        }
    }

    /* renamed from: j */
    public static boolean m27875j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // p193l2.AbstractC5660d
    /* renamed from: e */
    public void mo27868e() {
        if (!m27875j()) {
            AbstractC4582k.m23126c().mo23129a(f31922j, "Registering broadcast receiver", new Throwable[0]);
            this.f31916b.registerReceiver(this.f31925i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            AbstractC4582k.m23126c().mo23129a(f31922j, "Registering network callback", new Throwable[0]);
            this.f31923g.registerDefaultNetworkCallback(this.f31924h);
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC4582k.m23126c().mo23130b(f31922j, "Received exception while registering network callback", e10);
        }
    }

    @Override // p193l2.AbstractC5660d
    /* renamed from: f */
    public void mo27869f() {
        if (!m27875j()) {
            AbstractC4582k.m23126c().mo23129a(f31922j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f31916b.unregisterReceiver(this.f31925i);
            return;
        }
        try {
            AbstractC4582k.m23126c().mo23129a(f31922j, "Unregistering network callback", new Throwable[0]);
            this.f31923g.unregisterNetworkCallback(this.f31924h);
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC4582k.m23126c().mo23130b(f31922j, "Received exception while unregistering network callback", e10);
        }
    }

    /* renamed from: g */
    public C5280b m27876g() {
        NetworkInfo activeNetworkInfo = this.f31923g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean m27878i = m27878i();
        boolean m26353a = C5276a.m26353a(this.f31923g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new C5280b(z11, m27878i, m26353a, z10);
    }

    @Override // p193l2.AbstractC5660d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C5280b mo27862b() {
        return m27876g();
    }

    /* renamed from: i */
    public boolean m27878i() {
        Network activeNetwork;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            activeNetwork = this.f31923g.getActiveNetwork();
            NetworkCapabilities networkCapabilities = this.f31923g.getNetworkCapabilities(activeNetwork);
            boolean z10 = false;
            if (networkCapabilities != null) {
                z10 = false;
                if (networkCapabilities.hasCapability(16)) {
                    z10 = true;
                }
            }
            return z10;
        } catch (SecurityException e10) {
            AbstractC4582k.m23126c().mo23130b(f31922j, "Unable to validate active network", e10);
            return false;
        }
    }
}
