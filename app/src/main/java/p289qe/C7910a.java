package p289qe;

import p444zd.C10194b;
import td.C8691f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/a.class
 */
/* renamed from: qe.a */
/* loaded from: combined.jar:classes2.jar:qe/a.class */
public final class C7910a {

    /* renamed from: a */
    public final C10194b f38042a;

    /* renamed from: b */
    public C7919j f38043b;

    /* renamed from: c */
    public C7916g f38044c;

    /* renamed from: d */
    public boolean f38045d;

    public C7910a(C10194b c10194b) {
        int m42675h = c10194b.m42675h();
        if (m42675h < 21 || (m42675h & 3) != 1) {
            throw C8691f.m37197a();
        }
        this.f38042a = c10194b;
    }

    /* renamed from: a */
    public final int m34260a(int i10, int i11, int i12) {
        return this.f38045d ? this.f38042a.m42672d(i11, i10) : this.f38042a.m42672d(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    /* renamed from: b */
    public void m34261b() {
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= this.f38042a.m42678k()) {
                return;
            }
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < this.f38042a.m42675h(); i13++) {
                if (this.f38042a.m42672d(i11, i13) != this.f38042a.m42672d(i13, i11)) {
                    this.f38042a.m42671c(i13, i11);
                    this.f38042a.m42671c(i11, i13);
                }
            }
            i10 = i12;
        }
    }

    /* renamed from: c */
    public byte[] m34262c() {
        C7916g m34263d = m34263d();
        C7919j m34264e = m34264e();
        EnumC7912c enumC7912c = EnumC7912c.values()[m34263d.m34284c()];
        int m42675h = this.f38042a.m42675h();
        enumC7912c.unmaskBitMatrix(this.f38042a, m42675h);
        C10194b m34291a = m34264e.m34291a();
        byte[] bArr = new byte[m34264e.m34295h()];
        int i10 = m42675h - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            int i15 = i11;
            if (i11 == 6) {
                i15 = i11 - 1;
            }
            int i16 = 0;
            while (i16 < m42675h) {
                int i17 = z10 ? i10 - i16 : i16;
                int i18 = 0;
                int i19 = i14;
                int i20 = i13;
                while (i18 < 2) {
                    int i21 = i15 - i18;
                    int i22 = i12;
                    int i23 = i20;
                    int i24 = i19;
                    if (!m34291a.m42672d(i21, i17)) {
                        int i25 = i20 + 1;
                        int i26 = i19 << 1;
                        int i27 = i26;
                        if (this.f38042a.m42672d(i21, i17)) {
                            i27 = i26 | 1;
                        }
                        i22 = i12;
                        i23 = i25;
                        i24 = i27;
                        if (i25 == 8) {
                            bArr[i12] = (byte) i27;
                            i22 = i12 + 1;
                            i23 = 0;
                            i24 = 0;
                        }
                    }
                    i18++;
                    i12 = i22;
                    i20 = i23;
                    i19 = i24;
                }
                i16++;
                i13 = i20;
                i14 = i19;
            }
            z10 = !z10;
            i11 = i15 - 2;
        }
        if (i12 == m34264e.m34295h()) {
            return bArr;
        }
        throw C8691f.m37197a();
    }

    /* renamed from: d */
    public C7916g m34263d() {
        C7916g c7916g = this.f38044c;
        if (c7916g != null) {
            return c7916g;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 = m34260a(i11, 8, i10);
        }
        int m34260a = m34260a(8, 7, m34260a(8, 8, m34260a(7, 8, i10)));
        for (int i12 = 5; i12 >= 0; i12--) {
            m34260a = m34260a(8, i12, m34260a);
        }
        int m42675h = this.f38042a.m42675h();
        int i13 = 0;
        for (int i14 = m42675h - 1; i14 >= m42675h - 7; i14--) {
            i13 = m34260a(8, i14, i13);
        }
        for (int i15 = m42675h - 8; i15 < m42675h; i15++) {
            i13 = m34260a(i15, 8, i13);
        }
        C7916g m34281a = C7916g.m34281a(m34260a, i13);
        this.f38044c = m34281a;
        if (m34281a != null) {
            return m34281a;
        }
        throw C8691f.m37197a();
    }

    /* renamed from: e */
    public C7919j m34264e() {
        C7919j c7919j = this.f38043b;
        if (c7919j != null) {
            return c7919j;
        }
        int m42675h = this.f38042a.m42675h();
        int i10 = (m42675h - 17) / 4;
        if (i10 <= 6) {
            return C7919j.m34290i(i10);
        }
        int i11 = m42675h - 11;
        int i12 = 0;
        for (int i13 = 5; i13 >= 0; i13--) {
            for (int i14 = m42675h - 9; i14 >= i11; i14--) {
                i12 = m34260a(i14, i13, i12);
            }
        }
        C7919j m34288c = C7919j.m34288c(i12);
        int i15 = 5;
        int i16 = 0;
        if (m34288c != null) {
            i15 = 5;
            i16 = 0;
            if (m34288c.m34293e() == m42675h) {
                this.f38043b = m34288c;
                return m34288c;
            }
        }
        while (i15 >= 0) {
            for (int i17 = m42675h - 9; i17 >= i11; i17--) {
                i16 = m34260a(i15, i17, i16);
            }
            i15--;
        }
        C7919j m34288c2 = C7919j.m34288c(i16);
        if (m34288c2 == null || m34288c2.m34293e() != m42675h) {
            throw C8691f.m37197a();
        }
        this.f38043b = m34288c2;
        return m34288c2;
    }

    /* renamed from: f */
    public void m34265f() {
        if (this.f38044c == null) {
            return;
        }
        EnumC7912c.values()[this.f38044c.m34284c()].unmaskBitMatrix(this.f38042a, this.f38042a.m42675h());
    }

    /* renamed from: g */
    public void m34266g(boolean z10) {
        this.f38043b = null;
        this.f38044c = null;
        this.f38045d = z10;
    }
}
