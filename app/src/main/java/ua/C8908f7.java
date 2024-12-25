package ua;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p294r.C7928a;
import p305ra.C8161gb;
import p305ra.C8175ha;
import p305ra.C8372uc;
import p305ra.C8386vb;
import p305ra.C8415xa;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/f7.class
 */
/* renamed from: ua.f7 */
/* loaded from: combined.jar:classes2.jar:ua/f7.class */
public final class C8908f7 extends AbstractC8905f4 {

    /* renamed from: c */
    public C8896e7 f41071c;

    /* renamed from: d */
    public InterfaceC8883d6 f41072d;

    /* renamed from: e */
    public final Set<InterfaceC8895e6> f41073e;

    /* renamed from: f */
    public boolean f41074f;

    /* renamed from: g */
    public final AtomicReference<String> f41075g;

    /* renamed from: h */
    public final Object f41076h;

    /* renamed from: i */
    public C8912g f41077i;

    /* renamed from: j */
    public int f41078j;

    /* renamed from: k */
    public final AtomicLong f41079k;

    /* renamed from: l */
    public long f41080l;

    /* renamed from: m */
    public int f41081m;

    /* renamed from: n */
    public final C8983la f41082n;

    /* renamed from: o */
    public boolean f41083o;

    /* renamed from: p */
    public final InterfaceC8887da f41084p;

    public C8908f7(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41073e = new CopyOnWriteArraySet();
        this.f41076h = new Object();
        this.f41083o = true;
        this.f41084p = new C9087u6(this);
        this.f41075g = new AtomicReference<>();
        this.f41077i = new C8912g(null, null);
        this.f41078j = 100;
        this.f41080l = -1L;
        this.f41081m = 100;
        this.f41079k = new AtomicLong(0L);
        this.f41082n = new C8983la(c8870c5);
    }

    /* renamed from: J */
    public static /* synthetic */ void m37911J(C8908f7 c8908f7, C8912g c8912g, int i10, long j10, boolean z10, boolean z11) {
        c8908f7.mo37811h();
        c8908f7.m37905j();
        if (j10 <= c8908f7.f41080l && C8912g.m37958m(c8908f7.f41081m, i10)) {
            c8908f7.f41723a.mo37780c().m38414u().m38327b("Dropped out-of-date consent setting, proposed settings", c8912g);
            return;
        }
        C9013o4 m37759A = c8908f7.f41723a.m37759A();
        C8175ha.m35418a();
        if (m37759A.f41723a.m37797z().m37900w(null, C8988m3.f41323G0)) {
            m37759A.mo37811h();
            if (m37759A.m38170s(i10)) {
                SharedPreferences.Editor edit = m37759A.m38167p().edit();
                edit.putString("consent_settings", c8912g.m37963d());
                edit.putInt("consent_source", i10);
                edit.apply();
                c8908f7.f41080l = j10;
                c8908f7.f41081m = i10;
                c8908f7.f41723a.m37776R().m38293J(z10);
                if (z11) {
                    c8908f7.f41723a.m37776R().m38303T(new AtomicReference<>());
                    return;
                }
                return;
            }
        }
        c8908f7.f41723a.mo37780c().m38414u().m38327b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
    }

