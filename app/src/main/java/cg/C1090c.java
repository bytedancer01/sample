package cg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/c.class
 */
/* renamed from: cg.c */
/* loaded from: combined.jar:classes2.jar:cg/c.class */
public final class C1090c {
    /* renamed from: a */
    public static boolean m6511a(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    /* renamed from: b */
    public static String m6512b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (m6511a(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (m6511a(c10)) {
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
