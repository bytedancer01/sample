package p067di;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p356uh.InterfaceC9196l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/a1.class
 */
/* renamed from: di.a1 */
/* loaded from: combined.jar:classes2.jar:di/a1.class */
public final class C4460a1 extends AbstractC4472e1 {

    /* renamed from: g */
    public static final AtomicIntegerFieldUpdater f26873g = AtomicIntegerFieldUpdater.newUpdater(C4460a1.class, "_invoked");

    @NotNull
    private volatile int _invoked = 0;

    /* renamed from: f */
    @NotNull
    public final InterfaceC9196l<Throwable, C5398q> f26874f;

    /* JADX WARN: Multi-variable type inference failed */
    public C4460a1(@NotNull InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        this.f26874f = interfaceC9196l;
    }

    @Override // p356uh.InterfaceC9196l
    /* renamed from: d */
    public /* bridge */ /* synthetic */ C5398q mo6711d(Throwable th2) {
        mo22631t(th2);
        return C5398q.f30770a;
    }

    @Override // p067di.AbstractC4527x
    /* renamed from: t */
    public void mo22631t(@Nullable Throwable th2) {
        if (f26873g.compareAndSet(this, 0, 1)) {
            this.f26874f.mo6711d(th2);
        }
    }
}
