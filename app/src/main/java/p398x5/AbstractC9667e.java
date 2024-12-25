package p398x5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x5/e.class
 */
/* renamed from: x5.e */
/* loaded from: combined.jar:classes1.jar:x5/e.class */
public abstract class AbstractC9667e extends AbstractC9668f {

    /* renamed from: F */
    public Paint f44057F;

    /* renamed from: G */
    public int f44058G;

    /* renamed from: H */
    public int f44059H;

    public AbstractC9667e() {
        mo40595u(-1);
        Paint paint = new Paint();
        this.f44057F = paint;
        paint.setAntiAlias(true);
        this.f44057F.setColor(this.f44058G);
    }

    /* renamed from: J */
    public abstract void mo40591J(Canvas canvas, Paint paint);

    /* renamed from: K */
    public final void m40592K() {
        int alpha = getAlpha();
        int i10 = this.f44059H;
        this.f44058G = ((((i10 >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24) | ((i10 << 8) >>> 8);
    }

    @Override // p398x5.AbstractC9668f
    /* renamed from: b */
    public final void mo40593b(Canvas canvas) {
        this.f44057F.setColor(this.f44058G);
        mo40591J(canvas, this.f44057F);
    }

    @Override // p398x5.AbstractC9668f
    /* renamed from: c */
    public int mo40594c() {
        return this.f44059H;
    }

    @Override // p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        super.setAlpha(i10);
        m40592K();
    }

    @Override // p398x5.AbstractC9668f, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f44057F.setColorFilter(colorFilter);
    }

    @Override // p398x5.AbstractC9668f
    /* renamed from: u */
    public void mo40595u(int i10) {
        this.f44059H = i10;
        m40592K();
    }
}
