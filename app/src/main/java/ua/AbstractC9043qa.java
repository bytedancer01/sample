package ua;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p305ra.C8315r0;
import p305ra.C8420y0;
import p305ra.EnumC8300q0;
import p305ra.EnumC8405x0;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/qa.class
 */
/* renamed from: ua.qa */
/* loaded from: combined.jar:classes2.jar:ua/qa.class */
public abstract class AbstractC9043qa {

    /* renamed from: a */
    public final String f41582a;

    /* renamed from: b */
    public final int f41583b;

    /* renamed from: c */
    public Boolean f41584c;

    /* renamed from: d */
    public Boolean f41585d;

    /* renamed from: e */
    public Long f41586e;

    /* renamed from: f */
    public Long f41587f;

    public AbstractC9043qa(String str, int i10) {
        this.f41582a = str;
        this.f41583b = i10;
    }

    /* renamed from: d */
    public static Boolean m38199d(String str, EnumC8405x0 enumC8405x0, boolean z10, String str2, List<String> list, String str3, C9128y3 c9128y3) {
        boolean startsWith;
        if (enumC8405x0 == EnumC8405x0.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        String str4 = str;
        if (!z10) {
            str4 = str;
            if (enumC8405x0 != EnumC8405x0.REGEXP) {
                str4 = str.toUpperCase(Locale.ENGLISH);
            }
        }
        EnumC8300q0 enumC8300q0 = EnumC8300q0.UNKNOWN_COMPARISON_TYPE;
        switch (enumC8405x0.ordinal()) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z10 ? 66 : 0).matcher(str4).matches());
                } catch (PatternSyntaxException e10) {
                    if (c9128y3 == null) {
                        return null;
                    }
                    c9128y3.m38411r().m38327b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                startsWith = str4.startsWith(str2);
                break;
            case 3:
                startsWith = str4.endsWith(str2);
                break;
            case 4:
                startsWith = str4.contains(str2);
                break;
            case 5:
                startsWith = str4.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str4);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* renamed from: e */
    public static Boolean m38200e(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* renamed from: f */
    public static Boolean m38201f(String str, C8420y0 c8420y0, C9128y3 c9128y3) {
        List<String> list;
        C9935o.m41850j(c8420y0);
        if (str == null || !c8420y0.m36098z() || c8420y0.m36091A() == EnumC8405x0.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        EnumC8405x0 m36091A = c8420y0.m36091A();
        EnumC8405x0 enumC8405x0 = EnumC8405x0.IN_LIST;
        if (m36091A == enumC8405x0) {
            if (c8420y0.m36097H() == 0) {
                return null;
            }
        } else if (!c8420y0.m36092C()) {
            return null;
        }
        EnumC8405x0 m36091A2 = c8420y0.m36091A();
        boolean m36095F = c8420y0.m36095F();
        String m36093D = (m36095F || m36091A2 == EnumC8405x0.REGEXP || m36091A2 == enumC8405x0) ? c8420y0.m36093D() : c8420y0.m36093D().toUpperCase(Locale.ENGLISH);
        if (c8420y0.m36097H() == 0) {
            list = null;
        } else {
            List<String> m36096G = c8420y0.m36096G();
            list = m36096G;
            if (!m36095F) {
                ArrayList arrayList = new ArrayList(m36096G.size());
                Iterator<String> it = m36096G.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        return m38199d(str, m36091A2, m36095F, m36093D, list, m36091A2 == EnumC8405x0.REGEXP ? m36093D : null, c9128y3);
    }

    /* renamed from: g */
    public static Boolean m38202g(long j10, C8315r0 c8315r0) {
        try {
            return m38205j(new BigDecimal(j10), c8315r0, 0.0d);
        } catch (NumberFormatException e10) {
            return null;
        }
    }

    /* renamed from: h */
    public static Boolean m38203h(double d10, C8315r0 c8315r0) {
        try {
            return m38205j(new BigDecimal(d10), c8315r0, Math.ulp(d10));
        } catch (NumberFormatException e10) {
            return null;
        }
    }

    /* renamed from: i */
    public static Boolean m38204i(String str, C8315r0 c8315r0) {
        if (!C9145z9.m38442B(str)) {
            return null;
        }
        try {
            return m38205j(new BigDecimal(str), c8315r0, 0.0d);
        } catch (NumberFormatException e10) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        if (r16 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011f, code lost:
    
        if (r7.compareTo(r15) != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0178, code lost:
    
        if (r7.compareTo(r8.add(new java.math.BigDecimal(r9).multiply(new java.math.BigDecimal(2)))) == (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0187, code lost:
    
        if (r7.compareTo(r8) == 0) goto L58;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean m38205j(java.math.BigDecimal r7, p305ra.C8315r0 r8, double r9) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.AbstractC9043qa.m38205j(java.math.BigDecimal, ra.r0, double):java.lang.Boolean");
    }

    /* renamed from: a */
    public abstract int mo38185a();

    /* renamed from: b */
    public abstract boolean mo38186b();

    /* renamed from: c */
    public abstract boolean mo38187c();
}
