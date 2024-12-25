package p303r8;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p243o8.AbstractC6921c;
import p243o8.C6919a;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r8/a.class
 */
/* renamed from: r8.a */
/* loaded from: combined.jar:classes2.jar:r8/a.class */
public final class C8011a extends AbstractC6921c {

    /* renamed from: o */
    public final C4361f0 f38780o;

    /* renamed from: p */
    public final C4361f0 f38781p;

    /* renamed from: q */
    public final a f38782q;

    /* renamed from: r */
    public Inflater f38783r;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r8/a$a.class
     */
    /* renamed from: r8.a$a */
    /* loaded from: combined.jar:classes2.jar:r8/a$a.class */
    public static final class a {

        /* renamed from: a */
        public final C4361f0 f38784a = new C4361f0();

        /* renamed from: b */
        public final int[] f38785b = new int[256];

        /* renamed from: c */
        public boolean f38786c;

        /* renamed from: d */
        public int f38787d;

        /* renamed from: e */
        public int f38788e;

        /* renamed from: f */
        public int f38789f;

        /* renamed from: g */
        public int f38790g;

        /* renamed from: h */
        public int f38791h;

        /* renamed from: i */
        public int f38792i;

        /* renamed from: d */
        public C6919a m34855d() {
            if (this.f38787d == 0 || this.f38788e == 0 || this.f38791h == 0 || this.f38792i == 0 || this.f38784a.m21990f() == 0 || this.f38784a.m21989e() != this.f38784a.m21990f() || !this.f38786c) {
                return null;
            }
            this.f38784a.m21983P(0);
            int i10 = this.f38791h * this.f38792i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int m21971D = this.f38784a.m21971D();
                if (m21971D != 0) {
                    iArr[i11] = this.f38785b[m21971D];
                    i11++;
                } else {
                    int m21971D2 = this.f38784a.m21971D();
                    if (m21971D2 != 0) {
                        int m21971D3 = (m21971D2 & 64) == 0 ? m21971D2 & 63 : ((m21971D2 & 63) << 8) | this.f38784a.m21971D();
                        int i12 = (m21971D2 & 128) == 0 ? 0 : this.f38785b[this.f38784a.m21971D()];
                        int i13 = m21971D3 + i11;
                        Arrays.fill(iArr, i11, i13, i12);
                        i11 = i13;
                    }
                }
            }
            return new C6919a.b().m31862f(Bitmap.createBitmap(iArr, this.f38791h, this.f38792i, Bitmap.Config.ARGB_8888)).m31867k(this.f38789f / this.f38787d).m31868l(0).m31864h(this.f38790g / this.f38788e, 0).m31865i(0).m31870n(this.f38791h / this.f38787d).m31863g(this.f38792i / this.f38788e).m31857a();
        }

        /* renamed from: e */
        public final void m34856e(C4361f0 c4361f0, int i10) {
            int m21974G;
            if (i10 < 4) {
                return;
            }
            c4361f0.m21984Q(3);
            int i11 = i10 - 4;
            int i12 = i11;
            if ((c4361f0.m21971D() & 128) != 0) {
                if (i11 < 7 || (m21974G = c4361f0.m21974G()) < 4) {
                    return;
                }
                this.f38791h = c4361f0.m21977J();
                this.f38792i = c4361f0.m21977J();
                this.f38784a.m21979L(m21974G - 4);
                i12 = i11 - 7;
            }
            int m21989e = this.f38784a.m21989e();
            int m21990f = this.f38784a.m21990f();
            if (m21989e >= m21990f || i12 <= 0) {
                return;
            }
            int min = Math.min(i12, m21990f - m21989e);
            c4361f0.m21994j(this.f38784a.m21988d(), m21989e, min);
            this.f38784a.m21983P(m21989e + min);
        }

