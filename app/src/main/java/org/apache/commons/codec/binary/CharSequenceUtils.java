package org.apache.commons.codec.binary;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/binary/CharSequenceUtils.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/binary/CharSequenceUtils.class */
public class CharSequenceUtils {
    public static boolean regionMatches(CharSequence charSequence, boolean z10, int i10, CharSequence charSequence2, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        if (charSequence instanceof String) {
            i13 = i10;
            i14 = i11;
            i15 = i12;
            if (charSequence2 instanceof String) {
                return ((String) charSequence).regionMatches(z10, i10, (String) charSequence2, i11, i12);
            }
        }
        while (i15 > 0) {
            char charAt = charSequence.charAt(i13);
            char charAt2 = charSequence2.charAt(i14);
            if (charAt != charAt2) {
                if (!z10) {
                    return false;
                }
                if (Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                    return false;
                }
            }
            i13++;
            i15--;
            i14++;
        }
        return true;
    }
}
