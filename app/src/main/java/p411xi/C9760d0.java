package p411xi;

import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/d0.class
 */
/* renamed from: xi.d0 */
/* loaded from: combined.jar:classes2.jar:xi/d0.class */
public final class C9760d0 {
    /* renamed from: a */
    public static final long m41115a(@NotNull String str, int i10, int i11) {
        long j10;
        long j11;
        int i12;
        C9367f.m39526e(str, "$this$utf8Size");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        long j12 = 0;
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                j10 = j12;
                j11 = 1;
            } else {
                if (charAt < 2048) {
                    i12 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i12 = 3;
                } else {
                    int i13 = i10 + 1;
                    char charAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j12++;
                        i10 = i13;
                    } else {
                        j12 += 4;
                        i10 += 2;
                    }
                }
                j10 = j12;
                j11 = i12;
            }
            j12 = j10 + j11;
            i10++;
        }
        return j12;
    }

    /* renamed from: b */
    public static /* synthetic */ long m41116b(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m41115a(str, i10, i11);
    }
}
