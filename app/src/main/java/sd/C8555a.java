package sd;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import md.AbstractC6565f;
import p232nd.C6770f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:sd/a.class
 */
/* renamed from: sd.a */
/* loaded from: combined.jar:classes2.jar:sd/a.class */
public class C8555a implements Closeable {

    /* renamed from: b */
    public final Reader f39964b;

    /* renamed from: j */
    public long f39972j;

    /* renamed from: k */
    public int f39973k;

    /* renamed from: l */
    public String f39974l;

    /* renamed from: m */
    public int[] f39975m;

    /* renamed from: o */
    public String[] f39977o;

    /* renamed from: p */
    public int[] f39978p;

    /* renamed from: c */
    public boolean f39965c = false;

    /* renamed from: d */
    public final char[] f39966d = new char[1024];

    /* renamed from: e */
    public int f39967e = 0;

    /* renamed from: f */
    public int f39968f = 0;

    /* renamed from: g */
    public int f39969g = 0;

    /* renamed from: h */
    public int f39970h = 0;

    /* renamed from: i */
    public int f39971i = 0;

    /* renamed from: n */
    public int f39976n = 0 + 1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:sd/a$a.class
     */
    /* renamed from: sd.a$a */
    /* loaded from: combined.jar:classes2.jar:sd/a$a.class */
    public class a extends AbstractC6565f {
        @Override // md.AbstractC6565f
        /* renamed from: a */
        public void mo30313a(C8555a c8555a) {
            int i10;
            if (c8555a instanceof C6770f) {
                ((C6770f) c8555a).m31111Z0();
                return;
            }
            int i11 = c8555a.f39971i;
            int i12 = i11;
            if (i11 == 0) {
                i12 = c8555a.m36803q();
            }
            if (i12 == 13) {
                i10 = 9;
            } else if (i12 == 12) {
                i10 = 8;
            } else {
                if (i12 != 14) {
                    throw new IllegalStateException("Expected a name but was " + c8555a.mo31105J0() + c8555a.m36804q0());
                }
                i10 = 10;
            }
            c8555a.f39971i = i10;
        }
    }

    static {
        AbstractC6565f.f34366a = new a();
    }

    public C8555a(Reader reader) {
        int[] iArr = new int[32];
        this.f39975m = iArr;
        iArr[0] = 6;
        this.f39977o = new String[32];
        this.f39978p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f39964b = reader;
    }

