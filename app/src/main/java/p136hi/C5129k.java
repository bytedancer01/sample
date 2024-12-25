package p136hi;

import org.jetbrains.annotations.NotNull;
import p067di.C4483i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hi/k.class
 */
/* renamed from: hi.k */
/* loaded from: combined.jar:classes2.jar:hi/k.class */
public final class C5129k extends AbstractRunnableC5127i {

    /* renamed from: d */
    @NotNull
    public final Runnable f29429d;

    public C5129k(@NotNull Runnable runnable, long j10, @NotNull InterfaceC5128j interfaceC5128j) {
        super(j10, interfaceC5128j);
        this.f29429d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f29429d.run();
        } finally {
            this.f29428c.mo25716B();
        }
    }

    @NotNull
    public String toString() {
        return "Task[" + C4483i0.m22670a(this.f29429d) + '@' + C4483i0.m22671b(this.f29429d) + ", " + this.f29427b + ", " + this.f29428c + ']';
    }
}
