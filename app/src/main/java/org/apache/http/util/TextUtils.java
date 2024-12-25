package org.apache.http.util;

/* loaded from: combined.jar:classes3.jar:org/apache/http/util/TextUtils.class */
public final class TextUtils {
    public static boolean containsBlanks(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (Character.isWhitespace(charSequence.charAt(i10))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBlank(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!Character.isWhitespace(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        boolean z10 = true;
        if (charSequence == null) {
            return true;
        }
        if (charSequence.length() != 0) {
            z10 = false;
        }
        return z10;
    }
}
