package p409xg;

import javax.security.auth.x500.X500Principal;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xg/a.class
 */
/* renamed from: xg.a */
/* loaded from: combined.jar:classes2.jar:xg/a.class */
public final class C9748a {

    /* renamed from: a */
    public final String f44488a;

    /* renamed from: b */
    public final int f44489b;

    /* renamed from: c */
    public int f44490c;

    /* renamed from: d */
    public int f44491d;

    /* renamed from: e */
    public int f44492e;

    /* renamed from: f */
    public int f44493f;

    /* renamed from: g */
    public char[] f44494g;

    public C9748a(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f44488a = name;
        this.f44489b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        r0 = r7.f44491d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
    
        return new java.lang.String(r0, r0, r7.f44492e - r0);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m41057a() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p409xg.C9748a.m41057a():java.lang.String");
    }

    /* renamed from: b */
    public String m41058b(String str) {
        this.f44490c = 0;
        this.f44491d = 0;
        this.f44492e = 0;
        this.f44493f = 0;
        this.f44494g = this.f44488a.toCharArray();
        String m41063g = m41063g();
        String str2 = m41063g;
        if (m41063g == null) {
            return null;
        }
        do {
            int i10 = this.f44490c;
            if (i10 == this.f44489b) {
                return null;
            }
            char c10 = this.f44494g[i10];
            String m41057a = c10 != '\"' ? c10 != '#' ? (c10 == '+' || c10 == ',' || c10 == ';') ? "" : m41057a() : m41062f() : m41064h();
            if (str.equalsIgnoreCase(str2)) {
                return m41057a;
            }
            int i11 = this.f44490c;
            if (i11 >= this.f44489b) {
                return null;
            }
            char c11 = this.f44494g[i11];
            if (c11 != ',' && c11 != ';' && c11 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f44488a);
            }
            this.f44490c = i11 + 1;
            str2 = m41063g();
        } while (str2 != null);
        throw new IllegalStateException("Malformed DN: " + this.f44488a);
    }

    /* renamed from: c */
    public final int m41059c(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 >= this.f44489b) {
            throw new IllegalStateException("Malformed DN: " + this.f44488a);
        }
        char[] cArr = this.f44494g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f44488a);
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f44488a);
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    /* renamed from: d */
    public final char m41060d() {
        int i10 = this.f44490c + 1;
        this.f44490c = i10;
        if (i10 == this.f44489b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f44488a);
        }
        char c10 = this.f44494g[i10];
        char c11 = c10;
        if (c10 != ' ') {
            c11 = c10;
            if (c10 != '%') {
                c11 = c10;
                if (c10 != '\\') {
                    c11 = c10;
                    if (c10 != '_') {
                        c11 = c10;
                        if (c10 != '\"') {
                            c11 = c10;
                            if (c10 != '#') {
                                c11 = c10;
                                switch (c10) {
                                    case '*':
                                    case '+':
                                    case ',':
                                        break;
                                    default:
                                        c11 = c10;
                                        switch (c10) {
                                            case ';':
                                            case '<':
                                            case '=':
                                            case '>':
                                                break;
                                            default:
                                                c11 = m41061e();
                                                break;
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }
        return c11;
    }

    /* renamed from: e */
    public final char m41061e() {
        int i10;
        int i11;
        int m41059c = m41059c(this.f44490c);
        this.f44490c++;
        if (m41059c < 128) {
            return (char) m41059c;
        }
        if (m41059c < 192 || m41059c > 247) {
            return '?';
        }
        if (m41059c <= 223) {
            i11 = m41059c & 31;
            i10 = 1;
        } else if (m41059c <= 239) {
            i10 = 2;
            i11 = m41059c & 15;
        } else {
            i10 = 3;
            i11 = m41059c & 7;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.f44490c + 1;
            this.f44490c = i13;
            if (i13 == this.f44489b || this.f44494g[i13] != '\\') {
                return '?';
            }
            int i14 = i13 + 1;
            this.f44490c = i14;
            int m41059c2 = m41059c(i14);
            this.f44490c++;
            if ((m41059c2 & 192) != 128) {
                return '?';
            }
            i11 = (i11 << 6) + (m41059c2 & 63);
        }
        return (char) i11;
    }

    /* renamed from: f */
    public final String m41062f() {
        int i10;
        char[] cArr;
        char c10;
        int i11 = this.f44490c;
        if (i11 + 4 >= this.f44489b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f44488a);
        }
        this.f44491d = i11;
        while (true) {
            this.f44490c = i11 + 1;
            i10 = this.f44490c;
            if (i10 == this.f44489b || (c10 = (cArr = this.f44494g)[i10]) == '+' || c10 == ',' || c10 == ';') {
                break;
            }
            if (c10 == ' ') {
                this.f44492e = i10;
                do {
                    this.f44490c = i10 + 1;
                    i10 = this.f44490c;
                    if (i10 >= this.f44489b) {
                        break;
                    }
                } while (this.f44494g[i10] == ' ');
            } else {
                i11 = i10;
                if (c10 >= 'A') {
                    i11 = i10;
                    if (c10 <= 'F') {
                        cArr[i10] = (char) (c10 + ' ');
                        i11 = i10;
                    }
                }
            }
        }
        this.f44492e = i10;
        int i12 = this.f44492e;
        int i13 = this.f44491d;
        int i14 = i12 - i13;
        if (i14 < 5 || (i14 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f44488a);
        }
        int i15 = i14 / 2;
        byte[] bArr = new byte[i15];
        int i16 = i13 + 1;
        for (int i17 = 0; i17 < i15; i17++) {
            bArr[i17] = (byte) m41059c(i16);
            i16 += 2;
        }
        return new String(this.f44494g, this.f44491d, i14);
    }

    /* renamed from: g */
    public final String m41063g() {
        int i10;
        int i11;
        int i12;
        char c10;
        int i13;
        int i14;
        char c11;
        char c12;
        while (true) {
            i10 = this.f44490c;
            i11 = this.f44489b;
            if (i10 >= i11 || this.f44494g[i10] != ' ') {
                break;
            }
            this.f44490c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f44491d = i10;
        do {
            this.f44490c = i10 + 1;
            i10 = this.f44490c;
            i12 = this.f44489b;
            if (i10 >= i12 || (c12 = this.f44494g[i10]) == '=') {
                break;
            }
        } while (c12 != ' ');
        if (i10 >= i12) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f44488a);
        }
        this.f44492e = i10;
        if (this.f44494g[i10] == ' ') {
            while (true) {
                i13 = this.f44490c;
                i14 = this.f44489b;
                if (i13 >= i14 || (c11 = this.f44494g[i13]) == '=' || c11 != ' ') {
                    break;
                }
                this.f44490c = i13 + 1;
            }
            if (this.f44494g[i13] != '=' || i13 == i14) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f44488a);
            }
        }
        int i15 = this.f44490c;
        do {
            this.f44490c = i15 + 1;
            i15 = this.f44490c;
            if (i15 >= this.f44489b) {
                break;
            }
        } while (this.f44494g[i15] == ' ');
        int i16 = this.f44492e;
        int i17 = this.f44491d;
        if (i16 - i17 > 4) {
            char[] cArr = this.f44494g;
            if (cArr[i17 + 3] == '.' && (((c10 = cArr[i17]) == 'O' || c10 == 'o') && ((cArr[i17 + 1] == 'I' || cArr[i17 + 1] == 'i') && (cArr[i17 + 2] == 'D' || cArr[i17 + 2] == 'd')))) {
                this.f44491d = i17 + 4;
            }
        }
        char[] cArr2 = this.f44494g;
        int i18 = this.f44491d;
        return new String(cArr2, i18, i16 - i18);
    }

    /* renamed from: h */
    public final String m41064h() {
        int i10 = this.f44490c + 1;
        this.f44490c = i10;
        this.f44491d = i10;
        while (true) {
            this.f44492e = i10;
            int i11 = this.f44490c;
            if (i11 == this.f44489b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f44488a);
            }
            char[] cArr = this.f44494g;
            char c10 = cArr[i11];
            if (c10 == '\"') {
                do {
                    this.f44490c = i11 + 1;
                    i11 = this.f44490c;
                    if (i11 >= this.f44489b) {
                        break;
                    }
                } while (this.f44494g[i11] == ' ');
                char[] cArr2 = this.f44494g;
                int i12 = this.f44491d;
                return new String(cArr2, i12, this.f44492e - i12);
            }
            if (c10 == '\\') {
                cArr[this.f44492e] = m41060d();
            } else {
                cArr[this.f44492e] = c10;
            }
            this.f44490c++;
            i10 = this.f44492e + 1;
        }
    }
}
