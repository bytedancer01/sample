package ua;

import android.content.SharedPreferences;
import android.util.Pair;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p127h9.C5043a;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/o4.class
 */
/* renamed from: ua.o4 */
/* loaded from: combined.jar:classes2.jar:ua/o4.class */
public final class C9013o4 extends AbstractC9119x5 {

    /* renamed from: C */
    public static final Pair<String, Long> f41477C = new Pair<>("", 0L);

    /* renamed from: A */
    public final C8977l4 f41478A;

    /* renamed from: B */
    public final C8965k4 f41479B;

    /* renamed from: c */
    public SharedPreferences f41480c;

    /* renamed from: d */
    public C8989m4 f41481d;

    /* renamed from: e */
    public final C8977l4 f41482e;

    /* renamed from: f */
    public final C8977l4 f41483f;

    /* renamed from: g */
    public final C8977l4 f41484g;

    /* renamed from: h */
    public final C8977l4 f41485h;

    /* renamed from: i */
    public final C8977l4 f41486i;

    /* renamed from: j */
    public final C8977l4 f41487j;

    /* renamed from: k */
    public final C8977l4 f41488k;

    /* renamed from: l */
    public final C9001n4 f41489l;

    /* renamed from: m */
    public String f41490m;

    /* renamed from: n */
    public boolean f41491n;

    /* renamed from: o */
    public long f41492o;

    /* renamed from: p */
    public final C8977l4 f41493p;

    /* renamed from: q */
    public final C8953j4 f41494q;

    /* renamed from: r */
    public final C9001n4 f41495r;

    /* renamed from: s */
    public final C8953j4 f41496s;

    /* renamed from: t */
    public final C8977l4 f41497t;

    /* renamed from: u */
    public boolean f41498u;

    /* renamed from: v */
    public final C8953j4 f41499v;

    /* renamed from: w */
    public final C8953j4 f41500w;

    /* renamed from: x */
    public final C8977l4 f41501x;

    /* renamed from: y */
    public final C9001n4 f41502y;

    /* renamed from: z */
    public final C9001n4 f41503z;

    public C9013o4(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41482e = new C8977l4(this, "last_upload", 0L);
        this.f41483f = new C8977l4(this, "last_upload_attempt", 0L);
        this.f41484g = new C8977l4(this, "backoff", 0L);
        this.f41485h = new C8977l4(this, "last_delete_stale", 0L);
        this.f41493p = new C8977l4(this, "session_timeout", 1800000L);
        this.f41494q = new C8953j4(this, "start_new_session", true);
        this.f41497t = new C8977l4(this, "last_pause_time", 0L);
        this.f41495r = new C9001n4(this, "non_personalized_ads", null);
        this.f41496s = new C8953j4(this, "allow_remote_dynamite", false);
        this.f41486i = new C8977l4(this, "midnight_offset", 0L);
        this.f41487j = new C8977l4(this, "first_open_time", 0L);
        this.f41488k = new C8977l4(this, "app_install_time", 0L);
        this.f41489l = new C9001n4(this, "app_instance_id", null);
        this.f41499v = new C8953j4(this, "app_backgrounded", false);
        this.f41500w = new C8953j4(this, "deep_link_retrieval_complete", false);
        this.f41501x = new C8977l4(this, "deep_link_retrieval_attempts", 0L);
        this.f41502y = new C9001n4(this, "firebase_feature_rollouts", null);
        this.f41503z = new C9001n4(this, "deferred_attribution_cache", null);
        this.f41478A = new C8977l4(this, "deferred_attribution_cache_timestamp", 0L);
        this.f41479B = new C8965k4(this, "default_event_parameters", null);
    }

    @Override // ua.AbstractC9119x5
    /* renamed from: i */
    public final boolean mo37851i() {
        return true;
    }

    @Override // ua.AbstractC9119x5
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: j */
    public final void mo37852j() {
        SharedPreferences sharedPreferences = this.f41723a.mo37779b().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f41480c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f41498u = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f41480c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f41723a.m37797z();
        this.f41481d = new C8989m4(this, "health_monitor", Math.max(0L, C8988m3.f41357d.m38108b(null).longValue()), null);
    }

    /* renamed from: o */
    public final Pair<String, Boolean> m38166o(String str) {
        mo37811h();
        long mo22433b = this.f41723a.mo37778a().mo22433b();
        String str2 = this.f41490m;
        if (str2 != null && mo22433b < this.f41492o) {
            return new Pair<>(str2, Boolean.valueOf(this.f41491n));
        }
        this.f41492o = mo22433b + this.f41723a.m37797z().m37896s(str, C8988m3.f41355c);
        C5043a.m25263c(true);
        try {
            C5043a.a m25262a = C5043a.m25262a(this.f41723a.mo37779b());
            if (m25262a != null) {
                this.f41490m = m25262a.m25270a();
                this.f41491n = m25262a.m25271b();
            }
            if (this.f41490m == null) {
                this.f41490m = "";
            }
        } catch (Exception e10) {
            this.f41723a.mo37780c().m38415v().m38327b("Unable to get advertising id", e10);
            this.f41490m = "";
        }
        C5043a.m25263c(false);
        return new Pair<>(this.f41490m, Boolean.valueOf(this.f41491n));
    }

    /* renamed from: p */
    public final SharedPreferences m38167p() {
        mo37811h();
        m38335l();
        C9935o.m41850j(this.f41480c);
        return this.f41480c;
    }

    /* renamed from: q */
    public final void m38168q(Boolean bool) {
        mo37811h();
        SharedPreferences.Editor edit = m38167p().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: r */
    public final Boolean m38169r() {
        mo37811h();
        if (m38167p().contains("measurement_enabled")) {
            return Boolean.valueOf(m38167p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: s */
    public final boolean m38170s(int i10) {
        return C8912g.m37958m(i10, m38167p().getInt("consent_source", 100));
    }

    /* renamed from: t */
    public final C8912g m38171t() {
        mo37811h();
        return C8912g.m37956c(m38167p().getString("consent_settings", "G1"));
    }

    /* renamed from: u */
    public final void m38172u(boolean z10) {
        mo37811h();
        this.f41723a.mo37780c().m38416w().m38327b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = m38167p().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* renamed from: v */
    public final boolean m38173v() {
        SharedPreferences sharedPreferences = this.f41480c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: w */
    public final boolean m38174w(long j10) {
        return j10 - this.f41493p.m38109a() > this.f41497t.m38109a();
    }
}
