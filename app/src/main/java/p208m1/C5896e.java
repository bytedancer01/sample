package p208m1;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/e.class
 */
/* renamed from: m1.e */
/* loaded from: combined.jar:classes1.jar:m1/e.class */
public final class C5896e {

    /* renamed from: a */
    public final Bundle f33042a;

    /* renamed from: b */
    public C5900i f33043b;

    public C5896e(C5900i c5900i, boolean z10) {
        if (c5900i == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f33042a = bundle;
        this.f33043b = c5900i;
        bundle.putBundle("selector", c5900i.m28853a());
        bundle.putBoolean("activeScan", z10);
    }

    /* renamed from: a */
    public Bundle m28806a() {
        return this.f33042a;
    }

    /* renamed from: b */
    public final void m28807b() {
        if (this.f33043b == null) {
            C5900i m28852d = C5900i.m28852d(this.f33042a.getBundle("selector"));
            this.f33043b = m28852d;
            if (m28852d == null) {
                this.f33043b = C5900i.f33081c;
            }
        }
    }

    /* renamed from: c */
    public C5900i m28808c() {
        m28807b();
        return this.f33043b;
    }

    /* renamed from: d */
    public boolean m28809d() {
        return this.f33042a.getBoolean("activeScan");
    }

    /* renamed from: e */
    public boolean m28810e() {
        m28807b();
        return this.f33043b.m28858g();
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C5896e) {
            C5896e c5896e = (C5896e) obj;
            z10 = false;
            if (m28808c().equals(c5896e.m28808c())) {
                z10 = false;
                if (m28809d() == c5896e.m28809d()) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public int hashCode() {
        return m28808c().hashCode() ^ m28809d();
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + m28808c() + ", activeScan=" + m28809d() + ", isValid=" + m28810e() + " }";
    }
}
