package ma;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Map;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/p9.class
 */
/* renamed from: ma.p9 */
/* loaded from: combined.jar:classes2.jar:ma/p9.class */
public final class C6330p9 {

    /* renamed from: d */
    public static final C8015b f33961d = new C8015b("ApplicationAnalyticsUtils");

    /* renamed from: e */
    public static final String f33962e = "21.3.0";

    /* renamed from: a */
    public final String f33963a;

    /* renamed from: b */
    public final Map f33964b;

    /* renamed from: c */
    public final Map f33965c;

    public C6330p9(Bundle bundle, String str) {
        this.f33963a = str;
        this.f33964b = C6152h.m29655a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.f33965c = C6152h.m29655a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    /* renamed from: i */
    public static void m29952i(C6121fa c6121fa, boolean z10) {
        C6495x9 m30172z = C6515y9.m30172z(c6121fa.m29591l());
        m30172z.m30115u(z10);
        c6121fa.m29594p(m30172z);
    }

    /* renamed from: a */
    public final C6142ga m29953a(C6308o8 c6308o8) {
        return (C6142ga) m29960h(c6308o8).m29837d();
    }

    /* renamed from: b */
    public final C6142ga m29954b(C6308o8 c6308o8, boolean z10) {
        C6121fa m29960h = m29960h(c6308o8);
        m29952i(m29960h, z10);
        return (C6142ga) m29960h.m29837d();
    }

    /* renamed from: c */
    public final C6142ga m29955c(C6308o8 c6308o8) {
        C6121fa m29960h = m29960h(c6308o8);
        C6495x9 m30172z = C6515y9.m30172z(m29960h.m29591l());
        m30172z.m30116x(10);
        m29960h.m29595s((C6515y9) m30172z.m29837d());
        m29952i(m29960h, true);
        return (C6142ga) m29960h.m29837d();
    }

    /* renamed from: d */
    public final C6142ga m29956d(C6308o8 c6308o8) {
        C6121fa m29960h = m29960h(c6308o8);
        if (c6308o8.f33936j == 1) {
            C6495x9 m30172z = C6515y9.m30172z(m29960h.m29591l());
            m30172z.m30116x(17);
            m29960h.m29595s((C6515y9) m30172z.m29837d());
        }
        return (C6142ga) m29960h.m29837d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ma.C6142ga m29957e(ma.C6308o8 r4, int r5) {
        /*
            r3 = this;
            r0 = r3
            r1 = r4
            ma.fa r0 = r0.m29960h(r1)
            r7 = r0
            r0 = r7
            ma.y9 r0 = r0.m29591l()
            ma.x9 r0 = ma.C6515y9.m30172z(r0)
            r4 = r0
            r0 = r3
            java.util.Map r0 = r0.f33965c
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L4b
            r0 = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = r0
            r0 = r8
            r1 = r9
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L30
            goto L4b
        L30:
            r0 = r3
            java.util.Map r0 = r0.f33965c
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6 = r0
            goto L51
        L4b:
            r0 = r5
            r1 = 10000(0x2710, float:1.4013E-41)
            int r0 = r0 + r1
            r6 = r0
        L51:
            r0 = r4
            r1 = r6
            ma.x9 r0 = r0.m30116x(r1)
            r0 = r3
            java.util.Map r0 = r0.f33964b
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L92
            r0 = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = r0
            r0 = r9
            r1 = r8
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L77
            goto L92
        L77:
            r0 = r3
            java.util.Map r0 = r0.f33964b
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5 = r0
            goto L98
        L92:
            int r5 = r5 + 10000
        L98:
            r0 = r4
            r1 = r5
            ma.x9 r0 = r0.m30112o(r1)
            r0 = r7
            r1 = r4
            ma.ng r1 = r1.m29837d()
            ma.y9 r1 = (ma.C6515y9) r1
            ma.fa r0 = r0.m29595s(r1)
            r0 = r7
            ma.ng r0 = r0.m29837d()
            ma.ga r0 = (ma.C6142ga) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6330p9.m29957e(ma.o8, int):ma.ga");
    }

    /* renamed from: f */
    public final C6142ga m29958f(C6308o8 c6308o8, int i10, int i11) {
        C6121fa m29960h = m29960h(c6308o8);
        C6495x9 m30172z = C6515y9.m30172z(m29960h.m29591l());
        m30172z.m30109C(i10);
        m30172z.m30108A(i11);
        m29960h.m29595s((C6515y9) m30172z.m29837d());
        return (C6142ga) m29960h.m29837d();
    }

    /* renamed from: g */
    public final C6142ga m29959g(C6308o8 c6308o8, int i10) {
        C6121fa m29960h = m29960h(c6308o8);
        C6495x9 m30172z = C6515y9.m30172z(m29960h.m29591l());
        m30172z.m30109C(i10);
        m29960h.m29595s((C6515y9) m30172z.m29837d());
        return (C6142ga) m29960h.m29837d();
    }

    /* renamed from: h */
    public final C6121fa m29960h(C6308o8 c6308o8) {
        long j10;
        C6121fa m29634z = C6142ga.m29634z();
        m29634z.m29590E(c6308o8.f33929c);
        int i10 = c6308o8.f33930d;
        c6308o8.f33930d = i10 + 1;
        m29634z.m29587A(i10);
        String str = c6308o8.f33928b;
        if (str != null) {
            m29634z.m29588C(str);
        }
        String str2 = c6308o8.f33933g;
        if (str2 != null) {
            m29634z.m29598z(str2);
        }
        C6455v9 m30090y = C6475w9.m30090y();
        m30090y.m30080n(f33962e);
        m30090y.m30079l(this.f33963a);
        m29634z.m29592n((C6475w9) m30090y.m29837d());
        C6495x9 m30171y = C6515y9.m30171y();
        if (c6308o8.f33927a != null) {
            C6394sa m30040y = C6415ta.m30040y();
            m30040y.m30004l(c6308o8.f33927a);
            m30171y.m30110l((C6415ta) m30040y.m29837d());
        }
        m30171y.m30115u(false);
        String str3 = c6308o8.f33931e;
        if (str3 != null) {
            try {
                String replace = str3.replace("-", "");
                j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e10) {
                f33961d.m34879g(e10, "receiverSessionId %s is not valid for hash", str3);
                j10 = 0;
            }
            m30171y.m30117z(j10);
        }
        m30171y.m30111n(c6308o8.f33932f);
        m30171y.m30113p(c6308o8.f33934h);
        m30171y.m30114s(c6308o8.f33935i);
        m29634z.m29594p(m30171y);
        return m29634z;
    }
}
