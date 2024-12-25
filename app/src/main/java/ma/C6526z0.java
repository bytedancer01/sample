package ma;

import android.view.View;
import p216m9.C5947e;
import p230n9.C6721i;
import p270p9.AbstractC7670a;
import p270p9.C7672c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/z0.class
 */
/* renamed from: ma.z0 */
/* loaded from: combined.jar:classes2.jar:ma/z0.class */
public final class C6526z0 extends AbstractC7670a implements C6721i.e {

    /* renamed from: b */
    public final View f34196b;

    /* renamed from: c */
    public final C7672c f34197c;

    public C6526z0(View view, C7672c c7672c) {
        this.f34196b = view;
        this.f34197c = c7672c;
        view.setEnabled(false);
    }

    @Override // p230n9.C6721i.e
    /* renamed from: a */
    public final void mo29582a(long j10, long j11) {
        m30184g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m30184g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: d */
    public final void mo29376d() {
        this.f34196b.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30999c(this, 1000L);
        }
        m30184g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30988O(this);
        }
        this.f34196b.setEnabled(false);
        super.mo29378f();
        m30184g();
    }

    /* renamed from: g */
    public final void m30184g() {
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p() || mo29823b.m31030v()) {
            this.f34196b.setEnabled(false);
            return;
        }
        if (!mo29823b.m31024r()) {
            this.f34196b.setEnabled(true);
            return;
        }
        View view = this.f34196b;
        boolean z10 = false;
        if (mo29823b.m31023q0()) {
            C7672c c7672c = this.f34197c;
            z10 = (((long) c7672c.m33608a()) + c7672c.m33612e()) - (((long) c7672c.m33611d()) + c7672c.m33612e()) >= 10000;
        }
        view.setEnabled(z10);
    }
}
