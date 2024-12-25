package ua;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p060da.C4415n;
import p097fa.C4794e;
import p305ra.C8130ea;
import p305ra.C8147fc;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/f.class
 */
/* renamed from: ua.f */
/* loaded from: combined.jar:classes2.jar:ua/f.class */
public final class C8900f extends C9108w5 {

    /* renamed from: b */
    public Boolean f41051b;

    /* renamed from: c */
    public InterfaceC8888e f41052c;

    /* renamed from: d */
    public Boolean f41053d;

    public C8900f(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41052c = C8876d.f41007a;
    }

    /* renamed from: I */
    public static final long m37877I() {
        return C8988m3.f41359e.m38108b(null).longValue();
    }

    /* renamed from: i */
    public static final long m37878i() {
        return C8988m3.f41318E.m38108b(null).longValue();
    }

    /* renamed from: A */
    public final boolean m37879A() {
        this.f41723a.mo37783f();
        Boolean m37902y = m37902y("firebase_analytics_collection_deactivated");
        return m37902y != null && m37902y.booleanValue();
    }

    /* renamed from: B */
    public final boolean m37880B() {
        Boolean m37902y = m37902y("google_analytics_adid_collection_enabled");
        return m37902y == null || m37902y.booleanValue();
    }

    /* renamed from: C */
    public final boolean m37881C() {
        Boolean m37902y;
        C8147fc.m35372a();
        return !m37900w(null, C8988m3.f41392u0) || (m37902y = m37902y("google_analytics_automatic_screen_reporting_enabled")) == null || m37902y.booleanValue();
    }

    /* renamed from: D */
    public final String m37882D() {
        return m37887j("debug.firebase.analytics.app", "");
    }

    /* renamed from: E */
    public final String m37883E() {
        return m37887j("debug.deferred.deeplink", "");
    }

    /* renamed from: F */
    public final boolean m37884F(String str) {
        return "1".equals(this.f41052c.mo37798d(str, "gaia_collection_enabled"));
    }

