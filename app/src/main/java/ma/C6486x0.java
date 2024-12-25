package ma;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import p060da.C4414m;
import p216m9.C5947e;
import p216m9.C5980p;
import p230n9.C6721i;
import p270p9.AbstractC7670a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/x0.class
 */
/* renamed from: ma.x0 */
/* loaded from: combined.jar:classes2.jar:ma/x0.class */
public final class C6486x0 extends AbstractC7670a {

    /* renamed from: b */
    public final ImageView f34137b;

    /* renamed from: c */
    public final View f34138c;

    /* renamed from: d */
    public final boolean f34139d;

    /* renamed from: e */
    public final Drawable f34140e;

    /* renamed from: f */
    public final String f34141f;

    /* renamed from: g */
    public final Drawable f34142g;

    /* renamed from: h */
    public final String f34143h;

    /* renamed from: i */
    public final Drawable f34144i;

    /* renamed from: j */
    public final String f34145j;

    /* renamed from: k */
    public boolean f34146k = false;

    public C6486x0(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z10) {
        this.f34137b = imageView;
        this.f34140e = drawable;
        this.f34142g = drawable2;
        this.f34144i = drawable3 != null ? drawable3 : drawable2;
        this.f34141f = context.getString(C5980p.f33563o);
        this.f34143h = context.getString(C5980p.f33562n);
        this.f34145j = context.getString(C5980p.f33569u);
        this.f34138c = view;
        this.f34139d = z10;
        imageView.setEnabled(false);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: c */
    public final void mo29375c() {
        m30104i();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: d */
    public final void mo29376d() {
        m30103h(true);
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: e */
    public final void mo29377e(C5947e c5947e) {
        super.mo29377e(c5947e);
        m30104i();
    }

    @Override // p270p9.AbstractC7670a
    /* renamed from: f */
    public final void mo29378f() {
        this.f34137b.setEnabled(false);
        super.mo29378f();
    }

    /* renamed from: g */
    public final void m30102g(Drawable drawable, String str) {
        boolean equals = drawable.equals(this.f34137b.getDrawable());
        this.f34137b.setImageDrawable(drawable);
        this.f34137b.setContentDescription(str);
        this.f34137b.setVisibility(0);
        this.f34137b.setEnabled(true);
        View view = this.f34138c;
        if (view != null) {
            view.setVisibility(8);
        }
        if ((!equals) && this.f34146k) {
            this.f34137b.sendAccessibilityEvent(8);
        }
    }

    @TargetApi(21)
    /* renamed from: h */
    public final void m30103h(boolean z10) {
        if (C4414m.m22455f()) {
            this.f34146k = this.f34137b.isAccessibilityFocused();
        }
        View view = this.f34138c;
        int i10 = 0;
        if (view != null) {
            view.setVisibility(0);
            if (this.f34146k) {
                this.f34138c.sendAccessibilityEvent(8);
            }
        }
        ImageView imageView = this.f34137b;
        if (true == this.f34139d) {
            i10 = 4;
        }
        imageView.setVisibility(i10);
        this.f34137b.setEnabled(!z10);
    }

    /* renamed from: i */
    public final void m30104i() {
        C6721i mo29823b = mo29823b();
        if (mo29823b == null || !mo29823b.m31020p()) {
            this.f34137b.setEnabled(false);
            return;
        }
        if (mo29823b.m31029u()) {
            if (mo29823b.m31024r()) {
                m30102g(this.f34144i, this.f34145j);
                return;
            } else {
                m30102g(this.f34142g, this.f34143h);
                return;
            }
        }
        if (mo29823b.m31022q()) {
            m30103h(false);
        } else if (mo29823b.m31028t()) {
            m30102g(this.f34140e, this.f34141f);
        } else if (mo29823b.m31026s()) {
            m30103h(true);
        }
    }
}
