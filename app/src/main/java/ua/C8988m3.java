package ua;

import android.content.Context;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.p045s3.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.achartengine.chart.TimeChart;
import p305ra.C8108d3;
import p305ra.C8258n3;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/m3.class
 */
/* renamed from: ua.m3 */
/* loaded from: combined.jar:classes2.jar:ua/m3.class */
public final class C8988m3 {

    /* renamed from: A */
    public static final C8976l3<Long> f41310A;

    /* renamed from: A0 */
    public static final C8976l3<Boolean> f41311A0;

    /* renamed from: B */
    public static final C8976l3<Long> f41312B;

    /* renamed from: B0 */
    public static final C8976l3<Boolean> f41313B0;

    /* renamed from: C */
    public static final C8976l3<Long> f41314C;

    /* renamed from: C0 */
    public static final C8976l3<Boolean> f41315C0;

    /* renamed from: D */
    public static final C8976l3<Integer> f41316D;

    /* renamed from: D0 */
    public static final C8976l3<Boolean> f41317D0;

    /* renamed from: E */
    public static final C8976l3<Long> f41318E;

    /* renamed from: E0 */
    public static final C8976l3<Long> f41319E0;

    /* renamed from: F */
    public static final C8976l3<Integer> f41320F;

    /* renamed from: F0 */
    public static final C8976l3<Boolean> f41321F0;

    /* renamed from: G */
    public static final C8976l3<Integer> f41322G;

    /* renamed from: G0 */
    public static final C8976l3<Boolean> f41323G0;

    /* renamed from: H */
    public static final C8976l3<Integer> f41324H;

    /* renamed from: H0 */
    public static final C8976l3<Boolean> f41325H0;

    /* renamed from: I */
    public static final C8976l3<Integer> f41326I;

    /* renamed from: I0 */
    public static final C8976l3<Boolean> f41327I0;

    /* renamed from: J */
    public static final C8976l3<Integer> f41328J;

    /* renamed from: J0 */
    public static final C8976l3<Integer> f41329J0;

    /* renamed from: K */
    public static final C8976l3<Long> f41330K;

    /* renamed from: K0 */
    public static final C8976l3<Boolean> f41331K0;

    /* renamed from: L */
    public static final C8976l3<Boolean> f41332L;

    /* renamed from: L0 */
    public static final C8976l3<Boolean> f41333L0;

    /* renamed from: M */
    public static final C8976l3<String> f41334M;

    /* renamed from: M0 */
    public static final C8976l3<Boolean> f41335M0;

    /* renamed from: N */
    public static final C8976l3<Long> f41336N;

    /* renamed from: N0 */
    public static final C8976l3<Boolean> f41337N0;

    /* renamed from: O */
    public static final C8976l3<Integer> f41338O;

    /* renamed from: O0 */
    public static final C8976l3<Boolean> f41339O0;

    /* renamed from: P */
    public static final C8976l3<Double> f41340P;

    /* renamed from: Q */
    public static final C8976l3<Integer> f41341Q;

    /* renamed from: R */
    public static final C8976l3<Integer> f41342R;

    /* renamed from: S */
    public static final C8976l3<Boolean> f41343S;

    /* renamed from: T */
    public static final C8976l3<Boolean> f41344T;

    /* renamed from: U */
    public static final C8976l3<Boolean> f41345U;

    /* renamed from: V */
    public static final C8976l3<Boolean> f41346V;

    /* renamed from: W */
    public static final C8976l3<Boolean> f41347W;

    /* renamed from: X */
    public static final C8976l3<Boolean> f41348X;

    /* renamed from: Y */
    public static final C8976l3<Boolean> f41349Y;

    /* renamed from: Z */
    public static final C8976l3<Boolean> f41350Z;

    /* renamed from: a0 */
    public static final C8976l3<Boolean> f41352a0;

    /* renamed from: b0 */
    public static final C8976l3<Boolean> f41354b0;

    /* renamed from: c0 */
    public static final C8976l3<Boolean> f41356c0;

    /* renamed from: d */
    public static final C8976l3<Long> f41357d;

    /* renamed from: d0 */
    public static final C8976l3<Boolean> f41358d0;

    /* renamed from: e */
    public static final C8976l3<Long> f41359e;

    /* renamed from: e0 */
    public static final C8976l3<Boolean> f41360e0;

    /* renamed from: f */
    public static final C8976l3<String> f41361f;

    /* renamed from: f0 */
    public static final C8976l3<Boolean> f41362f0;

    /* renamed from: g */
    public static final C8976l3<String> f41363g;

    /* renamed from: g0 */
    public static final C8976l3<Boolean> f41364g0;

