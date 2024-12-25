package p106g0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g0/m.class
 */
/* renamed from: g0.m */
/* loaded from: combined.jar:classes1.jar:g0/m.class */
public class C4927m extends C4926l {

    /* renamed from: i */
    public static Method f28629i;

    public C4927m(Drawable drawable) {
        super(drawable);
        m24867g();
    }

    public C4927m(C4928n c4928n, Resources resources) {
        super(c4928n, resources);
        m24867g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r0 instanceof android.graphics.drawable.RippleDrawable) != false) goto L12;
     */
    @Override // p106g0.C4926l
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo24863c() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 21
            if (r0 != r1) goto L38
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.f28628g
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 != 0) goto L36
            r0 = r7
            boolean r0 = r0 instanceof android.graphics.drawable.DrawableContainer
            if (r0 != 0) goto L36
            r0 = r7
            boolean r0 = r0 instanceof android.graphics.drawable.InsetDrawable
            if (r0 != 0) goto L36
            r0 = r6
            r5 = r0
            r0 = r7
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L38
        L36:
            r0 = 1
            r5 = r0
        L38:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p106g0.C4927m.mo24863c():boolean");
    }

    /* renamed from: g */
    public final void m24867g() {
        if (f28629i == null) {
            try {
                f28629i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f28628g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f28628g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f28628g;
        if (drawable == null || (method = f28629i) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
        } catch (Exception e10) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e10);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f28628g.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f28628g.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p106g0.C4926l, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p106g0.C4926l, android.graphics.drawable.Drawable
    public void setTint(int i10) {
        if (mo24863c()) {
            super.setTint(i10);
        } else {
            this.f28628g.setTint(i10);
        }
    }

    @Override // p106g0.C4926l, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (mo24863c()) {
            super.setTintList(colorStateList);
        } else {
            this.f28628g.setTintList(colorStateList);
        }
    }

    @Override // p106g0.C4926l, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo24863c()) {
            super.setTintMode(mode);
        } else {
            this.f28628g.setTintMode(mode);
        }
    }
}
