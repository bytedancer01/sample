package p430yi;

import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.C9764h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yi/b.class
 */
/* renamed from: yi.b */
/* loaded from: combined.jar:classes2.jar:yi/b.class */
public final class C10023b {

    /* renamed from: a */
    @NotNull
    public static final char[] f45977a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code restructure failed: missing block: B:337:0x000b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x000b, code lost:
    
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m42172c(byte[] r4, int r5) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p430yi.C10023b.m42172c(byte[], int):int");
    }

    /* renamed from: d */
    public static final void m42173d(@NotNull C9764h c9764h, @NotNull C9761e c9761e, int i10, int i11) {
        C9367f.m39526e(c9764h, "$this$commonWrite");
        C9367f.m39526e(c9761e, "buffer");
        c9761e.write(c9764h.m41194j(), i10, i11);
    }

    /* renamed from: e */
    public static final int m42174e(char c10) {
        int i10;
        if ('0' <= c10 && '9' >= c10) {
            i10 = c10 - '0';
        } else {
            char c11 = 'a';
            if ('a' > c10 || 'f' < c10) {
                c11 = 'A';
                if ('A' > c10 || 'F' < c10) {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c10);
                }
            }
            i10 = (c10 - c11) + 10;
        }
        return i10;
    }

    @NotNull
    /* renamed from: f */
    public static final char[] m42175f() {
        return f45977a;
    }
}
