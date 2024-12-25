package p397x4;

import org.slf4j.Marker;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x4/b.class
 */
/* renamed from: x4.b */
/* loaded from: combined.jar:classes1.jar:x4/b.class */
public final class C9652b {

    /* renamed from: a */
    public static final C9651a f44038a;

    /* renamed from: b */
    public static final C9651a f44039b;

    /* renamed from: c */
    public static final C9651a f44040c;

    /* renamed from: d */
    public static final C9651a f44041d;

    static {
        C9651a c9651a = new C9651a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f44038a = c9651a;
        f44039b = new C9651a(c9651a, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        f44040c = new C9651a(c9651a, "PEM", true, '=', 64);
        StringBuilder sb2 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb2.setCharAt(sb2.indexOf(Marker.ANY_NON_NULL_MARKER), '-');
        sb2.setCharAt(sb2.indexOf("/"), '_');
        f44041d = new C9651a("MODIFIED-FOR-URL", sb2.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static C9651a m40585a() {
        return f44039b;
    }
}
