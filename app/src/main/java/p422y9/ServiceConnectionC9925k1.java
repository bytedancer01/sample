package p422y9;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import ca.C1052b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/k1.class
 */
/* renamed from: y9.k1 */
/* loaded from: combined.jar:classes2.jar:y9/k1.class */
public final class ServiceConnectionC9925k1 implements ServiceConnection, InterfaceC9937o1 {

    /* renamed from: b */
    public final Map<ServiceConnection, ServiceConnection> f45593b = new HashMap();

    /* renamed from: c */
    public int f45594c = 2;

    /* renamed from: d */
    public boolean f45595d;

    /* renamed from: e */
    public IBinder f45596e;

    /* renamed from: f */
    public final C9922j1 f45597f;

    /* renamed from: g */
    public ComponentName f45598g;

    /* renamed from: h */
    public final C9934n1 f45599h;

    public ServiceConnectionC9925k1(C9934n1 c9934n1, C9922j1 c9922j1) {
        this.f45599h = c9934n1;
        this.f45597f = c9922j1;
    }

    /* renamed from: a */
    public final int m41816a() {
        return this.f45594c;
    }

    /* renamed from: b */
    public final ComponentName m41817b() {
        return this.f45598g;
    }

    /* renamed from: c */
    public final IBinder m41818c() {
        return this.f45596e;
    }

    /* renamed from: d */
    public final void m41819d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f45593b.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m41820e(String str, Executor executor) {
        C1052b c1052b;
        Context context;
        Context context2;
        C1052b c1052b2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        this.f45594c = 3;
        C9934n1 c9934n1 = this.f45599h;
        c1052b = c9934n1.f45621j;
        context = c9934n1.f45618g;
        C9922j1 c9922j1 = this.f45597f;
        context2 = c9934n1.f45618g;
        boolean m6229d = c1052b.m6229d(context, str, c9922j1.m41811c(context2), this, this.f45597f.m41809a(), executor);
        this.f45595d = m6229d;
        if (m6229d) {
            handler = this.f45599h.f45619h;
            Message obtainMessage = handler.obtainMessage(1, this.f45597f);
            handler2 = this.f45599h.f45619h;
            j10 = this.f45599h.f45623l;
            handler2.sendMessageDelayed(obtainMessage, j10);
            return;
        }
        this.f45594c = 2;
        try {
            C9934n1 c9934n12 = this.f45599h;
            c1052b2 = c9934n12.f45621j;
            context3 = c9934n12.f45618g;
            c1052b2.m6228c(context3, this);
        } catch (IllegalArgumentException e10) {
        }
    }

    /* renamed from: f */
    public final void m41821f(ServiceConnection serviceConnection, String str) {
        this.f45593b.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m41822g(String str) {
        Handler handler;
        C1052b c1052b;
        Context context;
        handler = this.f45599h.f45619h;
        handler.removeMessages(1, this.f45597f);
        C9934n1 c9934n1 = this.f45599h;
        c1052b = c9934n1.f45621j;
        context = c9934n1.f45618g;
        c1052b.m6228c(context, this);
        this.f45595d = false;
        this.f45594c = 2;
    }

    /* renamed from: h */
    public final boolean m41823h(ServiceConnection serviceConnection) {
        return this.f45593b.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m41824i() {
        return this.f45593b.isEmpty();
    }

    /* renamed from: j */
    public final boolean m41825j() {
        return this.f45595d;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f45599h.f45617f;
        synchronized (hashMap) {
            handler = this.f45599h.f45619h;
            handler.removeMessages(1, this.f45597f);
            this.f45596e = iBinder;
            this.f45598g = componentName;
            Iterator<ServiceConnection> it = this.f45593b.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f45594c = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f45599h.f45617f;
        synchronized (hashMap) {
            handler = this.f45599h.f45619h;
            handler.removeMessages(1, this.f45597f);
            this.f45596e = null;
            this.f45598g = componentName;
            Iterator<ServiceConnection> it = this.f45593b.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f45594c = 2;
        }
    }
}
