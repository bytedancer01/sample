package md;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/j.class
 */
/* renamed from: md.j */
/* loaded from: combined.jar:classes2.jar:md/j.class */
public class C6569j {
    /* renamed from: a */
    public static String m30329a(int i10) {
        if (i10 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i10 == 1) {
            return "MMMM d, yyyy";
        }
        if (i10 == 2) {
            return "MMM d, yyyy";
        }
        if (i10 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i10);
    }

    /* renamed from: b */
    public static String m30330b(int i10) {
        if (i10 == 0 || i10 == 1) {
            return "h:mm:ss a z";
        }
        if (i10 == 2) {
            return "h:mm:ss a";
        }
        if (i10 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i10);
    }

    /* renamed from: c */
    public static DateFormat m30331c(int i10, int i11) {
        return new SimpleDateFormat(m30329a(i10) + " " + m30330b(i11), Locale.US);
    }
}