    /* renamed from: A0 */
    public double mo31099A0() {
        String m36788G0;
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 == 15) {
            this.f39971i = 0;
            int[] iArr = this.f39978p;
            int i12 = this.f39976n - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f39972j;
        }
        if (i11 == 16) {
            this.f39974l = new String(this.f39966d, this.f39967e, this.f39973k);
            this.f39967e += this.f39973k;
        } else {
            if (i11 == 8 || i11 == 9) {
                m36788G0 = m36788G0(i11 == 8 ? '\'' : '\"');
            } else if (i11 == 10) {
                m36788G0 = m36789I0();
            } else if (i11 != 11) {
                throw new IllegalStateException("Expected a double but was " + mo31105J0() + m36804q0());
            }
            this.f39974l = m36788G0;
        }
        this.f39971i = 11;
        double parseDouble = Double.parseDouble(this.f39974l);
        if (!this.f39965c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new C8558d("JSON forbids NaN and infinities: " + parseDouble + m36804q0());
        }
        this.f39974l = null;
        this.f39971i = 0;
        int[] iArr2 = this.f39978p;
        int i13 = this.f39976n - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return parseDouble;
    }

    /* renamed from: B */
    public final boolean m36786B() {
        return this.f39965c;
    }

    /* renamed from: B0 */
    public int mo31100B0() {
        String m36788G0;
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 == 15) {
            long j10 = this.f39972j;
            int i12 = (int) j10;
            if (j10 == i12) {
                this.f39971i = 0;
                int[] iArr = this.f39978p;
                int i13 = this.f39976n - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new NumberFormatException("Expected an int but was " + this.f39972j + m36804q0());
        }
        if (i11 == 16) {
            this.f39974l = new String(this.f39966d, this.f39967e, this.f39973k);
            this.f39967e += this.f39973k;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw new IllegalStateException("Expected an int but was " + mo31105J0() + m36804q0());
            }
            if (i11 == 10) {
                m36788G0 = m36789I0();
            } else {
                m36788G0 = m36788G0(i11 == 8 ? '\'' : '\"');
            }
            this.f39974l = m36788G0;
            try {
                int parseInt = Integer.parseInt(this.f39974l);
                this.f39971i = 0;
                int[] iArr2 = this.f39978p;
                int i14 = this.f39976n - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException e10) {
            }
        }
        this.f39971i = 11;
        double parseDouble = Double.parseDouble(this.f39974l);
        int i15 = (int) parseDouble;
        if (i15 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f39974l + m36804q0());
        }
        this.f39974l = null;
        this.f39971i = 0;
        int[] iArr3 = this.f39978p;
        int i16 = this.f39976n - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    /* renamed from: C0 */
    public long mo31101C0() {
        String m36788G0;
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 == 15) {
            this.f39971i = 0;
            int[] iArr = this.f39978p;
            int i12 = this.f39976n - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f39972j;
        }
        if (i11 == 16) {
            this.f39974l = new String(this.f39966d, this.f39967e, this.f39973k);
            this.f39967e += this.f39973k;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw new IllegalStateException("Expected a long but was " + mo31105J0() + m36804q0());
            }
            if (i11 == 10) {
                m36788G0 = m36789I0();
            } else {
                m36788G0 = m36788G0(i11 == 8 ? '\'' : '\"');
            }
            this.f39974l = m36788G0;
            try {
                long parseLong = Long.parseLong(this.f39974l);
                this.f39971i = 0;
                int[] iArr2 = this.f39978p;
                int i13 = this.f39976n - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException e10) {
            }
        }
        this.f39971i = 11;
        double parseDouble = Double.parseDouble(this.f39974l);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f39974l + m36804q0());
        }
        this.f39974l = null;
        this.f39971i = 0;
        int[] iArr3 = this.f39978p;
        int i14 = this.f39976n - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return j10;
    }

    /* renamed from: D0 */
    public String mo31102D0() {
        char c10;
        String m36788G0;
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 == 14) {
            m36788G0 = m36789I0();
        } else {
            if (i11 == 12) {
                c10 = '\'';
            } else {
                if (i11 != 13) {
                    throw new IllegalStateException("Expected a name but was " + mo31105J0() + m36804q0());
                }
                c10 = '\"';
            }
            m36788G0 = m36788G0(c10);
        }
        this.f39971i = 0;
        this.f39977o[this.f39976n - 1] = m36788G0;
        return m36788G0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r0 != '/') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        r4.f39967e = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r6 != r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        r4.f39967e = r6 - 1;
        r0 = m36805w(2);
        r4.f39967e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        if (r0 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        m36800o();
        r0 = r4.f39967e;
        r0 = r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        if (r0 == '*') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fc, code lost:
    
        r4.f39967e = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
    
        if (m36796Q0(org.apache.commons.codec.language.p254bm.ResourceConstants.EXT_CMT_END) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
    
        throw m36799U0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r0 == '/') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        r4.f39967e = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011d, code lost:
    
        r4.f39967e = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0126, code lost:
    
        if (r0 != '#') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0129, code lost:
    
        m36800o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
    
        return r0;
     */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m36787E0(boolean r5) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.C8555a.m36787E0(boolean):int");
    }

    /* renamed from: F0 */
    public void mo31103F0() {
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 == 7) {
            this.f39971i = 0;
            int[] iArr = this.f39978p;
            int i12 = this.f39976n - 1;
            iArr[i12] = iArr[i12] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo31105J0() + m36804q0());
    }

    /* renamed from: G0 */
    public final String m36788G0(char c10) {
        char[] cArr = this.f39966d;
        StringBuilder sb2 = null;
        while (true) {
            StringBuilder sb3 = sb2;
            int i10 = this.f39967e;
            int i11 = this.f39968f;
            int i12 = i10;
            while (true) {
                int i13 = i12;
                if (i13 < i11) {
                    i12 = i13 + 1;
                    char c11 = cArr[i13];
                    if (c11 == c10) {
                        this.f39967e = i12;
                        int i14 = (i12 - i10) - 1;
                        if (sb3 == null) {
                            return new String(cArr, i10, i14);
                        }
                        sb3.append(cArr, i10, i14);
                        return sb3.toString();
                    }
                    if (c11 == '\\') {
                        this.f39967e = i12;
                        int i15 = (i12 - i10) - 1;
                        StringBuilder sb4 = sb3;
                        if (sb3 == null) {
                            sb4 = new StringBuilder(Math.max((i15 + 1) * 2, 16));
                        }
                        sb4.append(cArr, i10, i15);
                        sb4.append(m36793N0());
                        sb2 = sb4;
                    } else if (c11 == '\n') {
                        this.f39969g++;
                        this.f39970h = i12;
                    }
                } else {
                    StringBuilder sb5 = sb3;
                    if (sb3 == null) {
                        sb5 = new StringBuilder(Math.max((i13 - i10) * 2, 16));
                    }
                    sb5.append(cArr, i10, i13 - i10);
                    this.f39967e = i13;
                    if (!m36805w(1)) {
                        throw m36799U0("Unterminated string");
                    }
                    sb2 = sb5;
                }
            }
        }
    }

    /* renamed from: H0 */
    public String mo31104H0() {
        String str;
        char c10;
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 == 10) {
            str = m36789I0();
        } else {
            if (i11 == 8) {
                c10 = '\'';
            } else if (i11 == 9) {
                c10 = '\"';
            } else if (i11 == 11) {
                str = this.f39974l;
                this.f39974l = null;
            } else if (i11 == 15) {
                str = Long.toString(this.f39972j);
            } else {
                if (i11 != 16) {
                    throw new IllegalStateException("Expected a string but was " + mo31105J0() + m36804q0());
                }
                str = new String(this.f39966d, this.f39967e, this.f39973k);
                this.f39967e += this.f39973k;
            }
            str = m36788G0(c10);
        }
        this.f39971i = 0;
        int[] iArr = this.f39978p;
        int i12 = this.f39976n - 1;
        iArr[i12] = iArr[i12] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x008e, code lost:
    
        m36800o();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x006e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010b  */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m36789I0() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.C8555a.m36789I0():java.lang.String");
    }

    /* renamed from: J0 */
    public EnumC8556b mo31105J0() {
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        switch (i11) {
            case 1:
                return EnumC8556b.BEGIN_OBJECT;
            case 2:
                return EnumC8556b.END_OBJECT;
            case 3:
                return EnumC8556b.BEGIN_ARRAY;
            case 4:
                return EnumC8556b.END_ARRAY;
            case 5:
            case 6:
                return EnumC8556b.BOOLEAN;
            case 7:
                return EnumC8556b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC8556b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC8556b.NAME;
            case 15:
            case 16:
                return EnumC8556b.NUMBER;
            case 17:
                return EnumC8556b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: K0 */
    public final int m36790K0() {
        int i10;
        String str;
        String str2;
        char c10 = this.f39966d[this.f39967e];
        if (c10 == 't' || c10 == 'T') {
            i10 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c10 == 'f' || c10 == 'F') {
            i10 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            i10 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f39967e + i11 >= this.f39968f && !m36805w(i11 + 1)) {
                return 0;
            }
            char c11 = this.f39966d[this.f39967e + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f39967e + length < this.f39968f || m36805w(length + 1)) && m36801o0(this.f39966d[this.f39967e + length])) {
            return 0;
        }
        this.f39967e += length;
        this.f39971i = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fb, code lost:
    
        if (r7 == 6) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m36791L0() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.C8555a.m36791L0():int");
    }

    /* renamed from: M0 */
    public final void m36792M0(int i10) {
        int i11 = this.f39976n;
        int[] iArr = this.f39975m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f39975m = Arrays.copyOf(iArr, i12);
            this.f39978p = Arrays.copyOf(this.f39978p, i12);
            this.f39977o = (String[]) Arrays.copyOf(this.f39977o, i12);
        }
        int[] iArr2 = this.f39975m;
        int i13 = this.f39976n;
        this.f39976n = i13 + 1;
        iArr2[i13] = i10;
    }

    /* renamed from: N0 */
    public final char m36793N0() {
        int i10;
        int i11;
        if (this.f39967e == this.f39968f && !m36805w(1)) {
            throw m36799U0("Unterminated escape sequence");
        }
        char[] cArr = this.f39966d;
        int i12 = this.f39967e;
        int i13 = i12 + 1;
        this.f39967e = i13;
        char c10 = cArr[i12];
        if (c10 == '\n') {
            this.f39969g++;
            this.f39970h = i13;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                throw m36799U0("Invalid escape sequence");
            }
            if (i13 + 4 > this.f39968f && !m36805w(4)) {
                throw m36799U0("Unterminated escape sequence");
            }
            char c11 = 0;
            int i14 = this.f39967e;
            int i15 = i14;
            while (true) {
                int i16 = i15;
                if (i16 >= i14 + 4) {
                    this.f39967e += 4;
                    return c11;
                }
                char c12 = this.f39966d[i16];
                int i17 = (char) (c11 << 4);
                if (c12 < '0' || c12 > '9') {
                    if (c12 >= 'a' && c12 <= 'f') {
                        i10 = c12 - 97;
                    } else {
                        if (c12 < 'A' || c12 > 'F') {
                            break;
                        }
                        i10 = c12 - 65;
                    }
                    i11 = i10 + 10;
                } else {
                    i11 = c12 - 48;
                }
                c11 = (char) (i17 + i11);
                i15 = i16 + 1;
            }
            throw new NumberFormatException("\\u" + new String(this.f39966d, this.f39967e, 4));
        }
        return c10;
    }

    /* renamed from: O0 */
    public final void m36794O0(boolean z10) {
        this.f39965c = z10;
    }

    /* renamed from: P0 */
    public final void m36795P0(char c10) {
        char[] cArr = this.f39966d;
        while (true) {
            int i10 = this.f39967e;
            int i11 = this.f39968f;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f39967e = i12;
                        return;
                    }
                    if (c11 == '\\') {
                        this.f39967e = i12;
                        m36793N0();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f39969g++;
                            this.f39970h = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f39967e = i10;
                    if (!m36805w(1)) {
                        throw m36799U0("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: Q0 */
    public final boolean m36796Q0(String str) {
        int length = str.length();
        while (true) {
            if (this.f39967e + length > this.f39968f && !m36805w(length)) {
                return false;
            }
            char[] cArr = this.f39966d;
            int i10 = this.f39967e;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f39966d[this.f39967e + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f39969g++;
            this.f39970h = i10 + 1;
            this.f39967e++;
        }
    }

    /* renamed from: R0 */
    public final void m36797R0() {
        char c10;
        do {
            if (this.f39967e >= this.f39968f && !m36805w(1)) {
                return;
            }
            char[] cArr = this.f39966d;
            int i10 = this.f39967e;
            int i11 = i10 + 1;
            this.f39967e = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f39969g++;
                this.f39970h = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* renamed from: S0 */
    public final void m36798S0() {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f39967e;
                if (i11 + i10 < this.f39968f) {
                    char c10 = this.f39966d[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f39967e = i11 + i10;
                }
            }
            m36800o();
            this.f39967e += i10;
            return;
        } while (m36805w(1));
    }

    /* renamed from: T0 */
    public void mo31106T0() {
        int i10;
        char c10;
        int i11 = 0;
        do {
            int i12 = this.f39971i;
            int i13 = i12;
            if (i12 == 0) {
                i13 = m36803q();
            }
            if (i13 == 3) {
                m36792M0(1);
            } else if (i13 == 1) {
                m36792M0(3);
            } else {
                if (i13 == 4 || i13 == 2) {
                    this.f39976n--;
                    i10 = i11 - 1;
                } else if (i13 == 14 || i13 == 10) {
                    m36798S0();
                    i10 = i11;
                } else {
                    if (i13 == 8 || i13 == 12) {
                        c10 = '\'';
                    } else if (i13 == 9 || i13 == 13) {
                        c10 = '\"';
                    } else {
                        i10 = i11;
                        if (i13 == 16) {
                            this.f39967e += this.f39973k;
                            i10 = i11;
                        }
                    }
                    m36795P0(c10);
                    i10 = i11;
                }
                this.f39971i = 0;
                i11 = i10;
            }
            i10 = i11 + 1;
            this.f39971i = 0;
            i11 = i10;
        } while (i10 != 0);
        int[] iArr = this.f39978p;
        int i14 = this.f39976n;
        int i15 = i14 - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f39977o[i14 - 1] = "null";
    }

    /* renamed from: U0 */
    public final IOException m36799U0(String str) {
        throw new C8558d(str + m36804q0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39971i = 0;
        this.f39975m[0] = 8;
        this.f39976n = 1;
        this.f39964b.close();
    }

    /* renamed from: f */
    public void mo31113f() {
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 == 3) {
            m36792M0(1);
            this.f39978p[this.f39976n - 1] = 0;
            this.f39971i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo31105J0() + m36804q0());
        }
    }

    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f39976n;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f39975m[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.f39978p[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f39977o[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: l */
    public void mo31114l() {
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 == 1) {
            m36792M0(3);
            this.f39971i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo31105J0() + m36804q0());
        }
    }

    /* renamed from: o */
    public final void m36800o() {
        if (!this.f39965c) {
            throw m36799U0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: o0 */
    public final boolean m36801o0(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m36800o();
        return false;
    }

    /* renamed from: p */
    public final void m36802p() {
        m36787E0(true);
        int i10 = this.f39967e - 1;
        this.f39967e = i10;
        if (i10 + 5 <= this.f39968f || m36805w(5)) {
            char[] cArr = this.f39966d;
            if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == '\n') {
                this.f39967e += 5;
            }
        }
    }

    /* renamed from: q */
    public int m36803q() {
        int i10;
        int m36787E0;
        int[] iArr = this.f39975m;
        int i11 = this.f39976n;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else {
            if (i12 != 2) {
                if (i12 == 3 || i12 == 5) {
                    iArr[i11 - 1] = 4;
                    if (i12 == 5 && (m36787E0 = m36787E0(true)) != 44) {
                        if (m36787E0 != 59) {
                            if (m36787E0 != 125) {
                                throw m36799U0("Unterminated object");
                            }
                            this.f39971i = 2;
                            return 2;
                        }
                        m36800o();
                    }
                    int m36787E02 = m36787E0(true);
                    if (m36787E02 == 34) {
                        i10 = 13;
                    } else if (m36787E02 == 39) {
                        m36800o();
                        i10 = 12;
                    } else {
                        if (m36787E02 == 125) {
                            if (i12 == 5) {
                                throw m36799U0("Expected name");
                            }
                            this.f39971i = 2;
                            return 2;
                        }
                        m36800o();
                        this.f39967e--;
                        if (!m36801o0((char) m36787E02)) {
                            throw m36799U0("Expected name");
                        }
                        i10 = 14;
                    }
                } else if (i12 == 4) {
                    iArr[i11 - 1] = 5;
                    int m36787E03 = m36787E0(true);
                    if (m36787E03 != 58) {
                        if (m36787E03 != 61) {
                            throw m36799U0("Expected ':'");
                        }
                        m36800o();
                        if (this.f39967e < this.f39968f || m36805w(1)) {
                            char[] cArr = this.f39966d;
                            int i13 = this.f39967e;
                            if (cArr[i13] == '>') {
                                this.f39967e = i13 + 1;
                            }
                        }
                    }
                } else if (i12 == 6) {
                    if (this.f39965c) {
                        m36802p();
                    }
                    this.f39975m[this.f39976n - 1] = 7;
                } else if (i12 == 7) {
                    if (m36787E0(false) == -1) {
                        i10 = 17;
                    } else {
                        m36800o();
                        this.f39967e--;
                    }
                } else if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f39971i = i10;
                return i10;
            }
            int m36787E04 = m36787E0(true);
            if (m36787E04 != 44) {
                if (m36787E04 != 59) {
                    if (m36787E04 != 93) {
                        throw m36799U0("Unterminated array");
                    }
                    this.f39971i = 4;
                    return 4;
                }
                m36800o();
            }
        }
        int m36787E05 = m36787E0(true);
        if (m36787E05 != 34) {
            if (m36787E05 == 39) {
                m36800o();
                this.f39971i = 8;
                return 8;
            }
            if (m36787E05 != 44 && m36787E05 != 59) {
                if (m36787E05 == 91) {
                    this.f39971i = 3;
                    return 3;
                }
                if (m36787E05 != 93) {
                    if (m36787E05 == 123) {
                        this.f39971i = 1;
                        return 1;
                    }
                    this.f39967e--;
                    int m36790K0 = m36790K0();
                    if (m36790K0 != 0) {
                        return m36790K0;
                    }
                    int m36791L0 = m36791L0();
                    if (m36791L0 != 0) {
                        return m36791L0;
                    }
                    if (!m36801o0(this.f39966d[this.f39967e])) {
                        throw m36799U0("Expected value");
                    }
                    m36800o();
                    i10 = 10;
                } else if (i12 == 1) {
                    this.f39971i = 4;
                    return 4;
                }
            }
            if (i12 != 1 && i12 != 2) {
                throw m36799U0("Unexpected value");
            }
            m36800o();
            this.f39967e--;
            this.f39971i = 7;
            return 7;
        }
        i10 = 9;
        this.f39971i = i10;
        return i10;
    }

    /* renamed from: q0 */
    public String m36804q0() {
        return " at line " + (this.f39969g + 1) + " column " + ((this.f39967e - this.f39970h) + 1) + " path " + getPath();
    }

    /* renamed from: t */
    public void mo31115t() {
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + mo31105J0() + m36804q0());
        }
        int i12 = this.f39976n - 1;
        this.f39976n = i12;
        int[] iArr = this.f39978p;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f39971i = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + m36804q0();
    }

    /* renamed from: v */
    public void mo31116v() {
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + mo31105J0() + m36804q0());
        }
        int i12 = this.f39976n - 1;
        this.f39976n = i12;
        this.f39977o[i12] = null;
        int[] iArr = this.f39978p;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f39971i = 0;
    }

    /* renamed from: v0 */
    public boolean mo31117v0() {
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        if (i11 == 5) {
            this.f39971i = 0;
            int[] iArr = this.f39978p;
            int i12 = this.f39976n - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (i11 == 6) {
            this.f39971i = 0;
            int[] iArr2 = this.f39978p;
            int i13 = this.f39976n - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + mo31105J0() + m36804q0());
    }

    /* renamed from: w */
    public final boolean m36805w(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f39966d;
        int i13 = this.f39970h;
        int i14 = this.f39967e;
        this.f39970h = i13 - i14;
        int i15 = this.f39968f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f39968f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f39968f = 0;
        }
        this.f39967e = 0;
        do {
            Reader reader = this.f39964b;
            int i17 = this.f39968f;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f39968f + read;
            this.f39968f = i11;
            i12 = i10;
            if (this.f39969g == 0) {
                int i18 = this.f39970h;
                i12 = i10;
                if (i18 == 0) {
                    i12 = i10;
                    if (i11 > 0) {
                        i12 = i10;
                        if (cArr[0] == 65279) {
                            this.f39967e++;
                            this.f39970h = i18 + 1;
                            i12 = i10 + 1;
                        }
                    }
                }
            }
            i10 = i12;
        } while (i11 < i12);
        return true;
    }

    /* renamed from: y */
    public boolean mo31118y() {
        int i10 = this.f39971i;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m36803q();
        }
        return (i11 == 2 || i11 == 4) ? false : true;
    }
}
