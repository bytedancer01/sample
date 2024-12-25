package tg;

import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;
import tg.C8739o;
import vg.C9355j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/u.class
 */
/* renamed from: tg.u */
/* loaded from: combined.jar:classes2.jar:tg/u.class */
public final class C8745u {

    /* renamed from: a */
    public final C8743s f40687a;

    /* renamed from: b */
    public final EnumC8742r f40688b;

    /* renamed from: c */
    public final int f40689c;

    /* renamed from: d */
    public final String f40690d;

    /* renamed from: e */
    public final C8738n f40691e;

    /* renamed from: f */
    public final C8739o f40692f;

    /* renamed from: g */
    public final AbstractC8746v f40693g;

    /* renamed from: h */
    public C8745u f40694h;

    /* renamed from: i */
    public C8745u f40695i;

    /* renamed from: j */
    public final C8745u f40696j;

    /* renamed from: k */
    public volatile C8728d f40697k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/u$b.class
     */
    /* renamed from: tg.u$b */
    /* loaded from: combined.jar:classes2.jar:tg/u$b.class */
    public static class b {

        /* renamed from: a */
        public C8743s f40698a;

        /* renamed from: b */
        public EnumC8742r f40699b;

        /* renamed from: c */
        public int f40700c;

        /* renamed from: d */
        public String f40701d;

        /* renamed from: e */
        public C8738n f40702e;

        /* renamed from: f */
        public C8739o.b f40703f;

        /* renamed from: g */
        public AbstractC8746v f40704g;

        /* renamed from: h */
        public C8745u f40705h;

        /* renamed from: i */
        public C8745u f40706i;

        /* renamed from: j */
        public C8745u f40707j;

        public b() {
            this.f40700c = -1;
            this.f40703f = new C8739o.b();
        }

        public b(C8745u c8745u) {
            this.f40700c = -1;
            this.f40698a = c8745u.f40687a;
            this.f40699b = c8745u.f40688b;
            this.f40700c = c8745u.f40689c;
            this.f40701d = c8745u.f40690d;
            this.f40702e = c8745u.f40691e;
            this.f40703f = c8745u.f40692f.m37400e();
            this.f40704g = c8745u.f40693g;
            this.f40705h = c8745u.f40694h;
            this.f40706i = c8745u.f40695i;
            this.f40707j = c8745u.f40696j;
        }

        /* renamed from: k */
        public b m37522k(String str, String str2) {
            this.f40703f.m37405b(str, str2);
            return this;
        }

        /* renamed from: l */
        public b m37523l(AbstractC8746v abstractC8746v) {
            this.f40704g = abstractC8746v;
            return this;
        }

        /* renamed from: m */
        public C8745u m37524m() {
            if (this.f40698a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f40699b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f40700c >= 0) {
                return new C8745u(this);
            }
            throw new IllegalStateException("code < 0: " + this.f40700c);
        }

        /* renamed from: n */
        public b m37525n(C8745u c8745u) {
            if (c8745u != null) {
                m37527p("cacheResponse", c8745u);
            }
            this.f40706i = c8745u;
            return this;
        }

        /* renamed from: o */
        public final void m37526o(C8745u c8745u) {
            if (c8745u.f40693g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: p */
        public final void m37527p(String str, C8745u c8745u) {
            if (c8745u.f40693g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (c8745u.f40694h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (c8745u.f40695i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (c8745u.f40696j == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        /* renamed from: q */
        public b m37528q(int i10) {
            this.f40700c = i10;
            return this;
        }

        /* renamed from: r */
        public b m37529r(C8738n c8738n) {
            this.f40702e = c8738n;
            return this;
        }

        /* renamed from: s */
        public b m37530s(String str, String str2) {
            this.f40703f.m37410g(str, str2);
            return this;
        }

        /* renamed from: t */
        public b m37531t(C8739o c8739o) {
            this.f40703f = c8739o.m37400e();
            return this;
        }

        /* renamed from: u */
        public b m37532u(String str) {
            this.f40701d = str;
            return this;
        }

        /* renamed from: v */
        public b m37533v(C8745u c8745u) {
            if (c8745u != null) {
                m37527p("networkResponse", c8745u);
            }
            this.f40705h = c8745u;
            return this;
        }

        /* renamed from: w */
        public b m37534w(C8745u c8745u) {
            if (c8745u != null) {
                m37526o(c8745u);
            }
            this.f40707j = c8745u;
            return this;
        }

        /* renamed from: x */
        public b m37535x(EnumC8742r enumC8742r) {
            this.f40699b = enumC8742r;
            return this;
        }

        /* renamed from: y */
        public b m37536y(String str) {
            this.f40703f.m37409f(str);
            return this;
        }

        /* renamed from: z */
        public b m37537z(C8743s c8743s) {
            this.f40698a = c8743s;
            return this;
        }
    }

    public C8745u(b bVar) {
        this.f40687a = bVar.f40698a;
        this.f40688b = bVar.f40699b;
        this.f40689c = bVar.f40700c;
        this.f40690d = bVar.f40701d;
        this.f40691e = bVar.f40702e;
        this.f40692f = bVar.f40703f.m37408e();
        this.f40693g = bVar.f40704g;
        this.f40694h = bVar.f40705h;
        this.f40695i = bVar.f40706i;
        this.f40696j = bVar.f40707j;
    }

    /* renamed from: k */
    public AbstractC8746v m37497k() {
        return this.f40693g;
    }

    /* renamed from: l */
    public C8728d m37498l() {
        C8728d c8728d = this.f40697k;
        if (c8728d == null) {
            c8728d = C8728d.m37318h(this.f40692f);
            this.f40697k = c8728d;
        }
        return c8728d;
    }

    /* renamed from: m */
    public C8745u m37499m() {
        return this.f40695i;
    }

    /* renamed from: n */
    public List<C8731g> m37500n() {
        String str;
        int i10 = this.f40689c;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return Collections.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return C9355j.m39483h(m37505s(), str);
    }

    /* renamed from: o */
    public int m37501o() {
        return this.f40689c;
    }

    /* renamed from: p */
    public C8738n m37502p() {
        return this.f40691e;
    }

    /* renamed from: q */
    public String m37503q(String str) {
        return m37504r(str, null);
    }

    /* renamed from: r */
    public String m37504r(String str, String str2) {
        String m37397a = this.f40692f.m37397a(str);
        if (m37397a != null) {
            str2 = m37397a;
        }
        return str2;
    }

    /* renamed from: s */
    public C8739o m37505s() {
        return this.f40692f;
    }

    /* renamed from: t */
    public boolean m37506t() {
        int i10 = this.f40689c;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
            case HttpStatus.SC_SEE_OTHER /* 303 */:
                return true;
            default:
                return false;
        }
    }

    public String toString() {
        return "Response{protocol=" + this.f40688b + ", code=" + this.f40689c + ", message=" + this.f40690d + ", url=" + this.f40687a.m37467q() + '}';
    }

    /* renamed from: u */
    public String m37507u() {
        return this.f40690d;
    }

    /* renamed from: v */
    public C8745u m37508v() {
        return this.f40694h;
    }

    /* renamed from: w */
    public b m37509w() {
        return new b();
    }

    /* renamed from: x */
    public EnumC8742r m37510x() {
        return this.f40688b;
    }

    /* renamed from: y */
    public C8743s m37511y() {
        return this.f40687a;
    }
}
