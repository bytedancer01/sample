package ch;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ch/a.class
 */
/* renamed from: ch.a */
/* loaded from: combined.jar:classes2.jar:ch/a.class */
public abstract class AbstractC1112a extends Drawable implements Animatable {

    /* renamed from: h */
    public static final Rect f7439h = new Rect();

    /* renamed from: c */
    public ArrayList<ValueAnimator> f7441c;

    /* renamed from: f */
    public boolean f7444f;

    /* renamed from: g */
    public Paint f7445g;

    /* renamed from: b */
    public HashMap<ValueAnimator, ValueAnimator.AnimatorUpdateListener> f7440b = new HashMap<>();

    /* renamed from: d */
    public int f7442d = 255;

    /* renamed from: e */
    public Rect f7443e = f7439h;

    public AbstractC1112a() {
        Paint paint = new Paint();
        this.f7445g = paint;
        paint.setColor(-1);
        this.f7445g.setStyle(Paint.Style.FILL);
        this.f7445g.setAntiAlias(true);
    }

    /* renamed from: a */
    public void m6678a(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f7440b.put(valueAnimator, animatorUpdateListener);
    }

    /* renamed from: b */
    public abstract void mo6679b(Canvas canvas, Paint paint);

    /* renamed from: c */
    public final void m6680c() {
        if (this.f7444f) {
            return;
        }
        this.f7441c = mo6684g();
        this.f7444f = true;
    }

    /* renamed from: d */
    public int m6681d() {
        return this.f7443e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        mo6679b(canvas, this.f7445g);
    }

    /* renamed from: e */
    public int m6682e() {
        return this.f7443e.width();
    }

    /* renamed from: f */
    public final boolean m6683f() {
        Iterator<ValueAnimator> it = this.f7441c.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    /* renamed from: g */
    public abstract ArrayList<ValueAnimator> mo6684g();

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7442d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    /* renamed from: h */
    public void m6685h() {
        invalidateSelf();
    }

    /* renamed from: i */
    public void m6686i(int i10) {
        this.f7445g.setColor(i10);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Iterator<ValueAnimator> it = this.f7441c.iterator();
        if (it.hasNext()) {
            return it.next().isRunning();
        }
        return false;
    }

    /* renamed from: j */
    public void m6687j(int i10, int i11, int i12, int i13) {
        this.f7443e = new Rect(i10, i11, i12, i13);
    }

    /* renamed from: k */
    public void m6688k(Rect rect) {
        m6687j(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: l */
    public final void m6689l() {
        for (int i10 = 0; i10 < this.f7441c.size(); i10++) {
            ValueAnimator valueAnimator = this.f7441c.get(i10);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f7440b.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    /* renamed from: m */
    public final void m6690m() {
        ArrayList<ValueAnimator> arrayList = this.f7441c;
        if (arrayList != null) {
            Iterator<ValueAnimator> it = arrayList.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                if (next != null && next.isStarted()) {
                    next.removeAllUpdateListeners();
                    next.end();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m6688k(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f7442d = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        m6680c();
        if (this.f7441c == null || m6683f()) {
            return;
        }
        m6689l();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m6690m();
    }
}
