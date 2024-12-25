package ua;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/g.class
 */
/* renamed from: ua.g */
/* loaded from: combined.jar:classes2.jar:ua/g.class */
public final class C8912g {

    /* renamed from: c */
    public static final C8912g f41092c = new C8912g(null, null);

    /* renamed from: a */
    public final Boolean f41093a;

    /* renamed from: b */
    public final Boolean f41094b;

    public C8912g(Boolean bool, Boolean bool2) {
        this.f41093a = bool;
        this.f41094b = bool2;
    }

    /* renamed from: a */
    public static String m37954a(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && m37960o(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || m37960o(string2) != null) {
            return null;
        }
        return string2;
    }

    /* renamed from: b */
    public static C8912g m37955b(Bundle bundle) {
        return bundle == null ? f41092c : new C8912g(m37960o(bundle.getString("ad_storage")), m37960o(bundle.getString("analytics_storage")));
    }

    /* renamed from: c */
    public static C8912g m37956c(String str) {
        Boolean bool;
        Boolean bool2 = null;
        if (str != null) {
            Boolean m37961p = str.length() >= 3 ? m37961p(str.charAt(2)) : null;
            if (str.length() >= 4) {
                bool2 = m37961p(str.charAt(3));
            }
            bool = m37961p;
        } else {
            bool2 = null;
            bool = null;
        }
        return new C8912g(bool, bool2);
    }

    /* renamed from: j */
    public static Boolean m37957j(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z10 = false;
        if (bool.booleanValue()) {
            z10 = false;
            if (bool2.booleanValue()) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }

    /* renamed from: m */
    public static boolean m37958m(int i10, int i11) {
        return i10 <= i11;
    }

    /* renamed from: n */
    public static final int m37959n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: o */
    public static Boolean m37960o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: p */
    public static Boolean m37961p(char c10) {
        if (c10 == '0') {
            return Boolean.FALSE;
        }
        if (c10 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: q */
    public static final char m37962q(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    /* renamed from: d */
    public final String m37963d() {
        return "G1" + m37962q(this.f41093a) + m37962q(this.f41094b);
    }

    /* renamed from: e */
    public final Boolean m37964e() {
        return this.f41093a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8912g)) {
            return false;
        }
        C8912g c8912g = (C8912g) obj;
        return m37959n(this.f41093a) == m37959n(c8912g.f41093a) && m37959n(this.f41094b) == m37959n(c8912g.f41094b);
    }

    /* renamed from: f */
    public final boolean m37965f() {
        Boolean bool = this.f41093a;
        return bool == null || bool.booleanValue();
    }

    /* renamed from: g */
    public final Boolean m37966g() {
        return this.f41094b;
    }

    /* renamed from: h */
    public final boolean m37967h() {
        Boolean bool = this.f41094b;
        return bool == null || bool.booleanValue();
    }

    public final int hashCode() {
        return ((m37959n(this.f41093a) + 527) * 31) + m37959n(this.f41094b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r4.f41093a == r0) goto L6;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m37968i(ua.C8912g r4) {
        /*
            r3 = this;
            r0 = r3
            java.lang.Boolean r0 = r0.f41093a
            r7 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8 = r0
            r0 = 1
            r6 = r0
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L1f
            r0 = r6
            r5 = r0
            r0 = r4
            java.lang.Boolean r0 = r0.f41093a
            r1 = r8
            if (r0 != r1) goto L3a
        L1f:
            r0 = r3
            java.lang.Boolean r0 = r0.f41094b
            r1 = r8
            if (r0 != r1) goto L38
            r0 = r4
            java.lang.Boolean r0 = r0.f41094b
            r1 = r8
            if (r0 == r1) goto L36
            r0 = r6
            r5 = r0
            goto L3a
        L36:
            r0 = 0
            return r0
        L38:
            r0 = 0
            r5 = r0
        L3a:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C8912g.m37968i(ua.g):boolean");
    }

    /* renamed from: k */
    public final C8912g m37969k(C8912g c8912g) {
        return new C8912g(m37957j(this.f41093a, c8912g.f41093a), m37957j(this.f41094b, c8912g.f41094b));
    }

    /* renamed from: l */
    public final C8912g m37970l(C8912g c8912g) {
        Boolean bool = this.f41093a;
        Boolean bool2 = bool;
        if (bool == null) {
            bool2 = c8912g.f41093a;
        }
        Boolean bool3 = this.f41094b;
        Boolean bool4 = bool3;
        if (bool3 == null) {
            bool4 = c8912g.f41094b;
        }
        return new C8912g(bool2, bool4);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsentSettings: ");
        sb2.append("adStorage=");
        Boolean bool = this.f41093a;
        if (bool == null) {
            sb2.append("uninitialized");
        } else {
            sb2.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb2.append(", analyticsStorage=");
        Boolean bool2 = this.f41094b;
        if (bool2 == null) {
            sb2.append("uninitialized");
        } else {
            sb2.append(true != bool2.booleanValue() ? "denied" : "granted");
        }
        return sb2.toString();
    }
}
