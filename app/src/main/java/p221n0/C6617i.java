package p221n0;

import java.io.PrintWriter;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n0/i.class
 */
/* renamed from: n0.i */
/* loaded from: combined.jar:classes1.jar:n0/i.class */
public final class C6617i {

    /* renamed from: a */
    public static final Object f34526a = new Object();

    /* renamed from: b */
    public static char[] f34527b = new char[24];

    /* renamed from: a */
    public static int m30529a(int i10, int i11, boolean z10, int i12) {
        if (i10 > 99 || (z10 && i12 >= 3)) {
            return i11 + 3;
        }
        if (i10 > 9 || (z10 && i12 >= 2)) {
            return i11 + 2;
        }
        if (z10 || i10 > 0) {
            return i11 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m30530b(long j10, long j11, PrintWriter printWriter) {
        if (j10 == 0) {
            printWriter.print("--");
        } else {
            m30532d(j10 - j11, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m30531c(long j10, PrintWriter printWriter) {
        m30532d(j10, printWriter, 0);
    }

    /* renamed from: d */
    public static void m30532d(long j10, PrintWriter printWriter, int i10) {
        synchronized (f34526a) {
            printWriter.print(new String(f34527b, 0, m30533e(j10, i10)));
        }
    }

    /* renamed from: e */
    public static int m30533e(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (f34527b.length < i10) {
            f34527b = new char[i10];
        }
        char[] cArr = f34527b;
        if (j10 == 0) {
            while (i10 - 1 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j10 > 0) {
            c10 = '+';
        } else {
            c10 = '-';
            j10 = -j10;
        }
        int i16 = (int) (j10 % 1000);
        int floor = (int) Math.floor(j10 / 1000);
        if (floor > 86400) {
            i11 = floor / DateTimeConstants.SECONDS_PER_DAY;
            floor -= DateTimeConstants.SECONDS_PER_DAY * i11;
        } else {
            i11 = 0;
        }
        if (floor > 3600) {
            i12 = floor / 3600;
            floor -= i12 * 3600;
        } else {
            i12 = 0;
        }
        if (floor > 60) {
            i13 = floor / 60;
            i14 = floor - (i13 * 60);
        } else {
            i13 = 0;
            i14 = floor;
        }
        if (i10 != 0) {
            int m30529a = m30529a(i11, 1, false, 0);
            int m30529a2 = m30529a + m30529a(i12, 1, m30529a > 0, 2);
            int m30529a3 = m30529a2 + m30529a(i13, 1, m30529a2 > 0, 2);
            int m30529a4 = m30529a3 + m30529a(i14, 1, m30529a3 > 0, 2);
            int m30529a5 = m30529a4 + m30529a(i16, 2, true, m30529a4 > 0 ? 3 : 0) + 1;
            int i17 = 0;
            while (true) {
                i15 = i17;
                if (m30529a5 >= i10) {
                    break;
                }
                cArr[i17] = ' ';
                i17++;
                m30529a5++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c10;
        int i18 = i15 + 1;
        boolean z10 = i10 != 0;
        int m30534f = m30534f(cArr, i11, 'd', i18, false, 0);
        int m30534f2 = m30534f(cArr, i12, 'h', m30534f, m30534f != i18, z10 ? 2 : 0);
        int m30534f3 = m30534f(cArr, i13, 'm', m30534f2, m30534f2 != i18, z10 ? 2 : 0);
        int m30534f4 = m30534f(cArr, i14, 's', m30534f3, m30534f3 != i18, z10 ? 2 : 0);
        int m30534f5 = m30534f(cArr, i16, 'm', m30534f4, true, (!z10 || m30534f4 == i18) ? 0 : 3);
        cArr[m30534f5] = 's';
        return m30534f5 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r8 != r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r6 > 0) goto L6;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m30534f(char[] r5, int r6, char r7, int r8, boolean r9, int r10) {
        /*
            r0 = r9
            if (r0 != 0) goto Lc
            r0 = r8
            r11 = r0
            r0 = r6
            if (r0 <= 0) goto L91
        Lc:
            r0 = r9
            if (r0 == 0) goto L17
            r0 = r10
            r1 = 3
            if (r0 >= r1) goto L1d
        L17:
            r0 = r6
            r1 = 99
            if (r0 <= r1) goto L3c
        L1d:
            r0 = r6
            r1 = 100
            int r0 = r0 / r1
            r12 = r0
            r0 = r5
            r1 = r8
            r2 = r12
            r3 = 48
            int r2 = r2 + r3
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
            r0 = r6
            r1 = r12
            r2 = 100
            int r1 = r1 * r2
            int r0 = r0 - r1
            r6 = r0
            goto L3f
        L3c:
            r0 = r8
            r11 = r0
        L3f:
            r0 = r9
            if (r0 == 0) goto L4a
            r0 = r10
            r1 = 2
            if (r0 >= r1) goto L5d
        L4a:
            r0 = r6
            r1 = 9
            if (r0 > r1) goto L5d
            r0 = r11
            r12 = r0
            r0 = r6
            r10 = r0
            r0 = r8
            r1 = r11
            if (r0 == r1) goto L79
        L5d:
            r0 = r6
            r1 = 10
            int r0 = r0 / r1
            r8 = r0
            r0 = r5
            r1 = r11
            r2 = r8
            r3 = 48
            int r2 = r2 + r3
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r12 = r0
            r0 = r6
            r1 = r8
            r2 = 10
            int r1 = r1 * r2
            int r0 = r0 - r1
            r10 = r0
        L79:
            r0 = r5
            r1 = r12
            r2 = r10
            r3 = 48
            int r2 = r2 + r3
            char r2 = (char) r2
            r0[r1] = r2
            r0 = r12
            r1 = 1
            int r0 = r0 + r1
            r6 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r0[r1] = r2
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
        L91:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p221n0.C6617i.m30534f(char[], int, char, int, boolean, int):int");
    }
}
