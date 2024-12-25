package p411xi;

import java.util.Arrays;
import kh.C5612f;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/w.class
 */
/* renamed from: xi.w */
/* loaded from: combined.jar:classes2.jar:xi/w.class */
public final class C9779w {

    /* renamed from: h */
    public static final a f44565h = new a(null);

    /* renamed from: a */
    @NotNull
    public final byte[] f44566a;

    /* renamed from: b */
    public int f44567b;

    /* renamed from: c */
    public int f44568c;

    /* renamed from: d */
    public boolean f44569d;

    /* renamed from: e */
    public boolean f44570e;

    /* renamed from: f */
    @Nullable
    public C9779w f44571f;

    /* renamed from: g */
    @Nullable
    public C9779w f44572g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/w$a.class
     */
    /* renamed from: xi.w$a */
    /* loaded from: combined.jar:classes2.jar:xi/w$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    public C9779w() {
        this.f44566a = new byte[NTLMEngineImpl.FLAG_WORKSTATION_PRESENT];
        this.f44570e = true;
        this.f44569d = false;
    }

    public C9779w(@NotNull byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        C9367f.m39526e(bArr, "data");
        this.f44566a = bArr;
        this.f44567b = i10;
        this.f44568c = i11;
        this.f44569d = z10;
        this.f44570e = z11;
    }

    /* renamed from: a */
    public final void m41266a() {
        int i10;
        C9779w c9779w = this.f44572g;
        if (!(c9779w != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        C9367f.m39524c(c9779w);
        if (c9779w.f44570e) {
            int i11 = this.f44568c - this.f44567b;
            C9779w c9779w2 = this.f44572g;
            C9367f.m39524c(c9779w2);
            int i12 = c9779w2.f44568c;
            C9779w c9779w3 = this.f44572g;
            C9367f.m39524c(c9779w3);
            if (c9779w3.f44569d) {
                i10 = 0;
            } else {
                C9779w c9779w4 = this.f44572g;
                C9367f.m39524c(c9779w4);
                i10 = c9779w4.f44567b;
            }
            if (i11 > (NTLMEngineImpl.FLAG_WORKSTATION_PRESENT - i12) + i10) {
                return;
            }
            C9779w c9779w5 = this.f44572g;
            C9367f.m39524c(c9779w5);
            m41272g(c9779w5, i11);
            m41267b();
            C9780x.m41273b(this);
        }
    }

    @Nullable
    /* renamed from: b */
    public final C9779w m41267b() {
        C9779w c9779w = this.f44571f;
        if (c9779w == this) {
            c9779w = null;
        }
        C9779w c9779w2 = this.f44572g;
        C9367f.m39524c(c9779w2);
        c9779w2.f44571f = this.f44571f;
        C9779w c9779w3 = this.f44571f;
        C9367f.m39524c(c9779w3);
        c9779w3.f44572g = this.f44572g;
        this.f44571f = null;
        this.f44572g = null;
        return c9779w;
    }

    @NotNull
    /* renamed from: c */
    public final C9779w m41268c(@NotNull C9779w c9779w) {
        C9367f.m39526e(c9779w, "segment");
        c9779w.f44572g = this;
        c9779w.f44571f = this.f44571f;
        C9779w c9779w2 = this.f44571f;
        C9367f.m39524c(c9779w2);
        c9779w2.f44572g = c9779w;
        this.f44571f = c9779w;
        return c9779w;
    }

    @NotNull
    /* renamed from: d */
    public final C9779w m41269d() {
        this.f44569d = true;
        return new C9779w(this.f44566a, this.f44567b, this.f44568c, true, false);
    }

    @NotNull
    /* renamed from: e */
    public final C9779w m41270e(int i10) {
        C9779w m41274c;
        if (!(i10 > 0 && i10 <= this.f44568c - this.f44567b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i10 >= 1024) {
            m41274c = m41269d();
        } else {
            m41274c = C9780x.m41274c();
            byte[] bArr = this.f44566a;
            byte[] bArr2 = m41274c.f44566a;
            int i11 = this.f44567b;
            C5612f.m27679e(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        m41274c.f44568c = m41274c.f44567b + i10;
        this.f44567b += i10;
        C9779w c9779w = this.f44572g;
        C9367f.m39524c(c9779w);
        c9779w.m41268c(m41274c);
        return m41274c;
    }

    @NotNull
    /* renamed from: f */
    public final C9779w m41271f() {
        byte[] bArr = this.f44566a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C9367f.m39525d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C9779w(copyOf, this.f44567b, this.f44568c, false, true);
    }

    /* renamed from: g */
    public final void m41272g(@NotNull C9779w c9779w, int i10) {
        C9367f.m39526e(c9779w, "sink");
        if (!c9779w.f44570e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = c9779w.f44568c;
        if (i11 + i10 > 8192) {
            if (c9779w.f44569d) {
                throw new IllegalArgumentException();
            }
            int i12 = c9779w.f44567b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c9779w.f44566a;
            C5612f.m27679e(bArr, bArr, 0, i12, i11, 2, null);
            c9779w.f44568c -= c9779w.f44567b;
            c9779w.f44567b = 0;
        }
        byte[] bArr2 = this.f44566a;
        byte[] bArr3 = c9779w.f44566a;
        int i13 = c9779w.f44568c;
        int i14 = this.f44567b;
        C5612f.m27677c(bArr2, bArr3, i13, i14, i14 + i10);
        c9779w.f44568c += i10;
        this.f44567b += i10;
    }
}
