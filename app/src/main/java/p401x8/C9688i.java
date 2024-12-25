package p401x8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x8/i.class
 */
/* renamed from: x8.i */
/* loaded from: combined.jar:classes2.jar:x8/i.class */
public final class C9688i {

    /* renamed from: a */
    public static final Pattern f44227a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static Matcher m40794a(C4361f0 c4361f0) {
        String m22000p;
        while (true) {
            String m22000p2 = c4361f0.m22000p();
            if (m22000p2 == null) {
                return null;
            }
            if (f44227a.matcher(m22000p2).matches()) {
                do {
                    m22000p = c4361f0.m22000p();
                    if (m22000p != null) {
                    }
                } while (!m22000p.isEmpty());
            } else {
                Matcher matcher = C9685f.f44201a.matcher(m22000p2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m40795b(C4361f0 c4361f0) {
        String m22000p = c4361f0.m22000p();
        return m22000p != null && m22000p.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static float m40796c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: d */
    public static long m40797d(String str) {
        String[] m22358W0 = C4401z0.m22358W0(str, "\\.");
        long j10 = 0;
        for (String str2 : C4401z0.m22356V0(m22358W0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        long j12 = j11;
        if (m22358W0.length == 2) {
            j12 = j11 + Long.parseLong(m22358W0[1]);
        }
        return j12 * 1000;
    }

    /* renamed from: e */
    public static void m40798e(C4361f0 c4361f0) {
        int m21989e = c4361f0.m21989e();
        if (m40795b(c4361f0)) {
            return;
        }
        c4361f0.m21983P(m21989e);
        throw C7594k1.m32822a("Expected WEBVTT. Got " + c4361f0.m22000p(), null);
    }
}
