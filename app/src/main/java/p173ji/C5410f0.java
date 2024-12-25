package p173ji;

import java.io.Closeable;
import java.util.List;
import kh.C5616j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5432w;
import p253oi.C6979c;
import p274pi.C7728e;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/f0.class
 */
/* renamed from: ji.f0 */
/* loaded from: combined.jar:classes2.jar:ji/f0.class */
public final class C5410f0 implements Closeable {

    /* renamed from: b */
    public C5405d f30910b;

    /* renamed from: c */
    @NotNull
    public final C5406d0 f30911c;

    /* renamed from: d */
    @NotNull
    public final EnumC5404c0 f30912d;

    /* renamed from: e */
    @NotNull
    public final String f30913e;

    /* renamed from: f */
    public final int f30914f;

    /* renamed from: g */
    @Nullable
    public final C5431v f30915g;

    /* renamed from: h */
    @NotNull
    public final C5432w f30916h;

    /* renamed from: i */
    @Nullable
    public final AbstractC5412g0 f30917i;

    /* renamed from: j */
    @Nullable
    public final C5410f0 f30918j;

    /* renamed from: k */
    @Nullable
    public final C5410f0 f30919k;

    /* renamed from: l */
    @Nullable
    public final C5410f0 f30920l;

    /* renamed from: m */
    public final long f30921m;

    /* renamed from: n */
    public final long f30922n;

    /* renamed from: o */
    @Nullable
    public final C6979c f30923o;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/f0$a.class
     */
    /* renamed from: ji.f0$a */
    /* loaded from: combined.jar:classes2.jar:ji/f0$a.class */
    public static class a {

        /* renamed from: a */
        @Nullable
        public C5406d0 f30924a;

        /* renamed from: b */
        @Nullable
        public EnumC5404c0 f30925b;

        /* renamed from: c */
        public int f30926c;

        /* renamed from: d */
        @Nullable
        public String f30927d;

        /* renamed from: e */
        @Nullable
        public C5431v f30928e;

        /* renamed from: f */
        @NotNull
        public C5432w.a f30929f;

        /* renamed from: g */
        @Nullable
        public AbstractC5412g0 f30930g;

        /* renamed from: h */
        @Nullable
        public C5410f0 f30931h;

        /* renamed from: i */
        @Nullable
        public C5410f0 f30932i;

        /* renamed from: j */
        @Nullable
        public C5410f0 f30933j;

        /* renamed from: k */
        public long f30934k;

        /* renamed from: l */
        public long f30935l;

        /* renamed from: m */
        @Nullable
        public C6979c f30936m;

        public a() {
            this.f30926c = -1;
            this.f30929f = new C5432w.a();
        }

        public a(@NotNull C5410f0 c5410f0) {
            C9367f.m39526e(c5410f0, "response");
            this.f30926c = -1;
            this.f30924a = c5410f0.m26918F0();
            this.f30925b = c5410f0.m26916D0();
            this.f30926c = c5410f0.m26925q();
            this.f30927d = c5410f0.m26929v0();
            this.f30928e = c5410f0.m26928v();
            this.f30929f = c5410f0.m26923o0().m27084f();
            this.f30930g = c5410f0.m26920f();
            this.f30931h = c5410f0.m26913A0();
            this.f30932i = c5410f0.m26922o();
            this.f30933j = c5410f0.m26915C0();
            this.f30934k = c5410f0.m26919G0();
            this.f30935l = c5410f0.m26917E0();
            this.f30936m = c5410f0.m26927t();
        }