        /* renamed from: f */
        public final void m34857f(C4361f0 c4361f0, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f38787d = c4361f0.m21977J();
            this.f38788e = c4361f0.m21977J();
            c4361f0.m21984Q(11);
            this.f38789f = c4361f0.m21977J();
            this.f38790g = c4361f0.m21977J();
        }

        /* renamed from: g */
        public final void m34858g(C4361f0 c4361f0, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            c4361f0.m21984Q(2);
            Arrays.fill(this.f38785b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int m21971D = c4361f0.m21971D();
                int m21971D2 = c4361f0.m21971D();
                int m21971D3 = c4361f0.m21971D();
                int m21971D4 = c4361f0.m21971D();
                int m21971D5 = c4361f0.m21971D();
                double d10 = m21971D2;
                double d11 = m21971D3 - 128;
                int i13 = (int) ((1.402d * d11) + d10);
                double d12 = m21971D4 - 128;
                int i14 = (int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d));
                int i15 = (int) (d10 + (d12 * 1.772d));
                this.f38785b[m21971D] = C4401z0.m22409s(i15, 0, 255) | (C4401z0.m22409s(i14, 0, 255) << 8) | (m21971D5 << 24) | (C4401z0.m22409s(i13, 0, 255) << 16);
            }
            this.f38786c = true;
        }

        /* renamed from: h */
        public void m34859h() {
            this.f38787d = 0;
            this.f38788e = 0;
            this.f38789f = 0;
            this.f38790g = 0;
            this.f38791h = 0;
            this.f38792i = 0;
            this.f38784a.m21979L(0);
            this.f38786c = false;
        }
    }

    public C8011a() {
        super("PgsDecoder");
        this.f38780o = new C4361f0();
        this.f38781p = new C4361f0();
        this.f38782q = new a();
    }

    /* renamed from: C */
    public static C6919a m34850C(C4361f0 c4361f0, a aVar) {
        C6919a c6919a;
        int m21990f = c4361f0.m21990f();
        int m21971D = c4361f0.m21971D();
        int m21977J = c4361f0.m21977J();
        int m21989e = c4361f0.m21989e() + m21977J;
        if (m21989e > m21990f) {
            c4361f0.m21983P(m21990f);
            return null;
        }
        if (m21971D != 128) {
            switch (m21971D) {
                case 20:
                    aVar.m34858g(c4361f0, m21977J);
                    c6919a = null;
                    break;
                case 21:
                    aVar.m34856e(c4361f0, m21977J);
                    c6919a = null;
                    break;
                case 22:
                    aVar.m34857f(c4361f0, m21977J);
                    c6919a = null;
                    break;
                default:
                    c6919a = null;
                    break;
            }
        } else {
            C6919a m34855d = aVar.m34855d();
            aVar.m34859h();
            c6919a = m34855d;
        }
        c4361f0.m21983P(m21989e);
        return c6919a;
    }

    /* renamed from: B */
    public final void m34851B(C4361f0 c4361f0) {
        if (c4361f0.m21985a() <= 0 || c4361f0.m21992h() != 120) {
            return;
        }
        if (this.f38783r == null) {
            this.f38783r = new Inflater();
        }
        if (C4401z0.m22406q0(c4361f0, this.f38781p, this.f38783r)) {
            c4361f0.m21981N(this.f38781p.m21988d(), this.f38781p.m21990f());
        }
    }

    @Override // p243o8.AbstractC6921c
    /* renamed from: z */
    public InterfaceC6923e mo31882z(byte[] bArr, int i10, boolean z10) {
        this.f38780o.m21981N(bArr, i10);
        m34851B(this.f38780o);
        this.f38782q.m34859h();
        ArrayList arrayList = new ArrayList();
        while (this.f38780o.m21985a() >= 3) {
            C6919a m34850C = m34850C(this.f38780o, this.f38782q);
            if (m34850C != null) {
                arrayList.add(m34850C);
            }
        }
        return new C8012b(Collections.unmodifiableList(arrayList));
    }
}
