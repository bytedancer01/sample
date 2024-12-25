package org.apache.http.util;

/* loaded from: combined.jar:classes3.jar:org/apache/http/util/Asserts.class */
public class Asserts {
    public static void check(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static void check(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, obj));
        }
    }

    public static void check(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void notBlank(CharSequence charSequence, String str) {
        if (TextUtils.isBlank(charSequence)) {
            throw new IllegalStateException(str + " is blank");
        }
    }

    public static void notEmpty(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalStateException(str + " is empty");
        }
    }

    public static void notNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(str + " is null");
    }
}
