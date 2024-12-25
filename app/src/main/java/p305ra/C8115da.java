package p305ra;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import org.achartengine.chart.TimeChart;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/da.class
 */
/* renamed from: ra.da */
/* loaded from: combined.jar:classes2.jar:ra/da.class */
public final class C8115da implements InterfaceC8100ca {

    /* renamed from: A */
    public static final AbstractC8408x3<Long> f38998A;

    /* renamed from: B */
    public static final AbstractC8408x3<Long> f38999B;

    /* renamed from: C */
    public static final AbstractC8408x3<Long> f39000C;

    /* renamed from: D */
    public static final AbstractC8408x3<Long> f39001D;

    /* renamed from: E */
    public static final AbstractC8408x3<Long> f39002E;

    /* renamed from: F */
    public static final AbstractC8408x3<Long> f39003F;

    /* renamed from: G */
    public static final AbstractC8408x3<Long> f39004G;

    /* renamed from: H */
    public static final AbstractC8408x3<Long> f39005H;

    /* renamed from: I */
    public static final AbstractC8408x3<String> f39006I;

    /* renamed from: J */
    public static final AbstractC8408x3<Long> f39007J;

    /* renamed from: a */
    public static final AbstractC8408x3<Long> f39008a;

    /* renamed from: b */
    public static final AbstractC8408x3<Long> f39009b;

    /* renamed from: c */
    public static final AbstractC8408x3<String> f39010c;

    /* renamed from: d */
    public static final AbstractC8408x3<String> f39011d;

    /* renamed from: e */
    public static final AbstractC8408x3<String> f39012e;

    /* renamed from: f */
    public static final AbstractC8408x3<Long> f39013f;

    /* renamed from: g */
    public static final AbstractC8408x3<Long> f39014g;

    /* renamed from: h */
    public static final AbstractC8408x3<Long> f39015h;

    /* renamed from: i */
    public static final AbstractC8408x3<Long> f39016i;

    /* renamed from: j */
    public static final AbstractC8408x3<Long> f39017j;

    /* renamed from: k */
    public static final AbstractC8408x3<Long> f39018k;

    /* renamed from: l */
    public static final AbstractC8408x3<Long> f39019l;

    /* renamed from: m */
    public static final AbstractC8408x3<Long> f39020m;

    /* renamed from: n */
    public static final AbstractC8408x3<Long> f39021n;

    /* renamed from: o */
    public static final AbstractC8408x3<Long> f39022o;

    /* renamed from: p */
    public static final AbstractC8408x3<Long> f39023p;

    /* renamed from: q */
    public static final AbstractC8408x3<Long> f39024q;

    /* renamed from: r */
    public static final AbstractC8408x3<String> f39025r;

    /* renamed from: s */
    public static final AbstractC8408x3<Long> f39026s;

    /* renamed from: t */
    public static final AbstractC8408x3<Long> f39027t;

    /* renamed from: u */
    public static final AbstractC8408x3<Long> f39028u;

    /* renamed from: v */
    public static final AbstractC8408x3<Long> f39029v;

    /* renamed from: w */
    public static final AbstractC8408x3<Long> f39030w;

    /* renamed from: x */
    public static final AbstractC8408x3<Long> f39031x;

    /* renamed from: y */
    public static final AbstractC8408x3<Long> f39032y;

    /* renamed from: z */
    public static final AbstractC8408x3<Long> f39033z;

