package p253oi;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kh.C5615i;
import kh.C5616j;
import kh.C5621o;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import p173ji.AbstractC5429t;
import p173ji.C5399a;
import p173ji.C5414h0;
import p173ji.C5433x;
import p173ji.InterfaceC5407e;
import p356uh.InterfaceC9185a;
import p372vh.AbstractC9368g;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oi/k.class
 */
/* renamed from: oi.k */
/* loaded from: combined.jar:classes2.jar:oi/k.class */
public final class C6987k {

    /* renamed from: i */
    public static final a f36089i = new a(null);

    /* renamed from: a */
    public List<? extends Proxy> f36090a;

    /* renamed from: b */
    public int f36091b;

    /* renamed from: c */
    public List<? extends InetSocketAddress> f36092c;

    /* renamed from: d */
    public final List<C5414h0> f36093d;

    /* renamed from: e */
    public final C5399a f36094e;

    /* renamed from: f */
    public final C6985i f36095f;

    /* renamed from: g */
    public final InterfaceC5407e f36096g;

    /* renamed from: h */
    public final AbstractC5429t f36097h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/k$a.class
     */
    /* renamed from: oi.k$a */
    /* loaded from: combined.jar:classes2.jar:oi/k$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final String m32128a(@NotNull InetSocketAddress inetSocketAddress) {
            String hostName;
            String str;
            C9367f.m39526e(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                hostName = address.getHostAddress();
                str = "address.hostAddress";
            } else {
                hostName = inetSocketAddress.getHostName();
                str = "hostName";
            }
            C9367f.m39525d(hostName, str);
            return hostName;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/k$b.class
     */
    /* renamed from: oi.k$b */
    /* loaded from: combined.jar:classes2.jar:oi/k$b.class */
    public static final class b {

        /* renamed from: a */
        public int f36098a;

        /* renamed from: b */
        @NotNull
        public final List<C5414h0> f36099b;

        public b(@NotNull List<C5414h0> list) {
            C9367f.m39526e(list, "routes");
            this.f36099b = list;
        }

        @NotNull
        /* renamed from: a */
        public final List<C5414h0> m32129a() {
            return this.f36099b;
        }

        /* renamed from: b */
        public final boolean m32130b() {
            return this.f36098a < this.f36099b.size();
        }

        @NotNull
        /* renamed from: c */
        public final C5414h0 m32131c() {
            if (!m32130b()) {
                throw new NoSuchElementException();
            }
            List<C5414h0> list = this.f36099b;
            int i10 = this.f36098a;
            this.f36098a = i10 + 1;
            return list.get(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oi/k$c.class
     */
    /* renamed from: oi.k$c */
    /* loaded from: combined.jar:classes2.jar:oi/k$c.class */
    public static final class c extends AbstractC9368g implements InterfaceC9185a<List<? extends Proxy>> {

        /* renamed from: c */
        public final C6987k f36100c;

        /* renamed from: d */
        public final Proxy f36101d;

        /* renamed from: e */
        public final C5433x f36102e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6987k c6987k, Proxy proxy, C5433x c5433x) {
            super(0);
            this.f36100c = c6987k;
            this.f36101d = proxy;
            this.f36102e = c5433x;
        }

        @Override // p356uh.InterfaceC9185a
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Proxy> mo20777h() {
            Proxy proxy = this.f36101d;
            if (proxy != null) {
                return C5615i.m27696b(proxy);
            }
            URI m27122t = this.f36102e.m27122t();
            if (m27122t.getHost() == null) {
                return C5634b.m27800t(Proxy.NO_PROXY);
            }
            List<Proxy> select = this.f36100c.f36094e.m26757i().select(m27122t);
            return select == null || select.isEmpty() ? C5634b.m27800t(Proxy.NO_PROXY) : C5634b.m27773Q(select);
        }
    }

    public C6987k(@NotNull C5399a c5399a, @NotNull C6985i c6985i, @NotNull InterfaceC5407e interfaceC5407e, @NotNull AbstractC5429t abstractC5429t) {
        C9367f.m39526e(c5399a, "address");
        C9367f.m39526e(c6985i, "routeDatabase");
        C9367f.m39526e(interfaceC5407e, "call");
        C9367f.m39526e(abstractC5429t, "eventListener");
        this.f36094e = c5399a;
        this.f36095f = c6985i;
        this.f36096g = interfaceC5407e;
        this.f36097h = abstractC5429t;
        this.f36090a = C5616j.m27700f();
        this.f36092c = C5616j.m27700f();
        this.f36093d = new ArrayList();
        m32127g(c5399a.m26760l(), c5399a.m26755g());
    }

    /* renamed from: b */
    public final boolean m32122b() {
        boolean z10 = true;
        if (!m32123c()) {
            z10 = this.f36093d.isEmpty() ^ true;
        }
        return z10;
    }

    /* renamed from: c */
    public final boolean m32123c() {
        return this.f36091b < this.f36090a.size();
    }

    @NotNull
    /* renamed from: d */
    public final b m32124d() {
        if (!m32122b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m32123c()) {
            Proxy m32125e = m32125e();
            Iterator<? extends InetSocketAddress> it = this.f36092c.iterator();
            while (it.hasNext()) {
                C5414h0 c5414h0 = new C5414h0(this.f36094e, m32125e, it.next());
                if (this.f36095f.m32117c(c5414h0)) {
                    this.f36093d.add(c5414h0);
                } else {
                    arrayList.add(c5414h0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C5621o.m27710p(arrayList, this.f36093d);
            this.f36093d.clear();
        }
        return new b(arrayList);
    }

    /* renamed from: e */
    public final Proxy m32125e() {
        if (m32123c()) {
            List<? extends Proxy> list = this.f36090a;
            int i10 = this.f36091b;
            this.f36091b = i10 + 1;
            Proxy proxy = list.get(i10);
            m32126f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f36094e.m26760l().m27112i() + "; exhausted proxy configurations: " + this.f36090a);
    }

    /* renamed from: f */
    public final void m32126f(Proxy proxy) {
        String m27112i;
        int m27117o;
        ArrayList arrayList = new ArrayList();
        this.f36092c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            m27112i = this.f36094e.m26760l().m27112i();
            m27117o = this.f36094e.m26760l().m27117o();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            m27112i = f36089i.m32128a(inetSocketAddress);
            m27117o = inetSocketAddress.getPort();
        }
        if (1 > m27117o || 65535 < m27117o) {
            throw new SocketException("No route to " + m27112i + ':' + m27117o + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(m27112i, m27117o));
            return;
        }
        this.f36097h.m27052m(this.f36096g, m27112i);
        List<InetAddress> lookup = this.f36094e.m26751c().lookup(m27112i);
        if (lookup.isEmpty()) {
            throw new UnknownHostException(this.f36094e.m26751c() + " returned no addresses for " + m27112i);
        }
        this.f36097h.m27051l(this.f36096g, m27112i, lookup);
        Iterator<InetAddress> it = lookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), m27117o));
        }
    }

    /* renamed from: g */
    public final void m32127g(C5433x c5433x, Proxy proxy) {
        c cVar = new c(this, proxy, c5433x);
        this.f36097h.m27054o(this.f36096g, c5433x);
        List<Proxy> mo20777h = cVar.mo20777h();
        this.f36090a = mo20777h;
        this.f36091b = 0;
        this.f36097h.m27053n(this.f36096g, c5433x, mo20777h);
    }
}