    /* renamed from: A */
    public final void m37913A(Bundle bundle, long j10) {
        C9935o.m41850j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f41723a.mo37780c().m38411r().m38326a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C9935o.m41850j(bundle2);
        C9141z5.m38441b(bundle2, "app_id", String.class, null);
        C9141z5.m38441b(bundle2, "origin", String.class, null);
        C9141z5.m38441b(bundle2, "name", String.class, null);
        C9141z5.m38441b(bundle2, "value", Object.class, null);
        C9141z5.m38441b(bundle2, "trigger_event_name", String.class, null);
        C9141z5.m38441b(bundle2, "trigger_timeout", Long.class, 0L);
        C9141z5.m38441b(bundle2, "timed_out_event_name", String.class, null);
        C9141z5.m38441b(bundle2, "timed_out_event_params", Bundle.class, null);
        C9141z5.m38441b(bundle2, "triggered_event_name", String.class, null);
        C9141z5.m38441b(bundle2, "triggered_event_params", Bundle.class, null);
        C9141z5.m38441b(bundle2, "time_to_live", Long.class, 0L);
        C9141z5.m38441b(bundle2, "expired_event_name", String.class, null);
        C9141z5.m38441b(bundle2, "expired_event_params", Bundle.class, null);
        C9935o.m41846f(bundle2.getString("name"));
        C9935o.m41846f(bundle2.getString("origin"));
        C9935o.m41850j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f41723a.m37765G().m37861p0(string) != 0) {
            this.f41723a.mo37780c().m38408o().m38327b("Invalid conditional user property name", this.f41723a.m37766H().m38233r(string));
            return;
        }
        if (this.f41723a.m37765G().m37874x(string, obj) != 0) {
            this.f41723a.mo37780c().m38408o().m38328c("Invalid conditional user property value", this.f41723a.m37766H().m38233r(string), obj);
            return;
        }
        Object m37875y = this.f41723a.m37765G().m37875y(string, obj);
        if (m37875y == null) {
            this.f41723a.mo37780c().m38408o().m38328c("Unable to normalize conditional user property value", this.f41723a.m37766H().m38233r(string), obj);
            return;
        }
        C9141z5.m38440a(bundle2, m37875y);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            this.f41723a.m37797z();
            if (j11 > 15552000000L || j11 < 1) {
                this.f41723a.mo37780c().m38408o().m38328c("Invalid conditional user property timeout", this.f41723a.m37766H().m38233r(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        this.f41723a.m37797z();
        if (j12 > 15552000000L || j12 < 1) {
            this.f41723a.mo37780c().m38408o().m38328c("Invalid conditional user property time to live", this.f41723a.m37766H().m38233r(string), Long.valueOf(j12));
        } else {
            this.f41723a.mo37782e().m38436r(new RunnableC9027p6(this, bundle2));
        }
    }

    /* renamed from: B */
    public final void m37914B(String str, String str2, Bundle bundle) {
        long mo22432a = this.f41723a.mo37778a().mo22432a();
        C9935o.m41846f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", mo22432a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f41723a.mo37782e().m38436r(new RunnableC9039q6(this, bundle2));
    }

    /* renamed from: C */
    public final ArrayList<Bundle> m37915C(String str, String str2) {
        ArrayList<Bundle> m37822Y;
        if (this.f41723a.mo37782e().m38433o()) {
            this.f41723a.mo37780c().m38408o().m38326a("Cannot get conditional user properties from analytics worker thread");
            m37822Y = new ArrayList<>(0);
        } else {
            this.f41723a.mo37783f();
            if (C9079ta.m38242a()) {
                this.f41723a.mo37780c().m38408o().m38326a("Cannot get conditional user properties from main thread");
                m37822Y = new ArrayList<>(0);
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.f41723a.mo37782e().m38437s(atomicReference, 5000L, "get conditional user properties", new RunnableC9063s6(this, atomicReference, null, str, str2));
                List list = (List) atomicReference.get();
                if (list == null) {
                    this.f41723a.mo37780c().m38408o().m38327b("Timed out waiting for get conditional user properties", null);
                    m37822Y = new ArrayList<>();
                } else {
                    m37822Y = C8899ea.m37822Y(list);
                }
            }
        }
        return m37822Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.Map] */
    /* renamed from: D */
    public final Map<String, Object> m37916D(String str, String str2, boolean z10) {
        C7928a c7928a;
        C9106w3 m38408o;
        String str3;
        if (this.f41723a.mo37782e().m38433o()) {
            m38408o = this.f41723a.mo37780c().m38408o();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f41723a.mo37783f();
            if (!C9079ta.m38242a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f41723a.mo37782e().m38437s(atomicReference, 5000L, "get user properties", new RunnableC9075t6(this, atomicReference, null, str, str2, z10));
                List<C8851aa> list = (List) atomicReference.get();
                if (list == null) {
                    this.f41723a.mo37780c().m38408o().m38327b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                    c7928a = Collections.emptyMap();
                    return c7928a;
                }
                c7928a = new C7928a(list.size());
                for (C8851aa c8851aa : list) {
                    Object m37750P = c8851aa.m37750P();
                    if (m37750P != null) {
                        c7928a.put(c8851aa.f40906e, m37750P);
                    }
                }
                return c7928a;
            }
            m38408o = this.f41723a.mo37780c().m38408o();
            str3 = "Cannot get user properties from main thread";
        }
        m38408o.m38326a(str3);
        c7928a = Collections.emptyMap();
        return c7928a;
    }

    /* renamed from: E */
    public final String m37917E() {
        C9004n7 m38277w = this.f41723a.m37775Q().m38277w();
        if (m38277w != null) {
            return m38277w.f41445a;
        }
        return null;
    }

    /* renamed from: F */
    public final String m37918F() {
        C9004n7 m38277w = this.f41723a.m37775Q().m38277w();
        if (m38277w != null) {
            return m38277w.f41446b;
        }
        return null;
    }

    /* renamed from: G */
    public final String m37919G() {
        if (this.f41723a.m37770L() != null) {
            return this.f41723a.m37770L();
        }
        try {
            C8372uc.m35951a();
            return this.f41723a.m37797z().m37900w(null, C8988m3.f41339O0) ? C8992m7.m38133b(this.f41723a.mo37779b(), "google_app_id", this.f41723a.m37774P()) : C8992m7.m38132a(this.f41723a.mo37779b(), "google_app_id");
        } catch (IllegalStateException e10) {
            this.f41723a.mo37780c().m38408o().m38327b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    /* renamed from: H */
    public final /* synthetic */ void m37920H(Bundle bundle) {
        C8386vb.m35974a();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41311A0)) {
            if (bundle == null) {
                this.f41723a.m37759A().f41479B.m38100b(new Bundle());
                return;
            }
            Bundle m38099a = this.f41723a.m37759A().f41479B.m38099a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (this.f41723a.m37765G().m37867s0(obj)) {
                        this.f41723a.m37765G().m37828A(this.f41084p, null, 27, null, null, 0);
                    }
                    this.f41723a.mo37780c().m38413t().m38328c("Invalid default event parameter type. Name, value", str, obj);
                } else if (C8899ea.m37819F(str)) {
                    this.f41723a.mo37780c().m38413t().m38327b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    m38099a.remove(str);
                } else {
                    C8899ea m37765G = this.f41723a.m37765G();
                    this.f41723a.m37797z();
                    if (m37765G.m37869t0("param", str, 100, obj)) {
                        this.f41723a.m37765G().m37876z(m38099a, str, obj);
                    }
                }
            }
            this.f41723a.m37765G();
            int m37890m = this.f41723a.m37797z().m37890m();
            if (m38099a.size() > m37890m) {
                int i10 = 0;
                for (String str2 : new TreeSet(m38099a.keySet())) {
                    int i11 = i10 + 1;
                    i10 = i11;
                    if (i11 > m37890m) {
                        m38099a.remove(str2);
                        i10 = i11;
                    }
                }
                this.f41723a.m37765G().m37828A(this.f41084p, null, 26, null, null, 0);
                this.f41723a.mo37780c().m38413t().m38326a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            this.f41723a.m37759A().f41479B.m38100b(m38099a);
            this.f41723a.m37776R().m38307o(m38099a);
        }
    }

    /* renamed from: L */
    public final void m37921L(Boolean bool, boolean z10) {
        mo37811h();
        m37905j();
        this.f41723a.mo37780c().m38415v().m38327b("Setting app measurement enabled (FE)", bool);
        this.f41723a.m37759A().m38168q(bool);
        C8175ha.m35418a();
        C8900f m37797z = this.f41723a.m37797z();
        C8976l3<Boolean> c8976l3 = C8988m3.f41323G0;
        if (m37797z.m37900w(null, c8976l3) && z10) {
            C9013o4 m37759A = this.f41723a.m37759A();
            C8175ha.m35418a();
            if (m37759A.f41723a.m37797z().m37900w(null, c8976l3)) {
                m37759A.mo37811h();
                SharedPreferences.Editor edit = m37759A.m38167p().edit();
                if (bool != null) {
                    edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                } else {
                    edit.remove("measurement_enabled_from_api");
                }
                edit.apply();
            }
        }
        C8175ha.m35418a();
        if (this.f41723a.m37797z().m37900w(null, c8976l3) && !this.f41723a.m37790n() && (bool == null || bool.booleanValue())) {
            return;
        }
        m37922M();
    }

    /* renamed from: M */
    public final void m37922M() {
        mo37811h();
        String m38155a = this.f41723a.m37759A().f41495r.m38155a();
        if (m38155a != null) {
            if ("unset".equals(m38155a)) {
                m37941p("app", "_npa", null, this.f41723a.mo37778a().mo22432a());
            } else {
                m37941p("app", "_npa", Long.valueOf(true != "true".equals(m38155a) ? 0L : 1L), this.f41723a.mo37778a().mo22432a());
            }
        }
        if (!this.f41723a.m37787k() || !this.f41083o) {
            this.f41723a.mo37780c().m38415v().m38326a("Updating Scion state (FE)");
            this.f41723a.m37776R().m38292I();
            return;
        }
        this.f41723a.mo37780c().m38415v().m38326a("Recording app launch after enabling measurement for the first time (FE)");
        m37946u();
        C8161gb.m35389a();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41384q0)) {
            this.f41723a.m37761C().f41270d.m38094a();
        }
        C8415xa.m36083a();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41390t0)) {
            C9049r4 m37762D = this.f41723a.m37762D();
            C9935o.m41850j(m37762D);
            if (m37762D.f41593a.m37759A().f41488k.m38109a() <= 0) {
                m37762D.m38213a(m37762D.f41593a.mo37779b().getPackageName());
            }
        }
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41317D0)) {
            this.f41723a.mo37782e().m38436r(new RunnableC8967k6(this));
        }
    }

    /* renamed from: N */
    public final void m37923N() {
        if (!(this.f41723a.mo37779b().getApplicationContext() instanceof Application) || this.f41071c == null) {
            return;
        }
        ((Application) this.f41723a.mo37779b().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f41071c);
    }

    /* renamed from: O */
    public final Boolean m37924O() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f41723a.mo37782e().m38437s(atomicReference, 15000L, "boolean test flag value", new RunnableC9051r6(this, atomicReference));
    }

    /* renamed from: P */
    public final String m37925P() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f41723a.mo37782e().m38437s(atomicReference, 15000L, "String test flag value", new RunnableC9098v6(this, atomicReference));
    }

    /* renamed from: Q */
    public final Long m37926Q() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f41723a.mo37782e().m38437s(atomicReference, 15000L, "long test flag value", new RunnableC9109w6(this, atomicReference));
    }

    /* renamed from: R */
    public final Integer m37927R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f41723a.mo37782e().m38437s(atomicReference, 15000L, "int test flag value", new RunnableC9120x6(this, atomicReference));
    }

    /* renamed from: S */
    public final Double m37928S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f41723a.mo37782e().m38437s(atomicReference, 15000L, "double test flag value", new RunnableC9131y6(this, atomicReference));
    }

    /* renamed from: T */
    public final void m37929T(Boolean bool) {
        m37905j();
        this.f41723a.mo37782e().m38436r(new RunnableC9142z6(this, bool));
    }

    /* renamed from: U */
    public final void m37930U(Bundle bundle, int i10, long j10) {
        C8175ha.m35418a();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41323G0)) {
            m37905j();
            String m37954a = C8912g.m37954a(bundle);
            if (m37954a != null) {
                this.f41723a.mo37780c().m38413t().m38327b("Ignoring invalid consent setting", m37954a);
                this.f41723a.mo37780c().m38413t().m38326a("Valid consent values are 'granted', 'denied'");
            }
            m37931V(C8912g.m37955b(bundle), i10, j10);
        }
    }

    /* renamed from: V */
    public final void m37931V(C8912g c8912g, int i10, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        C8912g c8912g2 = c8912g;
        C8175ha.m35418a();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41323G0)) {
            m37905j();
            C8900f m37797z = this.f41723a.m37797z();
            C8976l3<Boolean> c8976l3 = C8988m3.f41325H0;
            if (m37797z.m37900w(null, c8976l3) && i10 == 20) {
                i10 = 20;
            } else if (c8912g.m37964e() == null && c8912g.m37966g() == null) {
                this.f41723a.mo37780c().m38413t().m38326a("Discarding empty consent settings");
                return;
            }
            synchronized (this.f41076h) {
                z10 = true;
                z11 = false;
                if (C8912g.m37958m(i10, this.f41078j)) {
                    z11 = c8912g2.m37968i(this.f41077i);
                    z12 = false;
                    if (c8912g.m37967h()) {
                        z12 = false;
                        if (!this.f41077i.m37967h()) {
                            z12 = true;
                        }
                    }
                    c8912g2 = c8912g2.m37970l(this.f41077i);
                    this.f41077i = c8912g2;
                    this.f41078j = i10;
                } else {
                    z10 = false;
                    z12 = false;
                }
            }
            if (!z10) {
                this.f41723a.mo37780c().m38414u().m38327b("Ignoring lower-priority consent settings, proposed settings", c8912g2);
                return;
            }
            long andIncrement = this.f41079k.getAndIncrement();
            if (z11) {
                this.f41075g.set(null);
                this.f41723a.mo37782e().m38438t(new RunnableC8848a7(this, c8912g2, j10, i10, andIncrement, z12));
                return;
            }
            if (this.f41723a.m37797z().m37900w(null, c8976l3)) {
                if (i10 != 40) {
                    if (i10 == 20) {
                        i10 = 20;
                    }
                }
                this.f41723a.mo37782e().m38438t(new RunnableC8860b7(this, c8912g2, i10, andIncrement, z12));
                return;
            }
            this.f41723a.mo37782e().m38436r(new RunnableC8872c7(this, c8912g2, i10, andIncrement, z12));
        }
    }

    /* renamed from: W */
    public final void m37932W(C8912g c8912g) {
        mo37811h();
        boolean z10 = (c8912g.m37967h() && c8912g.m37965f()) || this.f41723a.m37776R().m38314v();
        if (z10 != this.f41723a.m37790n()) {
            this.f41723a.m37789m(z10);
            C9013o4 m37759A = this.f41723a.m37759A();
            C8175ha.m35418a();
            Boolean bool = null;
            if (m37759A.f41723a.m37797z().m37900w(null, C8988m3.f41323G0)) {
                m37759A.mo37811h();
                bool = null;
                if (m37759A.m38167p().contains("measurement_enabled_from_api")) {
                    bool = Boolean.valueOf(m37759A.m38167p().getBoolean("measurement_enabled_from_api", true));
                }
            }
            if (!z10 || bool == null || bool.booleanValue()) {
                m37921L(Boolean.valueOf(z10), false);
            }
        }
    }

    /* renamed from: X */
    public final void m37933X(String str, String str2, Bundle bundle) {
        m37936a0(str, str2, bundle, true, true, this.f41723a.mo37778a().mo22432a());
    }

    /* renamed from: Y */
    public final void m37934Y(String str, String str2, long j10, Bundle bundle) {
        mo37811h();
        m37935Z(str, str2, j10, bundle, true, this.f41072d == null || C8899ea.m37819F(str2), false, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e0, code lost:
    
        r18 = 13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0201  */
    /* JADX WARN: Type inference failed for: r0v174, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v180, types: [java.lang.Object[]] */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m37935Z(java.lang.String r9, java.lang.String r10, long r11, android.os.Bundle r13, boolean r14, boolean r15, boolean r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 1990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8908f7.m37935Z(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a0 */
    public final void m37936a0(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        if (str == null) {
            str = "app";
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41394v0) && C8899ea.m37820G(str2, "screen_view")) {
            this.f41723a.m37775Q().m38275u(bundle, j10);
        } else {
            m37937b0(str, str2, j10, bundle, z11, !z11 || this.f41072d == null || C8899ea.m37819F(str2), !z10, null);
        }
    }

    /* renamed from: b0 */
    public final void m37937b0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
        }
        this.f41723a.mo37782e().m38436r(new RunnableC8991m6(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    /* renamed from: c0 */
    public final void m37938c0(String str, String str2, Object obj, boolean z10) {
        m37939d0("auto", str2, obj, true, this.f41723a.mo37778a().mo22432a());
    }

    /* renamed from: d0 */
    public final void m37939d0(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        if (str == null) {
            str = "app";
        }
        if (z10) {
            i10 = this.f41723a.m37765G().m37861p0(str2);
        } else {
            C8899ea m37765G = this.f41723a.m37765G();
            if (m37765G.m37854k0("user property", str2)) {
                if (m37765G.m37856m0("user property", C8871c6.f40990a, null, str2)) {
                    m37765G.f41723a.m37797z();
                    if (m37765G.m37857n0("user property", 24, str2)) {
                        i10 = 0;
                    }
                } else {
                    i10 = 15;
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            C8899ea m37765G2 = this.f41723a.m37765G();
            this.f41723a.m37797z();
            this.f41723a.m37765G().m37828A(this.f41084p, null, i10, "_ev", m37765G2.m37862q(str2, 24, true), str2 != null ? str2.length() : 0);
        } else {
            if (obj == null) {
                m37940o(str, str2, j10, null);
                return;
            }
            int m37874x = this.f41723a.m37765G().m37874x(str2, obj);
            if (m37874x != 0) {
                C8899ea m37765G3 = this.f41723a.m37765G();
                this.f41723a.m37797z();
                this.f41723a.m37765G().m37828A(this.f41084p, null, m37874x, "_ev", m37765G3.m37862q(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0);
            } else {
                Object m37875y = this.f41723a.m37765G().m37875y(str2, obj);
                if (m37875y != null) {
                    m37940o(str, str2, j10, m37875y);
                }
            }
        }
    }

    @Override // ua.AbstractC8905f4
    /* renamed from: m */
    public final boolean mo37908m() {
        return false;
    }

    /* renamed from: o */
    public final void m37940o(String str, String str2, long j10, Object obj) {
        this.f41723a.mo37782e().m38436r(new RunnableC9003n6(this, str, str2, obj, j10));
    }

    /* renamed from: p */
    public final void m37941p(String str, String str2, Object obj, long j10) {
        C9001n4 c9001n4;
        String str3;
        C9935o.m41846f(str);
        C9935o.m41846f(str2);
        mo37811h();
        m37905j();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    str3 = "false";
                    Long valueOf = Long.valueOf(true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    C9001n4 c9001n42 = this.f41723a.m37759A().f41495r;
                    c9001n4 = c9001n42;
                    obj = valueOf;
                    if (valueOf.longValue() == 1) {
                        str3 = "true";
                        c9001n4 = c9001n42;
                        obj = valueOf;
                    }
                    c9001n4.m38156b(str3);
                    str2 = "_npa";
                }
            }
            if (obj == null) {
                c9001n4 = this.f41723a.m37759A().f41495r;
                str3 = "unset";
                c9001n4.m38156b(str3);
                str2 = "_npa";
            }
        }
        if (!this.f41723a.m37787k()) {
            this.f41723a.mo37780c().m38416w().m38326a("User property not set since app measurement is disabled");
        } else if (this.f41723a.m37793q()) {
            this.f41723a.m37776R().m38301R(new C8851aa(str2, j10, obj, str));
        }
    }

    /* renamed from: q */
    public final String m37942q() {
        return this.f41075g.get();
    }

    /* renamed from: r */
    public final void m37943r(String str) {
        this.f41075g.set(str);
    }

    /* renamed from: s */
    public final void m37944s(long j10) {
        this.f41075g.set(null);
        this.f41723a.mo37782e().m38436r(new RunnableC9015o6(this, j10));
    }

    /* renamed from: t */
    public final void m37945t(long j10, boolean z10) {
        mo37811h();
        m37905j();
        this.f41723a.mo37780c().m38415v().m38326a("Resetting analytics data (FE)");
        C8970k9 m37761C = this.f41723a.m37761C();
        m37761C.mo37811h();
        m37761C.f41271e.m38039c();
        boolean m37787k = this.f41723a.m37787k();
        C9013o4 m37759A = this.f41723a.m37759A();
        m37759A.f41487j.m38110b(j10);
        if (!TextUtils.isEmpty(m37759A.f41723a.m37759A().f41502y.m38155a())) {
            m37759A.f41502y.m38156b(null);
        }
        C8161gb.m35389a();
        C8900f m37797z = m37759A.f41723a.m37797z();
        C8976l3<Boolean> c8976l3 = C8988m3.f41384q0;
        if (m37797z.m37900w(null, c8976l3)) {
            m37759A.f41497t.m38110b(0L);
        }
        if (!m37759A.f41723a.m37797z().m37879A()) {
            m37759A.m38172u(!m37787k);
        }
        m37759A.f41503z.m38156b(null);
        m37759A.f41478A.m38110b(0L);
        m37759A.f41479B.m38100b(null);
        if (z10) {
            this.f41723a.m37776R().m38302S();
        }
        C8161gb.m35389a();
        if (this.f41723a.m37797z().m37900w(null, c8976l3)) {
            this.f41723a.m37761C().f41270d.m38094a();
        }
        this.f41083o = !m37787k;
    }

    /* renamed from: u */
    public final void m37946u() {
        mo37811h();
        m37905j();
        if (this.f41723a.m37793q()) {
            if (this.f41723a.m37797z().m37900w(null, C8988m3.f41358d0)) {
                C8900f m37797z = this.f41723a.m37797z();
                m37797z.f41723a.mo37783f();
                Boolean m37902y = m37797z.m37902y("google_analytics_deferred_deep_link_enabled");
                if (m37902y != null && m37902y.booleanValue()) {
                    this.f41723a.mo37780c().m38415v().m38326a("Deferred Deep Link feature enabled.");
                    this.f41723a.mo37782e().m38436r(new Runnable(this) { // from class: ua.i6

                        /* renamed from: b */
                        public final C8908f7 f41182b;

                        {
                            this.f41182b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C8908f7 c8908f7 = this.f41182b;
                            c8908f7.mo37811h();
                            if (c8908f7.f41723a.m37759A().f41500w.m38090a()) {
                                c8908f7.f41723a.mo37780c().m38415v().m38326a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long m38109a = c8908f7.f41723a.m37759A().f41501x.m38109a();
                            c8908f7.f41723a.m37759A().f41501x.m38110b(1 + m38109a);
                            c8908f7.f41723a.m37797z();
                            if (m38109a < 5) {
                                c8908f7.f41723a.m37794r();
                            } else {
                                c8908f7.f41723a.mo37780c().m38411r().m38326a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                c8908f7.f41723a.m37759A().f41500w.m38091b(true);
                            }
                        }
                    });
                }
            }
            this.f41723a.m37776R().m38305V();
            this.f41083o = false;
            C9013o4 m37759A = this.f41723a.m37759A();
            m37759A.mo37811h();
            String string = m37759A.m38167p().getString("previous_os_version", null);
            m37759A.f41723a.m37777S().m38335l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = m37759A.m38167p().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f41723a.m37777S().m38335l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m37933X("auto", "_ou", bundle);
        }
    }

    /* renamed from: v */
    public final void m37947v(InterfaceC8883d6 interfaceC8883d6) {
        InterfaceC8883d6 interfaceC8883d62;
        mo37811h();
        m37905j();
        if (interfaceC8883d6 != null && interfaceC8883d6 != (interfaceC8883d62 = this.f41072d)) {
            C9935o.m41854n(interfaceC8883d62 == null, "EventInterceptor already set.");
        }
        this.f41072d = interfaceC8883d6;
    }

    /* renamed from: w */
    public final void m37948w(InterfaceC8895e6 interfaceC8895e6) {
        m37905j();
        C9935o.m41850j(interfaceC8895e6);
        if (this.f41073e.add(interfaceC8895e6)) {
            return;
        }
        this.f41723a.mo37780c().m38411r().m38326a("OnEventListener already registered");
    }

    /* renamed from: x */
    public final void m37949x(InterfaceC8895e6 interfaceC8895e6) {
        m37905j();
        C9935o.m41850j(interfaceC8895e6);
        if (this.f41073e.remove(interfaceC8895e6)) {
            return;
        }
        this.f41723a.mo37780c().m38411r().m38326a("OnEventListener had not been registered");
    }

    /* renamed from: y */
    public final int m37950y(String str) {
        C9935o.m41846f(str);
        this.f41723a.m37797z();
        return 25;
    }

    /* renamed from: z */
    public final void m37951z(Bundle bundle) {
        m37913A(bundle, this.f41723a.mo37778a().mo22432a());
    }
}
