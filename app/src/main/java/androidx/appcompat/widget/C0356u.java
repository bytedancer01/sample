package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p029c.C0929j;
import p106g0.C4917c;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/u.class
 */
/* renamed from: androidx.appcompat.widget.u */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/u.class */
public class C0356u extends C0341p {

    /* renamed from: d */
    public final SeekBar f2269d;

    /* renamed from: e */
    public Drawable f2270e;

    /* renamed from: f */
    public ColorStateList f2271f;

    /* renamed from: g */
    public PorterDuff.Mode f2272g;

    /* renamed from: h */
    public boolean f2273h;

    /* renamed from: i */
    public boolean f2274i;

    public C0356u(SeekBar seekBar) {
        super(seekBar);
        this.f2271f = null;
        this.f2272g = null;
        this.f2273h = false;
        this.f2274i = false;
        this.f2269d = seekBar;
    }

    @Override // androidx.appcompat.widget.C0341p
    /* renamed from: c */
    public void mo1546c(AttributeSet attributeSet, int i10) {
        super.mo1546c(attributeSet, i10);
        Context context = this.f2269d.getContext();
        int[] iArr = C0929j.f6387V;
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f2269d;
        C6824g0.m31535n0(seekBar, seekBar.getContext(), iArr, attributeSet, m1505v.m1523r(), i10, 0);
        Drawable m1513h = m1505v.m1513h(C0929j.f6392W);
        if (m1513h != null) {
            this.f2269d.setThumb(m1513h);
        }
        m1618j(m1505v.m1512g(C0929j.f6397X));
        int i11 = C0929j.f6407Z;
        if (m1505v.m1524s(i11)) {
            this.f2272g = C0339o0.m1532e(m1505v.m1516k(i11, -1), this.f2272g);
            this.f2274i = true;
        }
        int i12 = C0929j.f6402Y;
        if (m1505v.m1524s(i12)) {
            this.f2271f = m1505v.m1508c(i12);
            this.f2273h = true;
        }
        m1505v.m1525w();
        m1614f();
    }

    /* renamed from: f */
    public final void m1614f() {
        Drawable drawable = this.f2270e;
        if (drawable != null) {
            if (this.f2273h || this.f2274i) {
                Drawable m24854r = C4917c.m24854r(drawable.mutate());
                this.f2270e = m24854r;
                if (this.f2273h) {
                    C4917c.m24851o(m24854r, this.f2271f);
                }
                if (this.f2274i) {
                    C4917c.m24852p(this.f2270e, this.f2272g);
                }
                if (this.f2270e.isStateful()) {
                    this.f2270e.setState(this.f2269d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public void m1615g(Canvas canvas) {
        if (this.f2270e != null) {
            int max = this.f2269d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2270e.getIntrinsicWidth();
                int intrinsicHeight = this.f2270e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2270e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f2269d.getWidth() - this.f2269d.getPaddingLeft()) - this.f2269d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f2269d.getPaddingLeft(), this.f2269d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f2270e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void m1616h() {
        Drawable drawable = this.f2270e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2269d.getDrawableState())) {
            this.f2269d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    public void m1617i() {
        Drawable drawable = this.f2270e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    public void m1618j(Drawable drawable) {
        Drawable drawable2 = this.f2270e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2270e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2269d);
            C4917c.m24849m(drawable, C6824g0.m31473C(this.f2269d));
            if (drawable.isStateful()) {
                drawable.setState(this.f2269d.getDrawableState());
            }
            m1614f();
        }
        this.f2269d.invalidate();
    }
}
