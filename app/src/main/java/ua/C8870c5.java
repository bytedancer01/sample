package ua;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
import p060da.C4409h;
import p060da.InterfaceC4406e;
import p097fa.C4794e;
import p305ra.AbstractC8408x3;
import p305ra.C8175ha;
import p305ra.C8310qa;
import p305ra.C8386vb;
import p305ra.C8433yd;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/c5.class
 */
/* renamed from: ua.c5 */
/* loaded from: combined.jar:classes2.jar:ua/c5.class */
public final class C8870c5 implements InterfaceC9130y5 {

    /* renamed from: I */
    public static volatile C8870c5 f40955I;

    /* renamed from: A */
    public long f40956A;

    /* renamed from: B */
    public volatile Boolean f40957B;

    /* renamed from: C */
    public Boolean f40958C;

    /* renamed from: D */
    public Boolean f40959D;

    /* renamed from: E */
    public volatile boolean f40960E;

    /* renamed from: F */
    public int f40961F;

    /* renamed from: H */
    public final long f40963H;

    /* renamed from: a */
    public final Context f40964a;

    /* renamed from: b */
    public final String f40965b;

    /* renamed from: c */
    public final String f40966c;

    /* renamed from: d */
    public final String f40967d;

    /* renamed from: e */
    public final boolean f40968e;

    /* renamed from: f */
    public final C9079ta f40969f;

    /* renamed from: g */
    public final C8900f f40970g;

    /* renamed from: h */
    public final C9013o4 f40971h;

    /* renamed from: i */
    public final C9128y3 f40972i;

    /* renamed from: j */
    public final C9140z4 f40973j;

    /* renamed from: k */
    public final C8970k9 f40974k;

    /* renamed from: l */
    public final C8899ea f40975l;

    /* renamed from: m */
    public final C9072t3 f40976m;

    /* renamed from: n */
    public final InterfaceC4406e f40977n;

    /* renamed from: o */
    public final C9088u7 f40978o;

    /* renamed from: p */
    public final C8908f7 f40979p;

    /* renamed from: q */
    public final C8879d2 f40980q;

    /* renamed from: r */
    public final C8968k7 f40981r;

    /* renamed from: s */
    public final String f40982s;

    /* renamed from: t */
    public C9060s3 f40983t;

    /* renamed from: u */
    public C9089u8 f40984u;

    /* renamed from: v */
    public C8996n f40985v;

    /* renamed from: w */
    public C9036q3 f40986w;

    /* renamed from: x */
    public C9049r4 f40987x;

    /* renamed from: z */
    public Boolean f40989z;

    /* renamed from: y */
    public boolean f40988y = false;

    /* renamed from: G */
    public final AtomicInteger f40962G = new AtomicInteger(0);

