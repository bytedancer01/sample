package ec;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ec/b.class
 */
/* renamed from: ec.b */
/* loaded from: combined.jar:classes2.jar:ec/b.class */
public final class C4699b {
    /* renamed from: a */
    public static boolean m23634a(CharSequence charSequence, CharSequence charSequence2) {
        int m23635b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence2.charAt(i10);
            if (charAt != charAt2 && ((m23635b = m23635b(charAt)) >= 26 || m23635b != m23635b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m23635b(char c10) {
        return (char) ((c10 | ' ') - 97);
    }

    /* renamed from: c */
    public static boolean m23636c(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    /* renamed from: d */
    public static boolean m23637d(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    /* renamed from: e */
    public static String m23638e(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (m23637d(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (m23637d(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    /* renamed from: f */
    public static String m23639f(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (m23636c(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (m23636c(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}
