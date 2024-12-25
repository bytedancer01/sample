package p366v7;

import ec.C4699b;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.codec.CharEncoding;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p283q7.AbstractC7846h;
import p283q7.C7839a;
import p283q7.C7843e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/h.class
 */
/* renamed from: v7.h */
/* loaded from: combined.jar:classes2.jar:v7/h.class */
public final class C9300h extends AbstractC7846h {

    /* renamed from: b */
    public static final a f42422b = new a() { // from class: v7.g
        @Override // p366v7.C9300h.a
        /* renamed from: a */
        public final boolean mo26502a(int i10, int i11, int i12, int i13, int i14) {
            boolean m39221z;
            m39221z = C9300h.m39221z(i10, i11, i12, i13, i14);
            return m39221z;
        }
    };

    /* renamed from: a */
    public final a f42423a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/h$a.class
     */
    /* renamed from: v7.h$a */
    /* loaded from: combined.jar:classes2.jar:v7/h$a.class */
    public interface a {
        /* renamed from: a */
        boolean mo26502a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/h$b.class
     */
    /* renamed from: v7.h$b */
    /* loaded from: combined.jar:classes2.jar:v7/h$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f42424a;

        /* renamed from: b */
        public final boolean f42425b;

        /* renamed from: c */
        public final int f42426c;

        public b(int i10, boolean z10, int i11) {
            this.f42424a = i10;
            this.f42425b = z10;
            this.f42426c = i11;
        }
    }

    public C9300h() {
        this(null);
    }

    public C9300h(a aVar) {
        this.f42423a = aVar;
    }

    /* renamed from: A */
    public static int m39197A(C4361f0 c4361f0, int i10) {
        byte[] m21988d = c4361f0.m21988d();
        int m21989e = c4361f0.m21989e();
        int i11 = m21989e;
        while (true) {
            int i12 = i11;
            int i13 = i10;
            int i14 = i12 + 1;
            if (i14 >= m21989e + i13) {
                return i13;
            }
            i10 = i13;
            if ((m21988d[i12] & 255) == 255) {
                i10 = i13;
                if (m21988d[i14] == 0) {
                    System.arraycopy(m21988d, i12 + 2, m21988d, i14, (i13 - (i12 - m21989e)) - 2);
                    i10 = i13 - 1;
                }
            }
            i11 = i14;
        }
    }

    /* renamed from: B */
    public static boolean m39198B(C4361f0 c4361f0, int i10, int i11, boolean z10) {
        int m21974G;
        long m21974G2;
        int i12;
        int i13;
        boolean z11;
        int m21989e = c4361f0.m21989e();
        while (c4361f0.m21985a() >= i11) {
            try {
                if (i10 >= 3) {
                    m21974G = c4361f0.m21998n();
                    m21974G2 = c4361f0.m21973F();
                    i12 = c4361f0.m21977J();
                } else {
                    m21974G = c4361f0.m21974G();
                    m21974G2 = c4361f0.m21974G();
                    i12 = 0;
                }
                if (m21974G == 0 && m21974G2 == 0 && i12 == 0) {
                    c4361f0.m21983P(m21989e);
                    return true;
                }
                long j10 = m21974G2;
                if (i10 == 4) {
                    j10 = m21974G2;
                    if (!z10) {
                        if ((8421504 & m21974G2) != 0) {
                            c4361f0.m21983P(m21989e);
                            return false;
                        }
                        j10 = (((m21974G2 >> 24) & 255) << 21) | (m21974G2 & 255) | (((m21974G2 >> 8) & 255) << 7) | (((m21974G2 >> 16) & 255) << 14);
                    }
                }
                if (i10 == 4) {
                    int i14 = (i12 & 64) != 0 ? 1 : 0;
                    i13 = i14;
                    if ((i12 & 1) != 0) {
                        i13 = i14;
                        z11 = true;
                    }
                    z11 = false;
                } else {
                    if (i10 == 3) {
                        int i15 = (i12 & 32) != 0 ? 1 : 0;
                        i13 = i15;
                        if ((i12 & 128) != 0) {
                            i13 = i15;
                            z11 = true;
                        }
                    } else {
                        i13 = 0;
                    }
                    z11 = false;
                }
                int i16 = i13;
                if (z11) {
                    i16 = i13 + 4;
                }
                if (j10 < i16) {
                    c4361f0.m21983P(m21989e);
                    return false;
                }
                if (c4361f0.m21985a() < j10) {
                    c4361f0.m21983P(m21989e);
                    return false;
                }
                c4361f0.m21984Q((int) j10);
            } catch (Throwable th2) {
                c4361f0.m21983P(m21989e);
                throw th2;
            }
        }
        c4361f0.m21983P(m21989e);
        return true;
    }

