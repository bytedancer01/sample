package p074e5;

import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e5/q.class
 */
/* renamed from: e5.q */
/* loaded from: combined.jar:classes1.jar:e5/q.class */
public class C4640q implements Serializable {

    /* renamed from: d */
    public static final C4640q f27356d = new C4640q("", null);

    /* renamed from: e */
    public static final C4640q f27357e = new C4640q(new String(""), null);

    /* renamed from: b */
    public final String f27358b;

    /* renamed from: c */
    public final String f27359c;

    public C4640q(String str) {
        this(str, null);
    }

    public C4640q(String str, String str2) {
        this.f27358b = str == null ? "" : str;
        this.f27359c = str2;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C4640q c4640q = (C4640q) obj;
        String str = this.f27358b;
        if (str == null) {
            if (c4640q.f27358b != null) {
                return false;
            }
        } else if (!str.equals(c4640q.f27358b)) {
            return false;
        }
        String str2 = this.f27359c;
        String str3 = c4640q.f27359c;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        String str = this.f27359c;
        return str == null ? this.f27358b.hashCode() : str.hashCode() ^ this.f27358b.hashCode();
    }

    public String toString() {
        if (this.f27359c == null) {
            return this.f27358b;
        }
        return "{" + this.f27359c + "}" + this.f27358b;
    }
}
