package tg;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/w.class
 */
/* renamed from: tg.w */
/* loaded from: combined.jar:classes2.jar:tg/w.class */
public final class C8747w {

    /* renamed from: a */
    public final C8725a f40708a;

    /* renamed from: b */
    public final Proxy f40709b;

    /* renamed from: c */
    public final InetSocketAddress f40710c;

    /* renamed from: d */
    public final C8735k f40711d;

    public C8747w(C8725a c8725a, Proxy proxy, InetSocketAddress inetSocketAddress, C8735k c8735k) {
        if (c8725a == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        if (c8735k == null) {
            throw new NullPointerException("connectionConfiguration == null");
        }
        this.f40708a = c8725a;
        this.f40709b = proxy;
        this.f40710c = inetSocketAddress;
        this.f40711d = c8735k;
    }

    /* renamed from: a */
    public C8725a m37539a() {
        return this.f40708a;
    }

    /* renamed from: b */
    public Proxy m37540b() {
        return this.f40709b;
    }

    /* renamed from: c */
    public boolean m37541c() {
        return this.f40708a.f40540e != null && this.f40709b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C8747w) {
            C8747w c8747w = (C8747w) obj;
            z10 = false;
            if (this.f40708a.equals(c8747w.f40708a)) {
                z10 = false;
                if (this.f40709b.equals(c8747w.f40709b)) {
                    z10 = false;
                    if (this.f40710c.equals(c8747w.f40710c)) {
                        z10 = false;
                        if (this.f40711d.equals(c8747w.f40711d)) {
                            z10 = true;
                        }
                    }
                }
            }
        }
        return z10;
    }

    public int hashCode() {
        return ((((((527 + this.f40708a.hashCode()) * 31) + this.f40709b.hashCode()) * 31) + this.f40710c.hashCode()) * 31) + this.f40711d.hashCode();
    }
}
