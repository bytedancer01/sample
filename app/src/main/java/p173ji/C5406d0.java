package p173ji;

import ci.C1128n;
import java.util.LinkedHashMap;
import java.util.Map;
import kh.C5616j;
import kh.C5632z;
import ki.C5634b;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5391j;
import p173ji.C5432w;
import p274pi.C7729f;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/d0.class
 */
/* renamed from: ji.d0 */
/* loaded from: combined.jar:classes2.jar:ji/d0.class */
public final class C5406d0 {

    /* renamed from: a */
    public C5405d f30890a;

    /* renamed from: b */
    @NotNull
    public final C5433x f30891b;

    /* renamed from: c */
    @NotNull
    public final String f30892c;

    /* renamed from: d */
    @NotNull
    public final C5432w f30893d;

    /* renamed from: e */
    @Nullable
    public final AbstractC5408e0 f30894e;

    /* renamed from: f */
    @NotNull
    public final Map<Class<?>, Object> f30895f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/d0$a.class
     */
    /* renamed from: ji.d0$a */
    /* loaded from: combined.jar:classes2.jar:ji/d0$a.class */
    public static class a {

        /* renamed from: a */
        @Nullable
        public C5433x f30896a;

        /* renamed from: b */
        @NotNull
        public String f30897b;

        /* renamed from: c */
        @NotNull
        public C5432w.a f30898c;

        /* renamed from: d */
        @Nullable
        public AbstractC5408e0 f30899d;

        /* renamed from: e */
        @NotNull
        public Map<Class<?>, Object> f30900e;

        public a() {
            this.f30900e = new LinkedHashMap();
            this.f30897b = HttpGet.METHOD_NAME;
            this.f30898c = new C5432w.a();
        }

        public a(@NotNull C5406d0 c5406d0) {
            C9367f.m39526e(c5406d0, "request");
            this.f30900e = new LinkedHashMap();
            this.f30896a = c5406d0.m26880j();
            this.f30897b = c5406d0.m26877g();
            this.f30899d = c5406d0.m26871a();
            this.f30900e = c5406d0.m26873c().isEmpty() ? new LinkedHashMap() : C5632z.m27751e(c5406d0.m26873c());
            this.f30898c = c5406d0.m26875e().m27084f();
        }

        /* renamed from: e */
        public static /* synthetic */ a m26881e(a aVar, AbstractC5408e0 abstractC5408e0, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                abstractC5408e0 = C5634b.f31707d;
            }
            return aVar.m26885d(abstractC5408e0);
        }

