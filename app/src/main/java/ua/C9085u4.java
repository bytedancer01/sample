package ua;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;
import p294r.C7928a;
import p305ra.C8061a1;
import p305ra.C8091c1;
import p305ra.C8106d1;
import p305ra.C8136f1;
import p305ra.C8234l9;
import p305ra.C8396w6;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/u4.class
 */
/* renamed from: ua.u4 */
/* loaded from: combined.jar:classes2.jar:ua/u4.class */
public final class C9085u4 extends AbstractC9030p9 implements InterfaceC8888e {

    /* renamed from: d */
    public final Map<String, Map<String, String>> f41654d;

    /* renamed from: e */
    public final Map<String, Map<String, Boolean>> f41655e;

    /* renamed from: f */
    public final Map<String, Map<String, Boolean>> f41656f;

    /* renamed from: g */
    public final Map<String, C8106d1> f41657g;

    /* renamed from: h */
    public final Map<String, Map<String, Integer>> f41658h;

    /* renamed from: i */
    public final Map<String, String> f41659i;

    public C9085u4(C9123x9 c9123x9) {
        super(c9123x9);
        this.f41654d = new C7928a();
        this.f41655e = new C7928a();
        this.f41656f = new C7928a();
        this.f41657g = new C7928a();
        this.f41659i = new C7928a();
        this.f41658h = new C7928a();
    }

    /* renamed from: A */
    public static final Map<String, String> m38244A(C8106d1 c8106d1) {
        C7928a c7928a = new C7928a();
        if (c8106d1 != null) {
            for (C8136f1 c8136f1 : c8106d1.m35185E()) {
                c7928a.put(c8136f1.m35335z(), c8136f1.m35334A());
            }
        }
        return c7928a;
    }

