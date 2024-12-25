package p437z5;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z5/b.class
 */
/* renamed from: z5.b */
/* loaded from: combined.jar:classes1.jar:z5/b.class */
public final class C10054b {

    /* renamed from: a */
    public final String f46130a;

    public C10054b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f46130a = str;
    }

    /* renamed from: b */
    public static C10054b m42268b(String str) {
        return new C10054b(str);
    }

    /* renamed from: a */
    public String m42269a() {
        return this.f46130a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10054b) {
            return this.f46130a.equals(((C10054b) obj).f46130a);
        }
        return false;
    }

    public int hashCode() {
        return this.f46130a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f46130a + "\"}";
    }
}
