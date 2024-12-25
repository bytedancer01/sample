package ci;

import p448zh.C10238c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/a.class
 */
/* renamed from: ci.a */
/* loaded from: combined.jar:classes2.jar:ci/a.class */
public class C1115a {
    /* renamed from: a */
    public static final int m6691a(int i10) {
        boolean z10 = false;
        if (2 <= i10) {
            z10 = false;
            if (i10 < 37) {
                z10 = true;
            }
        }
        if (z10) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C10238c(2, 36));
    }

    /* renamed from: b */
    public static final int m6692b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    /* renamed from: c */
    public static final boolean m6693c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
