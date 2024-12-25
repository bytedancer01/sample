package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/SoundexUtils.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/SoundexUtils.class */
final class SoundexUtils {
    public static String clean(String str) {
        int i10;
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = i12;
            if (i11 >= length) {
                break;
            }
            int i13 = i10;
            if (Character.isLetter(str.charAt(i11))) {
                cArr[i10] = str.charAt(i11);
                i13 = i10 + 1;
            }
            i11++;
            i12 = i13;
        }
        if (i10 != length) {
            str = new String(cArr, 0, i10);
        }
        return str.toUpperCase(Locale.ENGLISH);
    }

    public static int difference(StringEncoder stringEncoder, String str, String str2) {
        return differenceEncoded(stringEncoder.encode(str), stringEncoder.encode(str2));
    }

    public static int differenceEncoded(String str, String str2) {
        int i10 = 0;
        if (str == null || str2 == null) {
            return 0;
        }
        int min = Math.min(str.length(), str2.length());
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= min) {
                return i12;
            }
            int i13 = i12;
            if (str.charAt(i10) == str2.charAt(i10)) {
                i13 = i12 + 1;
            }
            i10++;
            i11 = i13;
        }
    }
}
