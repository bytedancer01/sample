package p059d9;

import android.net.Uri;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/v0.class
 */
/* renamed from: d9.v0 */
/* loaded from: combined.jar:classes2.jar:d9/v0.class */
public final class C4393v0 {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 > r7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r0 > r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r0 > r6) goto L36;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] m22277a(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p059d9.C4393v0.m22277a(java.lang.String):int[]");
    }

    /* renamed from: b */
    public static boolean m22278b(String str) {
        boolean z10 = false;
        if (str != null) {
            z10 = false;
            if (m22277a(str)[0] != -1) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: c */
    public static String m22279c(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        if (i10 >= i11) {
            return sb2.toString();
        }
        int i14 = i10;
        if (sb2.charAt(i10) == '/') {
            i14 = i10 + 1;
        }
        int i15 = i14;
        int i16 = i15;
        while (i15 <= i11) {
            if (i15 == i11) {
                i12 = i15;
            } else if (sb2.charAt(i15) == '/') {
                i12 = i15 + 1;
            } else {
                i15++;
            }
            int i17 = i16 + 1;
            if (i15 == i17 && sb2.charAt(i16) == '.') {
                sb2.delete(i16, i12);
                i11 -= i12 - i16;
            } else {
                if (i15 == i16 + 2 && sb2.charAt(i16) == '.' && sb2.charAt(i17) == '.') {
                    i13 = sb2.lastIndexOf("/", i16 - 2) + 1;
                    int i18 = i13 > i14 ? i13 : i14;
                    sb2.delete(i18, i12);
                    i11 -= i12 - i18;
                } else {
                    i13 = i15 + 1;
                }
                i16 = i13;
            }
            i15 = i16;
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static String m22280d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        String str4 = str2;
        if (str2 == null) {
            str4 = "";
        }
        int[] m22277a = m22277a(str4);
        if (m22277a[0] != -1) {
            sb2.append(str4);
            m22279c(sb2, m22277a[1], m22277a[2]);
            return sb2.toString();
        }
        int[] m22277a2 = m22277a(str3);
        if (m22277a[3] == 0) {
            sb2.append((CharSequence) str3, 0, m22277a2[3]);
            sb2.append(str4);
            return sb2.toString();
        }
        if (m22277a[2] == 0) {
            sb2.append((CharSequence) str3, 0, m22277a2[2]);
            sb2.append(str4);
            return sb2.toString();
        }
        int i10 = m22277a[1];
        if (i10 != 0) {
            int i11 = m22277a2[0] + 1;
            sb2.append((CharSequence) str3, 0, i11);
            sb2.append(str4);
            return m22279c(sb2, m22277a[1] + i11, i11 + m22277a[2]);
        }
        if (str4.charAt(i10) == '/') {
            sb2.append((CharSequence) str3, 0, m22277a2[1]);
            sb2.append(str4);
            int i12 = m22277a2[1];
            return m22279c(sb2, i12, m22277a[2] + i12);
        }
        int i13 = m22277a2[0];
        int i14 = m22277a2[1];
        if (i13 + 2 >= i14 || i14 != m22277a2[2]) {
            int lastIndexOf = str3.lastIndexOf(47, m22277a2[2] - 1);
            int i15 = lastIndexOf == -1 ? m22277a2[1] : lastIndexOf + 1;
            sb2.append((CharSequence) str3, 0, i15);
            sb2.append(str4);
            return m22279c(sb2, m22277a2[1], i15 + m22277a[2]);
        }
        sb2.append((CharSequence) str3, 0, i14);
        sb2.append('/');
        sb2.append(str4);
        int i16 = m22277a2[1];
        return m22279c(sb2, i16, m22277a[2] + i16 + 1);
    }

    /* renamed from: e */
    public static Uri m22281e(String str, String str2) {
        return Uri.parse(m22280d(str, str2));
    }
}
