package p330t4;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p160j4.AbstractC5293b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t4/i.class
 */
/* renamed from: t4.i */
/* loaded from: combined.jar:classes1.jar:t4/i.class */
public class C8629i extends AbstractC5293b {

    /* renamed from: b */
    public AbstractC5293b f40284b;

    /* renamed from: c */
    public a f40285c;

    /* renamed from: d */
    public boolean f40286d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t4/i$a.class
     */
    /* renamed from: t4.i$a */
    /* loaded from: combined.jar:classes1.jar:t4/i$a.class */
    public static class a extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f40287a;

        /* renamed from: b */
        public final int f40288b;

        public a(Drawable.ConstantState constantState, int i10) {
            this.f40287a = constantState;
            this.f40288b = i10;
        }

        public a(a aVar) {
            this(aVar.f40287a, aVar.f40288b);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C8629i(this, null, resources);
        }
    }

    public C8629i(AbstractC5293b abstractC5293b, int i10) {
        this(new a(abstractC5293b.getConstantState(), i10), abstractC5293b, null);
    }

    public C8629i(a aVar, AbstractC5293b abstractC5293b, Resources resources) {
        this.f40285c = aVar;
        if (abstractC5293b != null) {
            this.f40284b = abstractC5293b;
        } else {
            Drawable.ConstantState constantState = aVar.f40287a;
            this.f40284b = (AbstractC5293b) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
    }

    @Override // p160j4.AbstractC5293b
    /* renamed from: b */
    public boolean mo25845b() {
        return this.f40284b.mo25845b();
    }

    @Override // p160j4.AbstractC5293b
    /* renamed from: c */
    public void mo25846c(int i10) {
        this.f40284b.mo25846c(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f40284b.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f40284b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(19)
    public int getAlpha() {
        return this.f40284b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(11)
    public Drawable.Callback getCallback() {
        return this.f40284b.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f40284b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f40285c;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f40284b.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f40285c.f40288b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f40285c.f40288b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f40284b.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f40284b.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f40284b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f40284b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f40284b.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f40284b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f40286d && super.mutate() == this) {
            this.f40284b = (AbstractC5293b) this.f40284b.mutate();
            this.f40285c = new a(this.f40285c);
            this.f40286d = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        super.scheduleSelf(runnable, j10);
        this.f40284b.scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f40284b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f40284b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f40284b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f40284b.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        this.f40284b.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f40284b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f40284b.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f40284b.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return this.f40284b.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f40284b.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f40284b.stop();
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f40284b.unscheduleSelf(runnable);
    }
}
