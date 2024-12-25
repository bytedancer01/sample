package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/z.class
 */
/* renamed from: androidx.leanback.widget.z */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/z.class */
public class C0552z extends LinearLayout {

    /* renamed from: b */
    public Drawable f3697b;

    /* renamed from: c */
    public boolean f3698c;

    /* renamed from: d */
    public final Rect f3699d;

    public C0552z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0552z(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3699d = new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23 || Build.VERSION.SDK_INT < 23) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.foreground});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                m3083a(drawable);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void m3083a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0520k.m2659b(this, drawable);
            return;
        }
        if (this.f3697b != drawable) {
            this.f3697b = drawable;
            this.f3698c = true;
            setWillNotDraw(false);
            this.f3697b.setCallback(this);
            if (this.f3697b.isStateful()) {
                this.f3697b.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3697b;
        if (drawable != null) {
            if (this.f3698c) {
                this.f3698c = false;
                Rect rect = this.f3699d;
                rect.set(0, 0, getRight() - getLeft(), getBottom() - getTop());
                drawable.setBounds(rect);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3697b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f3697b.setState(getDrawableState());
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3697b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f3698c = z10 | this.f3698c;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3697b;
    }
}
