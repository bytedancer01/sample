package ma;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import p216m9.C5947e;
import p216m9.C5965k;
import p216m9.C5974n;
import p216m9.C5983q;
import p216m9.C5986r;
import p230n9.C6721i;
import p270p9.AbstractC7670a;
import p270p9.C7672c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/g1.class
 */
/* renamed from: ma.g1 */
/* loaded from: combined.jar:classes2.jar:ma/g1.class */
public final class C6133g1 extends AbstractC7670a implements C6721i.e {

    /* renamed from: b */
    public final TextView f33783b;

    /* renamed from: c */
    public final ImageView f33784c;

    /* renamed from: d */
    public final C7672c f33785d;

    public C6133g1(View view, C7672c c7672c) {
        TextView textView = (TextView) view.findViewById(C5974n.f33496Q);
        this.f33783b = textView;
        ImageView imageView = (ImageView) view.findViewById(C5974n.f33495P);
        this.f33784c = imageView;
        this.f33785d = c7672c;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(null, C5986r.f33599b, C5965k.f33453a, C5983q.f33575a);
        int resourceId = obtainStyledAttributes.getResourceId(C5986r.f33613p, 0);
        obtainStyledAttributes.recycle();
        imageView.getDrawable().setColorFilter(imageView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
        textView.setVisibility(8);
        imageView.setVisibility(8);
    }

    @Override // p230n9.C6721i.e
    /* renamed from: a */
    public final void mo29582a(long j10, long j11) {
        m29618g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29618g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30999c(this, 1000L);
        }
        m29618g();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        C6721i mo29823b = mo29823b();
        if (mo29823b != null) {
            mo29823b.m30988O(this);
        }
        super.mo29378f();
        m29618g();
    }

    /* renamed from: g */
    public final void m29618g() {
        C6721i mo29823b = mo29823b();
        int i10 = 8;
        if (mo29823b == null || !mo29823b.m31020p() || !mo29823b.m31024r()) {
            this.f33783b.setVisibility(8);
            this.f33784c.setVisibility(8);
            return;
        }
        boolean m31029u = !mo29823b.m31023q0() ? mo29823b.m31029u() : this.f33785d.m33619m();
        this.f33783b.setVisibility(0);
        ImageView imageView = this.f33784c;
        if (true == m31029u) {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        C6126ff.m29603d(EnumC6057c9.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT);
    }
}
