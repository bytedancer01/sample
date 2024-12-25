package p067di;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/v.class
 */
/* renamed from: di.v */
/* loaded from: combined.jar:classes2.jar:di/v.class */
public class C4521v {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f26945b = AtomicIntegerFieldUpdater.newUpdater(C4521v.class, "_handled");

    @NotNull
    private volatile int _handled;

    /* renamed from: a */
    @NotNull
    public final Throwable f26946a;

    public C4521v(@NotNull Throwable th2, boolean z10) {
        this.f26946a = th2;
        this._handled = z10 ? 1 : 0;
    }

    public /* synthetic */ C4521v(Throwable th2, boolean z10, int i10, C9365d c9365d) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* renamed from: a */
    public final boolean m22844a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean m22845b() {
        return f26945b.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return C4483i0.m22670a(this) + '[' + this.f26946a + ']';
    }
}
