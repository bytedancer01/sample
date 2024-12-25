package ma;

import android.view.View;
import p216m9.C5947e;
import p230n9.C6721i;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/a1.class
 */
/* renamed from: ma.a1 */
/* loaded from: combined.jar:classes2.jar:ma/a1.class */
public final class C6007a1 extends AbstractC7670a {

    /* renamed from: b */
    public final View f33645b;

    /* renamed from: c */
    public final int f33646c;

    public C6007a1(View view, int i10) {
        this.f33645b = view;
        this.f33646c = i10;
        view.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29379g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: d */
    public final void mo29376d() {
        this.f33645b.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        m29379g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        this.f33645b.setEnabled(false);
        super.mo29378f();
    }

    /* renamed from: g */
    public final void m29379g() {
        View view;
        C6721i mo29823b = mo29823b();
        boolean z10 = false;
        if (mo29823b == null || !mo29823b.m31017n0() || mo29823b.m31030v()) {
            this.f33645b.setVisibility(this.f33646c);
            view = this.f33645b;
        } else {
            this.f33645b.setVisibility(0);
            view = this.f33645b;
            z10 = true;
        }
        view.setEnabled(z10);
    }
}
