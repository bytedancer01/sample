package p378w4;

import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w4/e.class
 */
/* renamed from: w4.e */
/* loaded from: combined.jar:classes1.jar:w4/e.class */
public class C9411e implements Serializable {

    /* renamed from: d */
    public static final C9411e f43167d;

    /* renamed from: b */
    public final EnumC9410d f43168b;

    /* renamed from: c */
    public final EnumC9410d f43169c;

    static {
        EnumC9410d enumC9410d = EnumC9410d.USE_DEFAULTS;
        f43167d = new C9411e(enumC9410d, enumC9410d);
    }

    public C9411e(EnumC9410d enumC9410d, EnumC9410d enumC9410d2) {
        this.f43168b = enumC9410d == null ? EnumC9410d.USE_DEFAULTS : enumC9410d;
        this.f43169c = enumC9410d2 == null ? EnumC9410d.USE_DEFAULTS : enumC9410d2;
    }

    /* renamed from: a */
    public static C9411e m39768a() {
        return f43167d;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C9411e c9411e = (C9411e) obj;
        if (c9411e.f43168b != this.f43168b || c9411e.f43169c != this.f43169c) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return (this.f43168b.hashCode() << 2) + this.f43169c.hashCode();
    }

    public String toString() {
        return String.format("[value=%s,content=%s]", this.f43168b, this.f43169c);
    }
}