    /* renamed from: d */
    public static byte[] m39200d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? C4401z0.f26684f : Arrays.copyOfRange(bArr, i10, i11);
    }

    /* renamed from: f */
    public static C9293a m39201f(C4361f0 c4361f0, int i10, int i11) {
        int m39220y;
        String m23638e;
        int m21971D = c4361f0.m21971D();
        String m39217v = m39217v(m21971D);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        c4361f0.m21994j(bArr, 0, i12);
        if (i11 == 2) {
            String str = "image/" + C4699b.m23638e(new String(bArr, 0, 3, "ISO-8859-1"));
            m23638e = str;
            if ("image/jpg".equals(str)) {
                m23638e = "image/jpeg";
            }
            m39220y = 2;
        } else {
            m39220y = m39220y(bArr, 0);
            m23638e = C4699b.m23638e(new String(bArr, 0, m39220y, "ISO-8859-1"));
            if (m23638e.indexOf(47) == -1) {
                m23638e = "image/" + m23638e;
            }
        }
        byte b10 = bArr[m39220y + 1];
        int i13 = m39220y + 2;
        int m39219x = m39219x(bArr, i13, m21971D);
        return new C9293a(m23638e, new String(bArr, i13, m39219x - i13, m39217v), b10 & 255, m39200d(bArr, m39219x + m39216u(m21971D), i12));
    }

    /* renamed from: g */
    public static C9294b m39202g(C4361f0 c4361f0, int i10, String str) {
        byte[] bArr = new byte[i10];
        c4361f0.m21994j(bArr, 0, i10);
        return new C9294b(str, bArr);
    }

    /* renamed from: h */
    public static C9295c m39203h(C4361f0 c4361f0, int i10, int i11, boolean z10, int i12, a aVar) {
        int m21989e = c4361f0.m21989e();
        int m39220y = m39220y(c4361f0.m21988d(), m21989e);
        String str = new String(c4361f0.m21988d(), m21989e, m39220y - m21989e, "ISO-8859-1");
        c4361f0.m21983P(m39220y + 1);
        int m21998n = c4361f0.m21998n();
        int m21998n2 = c4361f0.m21998n();
        long m21973F = c4361f0.m21973F();
        if (m21973F == 4294967295L) {
            m21973F = -1;
        }
        long m21973F2 = c4361f0.m21973F();
        if (m21973F2 == 4294967295L) {
            m21973F2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        while (c4361f0.m21989e() < m21989e + i10) {
            AbstractC9301i m39206k = m39206k(i11, c4361f0, z10, i12, aVar);
            if (m39206k != null) {
                arrayList.add(m39206k);
            }
        }
        return new C9295c(str, m21998n, m21998n2, m21973F, m21973F2, (AbstractC9301i[]) arrayList.toArray(new AbstractC9301i[0]));
    }

    /* renamed from: i */
    public static C9296d m39204i(C4361f0 c4361f0, int i10, int i11, boolean z10, int i12, a aVar) {
        int m21989e = c4361f0.m21989e();
        int m39220y = m39220y(c4361f0.m21988d(), m21989e);
        String str = new String(c4361f0.m21988d(), m21989e, m39220y - m21989e, "ISO-8859-1");
        c4361f0.m21983P(m39220y + 1);
        int m21971D = c4361f0.m21971D();
        boolean z11 = (m21971D & 2) != 0;
        boolean z12 = (m21971D & 1) != 0;
        int m21971D2 = c4361f0.m21971D();
        String[] strArr = new String[m21971D2];
        for (int i13 = 0; i13 < m21971D2; i13++) {
            int m21989e2 = c4361f0.m21989e();
            int m39220y2 = m39220y(c4361f0.m21988d(), m21989e2);
            strArr[i13] = new String(c4361f0.m21988d(), m21989e2, m39220y2 - m21989e2, "ISO-8859-1");
            c4361f0.m21983P(m39220y2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        while (c4361f0.m21989e() < m21989e + i10) {
            AbstractC9301i m39206k = m39206k(i11, c4361f0, z10, i12, aVar);
            if (m39206k != null) {
                arrayList.add(m39206k);
            }
        }
        return new C9296d(str, z11, z12, strArr, (AbstractC9301i[]) arrayList.toArray(new AbstractC9301i[0]));
    }

    /* renamed from: j */
    public static C9297e m39205j(C4361f0 c4361f0, int i10) {
        if (i10 < 4) {
            return null;
        }
        int m21971D = c4361f0.m21971D();
        String m39217v = m39217v(m21971D);
        byte[] bArr = new byte[3];
        c4361f0.m21994j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        c4361f0.m21994j(bArr2, 0, i11);
        int m39219x = m39219x(bArr2, 0, m21971D);
        String str2 = new String(bArr2, 0, m39219x, m39217v);
        int m39216u = m39219x + m39216u(m21971D);
        return new C9297e(str, str2, m39211p(bArr2, m39216u, m39219x(bArr2, m39216u, m21971D), m39217v));
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: k */
    public static AbstractC9301i m39206k(int i10, C4361f0 c4361f0, boolean z10, int i11, a aVar) {
        int m21975H;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int m21971D = c4361f0.m21971D();
        int m21971D2 = c4361f0.m21971D();
        int m21971D3 = c4361f0.m21971D();
        int m21971D4 = i10 >= 3 ? c4361f0.m21971D() : 0;
        if (i10 == 4) {
            int m21975H2 = c4361f0.m21975H();
            m21975H = m21975H2;
            if (!z10) {
                m21975H = (((m21975H2 >> 24) & 255) << 21) | (m21975H2 & 255) | (((m21975H2 >> 8) & 255) << 7) | (((m21975H2 >> 16) & 255) << 14);
            }
        } else {
            m21975H = i10 == 3 ? c4361f0.m21975H() : c4361f0.m21974G();
        }
        int i12 = m21975H;
        int m21977J = i10 >= 3 ? c4361f0.m21977J() : 0;
        if (m21971D == 0 && m21971D2 == 0 && m21971D3 == 0 && m21971D4 == 0 && i12 == 0 && m21977J == 0) {
            c4361f0.m21983P(c4361f0.m21990f());
            return null;
        }
        int m21989e = c4361f0.m21989e() + i12;
        if (m21989e > c4361f0.m21990f()) {
            C4392v.m22275i("Id3Decoder", "Frame size exceeds remaining tag data");
            c4361f0.m21983P(c4361f0.m21990f());
            return null;
        }
        if (aVar != null && !aVar.mo26502a(i10, m21971D, m21971D2, m21971D3, m21971D4)) {
            c4361f0.m21983P(m21989e);
            return null;
        }
        if (i10 == 3) {
            z12 = (m21977J & 128) != 0;
            z13 = (m21977J & 64) != 0;
            z11 = (m21977J & 32) != 0;
            z15 = z12;
            z14 = false;
        } else if (i10 == 4) {
            z11 = (m21977J & 64) != 0;
            boolean z16 = (m21977J & 8) != 0;
            z13 = (m21977J & 4) != 0;
            z14 = (m21977J & 2) != 0;
            boolean z17 = (m21977J & 1) != 0;
            z15 = z16;
            z12 = z17;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z15 || z13) {
            C4392v.m22275i("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c4361f0.m21983P(m21989e);
            return null;
        }
        int i13 = i12;
        if (z11) {
            i13 = i12 - 1;
            c4361f0.m21984Q(1);
        }
        int i14 = i13;
        if (z12) {
            i14 = i13 - 4;
            c4361f0.m21984Q(4);
        }
        int i15 = i14;
        if (z14) {
            i15 = m39197A(c4361f0, i14);
        }
        try {
            try {
                AbstractC9301i m39213r = (m21971D == 84 && m21971D2 == 88 && m21971D3 == 88 && (i10 == 2 || m21971D4 == 88)) ? m39213r(c4361f0, i15) : m21971D == 84 ? m39212q(c4361f0, i15, m39218w(i10, m21971D, m21971D2, m21971D3, m21971D4)) : (m21971D == 87 && m21971D2 == 88 && m21971D3 == 88 && (i10 == 2 || m21971D4 == 88)) ? m39215t(c4361f0, i15) : m21971D == 87 ? m39214s(c4361f0, i15, m39218w(i10, m21971D, m21971D2, m21971D3, m21971D4)) : (m21971D == 80 && m21971D2 == 82 && m21971D3 == 73 && m21971D4 == 86) ? m39210o(c4361f0, i15) : (m21971D == 71 && m21971D2 == 69 && m21971D3 == 79 && (m21971D4 == 66 || i10 == 2)) ? m39207l(c4361f0, i15) : (i10 != 2 ? !(m21971D == 65 && m21971D2 == 80 && m21971D3 == 73 && m21971D4 == 67) : !(m21971D == 80 && m21971D2 == 73 && m21971D3 == 67)) ? (m21971D == 67 && m21971D2 == 79 && m21971D3 == 77 && (m21971D4 == 77 || i10 == 2)) ? m39205j(c4361f0, i15) : (m21971D == 67 && m21971D2 == 72 && m21971D3 == 65 && m21971D4 == 80) ? m39203h(c4361f0, i15, i10, z10, i11, aVar) : (m21971D == 67 && m21971D2 == 84 && m21971D3 == 79 && m21971D4 == 67) ? m39204i(c4361f0, i15, i10, z10, i11, aVar) : (m21971D == 77 && m21971D2 == 76 && m21971D3 == 76 && m21971D4 == 84) ? m39209n(c4361f0, i15) : m39202g(c4361f0, i15, m39218w(i10, m21971D, m21971D2, m21971D3, m21971D4)) : m39201f(c4361f0, i15, i10);
                if (m39213r == null) {
                    C4392v.m22275i("Id3Decoder", "Failed to decode frame: id=" + m39218w(i10, m21971D, m21971D2, m21971D3, m21971D4) + ", frameSize=" + i15);
                }
                c4361f0.m21983P(m21989e);
                return m39213r;
            } catch (UnsupportedEncodingException e10) {
                C4392v.m22275i("Id3Decoder", "Unsupported character encoding");
                c4361f0.m21983P(m21989e);
                return null;
            }
        } catch (Throwable th2) {
            c4361f0.m21983P(m21989e);
            throw th2;
        }
    }

    /* renamed from: l */
    public static C9298f m39207l(C4361f0 c4361f0, int i10) {
        int m21971D = c4361f0.m21971D();
        String m39217v = m39217v(m21971D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c4361f0.m21994j(bArr, 0, i11);
        int m39220y = m39220y(bArr, 0);
        String str = new String(bArr, 0, m39220y, "ISO-8859-1");
        int i12 = m39220y + 1;
        int m39219x = m39219x(bArr, i12, m21971D);
        String m39211p = m39211p(bArr, i12, m39219x, m39217v);
        int m39216u = m39219x + m39216u(m21971D);
        int m39219x2 = m39219x(bArr, m39216u, m21971D);
        return new C9298f(str, m39211p, m39211p(bArr, m39216u, m39219x2, m39217v), m39200d(bArr, m39219x2 + m39216u(m21971D), i11));
    }

    /* renamed from: m */
    public static b m39208m(C4361f0 c4361f0) {
        StringBuilder sb2;
        int i10;
        String str;
        if (c4361f0.m21985a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int m21974G = c4361f0.m21974G();
            if (m21974G == 4801587) {
                int m21971D = c4361f0.m21971D();
                c4361f0.m21984Q(1);
                int m21971D2 = c4361f0.m21971D();
                int m21970C = c4361f0.m21970C();
                if (m21971D == 2) {
                    i10 = m21970C;
                    if ((m21971D2 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (m21971D == 3) {
                    i10 = m21970C;
                    if ((m21971D2 & 64) != 0) {
                        int m21998n = c4361f0.m21998n();
                        c4361f0.m21984Q(m21998n);
                        i10 = m21970C - (m21998n + 4);
                    }
                } else if (m21971D == 4) {
                    int i11 = m21970C;
                    if ((m21971D2 & 64) != 0) {
                        int m21970C2 = c4361f0.m21970C();
                        c4361f0.m21984Q(m21970C2 - 4);
                        i11 = m21970C - m21970C2;
                    }
                    i10 = i11;
                    if ((m21971D2 & 16) != 0) {
                        i10 = i11 - 10;
                    }
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb2.append(m21971D);
                }
                boolean z10 = false;
                if (m21971D < 4) {
                    z10 = false;
                    if ((m21971D2 & 128) != 0) {
                        z10 = true;
                    }
                }
                return new b(m21971D, z10, i10);
            }
            sb2 = new StringBuilder();
            sb2.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb2.append(String.format("%06X", Integer.valueOf(m21974G)));
            str = sb2.toString();
        }
        C4392v.m22275i("Id3Decoder", str);
        return null;
    }

    /* renamed from: n */
    public static C9303k m39209n(C4361f0 c4361f0, int i10) {
        int m21977J = c4361f0.m21977J();
        int m21974G = c4361f0.m21974G();
        int m21974G2 = c4361f0.m21974G();
        int m21971D = c4361f0.m21971D();
        int m21971D2 = c4361f0.m21971D();
        C4359e0 c4359e0 = new C4359e0();
        c4359e0.m21955m(c4361f0);
        int i11 = ((i10 - 10) * 8) / (m21971D + m21971D2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int m21950h = c4359e0.m21950h(m21971D);
            int m21950h2 = c4359e0.m21950h(m21971D2);
            iArr[i12] = m21950h;
            iArr2[i12] = m21950h2;
        }
        return new C9303k(m21977J, m21974G, m21974G2, iArr, iArr2);
    }

    /* renamed from: o */
    public static C9304l m39210o(C4361f0 c4361f0, int i10) {
        byte[] bArr = new byte[i10];
        c4361f0.m21994j(bArr, 0, i10);
        int m39220y = m39220y(bArr, 0);
        return new C9304l(new String(bArr, 0, m39220y, "ISO-8859-1"), m39200d(bArr, m39220y + 1, i10));
    }

    /* renamed from: p */
    public static String m39211p(byte[] bArr, int i10, int i11, String str) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    /* renamed from: q */
    public static C9305m m39212q(C4361f0 c4361f0, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int m21971D = c4361f0.m21971D();
        String m39217v = m39217v(m21971D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c4361f0.m21994j(bArr, 0, i11);
        return new C9305m(str, null, new String(bArr, 0, m39219x(bArr, 0, m21971D), m39217v));
    }

    /* renamed from: r */
    public static C9305m m39213r(C4361f0 c4361f0, int i10) {
        if (i10 < 1) {
            return null;
        }
        int m21971D = c4361f0.m21971D();
        String m39217v = m39217v(m21971D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c4361f0.m21994j(bArr, 0, i11);
        int m39219x = m39219x(bArr, 0, m21971D);
        String str = new String(bArr, 0, m39219x, m39217v);
        int m39216u = m39219x + m39216u(m21971D);
        return new C9305m("TXXX", str, m39211p(bArr, m39216u, m39219x(bArr, m39216u, m21971D), m39217v));
    }

    /* renamed from: s */
    public static C9306n m39214s(C4361f0 c4361f0, int i10, String str) {
        byte[] bArr = new byte[i10];
        c4361f0.m21994j(bArr, 0, i10);
        return new C9306n(str, null, new String(bArr, 0, m39220y(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: t */
    public static C9306n m39215t(C4361f0 c4361f0, int i10) {
        if (i10 < 1) {
            return null;
        }
        int m21971D = c4361f0.m21971D();
        String m39217v = m39217v(m21971D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c4361f0.m21994j(bArr, 0, i11);
        int m39219x = m39219x(bArr, 0, m21971D);
        String str = new String(bArr, 0, m39219x, m39217v);
        int m39216u = m39219x + m39216u(m21971D);
        return new C9306n("WXXX", str, m39211p(bArr, m39216u, m39220y(bArr, m39216u), "ISO-8859-1"));
    }

    /* renamed from: u */
    public static int m39216u(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    /* renamed from: v */
    public static String m39217v(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : CharEncoding.UTF_16BE : "UTF-16";
    }

    /* renamed from: w */
    public static String m39218w(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    /* renamed from: x */
    public static int m39219x(byte[] bArr, int i10, int i11) {
        int m39220y = m39220y(bArr, i10);
        if (i11 != 0) {
            int i12 = m39220y;
            if (i11 != 3) {
                while (i12 < bArr.length - 1) {
                    if (i12 % 2 == 0 && bArr[i12 + 1] == 0) {
                        return i12;
                    }
                    i12 = m39220y(bArr, i12 + 1);
                }
                return bArr.length;
            }
        }
        return m39220y;
    }

    /* renamed from: y */
    public static int m39220y(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m39221z(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // p283q7.AbstractC7846h
    /* renamed from: b */
    public C7839a mo34101b(C7843e c7843e, ByteBuffer byteBuffer) {
        return m39222e(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: e */
    public C7839a m39222e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        C4361f0 c4361f0 = new C4361f0(bArr, i10);
        b m39208m = m39208m(c4361f0);
        if (m39208m == null) {
            return null;
        }
        int m21989e = c4361f0.m21989e();
        int i11 = m39208m.f42424a == 2 ? 6 : 10;
        int i12 = m39208m.f42426c;
        if (m39208m.f42425b) {
            i12 = m39197A(c4361f0, m39208m.f42426c);
        }
        c4361f0.m21982O(m21989e + i12);
        boolean z10 = false;
        if (!m39198B(c4361f0, m39208m.f42424a, i11, false)) {
            if (m39208m.f42424a != 4 || !m39198B(c4361f0, 4, i11, true)) {
                C4392v.m22275i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m39208m.f42424a);
                return null;
            }
            z10 = true;
        }
        while (c4361f0.m21985a() >= i11) {
            AbstractC9301i m39206k = m39206k(m39208m.f42424a, c4361f0, z10, i11, this.f42423a);
            if (m39206k != null) {
                arrayList.add(m39206k);
            }
        }
        return new C7839a(arrayList);
    }
}
