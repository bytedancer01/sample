package ma;

import android.view.View;
import p216m9.C5947e;
import p230n9.C6721i;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/t0.class
 */
/* renamed from: ma.t0 */
/* loaded from: combined.jar:classes2.jar:ma/t0.class */
public final class C6405t0 extends AbstractC7670a {

    /* renamed from: b */
    public final View f34057b;

    public C6405t0(View view) {
        this.f34057b = view;
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m30032g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: d */
    public final void mo29376d() {
        this.f34057b.setVisibility(0);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        m30032g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        this.f34057b.setVisibility(8);
        super.mo29378f();
    }

    /* renamed from: g */
    public final void m30032g() {
        View view;
        int i10;
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p() || mo29823b.m31022q()) {
            view = this.f34057b;
            i10 = 0;
        } else {
            view = this.f34057b;
            i10 = 8;
        }
        view.setVisibility(i10);
    }
}
