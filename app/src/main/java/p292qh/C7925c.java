package p292qh;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qh/c.class
 */
/* renamed from: qh.c */
/* loaded from: combined.jar:classes2.jar:qh/c.class */
public final class C7925c {
    /* renamed from: a */
    public static final int m34327a(int i10, int i11, int i12) {
        return m34329c(m34329c(i10, i12) - m34329c(i11, i12), i12);
    }

    /* renamed from: b */
    public static final int m34328b(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                i11 -= m34327a(i11, i10, i12);
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                i11 += m34327a(i10, i11, -i12);
            }
        }
        return i11;
    }

    /* renamed from: c */
    public static final int m34329c(int i10, int i11) {
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        return i12;
    }
}
