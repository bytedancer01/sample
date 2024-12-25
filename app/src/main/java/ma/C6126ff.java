package ma;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.net.telnet.TelnetCommand;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p060da.C4409h;
import p060da.InterfaceC4406e;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ff.class
 */
/* renamed from: ma.ff */
/* loaded from: combined.jar:classes2.jar:ma/ff.class */
public final class C6126ff {

    /* renamed from: j */
    public static final C8015b f33766j = new C8015b("FeatureUsageAnalytics");

    /* renamed from: k */
    public static final String f33767k = "21.3.0";

    /* renamed from: l */
    public static C6126ff f33768l;

    /* renamed from: a */
    public final C6176i2 f33769a;

    /* renamed from: b */
    public final SharedPreferences f33770b;

    /* renamed from: c */
    public final String f33771c;

    /* renamed from: i */
    public long f33777i;

    /* renamed from: h */
    public final InterfaceC4406e f33776h = C4409h.m22439d();

    /* renamed from: f */
    public final Set f33774f = new HashSet();

    /* renamed from: g */
    public final Set f33775g = new HashSet();

    /* renamed from: e */
    public final Handler f33773e = new HandlerC6385s1(Looper.getMainLooper());

    /* renamed from: d */
    public final Runnable f33772d = new Runnable(this) { // from class: ma.ee

        /* renamed from: b */
        public final C6126ff f33749b;

        {
            this.f33749b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6126ff.m29602c(this.f33749b);
        }
    };

    public C6126ff(SharedPreferences sharedPreferences, C6176i2 c6176i2, String str) {
        this.f33770b = sharedPreferences;
        this.f33769a = c6176i2;
        this.f33771c = str;
    }

