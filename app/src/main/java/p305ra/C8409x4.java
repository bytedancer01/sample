package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/x4.class
 */
/* renamed from: ra.x4 */
/* loaded from: combined.jar:classes2.jar:ra/x4.class */
public final class C8409x4 {
    /* renamed from: a */
    public static int m36066a(byte[] bArr, int i10, C8394w4 c8394w4) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return m36067b(b10, bArr, i11, c8394w4);
        }
        c8394w4.f39360a = b10;
        return i11;
    }

    /* renamed from: b */
    public static int m36067b(int i10, byte[] bArr, int i11, C8394w4 c8394w4) {
        int i12;
        int i13;
        int i14;
        int i15 = i10 & 127;
        int i16 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 7);
            int i18 = i16 + 1;
            byte b11 = bArr[i16];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                int i19 = i17 | ((b11 & Byte.MAX_VALUE) << 14);
                int i20 = i18 + 1;
                byte b12 = bArr[i18];
                if (b12 >= 0) {
                    i13 = i20;
                    i15 = i19;
                    i14 = b12 << 21;
                } else {
                    i17 = i19 | ((b12 & Byte.MAX_VALUE) << 21);
                    i18 = i20 + 1;
                    byte b13 = bArr[i20];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        while (true) {
                            int i21 = i18 + 1;
                            if (bArr[i18] >= 0) {
                                c8394w4.f39360a = i17 | ((b13 & Byte.MAX_VALUE) << 28);
                                return i21;
                            }
                            i18 = i21;
                        }
                    }
                }
            }
            c8394w4.f39360a = i17 | i12;
            return i18;
        }
        i14 = b10 << 7;
        i13 = i16;
        c8394w4.f39360a = i15 | i14;
        return i13;
    }

    /* renamed from: c */
    public static int m36068c(byte[] bArr, int i10, C8394w4 c8394w4) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            c8394w4.f39361b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            b10 = bArr[i12];
            i13 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i13;
            i12++;
        }
        c8394w4.f39361b = j11;
        return i12;
    }

    /* renamed from: d */
    public static int m36069d(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* renamed from: e */
    public static long m36070e(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* renamed from: f */
    public static int m36071f(byte[] bArr, int i10, C8394w4 c8394w4) {
        int m36066a = m36066a(bArr, i10, c8394w4);
        int i11 = c8394w4.f39360a;
        if (i11 < 0) {
            throw C8396w6.m35987b();
        }
        if (i11 == 0) {
            c8394w4.f39362c = "";
            return m36066a;
        }
        c8394w4.f39362c = new String(bArr, m36066a, i11, C8366u6.f39298a);
        return m36066a + i11;
    }

    /* renamed from: g */
    public static int m36072g(byte[] bArr, int i10, C8394w4 c8394w4) {
        int m36066a = m36066a(bArr, i10, c8394w4);
        int i11 = c8394w4.f39360a;
        if (i11 < 0) {
            throw C8396w6.m35987b();
        }
        if (i11 == 0) {
            c8394w4.f39362c = "";
            return m36066a;
        }
        c8394w4.f39362c = C8189i9.m35459e(bArr, m36066a, i11);
        return m36066a + i11;
    }

    /* renamed from: h */
    public static int m36073h(byte[] bArr, int i10, C8394w4 c8394w4) {
        int m36066a = m36066a(bArr, i10, c8394w4);
        int i11 = c8394w4.f39360a;
        if (i11 < 0) {
            throw C8396w6.m35987b();
        }
        if (i11 > bArr.length - m36066a) {
            throw C8396w6.m35986a();
        }
        if (i11 == 0) {
            c8394w4.f39362c = AbstractC8230l5.f39165c;
            return m36066a;
        }
        c8394w4.f39362c = AbstractC8230l5.m35569t(bArr, m36066a, i11);
        return m36066a + i11;
    }

    /* renamed from: i */
    public static int m36074i(InterfaceC8098c8 interfaceC8098c8, byte[] bArr, int i10, int i11, C8394w4 c8394w4) {
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        int i13 = i12;
        int i14 = b10;
        if (b10 < 0) {
            i13 = m36067b(b10, bArr, i12, c8394w4);
            i14 = c8394w4.f39360a;
        }
        if (i14 < 0 || i14 > i11 - i13) {
            throw C8396w6.m35986a();
        }
        Object zza = interfaceC8098c8.zza();
        int i15 = i14 + i13;
        interfaceC8098c8.mo35098c(zza, bArr, i13, i15, c8394w4);
        interfaceC8098c8.mo35102g(zza);
        c8394w4.f39362c = zza;
        return i15;
    }

    /* renamed from: j */
    public static int m36075j(InterfaceC8098c8 interfaceC8098c8, byte[] bArr, int i10, int i11, int i12, C8394w4 c8394w4) {
        C8367u7 c8367u7 = (C8367u7) interfaceC8098c8;
        Object zza = c8367u7.zza();
        int m35924D = c8367u7.m35924D(zza, bArr, i10, i11, i12, c8394w4);
        c8367u7.mo35102g(zza);
        c8394w4.f39362c = zza;
        return m35924D;
    }

    /* renamed from: k */
    public static int m36076k(int i10, byte[] bArr, int i11, int i12, InterfaceC8351t6<?> interfaceC8351t6, C8394w4 c8394w4) {
        int i13;
        C8246m6 c8246m6 = (C8246m6) interfaceC8351t6;
        int m36066a = m36066a(bArr, i11, c8394w4);
        while (true) {
            i13 = m36066a;
            c8246m6.m35610z(c8394w4.f39360a);
            if (i13 >= i12) {
                break;
            }
            int m36066a2 = m36066a(bArr, i13, c8394w4);
            if (i10 != c8394w4.f39360a) {
                break;
            }
            m36066a = m36066a(bArr, m36066a2, c8394w4);
        }
        return i13;
    }

    /* renamed from: l */
    public static int m36077l(byte[] bArr, int i10, InterfaceC8351t6<?> interfaceC8351t6, C8394w4 c8394w4) {
        C8246m6 c8246m6 = (C8246m6) interfaceC8351t6;
        int m36066a = m36066a(bArr, i10, c8394w4);
        int i11 = c8394w4.f39360a + m36066a;
        while (m36066a < i11) {
            m36066a = m36066a(bArr, m36066a, c8394w4);
            c8246m6.m35610z(c8394w4.f39360a);
        }
        if (m36066a == i11) {
            return m36066a;
        }
        throw C8396w6.m35986a();
    }

    /* renamed from: m */
    public static int m36078m(InterfaceC8098c8<?> interfaceC8098c8, int i10, byte[] bArr, int i11, int i12, InterfaceC8351t6<?> interfaceC8351t6, C8394w4 c8394w4) {
        int i13;
        int m36074i = m36074i(interfaceC8098c8, bArr, i11, i12, c8394w4);
        while (true) {
            i13 = m36074i;
            interfaceC8351t6.add(c8394w4.f39362c);
            if (i13 >= i12) {
                break;
            }
            int m36066a = m36066a(bArr, i13, c8394w4);
            if (i10 != c8394w4.f39360a) {
                break;
            }
            m36074i = m36074i(interfaceC8098c8, bArr, m36066a, i12, c8394w4);
        }
        return i13;
    }

    /* renamed from: n */
    public static int m36079n(int i10, byte[] bArr, int i11, int i12, C8323r8 c8323r8, C8394w4 c8394w4) {
        int i13;
        if ((i10 >>> 3) == 0) {
            throw C8396w6.m35988c();
        }
        int i14 = i10 & 7;
        if (i14 == 0) {
            int m36068c = m36068c(bArr, i11, c8394w4);
            c8323r8.m35769h(i10, Long.valueOf(c8394w4.f39361b));
            return m36068c;
        }
        if (i14 == 1) {
            c8323r8.m35769h(i10, Long.valueOf(m36070e(bArr, i11)));
            return i11 + 8;
        }
        if (i14 == 2) {
            int m36066a = m36066a(bArr, i11, c8394w4);
            int i15 = c8394w4.f39360a;
            if (i15 < 0) {
                throw C8396w6.m35987b();
            }
            if (i15 > bArr.length - m36066a) {
                throw C8396w6.m35986a();
            }
            c8323r8.m35769h(i10, i15 == 0 ? AbstractC8230l5.f39165c : AbstractC8230l5.m35569t(bArr, m36066a, i15));
            return m36066a + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw C8396w6.m35988c();
            }
            c8323r8.m35769h(i10, Integer.valueOf(m36069d(bArr, i11)));
            return i11 + 4;
        }
        int i16 = (i10 & (-8)) | 4;
        C8323r8 m35763b = C8323r8.m35763b();
        int i17 = 0;
        while (true) {
            i13 = i11;
            if (i11 >= i12) {
                break;
            }
            int m36066a2 = m36066a(bArr, i11, c8394w4);
            int i18 = c8394w4.f39360a;
            i17 = i18;
            if (i18 == i16) {
                i13 = m36066a2;
                break;
            }
            int m36079n = m36079n(i17, bArr, m36066a2, i12, m35763b, c8394w4);
            i17 = i18;
            i11 = m36079n;
        }
        if (i13 > i12 || i17 != i16) {
            throw C8396w6.m35990e();
        }
        c8323r8.m35769h(i10, m35763b);
        return i13;
    }
}
