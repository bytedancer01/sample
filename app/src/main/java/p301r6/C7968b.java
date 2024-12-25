package p301r6;

import java.nio.ByteBuffer;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpStatus;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p267p6.C7629w0;
import p365v6.C9273n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/b.class
 */
/* renamed from: r6.b */
/* loaded from: combined.jar:classes2.jar:r6/b.class */
public final class C7968b {

    /* renamed from: a */
    public static final int[] f38461a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f38462b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f38463c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f38464d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f38465e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f38466f = {69, 87, 104, 121, 139, 174, 208, TelnetCommand.BREAK, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/b$b.class
     */
    /* renamed from: r6.b$b */
    /* loaded from: combined.jar:classes2.jar:r6/b$b.class */
    public static final class b {

        /* renamed from: a */
        public final String f38467a;

        /* renamed from: b */
        public final int f38468b;

        /* renamed from: c */
        public final int f38469c;

        /* renamed from: d */
        public final int f38470d;

        /* renamed from: e */
        public final int f38471e;

        /* renamed from: f */
        public final int f38472f;

        public b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f38467a = str;
            this.f38468b = i10;
            this.f38470d = i11;
            this.f38469c = i12;
            this.f38471e = i13;
            this.f38472f = i14;
        }
    }

    /* renamed from: a */
    public static int m34536a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        for (int i10 = position; i10 <= limit - 10; i10++) {
            if ((C4401z0.m22331J(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m34537b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f38462b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f38466f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f38465e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    /* renamed from: c */
    public static C7629w0 m34538c(C4361f0 c4361f0, String str, String str2, C9273n c9273n) {
        int i10 = f38462b[(c4361f0.m21971D() & 192) >> 6];
        int m21971D = c4361f0.m21971D();
        int i11 = f38464d[(m21971D & 56) >> 3];
        int i12 = i11;
        if ((m21971D & 4) != 0) {
            i12 = i11 + 1;
        }
        return new C7629w0.b().m33208S(str).m33220e0("audio/ac3").m33197H(i12).m33221f0(i10).m33201L(c9273n).m33211V(str2).m33194E();
    }

    /* renamed from: d */
    public static int m34539d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f38461a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) == 3 ? 3 : (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] * 256;
        }
        return 1536;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static b m34540e(C4359e0 c4359e0) {
        int m34537b;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int m21950h;
        int i14;
        int i15;
        int m21947e = c4359e0.m21947e();
        c4359e0.m21960r(40);
        byte b10 = c4359e0.m21950h(5) > 10;
        c4359e0.m21958p(m21947e);
        if (b10 == true) {
            c4359e0.m21960r(16);
            int m21950h2 = c4359e0.m21950h(2);
            i13 = m21950h2 != 0 ? m21950h2 != 1 ? m21950h2 != 2 ? -1 : 2 : 1 : 0;
            c4359e0.m21960r(3);
            int m21950h3 = c4359e0.m21950h(11);
            int m21950h4 = c4359e0.m21950h(2);
            if (m21950h4 == 3) {
                i15 = f38463c[c4359e0.m21950h(2)];
                m21950h = 3;
                i14 = 6;
            } else {
                m21950h = c4359e0.m21950h(2);
                i14 = f38461a[m21950h];
                i15 = f38462b[m21950h4];
            }
            int m21950h5 = c4359e0.m21950h(3);
            boolean m21949g = c4359e0.m21949g();
            int i16 = f38464d[m21950h5];
            c4359e0.m21960r(10);
            if (c4359e0.m21949g()) {
                c4359e0.m21960r(8);
            }
            if (m21950h5 == 0) {
                c4359e0.m21960r(5);
                if (c4359e0.m21949g()) {
                    c4359e0.m21960r(8);
                }
            }
            if (i13 == 1 && c4359e0.m21949g()) {
                c4359e0.m21960r(16);
            }
            if (c4359e0.m21949g()) {
                if (m21950h5 > 2) {
                    c4359e0.m21960r(2);
                }
                if ((m21950h5 & 1) != 0 && m21950h5 > 2) {
                    c4359e0.m21960r(6);
                }
                if ((m21950h5 & 4) != 0) {
                    c4359e0.m21960r(6);
                }
                if (m21949g && c4359e0.m21949g()) {
                    c4359e0.m21960r(5);
                }
                if (i13 == 0) {
                    if (c4359e0.m21949g()) {
                        c4359e0.m21960r(6);
                    }
                    if (m21950h5 == 0 && c4359e0.m21949g()) {
                        c4359e0.m21960r(6);
                    }
                    if (c4359e0.m21949g()) {
                        c4359e0.m21960r(6);
                    }
                    int m21950h6 = c4359e0.m21950h(2);
                    if (m21950h6 == 1) {
                        c4359e0.m21960r(5);
                    } else if (m21950h6 == 2) {
                        c4359e0.m21960r(12);
                    } else if (m21950h6 == 3) {
                        int m21950h7 = c4359e0.m21950h(5);
                        if (c4359e0.m21949g()) {
                            c4359e0.m21960r(5);
                            if (c4359e0.m21949g()) {
                                c4359e0.m21960r(4);
                            }
                            if (c4359e0.m21949g()) {
                                c4359e0.m21960r(4);
                            }
                            if (c4359e0.m21949g()) {
                                c4359e0.m21960r(4);
                            }
                            if (c4359e0.m21949g()) {
                                c4359e0.m21960r(4);
                            }
                            if (c4359e0.m21949g()) {
                                c4359e0.m21960r(4);
                            }
                            if (c4359e0.m21949g()) {
                                c4359e0.m21960r(4);
                            }
                            if (c4359e0.m21949g()) {
                                c4359e0.m21960r(4);
                            }
                            if (c4359e0.m21949g()) {
                                if (c4359e0.m21949g()) {
                                    c4359e0.m21960r(4);
                                }
                                if (c4359e0.m21949g()) {
                                    c4359e0.m21960r(4);
                                }
                            }
                        }
                        if (c4359e0.m21949g()) {
                            c4359e0.m21960r(5);
                            if (c4359e0.m21949g()) {
                                c4359e0.m21960r(7);
                                if (c4359e0.m21949g()) {
                                    c4359e0.m21960r(8);
                                }
                            }
                        }
                        c4359e0.m21960r((m21950h7 + 2) * 8);
                        c4359e0.m21945c();
                    }
                    if (m21950h5 < 2) {
                        if (c4359e0.m21949g()) {
                            c4359e0.m21960r(14);
                        }
                        if (m21950h5 == 0 && c4359e0.m21949g()) {
                            c4359e0.m21960r(14);
                        }
                    }
                    if (c4359e0.m21949g()) {
                        if (m21950h == 0) {
                            c4359e0.m21960r(5);
                        } else {
                            for (int i17 = 0; i17 < i14; i17++) {
                                if (c4359e0.m21949g()) {
                                    c4359e0.m21960r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c4359e0.m21949g()) {
                c4359e0.m21960r(5);
                if (m21950h5 == 2) {
                    c4359e0.m21960r(4);
                }
                if (m21950h5 >= 6) {
                    c4359e0.m21960r(2);
                }
                if (c4359e0.m21949g()) {
                    c4359e0.m21960r(8);
                }
                if (m21950h5 == 0 && c4359e0.m21949g()) {
                    c4359e0.m21960r(8);
                }
                if (m21950h4 < 3) {
                    c4359e0.m21959q();
                }
            }
            if (i13 == 0 && m21950h != 3) {
                c4359e0.m21959q();
            }
            if (i13 == 2 && (m21950h == 3 || c4359e0.m21949g())) {
                c4359e0.m21960r(6);
            }
            str = (c4359e0.m21949g() && c4359e0.m21950h(6) == 1 && c4359e0.m21950h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i14 * 256;
            i10 = i16 + (m21949g ? 1 : 0);
            i12 = i15;
            m34537b = (m21950h3 + 1) * 2;
        } else {
            c4359e0.m21960r(32);
            int m21950h8 = c4359e0.m21950h(2);
            String str2 = m21950h8 == 3 ? null : "audio/ac3";
            m34537b = m34537b(m21950h8, c4359e0.m21950h(6));
            c4359e0.m21960r(8);
            int m21950h9 = c4359e0.m21950h(3);
            if ((m21950h9 & 1) != 0 && m21950h9 != 1) {
                c4359e0.m21960r(2);
            }
            if ((m21950h9 & 4) != 0) {
                c4359e0.m21960r(2);
            }
            if (m21950h9 == 2) {
                c4359e0.m21960r(2);
            }
            int[] iArr = f38462b;
            int i18 = m21950h8 < iArr.length ? iArr[m21950h8] : -1;
            boolean m21949g2 = c4359e0.m21949g();
            str = str2;
            i10 = f38464d[m21950h9] + (m21949g2 ? 1 : 0);
            i11 = 1536;
            i12 = i18;
            i13 = -1;
        }
        return new b(str, i13, i10, i12, m34537b, i11);
    }

    /* renamed from: f */
    public static int m34541f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return m34537b((b10 & 192) >> 6, b10 & 63);
    }

    /* renamed from: g */
    public static C7629w0 m34542g(C4361f0 c4361f0, String str, String str2, C9273n c9273n) {
        c4361f0.m21984Q(2);
        int i10 = f38462b[(c4361f0.m21971D() & 192) >> 6];
        int m21971D = c4361f0.m21971D();
        int i11 = f38464d[(m21971D & 14) >> 1];
        int i12 = i11;
        if ((m21971D & 1) != 0) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (((c4361f0.m21971D() & 30) >> 1) > 0) {
            i13 = i12;
            if ((2 & c4361f0.m21971D()) != 0) {
                i13 = i12 + 2;
            }
        }
        return new C7629w0.b().m33208S(str).m33220e0((c4361f0.m21985a() <= 0 || (c4361f0.m21971D() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").m33197H(i13).m33221f0(i10).m33201L(c9273n).m33211V(str2).m33194E();
    }

    /* renamed from: h */
    public static int m34543h(ByteBuffer byteBuffer, int i10) {
        boolean z10 = (byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + (z10 ? 9 : 8)) >> 4) & 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static int m34544i(byte[] bArr) {
        byte b10 = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111) {
            return 0;
        }
        byte b11 = bArr[7];
        if ((b11 & TelnetCommand.DONT) != 186) {
            return 0;
        }
        if ((b11 & 255) == 187) {
            b10 = true;
        }
        return 40 << ((bArr[(b10 != false ? (byte) 9 : (byte) 8) == true ? 1 : 0] >> 4) & 7);
    }
}
