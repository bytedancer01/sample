package p127h9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import ca.C1052b;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p185ka.AbstractBinderC5539e;
import p185ka.InterfaceC5540f;
import p350u9.C8814g;
import p350u9.C8816h;
import p350u9.C8822k;
import p350u9.ServiceConnectionC8802a;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h9/a.class
 */
/* renamed from: h9.a */
/* loaded from: combined.jar:classes2.jar:h9/a.class */
public class C5043a {

    /* renamed from: a */
    public ServiceConnectionC8802a f29109a;

    /* renamed from: b */
    public InterfaceC5540f f29110b;

    /* renamed from: c */
    public boolean f29111c;

    /* renamed from: d */
    public final Object f29112d;

    /* renamed from: e */
    public C5045c f29113e;

    /* renamed from: f */
    public final Context f29114f;

    /* renamed from: g */
    public final long f29115g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:h9/a$a.class
     */
    /* renamed from: h9.a$a */
    /* loaded from: combined.jar:classes2.jar:h9/a$a.class */
    public static final class a {

        /* renamed from: a */
        public final String f29116a;

        /* renamed from: b */
        public final boolean f29117b;

        public a(String str, boolean z10) {
            this.f29116a = str;
            this.f29117b = z10;
        }

        @RecentlyNullable
        /* renamed from: a */
        public String m25270a() {
            return this.f29116a;
        }

        /* renamed from: b */
        public boolean m25271b() {
            return this.f29117b;
        }

        @RecentlyNonNull
        public String toString() {
            String str = this.f29116a;
            boolean z10 = this.f29117b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public C5043a(@RecentlyNonNull Context context) {
        this(context, 30000L, false, false);
    }

    public C5043a(@RecentlyNonNull Context context, long j10, boolean z10, boolean z11) {
        this.f29112d = new Object();
        C9935o.m41850j(context);
        Context context2 = context;
        if (z10) {
            Context applicationContext = context.getApplicationContext();
            context2 = context;
            if (applicationContext != null) {
                context2 = applicationContext;
            }
        }
        this.f29114f = context2;
        this.f29111c = false;
        this.f29115g = j10;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static a m25262a(@RecentlyNonNull Context context) {
        C5043a c5043a = new C5043a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c5043a.m25267f(false);
            a m25264b = c5043a.m25264b();
            c5043a.m25268g(m25264b, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return m25264b;
        } finally {
        }
    }

    /* renamed from: c */
    public static void m25263c(boolean z10) {
    }

    @RecentlyNonNull
    /* renamed from: b */
    public a m25264b() {
        a aVar;
        C9935o.m41849i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f29111c) {
                synchronized (this.f29112d) {
                    C5045c c5045c = this.f29113e;
                    if (c5045c == null || !c5045c.f29122e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m25267f(false);
                    if (!this.f29111c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            C9935o.m41850j(this.f29109a);
            C9935o.m41850j(this.f29110b);
            try {
                aVar = new a(this.f29110b.mo27526l(), this.f29110b.mo27525H(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        m25269h();
        return aVar;
    }

    /* renamed from: d */
    public void m25265d() {
        m25267f(true);
    }

    /* renamed from: e */
    public final void m25266e() {
        C9935o.m41849i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f29114f == null || this.f29109a == null) {
                return;
            }
            try {
                if (this.f29111c) {
                    C1052b.m6223b().m6228c(this.f29114f, this.f29109a);
                }
            } catch (Throwable th2) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
            }
            this.f29111c = false;
            this.f29110b = null;
            this.f29109a = null;
        }
    }

    /* renamed from: f */
    public final void m25267f(boolean z10) {
        C9935o.m41849i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f29111c) {
                m25266e();
            }
            Context context = this.f29114f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int mo37681j = C8814g.m37697h().mo37681j(context, C8822k.f40857a);
                if (mo37681j != 0 && mo37681j != 2) {
                    throw new IOException("Google Play services not available");
                }
                ServiceConnectionC8802a serviceConnectionC8802a = new ServiceConnectionC8802a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!C1052b.m6223b().m6227a(context, intent, serviceConnectionC8802a, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f29109a = serviceConnectionC8802a;
                    try {
                        this.f29110b = AbstractBinderC5539e.m27527Z(serviceConnectionC8802a.m37657a(10000L, TimeUnit.MILLISECONDS));
                        this.f29111c = true;
                        if (z10) {
                            m25269h();
                        }
                    } catch (InterruptedException e10) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } finally {
                    IOException iOException = new IOException(th2);
                }
            } catch (PackageManager.NameNotFoundException e11) {
                throw new C8816h(9);
            }
        }
    }

    public final void finalize() {
        m25266e();
        super.finalize();
    }

    /* renamed from: g */
    public final boolean m25268g(a aVar, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (aVar != null) {
            hashMap.put("limit_ad_tracking", true != aVar.m25271b() ? "0" : "1");
            String m25270a = aVar.m25270a();
            if (m25270a != null) {
                hashMap.put("ad_id_size", Integer.toString(m25270a.length()));
            }
        }
        if (th2 != null) {
            hashMap.put("error", th2.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new C5044b(this, hashMap).start();
        return true;
    }

    /* renamed from: h */
    public final void m25269h() {
        synchronized (this.f29112d) {
            C5045c c5045c = this.f29113e;
            if (c5045c != null) {
                c5045c.f29121d.countDown();
                try {
                    this.f29113e.join();
                } catch (InterruptedException e10) {
                }
            }
            long j10 = this.f29115g;
            if (j10 > 0) {
                this.f29113e = new C5045c(this, j10);
            }
        }
    }
}
