package p306rb;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0351s0;
import p012ab.C0152l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/d.class
 */
/* renamed from: rb.d */
/* loaded from: combined.jar:classes2.jar:rb/d.class */
public class C8452d extends C0351s0 {

    /* renamed from: q */
    public Drawable f39509q;

    /* renamed from: r */
    public final Rect f39510r;

    /* renamed from: s */
    public final Rect f39511s;

    /* renamed from: t */
    public int f39512t;

    /* renamed from: u */
    public boolean f39513u;

    /* renamed from: v */
    public boolean f39514v;

    public C8452d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8452d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39510r = new Rect();
        this.f39511s = new Rect();
        this.f39512t = 119;
        this.f39513u = true;
        this.f39514v = false;
        TypedArray m36338h = C8458j.m36338h(context, attributeSet, C0152l.f1012V1, i10, 0, new int[0]);
        this.f39512t = m36338h.getInt(C0152l.f1026X1, this.f39512t);
        Drawable drawable = m36338h.getDrawable(C0152l.f1019W1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f39513u = m36338h.getBoolean(C0152l.f1033Y1, true);
        m36338h.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f39509q;
        if (drawable != null) {
            if (this.f39514v) {
                this.f39514v = false;
                Rect rect = this.f39510r;
                Rect rect2 = this.f39511s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f39513u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f39512t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f39509q;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f39509q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f39509q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f39509q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f39512t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f39509q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.C0351s0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f39514v = z10 | this.f39514v;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f39514v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f39509q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f39509q);
            }
            this.f39509q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f39512t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f39512t != i10) {
            int i11 = i10;
            if ((8388615 & i10) == 0) {
                i11 = i10 | 8388611;
            }
            int i12 = i11;
            if ((i11 & 112) == 0) {
                i12 = i11 | 48;
            }
            this.f39512t = i12;
            if (i12 == 119 && this.f39509q != null) {
                this.f39509q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f39509q;
    }
}
