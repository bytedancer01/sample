package p059d9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/i0.class
 */
/* renamed from: d9.i0 */
/* loaded from: combined.jar:classes2.jar:d9/i0.class */
public final class C4367i0 {
    /* renamed from: a */
    public static int m22041a(int i10, int i11) {
        for (int i12 = 1; i12 <= 2; i12++) {
            int i13 = (i10 + i12) % 3;
            if (m22042b(i13, i11)) {
                return i13;
            }
        }
        return i10;
    }

    /* renamed from: b */
    public static boolean m22042b(int i10, int i11) {
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                return (i11 & 2) != 0;
            }
            z10 = (i11 & 1) != 0;
        }
        return z10;
    }
}
