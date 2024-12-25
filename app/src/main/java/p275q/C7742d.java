package p275q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q/d.class
 */
/* renamed from: q.d */
/* loaded from: combined.jar:classes1.jar:q/d.class */
public class C7742d extends Drawable {

    /* renamed from: a */
    public float f37547a;

    /* renamed from: c */
    public final RectF f37549c;

    /* renamed from: d */
    public final Rect f37550d;

    /* renamed from: e */
    public float f37551e;

    /* renamed from: h */
    public ColorStateList f37554h;

    /* renamed from: i */
    public PorterDuffColorFilter f37555i;

    /* renamed from: j */
    public ColorStateList f37556j;

    /* renamed from: f */
    public boolean f37552f = false;

    /* renamed from: g */
    public boolean f37553g = true;

    /* renamed from: k */
    public PorterDuff.Mode f37557k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f37548b = new Paint(5);

    public C7742d(ColorStateList colorStateList, float f10) {
        this.f37547a = f10;
        m33830e(colorStateList);
        this.f37549c = new RectF();
        this.f37550d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m33826a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public ColorStateList m33827b() {
        return this.f37554h;
    }

    /* renamed from: c */
    public float m33828c() {
        return this.f37551e;
    }

    /* renamed from: d */
    public float m33829d() {
        return this.f37547a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f37548b;
        if (this.f37555i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f37555i);
            z10 = true;
        }
        RectF rectF = this.f37549c;
        float f10 = this.f37547a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: e */
    public final void m33830e(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        this.f37554h = colorStateList2;
        this.f37548b.setColor(colorStateList2.getColorForState(getState(), this.f37554h.getDefaultColor()));
    }

    /* renamed from: f */
    public void m33831f(ColorStateList colorStateList) {
        m33830e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m33832g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f37551e && this.f37552f == z10 && this.f37553g == z11) {
            return;
        }
        this.f37551e = f10;
        this.f37552f = z10;
        this.f37553g = z11;
        m33834i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f37550d, this.f37547a);
    }

    /* renamed from: h */
    public void m33833h(float f10) {
        if (f10 == this.f37547a) {
            return;
        }
        this.f37547a = f10;
        m33834i(null);
        invalidateSelf();
    }

    /* renamed from: i */
    public final void m33834i(Rect rect) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = getBounds();
        }
        this.f37549c.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f37550d.set(rect2);
        if (this.f37552f) {
            this.f37550d.inset((int) Math.ceil(C7743e.m33835a(this.f37551e, this.f37547a, this.f37553g)), (int) Math.ceil(C7743e.m33836b(this.f37551e, this.f37547a, this.f37553g)));
            this.f37549c.set(this.f37550d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f37556j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f37554h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m33834i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f37554h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f37548b.getColor();
        if (z10) {
            this.f37548b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f37556j;
        if (colorStateList2 == null || (mode = this.f37557k) == null) {
            return z10;
        }
        this.f37555i = m33826a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f37548b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37548b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f37556j = colorStateList;
        this.f37555i = m33826a(colorStateList, this.f37557k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f37557k = mode;
        this.f37555i = m33826a(this.f37556j, mode);
        invalidateSelf();
    }
}
