package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/k0.class
 */
/* renamed from: androidx.appcompat.widget.k0 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/k0.class */
public class C0327k0 extends ToggleButton {

    /* renamed from: b */
    public final C0308e f2148b;

    /* renamed from: c */
    public final C0309e0 f2149c;

    public C0327k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public C0327k0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0322i1.m1454a(this, getContext());
        C0308e c0308e = new C0308e(this);
        this.f2148b = c0308e;
        c0308e.m1320e(attributeSet, i10);
        C0309e0 c0309e0 = new C0309e0(this);
        this.f2149c = c0309e0;
        c0309e0.m1342m(attributeSet, i10);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0308e c0308e = this.f2148b;
        if (c0308e != null) {
            c0308e.m1317b();
        }
        C0309e0 c0309e0 = this.f2149c;
        if (c0309e0 != null) {
            c0309e0.m1332b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0308e c0308e = this.f2148b;
        return c0308e != null ? c0308e.m1318c() : null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0308e c0308e = this.f2148b;
        return c0308e != null ? c0308e.m1319d() : null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0308e c0308e = this.f2148b;
        if (c0308e != null) {
            c0308e.m1321f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0308e c0308e = this.f2148b;
        if (c0308e != null) {
            c0308e.m1322g(i10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0308e c0308e = this.f2148b;
        if (c0308e != null) {
            c0308e.m1324i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0308e c0308e = this.f2148b;
        if (c0308e != null) {
            c0308e.m1325j(mode);
        }
    }
}
