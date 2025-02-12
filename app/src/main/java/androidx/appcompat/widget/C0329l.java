package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p029c.C0920a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/l.class
 */
/* renamed from: androidx.appcompat.widget.l */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/l.class */
public class C0329l extends ImageButton {

    /* renamed from: b */
    public final C0308e f2154b;

    /* renamed from: c */
    public final C0332m f2155c;

    public C0329l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6090E);
    }

    public C0329l(Context context, AttributeSet attributeSet, int i10) {
        super(C0328k1.m1464b(context), attributeSet, i10);
        C0322i1.m1454a(this, getContext());
        C0308e c0308e = new C0308e(this);
        this.f2154b = c0308e;
        c0308e.m1320e(attributeSet, i10);
        C0332m c0332m = new C0332m(this);
        this.f2155c = c0332m;
        c0332m.m1471f(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0308e c0308e = this.f2154b;
        if (c0308e != null) {
            c0308e.m1317b();
        }
        C0332m c0332m = this.f2155c;
        if (c0332m != null) {
            c0332m.m1467b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0308e c0308e = this.f2154b;
        return c0308e != null ? c0308e.m1318c() : null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0308e c0308e = this.f2154b;
        return c0308e != null ? c0308e.m1319d() : null;
    }

    public ColorStateList getSupportImageTintList() {
        C0332m c0332m = this.f2155c;
        return c0332m != null ? c0332m.m1468c() : null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0332m c0332m = this.f2155c;
        return c0332m != null ? c0332m.m1469d() : null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f2155c.m1470e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0308e c0308e = this.f2154b;
        if (c0308e != null) {
            c0308e.m1321f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0308e c0308e = this.f2154b;
        if (c0308e != null) {
            c0308e.m1322g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0332m c0332m = this.f2155c;
        if (c0332m != null) {
            c0332m.m1467b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0332m c0332m = this.f2155c;
        if (c0332m != null) {
            c0332m.m1467b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f2155c.m1472g(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0332m c0332m = this.f2155c;
        if (c0332m != null) {
            c0332m.m1467b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0308e c0308e = this.f2154b;
        if (c0308e != null) {
            c0308e.m1324i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0308e c0308e = this.f2154b;
        if (c0308e != null) {
            c0308e.m1325j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0332m c0332m = this.f2155c;
        if (c0332m != null) {
            c0332m.m1473h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0332m c0332m = this.f2155c;
        if (c0332m != null) {
            c0332m.m1474i(mode);
        }
    }
}
