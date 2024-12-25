package p422y9;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import la.HandlerC5836j;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p350u9.C8804b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/h0.class
 */
/* renamed from: y9.h0 */
/* loaded from: combined.jar:classes2.jar:y9/h0.class */
public final class C9915h0 implements Handler.Callback {

    /* renamed from: b */
    @NotOnlyInitialized
    public final InterfaceC9912g0 f45572b;

    /* renamed from: i */
    public final Handler f45579i;

    /* renamed from: c */
    public final ArrayList<GoogleApiClient.InterfaceC2412b> f45573c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<GoogleApiClient.InterfaceC2412b> f45574d = new ArrayList<>();

    /* renamed from: e */
    public final ArrayList<GoogleApiClient.InterfaceC2413c> f45575e = new ArrayList<>();

    /* renamed from: f */
    public volatile boolean f45576f = false;

    /* renamed from: g */
    public final AtomicInteger f45577g = new AtomicInteger(0);

    /* renamed from: h */
    public boolean f45578h = false;

    /* renamed from: j */
    public final Object f45580j = new Object();

    public C9915h0(Looper looper, InterfaceC9912g0 interfaceC9912g0) {
        this.f45572b = interfaceC9912g0;
        this.f45579i = new HandlerC5836j(looper, this);
    }

    /* renamed from: a */
    public final void m41795a() {
        this.f45576f = false;
        this.f45577g.incrementAndGet();
    }

    /* renamed from: b */
    public final void m41796b() {
        this.f45576f = true;
    }

    /* renamed from: c */
    public final void m41797c(C8804b c8804b) {
        C9935o.m41844d(this.f45579i, "onConnectionFailure must only be called on the Handler thread");
        this.f45579i.removeMessages(1);
        synchronized (this.f45580j) {
            ArrayList arrayList = new ArrayList(this.f45575e);
            int i10 = this.f45577g.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.InterfaceC2413c interfaceC2413c = (GoogleApiClient.InterfaceC2413c) it.next();
                if (this.f45576f && this.f45577g.get() == i10) {
                    if (this.f45575e.contains(interfaceC2413c)) {
                        interfaceC2413c.onConnectionFailed(c8804b);
                    }
                }
                return;
            }
        }
    }

    /* renamed from: d */
    public final void m41798d(Bundle bundle) {
        C9935o.m41844d(this.f45579i, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f45580j) {
            C9935o.m41853m(!this.f45578h);
            this.f45579i.removeMessages(1);
            this.f45578h = true;
            C9935o.m41853m(this.f45574d.isEmpty());
            ArrayList arrayList = new ArrayList(this.f45573c);
            int i10 = this.f45577g.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.InterfaceC2412b interfaceC2412b = (GoogleApiClient.InterfaceC2412b) it.next();
                if (!this.f45576f || !this.f45572b.isConnected() || this.f45577g.get() != i10) {
                    break;
                } else if (!this.f45574d.contains(interfaceC2412b)) {
                    interfaceC2412b.onConnected(bundle);
                }
            }
            this.f45574d.clear();
            this.f45578h = false;
        }
    }

    /* renamed from: e */
    public final void m41799e(int i10) {
        C9935o.m41844d(this.f45579i, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f45579i.removeMessages(1);
        synchronized (this.f45580j) {
            this.f45578h = true;
            ArrayList arrayList = new ArrayList(this.f45573c);
            int i11 = this.f45577g.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleApiClient.InterfaceC2412b interfaceC2412b = (GoogleApiClient.InterfaceC2412b) it.next();
                if (!this.f45576f || this.f45577g.get() != i11) {
                    break;
                } else if (this.f45573c.contains(interfaceC2412b)) {
                    interfaceC2412b.onConnectionSuspended(i10);
                }
            }
            this.f45574d.clear();
            this.f45578h = false;
        }
    }

    /* renamed from: f */
    public final void m41800f(GoogleApiClient.InterfaceC2412b interfaceC2412b) {
        C9935o.m41850j(interfaceC2412b);
        synchronized (this.f45580j) {
            if (this.f45573c.contains(interfaceC2412b)) {
                String valueOf = String.valueOf(interfaceC2412b);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 62);
                sb2.append("registerConnectionCallbacks(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f45573c.add(interfaceC2412b);
            }
        }
        if (this.f45572b.isConnected()) {
            Handler handler = this.f45579i;
            handler.sendMessage(handler.obtainMessage(1, interfaceC2412b));
        }
    }

    /* renamed from: g */
    public final void m41801g(GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        C9935o.m41850j(interfaceC2413c);
        synchronized (this.f45580j) {
            if (this.f45575e.contains(interfaceC2413c)) {
                String valueOf = String.valueOf(interfaceC2413c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 67);
                sb2.append("registerConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                this.f45575e.add(interfaceC2413c);
            }
        }
    }

    /* renamed from: h */
    public final void m41802h(GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        C9935o.m41850j(interfaceC2413c);
        synchronized (this.f45580j) {
            if (!this.f45575e.remove(interfaceC2413c)) {
                String valueOf = String.valueOf(interfaceC2413c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 57);
                sb2.append("unregisterConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" not found");
                Log.w("GmsClientEvents", sb2.toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(45);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i10);
            Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
            return false;
        }
        GoogleApiClient.InterfaceC2412b interfaceC2412b = (GoogleApiClient.InterfaceC2412b) message.obj;
        synchronized (this.f45580j) {
            if (this.f45576f && this.f45572b.isConnected() && this.f45573c.contains(interfaceC2412b)) {
                interfaceC2412b.onConnected(null);
            }
        }
        return true;
    }
}
