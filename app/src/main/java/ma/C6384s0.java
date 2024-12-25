package ma;

import android.view.View;
import p216m9.C5947e;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/s0.class
 */
/* renamed from: ma.s0 */
/* loaded from: combined.jar:classes2.jar:ma/s0.class */
public final class C6384s0 extends AbstractC7670a {

    /* renamed from: b */
    public final View f34005b;

    public C6384s0(View view) {
        this.f34005b = view;
        view.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        this.f34005b.setEnabled(true);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        this.f34005b.setEnabled(false);
        super.mo29378f();
    }
}
