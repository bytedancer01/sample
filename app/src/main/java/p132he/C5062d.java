package p132he;

import java.util.Arrays;
import java.util.Map;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.smtp.SMTPReply;
import org.apache.http.HttpStatus;
import p444zd.C10193a;
import td.C8689d;
import td.C8695j;
import td.C8699n;
import td.C8701p;
import td.EnumC8686a;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:he/d.class
 */
/* renamed from: he.d */
/* loaded from: combined.jar:classes2.jar:he/d.class */
public final class C5062d extends AbstractC5069k {

    /* renamed from: c */
    public static final char[] f29152c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    public static final int[] f29153d;

    /* renamed from: e */
    public static final int f29154e;

    /* renamed from: a */
    public final StringBuilder f29155a = new StringBuilder(20);

    /* renamed from: b */
    public final int[] f29156b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, HttpStatus.SC_FAILED_DEPENDENCY, 420, 418, 404, HttpStatus.SC_PAYMENT_REQUIRED, 394, 360, 356, SMTPReply.START_MAIL_INPUT, 308, 282, 344, FTPReply.NEED_ACCOUNT, 326, 300, 278, NNTPReply.TRANSFER_FAILED, 434, 428, 422, HttpStatus.SC_NOT_ACCEPTABLE, HttpStatus.SC_GONE, 364, 358, 310, 314, HttpStatus.SC_MOVED_TEMPORARILY, 468, 466, 458, 366, 374, NNTPReply.NO_SUCH_ARTICLE_FOUND, 294, 474, 470, 306, FTPReply.FILE_ACTION_PENDING};
        f29153d = iArr;
        f29154e = iArr[47];
    }

    /* renamed from: h */
    public static void m25309h(CharSequence charSequence) {
        int length = charSequence.length();
        m25310i(charSequence, length - 2, 20);
        m25310i(charSequence, length - 1, 15);
    }

    /* renamed from: i */
    public static void m25310i(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i14)) * i13;
            int i15 = i13 + 1;
            i13 = i15;
            if (i15 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) != f29152c[i12 % 47]) {
            throw C8689d.m37196a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012b, code lost:
    
        throw td.C8691f.m37197a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0144, code lost:
    
        throw td.C8691f.m37197a();
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m25311j(java.lang.CharSequence r4) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p132he.C5062d.m25311j(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: l */
    public static char m25312l(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f29153d;
            if (i11 >= iArr.length) {
                throw C8695j.m37209a();
            }
            if (iArr[i11] == i10) {
                return f29152c[i11];
            }
            i11++;
        }
    }

    /* renamed from: m */
    public static int m25313m(int[] iArr) {
        int i10;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int length = iArr.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i14;
            if (i13 >= length) {
                return i15;
            }
            int round = Math.round((iArr[i13] * 9.0f) / i11);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                int i16 = 0;
                while (true) {
                    i10 = i15;
                    if (i16 < round) {
                        i15 = (i15 << 1) | 1;
                        i16++;
                    }
                }
            } else {
                i10 = i15 << round;
            }
            i13++;
            i14 = i10;
        }
    }

    @Override // p132he.AbstractC5069k
    /* renamed from: c */
    public C8699n mo25297c(int i10, C10193a c10193a, Map<EnumC8690e, ?> map) {
        int m42662e = c10193a.m42662e(m25314k(c10193a)[1]);
        int m42664h = c10193a.m42664h();
        int[] iArr = this.f29156b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f29155a;
        sb2.setLength(0);
        while (true) {
            AbstractC5069k.m25329f(c10193a, m42662e, iArr);
            int m25313m = m25313m(iArr);
            if (m25313m < 0) {
                throw C8695j.m37209a();
            }
            char m25312l = m25312l(m25313m);
            sb2.append(m25312l);
            int i11 = m42662e;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int m42662e2 = c10193a.m42662e(i11);
            if (m25312l == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                if (m42662e2 == m42664h || !c10193a.m42660c(m42662e2)) {
                    throw C8695j.m37209a();
                }
                if (sb2.length() < 2) {
                    throw C8695j.m37209a();
                }
                m25309h(sb2);
                sb2.setLength(sb2.length() - 2);
                String m25311j = m25311j(sb2);
                float f10 = (r0[1] + r0[0]) / 2.0f;
                float f11 = i10;
                return new C8699n(m25311j, null, new C8701p[]{new C8701p(f10, f11), new C8701p(m42662e + (i13 / 2.0f), f11)}, EnumC8686a.CODE_93);
            }
            m42662e = m42662e2;
        }
    }

    /* renamed from: k */
    public final int[] m25314k(C10193a c10193a) {
        int m42664h = c10193a.m42664h();
        int m42662e = c10193a.m42662e(0);
        Arrays.fill(this.f29156b, 0);
        int[] iArr = this.f29156b;
        int length = iArr.length;
        int i10 = m42662e;
        boolean z10 = false;
        int i11 = 0;
        while (m42662e < m42664h) {
            if (c10193a.m42660c(m42662e) != z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (m25313m(iArr) == f29154e) {
                        return new int[]{i10, m42662e};
                    }
                    i10 += iArr[0] + iArr[1];
                    int i12 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i11] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            m42662e++;
        }
        throw C8695j.m37209a();
    }
}
