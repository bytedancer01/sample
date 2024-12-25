package mc;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;
import p060da.C4404c;
import p060da.C4414m;
import p060da.C4415n;
import p131hd.C5058a;
import p175k0.C5452m;
import p287qc.C7882d;
import p287qc.C7886g;
import p287qc.C7893n;
import p287qc.C7902w;
import p294r.C7928a;
import p383w9.C9436a3;
import p383w9.ComponentCallbacks2C9442c;
import p405xc.InterfaceC9722c;
import p422y9.C9932n;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mc/c.class
 */
/* renamed from: mc.c */
/* loaded from: combined.jar:classes2.jar:mc/c.class */
public class C6553c {

    /* renamed from: j */
    public static final Object f34286j = new Object();

    /* renamed from: k */
    public static final Executor f34287k = new d();

    /* renamed from: l */
    public static final Map<String, C6553c> f34288l = new C7928a();

    /* renamed from: a */
    public final Context f34289a;

    /* renamed from: b */
    public final String f34290b;

    /* renamed from: c */
    public final C6559i f34291c;

    /* renamed from: d */
    public final C7893n f34292d;

    /* renamed from: g */
    public final C7902w<C5058a> f34295g;

    /* renamed from: e */
    public final AtomicBoolean f34293e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f34294f = new AtomicBoolean();

