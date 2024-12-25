package p027b9;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/b0.class
 */
/* renamed from: b9.b0 */
/* loaded from: combined.jar:classes2.jar:b9/b0.class */
public final class C0833b0 {

    /* renamed from: a */
    public static final Pattern f5747a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b */
    public static final Pattern f5748b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: a */
    public static String m5305a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append("-");
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0049  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m5306b(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p027b9.C0833b0.m5306b(java.lang.String, java.lang.String):long");
    }

    /* renamed from: c */
    public static long m5307c(String str) {
        long j10 = -1;
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f5748b.matcher(str);
        if (matcher.matches()) {
            j10 = Long.parseLong((String) C4349a.m21882e(matcher.group(1)));
        }
        return j10;
    }
}
