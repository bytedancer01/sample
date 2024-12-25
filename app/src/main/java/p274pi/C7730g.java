package p274pi;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.InterfaceC5407e;
import p173ji.InterfaceC5434y;
import p253oi.C6979c;
import p253oi.C6981e;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/g.class
 */
/* renamed from: pi.g */
/* loaded from: combined.jar:classes2.jar:pi/g.class */
public final class C7730g implements InterfaceC5434y.a {

    /* renamed from: a */
    public int f37498a;

    /* renamed from: b */
    @NotNull
    public final C6981e f37499b;

    /* renamed from: c */
    public final List<InterfaceC5434y> f37500c;

    /* renamed from: d */
    public final int f37501d;

    /* renamed from: e */
    @Nullable
    public final C6979c f37502e;

    /* renamed from: f */
    @NotNull
    public final C5406d0 f37503f;

    /* renamed from: g */
    public final int f37504g;

    /* renamed from: h */
    public final int f37505h;

    /* renamed from: i */
    public final int f37506i;

    /* JADX WARN: Multi-variable type inference failed */
    public C7730g(@NotNull C6981e c6981e, @NotNull List<? extends InterfaceC5434y> list, int i10, @Nullable C6979c c6979c, @NotNull C5406d0 c5406d0, int i11, int i12, int i13) {
        C9367f.m39526e(c6981e, "call");
        C9367f.m39526e(list, "interceptors");
        C9367f.m39526e(c5406d0, "request");
        this.f37499b = c6981e;
        this.f37500c = list;
        this.f37501d = i10;
        this.f37502e = c6979c;
        this.f37503f = c5406d0;
        this.f37504g = i11;
        this.f37505h = i12;
        this.f37506i = i13;
    }

    /* renamed from: c */
    public static /* synthetic */ C7730g m33748c(C7730g c7730g, int i10, C6979c c6979c, C5406d0 c5406d0, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = c7730g.f37501d;
        }
        if ((i14 & 2) != 0) {
            c6979c = c7730g.f37502e;
        }
        if ((i14 & 4) != 0) {
            c5406d0 = c7730g.f37503f;
        }
        if ((i14 & 8) != 0) {
            i11 = c7730g.f37504g;
        }
        if ((i14 & 16) != 0) {
            i12 = c7730g.f37505h;
        }
        if ((i14 & 32) != 0) {
            i13 = c7730g.f37506i;
        }
        return c7730g.m33749b(i10, c6979c, c5406d0, i11, i12, i13);
    }

    @Override // p173ji.InterfaceC5434y.a
    @NotNull
    /* renamed from: a */
    public C5410f0 mo27169a(@NotNull C5406d0 c5406d0) {
        C9367f.m39526e(c5406d0, "request");
        if (!(this.f37501d < this.f37500c.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f37498a++;
        C6979c c6979c = this.f37502e;
        if (c6979c != null) {
            if (!c6979c.m32017j().m32039g(c5406d0.m26880j())) {
                throw new IllegalStateException(("network interceptor " + this.f37500c.get(this.f37501d - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f37498a == 1)) {
                throw new IllegalStateException(("network interceptor " + this.f37500c.get(this.f37501d - 1) + " must call proceed() exactly once").toString());
            }
        }
        C7730g m33748c = m33748c(this, this.f37501d + 1, null, c5406d0, 0, 0, 0, 58, null);
        InterfaceC5434y interfaceC5434y = this.f37500c.get(this.f37501d);
        C5410f0 intercept = interfaceC5434y.intercept(m33748c);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC5434y + " returned null");
        }
        if (this.f37502e != null) {
            if (!(this.f37501d + 1 >= this.f37500c.size() || m33748c.f37498a == 1)) {
                throw new IllegalStateException(("network interceptor " + interfaceC5434y + " must call proceed() exactly once").toString());
            }
        }
        boolean z10 = false;
        if (intercept.m26920f() != null) {
            z10 = true;
        }
        if (z10) {
            return intercept;
        }
        throw new IllegalStateException(("interceptor " + interfaceC5434y + " returned a response with no body").toString());
    }

    @NotNull
    /* renamed from: b */
    public final C7730g m33749b(int i10, @Nullable C6979c c6979c, @NotNull C5406d0 c5406d0, int i11, int i12, int i13) {
        C9367f.m39526e(c5406d0, "request");
        return new C7730g(this.f37499b, this.f37500c, i10, c6979c, c5406d0, i11, i12, i13);
    }

    @Override // p173ji.InterfaceC5434y.a
    @NotNull
    public InterfaceC5407e call() {
        return this.f37499b;
    }

    @NotNull
    /* renamed from: d */
    public final C6981e m33750d() {
        return this.f37499b;
    }

    /* renamed from: e */
    public final int m33751e() {
        return this.f37504g;
    }

    @Nullable
    /* renamed from: f */
    public final C6979c m33752f() {
        return this.f37502e;
    }

    /* renamed from: g */
    public final int m33753g() {
        return this.f37505h;
    }

    @NotNull
    /* renamed from: h */
    public final C5406d0 m33754h() {
        return this.f37503f;
    }

    /* renamed from: i */
    public final int m33755i() {
        return this.f37506i;
    }

    /* renamed from: j */
    public int m33756j() {
        return this.f37505h;
    }

    @Override // p173ji.InterfaceC5434y.a
    @NotNull
    public C5406d0 request() {
        return this.f37503f;
    }
}
