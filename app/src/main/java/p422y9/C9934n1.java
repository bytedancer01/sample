package p422y9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import ca.C1052b;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p245oa.HandlerC6962i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/n1.class
 */
/* renamed from: y9.n1 */
/* loaded from: combined.jar:classes2.jar:y9/n1.class */
public final class C9934n1 extends AbstractC9914h {

    /* renamed from: f */
    public final HashMap<C9922j1, ServiceConnectionC9925k1> f45617f = new HashMap<>();

    /* renamed from: g */
    public final Context f45618g;

    /* renamed from: h */
    public volatile Handler f45619h;

    /* renamed from: i */
    public final C9931m1 f45620i;

    /* renamed from: j */
    public final C1052b f45621j;

    /* renamed from: k */
    public final long f45622k;

    /* renamed from: l */
    public final long f45623l;

    public C9934n1(Context context, Looper looper) {
        C9931m1 c9931m1 = new C9931m1(this, null);
        this.f45620i = c9931m1;
        this.f45618g = context.getApplicationContext();
        this.f45619h = new HandlerC6962i(looper, c9931m1);
        this.f45621j = C1052b.m6223b();
        this.f45622k = 5000L;
        this.f45623l = 300000L;
    }

    @Override // p422y9.AbstractC9914h
    /* renamed from: d */
    public final void mo41792d(C9922j1 c9922j1, ServiceConnection serviceConnection, String str) {
        C9935o.m41851k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f45617f) {
            ServiceConnectionC9925k1 serviceConnectionC9925k1 = this.f45617f.get(c9922j1);
            if (serviceConnectionC9925k1 == null) {
                String obj = c9922j1.toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(obj);
                throw new IllegalStateException(sb2.toString());
            }
            if (!serviceConnectionC9925k1.m41823h(serviceConnection)) {
                String obj2 = c9922j1.toString();
                StringBuilder sb3 = new StringBuilder(obj2.length() + 76);
                sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb3.append(obj2);
                throw new IllegalStateException(sb3.toString());
            }
            serviceConnectionC9925k1.m41821f(serviceConnection, str);
            if (serviceConnectionC9925k1.m41824i()) {
                this.f45619h.sendMessageDelayed(this.f45619h.obtainMessage(0, c9922j1), this.f45622k);
            }
        }
    }

    @Override // p422y9.AbstractC9914h
    /* renamed from: f */
    public final boolean mo41794f(C9922j1 c9922j1, ServiceConnection serviceConnection, String str, Executor executor) {
        ServiceConnectionC9925k1 serviceConnectionC9925k1;
        boolean m41825j;
        C9935o.m41851k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f45617f) {
            ServiceConnectionC9925k1 serviceConnectionC9925k12 = this.f45617f.get(c9922j1);
            if (serviceConnectionC9925k12 == null) {
                ServiceConnectionC9925k1 serviceConnectionC9925k13 = new ServiceConnectionC9925k1(this, c9922j1);
                serviceConnectionC9925k13.m41819d(serviceConnection, serviceConnection, str);
                serviceConnectionC9925k13.m41820e(str, executor);
                this.f45617f.put(c9922j1, serviceConnectionC9925k13);
                serviceConnectionC9925k1 = serviceConnectionC9925k13;
            } else {
                this.f45619h.removeMessages(0, c9922j1);
                if (serviceConnectionC9925k12.m41823h(serviceConnection)) {
                    String obj = c9922j1.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 81);
                    sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString());
                }
                serviceConnectionC9925k12.m41819d(serviceConnection, serviceConnection, str);
                int m41816a = serviceConnectionC9925k12.m41816a();
                if (m41816a == 1) {
                    serviceConnection.onServiceConnected(serviceConnectionC9925k12.m41817b(), serviceConnectionC9925k12.m41818c());
                    serviceConnectionC9925k1 = serviceConnectionC9925k12;
                } else if (m41816a != 2) {
                    serviceConnectionC9925k1 = serviceConnectionC9925k12;
                } else {
                    serviceConnectionC9925k12.m41820e(str, executor);
                    serviceConnectionC9925k1 = serviceConnectionC9925k12;
                }
            }
            m41825j = serviceConnectionC9925k1.m41825j();
        }
        return m41825j;
    }
}
