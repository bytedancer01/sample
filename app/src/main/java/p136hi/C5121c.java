package p136hi;

import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import p067di.AbstractC4522v0;
import p067di.RunnableC4486j0;
import p233nh.InterfaceC6792g;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hi/c.class
 */
/* renamed from: hi.c */
/* loaded from: combined.jar:classes2.jar:hi/c.class */
public class C5121c extends AbstractC4522v0 {

    /* renamed from: d */
    public final int f29413d;

    /* renamed from: e */
    public final int f29414e;

    /* renamed from: f */
    public final long f29415f;

    /* renamed from: g */
    @NotNull
    public final String f29416g;

    /* renamed from: h */
    @NotNull
    public ExecutorC5119a f29417h;

    public C5121c(int i10, int i11, long j10, @NotNull String str) {
        this.f29413d = i10;
        this.f29414e = i11;
        this.f29415f = j10;
        this.f29416g = str;
        this.f29417h = m25714C0();
    }

    public C5121c(int i10, int i11, @NotNull String str) {
        this(i10, i11, C5130l.f29434e, str);
    }

    public /* synthetic */ C5121c(int i10, int i11, String str, int i12, C9365d c9365d) {
        this((i12 & 1) != 0 ? C5130l.f29432c : i10, (i12 & 2) != 0 ? C5130l.f29433d : i11, (i12 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    @Override // p067di.AbstractC4462b0
    /* renamed from: A0 */
    public void mo22632A0(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Runnable runnable) {
        try {
            ExecutorC5119a.m25676t(this.f29417h, runnable, null, false, 6, null);
        } catch (RejectedExecutionException e10) {
            RunnableC4486j0.f26887h.mo22632A0(interfaceC6792g, runnable);
        }
    }

    /* renamed from: C0 */
    public final ExecutorC5119a m25714C0() {
        return new ExecutorC5119a(this.f29413d, this.f29414e, this.f29415f, this.f29416g);
    }

    /* renamed from: D0 */
    public final void m25715D0(@NotNull Runnable runnable, @NotNull InterfaceC5128j interfaceC5128j, boolean z10) {
        try {
            this.f29417h.m25687q(runnable, interfaceC5128j, z10);
        } catch (RejectedExecutionException e10) {
            RunnableC4486j0.f26887h.m22806R0(this.f29417h.m25684o(runnable, interfaceC5128j));
        }
    }
}
