package p106g0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g0/n.class
 */
/* renamed from: g0.n */
/* loaded from: combined.jar:classes1.jar:g0/n.class */
public final class C4928n extends Drawable.ConstantState {

    /* renamed from: a */
    public int f28630a;

    /* renamed from: b */
    public Drawable.ConstantState f28631b;

    /* renamed from: c */
    public ColorStateList f28632c;

    /* renamed from: d */
    public PorterDuff.Mode f28633d;

    public C4928n(C4928n c4928n) {
        this.f28632c = null;
        this.f28633d = C4926l.f28622h;
        if (c4928n != null) {
            this.f28630a = c4928n.f28630a;
            this.f28631b = c4928n.f28631b;
            this.f28632c = c4928n.f28632c;
            this.f28633d = c4928n.f28633d;
        }
    }

    /* renamed from: a */
    public boolean m24868a() {
        return this.f28631b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f28630a;
        Drawable.ConstantState constantState = this.f28631b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C4927m(this, resources);
    }
}
