package p243o8;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import ec.C4705h;
import org.achartengine.renderer.DefaultRenderer;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.checkerframework.dataflow.qual.Pure;
import p059d9.C4349a;
import p267p6.C7604o;
import p267p6.InterfaceC7579g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o8/a.class
 */
/* renamed from: o8.a */
/* loaded from: combined.jar:classes2.jar:o8/a.class */
public final class C6919a {

    /* renamed from: r */
    public static final C6919a f35794r = new b().m31871o("").m31857a();

    /* renamed from: s */
    public static final InterfaceC7579g<C6919a> f35795s = new C7604o();

    /* renamed from: a */
    public final CharSequence f35796a;

    /* renamed from: b */
    public final Layout.Alignment f35797b;

    /* renamed from: c */
    public final Layout.Alignment f35798c;

    /* renamed from: d */
    public final Bitmap f35799d;

    /* renamed from: e */
    public final float f35800e;

    /* renamed from: f */
    public final int f35801f;

    /* renamed from: g */
    public final int f35802g;

    /* renamed from: h */
    public final float f35803h;

    /* renamed from: i */
    public final int f35804i;

    /* renamed from: j */
    public final float f35805j;

    /* renamed from: k */
    public final float f35806k;

    /* renamed from: l */
    public final boolean f35807l;

    /* renamed from: m */
    public final int f35808m;

    /* renamed from: n */
    public final int f35809n;

    /* renamed from: o */
    public final float f35810o;

    /* renamed from: p */
    public final int f35811p;

    /* renamed from: q */
    public final float f35812q;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:o8/a$b.class
     */
    /* renamed from: o8.a$b */
    /* loaded from: combined.jar:classes2.jar:o8/a$b.class */
    public static final class b {

        /* renamed from: a */
        public CharSequence f35813a;

        /* renamed from: b */
        public Bitmap f35814b;

        /* renamed from: c */
        public Layout.Alignment f35815c;

        /* renamed from: d */
        public Layout.Alignment f35816d;

        /* renamed from: e */
        public float f35817e;

        /* renamed from: f */
        public int f35818f;

        /* renamed from: g */
        public int f35819g;

        /* renamed from: h */
        public float f35820h;

        /* renamed from: i */
        public int f35821i;

        /* renamed from: j */
        public int f35822j;

        /* renamed from: k */
        public float f35823k;

        /* renamed from: l */
        public float f35824l;

        /* renamed from: m */
        public float f35825m;

        /* renamed from: n */
        public boolean f35826n;

        /* renamed from: o */
        public int f35827o;

        /* renamed from: p */
        public int f35828p;

        /* renamed from: q */
        public float f35829q;

        public b() {
            this.f35813a = null;
            this.f35814b = null;
            this.f35815c = null;
            this.f35816d = null;
            this.f35817e = -3.4028235E38f;
            this.f35818f = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f35819g = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f35820h = -3.4028235E38f;
            this.f35821i = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f35822j = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f35823k = -3.4028235E38f;
            this.f35824l = -3.4028235E38f;
            this.f35825m = -3.4028235E38f;
            this.f35826n = false;
            this.f35827o = DefaultRenderer.BACKGROUND_COLOR;
            this.f35828p = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }

        public b(C6919a c6919a) {
            this.f35813a = c6919a.f35796a;
            this.f35814b = c6919a.f35799d;
            this.f35815c = c6919a.f35797b;
            this.f35816d = c6919a.f35798c;
            this.f35817e = c6919a.f35800e;
            this.f35818f = c6919a.f35801f;
            this.f35819g = c6919a.f35802g;
            this.f35820h = c6919a.f35803h;
            this.f35821i = c6919a.f35804i;
            this.f35822j = c6919a.f35809n;
            this.f35823k = c6919a.f35810o;
            this.f35824l = c6919a.f35805j;
            this.f35825m = c6919a.f35806k;
            this.f35826n = c6919a.f35807l;
            this.f35827o = c6919a.f35808m;
            this.f35828p = c6919a.f35811p;
            this.f35829q = c6919a.f35812q;
        }

        /* renamed from: a */
        public C6919a m31857a() {
            return new C6919a(this.f35813a, this.f35815c, this.f35816d, this.f35814b, this.f35817e, this.f35818f, this.f35819g, this.f35820h, this.f35821i, this.f35822j, this.f35823k, this.f35824l, this.f35825m, this.f35826n, this.f35827o, this.f35828p, this.f35829q);
        }