    public C8870c5(C8907f6 c8907f6) {
        C9106w3 m38411r;
        String str;
        Bundle bundle;
        boolean z10 = false;
        C9935o.m41850j(c8907f6);
        C9079ta c9079ta = new C9079ta(c8907f6.f41061a);
        this.f40969f = c9079ta;
        C8964k3.f41253a = c9079ta;
        Context context = c8907f6.f41061a;
        this.f40964a = context;
        this.f40965b = c8907f6.f41062b;
        this.f40966c = c8907f6.f41063c;
        this.f40967d = c8907f6.f41064d;
        this.f40968e = c8907f6.f41068h;
        this.f40957B = c8907f6.f41065e;
        this.f40982s = c8907f6.f41070j;
        this.f40960E = true;
        C8433yd c8433yd = c8907f6.f41067g;
        if (c8433yd != null && (bundle = c8433yd.f39432j) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f40958C = (Boolean) obj;
            }
            Object obj2 = c8433yd.f39432j.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f40959D = (Boolean) obj2;
            }
        }
        AbstractC8408x3.m36062b(context);
        InterfaceC4406e m22439d = C4409h.m22439d();
        this.f40977n = m22439d;
        Long l10 = c8907f6.f41069i;
        this.f40963H = l10 != null ? l10.longValue() : m22439d.mo22432a();
        this.f40970g = new C8900f(this);
        C9013o4 c9013o4 = new C9013o4(this);
        c9013o4.m38336m();
        this.f40971h = c9013o4;
        C9128y3 c9128y3 = new C9128y3(this);
        c9128y3.m38336m();
        this.f40972i = c9128y3;
        C8899ea c8899ea = new C8899ea(this);
        c8899ea.m38336m();
        this.f40975l = c8899ea;
        C9072t3 c9072t3 = new C9072t3(this);
        c9072t3.m38336m();
        this.f40976m = c9072t3;
        this.f40980q = new C8879d2(this);
        C9088u7 c9088u7 = new C9088u7(this);
        c9088u7.m37906k();
        this.f40978o = c9088u7;
        C8908f7 c8908f7 = new C8908f7(this);
        c8908f7.m37906k();
        this.f40979p = c8908f7;
        C8970k9 c8970k9 = new C8970k9(this);
        c8970k9.m37906k();
        this.f40974k = c8970k9;
        C8968k7 c8968k7 = new C8968k7(this);
        c8968k7.m38336m();
        this.f40981r = c8968k7;
        C9140z4 c9140z4 = new C9140z4(this);
        c9140z4.m38336m();
        this.f40973j = c9140z4;
        C8433yd c8433yd2 = c8907f6.f41067g;
        z10 = (c8433yd2 == null || c8433yd2.f39427e == 0) ? true : z10;
        if (context.getApplicationContext() instanceof Application) {
            C8908f7 m37764F = m37764F();
            if (m37764F.f41723a.f40964a.getApplicationContext() instanceof Application) {
                Application application = (Application) m37764F.f41723a.f40964a.getApplicationContext();
                if (m37764F.f41071c == null) {
                    m37764F.f41071c = new C8896e7(m37764F, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(m37764F.f41071c);
                    application.registerActivityLifecycleCallbacks(m37764F.f41071c);
                    m38411r = m37764F.f41723a.mo37780c().m38416w();
                    str = "Registered activity lifecycle callback";
                }
            }
            c9140z4.m38436r(new RunnableC8858b5(this, c8907f6));
        }
        m38411r = mo37780c().m38411r();
        str = "Application context is not an Application";
        m38411r.m38326a(str);
        c9140z4.m38436r(new RunnableC8858b5(this, c8907f6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r14.f39431i == null) goto L8;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ua.C8870c5 m37753h(android.content.Context r13, p305ra.C8433yd r14, java.lang.Long r15) {
        /*
            r0 = r14
            r16 = r0
            r0 = r14
            if (r0 == 0) goto L35
            r0 = r14
            java.lang.String r0 = r0.f39430h
            if (r0 == 0) goto L16
            r0 = r14
            r16 = r0
            r0 = r14
            java.lang.String r0 = r0.f39431i
            if (r0 != 0) goto L35
        L16:
            ra.yd r0 = new ra.yd
            r1 = r0
            r2 = r14
            long r2 = r2.f39426d
            r3 = r14
            long r3 = r3.f39427e
            r4 = r14
            boolean r4 = r4.f39428f
            r5 = r14
            java.lang.String r5 = r5.f39429g
            r6 = 0
            r7 = 0
            r8 = r14
            android.os.Bundle r8 = r8.f39432j
            r9 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r16 = r0
        L35:
            r0 = r13
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            r0 = r13
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            ua.c5 r0 = ua.C8870c5.f40955I
            if (r0 != 0) goto L75
            java.lang.Class<ua.c5> r0 = ua.C8870c5.class
            monitor-enter(r0)
            ua.c5 r0 = ua.C8870c5.f40955I     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L69
            ua.f6 r0 = new ua.f6     // Catch: java.lang.Throwable -> L6f
            r14 = r0
            r0 = r14
            r1 = r13
            r2 = r16
            r3 = r15
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L6f
            ua.c5 r0 = new ua.c5     // Catch: java.lang.Throwable -> L6f
            r13 = r0
            r0 = r13
            r1 = r14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            r0 = r13
            ua.C8870c5.f40955I = r0     // Catch: java.lang.Throwable -> L6f
        L69:
            java.lang.Class<ua.c5> r0 = ua.C8870c5.class
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            goto La6
        L6f:
            r13 = move-exception
            java.lang.Class<ua.c5> r0 = ua.C8870c5.class
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            r0 = r13
            throw r0
        L75:
            r0 = r16
            if (r0 == 0) goto La6
            r0 = r16
            android.os.Bundle r0 = r0.f39432j
            r13 = r0
            r0 = r13
            if (r0 == 0) goto La6
            r0 = r13
            java.lang.String r1 = "dataCollectionDefaultEnabled"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto La6
            ua.c5 r0 = ua.C8870c5.f40955I
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            ua.c5 r0 = ua.C8870c5.f40955I
            r1 = r16
            android.os.Bundle r1 = r1.f39432j
            java.lang.String r2 = "dataCollectionDefaultEnabled"
            boolean r1 = r1.getBoolean(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f40957B = r1
        La6:
            ua.c5 r0 = ua.C8870c5.f40955I
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            ua.c5 r0 = ua.C8870c5.f40955I
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8870c5.m37753h(android.content.Context, ra.yd, java.lang.Long):ua.c5");
    }

    /* renamed from: t */
    public static /* synthetic */ void m37754t(C8870c5 c8870c5, C8907f6 c8907f6) {
        c8870c5.mo37782e().mo37811h();
        c8870c5.f40970g.m37889l();
        C8996n c8996n = new C8996n(c8870c5);
        c8996n.m38336m();
        c8870c5.f40985v = c8996n;
        C9036q3 c9036q3 = new C9036q3(c8870c5, c8907f6.f41066f);
        c9036q3.m37906k();
        c8870c5.f40986w = c9036q3;
        C9060s3 c9060s3 = new C9060s3(c8870c5);
        c9060s3.m37906k();
        c8870c5.f40983t = c9060s3;
        C9089u8 c9089u8 = new C9089u8(c8870c5);
        c9089u8.m37906k();
        c8870c5.f40984u = c9089u8;
        c8870c5.f40975l.m38337n();
        c8870c5.f40971h.m38337n();
        c8870c5.f40987x = new C9049r4(c8870c5);
        c8870c5.f40986w.m37907l();
        C9106w3 m38414u = c8870c5.mo37780c().m38414u();
        c8870c5.f40970g.m37893p();
        m38414u.m38327b("App measurement initialized, version", 37000L);
        c8870c5.mo37780c().m38414u().m38326a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m38191p = c9036q3.m38191p();
        if (TextUtils.isEmpty(c8870c5.f40965b)) {
            if (c8870c5.m37765G().m37830H(m38191p)) {
                c8870c5.mo37780c().m38414u().m38326a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                C9106w3 m38414u2 = c8870c5.mo37780c().m38414u();
                String valueOf = String.valueOf(m38191p);
                m38414u2.m38326a(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        c8870c5.mo37780c().m38415v().m38326a("Debug-level message logging enabled");
        if (c8870c5.f40961F != c8870c5.f40962G.get()) {
            c8870c5.mo37780c().m38408o().m38328c("Not all components initialized", Integer.valueOf(c8870c5.f40961F), Integer.valueOf(c8870c5.f40962G.get()));
        }
        c8870c5.f40988y = true;
    }

    /* renamed from: u */
    public static final void m37755u() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: v */
    public static final void m37756v(C9108w5 c9108w5) {
        if (c9108w5 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: w */
    public static final void m37757w(AbstractC8905f4 abstractC8905f4) {
        if (abstractC8905f4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC8905f4.m37904i()) {
            return;
        }
        String valueOf = String.valueOf(abstractC8905f4.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
        sb2.append("Component not initialized: ");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: x */
    public static final void m37758x(AbstractC9119x5 abstractC9119x5) {
        if (abstractC9119x5 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC9119x5.m38334k()) {
            return;
        }
        String valueOf = String.valueOf(abstractC9119x5.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
        sb2.append("Component not initialized: ");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    @Pure
    /* renamed from: A */
    public final C9013o4 m37759A() {
        m37756v(this.f40971h);
        return this.f40971h;
    }

    /* renamed from: B */
    public final C9128y3 m37760B() {
        C9128y3 c9128y3 = this.f40972i;
        if (c9128y3 == null || !c9128y3.m38334k()) {
            return null;
        }
        return this.f40972i;
    }

    @Pure
    /* renamed from: C */
    public final C8970k9 m37761C() {
        m37757w(this.f40974k);
        return this.f40974k;
    }

    @SideEffectFree
    /* renamed from: D */
    public final C9049r4 m37762D() {
        return this.f40987x;
    }

    @SideEffectFree
    /* renamed from: E */
    public final C9140z4 m37763E() {
        return this.f40973j;
    }

    @Pure
    /* renamed from: F */
    public final C8908f7 m37764F() {
        m37757w(this.f40979p);
        return this.f40979p;
    }

    @Pure
    /* renamed from: G */
    public final C8899ea m37765G() {
        m37756v(this.f40975l);
        return this.f40975l;
    }

    @Pure
    /* renamed from: H */
    public final C9072t3 m37766H() {
        m37756v(this.f40976m);
        return this.f40976m;
    }

    @Pure
    /* renamed from: I */
    public final C9060s3 m37767I() {
        m37757w(this.f40983t);
        return this.f40983t;
    }

    @Pure
    /* renamed from: J */
    public final C8968k7 m37768J() {
        m37758x(this.f40981r);
        return this.f40981r;
    }

    @Pure
    /* renamed from: K */
    public final boolean m37769K() {
        return TextUtils.isEmpty(this.f40965b);
    }

    @Pure
    /* renamed from: L */
    public final String m37770L() {
        return this.f40965b;
    }

    @Pure
    /* renamed from: M */
    public final String m37771M() {
        return this.f40966c;
    }

    @Pure
    /* renamed from: N */
    public final String m37772N() {
        return this.f40967d;
    }

    @Pure
    /* renamed from: O */
    public final boolean m37773O() {
        return this.f40968e;
    }

    @Pure
    /* renamed from: P */
    public final String m37774P() {
        return this.f40982s;
    }

    @Pure
    /* renamed from: Q */
    public final C9088u7 m37775Q() {
        m37757w(this.f40978o);
        return this.f40978o;
    }

    @Pure
    /* renamed from: R */
    public final C9089u8 m37776R() {
        m37757w(this.f40984u);
        return this.f40984u;
    }

    @Pure
    /* renamed from: S */
    public final C8996n m37777S() {
        m37758x(this.f40985v);
        return this.f40985v;
    }

    @Override // ua.InterfaceC9130y5
    @Pure
    /* renamed from: a */
    public final InterfaceC4406e mo37778a() {
        return this.f40977n;
    }

    @Override // ua.InterfaceC9130y5
    @Pure
    /* renamed from: b */
    public final Context mo37779b() {
        return this.f40964a;
    }

    @Override // ua.InterfaceC9130y5
    @Pure
    /* renamed from: c */
    public final C9128y3 mo37780c() {
        m37758x(this.f40972i);
        return this.f40972i;
    }

    @Pure
    /* renamed from: d */
    public final C9036q3 m37781d() {
        m37757w(this.f40986w);
        return this.f40986w;
    }

    @Override // ua.InterfaceC9130y5
    @Pure
    /* renamed from: e */
    public final C9140z4 mo37782e() {
        m37758x(this.f40973j);
        return this.f40973j;
    }

    @Override // ua.InterfaceC9130y5
    @Pure
    /* renamed from: f */
    public final C9079ta mo37783f() {
        return this.f40969f;
    }

    @Pure
    /* renamed from: g */
    public final C8879d2 m37784g() {
        C8879d2 c8879d2 = this.f40980q;
        if (c8879d2 != null) {
            return c8879d2;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: i */
    public final void m37785i(boolean z10) {
        this.f40957B = Boolean.valueOf(z10);
    }

    /* renamed from: j */
    public final boolean m37786j() {
        return this.f40957B != null && this.f40957B.booleanValue();
    }

    /* renamed from: k */
    public final boolean m37787k() {
        return m37788l() == 0;
    }

    /* renamed from: l */
    public final int m37788l() {
        mo37782e().mo37811h();
        if (this.f40970g.m37879A()) {
            return 1;
        }
        Boolean bool = this.f40959D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C8175ha.m35418a();
        if (this.f40970g.m37900w(null, C8988m3.f41323G0)) {
            mo37782e().mo37811h();
            if (!this.f40960E) {
                return 8;
            }
        }
        Boolean m38169r = m37759A().m38169r();
        if (m38169r != null) {
            return m38169r.booleanValue() ? 0 : 3;
        }
        C8900f c8900f = this.f40970g;
        C9079ta c9079ta = c8900f.f41723a.f40969f;
        Boolean m37902y = c8900f.m37902y("firebase_analytics_collection_enabled");
        if (m37902y != null) {
            return m37902y.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f40958C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f40970g.m37900w(null, C8988m3.f41344T) || this.f40957B == null || this.f40957B.booleanValue()) ? 0 : 7;
    }

    /* renamed from: m */
    public final void m37789m(boolean z10) {
        mo37782e().mo37811h();
        this.f40960E = z10;
    }

    /* renamed from: n */
    public final boolean m37790n() {
        mo37782e().mo37811h();
        return this.f40960E;
    }

    /* renamed from: o */
    public final void m37791o() {
        this.f40961F++;
    }

    /* renamed from: p */
    public final void m37792p() {
        this.f40962G.incrementAndGet();
    }

    /* renamed from: q */
    public final boolean m37793q() {
        if (!this.f40988y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        mo37782e().mo37811h();
        Boolean bool = this.f40989z;
        if (bool == null || this.f40956A == 0 || (!bool.booleanValue() && Math.abs(this.f40977n.mo22433b() - this.f40956A) > 1000)) {
            this.f40956A = this.f40977n.mo22433b();
            Boolean valueOf = Boolean.valueOf(m37765G().m37829E("android.permission.INTERNET") && m37765G().m37829E("android.permission.ACCESS_NETWORK_STATE") && (C4794e.m24250a(this.f40964a).m24248f() || this.f40970g.m37886H() || (C9073t4.m38236a(this.f40964a) && C8899ea.m37818D(this.f40964a, false))));
            this.f40989z = valueOf;
            if (valueOf.booleanValue()) {
                boolean z10 = true;
                if (!m37765G().m37858o(m37781d().m38192q(), m37781d().m38193r(), m37781d().m38194s())) {
                    z10 = !TextUtils.isEmpty(m37781d().m38193r());
                }
                this.f40989z = Boolean.valueOf(z10);
            }
        }
        return this.f40989z.booleanValue();
    }

    /* renamed from: r */
    public final void m37794r() {
        mo37782e().mo37811h();
        m37758x(m37768J());
        String m38191p = m37781d().m38191p();
        Pair<String, Boolean> m38166o = m37759A().m38166o(m38191p);
        if (!this.f40970g.m37880B() || ((Boolean) m38166o.second).booleanValue() || TextUtils.isEmpty((CharSequence) m38166o.first)) {
            mo37780c().m38415v().m38326a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C8968k7 m37768J = m37768J();
        m37768J.m38335l();
        ConnectivityManager connectivityManager = (ConnectivityManager) m37768J.f41723a.f40964a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e10) {
                networkInfo = null;
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo37780c().m38411r().m38326a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        C8899ea m37765G = m37765G();
        m37781d().f41723a.f40970g.m37893p();
        URL m37846Z = m37765G.m37846Z(37000L, m38191p, (String) m38166o.first, m37759A().f41501x.m38109a() - 1);
        if (m37846Z != null) {
            C8968k7 m37768J2 = m37768J();
            C8846a5 c8846a5 = new C8846a5(this);
            m37768J2.mo37811h();
            m37768J2.m38335l();
            C9935o.m41850j(m37846Z);
            C9935o.m41850j(c8846a5);
            m37768J2.f41723a.mo37782e().m38439u(new RunnableC8956j7(m37768J2, m38191p, m37846Z, null, null, c8846a5, null));
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void m37795s(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        int i11 = i10;
        if (i10 != 200) {
            i11 = i10;
            if (i10 != 204) {
                i11 = i10;
                if (i10 == 304) {
                    i11 = 304;
                }
                mo37780c().m38411r().m38328c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
            }
        }
        if (th2 == null) {
            m37759A().f41500w.m38091b(true);
            if (bArr == null || bArr.length == 0) {
                mo37780c().m38415v().m38326a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo37780c().m38415v().m38326a("Deferred Deep Link is empty.");
                    return;
                }
                C8899ea m37765G = m37765G();
                C8870c5 c8870c5 = m37765G.f41723a;
                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = m37765G.f41723a.f40964a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.f40979p.m37933X("auto", "_cmp", bundle);
                    C8899ea m37765G2 = m37765G();
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    try {
                        SharedPreferences.Editor edit = m37765G2.f41723a.f40964a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            m37765G2.f41723a.f40964a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        m37765G2.f41723a.mo37780c().m38408o().m38327b("Failed to persist Deferred Deep Link. exception", e10);
                        return;
                    }
                }
                mo37780c().m38411r().m38328c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e11) {
                mo37780c().m38408o().m38327b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        mo37780c().m38411r().m38328c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    /* renamed from: y */
    public final void m37796y(C8433yd c8433yd) {
        C8912g c8912g;
        C8912g m37955b;
        mo37782e().mo37811h();
        C8175ha.m35418a();
        C8900f c8900f = this.f40970g;
        C8976l3<Boolean> c8976l3 = C8988m3.f41323G0;
        if (c8900f.m37900w(null, c8976l3)) {
            C8912g m38171t = m37759A().m38171t();
            C9013o4 m37759A = m37759A();
            C8870c5 c8870c5 = m37759A.f41723a;
            m37759A.mo37811h();
            int i10 = 100;
            int i11 = m37759A.m38167p().getInt("consent_source", 100);
            C8900f c8900f2 = this.f40970g;
            C8976l3<Boolean> c8976l32 = C8988m3.f41325H0;
            if (c8900f2.m37900w(null, c8976l32)) {
                C8900f c8900f3 = this.f40970g;
                C8870c5 c8870c52 = c8900f3.f41723a;
                C8175ha.m35418a();
                Boolean m37902y = !c8900f3.m37900w(null, c8976l32) ? null : c8900f3.m37902y("google_analytics_default_allow_ad_storage");
                C8900f c8900f4 = this.f40970g;
                C8870c5 c8870c53 = c8900f4.f41723a;
                C8175ha.m35418a();
                Boolean m37902y2 = !c8900f4.m37900w(null, c8976l32) ? null : c8900f4.m37902y("google_analytics_default_allow_analytics_storage");
                if (!(m37902y == null && m37902y2 == null) && m37759A().m38170s(20)) {
                    m37955b = new C8912g(m37902y, m37902y2);
                    i10 = 20;
                } else {
                    if (!TextUtils.isEmpty(m37781d().m38192q()) && (i11 == 30 || i11 == 40)) {
                        m37764F().m37931V(C8912g.f41092c, 20, this.f40963H);
                    } else if (c8433yd != null && c8433yd.f39432j != null && m37759A().m38170s(40)) {
                        m37955b = C8912g.m37955b(c8433yd.f39432j);
                        if (!m37955b.equals(C8912g.f41092c)) {
                            i10 = 40;
                        }
                    }
                    m37955b = null;
                }
                c8912g = m38171t;
                if (m37955b != null) {
                    m37764F().m37931V(m37955b, i10, this.f40963H);
                    c8912g = m37955b;
                }
                m37764F().m37932W(c8912g);
            } else {
                c8912g = m38171t;
                if (c8433yd != null) {
                    c8912g = m38171t;
                    if (c8433yd.f39432j != null) {
                        c8912g = m38171t;
                        if (m37759A().m38170s(40)) {
                            m37955b = C8912g.m37955b(c8433yd.f39432j);
                            c8912g = m38171t;
                            if (!m37955b.equals(C8912g.f41092c)) {
                                m37764F().m37931V(m37955b, 40, this.f40963H);
                                c8912g = m37955b;
                            }
                        }
                    }
                }
                m37764F().m37932W(c8912g);
            }
        }
        if (m37759A().f41482e.m38109a() == 0) {
            m37759A().f41482e.m38110b(this.f40977n.mo22432a());
        }
        if (Long.valueOf(m37759A().f41487j.m38109a()).longValue() == 0) {
            mo37780c().m38416w().m38327b("Persisting first open", Long.valueOf(this.f40963H));
            m37759A().f41487j.m38110b(this.f40963H);
        }
        if (this.f40970g.m37900w(null, C8988m3.f41317D0)) {
            m37764F().f41082n.m38117c();
        }
        if (m37793q()) {
            if (!TextUtils.isEmpty(m37781d().m38192q()) || !TextUtils.isEmpty(m37781d().m38193r())) {
                C8899ea m37765G = m37765G();
                String m38192q = m37781d().m38192q();
                C9013o4 m37759A2 = m37759A();
                m37759A2.mo37811h();
                String string = m37759A2.m38167p().getString("gmp_app_id", null);
                String m38193r = m37781d().m38193r();
                C9013o4 m37759A3 = m37759A();
                m37759A3.mo37811h();
                if (m37765G.m37860p(m38192q, string, m38193r, m37759A3.m38167p().getString("admob_app_id", null))) {
                    mo37780c().m38414u().m38326a("Rechecking which service to use due to a GMP App Id change");
                    C9013o4 m37759A4 = m37759A();
                    m37759A4.mo37811h();
                    Boolean m38169r = m37759A4.m38169r();
                    SharedPreferences.Editor edit = m37759A4.m38167p().edit();
                    edit.clear();
                    edit.apply();
                    if (m38169r != null) {
                        m37759A4.m38168q(m38169r);
                    }
                    m37767I().m38216o();
                    this.f40984u.m38312t();
                    this.f40984u.m38308p();
                    m37759A().f41487j.m38110b(this.f40963H);
                    m37759A().f41489l.m38156b(null);
                }
                C9013o4 m37759A5 = m37759A();
                String m38192q2 = m37781d().m38192q();
                m37759A5.mo37811h();
                SharedPreferences.Editor edit2 = m37759A5.m38167p().edit();
                edit2.putString("gmp_app_id", m38192q2);
                edit2.apply();
                C9013o4 m37759A6 = m37759A();
                String m38193r2 = m37781d().m38193r();
                m37759A6.mo37811h();
                SharedPreferences.Editor edit3 = m37759A6.m38167p().edit();
                edit3.putString("admob_app_id", m38193r2);
                edit3.apply();
            }
            C8175ha.m35418a();
            if (this.f40970g.m37900w(null, c8976l3) && !m37759A().m38171t().m37967h()) {
                m37759A().f41489l.m38156b(null);
            }
            m37764F().m37943r(m37759A().f41489l.m38155a());
            C8310qa.m35742a();
            if (this.f40970g.m37900w(null, C8988m3.f41382p0)) {
                try {
                    m37765G().f41723a.f40964a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException e10) {
                    if (!TextUtils.isEmpty(m37759A().f41502y.m38155a())) {
                        mo37780c().m38411r().m38326a("Remote config removed with active feature rollouts");
                        m37759A().f41502y.m38156b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(m37781d().m38192q()) || !TextUtils.isEmpty(m37781d().m38193r())) {
                boolean m37787k = m37787k();
                if (!m37759A().m38173v() && !this.f40970g.m37879A()) {
                    m37759A().m38172u(!m37787k);
                }
                if (m37787k) {
                    m37764F().m37946u();
                }
                m37761C().f41270d.m38094a();
                m37776R().m38303T(new AtomicReference<>());
                C8386vb.m35974a();
                if (this.f40970g.m37900w(null, C8988m3.f41311A0)) {
                    m37776R().m38307o(m37759A().f41479B.m38099a());
                }
            }
        } else if (m37787k()) {
            if (!m37765G().m37829E("android.permission.INTERNET")) {
                mo37780c().m38408o().m38326a("App is missing INTERNET permission");
            }
            if (!m37765G().m37829E("android.permission.ACCESS_NETWORK_STATE")) {
                mo37780c().m38408o().m38326a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C4794e.m24250a(this.f40964a).m24248f() && !this.f40970g.m37886H()) {
                if (!C9073t4.m38236a(this.f40964a)) {
                    mo37780c().m38408o().m38326a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C8899ea.m37818D(this.f40964a, false)) {
                    mo37780c().m38408o().m38326a("AppMeasurementService not registered/enabled");
                }
            }
            mo37780c().m38408o().m38326a("Uploading is not possible. App measurement disabled");
        }
        m37759A().f41496s.m38091b(this.f40970g.m37900w(null, C8988m3.f41349Y));
    }

    @Pure
    /* renamed from: z */
    public final C8900f m37797z() {
        return this.f40970g;
    }
}
