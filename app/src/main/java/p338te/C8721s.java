package p338te;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/s.class
 */
/* renamed from: te.s */
/* loaded from: combined.jar:classes2.jar:te/s.class */
public class C8721s implements Comparable<C8721s> {

    /* renamed from: b */
    public final int f40526b;

    /* renamed from: c */
    public final int f40527c;

    public C8721s(int i10, int i11) {
        this.f40526b = i10;
        this.f40527c = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C8721s c8721s) {
        int i10 = this.f40527c * this.f40526b;
        int i11 = c8721s.f40527c * c8721s.f40526b;
        if (i11 < i10) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    /* renamed from: d */
    public C8721s m37265d() {
        return new C8721s(this.f40527c, this.f40526b);
    }

    /* renamed from: e */
    public C8721s m37266e(C8721s c8721s) {
        int i10 = this.f40526b;
        int i11 = c8721s.f40527c;
        int i12 = c8721s.f40526b;
        int i13 = this.f40527c;
        return i10 * i11 <= i12 * i13 ? new C8721s(i12, (i13 * i12) / i10) : new C8721s((i10 * i11) / i13, i11);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8721s c8721s = (C8721s) obj;
        if (this.f40526b != c8721s.f40526b || this.f40527c != c8721s.f40527c) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: f */
    public C8721s m37267f(C8721s c8721s) {
        int i10 = this.f40526b;
        int i11 = c8721s.f40527c;
        int i12 = c8721s.f40526b;
        int i13 = this.f40527c;
        return i10 * i11 >= i12 * i13 ? new C8721s(i12, (i13 * i12) / i10) : new C8721s((i10 * i11) / i13, i11);
    }

    public int hashCode() {
        return (this.f40526b * 31) + this.f40527c;
    }

    public String toString() {
        return this.f40526b + "x" + this.f40527c;
    }
}
