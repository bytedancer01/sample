package p286qb;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p087f0.C4738a;
import p404xb.C9716k;
import p404xb.C9717l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qb/a.class
 */
/* renamed from: qb.a */
/* loaded from: combined.jar:classes2.jar:qb/a.class */
public class C7874a extends Drawable {

    /* renamed from: b */
    public final Paint f37944b;

    /* renamed from: h */
    public float f37950h;

    /* renamed from: i */
    public int f37951i;

    /* renamed from: j */
    public int f37952j;

    /* renamed from: k */
    public int f37953k;

    /* renamed from: l */
    public int f37954l;

    /* renamed from: m */
    public int f37955m;

    /* renamed from: o */
    public C9716k f37957o;

    /* renamed from: p */
    public ColorStateList f37958p;

    /* renamed from: a */
    public final C9717l f37943a = C9717l.m40938k();

    /* renamed from: c */
    public final Path f37945c = new Path();

    /* renamed from: d */
    public final Rect f37946d = new Rect();

    /* renamed from: e */
    public final RectF f37947e = new RectF();

    /* renamed from: f */
    public final RectF f37948f = new RectF();

    /* renamed from: g */
    public final b f37949g = new b();

    /* renamed from: n */
    public boolean f37956n = true;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qb/a$b.class
     */
    /* renamed from: qb.a$b */
    /* loaded from: combined.jar:classes2.jar:qb/a$b.class */
    public class b extends Drawable.ConstantState {

        /* renamed from: a */
        public final C7874a f37959a;

        public b(C7874a c7874a) {
            this.f37959a = c7874a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return this.f37959a;
        }
    }

    public C7874a(C9716k c9716k) {
        this.f37957o = c9716k;
        Paint paint = new Paint(1);
        this.f37944b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final Shader m34145a() {
        copyBounds(this.f37946d);
        float height = this.f37950h / r0.height();
        return new LinearGradient(0.0f, r0.top, 0.0f, r0.bottom, new int[]{C4738a.m23970i(this.f37951i, this.f37955m), C4738a.m23970i(this.f37952j, this.f37955m), C4738a.m23970i(C4738a.m23974m(this.f37952j, 0), this.f37955m), C4738a.m23970i(C4738a.m23974m(this.f37954l, 0), this.f37955m), C4738a.m23970i(this.f37954l, this.f37955m), C4738a.m23970i(this.f37953k, this.f37955m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    public RectF m34146b() {
        this.f37948f.set(getBounds());
        return this.f37948f;
    }

    /* renamed from: c */
    public void m34147c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f37955m = colorStateList.getColorForState(getState(), this.f37955m);
        }
        this.f37958p = colorStateList;
        this.f37956n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m34148d(float f10) {
        if (this.f37950h != f10) {
            this.f37950h = f10;
            this.f37944b.setStrokeWidth(f10 * 1.3333f);
            this.f37956n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f37956n) {
            this.f37944b.setShader(m34145a());
            this.f37956n = false;
        }
        float strokeWidth = this.f37944b.getStrokeWidth() / 2.0f;
        copyBounds(this.f37946d);
        this.f37947e.set(this.f37946d);
        float min = Math.min(this.f37957o.m40898r().mo40809a(m34146b()), this.f37947e.width() / 2.0f);
        if (this.f37957o.m40901u(m34146b())) {
            this.f37947e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f37947e, min, min, this.f37944b);
        }
    }

    /* renamed from: e */
    public void m34149e(int i10, int i11, int i12, int i13) {
        this.f37951i = i10;
        this.f37952j = i11;
        this.f37953k = i12;
        this.f37954l = i13;
    }

    /* renamed from: f */
    public void m34150f(C9716k c9716k) {
        this.f37957o = c9716k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f37949g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f37950h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f37957o.m40901u(m34146b())) {
            outline.setRoundRect(getBounds(), this.f37957o.m40898r().mo40809a(m34146b()));
            return;
        }
        copyBounds(this.f37946d);
        this.f37947e.set(this.f37946d);
        this.f37943a.m40942d(this.f37957o, 1.0f, this.f37947e, this.f37945c);
        if (this.f37945c.isConvex()) {
            outline.setConvexPath(this.f37945c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f37957o.m40901u(m34146b())) {
            return true;
        }
        int round = Math.round(this.f37950h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f37958p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f37956n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f37958p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f37955m)) != this.f37955m) {
            this.f37956n = true;
            this.f37955m = colorForState;
        }
        if (this.f37956n) {
            invalidateSelf();
        }
        return this.f37956n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f37944b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37944b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
