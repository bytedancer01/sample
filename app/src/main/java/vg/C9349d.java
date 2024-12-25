package vg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/d.class
 */
/* renamed from: vg.d */
/* loaded from: combined.jar:classes2.jar:vg/d.class */
public final class C9349d {
    /* renamed from: a */
    public static int m39398a(String str, int i10) {
        long parseLong;
        try {
            parseLong = Long.parseLong(str);
        } catch (NumberFormatException e10) {
        }
        if (parseLong > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (parseLong < 0) {
            return 0;
        }
        i10 = (int) parseLong;
        return i10;
    }

    /* renamed from: b */
    public static int m39399b(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    /* renamed from: c */
    public static int m39400c(String str, int i10) {
        char charAt;
        while (i10 < str.length() && ((charAt = str.charAt(i10)) == ' ' || charAt == '\t')) {
            i10++;
        }
        return i10;
    }
}
