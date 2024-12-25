package ma;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import p200l9.C5782l;
import p216m9.C5938b;
import p216m9.C5947e;
import p230n9.C6698a;
import p230n9.C6701b;
import p230n9.C6704c;
import p230n9.C6710e;
import p230n9.C6721i;
import p244o9.C6932b;
import p270p9.AbstractC7670a;
import p402x9.C9691a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/q0.class
 */
/* renamed from: ma.q0 */
/* loaded from: combined.jar:classes2.jar:ma/q0.class */
public final class C6342q0 extends AbstractC7670a {

    /* renamed from: b */
    public final ImageView f33972b;

    /* renamed from: c */
    public final C6701b f33973c;

    /* renamed from: d */
    public final Bitmap f33974d;

    /* renamed from: e */
    public final View f33975e;

    /* renamed from: f */
    public final C6704c f33976f;

    /* renamed from: g */
    public final C6321p0 f33977g;

    /* renamed from: h */
    public final C6932b f33978h;

    public C6342q0(ImageView imageView, Context context, C6701b c6701b, int i10, View view, C6321p0 c6321p0) {
        this.f33972b = imageView;
        this.f33973c = c6701b;
        this.f33977g = c6321p0;
        this.f33974d = i10 != 0 ? BitmapFactory.decodeResource(context.getResources(), i10) : null;
        this.f33975e = view;
        C5938b m29236g = C5938b.m29236g(context);
        C6704c c6704c = null;
        if (m29236g != null) {
            C6698a m29251P = m29236g.m29241a().m29251P();
            c6704c = null;
            if (m29251P != null) {
                c6704c = m29251P.m30857Q();
            }
        }
        this.f33976f = c6704c;
        this.f33978h = new C6932b(context.getApplicationContext());
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m29974k();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        this.f33978h.m31902c(new C6300o0(this));
        m29973j();
        m29974k();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        this.f33978h.m31900a();
        m29973j();
        super.mo29378f();
    }

    /* renamed from: j */
    public final void m29973j() {
        View view = this.f33975e;
        if (view != null) {
            view.setVisibility(0);
            this.f33972b.setVisibility(4);
        }
        Bitmap bitmap = this.f33974d;
        if (bitmap != null) {
            this.f33972b.setImageBitmap(bitmap);
        }
    }

    /* renamed from: k */
    public final void m29974k() {
        Uri m30909a;
        C9691a m30873b;
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p()) {
            m29973j();
            return;
        }
        MediaInfo m31009j = mo29823b.m31009j();
        if (m31009j == null) {
            m30909a = null;
        } else {
            C5782l m13065Y = m31009j.m13065Y();
            C6704c c6704c = this.f33976f;
            m30909a = (c6704c == null || m13065Y == null || (m30873b = c6704c.m30873b(m13065Y, this.f33973c)) == null || m30873b.m40801P() == null) ? C6710e.m30909a(m31009j, 0) : m30873b.m40801P();
        }
        if (m30909a == null) {
            m29973j();
        } else {
            this.f33978h.m31903d(m30909a);
        }
    }
}
