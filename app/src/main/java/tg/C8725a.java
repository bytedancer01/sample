package tg;

import java.net.Proxy;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/a.class
 */
/* renamed from: tg.a */
/* loaded from: combined.jar:classes2.jar:tg/a.class */
public final class C8725a {

    /* renamed from: a */
    public final Proxy f40536a;

    /* renamed from: b */
    public final String f40537b;

    /* renamed from: c */
    public final int f40538c;

    /* renamed from: d */
    public final SocketFactory f40539d;

    /* renamed from: e */
    public final SSLSocketFactory f40540e;

    /* renamed from: f */
    public final HostnameVerifier f40541f;

    /* renamed from: g */
    public final C8730f f40542g;

    /* renamed from: h */
    public final InterfaceC8726b f40543h;

    /* renamed from: i */
    public final List<EnumC8742r> f40544i;

    /* renamed from: j */
    public final List<C8735k> f40545j;

    public C8725a(String str, int i10, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C8730f c8730f, InterfaceC8726b interfaceC8726b, Proxy proxy, List<EnumC8742r> list, List<C8735k> list2) {
        if (str == null) {
            throw new NullPointerException("uriHost == null");
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException("uriPort <= 0: " + i10);
        }
        if (interfaceC8726b == null) {
            throw new IllegalArgumentException("authenticator == null");
        }
        if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        this.f40536a = proxy;
        this.f40537b = str;
        this.f40538c = i10;
        this.f40539d = socketFactory;
        this.f40540e = sSLSocketFactory;
        this.f40541f = hostnameVerifier;
        this.f40542g = c8730f;
        this.f40543h = interfaceC8726b;
        this.f40544i = C9183h.m38692l(list);
        this.f40545j = C9183h.m38692l(list2);
    }

    /* renamed from: a */
    public List<C8735k> m37279a() {
        return this.f40545j;
    }

    /* renamed from: b */
    public Proxy m37280b() {
        return this.f40536a;
    }

    /* renamed from: c */
    public String m37281c() {
        return this.f40537b;
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C8725a) {
            C8725a c8725a = (C8725a) obj;
            z10 = false;
            if (C9183h.m38686f(this.f40536a, c8725a.f40536a)) {
                z10 = false;
                if (this.f40537b.equals(c8725a.f40537b)) {
                    z10 = false;
                    if (this.f40538c == c8725a.f40538c) {
                        z10 = false;
                        if (C9183h.m38686f(this.f40540e, c8725a.f40540e)) {
                            z10 = false;
                            if (C9183h.m38686f(this.f40541f, c8725a.f40541f)) {
                                z10 = false;
                                if (C9183h.m38686f(this.f40542g, c8725a.f40542g)) {
                                    z10 = false;
                                    if (C9183h.m38686f(this.f40543h, c8725a.f40543h)) {
                                        z10 = false;
                                        if (C9183h.m38686f(this.f40544i, c8725a.f40544i)) {
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f40537b.hashCode();
        int i10 = this.f40538c;
        SSLSocketFactory sSLSocketFactory = this.f40540e;
        int i11 = 0;
        int hashCode2 = sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0;
        HostnameVerifier hostnameVerifier = this.f40541f;
        int hashCode3 = hostnameVerifier != null ? hostnameVerifier.hashCode() : 0;
        C8730f c8730f = this.f40542g;
        int hashCode4 = c8730f != null ? c8730f.hashCode() : 0;
        int hashCode5 = this.f40543h.hashCode();
        Proxy proxy = this.f40536a;
        if (proxy != null) {
            i11 = proxy.hashCode();
        }
        return ((((((((((((((527 + hashCode) * 31) + i10) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i11) * 31) + this.f40544i.hashCode();
    }
}
