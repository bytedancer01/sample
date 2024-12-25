package p136hi;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.AbstractC4522v0;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hi/e.class
 */
/* renamed from: hi.e */
/* loaded from: combined.jar:classes2.jar:hi/e.class */
public final class ExecutorC5123e extends AbstractC4522v0 implements InterfaceC5128j, Executor {

    /* renamed from: i */
    public static final AtomicIntegerFieldUpdater f29418i = AtomicIntegerFieldUpdater.newUpdater(ExecutorC5123e.class, "inFlightTasks");

    /* renamed from: d */
    @NotNull
    public final C5121c f29419d;

    /* renamed from: e */
    public final int f29420e;

    /* renamed from: f */
    @Nullable
    public final String f29421f;

    /* renamed from: g */
    public final int f29422g;

    /* renamed from: h */
    @NotNull
    public final ConcurrentLinkedQueue<Runnable> f29423h = new ConcurrentLinkedQueue<>();

    @NotNull
    private volatile int inFlightTasks = 0;

    public ExecutorC5123e(@NotNull C5121c c5121c, int i10, @Nullable String str, int i11) {
        this.f29419d = c5121c;
        this.f29420e = i10;
        this.f29421f = str;
        this.f29422g = i11;
    }

    @Override // p067di.AbstractC4462b0
    /* renamed from: A0 */
    public void mo22632A0(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Runnable runnable) {
        m25717C0(runnable, false);
    }

    @Override // p136hi.InterfaceC5128j
    /* renamed from: B */
    public void mo25716B() {
        Runnable poll = this.f29423h.poll();
        if (poll != null) {
            this.f29419d.m25715D0(poll, this, true);
            return;
        }
        f29418i.decrementAndGet(this);
        Runnable poll2 = this.f29423h.poll();
        if (poll2 == null) {
            return;
        }
        m25717C0(poll2, true);
    }

    /* renamed from: C0 */
    public final void m25717C0(Runnable runnable, boolean z10) {
        Runnable poll;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29418i;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f29420e) {
                this.f29419d.m25715D0(runnable, this, z10);
                return;
            }
            this.f29423h.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f29420e) {
                return;
            }
            poll = this.f29423h.poll();
            runnable = poll;
        } while (poll != null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        m25717C0(runnable, false);
    }

    @Override // p136hi.InterfaceC5128j
    /* renamed from: q0 */
    public int mo25718q0() {
        return this.f29422g;
    }

    @Override // p067di.AbstractC4462b0
    @NotNull
    public String toString() {
        String str = this.f29421f;
        String str2 = str;
        if (str == null) {
            str2 = super.toString() + "[dispatcher = " + this.f29419d + ']';
        }
        return str2;
    }
}
