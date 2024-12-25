package p049d;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p029c.C0929j;
import p137i.AbstractC5134b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/a.class
 */
/* renamed from: d.a */
/* loaded from: combined.jar:classes1.jar:d/a.class */
public abstract class AbstractC4275a {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/a$a.class
     */
    /* renamed from: d.a$a */
    /* loaded from: combined.jar:classes1.jar:d/a$a.class */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f26228a;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f26228a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f26228a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0929j.f6514t);
            this.f26228a = obtainStyledAttributes.getInt(C0929j.f6519u, 0);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f26228a = 0;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f26228a = 0;
            this.f26228a = aVar.f26228a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/a$b.class
     */
    /* renamed from: d.a$b */
    /* loaded from: combined.jar:classes1.jar:d/a$b.class */
    public interface b {
        void onMenuVisibilityChanged(boolean z10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/a$c.class
     */
    @Deprecated
    /* renamed from: d.a$c */
    /* loaded from: combined.jar:classes1.jar:d/a$c.class */
    public static abstract class c {
        /* renamed from: a */
        public abstract CharSequence m21528a();

        /* renamed from: b */
        public abstract View m21529b();

        /* renamed from: c */
        public abstract Drawable m21530c();

        /* renamed from: d */
        public abstract CharSequence m21531d();

        /* renamed from: e */
        public abstract void m21532e();
    }

    /* renamed from: f */
    public boolean mo21509f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo21510g();

    /* renamed from: h */
    public abstract void mo21511h(boolean z10);

    /* renamed from: i */
    public abstract int mo21512i();

    /* renamed from: j */
    public abstract Context mo21513j();

    /* renamed from: k */
    public boolean mo21514k() {
        return false;
    }

    /* renamed from: l */
    public void mo21515l(Configuration configuration) {
    }

    /* renamed from: m */
    public void mo21516m() {
    }

    /* renamed from: n */
    public abstract boolean mo21517n(int i10, KeyEvent keyEvent);

    /* renamed from: o */
    public boolean mo21518o(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: p */
    public boolean mo21519p() {
        return false;
    }

    /* renamed from: q */
    public abstract void mo21520q(boolean z10);

    /* renamed from: r */
    public abstract void mo21521r(boolean z10);

    /* renamed from: s */
    public abstract void mo21522s(int i10);

    /* renamed from: t */
    public abstract void mo21523t(boolean z10);

    /* renamed from: u */
    public abstract void mo21524u(CharSequence charSequence);

    /* renamed from: v */
    public abstract void mo21525v(CharSequence charSequence);

    /* renamed from: w */
    public abstract void mo21526w(CharSequence charSequence);

    /* renamed from: x */
    public AbstractC5134b mo21527x(AbstractC5134b.a aVar) {
        return null;
    }
}