        @NotNull
        /* renamed from: a */
        public a m26882a(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            this.f30898c.m27087a(str, str2);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public C5406d0 m26883b() {
            C5433x c5433x = this.f30896a;
            if (c5433x != null) {
                return new C5406d0(c5433x, this.f30897b, this.f30898c.m27092f(), this.f30899d, C5634b.m27774R(this.f30900e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @NotNull
        /* renamed from: c */
        public final a m26884c() {
            return m26881e(this, null, 1, null);
        }

        @NotNull
        /* renamed from: d */
        public a m26885d(@Nullable AbstractC5408e0 abstractC5408e0) {
            return m26888h(HttpDelete.METHOD_NAME, abstractC5408e0);
        }

        @NotNull
        /* renamed from: f */
        public a m26886f(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            this.f30898c.m27095i(str, str2);
            return this;
        }

        @NotNull
        /* renamed from: g */
        public a m26887g(@NotNull C5432w c5432w) {
            C9367f.m39526e(c5432w, "headers");
            this.f30898c = c5432w.m27084f();
            return this;
        }

        @NotNull
        /* renamed from: h */
        public a m26888h(@NotNull String str, @Nullable AbstractC5408e0 abstractC5408e0) {
            C9367f.m39526e(str, "method");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (abstractC5408e0 == null) {
                if (!(true ^ C7729f.m33745d(str))) {
                    throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                }
            } else if (!C7729f.m33744a(str)) {
                throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
            }
            this.f30897b = str;
            this.f30899d = abstractC5408e0;
            return this;
        }

        @NotNull
        /* renamed from: i */
        public a m26889i(@NotNull AbstractC5408e0 abstractC5408e0) {
            C9367f.m39526e(abstractC5408e0, "body");
            return m26888h("POST", abstractC5408e0);
        }

        @NotNull
        /* renamed from: j */
        public a m26890j(@NotNull String str) {
            C9367f.m39526e(str, "name");
            this.f30898c.m27094h(str);
            return this;
        }

        @NotNull
        /* renamed from: k */
        public <T> a m26891k(@NotNull Class<? super T> cls, @Nullable T t10) {
            C9367f.m39526e(cls, "type");
            if (t10 == null) {
                this.f30900e.remove(cls);
            } else {
                if (this.f30900e.isEmpty()) {
                    this.f30900e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f30900e;
                T cast = cls.cast(t10);
                C9367f.m39524c(cast);
                map.put(cls, cast);
            }
            return this;
        }

        @NotNull
        /* renamed from: l */
        public a m26892l(@NotNull String str) {
            String str2;
            StringBuilder sb2;
            int i10;
            C9367f.m39526e(str, "url");
            if (!C1128n.m6730w(str, "ws:", true)) {
                str2 = str;
                if (C1128n.m6730w(str, "wss:", true)) {
                    sb2 = new StringBuilder();
                    sb2.append("https:");
                    i10 = 4;
                }
                return m26893m(C5433x.f31147l.m27160d(str2));
            }
            sb2 = new StringBuilder();
            sb2.append("http:");
            i10 = 3;
            String substring = str.substring(i10);
            C9367f.m39525d(substring, "(this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            str2 = sb2.toString();
            return m26893m(C5433x.f31147l.m27160d(str2));
        }

        @NotNull
        /* renamed from: m */
        public a m26893m(@NotNull C5433x c5433x) {
            C9367f.m39526e(c5433x, "url");
            this.f30896a = c5433x;
            return this;
        }
    }

    public C5406d0(@NotNull C5433x c5433x, @NotNull String str, @NotNull C5432w c5432w, @Nullable AbstractC5408e0 abstractC5408e0, @NotNull Map<Class<?>, ? extends Object> map) {
        C9367f.m39526e(c5433x, "url");
        C9367f.m39526e(str, "method");
        C9367f.m39526e(c5432w, "headers");
        C9367f.m39526e(map, "tags");
        this.f30891b = c5433x;
        this.f30892c = str;
        this.f30893d = c5432w;
        this.f30894e = abstractC5408e0;
        this.f30895f = map;
    }

    @Nullable
    /* renamed from: a */
    public final AbstractC5408e0 m26871a() {
        return this.f30894e;
    }

    @NotNull
    /* renamed from: b */
    public final C5405d m26872b() {
        C5405d c5405d = this.f30890a;
        C5405d c5405d2 = c5405d;
        if (c5405d == null) {
            c5405d2 = C5405d.f30868p.m26870b(this.f30893d);
            this.f30890a = c5405d2;
        }
        return c5405d2;
    }

    @NotNull
    /* renamed from: c */
    public final Map<Class<?>, Object> m26873c() {
        return this.f30895f;
    }

    @Nullable
    /* renamed from: d */
    public final String m26874d(@NotNull String str) {
        C9367f.m39526e(str, "name");
        return this.f30893d.m27081a(str);
    }

    @NotNull
    /* renamed from: e */
    public final C5432w m26875e() {
        return this.f30893d;
    }

    /* renamed from: f */
    public final boolean m26876f() {
        return this.f30891b.m27113j();
    }

    @NotNull
    /* renamed from: g */
    public final String m26877g() {
        return this.f30892c;
    }

    @NotNull
    /* renamed from: h */
    public final a m26878h() {
        return new a(this);
    }

    @Nullable
    /* renamed from: i */
    public final <T> T m26879i(@NotNull Class<? extends T> cls) {
        C9367f.m39526e(cls, "type");
        return cls.cast(this.f30895f.get(cls));
    }

    @NotNull
    /* renamed from: j */
    public final C5433x m26880j() {
        return this.f30891b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f30892c);
        sb2.append(", url=");
        sb2.append(this.f30891b);
        if (this.f30893d.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (C5391j<? extends String, ? extends String> c5391j : this.f30893d) {
                if (i10 < 0) {
                    C5616j.m27707m();
                }
                C5391j<? extends String, ? extends String> c5391j2 = c5391j;
                String m26737a = c5391j2.m26737a();
                String m26738b = c5391j2.m26738b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(m26737a);
                sb2.append(':');
                sb2.append(m26738b);
                i10++;
            }
            sb2.append(']');
        }
        if (!this.f30895f.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f30895f);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C9367f.m39525d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