        @NotNull
        /* renamed from: a */
        public a m26932a(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            this.f30929f.m27087a(str, str2);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public a m26933b(@Nullable AbstractC5412g0 abstractC5412g0) {
            this.f30930g = abstractC5412g0;
            return this;
        }

        @NotNull
        /* renamed from: c */
        public C5410f0 m26934c() {
            int i10 = this.f30926c;
            if (!(i10 >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.f30926c).toString());
            }
            C5406d0 c5406d0 = this.f30924a;
            if (c5406d0 == null) {
                throw new IllegalStateException("request == null".toString());
            }
            EnumC5404c0 enumC5404c0 = this.f30925b;
            if (enumC5404c0 == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f30927d;
            if (str != null) {
                return new C5410f0(c5406d0, enumC5404c0, str, i10, this.f30928e, this.f30929f.m27092f(), this.f30930g, this.f30931h, this.f30932i, this.f30933j, this.f30934k, this.f30935l, this.f30936m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        @NotNull
        /* renamed from: d */
        public a m26935d(@Nullable C5410f0 c5410f0) {
            m26937f("cacheResponse", c5410f0);
            this.f30932i = c5410f0;
            return this;
        }

        /* renamed from: e */
        public final void m26936e(C5410f0 c5410f0) {
            if (c5410f0 != null) {
                if (!(c5410f0.m26920f() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        /* renamed from: f */
        public final void m26937f(String str, C5410f0 c5410f0) {
            if (c5410f0 != null) {
                if (!(c5410f0.m26920f() == null)) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (!(c5410f0.m26913A0() == null)) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (!(c5410f0.m26922o() == null)) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (c5410f0.m26915C0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        @NotNull
        /* renamed from: g */
        public a m26938g(int i10) {
            this.f30926c = i10;
            return this;
        }

        /* renamed from: h */
        public final int m26939h() {
            return this.f30926c;
        }

        @NotNull
        /* renamed from: i */
        public a m26940i(@Nullable C5431v c5431v) {
            this.f30928e = c5431v;
            return this;
        }

        @NotNull
        /* renamed from: j */
        public a m26941j(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            this.f30929f.m27095i(str, str2);
            return this;
        }

        @NotNull
        /* renamed from: k */
        public a m26942k(@NotNull C5432w c5432w) {
            C9367f.m39526e(c5432w, "headers");
            this.f30929f = c5432w.m27084f();
            return this;
        }

        /* renamed from: l */
        public final void m26943l(@NotNull C6979c c6979c) {
            C9367f.m39526e(c6979c, "deferredTrailers");
            this.f30936m = c6979c;
        }

        @NotNull
        /* renamed from: m */
        public a m26944m(@NotNull String str) {
            C9367f.m39526e(str, "message");
            this.f30927d = str;
            return this;
        }

        @NotNull
        /* renamed from: n */
        public a m26945n(@Nullable C5410f0 c5410f0) {
            m26937f("networkResponse", c5410f0);
            this.f30931h = c5410f0;
            return this;
        }

        @NotNull
        /* renamed from: o */
        public a m26946o(@Nullable C5410f0 c5410f0) {
            m26936e(c5410f0);
            this.f30933j = c5410f0;
            return this;
        }

        @NotNull
        /* renamed from: p */
        public a m26947p(@NotNull EnumC5404c0 enumC5404c0) {
            C9367f.m39526e(enumC5404c0, "protocol");
            this.f30925b = enumC5404c0;
            return this;
        }

        @NotNull
        /* renamed from: q */
        public a m26948q(long j10) {
            this.f30935l = j10;
            return this;
        }

        @NotNull
        /* renamed from: r */
        public a m26949r(@NotNull C5406d0 c5406d0) {
            C9367f.m39526e(c5406d0, "request");
            this.f30924a = c5406d0;
            return this;
        }

        @NotNull
        /* renamed from: s */
        public a m26950s(long j10) {
            this.f30934k = j10;
            return this;
        }
    }

    public C5410f0(@NotNull C5406d0 c5406d0, @NotNull EnumC5404c0 enumC5404c0, @NotNull String str, int i10, @Nullable C5431v c5431v, @NotNull C5432w c5432w, @Nullable AbstractC5412g0 abstractC5412g0, @Nullable C5410f0 c5410f0, @Nullable C5410f0 c5410f02, @Nullable C5410f0 c5410f03, long j10, long j11, @Nullable C6979c c6979c) {
        C9367f.m39526e(c5406d0, "request");
        C9367f.m39526e(enumC5404c0, "protocol");
        C9367f.m39526e(str, "message");
        C9367f.m39526e(c5432w, "headers");
        this.f30911c = c5406d0;
        this.f30912d = enumC5404c0;
        this.f30913e = str;
        this.f30914f = i10;
        this.f30915g = c5431v;
        this.f30916h = c5432w;
        this.f30917i = abstractC5412g0;
        this.f30918j = c5410f0;
        this.f30919k = c5410f02;
        this.f30920l = c5410f03;
        this.f30921m = j10;
        this.f30922n = j11;
        this.f30923o = c6979c;
    }

    /* renamed from: B */
    public static /* synthetic */ String m26912B(C5410f0 c5410f0, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c5410f0.m26931y(str, str2);
    }

    @Nullable
    /* renamed from: A0 */
    public final C5410f0 m26913A0() {
        return this.f30918j;
    }

    @NotNull
    /* renamed from: B0 */
    public final a m26914B0() {
        return new a(this);
    }

    @Nullable
    /* renamed from: C0 */
    public final C5410f0 m26915C0() {
        return this.f30920l;
    }

    @NotNull
    /* renamed from: D0 */
    public final EnumC5404c0 m26916D0() {
        return this.f30912d;
    }

    /* renamed from: E0 */
    public final long m26917E0() {
        return this.f30922n;
    }

    @NotNull
    /* renamed from: F0 */
    public final C5406d0 m26918F0() {
        return this.f30911c;
    }

    /* renamed from: G0 */
    public final long m26919G0() {
        return this.f30921m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC5412g0 abstractC5412g0 = this.f30917i;
        if (abstractC5412g0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        abstractC5412g0.close();
    }

    @Nullable
    /* renamed from: f */
    public final AbstractC5412g0 m26920f() {
        return this.f30917i;
    }

    @NotNull
    /* renamed from: l */
    public final C5405d m26921l() {
        C5405d c5405d = this.f30910b;
        C5405d c5405d2 = c5405d;
        if (c5405d == null) {
            c5405d2 = C5405d.f30868p.m26870b(this.f30916h);
            this.f30910b = c5405d2;
        }
        return c5405d2;
    }

    @Nullable
    /* renamed from: o */
    public final C5410f0 m26922o() {
        return this.f30919k;
    }

    @NotNull
    /* renamed from: o0 */
    public final C5432w m26923o0() {
        return this.f30916h;
    }

    @NotNull
    /* renamed from: p */
    public final List<C5413h> m26924p() {
        String str;
        C5432w c5432w = this.f30916h;
        int i10 = this.f30914f;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return C5616j.m27700f();
            }
            str = "Proxy-Authenticate";
        }
        return C7728e.m33736a(c5432w, str);
    }

    /* renamed from: q */
    public final int m26925q() {
        return this.f30914f;
    }

    /* renamed from: q0 */
    public final boolean m26926q0() {
        int i10 = this.f30914f;
        return 200 <= i10 && 299 >= i10;
    }

    @Nullable
    /* renamed from: t */
    public final C6979c m26927t() {
        return this.f30923o;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.f30912d + ", code=" + this.f30914f + ", message=" + this.f30913e + ", url=" + this.f30911c.m26880j() + '}';
    }

    @Nullable
    /* renamed from: v */
    public final C5431v m26928v() {
        return this.f30915g;
    }

    @NotNull
    /* renamed from: v0 */
    public final String m26929v0() {
        return this.f30913e;
    }

    @Nullable
    /* renamed from: w */
    public final String m26930w(@NotNull String str) {
        return m26912B(this, str, null, 2, null);
    }

    @Nullable
    /* renamed from: y */
    public final String m26931y(@NotNull String str, @Nullable String str2) {
        C9367f.m39526e(str, "name");
        String m27081a = this.f30916h.m27081a(str);
        if (m27081a != null) {
            str2 = m27081a;
        }
        return str2;
    }
}
