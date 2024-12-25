package p369vb;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p106g0.InterfaceC4924j;
import p404xb.C9712g;
import p404xb.C9716k;
import p404xb.InterfaceC9719n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vb/a.class
 */
/* renamed from: vb.a */
/* loaded from: combined.jar:classes2.jar:vb/a.class */
public class C9332a extends Drawable implements InterfaceC9719n, InterfaceC4924j {

    /* renamed from: b */
    public b f42522b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vb/a$b.class
     */
    /* renamed from: vb.a$b */
    /* loaded from: combined.jar:classes2.jar:vb/a$b.class */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        public C9712g f42523a;

        /* renamed from: b */
        public boolean f42524b;

        public b(b bVar) {
            this.f42523a = (C9712g) bVar.f42523a.getConstantState().newDrawable();
            this.f42524b = bVar.f42524b;
        }

        public b(C9712g c9712g) {
            this.f42523a = c9712g;
            this.f42524b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9332a newDrawable() {
            return new C9332a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    public C9332a(b bVar) {
        this.f42522b = bVar;
    }

    public C9332a(C9716k c9716k) {
        this(new b(new C9712g(c9716k)));
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C9332a mutate() {
        this.f42522b = new b(this.f42522b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f42522b;
        if (bVar.f42524b) {
            bVar.f42523a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f42522b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f42522b.f42523a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f42522b.f42523a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f42522b.f42523a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m39331e = C9333b.m39331e(iArr);
        b bVar = this.f42522b;
        if (bVar.f42524b != m39331e) {
            bVar.f42524b = m39331e;
            onStateChange = true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f42522b.f42523a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f42522b.f42523a.setColorFilter(colorFilter);
    }

    @Override // p404xb.InterfaceC9719n
    public void setShapeAppearanceModel(C9716k c9716k) {
        this.f42522b.f42523a.setShapeAppearanceModel(c9716k);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f42522b.f42523a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f42522b.f42523a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f42522b.f42523a.setTintMode(mode);
    }
}
