package p072e3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e3/d.class
 */
/* renamed from: e3.d */
/* loaded from: combined.jar:classes1.jar:e3/d.class */
public final class C4598d {

    /* renamed from: b */
    public static final Pattern f27247b = Pattern.compile("ApolloCacheReference\\{(.*)\\}");

    /* renamed from: a */
    public final String f27248a;

    public C4598d(String str) {
        this.f27248a = str;
    }

    /* renamed from: a */
    public static boolean m23182a(String str) {
        return f27247b.matcher(str).matches();
    }

    /* renamed from: b */
    public static C4598d m23183b(String str) {
        Matcher matcher = f27247b.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return new C4598d(matcher.group(1));
        }
        throw new IllegalArgumentException("Not a cache reference: " + str + " Must be of the form:ApolloCacheReference{%s}");
    }

    /* renamed from: c */
    public String m23184c() {
        return this.f27248a;
    }

    /* renamed from: d */
    public String m23185d() {
        return String.format("ApolloCacheReference{%s}", this.f27248a);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4598d.class != obj.getClass()) {
            return false;
        }
        String str = this.f27248a;
        String str2 = ((C4598d) obj).f27248a;
        if (str != null) {
            z10 = str.equals(str2);
        } else if (str2 != null) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        String str = this.f27248a;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        return this.f27248a;
    }
}
