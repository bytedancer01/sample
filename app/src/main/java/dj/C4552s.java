package dj;

import java.util.regex.Pattern;
import p173ji.AbstractC5408e0;
import p173ji.C5400a0;
import p173ji.C5406d0;
import p173ji.C5430u;
import p173ji.C5432w;
import p173ji.C5433x;
import p173ji.C5435z;
import p411xi.C9761e;
import p411xi.InterfaceC9762f;

/* renamed from: dj.s */
/* loaded from: combined.jar:classes3.jar:dj/s.class */
public final class C4552s {

    /* renamed from: l */
    public static final char[] f27078l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f27079m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f27080a;

    /* renamed from: b */
    public final C5433x f27081b;

    /* renamed from: c */
    public String f27082c;

    /* renamed from: d */
    public C5433x.a f27083d;

    /* renamed from: e */
    public final C5406d0.a f27084e = new C5406d0.a();

    /* renamed from: f */
    public final C5432w.a f27085f;

    /* renamed from: g */
    public C5435z f27086g;

    /* renamed from: h */
    public final boolean f27087h;

    /* renamed from: i */
    public C5400a0.a f27088i;

    /* renamed from: j */
    public C5430u.a f27089j;

    /* renamed from: k */
    public AbstractC5408e0 f27090k;

    /* renamed from: dj.s$a */
    /* loaded from: combined.jar:classes3.jar:dj/s$a.class */
    public static class a extends AbstractC5408e0 {

        /* renamed from: b */
        public final AbstractC5408e0 f27091b;

        /* renamed from: c */
        public final C5435z f27092c;

        public a(AbstractC5408e0 abstractC5408e0, C5435z c5435z) {
            this.f27091b = abstractC5408e0;
            this.f27092c = c5435z;
        }

        @Override // p173ji.AbstractC5408e0
        /* renamed from: a */
        public long mo22935a() {
            return this.f27091b.mo22935a();
        }

        @Override // p173ji.AbstractC5408e0
        /* renamed from: b */
        public C5435z mo22936b() {
            return this.f27092c;
        }

        @Override // p173ji.AbstractC5408e0
        /* renamed from: i */
        public void mo22937i(InterfaceC9762f interfaceC9762f) {
            this.f27091b.mo22937i(interfaceC9762f);
        }
    }

    public C4552s(String str, C5433x c5433x, String str2, C5432w c5432w, C5435z c5435z, boolean z10, boolean z11, boolean z12) {
        this.f27080a = str;
        this.f27081b = c5433x;
        this.f27082c = str2;
        this.f27086g = c5435z;
        this.f27087h = z10;
        this.f27085f = c5432w != null ? c5432w.m27084f() : new C5432w.a();
        if (z11) {
            this.f27089j = new C5430u.a();
        } else if (z12) {
            C5400a0.a aVar = new C5400a0.a();
            this.f27088i = aVar;
            aVar.m26768f(C5400a0.f30786k);
        }
    }

