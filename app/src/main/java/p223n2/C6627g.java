package p223n2;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n2/g.class
 */
/* renamed from: n2.g */
/* loaded from: combined.jar:classes1.jar:n2/g.class */
public class C6627g {

    /* renamed from: a */
    public final String f34550a;

    /* renamed from: b */
    public final int f34551b;

    public C6627g(String str, int i10) {
        this.f34550a = str;
        this.f34551b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6627g)) {
            return false;
        }
        C6627g c6627g = (C6627g) obj;
        if (this.f34551b != c6627g.f34551b) {
            return false;
        }
        return this.f34550a.equals(c6627g.f34550a);
    }

    public int hashCode() {
        return (this.f34550a.hashCode() * 31) + this.f34551b;
    }
}
