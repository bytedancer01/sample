package ma;

import android.content.Context;
import android.widget.ImageView;
import p200l9.C5758e;
import p216m9.C5938b;
import p216m9.C5947e;
import p216m9.C5980p;
import p230n9.C6721i;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/w0.class
 */
/* renamed from: ma.w0 */
/* loaded from: combined.jar:classes2.jar:ma/w0.class */
public final class C6466w0 extends AbstractC7670a {

    /* renamed from: b */
    public final ImageView f34117b;

    /* renamed from: c */
    public final String f34118c;

    /* renamed from: d */
    public final String f34119d;

    /* renamed from: e */
    public final Context f34120e;

    /* renamed from: f */
    public C5758e.d f34121f;

    public C6466w0(ImageView imageView, Context context) {
        this.f34117b = imageView;
        Context applicationContext = context.getApplicationContext();
        this.f34120e = applicationContext;
        this.f34118c = applicationContext.getString(C5980p.f33561m);
        this.f34119d = applicationContext.getString(C5980p.f33546D);
        imageView.setEnabled(false);
        this.f34121f = null;
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m30083g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: d */
    public final void mo29376d() {
        this.f34117b.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        if (this.f34121f == null) {
            this.f34121f = new C6446v0(this);
        }
        c5947e.m29288p(this.f34121f);
        super.mo29377e(c5947e);
        m30083g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        C5758e.d dVar;
        this.f34117b.setEnabled(false);
        C5947e m29358c = C5938b.m29235e(this.f34120e).m29243c().m29358c();
        if (m29358c != null && (dVar = this.f34121f) != null) {
            m29358c.m29292t(dVar);
        }
        super.mo29378f();
    }

    /* renamed from: g */
    public final void m30083g() {
        C5947e m29358c = C5938b.m29235e(this.f34120e).m29243c().m29358c();
        if (m29358c == null || !m29358c.m29348c()) {
            this.f34117b.setEnabled(false);
            return;
        }
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p()) {
            this.f34117b.setEnabled(false);
        } else {
            this.f34117b.setEnabled(true);
        }
        boolean m29291s = m29358c.m29291s();
        this.f34117b.setSelected(m29291s);
        this.f34117b.setContentDescription(m29291s ? this.f34119d : this.f34118c);
    }
}
