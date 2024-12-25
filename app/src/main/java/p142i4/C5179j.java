package p142i4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import p160j4.AbstractC5293b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/j.class
 */
/* renamed from: i4.j */
/* loaded from: combined.jar:classes1.jar:i4/j.class */
public class C5179j extends AbstractC5293b {

    /* renamed from: b */
    public final Rect f29565b;

    /* renamed from: c */
    public int f29566c;

    /* renamed from: d */
    public int f29567d;

    /* renamed from: e */
    public boolean f29568e;

    /* renamed from: f */
    public boolean f29569f;

    /* renamed from: g */
    public a f29570g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i4/j$a.class
     */
    /* renamed from: i4.j$a */
    /* loaded from: combined.jar:classes1.jar:i4/j$a.class */
    public static class a extends Drawable.ConstantState {

        /* renamed from: d */
        public static final Paint f29571d = new Paint(6);

        /* renamed from: a */
        public final Bitmap f29572a;

        /* renamed from: b */
        public int f29573b;

        /* renamed from: c */
        public Paint f29574c;

        public a(Bitmap bitmap) {
            this.f29574c = f29571d;
            this.f29572a = bitmap;
        }

        public a(a aVar) {
            this(aVar.f29572a);
            this.f29573b = aVar.f29573b;
        }

        /* renamed from: a */
        public void m25848a() {
            if (f29571d == this.f29574c) {
                this.f29574c = new Paint(6);
            }
        }

        /* renamed from: b */
        public void m25849b(int i10) {
            m25848a();
            this.f29574c.setAlpha(i10);
        }

        /* renamed from: c */
        public void m25850c(ColorFilter colorFilter) {
            m25848a();
            this.f29574c.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C5179j((Resources) null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C5179j(resources, this);
        }
    }

    public C5179j(Resources resources, Bitmap bitmap) {
        this(resources, new a(bitmap));
    }

    public C5179j(Resources resources, a aVar) {
        int i10;
        this.f29565b = new Rect();
        if (aVar == null) {
            throw new NullPointerException("BitmapState must not be null");
        }
        this.f29570g = aVar;
        if (resources != null) {
            int i11 = resources.getDisplayMetrics().densityDpi;
            i10 = i11 == 0 ? 160 : i11;
            aVar.f29573b = i10;
        } else {
            i10 = aVar.f29573b;
        }
        this.f29566c = aVar.f29572a.getScaledWidth(i10);
        this.f29567d = aVar.f29572a.getScaledHeight(i10);
    }

    @Override // p160j4.AbstractC5293b
    /* renamed from: b */
    public boolean mo25845b() {
        return false;
    }

    @Override // p160j4.AbstractC5293b
    /* renamed from: c */
    public void mo25846c(int i10) {
    }

    /* renamed from: d */
    public Bitmap m25847d() {
        return this.f29570g.f29572a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f29568e) {
            Gravity.apply(119, this.f29566c, this.f29567d, getBounds(), this.f29565b);
            this.f29568e = false;
        }
        a aVar = this.f29570g;
        canvas.drawBitmap(aVar.f29572a, (Rect) null, this.f29565b, aVar.f29574c);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f29570g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f29567d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f29566c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f29570g.f29572a;
        return (bitmap == null || bitmap.hasAlpha() || this.f29570g.f29574c.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f29569f && super.mutate() == this) {
            this.f29570g = new a(this.f29570g);
            this.f29569f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f29568e = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f29570g.f29574c.getAlpha() != i10) {
            this.f29570g.m25849b(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29570g.m25850c(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }
}
