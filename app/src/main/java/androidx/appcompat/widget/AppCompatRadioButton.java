package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p029c.C0920a;
import p068e.C4561b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/AppCompatRadioButton.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/AppCompatRadioButton.class */
public class AppCompatRadioButton extends RadioButton {

    /* renamed from: b */
    public final C0317h f1765b;

    /* renamed from: c */
    public final C0308e f1766c;

    /* renamed from: d */
    public final C0309e0 f1767d;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6096K);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(C0328k1.m1464b(context), attributeSet, i10);
        C0322i1.m1454a(this, getContext());
        C0317h c0317h = new C0317h(this);
        this.f1765b = c0317h;
        c0317h.m1380e(attributeSet, i10);
        C0308e c0308e = new C0308e(this);
        this.f1766c = c0308e;
        c0308e.m1320e(attributeSet, i10);
        C0309e0 c0309e0 = new C0309e0(this);
        this.f1767d = c0309e0;
        c0309e0.m1342m(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0308e c0308e = this.f1766c;
        if (c0308e != null) {
            c0308e.m1317b();
        }
        C0309e0 c0309e0 = this.f1767d;
        if (c0309e0 != null) {
            c0309e0.m1332b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0317h c0317h = this.f1765b;
        int i10 = compoundPaddingLeft;
        if (c0317h != null) {
            i10 = c0317h.m1377b(compoundPaddingLeft);
        }
        return i10;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0308e c0308e = this.f1766c;
        return c0308e != null ? c0308e.m1318c() : null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0308e c0308e = this.f1766c;
        return c0308e != null ? c0308e.m1319d() : null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0317h c0317h = this.f1765b;
        return c0317h != null ? c0317h.m1378c() : null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0317h c0317h = this.f1765b;
        return c0317h != null ? c0317h.m1379d() : null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0308e c0308e = this.f1766c;
        if (c0308e != null) {
            c0308e.m1321f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0308e c0308e = this.f1766c;
        if (c0308e != null) {
            c0308e.m1322g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C4561b.m22999d(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0317h c0317h = this.f1765b;
        if (c0317h != null) {
            c0317h.m1381f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0308e c0308e = this.f1766c;
        if (c0308e != null) {
            c0308e.m1324i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0308e c0308e = this.f1766c;
        if (c0308e != null) {
            c0308e.m1325j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0317h c0317h = this.f1765b;
        if (c0317h != null) {
            c0317h.m1382g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0317h c0317h = this.f1765b;
        if (c0317h != null) {
            c0317h.m1383h(mode);
        }
    }
}