    @Override // ua.InterfaceC8888e
    /* renamed from: d */
    public final String mo37798d(String str, String str2) {
        mo37811h();
        m38256x(str);
        Map<String, String> map = this.f41654d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // ua.AbstractC9030p9
    /* renamed from: l */
    public final boolean mo37812l() {
        return false;
    }

    /* renamed from: m */
    public final C8106d1 m38245m(String str) {
        m38183j();
        mo37811h();
        C9935o.m41846f(str);
        m38256x(str);
        return this.f41657g.get(str);
    }

    /* renamed from: n */
    public final String m38246n(String str) {
        mo37811h();
        return this.f41659i.get(str);
    }

    /* renamed from: o */
    public final void m38247o(String str) {
        mo37811h();
        this.f41659i.put(str, null);
    }

    /* renamed from: p */
    public final void m38248p(String str) {
        mo37811h();
        this.f41657g.remove(str);
    }

    /* renamed from: q */
    public final boolean m38249q(String str) {
        mo37811h();
        C8106d1 m38245m = m38245m(str);
        if (m38245m == null) {
            return false;
        }
        return m38245m.m35189I();
    }

    /* renamed from: r */
    public final boolean m38250r(String str, byte[] bArr, String str2) {
        m38183j();
        mo37811h();
        C9935o.m41846f(str);
        C8091c1 m35590r = m38258z(str, bArr).m35590r();
        if (m35590r == null) {
            return false;
        }
        m38257y(str, m35590r);
        this.f41657g.put(str, m35590r.m35445l());
        this.f41659i.put(str, str2);
        this.f41654d.put(str, m38244A(m35590r.m35445l()));
        this.f41516b.m38363Z().m38088v(str, new ArrayList(m35590r.m35091z()));
        try {
            m35590r.m35087A();
            bArr = m35590r.m35445l().m35811f();
        } catch (RuntimeException e10) {
            this.f41723a.mo37780c().m38411r().m38328c("Unable to serialize reduced-size config. Storing full config instead. appId", C9128y3.m38407x(str), e10);
        }
        C8948j m38363Z = this.f41516b.m38363Z();
        C9935o.m41846f(str);
        m38363Z.mo37811h();
        m38363Z.m38183j();
        new ContentValues().put("remote_config", bArr);
        try {
            if (m38363Z.m38058N().update("apps", r0, "app_id = ?", new String[]{str}) == 0) {
                m38363Z.f41723a.mo37780c().m38408o().m38327b("Failed to update remote config (got 0). appId", C9128y3.m38407x(str));
            }
        } catch (SQLiteException e11) {
            m38363Z.f41723a.mo37780c().m38408o().m38328c("Error storing remote config. appId", C9128y3.m38407x(str), e11);
        }
        this.f41657g.put(str, m35590r.m35445l());
        return true;
    }

    /* renamed from: s */
    public final boolean m38251s(String str, String str2) {
        Boolean bool;
        mo37811h();
        m38256x(str);
        if (m38254v(str) && C8899ea.m37819F(str2)) {
            return true;
        }
        if (m38255w(str) && C8899ea.m37827i0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f41655e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: t */
    public final boolean m38252t(String str, String str2) {
        Boolean bool;
        mo37811h();
        m38256x(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f41656f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: u */
    public final int m38253u(String str, String str2) {
        Integer num;
        mo37811h();
        m38256x(str);
        Map<String, Integer> map = this.f41658h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: v */
    public final boolean m38254v(String str) {
        return "1".equals(mo37798d(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: w */
    public final boolean m38255w(String str) {
        return "1".equals(mo37798d(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        if (r11 == null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38256x(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C9085u4.m38256x(java.lang.String):void");
    }

    /* renamed from: y */
    public final void m38257y(String str, C8091c1 c8091c1) {
        C7928a c7928a = new C7928a();
        C7928a c7928a2 = new C7928a();
        C7928a c7928a3 = new C7928a();
        if (c8091c1 != null) {
            for (int i10 = 0; i10 < c8091c1.m35088s(); i10++) {
                C8061a1 m35590r = c8091c1.m35089u(i10).m35590r();
                if (TextUtils.isEmpty(m35590r.m34990s())) {
                    this.f41723a.mo37780c().m38411r().m38326a("EventConfig contained null event name");
                } else {
                    String m34990s = m35590r.m34990s();
                    String m37738b = C8847a6.m37738b(m35590r.m34990s());
                    if (!TextUtils.isEmpty(m37738b)) {
                        m35590r.m34991u(m37738b);
                        c8091c1.m35090x(i10, m35590r);
                    }
                    C8234l9.m35593a();
                    if (!this.f41723a.m37797z().m37900w(null, C8988m3.f41335M0)) {
                        m34990s = m35590r.m34990s();
                    }
                    c7928a.put(m34990s, Boolean.valueOf(m35590r.m34992x()));
                    c7928a2.put(m35590r.m34990s(), Boolean.valueOf(m35590r.m34993z()));
                    if (m35590r.m34988A()) {
                        if (m35590r.m34989C() < 2 || m35590r.m34989C() > 65535) {
                            this.f41723a.mo37780c().m38411r().m38328c("Invalid sampling rate. Event name, sample rate", m35590r.m34990s(), Integer.valueOf(m35590r.m34989C()));
                        } else {
                            c7928a3.put(m35590r.m34990s(), Integer.valueOf(m35590r.m34989C()));
                        }
                    }
                }
            }
        }
        this.f41655e.put(str, c7928a);
        this.f41656f.put(str, c7928a2);
        this.f41658h.put(str, c7928a3);
    }

    /* renamed from: z */
    public final C8106d1 m38258z(String str, byte[] bArr) {
        if (bArr == null) {
            return C8106d1.m35178K();
        }
        try {
            C8106d1 m35445l = ((C8091c1) C9145z9.m38445I(C8106d1.m35177J(), bArr)).m35445l();
            C9106w3 m38416w = this.f41723a.mo37780c().m38416w();
            String str2 = null;
            Long valueOf = m35445l.m35190z() ? Long.valueOf(m35445l.m35182A()) : null;
            if (m35445l.m35183C()) {
                str2 = m35445l.m35184D();
            }
            m38416w.m38328c("Parsed config. version, gmp_app_id", valueOf, str2);
            return m35445l;
        } catch (RuntimeException | C8396w6 e10) {
            this.f41723a.mo37780c().m38411r().m38328c("Unable to merge remote config. appId", C9128y3.m38407x(str), e10);
            return C8106d1.m35178K();
        }
    }
}
