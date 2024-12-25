package p253oi;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p172jh.C5382a;
import p372vh.C9367f;
import p406xd.C9728e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oi/j.class
 */
/* renamed from: oi.j */
/* loaded from: combined.jar:classes2.jar:oi/j.class */
public final class C6986j extends RuntimeException {

    /* renamed from: b */
    @NotNull
    public IOException f36087b;

    /* renamed from: c */
    @NotNull
    public final IOException f36088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6986j(@NotNull IOException iOException) {
        super(iOException);
        C9367f.m39526e(iOException, "firstConnectException");
        this.f36088c = iOException;
        this.f36087b = iOException;
    }

    /* renamed from: a */
    public final void m32118a(@NotNull IOException iOException) {
        C9367f.m39526e(iOException, C9728e.f44384d);
        C5382a.m26732a(this.f36088c, iOException);
        this.f36087b = iOException;
    }

    @NotNull
    /* renamed from: b */
    public final IOException m32119b() {
        return this.f36088c;
    }

    @NotNull
    /* renamed from: c */
    public final IOException m32120c() {
        return this.f36087b;
    }
}
