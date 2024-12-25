package ma;

import android.view.View;
import p216m9.C5947e;
import p230n9.C6721i;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/b1.class
 */
/* renamed from: ma.b1 */
/* loaded from: combined.jar:classes2.jar:ma/b1.class */
public final class C6028b1 extends AbstractC7670a {

    /* renamed from: b */
    public final View f33675b;

    /* renamed from: c */
    public final int f33676c;

    public C6028b1(View view, int i10) {
        this.f33675b = view;
        this.f33676c = i10;
        view.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29436g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: d */
    public final void mo29376d() {
        this.f33675b.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        m29436g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        this.f33675b.setEnabled(false);
        super.mo29378f();
    }

    /* renamed from: g */
    public final void m29436g() {
        View view;
        C6721i mo29823b = mo29823b();
        boolean z10 = false;
        if (mo29823b == null || !mo29823b.m31019o0() || mo29823b.m31030v()) {
            this.f33675b.setVisibility(this.f33676c);
            view = this.f33675b;
        } else {
            this.f33675b.setVisibility(0);
            view = this.f33675b;
            z10 = true;
        }
        view.setEnabled(z10);
    }
}
