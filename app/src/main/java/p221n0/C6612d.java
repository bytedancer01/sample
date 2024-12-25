package p221n0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n0/d.class
 */
/* renamed from: n0.d */
/* loaded from: combined.jar:classes1.jar:n0/d.class */
public class C6612d<F, S> {

    /* renamed from: a */
    public final F f34521a;

    /* renamed from: b */
    public final S f34522b;

    public C6612d(F f10, S s10) {
        this.f34521a = f10;
        this.f34522b = s10;
    }

    /* renamed from: a */
    public static <A, B> C6612d<A, B> m30519a(A a10, B b10) {
        return new C6612d<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6612d)) {
            return false;
        }
        C6612d c6612d = (C6612d) obj;
        boolean z10 = false;
        if (C6611c.m30516a(c6612d.f34521a, this.f34521a)) {
            z10 = false;
            if (C6611c.m30516a(c6612d.f34522b, this.f34522b)) {
                z10 = true;
            }
        }
        return z10;
    }

    public int hashCode() {
        F f10 = this.f34521a;
        int i10 = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f34522b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.f34521a + " " + this.f34522b + "}";
    }
}
