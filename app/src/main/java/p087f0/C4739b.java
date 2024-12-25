package p087f0;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/b.class
 */
/* renamed from: f0.b */
/* loaded from: combined.jar:classes1.jar:f0/b.class */
public final class C4739b {

    /* renamed from: e */
    public static final C4739b f27966e = new C4739b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f27967a;

    /* renamed from: b */
    public final int f27968b;

    /* renamed from: c */
    public final int f27969c;

    /* renamed from: d */
    public final int f27970d;

    public C4739b(int i10, int i11, int i12, int i13) {
        this.f27967a = i10;
        this.f27968b = i11;
        this.f27969c = i12;
        this.f27970d = i13;
    }

    /* renamed from: a */
    public static C4739b m23975a(C4739b c4739b, C4739b c4739b2) {
        return m23976b(Math.max(c4739b.f27967a, c4739b2.f27967a), Math.max(c4739b.f27968b, c4739b2.f27968b), Math.max(c4739b.f27969c, c4739b2.f27969c), Math.max(c4739b.f27970d, c4739b2.f27970d));
    }

    /* renamed from: b */
    public static C4739b m23976b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f27966e : new C4739b(i10, i11, i12, i13);
    }

    /* renamed from: c */
    public static C4739b m23977c(Rect rect) {
        return m23976b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C4739b m23978d(Insets insets) {
        return m23976b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m23979e() {
        return Insets.m758of(this.f27967a, this.f27968b, this.f27969c, this.f27970d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4739b.class != obj.getClass()) {
            return false;
        }
        C4739b c4739b = (C4739b) obj;
        return this.f27970d == c4739b.f27970d && this.f27967a == c4739b.f27967a && this.f27969c == c4739b.f27969c && this.f27968b == c4739b.f27968b;
    }

    public int hashCode() {
        return (((((this.f27967a * 31) + this.f27968b) * 31) + this.f27969c) * 31) + this.f27970d;
    }

    public String toString() {
        return "Insets{left=" + this.f27967a + ", top=" + this.f27968b + ", right=" + this.f27969c + ", bottom=" + this.f27970d + '}';
    }
}
