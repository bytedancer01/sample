package p173ji;

import com.amazonaws.services.p045s3.internal.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kh.C5621o;
import ki.C5634b;
import ni.C6798e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.AbstractC5429t;
import p173ji.InterfaceC5407e;
import p253oi.C6981e;
import p253oi.C6985i;
import p372vh.C9365d;
import p372vh.C9367f;
import p391wi.C9595d;
import vi.AbstractC9378c;
import vi.C9379d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/b0.class
 */
/* renamed from: ji.b0 */
/* loaded from: combined.jar:classes2.jar:ji/b0.class */
public class C5402b0 implements Cloneable, InterfaceC5407e.a {

    /* renamed from: A */
    public final int f30808A;

    /* renamed from: B */
    public final int f30809B;

    /* renamed from: C */
    public final long f30810C;

    /* renamed from: D */
    @NotNull
    public final C6985i f30811D;

    /* renamed from: b */
    @NotNull
    public final C5427r f30812b;

    /* renamed from: c */
    @NotNull
    public final C5419k f30813c;

    /* renamed from: d */
    @NotNull
    public final List<InterfaceC5434y> f30814d;

    /* renamed from: e */
    @NotNull
    public final List<InterfaceC5434y> f30815e;

    /* renamed from: f */
    @NotNull
    public final AbstractC5429t.c f30816f;

    /* renamed from: g */
    public final boolean f30817g;

    /* renamed from: h */
    @NotNull
    public final InterfaceC5401b f30818h;

    /* renamed from: i */
    public final boolean f30819i;

    /* renamed from: j */
    public final boolean f30820j;

    /* renamed from: k */
    @NotNull
    public final InterfaceC5425p f30821k;

    /* renamed from: l */
    @NotNull
    public final InterfaceC5428s f30822l;

    /* renamed from: m */
    @Nullable
    public final Proxy f30823m;

    /* renamed from: n */
    @NotNull
    public final ProxySelector f30824n;

    /* renamed from: o */
    @NotNull
    public final InterfaceC5401b f30825o;

    /* renamed from: p */
    @NotNull
    public final SocketFactory f30826p;

    /* renamed from: q */
    public final SSLSocketFactory f30827q;

    /* renamed from: r */
    @Nullable
    public final X509TrustManager f30828r;

    /* renamed from: s */
    @NotNull
    public final List<C5421l> f30829s;

    /* renamed from: t */
    @NotNull
    public final List<EnumC5404c0> f30830t;

    /* renamed from: u */
    @NotNull
    public final HostnameVerifier f30831u;

    /* renamed from: v */
    @NotNull
    public final C5411g f30832v;

    /* renamed from: w */
    @Nullable
    public final AbstractC9378c f30833w;

    /* renamed from: x */
    public final int f30834x;

    /* renamed from: y */
    public final int f30835y;

    /* renamed from: z */
    public final int f30836z;

    /* renamed from: G */
    public static final b f30807G = new b(null);

    /* renamed from: E */
    @NotNull
    public static final List<EnumC5404c0> f30805E = C5634b.m27800t(EnumC5404c0.HTTP_2, EnumC5404c0.HTTP_1_1);

    /* renamed from: F */
    @NotNull
    public static final List<C5421l> f30806F = C5634b.m27800t(C5421l.f31089h, C5421l.f31091j);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/b0$a.class
     */
    /* renamed from: ji.b0$a */
    /* loaded from: combined.jar:classes2.jar:ji/b0$a.class */
    public static final class a {

        /* renamed from: A */
        public int f30837A;

        /* renamed from: B */
        public long f30838B;

        /* renamed from: C */
        @Nullable
        public C6985i f30839C;

        /* renamed from: a */
        @NotNull
        public C5427r f30840a;

        /* renamed from: b */
        @NotNull
        public C5419k f30841b;

        /* renamed from: c */
        @NotNull
        public final List<InterfaceC5434y> f30842c;

        /* renamed from: d */
        @NotNull
        public final List<InterfaceC5434y> f30843d;

        /* renamed from: e */
        @NotNull
        public AbstractC5429t.c f30844e;

        /* renamed from: f */
        public boolean f30845f;

        /* renamed from: g */
        @NotNull
        public InterfaceC5401b f30846g;

        /* renamed from: h */
        public boolean f30847h;

        /* renamed from: i */
        public boolean f30848i;

        /* renamed from: j */
        @NotNull
        public InterfaceC5425p f30849j;

        /* renamed from: k */
        @NotNull
        public InterfaceC5428s f30850k;

        /* renamed from: l */
        @Nullable
        public Proxy f30851l;

        /* renamed from: m */
        @Nullable
        public ProxySelector f30852m;

        /* renamed from: n */
        @NotNull
        public InterfaceC5401b f30853n;

