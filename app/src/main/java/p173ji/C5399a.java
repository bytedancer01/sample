package p173ji;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ki.C5634b;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5433x;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/a.class
 */
/* renamed from: ji.a */
/* loaded from: combined.jar:classes2.jar:ji/a.class */
public final class C5399a {

    /* renamed from: a */
    @NotNull
    public final C5433x f30771a;

    /* renamed from: b */
    @NotNull
    public final List<EnumC5404c0> f30772b;

    /* renamed from: c */
    @NotNull
    public final List<C5421l> f30773c;

    /* renamed from: d */
    @NotNull
    public final InterfaceC5428s f30774d;

    /* renamed from: e */
    @NotNull
    public final SocketFactory f30775e;

    /* renamed from: f */
    @Nullable
    public final SSLSocketFactory f30776f;

    /* renamed from: g */
    @Nullable
    public final HostnameVerifier f30777g;

    /* renamed from: h */
    @Nullable
    public final C5411g f30778h;

    /* renamed from: i */
    @NotNull
    public final InterfaceC5401b f30779i;

    /* renamed from: j */
    @Nullable
    public final Proxy f30780j;

    /* renamed from: k */
    @NotNull
    public final ProxySelector f30781k;

    public C5399a(@NotNull String str, int i10, @NotNull InterfaceC5428s interfaceC5428s, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C5411g c5411g, @NotNull InterfaceC5401b interfaceC5401b, @Nullable Proxy proxy, @NotNull List<? extends EnumC5404c0> list, @NotNull List<C5421l> list2, @NotNull ProxySelector proxySelector) {
        C9367f.m39526e(str, "uriHost");
        C9367f.m39526e(interfaceC5428s, "dns");
        C9367f.m39526e(socketFactory, "socketFactory");
        C9367f.m39526e(interfaceC5401b, "proxyAuthenticator");
        C9367f.m39526e(list, "protocols");
        C9367f.m39526e(list2, "connectionSpecs");
        C9367f.m39526e(proxySelector, "proxySelector");
        this.f30774d = interfaceC5428s;
        this.f30775e = socketFactory;
        this.f30776f = sSLSocketFactory;
        this.f30777g = hostnameVerifier;
        this.f30778h = c5411g;
        this.f30779i = interfaceC5401b;
        this.f30780j = proxy;
        this.f30781k = proxySelector;
        this.f30771a = new C5433x.a().m27140q(sSLSocketFactory != null ? ClientConstants.DOMAIN_SCHEME : HttpHost.DEFAULT_SCHEME_NAME).m27130g(str).m27136m(i10).m27126c();
        this.f30772b = C5634b.m27773Q(list);
        this.f30773c = C5634b.m27773Q(list2);
    }

    @Nullable
    /* renamed from: a */
    public final C5411g m26749a() {
        return this.f30778h;
    }

    @NotNull
    /* renamed from: b */
    public final List<C5421l> m26750b() {
        return this.f30773c;
    }

    @NotNull
    /* renamed from: c */
    public final InterfaceC5428s m26751c() {
        return this.f30774d;
    }

    /* renamed from: d */
    public final boolean m26752d(@NotNull C5399a c5399a) {
        C9367f.m39526e(c5399a, "that");
        return C9367f.m39522a(this.f30774d, c5399a.f30774d) && C9367f.m39522a(this.f30779i, c5399a.f30779i) && C9367f.m39522a(this.f30772b, c5399a.f30772b) && C9367f.m39522a(this.f30773c, c5399a.f30773c) && C9367f.m39522a(this.f30781k, c5399a.f30781k) && C9367f.m39522a(this.f30780j, c5399a.f30780j) && C9367f.m39522a(this.f30776f, c5399a.f30776f) && C9367f.m39522a(this.f30777g, c5399a.f30777g) && C9367f.m39522a(this.f30778h, c5399a.f30778h) && this.f30771a.m27117o() == c5399a.f30771a.m27117o();
    }

    @Nullable
    /* renamed from: e */
    public final HostnameVerifier m26753e() {
        return this.f30777g;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10;
        if (obj instanceof C5399a) {
            C5399a c5399a = (C5399a) obj;
            if (C9367f.m39522a(this.f30771a, c5399a.f30771a) && m26752d(c5399a)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    @NotNull
    /* renamed from: f */
    public final List<EnumC5404c0> m26754f() {
        return this.f30772b;
    }

    @Nullable
    /* renamed from: g */
    public final Proxy m26755g() {
        return this.f30780j;
    }

    @NotNull
    /* renamed from: h */
    public final InterfaceC5401b m26756h() {
        return this.f30779i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f30771a.hashCode()) * 31) + this.f30774d.hashCode()) * 31) + this.f30779i.hashCode()) * 31) + this.f30772b.hashCode()) * 31) + this.f30773c.hashCode()) * 31) + this.f30781k.hashCode()) * 31) + Objects.hashCode(this.f30780j)) * 31) + Objects.hashCode(this.f30776f)) * 31) + Objects.hashCode(this.f30777g)) * 31) + Objects.hashCode(this.f30778h);
    }

    @NotNull
    /* renamed from: i */
    public final ProxySelector m26757i() {
        return this.f30781k;
    }

    @NotNull
    /* renamed from: j */
    public final SocketFactory m26758j() {
        return this.f30775e;
    }

    @Nullable
    /* renamed from: k */
    public final SSLSocketFactory m26759k() {
        return this.f30776f;
    }

    @NotNull
    /* renamed from: l */
    public final C5433x m26760l() {
        return this.f30771a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f30771a.m27112i());
        sb3.append(':');
        sb3.append(this.f30771a.m27117o());
        sb3.append(", ");
        if (this.f30780j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f30780j;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f30781k;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append("}");
        return sb3.toString();
    }
}
