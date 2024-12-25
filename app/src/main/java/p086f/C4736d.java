package p086f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import p029c.C0920a;
import p029c.C0928i;
import p029c.C0929j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f/d.class
 */
/* renamed from: f.d */
/* loaded from: combined.jar:classes1.jar:f/d.class */
public class C4736d extends Drawable {

    /* renamed from: m */
    public static final float f27949m = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    public final Paint f27950a;

    /* renamed from: b */
    public float f27951b;

    /* renamed from: c */
    public float f27952c;

    /* renamed from: d */
    public float f27953d;

    /* renamed from: e */
    public float f27954e;

    /* renamed from: f */
    public boolean f27955f;

    /* renamed from: g */
    public final Path f27956g;

    /* renamed from: h */
    public final int f27957h;

    /* renamed from: i */
    public boolean f27958i;

    /* renamed from: j */
    public float f27959j;

    /* renamed from: k */
    public float f27960k;

    /* renamed from: l */
    public int f27961l;

    public C4736d(Context context) {
        Paint paint = new Paint();
        this.f27950a = paint;
        this.f27956g = new Path();
        this.f27958i = false;
        this.f27961l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0929j.f6393W0, C0920a.f6087B, C0928i.f6278b);
        m23956d(obtainStyledAttributes.getColor(C0929j.f6414a1, 0));
        m23955c(obtainStyledAttributes.getDimension(C0929j.f6438e1, 0.0f));
        m23958f(obtainStyledAttributes.getBoolean(C0929j.f6432d1, true));
        m23957e(Math.round(obtainStyledAttributes.getDimension(C0929j.f6426c1, 0.0f)));
        this.f27957h = obtainStyledAttributes.getDimensionPixelSize(C0929j.f6420b1, 0);
        this.f27952c = Math.round(obtainStyledAttributes.getDimension(C0929j.f6408Z0, 0.0f));
        this.f27951b = Math.round(obtainStyledAttributes.getDimension(C0929j.f6398X0, 0.0f));
        this.f27953d = obtainStyledAttributes.getDimension(C0929j.f6403Y0, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static float m23953b(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* renamed from: a */
    public float m23954a() {
        return this.f27959j;
    }

    /* renamed from: c */
    public void m23955c(float f10) {
        if (this.f27950a.getStrokeWidth() != f10) {
            this.f27950a.setStrokeWidth(f10);
            this.f27960k = (float) ((f10 / 2.0f) * Math.cos(f27949m));
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void m23956d(int i10) {
        if (i10 != this.f27950a.getColor()) {
            this.f27950a.setColor(i10);
            invalidateSelf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (p106g0.C4917c.m24842f(r6) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (p106g0.C4917c.m24842f(r6) == 1) goto L13;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r7) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.C4736d.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public void m23957e(float f10) {
        if (f10 != this.f27954e) {
            this.f27954e = f10;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void m23958f(boolean z10) {
        if (this.f27955f != z10) {
            this.f27955f = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f27957h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f27957h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f27950a.getAlpha()) {
            this.f27950a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27950a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f27959j != f10) {
            this.f27959j = f10;
            invalidateSelf();
        }
    }
}