    /* renamed from: h */
    public final List<b> f34296h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public final List<Object> f34297i = new CopyOnWriteArrayList();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mc/c$b.class
     */
    /* renamed from: mc.c$b */
    /* loaded from: combined.jar:classes2.jar:mc/c$b.class */
    public interface b {
        /* renamed from: a */
        void m30246a(boolean z10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mc/c$c.class
     */
    @TargetApi(14)
    /* renamed from: mc.c$c */
    /* loaded from: combined.jar:classes2.jar:mc/c$c.class */
    public static class c implements ComponentCallbacks2C9442c.a {

        /* renamed from: a */
        public static AtomicReference<c> f34298a = new AtomicReference<>();

        /* renamed from: c */
        public static void m30248c(Context context) {
            if (C4414m.m22450a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f34298a.get() == null) {
                    c cVar = new c();
                    if (C9436a3.m39798a(f34298a, null, cVar)) {
                        ComponentCallbacks2C9442c.m39810c(application);
                        ComponentCallbacks2C9442c.m39809b().m39811a(cVar);
                    }
                }
            }
        }

        @Override // p383w9.ComponentCallbacks2C9442c.a
        /* renamed from: a */
        public void mo30249a(boolean z10) {
            synchronized (C6553c.f34286j) {
                Iterator it = new ArrayList(C6553c.f34288l.values()).iterator();
                while (it.hasNext()) {
                    C6553c c6553c = (C6553c) it.next();
                    if (c6553c.f34293e.get()) {
                        c6553c.m30245t(z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mc/c$d.class
     */
    /* renamed from: mc.c$d */
    /* loaded from: combined.jar:classes2.jar:mc/c$d.class */
    public static class d implements Executor {

        /* renamed from: b */
        public static final Handler f34299b = new Handler(Looper.getMainLooper());

        public d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f34299b.post(runnable);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mc/c$e.class
     */
    @TargetApi(24)
    /* renamed from: mc.c$e */
    /* loaded from: combined.jar:classes2.jar:mc/c$e.class */
    public static class e extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<e> f34300b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f34301a;

        public e(Context context) {
            this.f34301a = context;
        }

        /* renamed from: b */
        public static void m30251b(Context context) {
            if (f34300b.get() == null) {
                e eVar = new e(context);
                if (C9436a3.m39798a(f34300b, null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m30252c() {
            this.f34301a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C6553c.f34286j) {
                Iterator<C6553c> it = C6553c.f34288l.values().iterator();
                while (it.hasNext()) {
                    it.next().m30242l();
                }
            }
            m30252c();
        }
    }

    public C6553c(Context context, String str, C6559i c6559i) {
        this.f34289a = (Context) C9935o.m41850j(context);
        this.f34290b = C9935o.m41846f(str);
        this.f34291c = (C6559i) C9935o.m41850j(c6559i);
        this.f34292d = C7893n.m34203d(f34287k).m34218c(C7886g.m34192b(context, ComponentDiscoveryService.class).m34195a()).m34217b(new FirebaseCommonRegistrar()).m34216a(C7882d.m34172n(context, Context.class, new Class[0])).m34216a(C7882d.m34172n(this, C6553c.class, new Class[0])).m34216a(C7882d.m34172n(c6559i, C6559i.class, new Class[0])).m34219d();
        this.f34295g = new C7902w<>(C6552b.m30225a(this, context));
    }

    /* renamed from: h */
    public static C6553c m30230h() {
        C6553c c6553c;
        synchronized (f34286j) {
            c6553c = f34288l.get("[DEFAULT]");
            if (c6553c == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C4415n.m22462a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c6553c;
    }

    /* renamed from: m */
    public static C6553c m30231m(Context context) {
        synchronized (f34286j) {
            if (f34288l.containsKey("[DEFAULT]")) {
                return m30230h();
            }
            C6559i m30257a = C6559i.m30257a(context);
            if (m30257a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m30232n(context, m30257a);
        }
    }

    /* renamed from: n */
    public static C6553c m30232n(Context context, C6559i c6559i) {
        return m30233o(context, c6559i, "[DEFAULT]");
    }

    /* renamed from: o */
    public static C6553c m30233o(Context context, C6559i c6559i, String str) {
        C6553c c6553c;
        c.m30248c(context);
        String m30235s = m30235s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f34286j) {
            Map<String, C6553c> map = f34288l;
            C9935o.m41854n(!map.containsKey(m30235s), "FirebaseApp name " + m30235s + " already exists!");
            C9935o.m41851k(context, "Application context cannot be null.");
            c6553c = new C6553c(context, m30235s, c6559i);
            map.put(m30235s, c6553c);
        }
        c6553c.m30242l();
        return c6553c;
    }

    /* renamed from: r */
    public static /* synthetic */ C5058a m30234r(C6553c c6553c, Context context) {
        return new C5058a(context, c6553c.m30241k(), (InterfaceC9722c) c6553c.f34292d.get(InterfaceC9722c.class));
    }

    /* renamed from: s */
    public static String m30235s(String str) {
        return str.trim();
    }

    /* renamed from: e */
    public final void m30236e() {
        C9935o.m41854n(!this.f34294f.get(), "FirebaseApp was deleted");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6553c) {
            return this.f34290b.equals(((C6553c) obj).m30239i());
        }
        return false;
    }

    /* renamed from: f */
    public <T> T m30237f(Class<T> cls) {
        m30236e();
        return (T) this.f34292d.get(cls);
    }

    /* renamed from: g */
    public Context m30238g() {
        m30236e();
        return this.f34289a;
    }

    public int hashCode() {
        return this.f34290b.hashCode();
    }

    /* renamed from: i */
    public String m30239i() {
        m30236e();
        return this.f34290b;
    }

    /* renamed from: j */
    public C6559i m30240j() {
        m30236e();
        return this.f34291c;
    }

    /* renamed from: k */
    public String m30241k() {
        return C4404c.m22430a(m30239i().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + C4404c.m22430a(m30240j().m30259c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: l */
    public final void m30242l() {
        if (!C5452m.m27208a(this.f34289a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m30239i());
            e.m30251b(this.f34289a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m30239i());
        this.f34292d.m34210g(m30244q());
    }

    /* renamed from: p */
    public boolean m30243p() {
        m30236e();
        return this.f34295g.get().m25293b();
    }

    /* renamed from: q */
    public boolean m30244q() {
        return "[DEFAULT]".equals(m30239i());
    }

    /* renamed from: t */
    public final void m30245t(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<b> it = this.f34296h.iterator();
        while (it.hasNext()) {
            it.next().m30246a(z10);
        }
    }

    public String toString() {
        return C9932n.m41834d(this).m41835a("name", this.f34290b).m41835a("options", this.f34291c).toString();
    }
}
