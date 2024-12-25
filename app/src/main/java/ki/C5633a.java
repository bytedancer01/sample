package ki;

import ci.C1128n;
import ci.C1129o;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p411xi.C9761e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ki/a.class
 */
/* renamed from: ki.a */
/* loaded from: combined.jar:classes2.jar:ki/a.class */
public final class C5633a {
    /* renamed from: a */
    public static final boolean m27752a(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (C9367f.m39528g(charAt, 31) <= 0 || C9367f.m39528g(charAt, 127) >= 0 || C1129o.m6746N(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m27753b(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        int i14 = i10;
        while (true) {
            boolean z10 = false;
            if (i14 >= i11) {
                if (i13 == i12 + 4) {
                    z10 = true;
                }
                return z10;
            }
            if (i13 == bArr.length) {
                return false;
            }
            int i15 = i14;
            if (i13 != i12) {
                if (str.charAt(i14) != '.') {
                    return false;
                }
                i15 = i14 + 1;
            }
            i14 = i15;
            int i16 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (C9367f.m39528g(charAt, 48) < 0 || C9367f.m39528g(charAt, 57) > 0) {
                    break;
                }
                if (i16 == 0 && i15 != i14) {
                    return false;
                }
                i16 = ((i16 * 10) + charAt) - 48;
                if (i16 > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i15 == 0) {
                return false;
            }
            bArr[i13] = (byte) i16;
            i13++;
        }
    }

    /* renamed from: c */
    public static final InetAddress m27754c(String str, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int m27761E;
        byte[] bArr = new byte[16];
        int i17 = 0;
        int i18 = -1;
        int i19 = -1;
        int i20 = i10;
        while (true) {
            i12 = i17;
            i13 = i18;
            if (i20 >= i11) {
                break;
            }
            if (i17 == 16) {
                return null;
            }
            int i21 = i20 + 2;
            if (i21 <= i11 && C1128n.m6731x(str, "::", i20, false, 4, null)) {
                if (i18 != -1) {
                    return null;
                }
                i12 = i17 + 2;
                if (i21 == i11) {
                    i13 = i12;
                    break;
                }
                i18 = i12;
                i17 = i12;
                i14 = i21;
                i20 = i14;
                i15 = 0;
                while (i20 < i11) {
                    i15 = (i15 << 4) + m27761E;
                    i20++;
                }
                i16 = i20 - i14;
                return i16 == 0 ? null : null;
            }
            i14 = i20;
            if (i17 != 0) {
                if (C1128n.m6731x(str, ":", i20, false, 4, null)) {
                    i14 = i20 + 1;
                } else {
                    if (!C1128n.m6731x(str, InstructionFileId.DOT, i20, false, 4, null) || !m27753b(str, i19, i11, bArr, i17 - 2)) {
                        return null;
                    }
                    i12 = i17 + 2;
                    i13 = i18;
                }
            }
            i20 = i14;
            i15 = 0;
            while (i20 < i11 && (m27761E = C5634b.m27761E(str.charAt(i20))) != -1) {
                i15 = (i15 << 4) + m27761E;
                i20++;
            }
            i16 = i20 - i14;
            if (i16 == 0 && i16 <= 4) {
                int i22 = i17 + 1;
                bArr[i17] = (byte) ((i15 >>> 8) & 255);
                i17 = i22 + 1;
                bArr[i22] = (byte) (i15 & 255);
                i19 = i14;
            }
        }
        if (i12 != 16) {
            if (i13 == -1) {
                return null;
            }
            int i23 = i12 - i13;
            System.arraycopy(bArr, i13, bArr, 16 - i23, i23);
            Arrays.fill(bArr, i13, (16 - i12) + i13, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    /* renamed from: d */
    public static final String m27755d(byte[] bArr) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = i13;
            if (i12 >= bArr.length) {
                break;
            }
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            int i16 = i11;
            int i17 = i10;
            if (i15 > i10) {
                i16 = i11;
                i17 = i10;
                if (i15 >= 4) {
                    i17 = i15;
                    i16 = i12;
                }
            }
            i12 = i14 + 2;
            i11 = i16;
            i13 = i17;
        }
        C9761e c9761e = new C9761e();
        int i18 = 0;
        while (i18 < bArr.length) {
            if (i18 == i11) {
                c9761e.writeByte(58);
                int i19 = i18 + i10;
                i18 = i19;
                if (i19 == 16) {
                    c9761e.writeByte(58);
                    i18 = i19;
                }
            } else {
                if (i18 > 0) {
                    c9761e.writeByte(58);
                }
                c9761e.mo41174s0((C5634b.m27782b(bArr[i18], 255) << 8) | C5634b.m27782b(bArr[i18 + 1], 255));
                i18 += 2;
            }
        }
        return c9761e.m41134O0();
    }

    @Nullable
    /* renamed from: e */
    public static final String m27756e(@NotNull String str) {
        C9367f.m39526e(str, "$this$toCanonicalHost");
        boolean z10 = false;
        if (C1129o.m6736D(str, ":", false, 2, null)) {
            InetAddress m27754c = (C1128n.m6732y(str, "[", false, 2, null) && C1128n.m6718k(str, "]", false, 2, null)) ? m27754c(str, 1, str.length() - 1) : m27754c(str, 0, str.length());
            if (m27754c == null) {
                return null;
            }
            byte[] address = m27754c.getAddress();
            if (address.length == 16) {
                C9367f.m39525d(address, "address");
                return m27755d(address);
            }
            if (address.length == 4) {
                return m27754c.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            String ascii = IDN.toASCII(str);
            C9367f.m39525d(ascii, "IDN.toASCII(host)");
            Locale locale = Locale.US;
            C9367f.m39525d(locale, "Locale.US");
            if (ascii == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = ascii.toLowerCase(locale);
            C9367f.m39525d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                z10 = true;
            }
            if (z10) {
                return null;
            }
            if (m27752a(lowerCase)) {
                lowerCase = null;
            }
            return lowerCase;
        } catch (IllegalArgumentException e10) {
            return null;
        }
    }
}
