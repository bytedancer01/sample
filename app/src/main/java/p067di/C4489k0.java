package p067di;

import fi.C4867f;
import fi.C4880s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p252oh.C6975b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/k0.class
 */
/* renamed from: di.k0 */
/* loaded from: combined.jar:classes2.jar:di/k0.class */
public final class C4489k0<T> extends C4880s<T> {

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f26903e = AtomicIntegerFieldUpdater.newUpdater(C4489k0.class, "_decision");

    @NotNull
    private volatile int _decision;

    @Override // fi.C4880s, p067di.C4487j1
    /* renamed from: k */
    public void mo22716k(@Nullable Object obj) {
        mo22621p0(obj);
    }

    @Override // fi.C4880s, p067di.AbstractC4458a
    /* renamed from: p0 */
    public void mo22621p0(@Nullable Object obj) {
        if (m22773t0()) {
            return;
        }
        C4867f.m24751c(C6975b.m32003c(this.f28584d), C4532z.m22849a(obj, this.f28584d), null, 2, null);
    }

    /* renamed from: t0 */
    public final boolean m22773t0() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f26903e.compareAndSet(this, 0, 2));
        return true;
    }
}
