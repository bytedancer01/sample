package p020b2;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p106g0.C4917c;
import p106g0.InterfaceC4924j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b2/f.class
 */
/* renamed from: b2.f */
/* loaded from: combined.jar:classes1.jar:b2/f.class */
public abstract class AbstractC0787f extends Drawable implements InterfaceC4924j {

    /* renamed from: b */
    public Drawable f5450b;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24837a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24845i(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.setLevel(i10) : super.onLevelChange(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i10);
        } else {
            super.setChangingConfigurations(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.setColorFilter(i10, mode);
        } else {
            super.setColorFilter(i10, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24847k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Drawable drawable = this.f5450b;
        if (drawable != null) {
            C4917c.m24848l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f5450b;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
