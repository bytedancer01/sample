package ma;

import android.view.View;
import p216m9.C5947e;
import p230n9.C6721i;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/e1.class
 */
/* renamed from: ma.e1 */
/* loaded from: combined.jar:classes2.jar:ma/e1.class */
public final class C6091e1 extends AbstractC7670a {

    /* renamed from: b */
    public final View f33743b;

    /* renamed from: c */
    public final int f33744c;

    public C6091e1(View view, int i10) {
        this.f33743b = view;
        this.f33744c = i10;
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29559g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        m29559g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        this.f33743b.setVisibility(this.f33744c);
        super.mo29378f();
    }

    /* renamed from: g */
    public final void m29559g() {
        View view;
        int i10;
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p()) {
            view = this.f33743b;
            i10 = this.f33744c;
        } else {
            view = this.f33743b;
            i10 = 0;
        }
        view.setVisibility(i10);
    }
}
