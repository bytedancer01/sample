package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p413y0.C9793f;
import p413y0.C9795h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/p0.class
 */
/* renamed from: androidx.leanback.widget.p0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/p0.class */
public final class C0531p0 extends LinearLayout {

    /* renamed from: b */
    public ViewGroup f3547b;

    /* renamed from: c */
    public Drawable f3548c;

    /* renamed from: d */
    public boolean f3549d;

    public C0531p0(Context context) {
        this(context, null, 0);
    }

    public C0531p0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3549d = true;
        setOrientation(1);
        LayoutInflater.from(context).inflate(C9795h.f45016g, this);
        this.f3547b = (ViewGroup) findViewById(C9793f.f44991m);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public void m2915a(View view) {
        if (this.f3547b.indexOfChild(view) < 0) {
            this.f3547b.addView(view, 0);
        }
    }

    /* renamed from: b */
    public void m2916b(View view) {
        addView(view);
    }

    /* renamed from: c */
    public void m2917c(int i10) {
        Drawable drawable = this.f3548c;
        if (!(drawable instanceof ColorDrawable)) {
            setForeground(new ColorDrawable(i10));
        } else {
            ((ColorDrawable) drawable.mutate()).setColor(i10);
            invalidate();
        }
    }

    /* renamed from: d */
    public void m2918d(boolean z10) {
        this.f3547b.setVisibility(z10 ? 0 : 8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3548c;
        if (drawable != null) {
            if (this.f3549d) {
                this.f3549d = false;
                drawable.setBounds(0, 0, getWidth(), getHeight());
            }
            this.f3548c.draw(canvas);
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f3548c;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f3549d = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f3548c = drawable;
        setWillNotDraw(drawable == null);
        invalidate();
    }
}
