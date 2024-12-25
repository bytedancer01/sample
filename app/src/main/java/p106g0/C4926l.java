package p106g0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g0/l.class
 */
/* renamed from: g0.l */
/* loaded from: combined.jar:classes1.jar:g0/l.class */
public class C4926l extends Drawable implements Drawable.Callback, InterfaceC4925k, InterfaceC4924j {

    /* renamed from: h */
    public static final PorterDuff.Mode f28622h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f28623b;

    /* renamed from: c */
    public PorterDuff.Mode f28624c;

    /* renamed from: d */
    public boolean f28625d;

    /* renamed from: e */
    public C4928n f28626e;

    /* renamed from: f */
    public boolean f28627f;

    /* renamed from: g */
    public Drawable f28628g;

    public C4926l(Drawable drawable) {
        this.f28626e = m24864d();
        mo24862b(drawable);
    }

    public C4926l(C4928n c4928n, Resources resources) {
        this.f28626e = c4928n;
        m24865e(resources);
    }

    @Override // p106g0.InterfaceC4925k
    /* renamed from: a */
    public final Drawable mo24861a() {
        return this.f28628g;
    }

    @Override // p106g0.InterfaceC4925k
    /* renamed from: b */
    public final void mo24862b(Drawable drawable) {
        Drawable drawable2 = this.f28628g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f28628g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C4928n c4928n = this.f28626e;
            if (c4928n != null) {
                c4928n.f28631b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public boolean mo24863c() {
        throw null;
    }

    /* renamed from: d */
    public final C4928n m24864d() {
        return new C4928n(this.f28626e);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f28628g.draw(canvas);
    }

    /* renamed from: e */
    public final void m24865e(Resources resources) {
        Drawable.ConstantState constantState;
        C4928n c4928n = this.f28626e;
        if (c4928n == null || (constantState = c4928n.f28631b) == null) {
            return;
        }
        mo24862b(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    public final boolean m24866f(int[] iArr) {
        if (!mo24863c()) {
            return false;
        }
        C4928n c4928n = this.f28626e;
        ColorStateList colorStateList = c4928n.f28632c;
        PorterDuff.Mode mode = c4928n.f28633d;
        if (colorStateList == null || mode == null) {
            this.f28625d = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f28625d && colorForState == this.f28623b && mode == this.f28624c) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f28623b = colorForState;
        this.f28624c = mode;
        this.f28625d = true;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C4928n c4928n = this.f28626e;
        return changingConfigurations | (c4928n != null ? c4928n.getChangingConfigurations() : 0) | this.f28628g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C4928n c4928n = this.f28626e;
        if (c4928n == null || !c4928n.m24868a()) {
            return null;
        }
        this.f28626e.f28630a = getChangingConfigurations();
        return this.f28626e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f28628g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f28628g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f28628g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C4917c.m24842f(this.f28628g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f28628g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f28628g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f28628g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f28628g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f28628g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f28628g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C4917c.m24844h(this.f28628g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C4928n c4928n;
        ColorStateList colorStateList = (!mo24863c() || (c4928n = this.f28626e) == null) ? null : c4928n.f28632c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f28628g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f28628g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f28627f && super.mutate() == this) {
            this.f28626e = m24864d();
            Drawable drawable = this.f28628g;
            if (drawable != null) {
                drawable.mutate();
            }
            C4928n c4928n = this.f28626e;
            if (c4928n != null) {
                Drawable drawable2 = this.f28628g;
                c4928n.f28631b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f28627f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f28628g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return C4917c.m24849m(this.f28628g, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        return this.f28628g.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f28628g.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        C4917c.m24846j(this.f28628g, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f28628g.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f28628g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f28628g.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f28628g.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m24866f(iArr) || this.f28628g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f28626e.f28632c = colorStateList;
        m24866f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f28626e.f28633d = mode;
        m24866f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f28628g.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
