package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/v1.class
 */
/* renamed from: ma.v1 */
/* loaded from: combined.jar:classes2.jar:ma/v1.class */
public final class C6447v1 {
    /* renamed from: a */
    public static String m30075a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (m30076b(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (m30076b(c10)) {
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

    /* renamed from: b */
    public static boolean m30076b(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }
}
