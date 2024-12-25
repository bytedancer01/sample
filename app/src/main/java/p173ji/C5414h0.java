package p173ji;

import java.net.InetSocketAddress;
import java.net.Proxy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/h0.class
 */
/* renamed from: ji.h0 */
/* loaded from: combined.jar:classes2.jar:ji/h0.class */
public final class C5414h0 {

    /* renamed from: a */
    @NotNull
    public final C5399a f30959a;

    /* renamed from: b */
    @NotNull
    public final Proxy f30960b;

    /* renamed from: c */
    @NotNull
    public final InetSocketAddress f30961c;

    public C5414h0(@NotNull C5399a c5399a, @NotNull Proxy proxy, @NotNull InetSocketAddress inetSocketAddress) {
        C9367f.m39526e(c5399a, "address");
        C9367f.m39526e(proxy, "proxy");
        C9367f.m39526e(inetSocketAddress, "socketAddress");
        this.f30959a = c5399a;
        this.f30960b = proxy;
        this.f30961c = inetSocketAddress;
    }

    @NotNull
    /* renamed from: a */
    public final C5399a m26977a() {
        return this.f30959a;
    }

    @NotNull
    /* renamed from: b */
    public final Proxy m26978b() {
        return this.f30960b;
    }

    /* renamed from: c */
    public final boolean m26979c() {
        return this.f30959a.m26759k() != null && this.f30960b.type() == Proxy.Type.HTTP;
    }

    @NotNull
    /* renamed from: d */
    public final InetSocketAddress m26980d() {
        return this.f30961c;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10;
        if (obj instanceof C5414h0) {
            C5414h0 c5414h0 = (C5414h0) obj;
            if (C9367f.m39522a(c5414h0.f30959a, this.f30959a) && C9367f.m39522a(c5414h0.f30960b, this.f30960b) && C9367f.m39522a(c5414h0.f30961c, this.f30961c)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    public int hashCode() {
        return ((((527 + this.f30959a.hashCode()) * 31) + this.f30960b.hashCode()) * 31) + this.f30961c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Route{" + this.f30961c + '}';
    }
}
