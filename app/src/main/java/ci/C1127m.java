package ci;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/m.class
 */
/* renamed from: ci.m */
/* loaded from: combined.jar:classes2.jar:ci/m.class */
public class C1127m extends C1126l {
    @Nullable
    /* renamed from: f */
    public static final Integer m6713f(@NotNull String str) {
        C9367f.m39526e(str, "<this>");
        return m6714g(str, 10);
    }

    @Nullable
    /* renamed from: g */
    public static final Integer m6714g(@NotNull String str, int i10) {
        boolean z10;
        C9367f.m39526e(str, "<this>");
        C1115a.m6691a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = -2147483647;
        int i13 = 1;
        if (C9367f.m39528g(charAt, 48) >= 0) {
            z10 = false;
            i13 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i12 = Integer.MIN_VALUE;
                z10 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z10 = false;
            }
        }
        int i14 = -59652323;
        while (true) {
            int i15 = i14;
            if (i13 >= length) {
                return z10 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
            }
            int m6692b = C1115a.m6692b(str.charAt(i13), i10);
            if (m6692b < 0) {
                return null;
            }
            int i16 = i15;
            if (i11 < i15) {
                if (i15 != -59652323) {
                    return null;
                }
                int i17 = i12 / i10;
                i16 = i17;
                if (i11 < i17) {
                    return null;
                }
            }
            int i18 = i11 * i10;
            if (i18 < i12 + m6692b) {
                return null;
            }
            i11 = i18 - m6692b;
            i13++;
            i14 = i16;
        }
    }

    @Nullable
    /* renamed from: h */
    public static final Long m6715h(@NotNull String str) {
        C9367f.m39526e(str, "<this>");
        return m6716i(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Long m6716i(@org.jetbrains.annotations.NotNull java.lang.String r7, int r8) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.C1127m.m6716i(java.lang.String, int):java.lang.Long");
    }
}
