package p238o3;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o3/e.class
 */
/* renamed from: o3.e */
/* loaded from: combined.jar:classes1.jar:o3/e.class */
public final class C6888e {
    /* renamed from: a */
    public static String m31753a(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }
}
