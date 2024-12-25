package ma;

import android.widget.TextView;
import p216m9.C5947e;
import p216m9.C5980p;
import p230n9.C6721i;
import p270p9.AbstractC7670a;
import p270p9.C7672c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/f1.class
 */
/* renamed from: ma.f1 */
/* loaded from: combined.jar:classes2.jar:ma/f1.class */
public final class C6112f1 extends AbstractC7670a implements C6721i.e {

    /* renamed from: b */
    public final TextView f33757b;

    /* renamed from: c */
    public final C7672c f33758c;

    public C6112f1(TextView textView, C7672c c7672c) {
        this.f33757b = textView;
        this.f33758c = c7672c;
        textView.setText(textView.getContext().getString(C5980p.f33560l));
    }

    @Override // p230n9.C6721i.e
    /* renamed from: a */
    public final void mo29582a(long j10, long j11) {
        m29583g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29583g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30999c(this, 1000L);
        }
        m29583g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30988O(this);
        }
        super.mo29378f();
        m29583g();
    }

    /* renamed from: g */
    public final void m29583g() {
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p()) {
            TextView textView = this.f33757b;
            textView.setText(textView.getContext().getString(C5980p.f33560l));
        } else {
            if (mo29823b.m31024r() && this.f33758c.m33615i() == null) {
                this.f33757b.setVisibility(8);
                return;
            }
            this.f33757b.setVisibility(0);
            TextView textView2 = this.f33757b;
            C7672c c7672c = this.f33758c;
            textView2.setText(c7672c.m33618l(c7672c.m33609b() + c7672c.m33612e()));
        }
    }
}
