package de;

import p444zd.C10194b;
import td.C8691f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:de/a.class
 */
/* renamed from: de.a */
/* loaded from: combined.jar:classes2.jar:de/a.class */
public final class C4426a {

    /* renamed from: a */
    public final C10194b f26750a;

    /* renamed from: b */
    public final C10194b f26751b;

    /* renamed from: c */
    public final C4451e f26752c;

    public C4426a(C10194b c10194b) {
        int m42675h = c10194b.m42675h();
        if (m42675h < 8 || m42675h > 144 || (m42675h & 1) != 0) {
            throw C8691f.m37197a();
        }
        this.f26752c = m22523j(c10194b);
        C10194b m22524a = m22524a(c10194b);
        this.f26750a = m22524a;
        this.f26751b = new C10194b(m22524a.m42678k(), m22524a.m42675h());
    }

    /* renamed from: j */
    public static C4451e m22523j(C10194b c10194b) {
        return C4451e.m22589h(c10194b.m42675h(), c10194b.m42678k());
    }

    /* renamed from: a */
    public final C10194b m22524a(C10194b c10194b) {
        int m22594f = this.f26752c.m22594f();
        int m22593e = this.f26752c.m22593e();
        if (c10194b.m42675h() != m22594f) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int m22591c = this.f26752c.m22591c();
        int m22590b = this.f26752c.m22590b();
        int i10 = m22594f / m22591c;
        int i11 = m22593e / m22590b;
        C10194b c10194b2 = new C10194b(i11 * m22590b, i10 * m22591c);
        for (int i12 = 0; i12 < i10; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                for (int i14 = 0; i14 < m22591c; i14++) {
                    for (int i15 = 0; i15 < m22590b; i15++) {
                        if (c10194b.m42672d(((m22590b + 2) * i13) + 1 + i15, ((m22591c + 2) * i12) + 1 + i14)) {
                            c10194b2.m42680m((i13 * m22590b) + i15, (i12 * m22591c) + i14);
                        }
                    }
                }
            }
        }
        return c10194b2;
    }

    /* renamed from: b */
    public C4451e m22525b() {
        return this.f26752c;
    }

    /* renamed from: c */
    public byte[] m22526c() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        byte[] bArr = new byte[this.f26752c.m22595g()];
        int m42675h = this.f26750a.m42675h();
        int m42678k = this.f26750a.m42678k();
        int i18 = 0;
        boolean z14 = false;
        int i19 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i20 = 4;
        while (true) {
            if (i20 == m42675h && i18 == 0 && !z14) {
                bArr[i19] = (byte) m22527d(m42675h, m42678k);
                i16 = i20 - 2;
                i17 = i18 + 2;
                i13 = i19 + 1;
                z13 = true;
                z12 = z15;
                z11 = z16;
                z10 = z17;
            } else {
                int i21 = m42675h - 2;
                if (i20 == i21 && i18 == 0 && (m42678k & 3) != 0 && !z15) {
                    bArr[i19] = (byte) m22528e(m42675h, m42678k);
                    i16 = i20 - 2;
                    i17 = i18 + 2;
                    i13 = i19 + 1;
                    z12 = true;
                    z13 = z14;
                    z11 = z16;
                    z10 = z17;
                } else if (i20 == m42675h + 4 && i18 == 2 && (m42678k & 7) == 0 && !z16) {
                    bArr[i19] = (byte) m22529f(m42675h, m42678k);
                    i16 = i20 - 2;
                    i17 = i18 + 2;
                    i13 = i19 + 1;
                    z11 = true;
                    z13 = z14;
                    z12 = z15;
                    z10 = z17;
                } else {
                    int i22 = i18;
                    int i23 = i19;
                    int i24 = i20;
                    if (i20 == i21) {
                        i22 = i18;
                        i23 = i19;
                        i24 = i20;
                        if (i18 == 0) {
                            i22 = i18;
                            i23 = i19;
                            i24 = i20;
                            if ((m42678k & 7) == 4) {
                                i22 = i18;
                                i23 = i19;
                                i24 = i20;
                                if (!z17) {
                                    bArr[i19] = (byte) m22530g(m42675h, m42678k);
                                    i16 = i20 - 2;
                                    i17 = i18 + 2;
                                    i13 = i19 + 1;
                                    z10 = true;
                                    z13 = z14;
                                    z12 = z15;
                                    z11 = z16;
                                }
                            }
                        }
                    }
                    do {
                        i10 = i23;
                        if (i24 < m42675h) {
                            i10 = i23;
                            if (i22 >= 0) {
                                i10 = i23;
                                if (!this.f26751b.m42672d(i22, i24)) {
                                    bArr[i23] = (byte) m22532i(i24, i22, m42675h, m42678k);
                                    i10 = i23 + 1;
                                }
                            }
                        }
                        i11 = i24 - 2;
                        i12 = i22 + 2;
                        if (i11 < 0) {
                            break;
                        }
                        i22 = i12;
                        i23 = i10;
                        i24 = i11;
                    } while (i12 < m42678k);
                    int i25 = i11 + 1;
                    int i26 = i10;
                    int i27 = i12 + 3;
                    do {
                        i13 = i26;
                        if (i25 >= 0) {
                            i13 = i26;
                            if (i27 < m42678k) {
                                i13 = i26;
                                if (!this.f26751b.m42672d(i27, i25)) {
                                    bArr[i26] = (byte) m22532i(i25, i27, m42675h, m42678k);
                                    i13 = i26 + 1;
                                }
                            }
                        }
                        i14 = i25 + 2;
                        i15 = i27 - 2;
                        if (i14 >= m42675h) {
                            break;
                        }
                        i27 = i15;
                        i26 = i13;
                        i25 = i14;
                    } while (i15 >= 0);
                    i16 = i14 + 3;
                    i17 = i15 + 1;
                    z10 = z17;
                    z11 = z16;
                    z12 = z15;
                    z13 = z14;
                }
            }
            i18 = i17;
            z14 = z13;
            i19 = i13;
            z15 = z12;
            z16 = z11;
            z17 = z10;
            i20 = i16;
            if (i16 >= m42675h) {
                i18 = i17;
                z14 = z13;
                i19 = i13;
                z15 = z12;
                z16 = z11;
                z17 = z10;
                i20 = i16;
                if (i17 >= m42678k) {
                    break;
                }
            }
        }
        if (i13 == this.f26752c.m22595g()) {
            return bArr;
        }
        throw C8691f.m37197a();
    }

    /* renamed from: d */
    public final int m22527d(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (m22531h(i12, 0, i10, i11) ? 1 : 0) << 1;
        int i14 = i13;
        if (m22531h(i12, 1, i10, i11)) {
            i14 = i13 | 1;
        }
        int i15 = i14 << 1;
        int i16 = i15;
        if (m22531h(i12, 2, i10, i11)) {
            i16 = i15 | 1;
        }
        int i17 = i16 << 1;
        int i18 = i17;
        if (m22531h(0, i11 - 2, i10, i11)) {
            i18 = i17 | 1;
        }
        int i19 = i18 << 1;
        int i20 = i11 - 1;
        int i21 = i19;
        if (m22531h(0, i20, i10, i11)) {
            i21 = i19 | 1;
        }
        int i22 = i21 << 1;
        int i23 = i22;
        if (m22531h(1, i20, i10, i11)) {
            i23 = i22 | 1;
        }
        int i24 = i23 << 1;
        int i25 = i24;
        if (m22531h(2, i20, i10, i11)) {
            i25 = i24 | 1;
        }
        int i26 = i25 << 1;
        int i27 = i26;
        if (m22531h(3, i20, i10, i11)) {
            i27 = i26 | 1;
        }
        return i27;
    }

    /* renamed from: e */
    public final int m22528e(int i10, int i11) {
        int i12 = (m22531h(i10 - 3, 0, i10, i11) ? 1 : 0) << 1;
        int i13 = i12;
        if (m22531h(i10 - 2, 0, i10, i11)) {
            i13 = i12 | 1;
        }
        int i14 = i13 << 1;
        int i15 = i14;
        if (m22531h(i10 - 1, 0, i10, i11)) {
            i15 = i14 | 1;
        }
        int i16 = i15 << 1;
        int i17 = i16;
        if (m22531h(0, i11 - 4, i10, i11)) {
            i17 = i16 | 1;
        }
        int i18 = i17 << 1;
        int i19 = i18;
        if (m22531h(0, i11 - 3, i10, i11)) {
            i19 = i18 | 1;
        }
        int i20 = i19 << 1;
        int i21 = i20;
        if (m22531h(0, i11 - 2, i10, i11)) {
            i21 = i20 | 1;
        }
        int i22 = i21 << 1;
        int i23 = i11 - 1;
        int i24 = i22;
        if (m22531h(0, i23, i10, i11)) {
            i24 = i22 | 1;
        }
        int i25 = i24 << 1;
        int i26 = i25;
        if (m22531h(1, i23, i10, i11)) {
            i26 = i25 | 1;
        }
        return i26;
    }

    /* renamed from: f */
    public final int m22529f(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (m22531h(i12, 0, i10, i11) ? 1 : 0) << 1;
        int i14 = i11 - 1;
        int i15 = i13;
        if (m22531h(i12, i14, i10, i11)) {
            i15 = i13 | 1;
        }
        int i16 = i15 << 1;
        int i17 = i11 - 3;
        int i18 = i16;
        if (m22531h(0, i17, i10, i11)) {
            i18 = i16 | 1;
        }
        int i19 = i18 << 1;
        int i20 = i11 - 2;
        int i21 = i19;
        if (m22531h(0, i20, i10, i11)) {
            i21 = i19 | 1;
        }
        int i22 = i21 << 1;
        int i23 = i22;
        if (m22531h(0, i14, i10, i11)) {
            i23 = i22 | 1;
        }
        int i24 = i23 << 1;
        int i25 = i24;
        if (m22531h(1, i17, i10, i11)) {
            i25 = i24 | 1;
        }
        int i26 = i25 << 1;
        int i27 = i26;
        if (m22531h(1, i20, i10, i11)) {
            i27 = i26 | 1;
        }
        int i28 = i27 << 1;
        int i29 = i28;
        if (m22531h(1, i14, i10, i11)) {
            i29 = i28 | 1;
        }
        return i29;
    }

    /* renamed from: g */
    public final int m22530g(int i10, int i11) {
        int i12 = (m22531h(i10 - 3, 0, i10, i11) ? 1 : 0) << 1;
        int i13 = i12;
        if (m22531h(i10 - 2, 0, i10, i11)) {
            i13 = i12 | 1;
        }
        int i14 = i13 << 1;
        int i15 = i14;
        if (m22531h(i10 - 1, 0, i10, i11)) {
            i15 = i14 | 1;
        }
        int i16 = i15 << 1;
        int i17 = i16;
        if (m22531h(0, i11 - 2, i10, i11)) {
            i17 = i16 | 1;
        }
        int i18 = i17 << 1;
        int i19 = i11 - 1;
        int i20 = i18;
        if (m22531h(0, i19, i10, i11)) {
            i20 = i18 | 1;
        }
        int i21 = i20 << 1;
        int i22 = i21;
        if (m22531h(1, i19, i10, i11)) {
            i22 = i21 | 1;
        }
        int i23 = i22 << 1;
        int i24 = i23;
        if (m22531h(2, i19, i10, i11)) {
            i24 = i23 | 1;
        }
        int i25 = i24 << 1;
        int i26 = i25;
        if (m22531h(3, i19, i10, i11)) {
            i26 = i25 | 1;
        }
        return i26;
    }

    /* renamed from: h */
    public final boolean m22531h(int i10, int i11, int i12, int i13) {
        int i14 = i10;
        int i15 = i11;
        if (i10 < 0) {
            i14 = i10 + i12;
            i15 = i11 + (4 - ((i12 + 4) & 7));
        }
        int i16 = i14;
        int i17 = i15;
        if (i15 < 0) {
            i17 = i15 + i13;
            i16 = i14 + (4 - ((i13 + 4) & 7));
        }
        this.f26751b.m42680m(i17, i16);
        return this.f26750a.m42672d(i17, i16);
    }

    /* renamed from: i */
    public final int m22532i(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (m22531h(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        int i18 = i16;
        if (m22531h(i14, i17, i12, i13)) {
            i18 = i16 | 1;
        }
        int i19 = i18 << 1;
        int i20 = i10 - 1;
        int i21 = i19;
        if (m22531h(i20, i15, i12, i13)) {
            i21 = i19 | 1;
        }
        int i22 = i21 << 1;
        int i23 = i22;
        if (m22531h(i20, i17, i12, i13)) {
            i23 = i22 | 1;
        }
        int i24 = i23 << 1;
        int i25 = i24;
        if (m22531h(i20, i11, i12, i13)) {
            i25 = i24 | 1;
        }
        int i26 = i25 << 1;
        int i27 = i26;
        if (m22531h(i10, i15, i12, i13)) {
            i27 = i26 | 1;
        }
        int i28 = i27 << 1;
        int i29 = i28;
        if (m22531h(i10, i17, i12, i13)) {
            i29 = i28 | 1;
        }
        int i30 = i29 << 1;
        int i31 = i30;
        if (m22531h(i10, i11, i12, i13)) {
            i31 = i30 | 1;
        }
        return i31;
    }
}
