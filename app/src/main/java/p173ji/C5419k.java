package p173ji;

import java.util.concurrent.TimeUnit;
import ni.C6798e;
import org.jetbrains.annotations.NotNull;
import p253oi.C6984h;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/k.class
 */
/* renamed from: ji.k */
/* loaded from: combined.jar:classes2.jar:ji/k.class */
public final class C5419k {

    /* renamed from: a */
    @NotNull
    public final C6984h f31085a;

    public C5419k() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5419k(int i10, long j10, @NotNull TimeUnit timeUnit) {
        this(new C6984h(C6798e.f35432h, i10, j10, timeUnit));
        C9367f.m39526e(timeUnit, "timeUnit");
    }

    public C5419k(@NotNull C6984h c6984h) {
        C9367f.m39526e(c6984h, "delegate");
        this.f31085a = c6984h;
    }

    @NotNull
    /* renamed from: a */
    public final C6984h m26993a() {
        return this.f31085a;
    }
}
