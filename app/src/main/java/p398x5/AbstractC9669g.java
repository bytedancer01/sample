package p398x5;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import p364v5.C9243a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x5/g.class
 */
/* renamed from: x5.g */
/* loaded from: combined.jar:classes1.jar:x5/g.class */
public abstract class AbstractC9669g extends AbstractC9668f {

    /* renamed from: F */
    public AbstractC9668f[] f44090F = mo40654O();

    /* renamed from: G */
    public int f44091G;

    public AbstractC9669g() {
        m40652M();
        mo40653N(this.f44090F);
    }

    /* renamed from: J */
    public void mo40590J(Canvas canvas) {
        AbstractC9668f[] abstractC9668fArr = this.f44090F;
        if (abstractC9668fArr != null) {
            for (AbstractC9668f abstractC9668f : abstractC9668fArr) {
                int save = canvas.save();
                abstractC9668f.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: K */
    public AbstractC9668f m40650K(int i10) {
        AbstractC9668f[] abstractC9668fArr = this.f44090F;
        return abstractC9668fArr == null ? null : abstractC9668fArr[i10];
    }

    /* renamed from: L */
    public int m40651L() {
        AbstractC9668f[] abstractC9668fArr = this.f44090F;
        return abstractC9668fArr == null ? 0 : abstractC9668fArr.length;
    }

    /* renamed from: M */
    public final void m40652M() {
        AbstractC9668f[] abstractC9668fArr = this.f44090F;
        if (abstractC9668fArr != null) {
            for (AbstractC9668f abstractC9668f : abstractC9668fArr) {
                abstractC9668f.setCallback(this);
            }
        }
    }

    /* renamed from: N */
    public void mo40653N(AbstractC9668f... abstractC9668fArr) {
    }

    /* renamed from: O */
    public abstract AbstractC9668f[] mo40654O();

    @Override // p398x5.AbstractC9668f
    /* renamed from: b */
    public void mo40593b(Canvas canvas) {
    }

    @Override // p398x5.AbstractC9668f
    /* renamed from: c */
    public int mo40594c() {
        return this.f44091G;
    }

    @Override // p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        mo40590J(canvas);
    }

    @Override // p398x5.AbstractC9668f, android.graphics.drawable.Animatable
    public boolean isRunning() {
        return C9243a.m38976b(this.f44090F) || super.isRunning();
    }

    @Override // p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (AbstractC9668f abstractC9668f : this.f44090F) {
            abstractC9668f.setBounds(rect);
        }
    }

    @Override // p398x5.AbstractC9668f
    /* renamed from: r */
    public ValueAnimator mo40620r() {
        return null;
    }

    @Override // p398x5.AbstractC9668f, android.graphics.drawable.Animatable
    public void start() {
        super.start();
        C9243a.m38979e(this.f44090F);
    }

    @Override // p398x5.AbstractC9668f, android.graphics.drawable.Animatable
    public void stop() {
        super.stop();
        C9243a.m38980f(this.f44090F);
    }

    @Override // p398x5.AbstractC9668f
    /* renamed from: u */
    public void mo40595u(int i10) {
        this.f44091G = i10;
        for (int i11 = 0; i11 < m40651L(); i11++) {
            m40650K(i11).mo40595u(i10);
        }
    }
}
