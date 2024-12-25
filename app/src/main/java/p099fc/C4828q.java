package p099fc;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/q.class
 */
/* renamed from: fc.q */
/* loaded from: combined.jar:classes2.jar:fc/q.class */
public final class C4828q {
    /* renamed from: a */
    public static int m24523a(int i10, double d10) {
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d10 * highestOneBit))) {
            return highestOneBit;
        }
        int i11 = highestOneBit << 1;
        if (i11 <= 0) {
            i11 = 1073741824;
        }
        return i11;
    }

    /* renamed from: b */
    public static int m24524b(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    /* renamed from: c */
    public static int m24525c(@NullableDecl Object obj) {
        return m24524b(obj == null ? 0 : obj.hashCode());
    }
}
