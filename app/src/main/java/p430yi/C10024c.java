package p430yi;

import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p411xi.C9781y;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yi/c.class
 */
/* renamed from: yi.c */
/* loaded from: combined.jar:classes2.jar:yi/c.class */
public final class C10024c {
    /* renamed from: a */
    public static final int m42176a(@NotNull int[] iArr, int i10, int i11, int i12) {
        C9367f.m39526e(iArr, "$this$binarySearch");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    /* renamed from: b */
    public static final int m42177b(@NotNull C9781y c9781y, int i10) {
        C9367f.m39526e(c9781y, "$this$segment");
        int m42176a = m42176a(c9781y.m41276F(), i10 + 1, 0, c9781y.m41277G().length);
        if (m42176a < 0) {
            m42176a ^= -1;
        }
        return m42176a;
    }
}