    /* renamed from: h */
    public static final C8976l3<Integer> f41365h;

    /* renamed from: h0 */
    public static final C8976l3<Boolean> f41366h0;

    /* renamed from: i */
    public static final C8976l3<Integer> f41367i;

    /* renamed from: i0 */
    public static final C8976l3<Boolean> f41368i0;

    /* renamed from: j */
    public static final C8976l3<Integer> f41369j;

    /* renamed from: j0 */
    public static final C8976l3<Boolean> f41370j0;

    /* renamed from: k */
    public static final C8976l3<Integer> f41371k;

    /* renamed from: k0 */
    public static final C8976l3<Boolean> f41372k0;

    /* renamed from: l */
    public static final C8976l3<Integer> f41373l;

    /* renamed from: l0 */
    public static final C8976l3<Boolean> f41374l0;

    /* renamed from: m */
    public static final C8976l3<Integer> f41375m;

    /* renamed from: m0 */
    public static final C8976l3<Boolean> f41376m0;

    /* renamed from: n */
    public static final C8976l3<Integer> f41377n;

    /* renamed from: n0 */
    public static final C8976l3<Boolean> f41378n0;

    /* renamed from: o */
    public static final C8976l3<Integer> f41379o;

    /* renamed from: o0 */
    public static final C8976l3<Boolean> f41380o0;

    /* renamed from: p */
    public static final C8976l3<Integer> f41381p;

    /* renamed from: p0 */
    public static final C8976l3<Boolean> f41382p0;

    /* renamed from: q */
    public static final C8976l3<Integer> f41383q;

    /* renamed from: q0 */
    public static final C8976l3<Boolean> f41384q0;

    /* renamed from: r */
    public static final C8976l3<String> f41385r;

    /* renamed from: r0 */
    public static final C8976l3<Boolean> f41386r0;

    /* renamed from: s */
    public static final C8976l3<Long> f41387s;

    /* renamed from: s0 */
    public static final C8976l3<Boolean> f41388s0;

    /* renamed from: t */
    public static final C8976l3<Long> f41389t;

    /* renamed from: t0 */
    public static final C8976l3<Boolean> f41390t0;

    /* renamed from: u */
    public static final C8976l3<Long> f41391u;

    /* renamed from: u0 */
    public static final C8976l3<Boolean> f41392u0;

    /* renamed from: v */
    public static final C8976l3<Long> f41393v;

    /* renamed from: v0 */
    public static final C8976l3<Boolean> f41394v0;

    /* renamed from: w */
    public static final C8976l3<Long> f41395w;

    /* renamed from: w0 */
    public static final C8976l3<Boolean> f41396w0;

    /* renamed from: x */
    public static final C8976l3<Long> f41397x;

    /* renamed from: x0 */
    public static final C8976l3<Boolean> f41398x0;

    /* renamed from: y */
    public static final C8976l3<Long> f41399y;

    /* renamed from: y0 */
    public static final C8976l3<Boolean> f41400y0;

    /* renamed from: z */
    public static final C8976l3<Long> f41401z;

    /* renamed from: z0 */
    public static final C8976l3<Boolean> f41402z0;

    /* renamed from: a */
    public static final List<C8976l3<?>> f41351a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public static final Set<C8976l3<?>> f41353b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final C8976l3<Long> f41355c = m38126b("measurement.ad_id_cache_time", 10000L, 10000L, C9091v.f41688a);

