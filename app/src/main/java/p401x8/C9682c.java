package p401x8;

import android.text.TextUtils;
import ec.C4699b;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p059d9.C4349a;
import p059d9.C4358e;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x8/c.class
 */
/* renamed from: x8.c */
/* loaded from: combined.jar:classes2.jar:x8/c.class */
public final class C9682c {

    /* renamed from: c */
    public static final Pattern f44177c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final Pattern f44178d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final C4361f0 f44179a = new C4361f0();

    /* renamed from: b */
    public final StringBuilder f44180b = new StringBuilder();

    /* renamed from: b */
    public static boolean m40712b(C4361f0 c4361f0) {
        int m21989e = c4361f0.m21989e();
        int m21990f = c4361f0.m21990f();
        byte[] m21988d = c4361f0.m21988d();
        if (m21989e + 2 > m21990f) {
            return false;
        }
        int i10 = m21989e + 1;
        if (m21988d[m21989e] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (m21988d[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= m21990f) {
                c4361f0.m21984Q(m21990f - c4361f0.m21989e());
                return true;
            }
            if (((char) m21988d[i11]) == '*' && ((char) m21988d[i12]) == '/') {
                i11 = i12 + 1;
                m21990f = i11;
            } else {
                i11 = i12;
            }
        }
    }

    /* renamed from: c */
    public static boolean m40713c(C4361f0 c4361f0) {
        char m40720k = m40720k(c4361f0, c4361f0.m21989e());
        if (m40720k != '\t' && m40720k != '\n' && m40720k != '\f' && m40720k != '\r' && m40720k != ' ') {
            return false;
        }
        c4361f0.m21984Q(1);
        return true;
    }

    /* renamed from: e */
    public static void m40714e(String str, C9683d c9683d) {
        int i10;
        Matcher matcher = f44178d.matcher(C4699b.m23638e(str));
        if (!matcher.matches()) {
            C4392v.m22275i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        i10 = 2;
        String str2 = (String) C4349a.m21882e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                i10 = 3;
            case "em":
                c9683d.m40747t(i10);
                c9683d.m40746s(Float.parseFloat((String) C4349a.m21882e(matcher.group(1))));
                return;
            case "px":
                c9683d.m40747t(1);
                c9683d.m40746s(Float.parseFloat((String) C4349a.m21882e(matcher.group(1))));
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public static String m40715f(C4361f0 c4361f0, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int m21989e = c4361f0.m21989e();
        int m21990f = c4361f0.m21990f();
        while (m21989e < m21990f && !z10) {
            char c10 = (char) c4361f0.m21988d()[m21989e];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                m21989e++;
                sb2.append(c10);
            }
        }
        c4361f0.m21984Q(m21989e - c4361f0.m21989e());
        return sb2.toString();
    }

    /* renamed from: g */
    public static String m40716g(C4361f0 c4361f0, StringBuilder sb2) {
        m40723n(c4361f0);
        if (c4361f0.m21985a() == 0) {
            return null;
        }
        String m40715f = m40715f(c4361f0, sb2);
        if (!"".equals(m40715f)) {
            return m40715f;
        }
        return "" + ((char) c4361f0.m21971D());
    }

    /* renamed from: h */
    public static String m40717h(C4361f0 c4361f0, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int m21989e = c4361f0.m21989e();
            String m40716g = m40716g(c4361f0, sb2);
            if (m40716g == null) {
                return null;
            }
            if ("}".equals(m40716g) || ";".equals(m40716g)) {
                c4361f0.m21983P(m21989e);
                z10 = true;
            } else {
                sb3.append(m40716g);
            }
        }
        return sb3.toString();
    }

    /* renamed from: i */
    public static String m40718i(C4361f0 c4361f0, StringBuilder sb2) {
        m40723n(c4361f0);
        if (c4361f0.m21985a() < 5 || !"::cue".equals(c4361f0.m21968A(5))) {
            return null;
        }
        int m21989e = c4361f0.m21989e();
        String m40716g = m40716g(c4361f0, sb2);
        if (m40716g == null) {
            return null;
        }
        if ("{".equals(m40716g)) {
            c4361f0.m21983P(m21989e);
            return "";
        }
        String m40721l = "(".equals(m40716g) ? m40721l(c4361f0) : null;
        if (")".equals(m40716g(c4361f0, sb2))) {
            return m40721l;
        }
        return null;
    }

    /* renamed from: j */
    public static void m40719j(C4361f0 c4361f0, C9683d c9683d, StringBuilder sb2) {
        m40723n(c4361f0);
        String m40715f = m40715f(c4361f0, sb2);
        if (!"".equals(m40715f) && ":".equals(m40716g(c4361f0, sb2))) {
            m40723n(c4361f0);
            String m40717h = m40717h(c4361f0, sb2);
            if (m40717h == null || "".equals(m40717h)) {
                return;
            }
            int m21989e = c4361f0.m21989e();
            String m40716g = m40716g(c4361f0, sb2);
            if (!";".equals(m40716g)) {
                if (!"}".equals(m40716g)) {
                    return;
                } else {
                    c4361f0.m21983P(m21989e);
                }
            }
            if ("color".equals(m40715f)) {
                c9683d.m40744q(C4358e.m21941b(m40717h));
                return;
            }
            if ("background-color".equals(m40715f)) {
                c9683d.m40741n(C4358e.m21941b(m40717h));
                return;
            }
            if ("ruby-position".equals(m40715f)) {
                if ("over".equals(m40717h)) {
                    c9683d.m40749v(1);
                    return;
                } else {
                    if ("under".equals(m40717h)) {
                        c9683d.m40749v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(m40715f)) {
                boolean z10 = true;
                if (!"all".equals(m40717h)) {
                    z10 = m40717h.startsWith("digits");
                }
                c9683d.m40743p(z10);
                return;
            }
            if ("text-decoration".equals(m40715f)) {
                if ("underline".equals(m40717h)) {
                    c9683d.m40727A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(m40715f)) {
                c9683d.m40745r(m40717h);
                return;
            }
            if ("font-weight".equals(m40715f)) {
                if ("bold".equals(m40717h)) {
                    c9683d.m40742o(true);
                }
            } else if ("font-style".equals(m40715f)) {
                if ("italic".equals(m40717h)) {
                    c9683d.m40748u(true);
                }
            } else if ("font-size".equals(m40715f)) {
                m40714e(m40717h, c9683d);
            }
        }
    }

    /* renamed from: k */
    public static char m40720k(C4361f0 c4361f0, int i10) {
        return (char) c4361f0.m21988d()[i10];
    }

    /* renamed from: l */
    public static String m40721l(C4361f0 c4361f0) {
        int m21989e = c4361f0.m21989e();
        int m21990f = c4361f0.m21990f();
        boolean z10 = false;
        while (m21989e < m21990f && !z10) {
            z10 = ((char) c4361f0.m21988d()[m21989e]) == ')';
            m21989e++;
        }
        return c4361f0.m21968A((m21989e - 1) - c4361f0.m21989e()).trim();
    }

    /* renamed from: m */
    public static void m40722m(C4361f0 c4361f0) {
        while (!TextUtils.isEmpty(c4361f0.m22000p())) {
        }
    }

    /* renamed from: n */
    public static void m40723n(C4361f0 c4361f0) {
        while (true) {
            boolean z10 = true;
            while (true) {
                boolean z11 = z10;
                if (c4361f0.m21985a() <= 0 || !z11) {
                    return;
                }
                if (!m40713c(c4361f0) && !m40712b(c4361f0)) {
                    z10 = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m40724a(C9683d c9683d, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        String str2 = str;
        if (indexOf != -1) {
            Matcher matcher = f44177c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c9683d.m40753z((String) C4349a.m21882e(matcher.group(1)));
            }
            str2 = str.substring(0, indexOf);
        }
        String[] m22356V0 = C4401z0.m22356V0(str2, "\\.");
        String str3 = m22356V0[0];
        int indexOf2 = str3.indexOf(35);
        if (indexOf2 != -1) {
            c9683d.m40752y(str3.substring(0, indexOf2));
            c9683d.m40751x(str3.substring(indexOf2 + 1));
        } else {
            c9683d.m40752y(str3);
        }
        if (m22356V0.length > 1) {
            c9683d.m40750w((String[]) C4401z0.m22330I0(m22356V0, 1, m22356V0.length));
        }
    }

    /* renamed from: d */
    public List<C9683d> m40725d(C4361f0 c4361f0) {
        this.f44180b.setLength(0);
        int m21989e = c4361f0.m21989e();
        m40722m(c4361f0);
        this.f44179a.m21981N(c4361f0.m21988d(), c4361f0.m21989e());
        this.f44179a.m21983P(m21989e);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String m40718i = m40718i(this.f44179a, this.f44180b);
            if (m40718i != null && "{".equals(m40716g(this.f44179a, this.f44180b))) {
                C9683d c9683d = new C9683d();
                m40724a(c9683d, m40718i);
                String str = null;
                boolean z10 = false;
                while (!z10) {
                    int m21989e2 = this.f44179a.m21989e();
                    str = m40716g(this.f44179a, this.f44180b);
                    z10 = str == null || "}".equals(str);
                    if (!z10) {
                        this.f44179a.m21983P(m21989e2);
                        m40719j(this.f44179a, c9683d, this.f44180b);
                    }
                }
                if ("}".equals(str)) {
                    arrayList.add(c9683d);
                }
            }
            return arrayList;
        }
    }
}
