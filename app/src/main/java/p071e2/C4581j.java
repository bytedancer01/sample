package p071e2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import lc.InterfaceFutureC5838a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.InterfaceC4466c1;
import p172jh.C5398q;
import p263p2.C7546c;
import p356uh.InterfaceC9196l;
import p372vh.AbstractC9368g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/j.class
 */
/* renamed from: e2.j */
/* loaded from: combined.jar:classes1.jar:e2/j.class */
public final class C4581j<R> implements InterfaceFutureC5838a<R> {

    /* renamed from: b */
    @NotNull
    public final InterfaceC4466c1 f27219b;

    /* renamed from: c */
    @NotNull
    public final C7546c<R> f27220c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/j$a.class
     */
    /* renamed from: e2.j$a */
    /* loaded from: combined.jar:classes1.jar:e2/j$a.class */
    public static final class a extends AbstractC9368g implements InterfaceC9196l<Throwable, C5398q> {

        /* renamed from: c */
        public final C4581j<R> f27221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4581j<R> c4581j) {
            super(1);
            this.f27221c = c4581j;
        }

        /* renamed from: a */
        public final void m23125a(@Nullable Throwable th2) {
            if (th2 == null) {
                if (!this.f27221c.f27220c.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th2 instanceof CancellationException) {
                    this.f27221c.f27220c.cancel(true);
                    return;
                }
                C7546c c7546c = this.f27221c.f27220c;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                c7546c.mo32292q(th2);
            }
        }

        @Override // p356uh.InterfaceC9196l
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C5398q mo6711d(Throwable th2) {
            m23125a(th2);
            return C5398q.f30770a;
        }
    }

    public C4581j(@NotNull InterfaceC4466c1 interfaceC4466c1, @NotNull C7546c<R> c7546c) {
        C9367f.m39526e(interfaceC4466c1, "job");
        C9367f.m39526e(c7546c, "underlying");
        this.f27219b = interfaceC4466c1;
        this.f27220c = c7546c;
        interfaceC4466c1.mo22639f(new a(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4581j(p067di.InterfaceC4466c1 r5, p263p2.C7546c r6, int r7, p372vh.C9365d r8) {
        /*
            r4 = this;
            r0 = r7
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L10
            p2.c r0 = p263p2.C7546c.m32302t()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "create()"
            p372vh.C9367f.m39525d(r0, r1)
        L10:
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071e2.C4581j.<init>(di.c1, p2.c, int, vh.d):void");
    }

    @Override // lc.InterfaceFutureC5838a
    /* renamed from: a */
    public void mo23123a(Runnable runnable, Executor executor) {
        this.f27220c.mo23123a(runnable, executor);
    }

    /* renamed from: c */
    public final void m23124c(R r10) {
        this.f27220c.mo32291p(r10);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f27220c.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f27220c.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) {
        return this.f27220c.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f27220c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f27220c.isDone();
    }
}
