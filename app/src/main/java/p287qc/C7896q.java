package p287qc;

import com.amazonaws.mobile.client.AWSMobileClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/q.class
 */
/* renamed from: qc.q */
/* loaded from: combined.jar:classes2.jar:qc/q.class */
public final class C7896q {

    /* renamed from: a */
    public final Class<?> f38015a;

    /* renamed from: b */
    public final int f38016b;

    /* renamed from: c */
    public final int f38017c;

    public C7896q(Class<?> cls, int i10, int i11) {
        this.f38015a = (Class) C7881c0.m34164c(cls, "Null dependency anInterface.");
        this.f38016b = i10;
        this.f38017c = i11;
    }

    /* renamed from: a */
    public static String m34232a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return AWSMobileClient.PROVIDER_KEY;
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    /* renamed from: g */
    public static C7896q m34233g(Class<?> cls) {
        return new C7896q(cls, 0, 0);
    }

    /* renamed from: h */
    public static C7896q m34234h(Class<?> cls) {
        return new C7896q(cls, 0, 1);
    }

    /* renamed from: i */
    public static C7896q m34235i(Class<?> cls) {
        return new C7896q(cls, 1, 0);
    }

    /* renamed from: j */
    public static C7896q m34236j(Class<?> cls) {
        return new C7896q(cls, 2, 0);
    }

    /* renamed from: b */
    public Class<?> m34237b() {
        return this.f38015a;
    }

    /* renamed from: c */
    public boolean m34238c() {
        return this.f38017c == 2;
    }

    /* renamed from: d */
    public boolean m34239d() {
        return this.f38017c == 0;
    }

    /* renamed from: e */
    public boolean m34240e() {
        boolean z10 = true;
        if (this.f38016b != 1) {
            z10 = false;
        }
        return z10;
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C7896q) {
            C7896q c7896q = (C7896q) obj;
            z10 = false;
            if (this.f38015a == c7896q.f38015a) {
                z10 = false;
                if (this.f38016b == c7896q.f38016b) {
                    z10 = false;
                    if (this.f38017c == c7896q.f38017c) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: f */
    public boolean m34241f() {
        return this.f38016b == 2;
    }

    public int hashCode() {
        return ((((this.f38015a.hashCode() ^ 1000003) * 1000003) ^ this.f38016b) * 1000003) ^ this.f38017c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f38015a);
        sb2.append(", type=");
        int i10 = this.f38016b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(m34232a(this.f38017c));
        sb2.append("}");
        return sb2.toString();
    }
}
