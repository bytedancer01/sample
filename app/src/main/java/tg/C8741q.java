package tg;

import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p409xg.C9749b;
import tg.C8739o;
import ug.AbstractC9177b;
import ug.C9182g;
import ug.C9183h;
import ug.InterfaceC9178c;
import ug.InterfaceC9180e;
import vg.C9346a;
import vg.C9352g;
import vg.InterfaceC9361p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/q.class
 */
/* renamed from: tg.q */
/* loaded from: combined.jar:classes2.jar:tg/q.class */
public class C8741q implements Cloneable {

    /* renamed from: w */
    public static final List<EnumC8742r> f40648w = C9183h.m38693m(EnumC8742r.HTTP_2, EnumC8742r.SPDY_3, EnumC8742r.HTTP_1_1);

    /* renamed from: x */
    public static final List<C8735k> f40649x = C9183h.m38693m(C8735k.f40626f, C8735k.f40627g, C8735k.f40628h);

    /* renamed from: y */
    public static SSLSocketFactory f40650y;

    /* renamed from: b */
    public final C9182g f40651b;

    /* renamed from: c */
    public C8737m f40652c;

    /* renamed from: d */
    public Proxy f40653d;

    /* renamed from: e */
    public List<EnumC8742r> f40654e;

    /* renamed from: f */
    public List<C8735k> f40655f;

    /* renamed from: g */
    public ProxySelector f40656g;

    /* renamed from: h */
    public CookieHandler f40657h;

    /* renamed from: i */
    public InterfaceC9178c f40658i;

    /* renamed from: j */
    public C8727c f40659j;

    /* renamed from: k */
    public SocketFactory f40660k;

    /* renamed from: l */
    public SSLSocketFactory f40661l;

    /* renamed from: m */
    public HostnameVerifier f40662m;

    /* renamed from: n */
    public C8730f f40663n;

    /* renamed from: o */
    public InterfaceC8726b f40664o;

    /* renamed from: p */
    public C8734j f40665p;

    /* renamed from: q */
    public InterfaceC9180e f40666q;

    /* renamed from: r */
    public boolean f40667r;

    /* renamed from: s */
    public boolean f40668s;

    /* renamed from: t */
    public int f40669t;

    /* renamed from: u */
    public int f40670u;

    /* renamed from: v */
    public int f40671v;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/q$a.class
     */
    /* renamed from: tg.q$a */
    /* loaded from: combined.jar:classes2.jar:tg/q$a.class */
    public static final class a extends AbstractC9177b {
        @Override // ug.AbstractC9177b
        /* renamed from: a */
        public void mo37439a(C8739o.b bVar, String str) {
            bVar.m37407d(str);
        }

        @Override // ug.AbstractC9177b
        /* renamed from: b */
        public boolean mo37440b(C8733i c8733i) {
            return c8733i.m37339a();
        }

        @Override // ug.AbstractC9177b
        /* renamed from: c */
        public void mo37441c(C8741q c8741q, C8733i c8733i, C9352g c9352g, C8743s c8743s) {
            c8733i.m37341c(c8741q, c9352g, c8743s);
        }

        @Override // ug.AbstractC9177b
        /* renamed from: d */
        public InterfaceC9178c mo37442d(C8741q c8741q) {
            return c8741q.m37413C();
        }

        @Override // ug.AbstractC9177b
        /* renamed from: e */
        public boolean mo37443e(C8733i c8733i) {
            return c8733i.m37352n();
        }

        @Override // ug.AbstractC9177b
        /* renamed from: f */
        public InterfaceC9180e mo37444f(C8741q c8741q) {
            return c8741q.f40666q;
        }

        @Override // ug.AbstractC9177b
        /* renamed from: g */
        public InterfaceC9361p mo37445g(C8733i c8733i, C9352g c9352g) {
            return c8733i.m37355q(c9352g);
        }

        @Override // ug.AbstractC9177b
        /* renamed from: h */
        public void mo37446h(C8734j c8734j, C8733i c8733i) {
            c8734j.m37368f(c8733i);
        }

        @Override // ug.AbstractC9177b
        /* renamed from: i */
        public int mo37447i(C8733i c8733i) {
            return c8733i.m37356r();
        }

        @Override // ug.AbstractC9177b
        /* renamed from: j */
        public C9182g mo37448j(C8741q c8741q) {
            return c8741q.m37415E();
        }

        @Override // ug.AbstractC9177b
        /* renamed from: k */
        public void mo37449k(C8733i c8733i, C9352g c9352g) {
            c8733i.m37358t(c9352g);
        }

        @Override // ug.AbstractC9177b
        /* renamed from: l */
        public void mo37450l(C8733i c8733i, EnumC8742r enumC8742r) {
            c8733i.m37359u(enumC8742r);
        }
    }

    static {
        AbstractC9177b.f41993b = new a();
    }

    public C8741q() {
        this.f40667r = true;
        this.f40668s = true;
        this.f40651b = new C9182g();
        this.f40652c = new C8737m();
    }

