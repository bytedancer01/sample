package p164j8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j8/x.class
 */
/* renamed from: j8.x */
/* loaded from: combined.jar:classes2.jar:j8/x.class */
public final class C5338x {

    /* renamed from: c */
    public static final C5338x f30609c = new C5338x(0, -9223372036854775807L);

    /* renamed from: d */
    public static final Pattern f30610d = Pattern.compile("npt=([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a */
    public final long f30611a;

    /* renamed from: b */
    public final long f30612b;

    public C5338x(long j10, long j11) {
        this.f30611a = j10;
        this.f30612b = j11;
    }

    /* renamed from: b */
    public static String m26588b(long j10) {
        return C4401z0.m22321E("npt=%.3f-", Double.valueOf(j10 / 1000.0d));
    }

    /* renamed from: d */
    public static C5338x m26589d(String str) {
        long parseFloat;
        Matcher matcher = f30610d.matcher(str);
        C4349a.m21878a(matcher.matches());
        boolean z10 = true;
        String str2 = (String) C4349a.m21882e(matcher.group(1));
        long parseFloat2 = str2.equals("now") ? 0L : (long) (Float.parseFloat(str2) * 1000.0f);
        String group = matcher.group(2);
        if (group != null) {
            try {
                parseFloat = (long) (Float.parseFloat(group) * 1000.0f);
                if (parseFloat <= parseFloat2) {
                    z10 = false;
                }
                C4349a.m21878a(z10);
            } catch (NumberFormatException e10) {
                throw C7594k1.m32824c(group, e10);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new C5338x(parseFloat2, parseFloat);
    }

    /* renamed from: a */
    public long m26590a() {
        return this.f30612b - this.f30611a;
    }

    /* renamed from: c */
    public boolean m26591c() {
        return this.f30612b == -9223372036854775807L;
    }
}