    static {
        C8378v3 c8378v3 = new C8378v3(C8258n3.m35645a("com.google.android.gms.measurement"));
        f39008a = c8378v3.m35958a("measurement.ad_id_cache_time", 10000L);
        f39009b = c8378v3.m35958a("measurement.config.cache_time", TimeChart.DAY);
        f39010c = c8378v3.m35961d("measurement.log_tag", "FA");
        f39011d = c8378v3.m35961d("measurement.config.url_authority", "app-measurement.com");
        f39012e = c8378v3.m35961d("measurement.config.url_scheme", ClientConstants.DOMAIN_SCHEME);
        f39013f = c8378v3.m35958a("measurement.upload.debug_upload_interval", 1000L);
        f39014g = c8378v3.m35958a("measurement.lifetimevalue.max_currency_tracked", 4L);
        f39015h = c8378v3.m35958a("measurement.store.max_stored_events_per_app", 100000L);
        f39016i = c8378v3.m35958a("measurement.experiment.max_ids", 50L);
        f39017j = c8378v3.m35958a("measurement.audience.filter_result_max_count", 200L);
        f39018k = c8378v3.m35958a("measurement.alarm_manager.minimum_interval", 60000L);
        f39019l = c8378v3.m35958a("measurement.upload.minimum_delay", 500L);
        f39020m = c8378v3.m35958a("measurement.monitoring.sample_period_millis", TimeChart.DAY);
        f39021n = c8378v3.m35958a("measurement.upload.realtime_upload_interval", 10000L);
        f39022o = c8378v3.m35958a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f39023p = c8378v3.m35958a("measurement.config.cache_time.service", 3600000L);
        f39024q = c8378v3.m35958a("measurement.service_client.idle_disconnect_millis", 5000L);
        f39025r = c8378v3.m35961d("measurement.log_tag.service", "FA-SVC");
        f39026s = c8378v3.m35958a("measurement.upload.stale_data_deletion_interval", TimeChart.DAY);
        f39027t = c8378v3.m35958a("measurement.upload.backoff_period", 43200000L);
        f39028u = c8378v3.m35958a("measurement.upload.initial_upload_delay_time", 15000L);
        f39029v = c8378v3.m35958a("measurement.upload.interval", 3600000L);
        f39030w = c8378v3.m35958a("measurement.upload.max_bundle_size", 65536L);
        f39031x = c8378v3.m35958a("measurement.upload.max_bundles", 100L);
        f39032y = c8378v3.m35958a("measurement.upload.max_conversions_per_day", 500L);
        f39033z = c8378v3.m35958a("measurement.upload.max_error_events_per_day", 1000L);
        f38998A = c8378v3.m35958a("measurement.upload.max_events_per_bundle", 1000L);
        f38999B = c8378v3.m35958a("measurement.upload.max_events_per_day", 100000L);
        f39000C = c8378v3.m35958a("measurement.upload.max_public_events_per_day", 50000L);
        f39001D = c8378v3.m35958a("measurement.upload.max_queue_time", 2419200000L);
        f39002E = c8378v3.m35958a("measurement.upload.max_realtime_events_per_day", 10L);
        f39003F = c8378v3.m35958a("measurement.upload.max_batch_size", 65536L);
        f39004G = c8378v3.m35958a("measurement.upload.retry_count", 6L);
        f39005H = c8378v3.m35958a("measurement.upload.retry_time", 1800000L);
        f39006I = c8378v3.m35961d("measurement.upload.url", "https://app-measurement.com/a");
        f39007J = c8378v3.m35958a("measurement.upload.window_interval", 3600000L);
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: A */
    public final long mo35141A() {
        return f39022o.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: B */
    public final long mo35142B() {
        return f39024q.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: C */
    public final long mo35143C() {
        return f39031x.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: D */
    public final long mo35144D() {
        return f39032y.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: E */
    public final long mo35145E() {
        return f39003F.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: F */
    public final long mo35146F() {
        return f39001D.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: a */
    public final long mo35147a() {
        return f39018k.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: b */
    public final long mo35148b() {
        return f39015h.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: c */
    public final long mo35149c() {
        return f39013f.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: d */
    public final long mo35150d() {
        return f39014g.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: e */
    public final long mo35151e() {
        return f39002E.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: f */
    public final long mo35152f() {
        return f39020m.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: g */
    public final long mo35153g() {
        return f39021n.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: h */
    public final long mo35154h() {
        return f39019l.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: i */
    public final long mo35155i() {
        return f39027t.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: j */
    public final long mo35156j() {
        return f39017j.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: k */
    public final long mo35157k() {
        return f39009b.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: l */
    public final String mo35158l() {
        return f39011d.m36065e();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: m */
    public final long mo35159m() {
        return f39029v.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: n */
    public final String mo35160n() {
        return f39006I.m36065e();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: o */
    public final String mo35161o() {
        return f39012e.m36065e();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: p */
    public final long mo35162p() {
        return f39016i.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: q */
    public final long mo35163q() {
        return f39028u.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: r */
    public final long mo35164r() {
        return f39030w.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: s */
    public final long mo35165s() {
        return f38999B.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: t */
    public final long mo35166t() {
        return f39000C.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: u */
    public final long mo35167u() {
        return f39007J.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: v */
    public final long mo35168v() {
        return f39026s.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: w */
    public final long mo35169w() {
        return f39033z.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: x */
    public final long mo35170x() {
        return f39004G.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: y */
    public final long mo35171y() {
        return f39005H.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    /* renamed from: z */
    public final long mo35172z() {
        return f38998A.m36065e().longValue();
    }

    @Override // p305ra.InterfaceC8100ca
    public final long zza() {
        return f39008a.m36065e().longValue();
    }
}
