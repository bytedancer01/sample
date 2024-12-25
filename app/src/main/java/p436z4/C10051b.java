package p436z4;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z4/b.class
 */
/* renamed from: z4.b */
/* loaded from: combined.jar:classes1.jar:z4/b.class */
public final class C10051b {

    /* renamed from: a */
    public static final String f46124a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* renamed from: b */
    public static final String f46125b = String.valueOf(Long.MAX_VALUE);

    /* renamed from: a */
    public static boolean m42264a(String str, boolean z10) {
        String str2 = z10 ? f46124a : f46125b;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            int charAt = str.charAt(i10) - str2.charAt(i10);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }
}
