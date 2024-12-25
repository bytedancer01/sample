package p028bc;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p404xb.C9712g;
import p404xb.C9716k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bc/b.class
 */
/* renamed from: bc.b */
/* loaded from: combined.jar:classes2.jar:bc/b.class */
public class C0883b extends C9712g {

    /* renamed from: A */
    public final RectF f5974A;

    /* renamed from: B */
    public int f5975B;

    /* renamed from: z */
    public final Paint f5976z;

    public C0883b() {
        this(null);
    }

    public C0883b(C9716k c9716k) {
        super(c9716k == null ? new C9716k() : c9716k);
        this.f5976z = new Paint(1);
        m5476p0();
        this.f5974A = new RectF();
    }

    @Override // p404xb.C9712g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m5471k0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f5974A, this.f5976z);
        m5470j0(canvas);
    }

    /* renamed from: i0 */
    public boolean m5469i0() {
        return !this.f5974A.isEmpty();
    }

    /* renamed from: j0 */
    public final void m5470j0(Canvas canvas) {
        if (m5477q0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f5975B);
    }

    /* renamed from: k0 */
    public final void m5471k0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!m5477q0(callback)) {
            m5473m0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    /* renamed from: l0 */
    public void m5472l0() {
        m5474n0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: m0 */
    public final void m5473m0(Canvas canvas) {
        this.f5975B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    /* renamed from: n0 */
    public void m5474n0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f5974A;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    /* renamed from: o0 */
    public void m5475o0(RectF rectF) {
        m5474n0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: p0 */
    public final void m5476p0() {
        this.f5976z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5976z.setColor(-1);
        this.f5976z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: q0 */
    public final boolean m5477q0(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
