package p067di;

import fi.C4861a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/q0.class
 */
/* renamed from: di.q0 */
/* loaded from: combined.jar:classes2.jar:di/q0.class */
public abstract class AbstractC4507q0 extends AbstractC4462b0 {

    /* renamed from: c */
    public long f26923c;

    /* renamed from: d */
    public boolean f26924d;

    /* renamed from: e */
    @Nullable
    public C4861a<AbstractC4492l0<?>> f26925e;

    /* renamed from: H0 */
    public static /* synthetic */ void m22793H0(AbstractC4507q0 abstractC4507q0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC4507q0.m22798G0(z10);
    }

    /* renamed from: C0 */
    public final void m22794C0(boolean z10) {
        long m22795D0 = this.f26923c - m22795D0(z10);
        this.f26923c = m22795D0;
        if (m22795D0 <= 0 && this.f26924d) {
            shutdown();
        }
    }

    /* renamed from: D0 */
    public final long m22795D0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    /* renamed from: E0 */
    public final void m22796E0(@NotNull AbstractC4492l0<?> abstractC4492l0) {
        C4861a<AbstractC4492l0<?>> c4861a = this.f26925e;
        C4861a<AbstractC4492l0<?>> c4861a2 = c4861a;
        if (c4861a == null) {
            c4861a2 = new C4861a<>();
            this.f26925e = c4861a2;
        }
        c4861a2.m24732a(abstractC4492l0);
    }

    /* renamed from: F0 */
    public long mo22797F0() {
        C4861a<AbstractC4492l0<?>> c4861a = this.f26925e;
        long j10 = Long.MAX_VALUE;
        if (c4861a == null) {
            return Long.MAX_VALUE;
        }
        if (!c4861a.m24734c()) {
            j10 = 0;
        }
        return j10;
    }

    /* renamed from: G0 */
    public final void m22798G0(boolean z10) {
        this.f26923c += m22795D0(z10);
        if (z10) {
            return;
        }
        this.f26924d = true;
    }

    /* renamed from: I0 */
    public final boolean m22799I0() {
        boolean z10 = true;
        if (this.f26923c < m22795D0(true)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: J0 */
    public final boolean m22800J0() {
        C4861a<AbstractC4492l0<?>> c4861a = this.f26925e;
        return c4861a == null ? true : c4861a.m24734c();
    }

    /* renamed from: K0 */
    public final boolean m22801K0() {
        AbstractC4492l0<?> m24735d;
        C4861a<AbstractC4492l0<?>> c4861a = this.f26925e;
        if (c4861a == null || (m24735d = c4861a.m24735d()) == null) {
            return false;
        }
        m24735d.run();
        return true;
    }

    public void shutdown() {
    }
}
