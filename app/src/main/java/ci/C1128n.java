package ci;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p372vh.C9374m;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/n.class
 */
/* renamed from: ci.n */
/* loaded from: combined.jar:classes2.jar:ci/n.class */
public class C1128n extends C1127m {
    /* renamed from: j */
    public static final boolean m6717j(@NotNull String str, @NotNull String str2, boolean z10) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "suffix");
        return !z10 ? str.endsWith(str2) : m6722o(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m6718k(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m6717j(str, str2, z10);
    }

    /* renamed from: l */
    public static final boolean m6719l(@Nullable String str, @Nullable String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    @NotNull
    /* renamed from: m */
    public static final Comparator<String> m6720m(@NotNull C9374m c9374m) {
        C9367f.m39526e(c9374m, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C9367f.m39525d(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        if (r4 != false) goto L17;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m6721n(@org.jetbrains.annotations.NotNull java.lang.CharSequence r3) {
        /*
            r0 = r3
            java.lang.String r1 = "<this>"
            p372vh.C9367f.m39526e(r0, r1)
            r0 = r3
            int r0 = r0.length()
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L59
            r0 = r3
            zh.c r0 = ci.C1129o.m6740H(r0)
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof java.util.Collection
            if (r0 == 0) goto L30
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L30
        L2b:
            r0 = 1
            r4 = r0
            goto L55
        L30:
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L37:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2b
            r0 = r3
            r1 = r6
            kh.w r1 = (kh.AbstractC5629w) r1
            int r1 = r1.nextInt()
            char r0 = r0.charAt(r1)
            boolean r0 = ci.C1115a.m6693c(r0)
            if (r0 != 0) goto L37
            r0 = 0
            r4 = r0
        L55:
            r0 = r4
            if (r0 == 0) goto L5b
        L59:
            r0 = 1
            r5 = r0
        L5b:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.C1128n.m6721n(java.lang.CharSequence):boolean");
    }

    /* renamed from: o */
    public static final boolean m6722o(@NotNull String str, int i10, @NotNull String str2, int i11, int i12, boolean z10) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m6723p(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return m6722o(str, i10, str2, i11, i12, z10);
    }

    @NotNull
    /* renamed from: q */
    public static final String m6724q(@NotNull CharSequence charSequence, int i10) {
        C9367f.m39526e(charSequence, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        String str = "";
        if (i10 != 0) {
            if (i10 != 1) {
                int length = charSequence.length();
                str = "";
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                        if (1 <= i10) {
                            int i11 = 1;
                            while (true) {
                                sb2.append(charSequence);
                                if (i11 == i10) {
                                    break;
                                }
                                i11++;
                            }
                        }
                        str = sb2.toString();
                        C9367f.m39525d(str, "{\n                    va…tring()\n                }");
                    } else {
                        char charAt = charSequence.charAt(0);
                        char[] cArr = new char[i10];
                        for (int i12 = 0; i12 < i10; i12++) {
                            cArr[i12] = charAt;
                        }
                        str = new String(cArr);
                    }
                }
            } else {
                str = charSequence.toString();
            }
        }
        return str;
    }

    @NotNull
    /* renamed from: r */
    public static final String m6725r(@NotNull String str, char c10, char c11, boolean z10) {
        String sb2;
        String str2;
        C9367f.m39526e(str, "<this>");
        if (z10) {
            StringBuilder sb3 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                char c12 = charAt;
                if (C1116b.m6694d(charAt, c10, z10)) {
                    c12 = c11;
                }
                sb3.append(c12);
            }
            sb2 = sb3.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        } else {
            sb2 = str.replace(c10, c11);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        }
        C9367f.m39525d(sb2, str2);
        return sb2;
    }

    @NotNull
    /* renamed from: s */
    public static final String m6726s(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z10) {
        int i10;
        int m6743K;
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "oldValue");
        C9367f.m39526e(str3, "newValue");
        int i11 = 0;
        int m6743K2 = C1129o.m6743K(str, str2, 0, z10);
        if (m6743K2 < 0) {
            return str;
        }
        int length = str2.length();
        int m42834b = C10240e.m42834b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i11, m6743K2);
            sb2.append(str3);
            i10 = m6743K2 + length;
            if (m6743K2 >= str.length()) {
                break;
            }
            m6743K = C1129o.m6743K(str, str2, m6743K2 + m42834b, z10);
            i11 = i10;
            m6743K2 = m6743K;
        } while (m6743K > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        C9367f.m39525d(sb3, "stringBuilder.append(this, i, length).toString()");
        return sb3;
    }

    /* renamed from: t */
    public static /* synthetic */ String m6727t(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m6725r(str, c10, c11, z10);
    }

    /* renamed from: u */
    public static /* synthetic */ String m6728u(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m6726s(str, str2, str3, z10);
    }

    /* renamed from: v */
    public static final boolean m6729v(@NotNull String str, @NotNull String str2, int i10, boolean z10) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "prefix");
        return !z10 ? str.startsWith(str2, i10) : m6722o(str, i10, str2, 0, str2.length(), z10);
    }

    /* renamed from: w */
    public static final boolean m6730w(@NotNull String str, @NotNull String str2, boolean z10) {
        C9367f.m39526e(str, "<this>");
        C9367f.m39526e(str2, "prefix");
        return !z10 ? str.startsWith(str2) : m6722o(str, 0, str2, 0, str2.length(), z10);
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m6731x(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m6729v(str, str2, i10, z10);
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m6732y(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m6730w(str, str2, z10);
    }
}
