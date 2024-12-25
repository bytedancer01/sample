package p253oi;

import java.io.IOException;
import ki.C5634b;
import org.apache.http.client.methods.HttpGet;
import org.jetbrains.annotations.NotNull;
import p173ji.AbstractC5429t;
import p173ji.C5399a;
import p173ji.C5402b0;
import p173ji.C5414h0;
import p173ji.C5433x;
import p253oi.C6987k;
import p274pi.C7730g;
import p274pi.InterfaceC7727d;
import p312ri.C8475a;
import p312ri.C8488n;
import p312ri.EnumC8476b;
import p372vh.C9367f;
import p406xd.C9728e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oi/d.class
 */
/* renamed from: oi.d */
/* loaded from: combined.jar:classes2.jar:oi/d.class */
public final class C6980d {

    /* renamed from: a */
    public C6987k.b f36020a;

    /* renamed from: b */
    public C6987k f36021b;

    /* renamed from: c */
    public int f36022c;

    /* renamed from: d */
    public int f36023d;

    /* renamed from: e */
    public int f36024e;

    /* renamed from: f */
    public C5414h0 f36025f;

    /* renamed from: g */
    public final C6984h f36026g;

    /* renamed from: h */
    @NotNull
    public final C5399a f36027h;

    /* renamed from: i */
    public final C6981e f36028i;

    /* renamed from: j */
    public final AbstractC5429t f36029j;

    public C6980d(@NotNull C6984h c6984h, @NotNull C5399a c5399a, @NotNull C6981e c6981e, @NotNull AbstractC5429t abstractC5429t) {
        C9367f.m39526e(c6984h, "connectionPool");
        C9367f.m39526e(c5399a, "address");
        C9367f.m39526e(c6981e, "call");
        C9367f.m39526e(abstractC5429t, "eventListener");
        this.f36026g = c6984h;
        this.f36027h = c5399a;
        this.f36028i = c6981e;
        this.f36029j = abstractC5429t;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC7727d m32033a(@NotNull C5402b0 c5402b0, @NotNull C7730g c7730g) {
        C9367f.m39526e(c5402b0, "client");
        C9367f.m39526e(c7730g, "chain");
        try {
            return m32035c(c7730g.m33751e(), c7730g.m33753g(), c7730g.m33755i(), c5402b0.m26784G(), c5402b0.m26790M(), !C9367f.m39522a(c7730g.m33754h().m26877g(), HttpGet.METHOD_NAME)).m32104w(c5402b0, c7730g);
        } catch (IOException e10) {
            m32040h(e10);
            throw new C6986j(e10);
        } catch (C6986j e11) {
            m32040h(e11.m32120c());
            throw e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0217  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p253oi.C6982f m32034b(int r10, int r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p253oi.C6980d.m32034b(int, int, int, int, boolean):oi.f");
    }

    /* renamed from: c */
    public final C6982f m32035c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        while (true) {
            C6982f m32034b = m32034b(i10, i11, i12, i13, z10);
            if (m32034b.m32102u(z11)) {
                return m32034b;
            }
            m32034b.m32107z();
            if (this.f36025f == null) {
                C6987k.b bVar = this.f36020a;
                if (bVar != null ? bVar.m32130b() : true) {
                    continue;
                } else {
                    C6987k c6987k = this.f36021b;
                    boolean z12 = true;
                    if (c6987k != null) {
                        z12 = c6987k.m32122b();
                    }
                    if (!z12) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    @NotNull
    /* renamed from: d */
    public final C5399a m32036d() {
        return this.f36027h;
    }

    /* renamed from: e */
    public final boolean m32037e() {
        C6987k c6987k;
        if (this.f36022c == 0 && this.f36023d == 0 && this.f36024e == 0) {
            return false;
        }
        if (this.f36025f != null) {
            return true;
        }
        C5414h0 m32038f = m32038f();
        if (m32038f != null) {
            this.f36025f = m32038f;
            return true;
        }
        C6987k.b bVar = this.f36020a;
        if ((bVar == null || !bVar.m32130b()) && (c6987k = this.f36021b) != null) {
            return c6987k.m32122b();
        }
        return true;
    }

    /* renamed from: f */
    public final C5414h0 m32038f() {
        C6982f m32057l;
        if (this.f36022c > 1 || this.f36023d > 1 || this.f36024e > 0 || (m32057l = this.f36028i.m32057l()) == null) {
            return null;
        }
        synchronized (m32057l) {
            if (m32057l.m32098q() != 0) {
                return null;
            }
            if (C5634b.m27787g(m32057l.m32075A().m26977a().m26760l(), this.f36027h.m26760l())) {
                return m32057l.m32075A();
            }
            return null;
        }
    }

    /* renamed from: g */
    public final boolean m32039g(@NotNull C5433x c5433x) {
        C9367f.m39526e(c5433x, "url");
        C5433x m26760l = this.f36027h.m26760l();
        return c5433x.m27117o() == m26760l.m27117o() && C9367f.m39522a(c5433x.m27112i(), m26760l.m27112i());
    }

    /* renamed from: h */
    public final void m32040h(@NotNull IOException iOException) {
        C9367f.m39526e(iOException, C9728e.f44384d);
        this.f36025f = null;
        if ((iOException instanceof C8488n) && ((C8488n) iOException).f39792b == EnumC8476b.REFUSED_STREAM) {
            this.f36022c++;
        } else if (iOException instanceof C8475a) {
            this.f36023d++;
        } else {
            this.f36024e++;
        }
    }
}
