package org.jsoup.helper;

/* loaded from: combined.jar:classes3.jar:org/jsoup/helper/Validate.class */
public final class Validate {
    private Validate() {
    }

    public static void fail(String str) {
        throw new IllegalArgumentException(str);
    }

    public static void isFalse(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    public static void isFalse(boolean z10, String str) {
        if (z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void isTrue(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    public static void isTrue(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void noNullElements(Object[] objArr) {
        noNullElements(objArr, "Array must not contain any null objects");
    }

    public static void noNullElements(Object[] objArr, String str) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public static void notEmpty(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    public static void notEmpty(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void notNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    public static void notNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
