package org.apache.http.client.utils;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.util.StringTokenizer;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/utils/Rfc3492Idn.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/utils/Rfc3492Idn.class */
public class Rfc3492Idn implements Idn {
    private static final String ACE_PREFIX = "xn--";
    private static final int base = 36;
    private static final int damp = 700;
    private static final char delimiter = '-';
    private static final int initial_bias = 72;
    private static final int initial_n = 128;
    private static final int skew = 38;
    private static final int tmax = 26;
    private static final int tmin = 1;

    private int adapt(int i10, int i11, boolean z10) {
        int i12 = z10 ? i10 / 700 : i10 / 2;
        int i13 = i12 + (i12 / i11);
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return i14 + ((i13 * 36) / (i13 + 38));
    }

    private int digit(char c10) {
        if (c10 >= 'A' && c10 <= 'Z') {
            return c10 - 'A';
        }
        if (c10 >= 'a' && c10 <= 'z') {
            return c10 - 'a';
        }
        if (c10 >= '0' && c10 <= '9') {
            return (c10 - '0') + 26;
        }
        throw new IllegalArgumentException("illegal digit: " + c10);
    }

    public String decode(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int lastIndexOf = str.lastIndexOf(45);
        int i10 = 128;
        int i11 = 72;
        String str2 = str;
        if (lastIndexOf != -1) {
            sb2.append(str.subSequence(0, lastIndexOf));
            str2 = str.substring(lastIndexOf + 1);
        }
        int i12 = 0;
        String str3 = str2;
        while (!str3.isEmpty()) {
            int i13 = 36;
            int i14 = i12;
            int i15 = 1;
            while (true) {
                if (str3.isEmpty()) {
                    break;
                }
                char charAt = str3.charAt(0);
                str3 = str3.substring(1);
                int digit = digit(charAt);
                int i16 = i14 + (digit * i15);
                int i17 = i13 <= i11 + 1 ? 1 : i13 >= i11 + 26 ? 26 : i13 - i11;
                if (digit < i17) {
                    i14 = i16;
                    break;
                }
                i15 *= 36 - i17;
                i13 += 36;
                i14 = i16;
            }
            i11 = adapt(i14 - i12, sb2.length() + 1, i12 == 0);
            i10 += i14 / (sb2.length() + 1);
            int length = i14 % (sb2.length() + 1);
            sb2.insert(length, (char) i10);
            i12 = length + 1;
        }
        return sb2.toString();
    }

    @Override // org.apache.http.client.utils.Idn
    public String toUnicode(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        StringTokenizer stringTokenizer = new StringTokenizer(str, InstructionFileId.DOT);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (sb2.length() > 0) {
                sb2.append('.');
            }
            String str2 = nextToken;
            if (nextToken.startsWith(ACE_PREFIX)) {
                str2 = decode(nextToken.substring(4));
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }
}
