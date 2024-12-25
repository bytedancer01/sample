package p007a6;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a6/e.class
 */
/* renamed from: a6.e */
/* loaded from: combined.jar:classes1.jar:a6/e.class */
public final class C0077e {
    /* renamed from: a */
    public static String m295a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }
}