        /* renamed from: o */
        @NotNull
        public SocketFactory f30854o;

        /* renamed from: p */
        @Nullable
        public SSLSocketFactory f30855p;

        /* renamed from: q */
        @Nullable
        public X509TrustManager f30856q;

        /* renamed from: r */
        @NotNull
        public List<C5421l> f30857r;

        /* renamed from: s */
        @NotNull
        public List<? extends EnumC5404c0> f30858s;

        /* renamed from: t */
        @NotNull
        public HostnameVerifier f30859t;

        /* renamed from: u */
        @NotNull
        public C5411g f30860u;

        /* renamed from: v */
        @Nullable
        public AbstractC9378c f30861v;

        /* renamed from: w */
        public int f30862w;

        /* renamed from: x */
        public int f30863x;

        /* renamed from: y */
        public int f30864y;

        /* renamed from: z */
        public int f30865z;

        public a() {
            this.f30840a = new C5427r();
            this.f30841b = new C5419k();
            this.f30842c = new ArrayList();
            this.f30843d = new ArrayList();
            this.f30844e = C5634b.m27785e(AbstractC5429t.f31127a);
            this.f30845f = true;
            InterfaceC5401b interfaceC5401b = InterfaceC5401b.f30802a;
            this.f30846g = interfaceC5401b;
            this.f30847h = true;
            this.f30848i = true;
            this.f30849j = InterfaceC5425p.f31115a;
            this.f30850k = InterfaceC5428s.f31125a;
            this.f30853n = interfaceC5401b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C9367f.m39525d(socketFactory, "SocketFactory.getDefault()");
            this.f30854o = socketFactory;
            b bVar = C5402b0.f30807G;
            this.f30857r = bVar.m26852a();
            this.f30858s = bVar.m26853b();
            this.f30859t = C9379d.f42912a;
            this.f30860u = C5411g.f30937c;
            this.f30863x = Constants.MAXIMUM_UPLOAD_PARTS;
            this.f30864y = Constants.MAXIMUM_UPLOAD_PARTS;
            this.f30865z = Constants.MAXIMUM_UPLOAD_PARTS;
            this.f30838B = 1024L;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C5402b0 c5402b0) {
            this();
            C9367f.m39526e(c5402b0, "okHttpClient");
            this.f30840a = c5402b0.m26806o();
            this.f30841b = c5402b0.m26803l();
            C5621o.m27710p(this.f30842c, c5402b0.m26779A());
            C5621o.m27710p(this.f30843d, c5402b0.m26781D());
            this.f30844e = c5402b0.m26808r();
            this.f30845f = c5402b0.m26790M();
            this.f30846g = c5402b0.m26797e();
            this.f30847h = c5402b0.m26809s();
            this.f30848i = c5402b0.m26810u();
            this.f30849j = c5402b0.m26805n();
            c5402b0.m26798g();
            this.f30850k = c5402b0.m26807p();
            this.f30851l = c5402b0.m26786I();
            this.f30852m = c5402b0.m26788K();
            this.f30853n = c5402b0.m26787J();
            this.f30854o = c5402b0.m26791N();
            this.f30855p = c5402b0.f30827q;
            this.f30856q = c5402b0.m26795R();
            this.f30857r = c5402b0.m26804m();
            this.f30858s = c5402b0.m26785H();
            this.f30859t = c5402b0.m26812z();
            this.f30860u = c5402b0.m26801j();
            this.f30861v = c5402b0.m26800i();
            this.f30862w = c5402b0.m26799h();
            this.f30863x = c5402b0.m26802k();
            this.f30864y = c5402b0.m26789L();
            this.f30865z = c5402b0.m26794Q();
            this.f30837A = c5402b0.m26784G();
            this.f30838B = c5402b0.m26780C();
            this.f30839C = c5402b0.m26811x();
        }

        @NotNull
        /* renamed from: A */
        public final InterfaceC5401b m26813A() {
            return this.f30853n;
        }

        @Nullable
        /* renamed from: B */
        public final ProxySelector m26814B() {
            return this.f30852m;
        }

        /* renamed from: C */
        public final int m26815C() {
            return this.f30864y;
        }

        /* renamed from: D */
        public final boolean m26816D() {
            return this.f30845f;
        }

        @Nullable
        /* renamed from: E */
        public final C6985i m26817E() {
            return this.f30839C;
        }

        @NotNull
        /* renamed from: F */
        public final SocketFactory m26818F() {
            return this.f30854o;
        }

        @Nullable
        /* renamed from: G */
        public final SSLSocketFactory m26819G() {
            return this.f30855p;
        }

        /* renamed from: H */
        public final int m26820H() {
            return this.f30865z;
        }