    /* renamed from: i */
    public static String m22922i(String str, boolean z10) {
        int i10;
        String str2;
        int length = str.length();
        int i11 = 0;
        while (true) {
            i10 = i11;
            str2 = str;
            if (i10 >= length) {
                break;
            }
            int codePointAt = str.codePointAt(i10);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                break;
            }
            i11 = i10 + Character.charCount(codePointAt);
        }
        C9761e c9761e = new C9761e();
        c9761e.mo41140T(str, 0, i10);
        m22923j(c9761e, str, i10, length, z10);
        str2 = c9761e.m41134O0();
        return str2;
    }

    /* renamed from: j */
    public static void m22923j(C9761e c9761e, String str, int i10, int i11, boolean z10) {
        C9761e c9761e2;
        C9761e c9761e3 = null;
        while (true) {
            C9761e c9761e4 = c9761e3;
            if (i10 >= i11) {
                return;
            }
            int codePointAt = str.codePointAt(i10);
            if (z10) {
                c9761e2 = c9761e4;
                if (codePointAt != 9) {
                    c9761e2 = c9761e4;
                    if (codePointAt != 10) {
                        c9761e2 = c9761e4;
                        if (codePointAt != 12) {
                            if (codePointAt == 13) {
                                c9761e2 = c9761e4;
                            }
                        }
                    }
                }
                i10 += Character.charCount(codePointAt);
                c9761e3 = c9761e2;
            }
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                C9761e c9761e5 = c9761e4;
                if (c9761e4 == null) {
                    c9761e5 = new C9761e();
                }
                c9761e5.m41161h1(codePointAt);
                while (true) {
                    c9761e2 = c9761e5;
                    if (!c9761e5.mo41164k0()) {
                        int readByte = c9761e5.readByte() & 255;
                        c9761e.writeByte(37);
                        char[] cArr = f27078l;
                        c9761e.writeByte(cArr[(readByte >> 4) & 15]);
                        c9761e.writeByte(cArr[readByte & 15]);
                    }
                }
            } else {
                c9761e.m41161h1(codePointAt);
                c9761e2 = c9761e4;
            }
            i10 += Character.charCount(codePointAt);
            c9761e3 = c9761e2;
        }
    }

    /* renamed from: a */
    public void m22924a(String str, String str2, boolean z10) {
        if (z10) {
            this.f27089j.m27069b(str, str2);
        } else {
            this.f27089j.m27068a(str, str2);
        }
    }

    /* renamed from: b */
    public void m22925b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f27085f.m27087a(str, str2);
            return;
        }
        try {
            this.f27086g = C5435z.m27173e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    /* renamed from: c */
    public void m22926c(C5432w c5432w) {
        this.f27085f.m27088b(c5432w);
    }

    /* renamed from: d */
    public void m22927d(C5432w c5432w, AbstractC5408e0 abstractC5408e0) {
        this.f27088i.m26765c(c5432w, abstractC5408e0);
    }

    /* renamed from: e */
    public void m22928e(C5400a0.c cVar) {
        this.f27088i.m26766d(cVar);
    }

    /* renamed from: f */
    public void m22929f(String str, String str2, boolean z10) {
        if (this.f27082c == null) {
            throw new AssertionError();
        }
        String m22922i = m22922i(str2, z10);
        String replace = this.f27082c.replace("{" + str + "}", m22922i);
        if (!f27079m.matcher(replace).matches()) {
            this.f27082c = replace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* renamed from: g */
    public void m22930g(String str, String str2, boolean z10) {
        String str3 = this.f27082c;
        if (str3 != null) {
            C5433x.a m27115l = this.f27081b.m27115l(str3);
            this.f27083d = m27115l;
            if (m27115l == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f27081b + ", Relative: " + this.f27082c);
            }
            this.f27082c = null;
        }
        if (z10) {
            this.f27083d.m27124a(str, str2);
        } else {
            this.f27083d.m27125b(str, str2);
        }
    }

    /* renamed from: h */
    public <T> void m22931h(Class<T> cls, T t10) {
        this.f27084e.m26891k(cls, t10);
    }

    /* renamed from: k */
    public C5406d0.a m22932k() {
        C5433x m27120r;
        C5433x.a aVar = this.f27083d;
        if (aVar != null) {
            m27120r = aVar.m27126c();
        } else {
            m27120r = this.f27081b.m27120r(this.f27082c);
            if (m27120r == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f27081b + ", Relative: " + this.f27082c);
            }
        }
        AbstractC5408e0 abstractC5408e0 = this.f27090k;
        AbstractC5408e0 abstractC5408e02 = abstractC5408e0;
        if (abstractC5408e0 == null) {
            C5430u.a aVar2 = this.f27089j;
            if (aVar2 != null) {
                abstractC5408e02 = aVar2.m27070c();
            } else {
                C5400a0.a aVar3 = this.f27088i;
                if (aVar3 != null) {
                    abstractC5408e02 = aVar3.m26767e();
                } else {
                    abstractC5408e02 = abstractC5408e0;
                    if (this.f27087h) {
                        abstractC5408e02 = AbstractC5408e0.m26898f(null, new byte[0]);
                    }
                }
            }
        }
        C5435z c5435z = this.f27086g;
        AbstractC5408e0 abstractC5408e03 = abstractC5408e02;
        if (c5435z != null) {
            if (abstractC5408e02 != null) {
                abstractC5408e03 = new a(abstractC5408e02, c5435z);
            } else {
                this.f27085f.m27087a("Content-Type", c5435z.toString());
                abstractC5408e03 = abstractC5408e02;
            }
        }
        return this.f27084e.m26893m(m27120r).m26887g(this.f27085f.m27092f()).m26888h(this.f27080a, abstractC5408e03);
    }

    /* renamed from: l */
    public void m22933l(AbstractC5408e0 abstractC5408e0) {
        this.f27090k = abstractC5408e0;
    }

    /* renamed from: m */
    public void m22934m(Object obj) {
        this.f27082c = obj.toString();
    }
}