    static {
        Long valueOf = Long.valueOf(TimeChart.DAY);
        f41357d = m38126b("measurement.monitoring.sample_period_millis", valueOf, valueOf, C8925h0.f41145a);
        f41359e = m38126b("measurement.config.cache_time", valueOf, 3600000L, C9057s0.f41606a);
        f41361f = m38126b("measurement.config.url_scheme", ClientConstants.DOMAIN_SCHEME, ClientConstants.DOMAIN_SCHEME, C8890e1.f41031a);
        f41363g = m38126b("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C9022p1.f41533a);
        f41365h = m38126b("measurement.upload.max_bundles", 100, 100, C8843a2.f40889a);
        f41367i = m38126b("measurement.upload.max_batch_size", 65536, 65536, C8987m2.f41309a);
        f41369j = m38126b("measurement.upload.max_bundle_size", 65536, 65536, C9116x2.f41742a);
        f41371k = m38126b("measurement.upload.max_events_per_bundle", 1000, 1000, C8916g3.f41098a);
        f41373l = m38126b("measurement.upload.max_events_per_day", 100000, 100000, C8928h3.f41148a);
        f41375m = m38126b("measurement.upload.max_error_events_per_day", 1000, 1000, C9102w.f41713a);
        f41377n = m38126b("measurement.upload.max_public_events_per_day", 50000, 50000, C9113x.f41739a);
        Integer valueOf2 = Integer.valueOf(Constants.MAXIMUM_UPLOAD_PARTS);
        f41379o = m38126b("measurement.upload.max_conversions_per_day", valueOf2, valueOf2, C9124y.f41783a);
        f41381p = m38126b("measurement.upload.max_realtime_events_per_day", 10, 10, C9135z.f41811a);
        f41383q = m38126b("measurement.store.max_stored_events_per_app", 100000, 100000, C8841a0.f40887a);
        f41385r = m38126b("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C8865c0.f40944a);
        f41387s = m38126b("measurement.upload.backoff_period", 43200000L, 43200000L, C8877d0.f41008a);
        f41389t = m38126b("measurement.upload.window_interval", 3600000L, 3600000L, C8889e0.f41030a);
        f41391u = m38126b("measurement.upload.interval", 3600000L, 3600000L, C8901f0.f41054a);
        f41393v = m38126b("measurement.upload.realtime_upload_interval", 10000L, 10000L, C8913g0.f41095a);
        f41395w = m38126b("measurement.upload.debug_upload_interval", 1000L, 1000L, C8937i0.f41175a);
        f41397x = m38126b("measurement.upload.minimum_delay", 500L, 500L, C8949j0.f41204a);
        f41399y = m38126b("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C8961k0.f41250a);
        f41401z = m38126b("measurement.upload.stale_data_deletion_interval", valueOf, valueOf, C8973l0.f41275a);
        f41310A = m38126b("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C8985m0.f41307a);
        f41312B = m38126b("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C8997n0.f41431a);
        f41314C = m38126b("measurement.upload.retry_time", 1800000L, 1800000L, C9009o0.f41474a);
        f41316D = m38126b("measurement.upload.retry_count", 6, 6, C9021p0.f41532a);
        f41318E = m38126b("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C9033q0.f41555a);
        f41320F = m38126b("measurement.lifetimevalue.max_currency_tracked", 4, 4, C9045r0.f41589a);
        f41322G = m38126b("measurement.audience.filter_result_max_count", 200, 200, C9069t0.f41631a);
        f41324H = m38126b("measurement.upload.max_public_user_properties", 25, 25, null);
        f41326I = m38126b("measurement.upload.max_event_name_cardinality", 500, 500, null);
        f41328J = m38126b("measurement.upload.max_public_event_params", 25, 25, null);
        f41330K = m38126b("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C9081u0.f41651a);
        Boolean bool = Boolean.FALSE;
        f41332L = m38126b("measurement.test.boolean_flag", bool, bool, C9092v0.f41689a);
        f41334M = m38126b("measurement.test.string_flag", "---", "---", C9103w0.f41714a);
        f41336N = m38126b("measurement.test.long_flag", -1L, -1L, C9114x0.f41740a);
        f41338O = m38126b("measurement.test.int_flag", -2, -2, C9125y0.f41784a);
        Double valueOf3 = Double.valueOf(-3.0d);
        f41340P = m38126b("measurement.test.double_flag", valueOf3, valueOf3, C9136z0.f41812a);
        f41341Q = m38126b("measurement.experiment.max_ids", 50, 50, C8842a1.f40888a);
        f41342R = m38126b("measurement.max_bundles_per_iteration", 100, 100, C8854b1.f40926a);
        f41343S = m38126b("measurement.validation.internal_limits_internal_event_params", bool, bool, C8878d1.f41009a);
        Boolean bool2 = Boolean.TRUE;
        f41344T = m38126b("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, C8902f1.f41055a);
        f41345U = m38126b("measurement.collection.redundant_engagement_removal_enabled", bool, bool, C8914g1.f41096a);
        f41346V = m38126b("measurement.client.freeride_engagement_fix", bool2, bool2, C8926h1.f41146a);
        f41347W = m38126b("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C8938i1.f41176a);
        f41348X = m38126b("measurement.quality.checksum", bool, bool, null);
        f41349Y = m38126b("measurement.sdk.dynamite.allow_remote_dynamite3", bool2, bool2, C8950j1.f41205a);
        f41350Z = m38126b("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, C8962k1.f41251a);
        f41352a0 = m38126b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C8974l1.f41276a);
        f41354b0 = m38126b("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C8986m1.f41308a);
        f41356c0 = m38126b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C8998n1.f41432a);
        f41358d0 = m38126b("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C9010o1.f41475a);
        f41360e0 = m38126b("measurement.sdk.collection.last_deep_link_referrer2", bool2, bool2, C9034q1.f41556a);
        f41362f0 = m38126b("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C9046r1.f41590a);
        f41364g0 = m38126b("measurement.sdk.collection.last_gclid_from_referrer2", bool, bool, C9058s1.f41607a);
        f41366h0 = m38126b("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, C9070t1.f41632a);
        f41368i0 = m38126b("measurement.upload.file_lock_state_check", bool, bool, C9082u1.f41652a);
        f41370j0 = m38126b("measurement.ga.ga_app_id", bool, bool, C9093v1.f41690a);
        f41372k0 = m38126b("measurement.lifecycle.app_in_background_parameter", bool, bool, C9104w1.f41715a);
        f41374l0 = m38126b("measurement.integration.disable_firebase_instance_id", bool, bool, C9115x1.f41741a);
        f41376m0 = m38126b("measurement.lifecycle.app_backgrounded_engagement", bool, bool, C9126y1.f41785a);
        f41378n0 = m38126b("measurement.collection.service.update_with_analytics_fix", bool, bool, C9137z1.f41813a);
        f41380o0 = m38126b("measurement.service.use_appinfo_modified", bool, bool, C8855b2.f40927a);
        f41382p0 = m38126b("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C8867c2.f40947a);
        f41384q0 = m38126b("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C8891e2.f41032a);
        f41386r0 = m38126b("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, C8903f2.f41056a);
        f41388s0 = m38126b("measurement.upload.file_truncate_fix", bool, bool, C8915g2.f41097a);
        f41390t0 = m38126b("measurement.sdk.referrer.delayed_install_referrer_api", bool, bool, C8927h2.f41147a);
        f41392u0 = m38126b("measurement.sdk.screen.disabling_automatic_reporting", bool2, bool2, C8939i2.f41177a);
        f41394v0 = m38126b("measurement.sdk.screen.manual_screen_view_logging", bool2, bool2, C8951j2.f41206a);
        f41396w0 = m38126b("measurement.collection.synthetic_data_mitigation", bool, bool, C8963k2.f41252a);
        f41398x0 = m38126b("measurement.service.configurable_service_limits", bool2, bool2, C8975l2.f41277a);
        f41400y0 = m38126b("measurement.client.configurable_service_limits", bool2, bool2, C8999n2.f41433a);
        f41402z0 = m38126b("measurement.androidId.delete_feature", bool2, bool2, C9011o2.f41476a);
        f41311A0 = m38126b("measurement.client.global_params", bool2, bool2, C9023p2.f41534a);
        f41313B0 = m38126b("measurement.service.global_params", bool2, bool2, C9035q2.f41557a);
        f41315C0 = m38126b("measurement.service.global_params_in_payload", bool2, bool2, C9047r2.f41591a);
        f41317D0 = m38126b("measurement.sdk.attribution.cache", bool2, bool2, C9059s2.f41608a);
        f41319E0 = m38126b("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C9071t2.f41633a);
        f41321F0 = m38126b("measurement.service.database_return_empty_collection", bool2, bool2, C9083u2.f41653a);
        f41323G0 = m38126b("measurement.client.consent_state_v1", bool2, bool2, C9094v2.f41691a);
        f41325H0 = m38126b("measurement.client.3p_consent_state_v1", bool2, bool2, C9105w2.f41716a);
        f41327I0 = m38126b("measurement.service.consent_state_v1_W36", bool2, bool2, C9127y2.f41786a);
        f41329J0 = m38126b("measurement.service.storage_consent_support_version", 203590, 203590, C9138z2.f41814a);
        f41331K0 = m38126b("measurement.client.ad_impression", bool2, bool2, C8844a3.f40890a);
        f41333L0 = m38126b("measurement.service.ad_impression", bool2, bool2, C8856b3.f40928a);
        f41335M0 = m38126b("measurement.service.separate_public_internal_event_blacklisting", bool2, bool2, C8868c3.f40948a);
        f41337N0 = m38126b("measurement.service.directly_maybe_log_error_events", bool, bool, C8880d3.f41013a);
        f41339O0 = m38126b("measurement.client.safer_resources", bool2, bool2, C8904f3.f41057a);
    }

    /* renamed from: a */
    public static Map<String, String> m38125a(Context context) {
        C8108d3 m35194a = C8108d3.m35194a(context.getContentResolver(), C8258n3.m35645a("com.google.android.gms.measurement"));
        return m35194a == null ? Collections.emptyMap() : m35194a.m35196b();
    }

    /* renamed from: b */
    public static <V> C8976l3<V> m38126b(String str, V v10, V v11, InterfaceC8952j3<V> interfaceC8952j3) {
        C8976l3<V> c8976l3 = new C8976l3<>(str, v10, v11, interfaceC8952j3, null);
        f41351a.add(c8976l3);
        return c8976l3;
    }
}
