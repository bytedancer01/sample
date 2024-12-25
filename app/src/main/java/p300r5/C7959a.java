package p300r5;

import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r5/a.class
 */
/* renamed from: r5.a */
/* loaded from: combined.jar:classes1.jar:r5/a.class */
public final class C7959a implements Comparable<C7959a>, Serializable {

    /* renamed from: b */
    public String f38414b;

    /* renamed from: c */
    public Class<?> f38415c;

    /* renamed from: d */
    public int f38416d;

    public C7959a() {
        this.f38415c = null;
        this.f38414b = null;
        this.f38416d = 0;
    }

    public C7959a(Class<?> cls) {
        this.f38415c = cls;
        String name = cls.getName();
        this.f38414b = name;
        this.f38416d = name.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7959a c7959a) {
        return this.f38414b.compareTo(c7959a.f38414b);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C7959a.class) {
            return false;
        }
        if (((C7959a) obj).f38415c != this.f38415c) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return this.f38416d;
    }

    public String toString() {
        return this.f38414b;
    }
}