    public C8741q(C8741q c8741q) {
        this.f40667r = true;
        this.f40668s = true;
        this.f40651b = c8741q.f40651b;
        this.f40652c = c8741q.f40652c;
        this.f40653d = c8741q.f40653d;
        this.f40654e = c8741q.f40654e;
        this.f40655f = c8741q.f40655f;
        this.f40656g = c8741q.f40656g;
        this.f40657h = c8741q.f40657h;
        C8727c c8727c = c8741q.f40659j;
        this.f40659j = c8727c;
        this.f40658i = c8727c != null ? c8727c.f40546a : c8741q.f40658i;
        this.f40660k = c8741q.f40660k;
        this.f40661l = c8741q.f40661l;
        this.f40662m = c8741q.f40662m;
        this.f40663n = c8741q.f40663n;
        this.f40664o = c8741q.f40664o;
        this.f40665p = c8741q.f40665p;
        this.f40666q = c8741q.f40666q;
        this.f40667r = c8741q.f40667r;
        this.f40668s = c8741q.f40668s;
        this.f40669t = c8741q.f40669t;
        this.f40670u = c8741q.f40670u;
        this.f40671v = c8741q.f40671v;
    }

    /* renamed from: A */
    public final int m37412A() {
        return this.f40671v;
    }

    /* renamed from: C */
    public final InterfaceC9178c m37413C() {
        return this.f40658i;
    }

    /* renamed from: D */
    public C8729e m37414D(C8743s c8743s) {
        return new C8729e(this, c8743s);
    }

    /* renamed from: E */
    public final C9182g m37415E() {
        return this.f40651b;
    }

    /* renamed from: F */
    public final C8741q m37416F(C8727c c8727c) {
        this.f40659j = c8727c;
        this.f40658i = null;
        return this;
    }

    /* renamed from: G */
    public final void m37417G(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        this.f40669t = (int) millis;
    }

    /* renamed from: H */
    public final void m37418H(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        this.f40670u = (int) millis;
    }

    /* renamed from: I */
    public final void m37419I(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        this.f40671v = (int) millis;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8741q clone() {
        try {
            return (C8741q) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    public final C8741q m37421c() {
        C8741q c8741q = new C8741q(this);
        if (c8741q.f40656g == null) {
            c8741q.f40656g = ProxySelector.getDefault();
        }
        if (c8741q.f40657h == null) {
            c8741q.f40657h = CookieHandler.getDefault();
        }
        if (c8741q.f40660k == null) {
            c8741q.f40660k = SocketFactory.getDefault();
        }
        if (c8741q.f40661l == null) {
            c8741q.f40661l = m37428k();
        }
        if (c8741q.f40662m == null) {
            c8741q.f40662m = C9749b.f44495a;
        }
        if (c8741q.f40663n == null) {
            c8741q.f40663n = C8730f.f40603b;
        }
        if (c8741q.f40664o == null) {
            c8741q.f40664o = C9346a.f42787a;
        }
        if (c8741q.f40665p == null) {
            c8741q.f40665p = C8734j.m37366e();
        }
        if (c8741q.f40654e == null) {
            c8741q.f40654e = f40648w;
        }
        if (c8741q.f40655f == null) {
            c8741q.f40655f = f40649x;
        }
        if (c8741q.f40666q == null) {
            c8741q.f40666q = InterfaceC9180e.f41995a;
        }
        return c8741q;
    }

    /* renamed from: d */
    public final InterfaceC8726b m37422d() {
        return this.f40664o;
    }

    /* renamed from: e */
    public final C8730f m37423e() {
        return this.f40663n;
    }

    /* renamed from: g */
    public final int m37424g() {
        return this.f40669t;
    }

    /* renamed from: h */
    public final C8734j m37425h() {
        return this.f40665p;
    }

    /* renamed from: i */
    public final List<C8735k> m37426i() {
        return this.f40655f;
    }

    /* renamed from: j */
    public final CookieHandler m37427j() {
        return this.f40657h;
    }

    /* renamed from: k */
    public final SSLSocketFactory m37428k() {
        SSLSocketFactory sSLSocketFactory;
        synchronized (this) {
            if (f40650y == null) {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, null, null);
                    f40650y = sSLContext.getSocketFactory();
                } catch (GeneralSecurityException e10) {
                    throw new AssertionError();
                }
            }
            sSLSocketFactory = f40650y;
        }
        return sSLSocketFactory;
    }

    /* renamed from: l */
    public final C8737m m37429l() {
        return this.f40652c;
    }

    /* renamed from: m */
    public final boolean m37430m() {
        return this.f40668s;
    }

    /* renamed from: n */
    public final boolean m37431n() {
        return this.f40667r;
    }

    /* renamed from: o */
    public final HostnameVerifier m37432o() {
        return this.f40662m;
    }

    /* renamed from: p */
    public final List<EnumC8742r> m37433p() {
        return this.f40654e;
    }

    /* renamed from: r */
    public final Proxy m37434r() {
        return this.f40653d;
    }

    /* renamed from: s */
    public final ProxySelector m37435s() {
        return this.f40656g;
    }

    /* renamed from: u */
    public final int m37436u() {
        return this.f40670u;
    }

    /* renamed from: x */
    public final SocketFactory m37437x() {
        return this.f40660k;
    }

    /* renamed from: z */
    public final SSLSocketFactory m37438z() {
        return this.f40661l;
    }
}
