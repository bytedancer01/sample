package p367v8;

import android.text.Layout;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v8/g.class
 */
/* renamed from: v8.g */
/* loaded from: combined.jar:classes2.jar:v8/g.class */
public final class C9313g {

    /* renamed from: a */
    public String f42490a;

    /* renamed from: b */
    public int f42491b;

    /* renamed from: c */
    public boolean f42492c;

    /* renamed from: d */
    public int f42493d;

    /* renamed from: e */
    public boolean f42494e;

    /* renamed from: k */
    public float f42500k;

    /* renamed from: l */
    public String f42501l;

    /* renamed from: o */
    public Layout.Alignment f42504o;

    /* renamed from: p */
    public Layout.Alignment f42505p;

    /* renamed from: r */
    public C9308b f42507r;

    /* renamed from: f */
    public int f42495f = -1;

    /* renamed from: g */
    public int f42496g = -1;

    /* renamed from: h */
    public int f42497h = -1;

    /* renamed from: i */
    public int f42498i = -1;

    /* renamed from: j */
    public int f42499j = -1;

    /* renamed from: m */
    public int f42502m = -1;

    /* renamed from: n */
    public int f42503n = -1;

    /* renamed from: q */
    public int f42506q = -1;

    /* renamed from: s */
    public float f42508s = Float.MAX_VALUE;

    /* renamed from: A */
    public C9313g m39276A(String str) {
        this.f42501l = str;
        return this;
    }

    /* renamed from: B */
    public C9313g m39277B(boolean z10) {
        this.f42498i = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public C9313g m39278C(boolean z10) {
        this.f42495f = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: D */
    public C9313g m39279D(Layout.Alignment alignment) {
        this.f42505p = alignment;
        return this;
    }

    /* renamed from: E */
    public C9313g m39280E(int i10) {
        this.f42503n = i10;
        return this;
    }

    /* renamed from: F */
    public C9313g m39281F(int i10) {
        this.f42502m = i10;
        return this;
    }

    /* renamed from: G */
    public C9313g m39282G(float f10) {
        this.f42508s = f10;
        return this;
    }

    /* renamed from: H */
    public C9313g m39283H(Layout.Alignment alignment) {
        this.f42504o = alignment;
        return this;
    }

    /* renamed from: I */
    public C9313g m39284I(boolean z10) {
        this.f42506q = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: J */
    public C9313g m39285J(C9308b c9308b) {
        this.f42507r = c9308b;
        return this;
    }

    /* renamed from: K */
    public C9313g m39286K(boolean z10) {
        this.f42496g = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C9313g m39287a(C9313g c9313g) {
        return m39304r(c9313g, true);
    }

    /* renamed from: b */
    public int m39288b() {
        if (this.f42494e) {
            return this.f42493d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int m39289c() {
        if (this.f42492c) {
            return this.f42491b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String m39290d() {
        return this.f42490a;
    }

    /* renamed from: e */
    public float m39291e() {
        return this.f42500k;
    }

    /* renamed from: f */
    public int m39292f() {
        return this.f42499j;
    }

    /* renamed from: g */
    public String m39293g() {
        return this.f42501l;
    }

    /* renamed from: h */
    public Layout.Alignment m39294h() {
        return this.f42505p;
    }

    /* renamed from: i */
    public int m39295i() {
        return this.f42503n;
    }

    /* renamed from: j */
    public int m39296j() {
        return this.f42502m;
    }

    /* renamed from: k */
    public float m39297k() {
        return this.f42508s;
    }

    /* renamed from: l */
    public int m39298l() {
        int i10 = this.f42497h;
        if (i10 == -1 && this.f42498i == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f42498i == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    /* renamed from: m */
    public Layout.Alignment m39299m() {
        return this.f42504o;
    }

    /* renamed from: n */
    public boolean m39300n() {
        boolean z10 = true;
        if (this.f42506q != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: o */
    public C9308b m39301o() {
        return this.f42507r;
    }

    /* renamed from: p */
    public boolean m39302p() {
        return this.f42494e;
    }

    /* renamed from: q */
    public boolean m39303q() {
        return this.f42492c;
    }

    /* renamed from: r */
    public final C9313g m39304r(C9313g c9313g, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c9313g != null) {
            if (!this.f42492c && c9313g.f42492c) {
                m39309w(c9313g.f42491b);
            }
            if (this.f42497h == -1) {
                this.f42497h = c9313g.f42497h;
            }
            if (this.f42498i == -1) {
                this.f42498i = c9313g.f42498i;
            }
            if (this.f42490a == null && (str = c9313g.f42490a) != null) {
                this.f42490a = str;
            }
            if (this.f42495f == -1) {
                this.f42495f = c9313g.f42495f;
            }
            if (this.f42496g == -1) {
                this.f42496g = c9313g.f42496g;
            }
            if (this.f42503n == -1) {
                this.f42503n = c9313g.f42503n;
            }
            if (this.f42504o == null && (alignment2 = c9313g.f42504o) != null) {
                this.f42504o = alignment2;
            }
            if (this.f42505p == null && (alignment = c9313g.f42505p) != null) {
                this.f42505p = alignment;
            }
            if (this.f42506q == -1) {
                this.f42506q = c9313g.f42506q;
            }
            if (this.f42499j == -1) {
                this.f42499j = c9313g.f42499j;
                this.f42500k = c9313g.f42500k;
            }
            if (this.f42507r == null) {
                this.f42507r = c9313g.f42507r;
            }
            if (this.f42508s == Float.MAX_VALUE) {
                this.f42508s = c9313g.f42508s;
            }
            if (z10 && !this.f42494e && c9313g.f42494e) {
                m39307u(c9313g.f42493d);
            }
            if (z10 && this.f42502m == -1 && (i10 = c9313g.f42502m) != -1) {
                this.f42502m = i10;
            }
        }
        return this;
    }

    /* renamed from: s */
    public boolean m39305s() {
        boolean z10 = true;
        if (this.f42495f != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: t */
    public boolean m39306t() {
        boolean z10 = true;
        if (this.f42496g != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: u */
    public C9313g m39307u(int i10) {
        this.f42493d = i10;
        this.f42494e = true;
        return this;
    }

    /* renamed from: v */
    public C9313g m39308v(boolean z10) {
        this.f42497h = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public C9313g m39309w(int i10) {
        this.f42491b = i10;
        this.f42492c = true;
        return this;
    }

    /* renamed from: x */
    public C9313g m39310x(String str) {
        this.f42490a = str;
        return this;
    }

    /* renamed from: y */
    public C9313g m39311y(float f10) {
        this.f42500k = f10;
        return this;
    }

    /* renamed from: z */
    public C9313g m39312z(int i10) {
        this.f42499j = i10;
        return this;
    }
}