        @Nullable
        /* renamed from: I */
        public final X509TrustManager m26821I() {
            return this.f30856q;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        
            if (r0.size() <= 1) goto L15;
         */
        @org.jetbrains.annotations.NotNull
        /* renamed from: J */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p173ji.C5402b0.a m26822J(@org.jetbrains.annotations.NotNull java.util.List<? extends p173ji.EnumC5404c0> r5) {
            /*
                Method dump skipped, instructions count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p173ji.C5402b0.a.m26822J(java.util.List):ji.b0$a");
        }

        @NotNull
        /* renamed from: K */
        public final a m26823K(long j10, @NotNull TimeUnit timeUnit) {
            C9367f.m39526e(timeUnit, "unit");
            this.f30864y = C5634b.m27788h("timeout", j10, timeUnit);
            return this;
        }

        @NotNull
        /* renamed from: L */
        public final a m26824L(boolean z10) {
            this.f30845f = z10;
            return this;
        }

        @NotNull
        /* renamed from: M */
        public final a m26825M(long j10, @NotNull TimeUnit timeUnit) {
            C9367f.m39526e(timeUnit, "unit");
            this.f30865z = C5634b.m27788h("timeout", j10, timeUnit);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final a m26826a(@NotNull InterfaceC5434y interfaceC5434y) {
            C9367f.m39526e(interfaceC5434y, "interceptor");
            this.f30842c.add(interfaceC5434y);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C5402b0 m26827b() {
            return new C5402b0(this);
        }

        @NotNull
        /* renamed from: c */
        public final a m26828c(long j10, @NotNull TimeUnit timeUnit) {
            C9367f.m39526e(timeUnit, "unit");
            this.f30863x = C5634b.m27788h("timeout", j10, timeUnit);
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final a m26829d(@NotNull AbstractC5429t abstractC5429t) {
            C9367f.m39526e(abstractC5429t, "eventListener");
            this.f30844e = C5634b.m27785e(abstractC5429t);
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final a m26830e(boolean z10) {
            this.f30847h = z10;
            return this;
        }

        @NotNull
        /* renamed from: f */
        public final InterfaceC5401b m26831f() {
            return this.f30846g;
        }

        @Nullable
        /* renamed from: g */
        public final C5403c m26832g() {
            return null;
        }

        /* renamed from: h */
        public final int m26833h() {
            return this.f30862w;
        }

        @Nullable
        /* renamed from: i */
        public final AbstractC9378c m26834i() {
            return this.f30861v;
        }

        @NotNull
        /* renamed from: j */
        public final C5411g m26835j() {
            return this.f30860u;
        }

        /* renamed from: k */
        public final int m26836k() {
            return this.f30863x;
        }

        @NotNull
        /* renamed from: l */
        public final C5419k m26837l() {
            return this.f30841b;
        }

        @NotNull
        /* renamed from: m */
        public final List<C5421l> m26838m() {
            return this.f30857r;
        }

        @NotNull
        /* renamed from: n */
        public final InterfaceC5425p m26839n() {
            return this.f30849j;
        }

        @NotNull
        /* renamed from: o */
        public final C5427r m26840o() {
            return this.f30840a;
        }

        @NotNull
        /* renamed from: p */
        public final InterfaceC5428s m26841p() {
            return this.f30850k;
        }

        @NotNull
        /* renamed from: q */
        public final AbstractC5429t.c m26842q() {
            return this.f30844e;
        }

        /* renamed from: r */
        public final boolean m26843r() {
            return this.f30847h;
        }

        /* renamed from: s */
        public final boolean m26844s() {
            return this.f30848i;
        }

        @NotNull
        /* renamed from: t */
        public final HostnameVerifier m26845t() {
            return this.f30859t;
        }

        @NotNull
        /* renamed from: u */
        public final List<InterfaceC5434y> m26846u() {
            return this.f30842c;
        }

        /* renamed from: v */
        public final long m26847v() {
            return this.f30838B;
        }

        @NotNull
        /* renamed from: w */
        public final List<InterfaceC5434y> m26848w() {
            return this.f30843d;
        }

        /* renamed from: x */
        public final int m26849x() {
            return this.f30837A;
        }

        @NotNull
        /* renamed from: y */
        public final List<EnumC5404c0> m26850y() {
            return this.f30858s;
        }

        @Nullable
        /* renamed from: z */
        public final Proxy m26851z() {
            return this.f30851l;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/b0$b.class
     */
    /* renamed from: ji.b0$b */
    /* loaded from: combined.jar:classes2.jar:ji/b0$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final List<C5421l> m26852a() {
            return C5402b0.f30806F;
        }

        @NotNull
        /* renamed from: b */
        public final List<EnumC5404c0> m26853b() {
            return C5402b0.f30805E;
        }
    }

    public C5402b0() {
        this(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (r9 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5402b0(@org.jetbrains.annotations.NotNull p173ji.C5402b0.a r5) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p173ji.C5402b0.<init>(ji.b0$a):void");
    }

    @NotNull
    /* renamed from: A */
    public final List<InterfaceC5434y> m26779A() {
        return this.f30814d;
    }

    /* renamed from: C */
    public final long m26780C() {
        return this.f30810C;
    }

    @NotNull
    /* renamed from: D */
    public final List<InterfaceC5434y> m26781D() {
        return this.f30815e;
    }

    @NotNull
    /* renamed from: E */
    public a m26782E() {
        return new a(this);
    }

    @NotNull
    /* renamed from: F */
    public InterfaceC5418j0 m26783F(@NotNull C5406d0 c5406d0, @NotNull AbstractC5420k0 abstractC5420k0) {
        C9367f.m39526e(c5406d0, "request");
        C9367f.m39526e(abstractC5420k0, "listener");
        C9595d c9595d = new C9595d(C6798e.f35432h, c5406d0, abstractC5420k0, new Random(), this.f30809B, null, this.f30810C);
        c9595d.m40410n(this);
        return c9595d;
    }

    /* renamed from: G */
    public final int m26784G() {
        return this.f30809B;
    }

    @NotNull
    /* renamed from: H */
    public final List<EnumC5404c0> m26785H() {
        return this.f30830t;
    }

    @Nullable
    /* renamed from: I */
    public final Proxy m26786I() {
        return this.f30823m;
    }

    @NotNull
    /* renamed from: J */
    public final InterfaceC5401b m26787J() {
        return this.f30825o;
    }

    @NotNull
    /* renamed from: K */
    public final ProxySelector m26788K() {
        return this.f30824n;
    }

    /* renamed from: L */
    public final int m26789L() {
        return this.f30836z;
    }

    /* renamed from: M */
    public final boolean m26790M() {
        return this.f30817g;
    }

    @NotNull
    /* renamed from: N */
    public final SocketFactory m26791N() {
        return this.f30826p;
    }

    @NotNull
    /* renamed from: O */
    public final SSLSocketFactory m26792O() {
        SSLSocketFactory sSLSocketFactory = this.f30827q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: P */
    public final void m26793P() {
        boolean z10;
        if (this.f30814d == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.f30814d).toString());
        }
        if (this.f30815e == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.f30815e).toString());
        }
        List<C5421l> list = this.f30829s;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5421l) it.next()).m26999f()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (!z10) {
            if (this.f30827q == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f30833w == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f30828r == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f30827q == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f30833w == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f30828r == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!C9367f.m39522a(this.f30832v, C5411g.f30937c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: Q */
    public final int m26794Q() {
        return this.f30808A;
    }

    @Nullable
    /* renamed from: R */
    public final X509TrustManager m26795R() {
        return this.f30828r;
    }

    @Override // p173ji.InterfaceC5407e.a
    @NotNull
    /* renamed from: a */
    public InterfaceC5407e mo26796a(@NotNull C5406d0 c5406d0) {
        C9367f.m39526e(c5406d0, "request");
        return new C6981e(this, c5406d0, false);
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @NotNull
    /* renamed from: e */
    public final InterfaceC5401b m26797e() {
        return this.f30818h;
    }

    @Nullable
    /* renamed from: g */
    public final C5403c m26798g() {
        return null;
    }

    /* renamed from: h */
    public final int m26799h() {
        return this.f30834x;
    }

    @Nullable
    /* renamed from: i */
    public final AbstractC9378c m26800i() {
        return this.f30833w;
    }

    @NotNull
    /* renamed from: j */
    public final C5411g m26801j() {
        return this.f30832v;
    }

    /* renamed from: k */
    public final int m26802k() {
        return this.f30835y;
    }

    @NotNull
    /* renamed from: l */
    public final C5419k m26803l() {
        return this.f30813c;
    }

    @NotNull
    /* renamed from: m */
    public final List<C5421l> m26804m() {
        return this.f30829s;
    }

    @NotNull
    /* renamed from: n */
    public final InterfaceC5425p m26805n() {
        return this.f30821k;
    }

    @NotNull
    /* renamed from: o */
    public final C5427r m26806o() {
        return this.f30812b;
    }

    @NotNull
    /* renamed from: p */
    public final InterfaceC5428s m26807p() {
        return this.f30822l;
    }

    @NotNull
    /* renamed from: r */
    public final AbstractC5429t.c m26808r() {
        return this.f30816f;
    }

    /* renamed from: s */
    public final boolean m26809s() {
        return this.f30819i;
    }

    /* renamed from: u */
    public final boolean m26810u() {
        return this.f30820j;
    }

    @NotNull
    /* renamed from: x */
    public final C6985i m26811x() {
        return this.f30811D;
    }

    @NotNull
    /* renamed from: z */
    public final HostnameVerifier m26812z() {
        return this.f30831u;
    }
}
