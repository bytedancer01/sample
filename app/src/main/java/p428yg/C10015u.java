package p428yg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/u.class
 */
/* renamed from: yg.u */
/* loaded from: combined.jar:classes2.jar:yg/u.class */
public final class C10015u extends BitmapDrawable {

    /* renamed from: h */
    public static final Paint f45915h = new Paint();

    /* renamed from: a */
    public final boolean f45916a;

    /* renamed from: b */
    public final float f45917b;

    /* renamed from: c */
    public final C10014t.e f45918c;

    /* renamed from: d */
    public Drawable f45919d;

    /* renamed from: e */
    public long f45920e;

    /* renamed from: f */
    public boolean f45921f;

    /* renamed from: g */
    public int f45922g;

    public C10015u(Context context, Bitmap bitmap, Drawable drawable, C10014t.e eVar, boolean z10, boolean z11) {
        super(context.getResources(), bitmap);
        this.f45922g = 255;
        this.f45916a = z11;
        this.f45917b = context.getResources().getDisplayMetrics().density;
        this.f45918c = eVar;
        if ((eVar == C10014t.e.MEMORY || z10) ? false : true) {
            this.f45919d = drawable;
            this.f45921f = true;
            this.f45920e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: b */
    public static Path m42125b(Point point, int i10) {
        Point point2 = new Point(point.x + i10, point.y);
        Point point3 = new Point(point.x, point.y + i10);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        return path;
    }

    /* renamed from: c */
    public static void m42126c(ImageView imageView, Context context, Bitmap bitmap, C10014t.e eVar, boolean z10, boolean z11) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new C10015u(context, bitmap, drawable, eVar, z10, z11));
    }

    /* renamed from: d */
    public static void m42127d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    /* renamed from: a */
    public final void m42128a(Canvas canvas) {
        Paint paint = f45915h;
        paint.setColor(-1);
        canvas.drawPath(m42125b(new Point(0, 0), (int) (this.f45917b * 16.0f)), paint);
        paint.setColor(this.f45918c.debugColor);
        canvas.drawPath(m42125b(new Point(0, 0), (int) (this.f45917b * 15.0f)), paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r0 = r5
            boolean r0 = r0.f45921f
            if (r0 != 0) goto Lf
        L7:
            r0 = r5
            r1 = r6
            super.draw(r1)
            goto L56
        Lf:
            long r0 = android.os.SystemClock.uptimeMillis()
            r1 = r5
            long r1 = r1.f45920e
            long r0 = r0 - r1
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r7 = r0
            r0 = r7
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2f
            r0 = r5
            r1 = 0
            r0.f45921f = r1
            r0 = r5
            r1 = 0
            r0.f45919d = r1
            goto L7
        L2f:
            r0 = r5
            android.graphics.drawable.Drawable r0 = r0.f45919d
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3d
            r0 = r8
            r1 = r6
            r0.draw(r1)
        L3d:
            r0 = r5
            r1 = r5
            int r1 = r1.f45922g
            float r1 = (float) r1
            r2 = r7
            float r1 = r1 * r2
            int r1 = (int) r1
            super.setAlpha(r1)
            r0 = r5
            r1 = r6
            super.draw(r1)
            r0 = r5
            r1 = r5
            int r1 = r1.f45922g
            super.setAlpha(r1)
        L56:
            r0 = r5
            boolean r0 = r0.f45916a
            if (r0 == 0) goto L62
            r0 = r5
            r1 = r6
            r0.m42128a(r1)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p428yg.C10015u.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f45919d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f45922g = i10;
        Drawable drawable = this.f45919d;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        super.setAlpha(i10);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f45919d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