    /* renamed from: G */
    public final boolean m37885G(String str) {
        return "1".equals(this.f41052c.mo37798d(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: H */
    public final boolean m37886H() {
        if (this.f41051b == null) {
            Boolean m37902y = m37902y("app_measurement_lite");
            this.f41051b = m37902y;
            if (m37902y == null) {
                this.f41051b = Boolean.FALSE;
            }
        }
        return this.f41051b.booleanValue() || !this.f41723a.m37773O();
    }

    /* renamed from: j */
    public final String m37887j(String str, String str2) {
        C9106w3 m38408o;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            C9935o.m41850j(str4);
            return str4;
        } catch (ClassNotFoundException e10) {
            e = e10;
            m38408o = this.f41723a.mo37780c().m38408o();
            str3 = "Could not find SystemProperties class";
            m38408o.m38327b(str3, e);
            return "";
        } catch (IllegalAccessException e11) {
            e = e11;
            m38408o = this.f41723a.mo37780c().m38408o();
            str3 = "Could not access SystemProperties.get()";
            m38408o.m38327b(str3, e);
            return "";
        } catch (NoSuchMethodException e12) {
            e = e12;
            m38408o = this.f41723a.mo37780c().m38408o();
            str3 = "Could not find SystemProperties.get() method";
            m38408o.m38327b(str3, e);
            return "";
        } catch (InvocationTargetException e13) {
            e = e13;
            m38408o = this.f41723a.mo37780c().m38408o();
            str3 = "SystemProperties.get() threw an exception";
            m38408o.m38327b(str3, e);
            return "";
        }
    }

    /* renamed from: k */
    public final void m37888k(InterfaceC8888e interfaceC8888e) {
        this.f41052c = interfaceC8888e;
    }

    /* renamed from: l */
    public final String m37889l() {
        this.f41723a.mo37783f();
        return "FA";
    }

    /* renamed from: m */
    public final int m37890m() {
        C8130ea.m35325a();
        if (!this.f41723a.m37797z().m37900w(null, C8988m3.f41400y0)) {
            return 25;
        }
        C8899ea m37765G = this.f41723a.m37765G();
        Boolean m38309q = m37765G.f41723a.m37776R().m38309q();
        if (m37765G.m37835N() < 201500) {
            return (m38309q == null || m38309q.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: n */
    public final int m37891n(String str) {
        return m37898u(str, C8988m3.f41328J, 25, 100);
    }

    /* renamed from: o */
    public final int m37892o(String str) {
        C8130ea.m35325a();
        if (m37900w(null, C8988m3.f41398x0)) {
            return m37898u(str, C8988m3.f41326I, 500, 2000);
        }
        return 500;
    }

    /* renamed from: p */
    public final long m37893p() {
        this.f41723a.mo37783f();
        return 37000L;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: q */
    public final boolean m37894q() {
        if (this.f41053d == null) {
            synchronized (this) {
                if (this.f41053d == null) {
                    ApplicationInfo applicationInfo = this.f41723a.mo37779b().getApplicationInfo();
                    String m22462a = C4415n.m22462a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null) {
                            z10 = false;
                            if (str.equals(m22462a)) {
                                z10 = true;
                            }
                        }
                        this.f41053d = Boolean.valueOf(z10);
                    }
                    if (this.f41053d == null) {
                        this.f41053d = Boolean.TRUE;
                        this.f41723a.mo37780c().m38408o().m38326a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f41053d.booleanValue();
    }

    /* renamed from: r */
    public final String m37895r(String str, C8976l3<String> c8976l3) {
        return c8976l3.m38108b(str == null ? null : this.f41052c.mo37798d(str, c8976l3.m38107a()));
    }

    /* renamed from: s */
    public final long m37896s(String str, C8976l3<Long> c8976l3) {
        if (str != null) {
            String mo37798d = this.f41052c.mo37798d(str, c8976l3.m38107a());
            if (!TextUtils.isEmpty(mo37798d)) {
                try {
                    return c8976l3.m38108b(Long.valueOf(Long.parseLong(mo37798d))).longValue();
                } catch (NumberFormatException e10) {
                }
            }
        }
        return c8976l3.m38108b(null).longValue();
    }

    /* renamed from: t */
    public final int m37897t(String str, C8976l3<Integer> c8976l3) {
        if (str != null) {
            String mo37798d = this.f41052c.mo37798d(str, c8976l3.m38107a());
            if (!TextUtils.isEmpty(mo37798d)) {
                try {
                    return c8976l3.m38108b(Integer.valueOf(Integer.parseInt(mo37798d))).intValue();
                } catch (NumberFormatException e10) {
                }
            }
        }
        return c8976l3.m38108b(null).intValue();
    }

    /* renamed from: u */
    public final int m37898u(String str, C8976l3<Integer> c8976l3, int i10, int i11) {
        return Math.max(Math.min(m37897t(str, c8976l3), i11), i10);
    }

    /* renamed from: v */
    public final double m37899v(String str, C8976l3<Double> c8976l3) {
        if (str != null) {
            String mo37798d = this.f41052c.mo37798d(str, c8976l3.m38107a());
            if (!TextUtils.isEmpty(mo37798d)) {
                try {
                    return c8976l3.m38108b(Double.valueOf(Double.parseDouble(mo37798d))).doubleValue();
                } catch (NumberFormatException e10) {
                }
            }
        }
        return c8976l3.m38108b(null).doubleValue();
    }

    /* renamed from: w */
    public final boolean m37900w(String str, C8976l3<Boolean> c8976l3) {
        Boolean m38108b;
        if (str != null) {
            String mo37798d = this.f41052c.mo37798d(str, c8976l3.m38107a());
            if (!TextUtils.isEmpty(mo37798d)) {
                m38108b = c8976l3.m38108b(Boolean.valueOf(Boolean.parseBoolean(mo37798d)));
                return m38108b.booleanValue();
            }
        }
        m38108b = c8976l3.m38108b(null);
        return m38108b.booleanValue();
    }

    /* renamed from: x */
    public final Bundle m37901x() {
        try {
            if (this.f41723a.mo37779b().getPackageManager() == null) {
                this.f41723a.mo37780c().m38408o().m38326a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m24245c = C4794e.m24250a(this.f41723a.mo37779b()).m24245c(this.f41723a.mo37779b().getPackageName(), 128);
            if (m24245c != null) {
                return m24245c.metaData;
            }
            this.f41723a.mo37780c().m38408o().m38326a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f41723a.mo37780c().m38408o().m38327b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    /* renamed from: y */
    public final Boolean m37902y(String str) {
        C9935o.m41846f(str);
        Bundle m37901x = m37901x();
        if (m37901x == null) {
            this.f41723a.mo37780c().m38408o().m38326a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (m37901x.containsKey(str)) {
            return Boolean.valueOf(m37901x.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> m37903z(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "analytics.safelisted_events"
            java.lang.String r0 = p422y9.C9935o.m41846f(r0)
            r0 = r4
            android.os.Bundle r0 = r0.m37901x()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L25
            r0 = r4
            ua.c5 r0 = r0.f41723a
            ua.y3 r0 = r0.mo37780c()
            ua.w3 r0 = r0.m38408o()
            java.lang.String r1 = "Failed to load metadata: Metadata bundle is null"
            r0.m38326a(r1)
        L20:
            r0 = 0
            r5 = r0
            goto L3d
        L25:
            r0 = r5
            java.lang.String r1 = "analytics.safelisted_events"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L32
            goto L20
        L32:
            r0 = r5
            java.lang.String r1 = "analytics.safelisted_events"
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = r0
        L3d:
            r0 = r5
            if (r0 == 0) goto L72
            r0 = r4
            ua.c5 r0 = r0.f41723a     // Catch: android.content.res.Resources.NotFoundException -> L60
            android.content.Context r0 = r0.mo37779b()     // Catch: android.content.res.Resources.NotFoundException -> L60
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L60
            r1 = r5
            int r1 = r1.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L60
            java.lang.String[] r0 = r0.getStringArray(r1)     // Catch: android.content.res.Resources.NotFoundException -> L60
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L59
            r0 = 0
            return r0
        L59:
            r0 = r5
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: android.content.res.Resources.NotFoundException -> L60
            r5 = r0
            r0 = r5
            return r0
        L60:
            r5 = move-exception
            r0 = r4
            ua.c5 r0 = r0.f41723a
            ua.y3 r0 = r0.mo37780c()
            ua.w3 r0 = r0.m38408o()
            java.lang.String r1 = "Failed to load string array from metadata: resource not found"
            r2 = r5
            r0.m38327b(r1, r2)
        L72:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8900f.m37903z(java.lang.String):java.util.List");
    }
}
