package p305ra;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/i9.class
 */
/* renamed from: ra.i9 */
/* loaded from: combined.jar:classes2.jar:ra/i9.class */
public final class C8189i9 {

    /* renamed from: a */
    public static final AbstractC8129e9 f39125a;

    static {
        f39125a = (C8099c9.m35126l() && C8099c9.m35127m() && !C8379v4.m35962a()) ? new C8174h9() : new C8144f9();
    }

    /* renamed from: a */
    public static boolean m35455a(byte[] bArr) {
        return f39125a.m35321a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static boolean m35456b(byte[] bArr, int i10, int i11) {
        return f39125a.m35321a(bArr, i10, i11);
    }

    /* renamed from: c */
    public static int m35457c(CharSequence charSequence) {
        int i10;
        int i11;
        int length = charSequence.length();
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            i10 = i13;
            if (i12 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = charSequence.length();
                int i14 = 0;
                while (i12 < length2) {
                    char charAt2 = charSequence.charAt(i12);
                    if (charAt2 < 2048) {
                        i14 += (127 - charAt2) >>> 31;
                        i11 = i12;
                    } else {
                        int i15 = i14 + 2;
                        i14 = i15;
                        i11 = i12;
                        if (charAt2 >= 55296) {
                            i14 = i15;
                            i11 = i12;
                            if (charAt2 > 57343) {
                                continue;
                            } else {
                                if (Character.codePointAt(charSequence, i12) < 65536) {
                                    throw new C8159g9(i12, length2);
                                }
                                i11 = i12 + 1;
                                i14 = i15;
                            }
                        } else {
                            continue;
                        }
                    }
                    i12 = i11 + 1;
                }
                i10 = i13 + i14;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i10 + IjkMediaMeta.AV_CH_WIDE_RIGHT);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    public static int m35458d(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f39125a.mo35324d(charSequence, bArr, i10, i11);
    }

    /* renamed from: e */
    public static String m35459e(byte[] bArr, int i10, int i11) {
        return f39125a.mo35323c(bArr, i10, i11);
    }

    /* renamed from: h */
    public static /* synthetic */ int m35462h(byte[] bArr, int i10, int i11) {
        int m35464j;
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            m35464j = m35464j(b10);
        } else if (i12 == 1) {
            m35464j = m35465k(b10, bArr[i10]);
        } else {
            if (i12 != 2) {
                throw new AssertionError();
            }
            m35464j = m35466l(b10, bArr[i10], bArr[i10 + 1]);
        }
        return m35464j;
    }

    /* renamed from: j */
    public static int m35464j(int i10) {
        int i11 = i10;
        if (i10 > -12) {
            i11 = -1;
        }
        return i11;
    }

    /* renamed from: k */
    public static int m35465k(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* renamed from: l */
    public static int m35466l(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
