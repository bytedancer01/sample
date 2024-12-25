package p383w9;

import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/t0.class
 */
/* renamed from: w9.t0 */
/* loaded from: combined.jar:classes2.jar:w9/t0.class */
public final class C9524t0 extends AbstractC9494m1 {

    /* renamed from: a */
    public final WeakReference<C9528u0> f43431a;

    public C9524t0(C9528u0 c9528u0) {
        this.f43431a = new WeakReference<>(c9528u0);
    }

    @Override // p383w9.AbstractC9494m1
    /* renamed from: a */
    public final void mo39951a() {
        C9528u0 c9528u0 = this.f43431a.get();
        if (c9528u0 == null) {
            return;
        }
        C9528u0.m40053o(c9528u0);
    }
}
