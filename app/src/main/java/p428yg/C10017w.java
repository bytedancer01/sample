package p428yg;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/w.class
 */
/* renamed from: yg.w */
/* loaded from: combined.jar:classes2.jar:yg/w.class */
public final class C10017w {

    /* renamed from: s */
    public static final long f45924s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    public int f45925a;

    /* renamed from: b */
    public long f45926b;

    /* renamed from: c */
    public int f45927c;

    /* renamed from: d */
    public final Uri f45928d;

    /* renamed from: e */
    public final int f45929e;

    /* renamed from: f */
    public final String f45930f;

    /* renamed from: g */
    public final List<InterfaceC9997e0> f45931g;

    /* renamed from: h */
    public final int f45932h;

    /* renamed from: i */
    public final int f45933i;

    /* renamed from: j */
    public final boolean f45934j;

    /* renamed from: k */
    public final boolean f45935k;

    /* renamed from: l */
    public final boolean f45936l;

    /* renamed from: m */
    public final float f45937m;

    /* renamed from: n */
    public final float f45938n;

    /* renamed from: o */
    public final float f45939o;

    /* renamed from: p */
    public final boolean f45940p;

    /* renamed from: q */
    public final Bitmap.Config f45941q;

    /* renamed from: r */
    public final C10014t.f f45942r;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/w$b.class
     */
    /* renamed from: yg.w$b */
    /* loaded from: combined.jar:classes2.jar:yg/w$b.class */
    public static final class b {

        /* renamed from: a */
        public Uri f45943a;

        /* renamed from: b */
        public int f45944b;

        /* renamed from: c */
        public String f45945c;

        /* renamed from: d */
        public int f45946d;

        /* renamed from: e */
        public int f45947e;

        /* renamed from: f */
        public boolean f45948f;

        /* renamed from: g */
        public boolean f45949g;

        /* renamed from: h */
        public boolean f45950h;

        /* renamed from: i */
        public float f45951i;

        /* renamed from: j */
        public float f45952j;

        /* renamed from: k */
        public float f45953k;

        /* renamed from: l */
        public boolean f45954l;

        /* renamed from: m */
        public List<InterfaceC9997e0> f45955m;

        /* renamed from: n */
        public Bitmap.Config f45956n;

        /* renamed from: o */
        public C10014t.f f45957o;

        public b(Uri uri, int i10, Bitmap.Config config) {
            this.f45943a = uri;
            this.f45944b = i10;
            this.f45956n = config;
        }

        /* renamed from: a */
        public C10017w m42139a() {
            boolean z10 = this.f45949g;
            if (z10 && this.f45948f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f45948f && this.f45946d == 0 && this.f45947e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z10 && this.f45946d == 0 && this.f45947e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f45957o == null) {
                this.f45957o = C10014t.f.NORMAL;
            }
            return new C10017w(this.f45943a, this.f45944b, this.f45945c, this.f45955m, this.f45946d, this.f45947e, this.f45948f, this.f45949g, this.f45950h, this.f45951i, this.f45952j, this.f45953k, this.f45954l, this.f45956n, this.f45957o);
        }

        /* renamed from: b */
        public b m42140b() {
            if (this.f45949g) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f45948f = true;
            return this;
        }

        /* renamed from: c */
        public b m42141c() {
            if (this.f45948f) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.f45949g = true;
            return this;
        }

        /* renamed from: d */
        public boolean m42142d() {
            return (this.f45943a == null && this.f45944b == 0) ? false : true;
        }

        /* renamed from: e */
        public boolean m42143e() {
            return (this.f45946d == 0 && this.f45947e == 0) ? false : true;
        }

        /* renamed from: f */
        public b m42144f(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i11 == 0 && i10 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f45946d = i10;
            this.f45947e = i11;
            return this;
        }
    }

    public C10017w(Uri uri, int i10, String str, List<InterfaceC9997e0> list, int i11, int i12, boolean z10, boolean z11, boolean z12, float f10, float f11, float f12, boolean z13, Bitmap.Config config, C10014t.f fVar) {
        this.f45928d = uri;
        this.f45929e = i10;
        this.f45930f = str;
        this.f45931g = list == null ? null : Collections.unmodifiableList(list);
        this.f45932h = i11;
        this.f45933i = i12;
        this.f45934j = z10;
        this.f45935k = z11;
        this.f45936l = z12;
        this.f45937m = f10;
        this.f45938n = f11;
        this.f45939o = f12;
        this.f45940p = z13;
        this.f45941q = config;
        this.f45942r = fVar;
    }

    /* renamed from: a */
    public String m42132a() {
        Uri uri = this.f45928d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f45929e);
    }

    /* renamed from: b */
    public boolean m42133b() {
        return this.f45931g != null;
    }

    /* renamed from: c */
    public boolean m42134c() {
        return (this.f45932h == 0 && this.f45933i == 0) ? false : true;
    }

    /* renamed from: d */
    public String m42135d() {
        StringBuilder sb2;
        long nanoTime = System.nanoTime() - this.f45926b;
        if (nanoTime > f45924s) {
            sb2 = new StringBuilder();
            sb2.append(m42138g());
            sb2.append('+');
            sb2.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb2.append('s');
        } else {
            sb2 = new StringBuilder();
            sb2.append(m42138g());
            sb2.append('+');
            sb2.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb2.append("ms");
        }
        return sb2.toString();
    }

    /* renamed from: e */
    public boolean m42136e() {
        return m42134c() || this.f45937m != 0.0f;
    }

    /* renamed from: f */
    public boolean m42137f() {
        return m42136e() || m42133b();
    }

    /* renamed from: g */
    public String m42138g() {
        return "[R" + this.f45925a + ']';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i10 = this.f45929e;
        if (i10 > 0) {
            sb2.append(i10);
        } else {
            sb2.append(this.f45928d);
        }
        List<InterfaceC9997e0> list = this.f45931g;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC9997e0 interfaceC9997e0 : this.f45931g) {
                sb2.append(' ');
                sb2.append(interfaceC9997e0.key());
            }
        }
        if (this.f45930f != null) {
            sb2.append(" stableKey(");
            sb2.append(this.f45930f);
            sb2.append(')');
        }
        if (this.f45932h > 0) {
            sb2.append(" resize(");
            sb2.append(this.f45932h);
            sb2.append(',');
            sb2.append(this.f45933i);
            sb2.append(')');
        }
        if (this.f45934j) {
            sb2.append(" centerCrop");
        }
        if (this.f45935k) {
            sb2.append(" centerInside");
        }
        if (this.f45937m != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(this.f45937m);
            if (this.f45940p) {
                sb2.append(" @ ");
                sb2.append(this.f45938n);
                sb2.append(',');
                sb2.append(this.f45939o);
            }
            sb2.append(')');
        }
        if (this.f45941q != null) {
            sb2.append(' ');
            sb2.append(this.f45941q);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
