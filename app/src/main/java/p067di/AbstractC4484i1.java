package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/i1.class
 */
/* renamed from: di.i1 */
/* loaded from: combined.jar:classes2.jar:di/i1.class */
public abstract class AbstractC4484i1 extends AbstractC4527x implements InterfaceC4501o0, InterfaceC4528x0 {

    /* renamed from: e */
    public C4487j1 f26886e;

    @Override // p067di.InterfaceC4528x0
    @Nullable
    /* renamed from: a */
    public C4499n1 mo22673a() {
        return null;
    }

    @Override // p067di.InterfaceC4501o0
    public void dispose() {
        m22674u().m22707c0(this);
    }

    @Override // p067di.InterfaceC4528x0
    public boolean isActive() {
        return true;
    }

    @Override // fi.C4872k
    @NotNull
    public String toString() {
        return C4483i0.m22670a(this) + '@' + C4483i0.m22671b(this) + "[job@" + C4483i0.m22671b(m22674u()) + ']';
    }

    @NotNull
    /* renamed from: u */
    public final C4487j1 m22674u() {
        C4487j1 c4487j1 = this.f26886e;
        if (c4487j1 != null) {
            return c4487j1;
        }
        C9367f.m39538q("job");
        throw null;
    }

    /* renamed from: v */
    public final void m22675v(@NotNull C4487j1 c4487j1) {
        this.f26886e = c4487j1;
    }
}
