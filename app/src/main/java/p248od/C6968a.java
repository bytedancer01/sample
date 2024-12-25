package p248od;

import java.util.TimeZone;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:od/a.class
 */
/* renamed from: od.a */
/* loaded from: combined.jar:classes2.jar:od/a.class */
public class C6968a {

    /* renamed from: a */
    public static final TimeZone f35944a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static boolean m31966a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    /* renamed from: b */
    public static int m31967b(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x03b1, code lost:
    
        if (r0.isEmpty() != false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0352 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x0361, IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x0361, NumberFormatException -> 0x0366, NumberFormatException -> 0x0366, IndexOutOfBoundsException -> 0x036b, IndexOutOfBoundsException -> 0x036b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x0361, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0016, B:11:0x002b, B:13:0x0037, B:18:0x004c, B:20:0x0064, B:22:0x006d, B:28:0x009a, B:30:0x00a6, B:35:0x00bb, B:37:0x00c7, B:41:0x00d7, B:43:0x00df, B:51:0x0100, B:57:0x011e, B:61:0x012f, B:68:0x01aa, B:70:0x01b3, B:73:0x01c0, B:74:0x02f7, B:74:0x02f7, B:75:0x02fa, B:81:0x01da, B:82:0x020c, B:84:0x020e, B:88:0x0244, B:90:0x0256, B:93:0x0263, B:95:0x029c, B:98:0x02b0, B:99:0x02ee, B:101:0x02f2, B:102:0x0221, B:103:0x0352, B:103:0x0352, B:104:0x0355, B:105:0x0360), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3 A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x0361, NumberFormatException -> 0x0366, IndexOutOfBoundsException -> 0x036b, TRY_LEAVE, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x0361, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0016, B:11:0x002b, B:13:0x0037, B:18:0x004c, B:20:0x0064, B:22:0x006d, B:28:0x009a, B:30:0x00a6, B:35:0x00bb, B:37:0x00c7, B:41:0x00d7, B:43:0x00df, B:51:0x0100, B:57:0x011e, B:61:0x012f, B:68:0x01aa, B:70:0x01b3, B:73:0x01c0, B:74:0x02f7, B:74:0x02f7, B:75:0x02fa, B:81:0x01da, B:82:0x020c, B:84:0x020e, B:88:0x0244, B:90:0x0256, B:93:0x0263, B:95:0x029c, B:98:0x02b0, B:99:0x02ee, B:101:0x02f2, B:102:0x0221, B:103:0x0352, B:103:0x0352, B:104:0x0355, B:105:0x0360), top: B:1:0x0000 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date m31968c(java.lang.String r5, java.text.ParsePosition r6) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p248od.C6968a.m31968c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: d */
    public static int m31969d(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i12 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i13 = -digit;
        } else {
            i12 = i10;
            i13 = 0;
        }
        while (i12 < i11) {
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i13 = (i13 * 10) - digit2;
            i12++;
        }
        return -i13;
    }
}