        /* renamed from: b */
        public b m31858b() {
            this.f35826n = false;
            return this;
        }

        @Pure
        /* renamed from: c */
        public int m31859c() {
            return this.f35819g;
        }

        @Pure
        /* renamed from: d */
        public int m31860d() {
            return this.f35821i;
        }

        @Pure
        /* renamed from: e */
        public CharSequence m31861e() {
            return this.f35813a;
        }

        /* renamed from: f */
        public b m31862f(Bitmap bitmap) {
            this.f35814b = bitmap;
            return this;
        }

        /* renamed from: g */
        public b m31863g(float f10) {
            this.f35825m = f10;
            return this;
        }

        /* renamed from: h */
        public b m31864h(float f10, int i10) {
            this.f35817e = f10;
            this.f35818f = i10;
            return this;
        }

        /* renamed from: i */
        public b m31865i(int i10) {
            this.f35819g = i10;
            return this;
        }

        /* renamed from: j */
        public b m31866j(Layout.Alignment alignment) {
            this.f35816d = alignment;
            return this;
        }

        /* renamed from: k */
        public b m31867k(float f10) {
            this.f35820h = f10;
            return this;
        }

        /* renamed from: l */
        public b m31868l(int i10) {
            this.f35821i = i10;
            return this;
        }

        /* renamed from: m */
        public b m31869m(float f10) {
            this.f35829q = f10;
            return this;
        }

        /* renamed from: n */
        public b m31870n(float f10) {
            this.f35824l = f10;
            return this;
        }

        /* renamed from: o */
        public b m31871o(CharSequence charSequence) {
            this.f35813a = charSequence;
            return this;
        }

        /* renamed from: p */
        public b m31872p(Layout.Alignment alignment) {
            this.f35815c = alignment;
            return this;
        }

        /* renamed from: q */
        public b m31873q(float f10, int i10) {
            this.f35823k = f10;
            this.f35822j = i10;
            return this;
        }

        /* renamed from: r */
        public b m31874r(int i10) {
            this.f35828p = i10;
            return this;
        }

        /* renamed from: s */
        public b m31875s(int i10) {
            this.f35827o = i10;
            this.f35826n = true;
            return this;
        }
    }

    public C6919a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            C4349a.m21882e(bitmap);
        } else {
            C4349a.m21878a(bitmap == null);
        }
        this.f35796a = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f35797b = alignment;
        this.f35798c = alignment2;
        this.f35799d = bitmap;
        this.f35800e = f10;
        this.f35801f = i10;
        this.f35802g = i11;
        this.f35803h = f11;
        this.f35804i = i12;
        this.f35805j = f13;
        this.f35806k = f14;
        this.f35807l = z10;
        this.f35808m = i14;
        this.f35809n = i13;
        this.f35810o = f12;
        this.f35811p = i15;
        this.f35812q = f15;
    }

    /* renamed from: a */
    public b m31856a() {
        return new b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C6919a.class != obj.getClass()) {
            return false;
        }
        C6919a c6919a = (C6919a) obj;
        if (!TextUtils.equals(this.f35796a, c6919a.f35796a) || this.f35797b != c6919a.f35797b || this.f35798c != c6919a.f35798c || ((bitmap = this.f35799d) != null ? (bitmap2 = c6919a.f35799d) == null || !bitmap.sameAs(bitmap2) : c6919a.f35799d != null) || this.f35800e != c6919a.f35800e || this.f35801f != c6919a.f35801f || this.f35802g != c6919a.f35802g || this.f35803h != c6919a.f35803h || this.f35804i != c6919a.f35804i || this.f35805j != c6919a.f35805j || this.f35806k != c6919a.f35806k || this.f35807l != c6919a.f35807l || this.f35808m != c6919a.f35808m || this.f35809n != c6919a.f35809n || this.f35810o != c6919a.f35810o || this.f35811p != c6919a.f35811p || this.f35812q != c6919a.f35812q) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return C4705h.m23656b(this.f35796a, this.f35797b, this.f35798c, this.f35799d, Float.valueOf(this.f35800e), Integer.valueOf(this.f35801f), Integer.valueOf(this.f35802g), Float.valueOf(this.f35803h), Integer.valueOf(this.f35804i), Float.valueOf(this.f35805j), Float.valueOf(this.f35806k), Boolean.valueOf(this.f35807l), Integer.valueOf(this.f35808m), Integer.valueOf(this.f35809n), Float.valueOf(this.f35810o), Integer.valueOf(this.f35811p), Float.valueOf(this.f35812q));
    }
}