    /* renamed from: a */
    public static C6126ff m29600a(SharedPreferences sharedPreferences, C6176i2 c6176i2, String str) {
        C6126ff c6126ff;
        synchronized (C6126ff.class) {
            try {
                if (f33768l == null) {
                    f33768l = new C6126ff(sharedPreferences, c6176i2, str);
                }
                c6126ff = f33768l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6126ff;
    }

    /* renamed from: b */
    public static String m29601b(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m29602c(C6126ff c6126ff) {
        if (c6126ff.f33774f.isEmpty()) {
            return;
        }
        long j10 = true != c6126ff.f33775g.equals(c6126ff.f33774f) ? 86400000L : 172800000L;
        long m29606f = c6126ff.m29606f();
        long j11 = c6126ff.f33777i;
        if (j11 == 0 || m29606f - j11 >= j10) {
            f33766j.m34873a("Upload the feature usage report.", new Object[0]);
            C6455v9 m30090y = C6475w9.m30090y();
            m30090y.m30080n(f33767k);
            m30090y.m30079l(c6126ff.f33771c);
            C6475w9 c6475w9 = (C6475w9) m30090y.m29837d();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c6126ff.f33774f);
            C6309o9 m29982y = C6351q9.m29982y();
            m29982y.m29927l(arrayList);
            m29982y.m29928n(c6475w9);
            C6351q9 c6351q9 = (C6351q9) m29982y.m29837d();
            C6121fa m29634z = C6142ga.m29634z();
            m29634z.m29593o(c6351q9);
            c6126ff.f33769a.m29670d((C6142ga) m29634z.m29837d(), TelnetCommand.BREAK);
            SharedPreferences.Editor edit = c6126ff.f33770b.edit();
            if (!c6126ff.f33775g.equals(c6126ff.f33774f)) {
                c6126ff.f33775g.clear();
                c6126ff.f33775g.addAll(c6126ff.f33774f);
                Iterator it = c6126ff.f33775g.iterator();
                while (it.hasNext()) {
                    String num = Integer.toString(((EnumC6057c9) it.next()).zza());
                    String m29607h = c6126ff.m29607h(num);
                    String m29601b = m29601b("feature_usage_timestamp_reported_feature_", num);
                    if (!TextUtils.equals(m29607h, m29601b)) {
                        long j12 = c6126ff.f33770b.getLong(m29607h, 0L);
                        edit.remove(m29607h);
                        if (j12 != 0) {
                            edit.putLong(m29601b, j12);
                        }
                    }
                }
            }
            c6126ff.f33777i = m29606f;
            edit.putLong("feature_usage_last_report_time", m29606f).apply();
        }
    }

    /* renamed from: d */
    public static void m29603d(EnumC6057c9 enumC6057c9) {
        C6126ff c6126ff = f33768l;
        if (c6126ff == null) {
            return;
        }
        c6126ff.f33770b.edit().putLong(c6126ff.m29607h(Integer.toString(enumC6057c9.zza())), c6126ff.m29606f()).apply();
        c6126ff.f33774f.add(enumC6057c9);
        c6126ff.m29609j();
    }

    /* renamed from: g */
    public static EnumC6057c9 m29604g(String str) {
        EnumC6057c9 enumC6057c9;
        try {
            int parseInt = Integer.parseInt(str);
            EnumC6057c9 enumC6057c92 = EnumC6057c9.DEVELOPER_FEATURE_FLAG_UNKNOWN;
            switch (parseInt) {
                case 0:
                    enumC6057c9 = EnumC6057c9.DEVELOPER_FEATURE_FLAG_UNKNOWN;
                    break;
                case 1:
                    enumC6057c9 = EnumC6057c9.CAF_CAST_BUTTON;
                    break;
                case 2:
                    enumC6057c9 = EnumC6057c9.CAF_EXPANDED_CONTROLLER;
                    break;
                case 3:
                    enumC6057c9 = EnumC6057c9.CAF_MINI_CONTROLLER;
                    break;
                case 4:
                    enumC6057c9 = EnumC6057c9.CAF_CONTAINER_CONTROLLER;
                    break;
                case 5:
                    enumC6057c9 = EnumC6057c9.CAST_CONTEXT;
                    break;
                case 6:
                    enumC6057c9 = EnumC6057c9.IMAGE_CACHE;
                    break;
                case 7:
                    enumC6057c9 = EnumC6057c9.IMAGE_PICKER;
                    break;
                case 8:
                    enumC6057c9 = EnumC6057c9.AD_BREAK_PARSER;
                    break;
                case 9:
                    enumC6057c9 = EnumC6057c9.UI_STYLE;
                    break;
                case 10:
                    enumC6057c9 = EnumC6057c9.HARDWARE_VOLUME_BUTTON;
                    break;
                case 11:
                    enumC6057c9 = EnumC6057c9.NON_CAST_DEVICE_PROVIDER;
                    break;
                case 12:
                    enumC6057c9 = EnumC6057c9.PAUSE_CONTROLLER;
                    break;
                case 13:
                    enumC6057c9 = EnumC6057c9.SEEK_CONTROLLER;
                    break;
                case 14:
                    enumC6057c9 = EnumC6057c9.STREAM_VOLUME;
                    break;
                case 15:
                    enumC6057c9 = EnumC6057c9.UI_MEDIA_CONTROLLER;
                    break;
                case 16:
                    enumC6057c9 = EnumC6057c9.PLAYBACK_RATE_CONTROLLER;
                    break;
                case 17:
                    enumC6057c9 = EnumC6057c9.PRECACHE;
                    break;
                case 18:
                    enumC6057c9 = EnumC6057c9.INSTRUCTIONS_VIEW;
                    break;
                case 19:
                    enumC6057c9 = EnumC6057c9.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                    break;
                case 20:
                    enumC6057c9 = EnumC6057c9.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                    break;
                case 21:
                    enumC6057c9 = EnumC6057c9.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                    break;
                case 22:
                    enumC6057c9 = EnumC6057c9.OPTION_DISABLE_ANALYTICS_LOGGING;
                    break;
                case 23:
                    enumC6057c9 = EnumC6057c9.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                    break;
                case 24:
                    enumC6057c9 = EnumC6057c9.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                    break;
                case 25:
                    enumC6057c9 = EnumC6057c9.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                    break;
                case 26:
                    enumC6057c9 = EnumC6057c9.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                    break;
                case 27:
                    enumC6057c9 = EnumC6057c9.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                    break;
                case 28:
                    enumC6057c9 = EnumC6057c9.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                    break;
                case 29:
                    enumC6057c9 = EnumC6057c9.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                    break;
                case 30:
                    enumC6057c9 = EnumC6057c9.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                    break;
                case 31:
                    enumC6057c9 = EnumC6057c9.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                    break;
                case 32:
                    enumC6057c9 = EnumC6057c9.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                    break;
                case 33:
                    enumC6057c9 = EnumC6057c9.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                    break;
                case 34:
                    enumC6057c9 = EnumC6057c9.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                    break;
                case 35:
                    enumC6057c9 = EnumC6057c9.CAST_OUTPUT_SWITCHER_ENABLED;
                    break;
                case 36:
                    enumC6057c9 = EnumC6057c9.CAST_TRANSFER_TO_LOCAL_ENABLED;
                    break;
                case 37:
                    enumC6057c9 = EnumC6057c9.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                    break;
                case 38:
                    enumC6057c9 = EnumC6057c9.CAST_BUTTON_DELEGATE;
                    break;
                case 39:
                    enumC6057c9 = EnumC6057c9.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                    break;
                case 40:
                    enumC6057c9 = EnumC6057c9.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                    break;
                case 41:
                    enumC6057c9 = EnumC6057c9.CAST_TRANSFER_TO_LOCAL_USED;
                    break;
                case 42:
                    enumC6057c9 = EnumC6057c9.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                    break;
                case 43:
                    enumC6057c9 = EnumC6057c9.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                    break;
                case 44:
                    enumC6057c9 = EnumC6057c9.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                    break;
                case 45:
                    enumC6057c9 = EnumC6057c9.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                    break;
                case 46:
                    enumC6057c9 = EnumC6057c9.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                    break;
                case 47:
                    enumC6057c9 = EnumC6057c9.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                    break;
                case 48:
                    enumC6057c9 = EnumC6057c9.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                    break;
                case 49:
                    enumC6057c9 = EnumC6057c9.CAF_NOTIFICATION_SERVICE;
                    break;
                case 50:
                    enumC6057c9 = EnumC6057c9.HARDWARE_VOLUME_BUTTON_PRESS;
                    break;
                case 51:
                    enumC6057c9 = EnumC6057c9.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                    break;
                case 52:
                    enumC6057c9 = EnumC6057c9.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                    break;
                case 53:
                    enumC6057c9 = EnumC6057c9.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                    break;
                case 54:
                    enumC6057c9 = EnumC6057c9.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                    break;
                case 55:
                    enumC6057c9 = EnumC6057c9.CAF_MEDIA_NOTIFICATION_PROXY;
                    break;
                default:
                    enumC6057c9 = null;
                    break;
            }
        } catch (NumberFormatException e10) {
            enumC6057c9 = EnumC6057c9.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
        return enumC6057c9;
    }

    /* renamed from: e */
    public final void m29605e() {
        EnumC6057c9 m29604g;
        String string = this.f33770b.getString("feature_usage_sdk_version", null);
        String string2 = this.f33770b.getString("feature_usage_package_name", null);
        this.f33774f.clear();
        this.f33775g.clear();
        this.f33777i = 0L;
        if (!f33767k.equals(string) || !this.f33771c.equals(string2)) {
            HashSet hashSet = new HashSet();
            for (String str : this.f33770b.getAll().keySet()) {
                if (str.startsWith("feature_usage_timestamp_")) {
                    hashSet.add(str);
                }
            }
            hashSet.add("feature_usage_last_report_time");
            m29608i(hashSet);
            this.f33770b.edit().putString("feature_usage_sdk_version", f33767k).putString("feature_usage_package_name", this.f33771c).apply();
            return;
        }
        this.f33777i = this.f33770b.getLong("feature_usage_last_report_time", 0L);
        long m29606f = m29606f();
        HashSet hashSet2 = new HashSet();
        for (String str2 : this.f33770b.getAll().keySet()) {
            if (str2.startsWith("feature_usage_timestamp_")) {
                long j10 = this.f33770b.getLong(str2, 0L);
                if (j10 == 0 || m29606f - j10 <= 1209600000) {
                    if (str2.startsWith("feature_usage_timestamp_reported_feature_")) {
                        m29604g = m29604g(str2.substring(41));
                        this.f33775g.add(m29604g);
                    } else if (str2.startsWith("feature_usage_timestamp_detected_feature_")) {
                        m29604g = m29604g(str2.substring(41));
                    }
                    this.f33774f.add(m29604g);
                } else {
                    hashSet2.add(str2);
                }
            }
        }
        m29608i(hashSet2);
        C9935o.m41850j(this.f33773e);
        C9935o.m41850j(this.f33772d);
        m29609j();
    }

    /* renamed from: f */
    public final long m29606f() {
        return ((InterfaceC4406e) C9935o.m41850j(this.f33776h)).mo22432a();
    }

    @RequiresNonNull({"sharedPreferences"})
    /* renamed from: h */
    public final String m29607h(String str) {
        String m29601b = m29601b("feature_usage_timestamp_reported_feature_", str);
        return this.f33770b.contains(m29601b) ? m29601b : m29601b("feature_usage_timestamp_detected_feature_", str);
    }

    /* renamed from: i */
    public final void m29608i(Set set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.f33770b.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    @RequiresNonNull({"handler", "reportFeatureUsageRunnable"})
    /* renamed from: j */
    public final void m29609j() {
        this.f33773e.post(this.f33772d);
    }
}
