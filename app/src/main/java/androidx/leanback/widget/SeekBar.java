package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import org.achartengine.renderer.DefaultRenderer;
import p413y0.C9790c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/SeekBar.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SeekBar.class */
public final class SeekBar extends View {

    /* renamed from: b */
    public final RectF f3353b;

    /* renamed from: c */
    public final RectF f3354c;

    /* renamed from: d */
    public final RectF f3355d;

    /* renamed from: e */
    public final Paint f3356e;

    /* renamed from: f */
    public final Paint f3357f;

    /* renamed from: g */
    public final Paint f3358g;

    /* renamed from: h */
    public final Paint f3359h;

    /* renamed from: i */
    public int f3360i;

    /* renamed from: j */
    public int f3361j;

    /* renamed from: k */
    public int f3362k;

    /* renamed from: l */
    public int f3363l;

    /* renamed from: m */
    public int f3364m;

    /* renamed from: n */
    public int f3365n;

    /* renamed from: o */
    public int f3366o;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SeekBar$a.class
     */
    /* renamed from: androidx.leanback.widget.SeekBar$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SeekBar$a.class */
    public static abstract class AbstractC0491a {
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3353b = new RectF();
        this.f3354c = new RectF();
        this.f3355d = new RectF();
        Paint paint = new Paint(1);
        this.f3356e = paint;
        Paint paint2 = new Paint(1);
        this.f3357f = paint2;
        Paint paint3 = new Paint(1);
        this.f3358g = paint3;
        Paint paint4 = new Paint(1);
        this.f3359h = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(DefaultRenderer.TEXT_COLOR);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.f3365n = context.getResources().getDimensionPixelSize(C9790c.f44950p);
        this.f3366o = context.getResources().getDimensionPixelSize(C9790c.f44948n);
        this.f3364m = context.getResources().getDimensionPixelSize(C9790c.f44949o);
    }

    /* renamed from: a */
    public final void m2525a() {
        int i10 = isFocused() ? this.f3366o : this.f3365n;
        int width = getWidth();
        int height = getHeight();
        int i11 = (height - i10) / 2;
        RectF rectF = this.f3355d;
        int i12 = this.f3365n;
        float f10 = i12 / 2;
        float f11 = i11;
        float f12 = width - (i12 / 2);
        float f13 = height - i11;
        rectF.set(f10, f11, f12, f13);
        int i13 = isFocused() ? this.f3364m : this.f3365n / 2;
        float f14 = width - (i13 * 2);
        float f15 = (this.f3360i / this.f3362k) * f14;
        RectF rectF2 = this.f3353b;
        int i14 = this.f3365n;
        rectF2.set(i14 / 2, f11, (i14 / 2) + f15, f13);
        this.f3354c.set(this.f3353b.right, f11, (this.f3365n / 2) + ((this.f3361j / this.f3362k) * f14), f13);
        this.f3363l = i13 + ((int) f15);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f3362k;
    }

    public int getProgress() {
        return this.f3360i;
    }

    public int getSecondProgress() {
        return this.f3361j;
    }

    public int getSecondaryProgressColor() {
        return this.f3356e.getColor();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = isFocused() ? this.f3364m : this.f3365n / 2;
        canvas.drawRoundRect(this.f3355d, f10, f10, this.f3358g);
        RectF rectF = this.f3354c;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f10, f10, this.f3356e);
        }
        canvas.drawRoundRect(this.f3353b, f10, f10, this.f3357f);
        canvas.drawCircle(this.f3363l, getHeight() / 2, f10, this.f3359h);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        m2525a();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m2525a();
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAccessibilitySeekListener(AbstractC0491a abstractC0491a) {
    }

    public void setActiveBarHeight(int i10) {
        this.f3366o = i10;
        m2525a();
    }

    public void setActiveRadius(int i10) {
        this.f3364m = i10;
        m2525a();
    }

    public void setBarHeight(int i10) {
        this.f3365n = i10;
        m2525a();
    }

    public void setMax(int i10) {
        this.f3362k = i10;
        m2525a();
    }

    public void setProgress(int i10) {
        int i11 = this.f3362k;
        if (i10 <= i11) {
            i11 = i10;
            if (i10 < 0) {
                i11 = 0;
            }
        }
        this.f3360i = i11;
        m2525a();
    }

    public void setProgressColor(int i10) {
        this.f3357f.setColor(i10);
    }

    public void setSecondaryProgress(int i10) {
        int i11 = this.f3362k;
        if (i10 <= i11) {
            i11 = i10;
            if (i10 < 0) {
                i11 = 0;
            }
        }
        this.f3361j = i11;
        m2525a();
    }

    public void setSecondaryProgressColor(int i10) {
        this.f3356e.setColor(i10);
    }
}
