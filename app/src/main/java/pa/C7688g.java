package pa;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Queue;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pa/g.class
 */
/* renamed from: pa.g */
/* loaded from: combined.jar:classes2.jar:pa/g.class */
public final class C7688g {

    /* renamed from: a */
    public static final OutputStream f37430a = new C7686e();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
    
        return r6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m33626a(java.io.InputStream r6) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = r0
            r2 = 20
            r1.<init>(r2)
            r15 = r0
            r0 = 8192(0x2000, float:1.148E-41)
            r7 = r0
            r0 = 0
            r8 = r0
        L11:
            r0 = r8
            r1 = 2147483639(0x7ffffff7, float:NaN)
            if (r0 >= r1) goto L93
            r0 = r7
            r1 = 2147483639(0x7ffffff7, float:NaN)
            r2 = r8
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            r10 = r0
            r0 = r10
            byte[] r0 = new byte[r0]
            r14 = r0
            r0 = r15
            r1 = r14
            boolean r0 = r0.add(r1)
            r0 = 0
            r9 = r0
        L33:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L63
            r0 = r6
            r1 = r14
            r2 = r9
            r3 = r10
            r4 = r9
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)
            r11 = r0
            r0 = r11
            r1 = -1
            if (r0 != r1) goto L56
            r0 = r15
            r1 = r8
            byte[] r0 = m33628c(r0, r1)
            r6 = r0
            goto La3
        L56:
            r0 = r9
            r1 = r11
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            r1 = r11
            int r0 = r0 + r1
            r8 = r0
            goto L33
        L63:
            r0 = r7
            long r0 = (long) r0
            r12 = r0
            r0 = r12
            r1 = r12
            long r0 = r0 + r1
            r12 = r0
            r0 = r12
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7d
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7 = r0
            goto L11
        L7d:
            r0 = r12
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r0
            goto L11
        L8c:
            r0 = r12
            int r0 = (int) r0
            r7 = r0
            goto L11
        L93:
            r0 = r6
            int r0 = r0.read()
            r1 = -1
            if (r0 != r1) goto La5
            r0 = r15
            r1 = 2147483639(0x7ffffff7, float:NaN)
            byte[] r0 = m33628c(r0, r1)
            r6 = r0
        La3:
            r0 = r6
            return r0
        La5:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r1 = r0
            java.lang.String r2 = "input is too large to fit in a byte array"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.C7688g.m33626a(java.io.InputStream):byte[]");
    }

    /* renamed from: b */
    public static InputStream m33627b(InputStream inputStream, long j10) {
        return new C7687f(inputStream, 1048577L);
    }

    /* renamed from: c */
    public static byte[] m33628c(Queue<byte[]> queue, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (true) {
            int i12 = i11;
            if (i12 <= 0) {
                return bArr;
            }
            byte[] remove = queue.remove();
            int min = Math.min(i12, remove.length);
            System.arraycopy(remove, 0, bArr, i10 - i12, min);
            i11 = i12 - min;
        }
    }
}
