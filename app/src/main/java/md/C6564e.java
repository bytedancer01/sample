package md;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/e.class
 */
/* renamed from: md.e */
/* loaded from: combined.jar:classes2.jar:md/e.class */
public final class C6564e {

    /* renamed from: a */
    public static final int f34365a = m30307a();

    /* renamed from: a */
    public static int m30307a() {
        return m30310d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    public static int m30308b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb2.append(charAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException e10) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m30309c() {
        return f34365a;
    }

    /* renamed from: d */
    public static int m30310d(String str) {
        int m30312f = m30312f(str);
        int i10 = m30312f;
        if (m30312f == -1) {
            i10 = m30308b(str);
        }
        if (i10 == -1) {
            return 6;
        }
        return i10;
    }

    /* renamed from: e */
    public static boolean m30311e() {
        return f34365a >= 9;
    }

    /* renamed from: f */
    public static int m30312f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException e10) {
            return -1;
        }
    }
}
