package p305ra;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import p060da.C4409h;
import p060da.InterfaceC4406e;
import p097fa.C4794e;
import p336ta.C8676a;
import p422y9.C9935o;
import ua.C8992m7;
import ua.C9096v4;
import ua.InterfaceC8895e6;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/e0.class
 */
/* renamed from: ra.e0 */
/* loaded from: combined.jar:classes2.jar:ra/e0.class */
public final class C8120e0 {

    /* renamed from: j */
    public static volatile C8120e0 f39041j;

    /* renamed from: k */
    public static Boolean f39042k;

    /* renamed from: a */
    public final String f39043a;

    /* renamed from: b */
    public final InterfaceC4406e f39044b;

    /* renamed from: c */
    public final ExecutorService f39045c;

    /* renamed from: d */
    public final C8676a f39046d;

    /* renamed from: e */
    public final List<Pair<InterfaceC8895e6, Object>> f39047e;

    /* renamed from: f */
    public int f39048f;

    /* renamed from: g */
    public boolean f39049g;

    /* renamed from: h */
    public final String f39050h;

    /* renamed from: i */
    public volatile InterfaceC8313qd f39051i;

    public C8120e0(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f39043a = (str == null || !m35229s(str2, str3)) ? "FA" : str;
        this.f39044b = C4409h.m22439d();
        boolean z10 = true;
        this.f39045c = C8353t8.m35832a().mo35783a(new ThreadFactoryC8284p(this), 1);
        this.f39046d = new C8676a(this);
        this.f39047e = new ArrayList();
        try {
            if (C8992m7.m38133b(context, "google_app_id", C9096v4.m38315a(context)) != null && !m35228o()) {
                this.f39050h = null;
                this.f39049g = true;
                Log.w(this.f39043a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException e10) {
        }
        if (m35229s(str2, str3)) {
            this.f39050h = str2;
        } else {
            this.f39050h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z10)) {
                    Log.w(this.f39043a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f39043a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        m35244p(new C8134f(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f39043a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C8105d0(this));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m35223j(Context context) {
        Bundle bundle;
        synchronized (C8120e0.class) {
            try {
                try {
                } catch (Exception e10) {
                    Log.e("FA", "Exception reading flag from SharedPreferences.", e10);
                    f39042k = Boolean.TRUE;
                }
                if (f39042k != null) {
                    return;
                }
                C9935o.m41846f("app_measurement_internal_disable_startup_flags");
                try {
                    ApplicationInfo m24245c = C4794e.m24250a(context).m24245c(context.getPackageName(), 128);
                    if (m24245c != null && (bundle = m24245c.metaData) != null) {
                        if (bundle.getBoolean("app_measurement_internal_disable_startup_flags")) {
                            f39042k = Boolean.TRUE;
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                f39042k = Boolean.valueOf(sharedPreferences.getBoolean("allow_remote_dynamite", true));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("allow_remote_dynamite");
                edit.apply();
            } finally {
            }
        }
    }

    /* renamed from: o */
    public static final boolean m35228o() {
        return true;
    }

    /* renamed from: s */
    public static final boolean m35229s(String str, String str2) {
        return (str2 == null || str == null || m35228o()) ? false : true;
    }

    /* renamed from: t */
    public static C8120e0 m35230t(Context context, String str, String str2, String str3, Bundle bundle) {
        C9935o.m41850j(context);
        if (f39041j == null) {
            synchronized (C8120e0.class) {
                try {
                    if (f39041j == null) {
                        f39041j = new C8120e0(context, str, str2, str3, bundle);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f39041j;
    }

    /* renamed from: A */
    public final List<Bundle> m35231A(String str, String str2) {
        BinderC8385va binderC8385va = new BinderC8385va();
        m35244p(new C8104d(this, str, str2, binderC8385va));
        List<Bundle> list = (List) BinderC8385va.m35971B1(binderC8385va.m35972U0(5000L), List.class);
        List<Bundle> list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    /* renamed from: B */
    public final void m35232B(Activity activity, String str, String str2) {
        m35244p(new C8119e(this, activity, str, str2));
    }

    /* renamed from: C */
    public final void m35233C(String str) {
        m35244p(new C8149g(this, str));
    }

    /* renamed from: D */
    public final void m35234D(String str) {
        m35244p(new C8164h(this, str));
    }

    /* renamed from: E */
    public final String m35235E() {
        BinderC8385va binderC8385va = new BinderC8385va();
        m35244p(new C8179i(this, binderC8385va));
        return binderC8385va.m35973y0(500L);
    }

    /* renamed from: F */
    public final String m35236F() {
        BinderC8385va binderC8385va = new BinderC8385va();
        m35244p(new C8194j(this, binderC8385va));
        return binderC8385va.m35973y0(50L);
    }

    /* renamed from: G */
    public final long m35237G() {
        long longValue;
        BinderC8385va binderC8385va = new BinderC8385va();
        m35244p(new C8209k(this, binderC8385va));
        Long l10 = (Long) BinderC8385va.m35971B1(binderC8385va.m35972U0(500L), Long.class);
        if (l10 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f39044b.mo22432a()).nextLong();
            int i10 = this.f39048f + 1;
            this.f39048f = i10;
            longValue = nextLong + i10;
        } else {
            longValue = l10.longValue();
        }
        return longValue;
    }

    /* renamed from: H */
    public final String m35238H() {
        BinderC8385va binderC8385va = new BinderC8385va();
        m35244p(new C8224l(this, binderC8385va));
        return binderC8385va.m35973y0(500L);
    }

    /* renamed from: a */
    public final String m35239a() {
        BinderC8385va binderC8385va = new BinderC8385va();
        m35244p(new C8239m(this, binderC8385va));
        return binderC8385va.m35973y0(500L);
    }

    /* renamed from: b */
    public final Map<String, Object> m35240b(String str, String str2, boolean z10) {
        BinderC8385va binderC8385va = new BinderC8385va();
        m35244p(new C8254n(this, str, str2, z10, binderC8385va));
        Bundle m35972U0 = binderC8385va.m35972U0(5000L);
        if (m35972U0 == null || m35972U0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(m35972U0.size());
        for (String str3 : m35972U0.keySet()) {
            Object obj = m35972U0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public final void m35241c(int i10, String str, Object obj, Object obj2, Object obj3) {
        m35244p(new C8269o(this, false, 5, str, obj, null, null));
    }

    /* renamed from: d */
    public final int m35242d(String str) {
        BinderC8385va binderC8385va = new BinderC8385va();
        m35244p(new C8299q(this, str, binderC8385va));
        Integer num = (Integer) BinderC8385va.m35971B1(binderC8385va.m35972U0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: e */
    public final void m35243e(boolean z10) {
        m35244p(new C8314r(this, z10));
    }

    /* renamed from: p */
    public final void m35244p(AbstractRunnableC8374v abstractRunnableC8374v) {
        this.f39045c.execute(abstractRunnableC8374v);
    }

    /* renamed from: q */
    public final void m35245q(Exception exc, boolean z10, boolean z11) {
        this.f39049g |= z10;
        if (z10) {
            Log.w(this.f39043a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            m35241c(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f39043a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: r */
    public final void m35246r(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        m35244p(new C8344t(this, l10, str, str2, bundle, z10, z11));
    }

    /* renamed from: u */
    public final C8676a m35247u() {
        return this.f39046d;
    }

    /* renamed from: v */
    public final InterfaceC8313qd m35248v(Context context, boolean z10) {
        try {
            return AbstractBinderC8417xc.asInterface(DynamiteModule.m13174e(context, z10 ? DynamiteModule.f14840g : DynamiteModule.f14836c, ModuleDescriptor.MODULE_ID).m13182d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C2419a e10) {
            m35245q(e10, true, false);
            return null;
        }
    }

    /* renamed from: w */
    public final void m35249w(String str, String str2, Bundle bundle) {
        m35246r(str, str2, bundle, true, true, null);
    }

    /* renamed from: x */
    public final void m35250x(String str, String str2, Object obj, boolean z10) {
        m35244p(new C8359u(this, str, str2, obj, z10));
    }

    /* renamed from: y */
    public final void m35251y(Bundle bundle) {
        m35244p(new C8074b(this, bundle));
    }

    /* renamed from: z */
    public final void m35252z(String str, String str2, Bundle bundle) {
        m35244p(new C8089c(this, str, str2, bundle));
    }
}
