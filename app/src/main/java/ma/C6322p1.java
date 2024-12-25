package ma;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p304r9.C8015b;
import p304r9.C8053u;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/p1.class
 */
/* renamed from: ma.p1 */
/* loaded from: combined.jar:classes2.jar:ma/p1.class */
public final class C6322p1 implements InterfaceC6238l1 {

    /* renamed from: j */
    public static final C8015b f33944j = new C8015b("ConnectivityMonitor");

    /* renamed from: a */
    public final InterfaceExecutorServiceC6440ue f33945a;

    /* renamed from: c */
    public final ConnectivityManager f33947c;

    /* renamed from: f */
    public boolean f33950f;

    /* renamed from: g */
    public final Context f33951g;

    /* renamed from: h */
    public final Object f33952h = new Object();

    /* renamed from: i */
    public final Set f33953i = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    public final Map f33948d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    public final List f33949e = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public final ConnectivityManager.NetworkCallback f33946b = new C6301o1(this);

    @TargetApi(23)
    public C6322p1(Context context, InterfaceExecutorServiceC6440ue interfaceExecutorServiceC6440ue) {
        this.f33945a = interfaceExecutorServiceC6440ue;
        this.f33951g = context;
        this.f33947c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m29945b(C6322p1 c6322p1) {
        synchronized (C9935o.m41850j(c6322p1.f33952h)) {
            if (c6322p1.f33948d != null && c6322p1.f33949e != null) {
                f33944j.m34873a("all networks are unavailable.", new Object[0]);
                c6322p1.f33948d.clear();
                c6322p1.f33949e.clear();
                c6322p1.m29949f();
            }
        }
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m29946c(C6322p1 c6322p1, Network network) {
        synchronized (C9935o.m41850j(c6322p1.f33952h)) {
            if (c6322p1.f33948d != null && c6322p1.f33949e != null) {
                f33944j.m34873a("the network is lost", new Object[0]);
                if (c6322p1.f33949e.remove(network)) {
                    c6322p1.f33948d.remove(network);
                }
                c6322p1.m29949f();
            }
        }
    }

    /* renamed from: d */
    public final boolean m29947d() {
        List list = this.f33949e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* renamed from: e */
    public final void m29948e(Network network, LinkProperties linkProperties) {
        synchronized (C9935o.m41850j(this.f33952h)) {
            if (this.f33948d != null && this.f33949e != null) {
                f33944j.m34873a("a new network is available", new Object[0]);
                if (this.f33948d.containsKey(network)) {
                    this.f33949e.remove(network);
                }
                this.f33948d.put(network, linkProperties);
                this.f33949e.add(network);
                m29949f();
            }
        }
    }

    /* renamed from: f */
    public final void m29949f() {
        if (this.f33945a == null) {
            return;
        }
        synchronized (this.f33953i) {
            for (final InterfaceC6217k1 interfaceC6217k1 : this.f33953i) {
                if (!this.f33945a.isShutdown()) {
                    this.f33945a.execute(new Runnable(this, interfaceC6217k1) { // from class: ma.n1

                        /* renamed from: b */
                        public final C6322p1 f33899b;

                        /* renamed from: c */
                        public final InterfaceC6217k1 f33900c;

                        {
                            this.f33899b = this;
                            this.f33900c = interfaceC6217k1;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C6322p1 c6322p1 = this.f33899b;
                            InterfaceC6217k1 interfaceC6217k12 = this.f33900c;
                            c6322p1.m29947d();
                            interfaceC6217k12.zza();
                        }
                    });
                }
            }
        }
    }

    @Override // ma.InterfaceC6238l1
    /* renamed from: k */
    public final boolean mo29827k() {
        NetworkInfo activeNetworkInfo;
        return this.f33947c != null && C8053u.m34972a(this.f33951g) && (activeNetworkInfo = this.f33947c.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected();
    }

    @Override // ma.InterfaceC6238l1
    @TargetApi(23)
    public final void zza() {
        Network activeNetwork;
        LinkProperties linkProperties;
        f33944j.m34873a("Start monitoring connectivity changes", new Object[0]);
        if (this.f33950f || this.f33947c == null || !C8053u.m34972a(this.f33951g)) {
            return;
        }
        activeNetwork = this.f33947c.getActiveNetwork();
        if (activeNetwork != null && (linkProperties = this.f33947c.getLinkProperties(activeNetwork)) != null) {
            m29948e(activeNetwork, linkProperties);
        }
        this.f33947c.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), this.f33946b);
        this.f33950f = true;
    }
}
