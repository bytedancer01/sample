package p238o3;

import java.io.EOFException;
import org.apache.http.message.BasicHeaderValueFormatter;
import p238o3.AbstractC6887d;
import p317s3.C8523a;
import p317s3.C8524b;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o3/b.class
 */
/* renamed from: o3.b */
/* loaded from: combined.jar:classes1.jar:o3/b.class */
public final class C6885b extends AbstractC6887d {

    /* renamed from: n */
    public static final C9764h f35683n = C9764h.m41183h("'\\");

    /* renamed from: o */
    public static final C9764h f35684o = C9764h.m41183h(BasicHeaderValueFormatter.UNSAFE_CHARS);

    /* renamed from: p */
    public static final C9764h f35685p = C9764h.m41183h("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: q */
    public static final C9764h f35686q = C9764h.m41183h("\n\r");

    /* renamed from: d */
    public final InterfaceC9763g f35689d;

    /* renamed from: e */
    public final C9761e f35690e;

    /* renamed from: g */
    public long f35692g;

    /* renamed from: h */
    public int f35693h;

    /* renamed from: i */
    public String f35694i;

    /* renamed from: j */
    public final int[] f35695j;

    /* renamed from: l */
    public final String[] f35697l;

    /* renamed from: m */
    public final int[] f35698m;

    /* renamed from: b */
    public boolean f35687b = false;

    /* renamed from: c */
    public boolean f35688c = false;

    /* renamed from: f */
    public int f35691f = 0;

    /* renamed from: k */
    public int f35696k = 0 + 1;

    public C6885b(InterfaceC9763g interfaceC9763g) {
        int[] iArr = new int[32];
        this.f35695j = iArr;
        iArr[0] = 6;
        this.f35697l = new String[32];
        this.f35698m = new int[32];
        if (interfaceC9763g == null) {
            throw new NullPointerException("source == null");
        }
        this.f35689d = interfaceC9763g;
        this.f35690e = interfaceC9763g.mo41177z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r4.f35690e.skip(r0 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0 != 47) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r4.f35689d.mo41175u(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        m31743o0();
        r0 = r4.f35690e.m41119B0(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r0 == 42) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        r4.f35690e.readByte();
        r4.f35690e.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        if (m31736I0(org.apache.commons.codec.language.p254bm.ResourceConstants.EXT_CMT_END) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        r4.f35690e.readByte();
        r4.f35690e.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        throw m31739L0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r0 == 47) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4.f35690e.readByte();
        r4.f35690e.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        m31737J0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r0 != 35) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        m31743o0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        return r0;
     */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m31727A0(boolean r5) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p238o3.C6885b.m31727A0(boolean):int");
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: B */
    public void mo31728B() {
        int i10;
        C9764h c9764h;
        if (this.f35688c) {
            throw new C8523a("Cannot skip unexpected " + mo31751y() + " at " + getPath());
        }
        int i11 = 0;
        do {
            int i12 = this.f35691f;
            int i13 = i12;
            if (i12 == 0) {
                i13 = m31746q0();
            }
            if (i13 == 3) {
                m31733F0(1);
            } else if (i13 == 1) {
                m31733F0(3);
            } else {
                if (i13 == 4 || i13 == 2) {
                    this.f35696k--;
                    i10 = i11 - 1;
                } else if (i13 == 14 || i13 == 10) {
                    m31738K0();
                    i10 = i11;
                } else {
                    if (i13 == 9 || i13 == 13) {
                        c9764h = f35684o;
                    } else if (i13 == 8 || i13 == 12) {
                        c9764h = f35683n;
                    } else {
                        i10 = i11;
                        if (i13 == 16) {
                            this.f35690e.skip(this.f35693h);
                            i10 = i11;
                        }
                    }
                    m31735H0(c9764h);
                    i10 = i11;
                }
                this.f35691f = 0;
                i11 = i10;
            }
            i10 = i11 + 1;
            this.f35691f = 0;
            i11 = i10;
        } while (i10 != 0);
        int[] iArr = this.f35698m;
        int i14 = this.f35696k;
        int i15 = i14 - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f35697l[i14 - 1] = "null";
    }

    /* renamed from: B0 */
    public final String m31729B0(C9764h c9764h) {
        StringBuilder sb2 = null;
        while (true) {
            StringBuilder sb3 = sb2;
            long mo41153c0 = this.f35689d.mo41153c0(c9764h);
            if (mo41153c0 == -1) {
                throw m31739L0("Unterminated string");
            }
            if (this.f35690e.m41119B0(mo41153c0) != 92) {
                String m41135P0 = this.f35690e.m41135P0(mo41153c0);
                if (sb3 == null) {
                    this.f35690e.readByte();
                    return m41135P0;
                }
                sb3.append(m41135P0);
                this.f35690e.readByte();
                return sb3.toString();
            }
            StringBuilder sb4 = sb3;
            if (sb3 == null) {
                sb4 = new StringBuilder();
            }
            sb4.append(this.f35690e.m41135P0(mo41153c0));
            this.f35690e.readByte();
            sb4.append(m31734G0());
            sb2 = sb4;
        }
    }

    /* renamed from: C0 */
    public final String m31730C0() {
        long mo41153c0 = this.f35689d.mo41153c0(f35685p);
        return mo41153c0 != -1 ? this.f35690e.m41135P0(mo41153c0) : this.f35690e.m41134O0();
    }

    /* renamed from: D0 */
    public final int m31731D0() {
        int i10;
        String str;
        String str2;
        byte m41119B0 = this.f35690e.m41119B0(0L);
        if (m41119B0 == 116 || m41119B0 == 84) {
            i10 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (m41119B0 == 102 || m41119B0 == 70) {
            i10 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (m41119B0 != 110 && m41119B0 != 78) {
                return 0;
            }
            i10 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i11 = 1;
        while (true) {
            int i12 = i11;
            if (i12 >= length) {
                if (this.f35689d.mo41175u(length + 1) && m31749v0(this.f35690e.m41119B0(length))) {
                    return 0;
                }
                this.f35690e.skip(length);
                this.f35691f = i10;
                return i10;
            }
            int i13 = i12 + 1;
            if (!this.f35689d.mo41175u(i13)) {
                return 0;
            }
            byte m41119B02 = this.f35690e.m41119B0(i12);
            if (m41119B02 != str.charAt(i12) && m41119B02 != str2.charAt(i12)) {
                return 0;
            }
            i11 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
    
        if (m31749v0(r0) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0118, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011c, code lost:
    
        if (r7 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
    
        if (r14 != Long.MIN_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0129, code lost:
    
        if (r8 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012d, code lost:
    
        if (r8 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        r5.f35692g = r14;
        r5.f35690e.skip(r12);
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014b, code lost:
    
        r5.f35691f = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0151, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015b, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0162, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0168, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016a, code lost:
    
        r5.f35693h = r12;
        r6 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0176, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m31732E0() {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p238o3.C6885b.m31732E0():int");
    }

    /* renamed from: F0 */
    public final void m31733F0(int i10) {
        int i11 = this.f35696k;
        int[] iArr = this.f35695j;
        if (i11 != iArr.length) {
            this.f35696k = i11 + 1;
            iArr[i11] = i10;
        } else {
            throw new C8523a("Nesting too deep at " + getPath());
        }
    }

    /* renamed from: G0 */
    public final char m31734G0() {
        int i10;
        int i11;
        if (!this.f35689d.mo41175u(1L)) {
            throw m31739L0("Unterminated escape sequence");
        }
        byte readByte = this.f35690e.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.f35687b) {
                return (char) readByte;
            }
            throw m31739L0("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.f35689d.mo41175u(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int m41119B0 = this.f35690e.m41119B0(i12);
            int i13 = (char) (c10 << 4);
            if (m41119B0 < 48 || m41119B0 > 57) {
                if (m41119B0 >= 97 && m41119B0 <= 102) {
                    i10 = m41119B0 - 97;
                } else {
                    if (m41119B0 < 65 || m41119B0 > 70) {
                        throw m31739L0("\\u" + this.f35690e.m41135P0(4L));
                    }
                    i10 = m41119B0 - 65;
                }
                i11 = i10 + 10;
            } else {
                i11 = m41119B0 - 48;
            }
            c10 = (char) (i13 + i11);
        }
        this.f35690e.skip(4L);
        return c10;
    }

    /* renamed from: H0 */
    public final void m31735H0(C9764h c9764h) {
        while (true) {
            long mo41153c0 = this.f35689d.mo41153c0(c9764h);
            if (mo41153c0 == -1) {
                throw m31739L0("Unterminated string");
            }
            if (this.f35690e.m41119B0(mo41153c0) != 92) {
                this.f35690e.skip(mo41153c0 + 1);
                return;
            } else {
                this.f35690e.skip(mo41153c0 + 1);
                m31734G0();
            }
        }
    }

    /* renamed from: I0 */
    public final boolean m31736I0(String str) {
        while (true) {
            if (!this.f35689d.mo41175u(str.length())) {
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (this.f35690e.m41119B0(i10) != str.charAt(i10)) {
                    break;
                }
            }
            return true;
            this.f35690e.readByte();
        }
    }

    /* renamed from: J0 */
    public final void m31737J0() {
        long mo41153c0 = this.f35689d.mo41153c0(f35686q);
        C9761e c9761e = this.f35690e;
        c9761e.skip(mo41153c0 != -1 ? mo41153c0 + 1 : c9761e.size());
    }

    /* renamed from: K0 */
    public final void m31738K0() {
        long mo41153c0 = this.f35689d.mo41153c0(f35685p);
        C9761e c9761e = this.f35690e;
        if (mo41153c0 == -1) {
            mo41153c0 = c9761e.size();
        }
        c9761e.skip(mo41153c0);
    }

    /* renamed from: L0 */
    public final C8524b m31739L0(String str) {
        throw new C8524b(str + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35691f = 0;
        this.f35695j[0] = 8;
        this.f35696k = 1;
        this.f35690e.m41165l();
        this.f35689d.close();
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: f */
    public void mo31740f() {
        int i10 = this.f35691f;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m31746q0();
        }
        if (i11 == 3) {
            m31733F0(1);
            this.f35698m[this.f35696k - 1] = 0;
            this.f35691f = 0;
        } else {
            throw new C8523a("Expected BEGIN_ARRAY but was " + mo31751y() + " at path " + getPath());
        }
    }

    public String getPath() {
        return C6888e.m31753a(this.f35696k, this.f35695j, this.f35697l, this.f35698m);
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: l */
    public void mo31741l() {
        int i10 = this.f35691f;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m31746q0();
        }
        if (i11 == 1) {
            m31733F0(3);
            this.f35691f = 0;
            return;
        }
        throw new C8523a("Expected BEGIN_OBJECT but was " + mo31751y() + " at path " + getPath());
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: o */
    public void mo31742o() {
        int i10 = this.f35691f;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m31746q0();
        }
        if (i11 != 4) {
            throw new C8523a("Expected END_ARRAY but was " + mo31751y() + " at path " + getPath());
        }
        int i12 = this.f35696k - 1;
        this.f35696k = i12;
        int[] iArr = this.f35698m;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f35691f = 0;
    }

    /* renamed from: o0 */
    public final void m31743o0() {
        if (!this.f35687b) {
            throw m31739L0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: p */
    public void mo31744p() {
        int i10 = this.f35691f;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m31746q0();
        }
        if (i11 != 2) {
            throw new C8523a("Expected END_OBJECT but was " + mo31751y() + " at path " + getPath());
        }
        int i12 = this.f35696k - 1;
        this.f35696k = i12;
        this.f35697l[i12] = null;
        int[] iArr = this.f35698m;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f35691f = 0;
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: q */
    public boolean mo31745q() {
        int i10 = this.f35691f;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m31746q0();
        }
        return (i11 == 2 || i11 == 4) ? false : true;
    }

    /* renamed from: q0 */
    public final int m31746q0() {
        int i10;
        int[] iArr = this.f35695j;
        int i11 = this.f35696k;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else {
            if (i12 != 2) {
                if (i12 == 3 || i12 == 5) {
                    iArr[i11 - 1] = 4;
                    if (i12 == 5) {
                        int m31727A0 = m31727A0(true);
                        this.f35690e.readByte();
                        if (m31727A0 != 44) {
                            if (m31727A0 != 59) {
                                if (m31727A0 != 125) {
                                    throw m31739L0("Unterminated object");
                                }
                                i10 = 2;
                            } else {
                                m31743o0();
                            }
                        }
                    }
                    int m31727A02 = m31727A0(true);
                    if (m31727A02 == 34) {
                        this.f35690e.readByte();
                        i10 = 13;
                    } else if (m31727A02 == 39) {
                        this.f35690e.readByte();
                        m31743o0();
                        i10 = 12;
                    } else if (m31727A02 != 125) {
                        m31743o0();
                        if (!m31749v0((char) m31727A02)) {
                            throw m31739L0("Expected name");
                        }
                        i10 = 14;
                    } else {
                        if (i12 == 5) {
                            throw m31739L0("Expected name");
                        }
                        this.f35690e.readByte();
                        i10 = 2;
                    }
                } else if (i12 == 4) {
                    iArr[i11 - 1] = 5;
                    int m31727A03 = m31727A0(true);
                    this.f35690e.readByte();
                    if (m31727A03 != 58) {
                        if (m31727A03 != 61) {
                            throw m31739L0("Expected ':'");
                        }
                        m31743o0();
                        if (this.f35689d.mo41175u(1L) && this.f35690e.m41119B0(0L) == 62) {
                            this.f35690e.readByte();
                        }
                    }
                } else if (i12 == 6) {
                    iArr[i11 - 1] = 7;
                } else if (i12 == 7) {
                    if (m31727A0(false) == -1) {
                        i10 = 17;
                    }
                    m31743o0();
                } else if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f35691f = i10;
                return i10;
            }
            int m31727A04 = m31727A0(true);
            this.f35690e.readByte();
            if (m31727A04 != 44) {
                if (m31727A04 != 59) {
                    if (m31727A04 != 93) {
                        throw m31739L0("Unterminated array");
                    }
                    this.f35691f = 4;
                    return 4;
                }
                m31743o0();
            }
        }
        int m31727A05 = m31727A0(true);
        if (m31727A05 != 34) {
            if (m31727A05 == 39) {
                m31743o0();
                this.f35690e.readByte();
                this.f35691f = 8;
                return 8;
            }
            if (m31727A05 != 44 && m31727A05 != 59) {
                if (m31727A05 == 91) {
                    this.f35690e.readByte();
                    this.f35691f = 3;
                    return 3;
                }
                if (m31727A05 != 93) {
                    if (m31727A05 == 123) {
                        this.f35690e.readByte();
                        this.f35691f = 1;
                        return 1;
                    }
                    int m31731D0 = m31731D0();
                    if (m31731D0 != 0) {
                        return m31731D0;
                    }
                    int m31732E0 = m31732E0();
                    if (m31732E0 != 0) {
                        return m31732E0;
                    }
                    if (!m31749v0(this.f35690e.m41119B0(0L))) {
                        throw m31739L0("Expected value");
                    }
                    m31743o0();
                    i10 = 10;
                } else if (i12 == 1) {
                    this.f35690e.readByte();
                    i10 = 4;
                }
            }
            if (i12 != 1 && i12 != 2) {
                throw m31739L0("Unexpected value");
            }
            m31743o0();
            this.f35691f = 7;
            return 7;
        }
        this.f35690e.readByte();
        i10 = 9;
        this.f35691f = i10;
        return i10;
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: t */
    public boolean mo31747t() {
        int i10 = this.f35691f;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m31746q0();
        }
        if (i11 == 5) {
            this.f35691f = 0;
            int[] iArr = this.f35698m;
            int i12 = this.f35696k - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (i11 == 6) {
            this.f35691f = 0;
            int[] iArr2 = this.f35698m;
            int i13 = this.f35696k - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        }
        throw new C8523a("Expected a boolean but was " + mo31751y() + " at path " + getPath());
    }

    public String toString() {
        return "JsonReader(" + this.f35689d + ")";
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: v */
    public String mo31748v() {
        C9764h c9764h;
        String m31729B0;
        int i10 = this.f35691f;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m31746q0();
        }
        if (i11 == 14) {
            m31729B0 = m31730C0();
        } else {
            if (i11 == 13) {
                c9764h = f35684o;
            } else {
                if (i11 != 12) {
                    throw new C8523a("Expected a name but was " + mo31751y() + " at path " + getPath());
                }
                c9764h = f35683n;
            }
            m31729B0 = m31729B0(c9764h);
        }
        this.f35691f = 0;
        this.f35697l[this.f35696k - 1] = m31729B0;
        return m31729B0;
    }

    /* renamed from: v0 */
    public final boolean m31749v0(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m31743o0();
        return false;
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: w */
    public String mo31750w() {
        String m41135P0;
        C9764h c9764h;
        int i10 = this.f35691f;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m31746q0();
        }
        if (i11 == 10) {
            m41135P0 = m31730C0();
        } else {
            if (i11 == 9) {
                c9764h = f35684o;
            } else if (i11 == 8) {
                c9764h = f35683n;
            } else if (i11 == 11) {
                m41135P0 = this.f35694i;
                this.f35694i = null;
            } else if (i11 == 15) {
                m41135P0 = Long.toString(this.f35692g);
            } else {
                if (i11 != 16) {
                    throw new C8523a("Expected a string but was " + mo31751y() + " at path " + getPath());
                }
                m41135P0 = this.f35690e.m41135P0(this.f35693h);
            }
            m41135P0 = m31729B0(c9764h);
        }
        this.f35691f = 0;
        int[] iArr = this.f35698m;
        int i12 = this.f35696k - 1;
        iArr[i12] = iArr[i12] + 1;
        return m41135P0;
    }

    @Override // p238o3.AbstractC6887d
    /* renamed from: y */
    public AbstractC6887d.a mo31751y() {
        int i10 = this.f35691f;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m31746q0();
        }
        switch (i11) {
            case 1:
                return AbstractC6887d.a.BEGIN_OBJECT;
            case 2:
                return AbstractC6887d.a.END_OBJECT;
            case 3:
                return AbstractC6887d.a.BEGIN_ARRAY;
            case 4:
                return AbstractC6887d.a.END_ARRAY;
            case 5:
            case 6:
                return AbstractC6887d.a.BOOLEAN;
            case 7:
                return AbstractC6887d.a.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC6887d.a.STRING;
            case 12:
            case 13:
            case 14:
                return AbstractC6887d.a.NAME;
            case 15:
            case 16:
                return AbstractC6887d.a.NUMBER;
            case 17:
                return AbstractC6887d.a.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
