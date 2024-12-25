package ma;

import android.widget.ProgressBar;
import p216m9.C5947e;
import p230n9.C6721i;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/y0.class
 */
/* renamed from: ma.y0 */
/* loaded from: combined.jar:classes2.jar:ma/y0.class */
public final class C6506y0 extends AbstractC7670a implements C6721i.e {

    /* renamed from: b */
    public final ProgressBar f34175b;

    /* renamed from: c */
    public final long f34176c;

    public C6506y0(ProgressBar progressBar, long j10) {
        this.f34175b = progressBar;
        this.f34176c = j10;
        progressBar.setMax(1);
        progressBar.setProgress(0);
    }

    @Override // p230n9.C6721i.e
    /* renamed from: a */
    public final void mo29582a(long j10, long j11) {
        m30155g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m30155g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30999c(this, this.f34176c);
        }
        m30155g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30988O(this);
        }
        super.mo29378f();
        m30155g();
    }

    /* renamed from: g */
    public final void m30155g() {
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p() || mo29823b.m31024r()) {
            this.f34175b.setMax(1);
            this.f34175b.setProgress(0);
        } else {
            this.f34175b.setMax((int) mo29823b.m31018o());
            this.f34175b.setProgress((int) mo29823b.m31006g());
        }
    }
}
