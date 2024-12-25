package p440z8;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p059d9.C4349a;
import p059d9.C4401z0;
import p243o8.C6919a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z8/v0.class
 */
/* renamed from: z8.v0 */
/* loaded from: combined.jar:classes2.jar:z8/v0.class */
public final class C10116v0 {

    /* renamed from: A */
    public int f46440A;

    /* renamed from: B */
    public int f46441B;

    /* renamed from: C */
    public int f46442C;

    /* renamed from: D */
    public int f46443D;

    /* renamed from: E */
    public StaticLayout f46444E;

    /* renamed from: F */
    public StaticLayout f46445F;

    /* renamed from: G */
    public int f46446G;

    /* renamed from: H */
    public int f46447H;

    /* renamed from: I */
    public int f46448I;

    /* renamed from: J */
    public Rect f46449J;

    /* renamed from: a */
    public final float f46450a;

    /* renamed from: b */
    public final float f46451b;

    /* renamed from: c */
    public final float f46452c;

    /* renamed from: d */
    public final float f46453d;

    /* renamed from: e */
    public final float f46454e;

    /* renamed from: f */
    public final TextPaint f46455f;

    /* renamed from: g */
    public final Paint f46456g;

    /* renamed from: h */
    public final Paint f46457h;

    /* renamed from: i */
    public CharSequence f46458i;

    /* renamed from: j */
    public Layout.Alignment f46459j;

    /* renamed from: k */
    public Bitmap f46460k;

    /* renamed from: l */
    public float f46461l;

    /* renamed from: m */
    public int f46462m;

    /* renamed from: n */
    public int f46463n;

    /* renamed from: o */
    public float f46464o;

    /* renamed from: p */
    public int f46465p;

    /* renamed from: q */
    public float f46466q;

    /* renamed from: r */
    public float f46467r;

    /* renamed from: s */
    public int f46468s;

    /* renamed from: t */
    public int f46469t;

    /* renamed from: u */
    public int f46470u;

    /* renamed from: v */
    public int f46471v;

    /* renamed from: w */
    public int f46472w;

    /* renamed from: x */
    public float f46473x;

    /* renamed from: y */
    public float f46474y;

    /* renamed from: z */
    public float f46475z;

    public C10116v0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f46454e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f46453d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f46450a = round;
        this.f46451b = round;
        this.f46452c = round;
        TextPaint textPaint = new TextPaint();
        this.f46455f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f46456g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f46457h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    public static boolean m42473a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* renamed from: b */
    public void m42474b(C6919a c6919a, C10077c c10077c, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z10 = c6919a.f35799d == null;
        int i14 = -16777216;
        if (z10) {
            if (TextUtils.isEmpty(c6919a.f35796a)) {
                return;
            } else {
                i14 = c6919a.f35807l ? c6919a.f35808m : c10077c.f46247c;
            }
        }
        if (m42473a(this.f46458i, c6919a.f35796a) && C4401z0.m22371c(this.f46459j, c6919a.f35797b) && this.f46460k == c6919a.f35799d && this.f46461l == c6919a.f35800e && this.f46462m == c6919a.f35801f && C4401z0.m22371c(Integer.valueOf(this.f46463n), Integer.valueOf(c6919a.f35802g)) && this.f46464o == c6919a.f35803h && C4401z0.m22371c(Integer.valueOf(this.f46465p), Integer.valueOf(c6919a.f35804i)) && this.f46466q == c6919a.f35805j && this.f46467r == c6919a.f35806k && this.f46468s == c10077c.f46245a && this.f46469t == c10077c.f46246b && this.f46470u == i14 && this.f46472w == c10077c.f46248d && this.f46471v == c10077c.f46249e && C4401z0.m22371c(this.f46455f.getTypeface(), c10077c.f46250f) && this.f46473x == f10 && this.f46474y == f11 && this.f46475z == f12 && this.f46440A == i10 && this.f46441B == i11 && this.f46442C == i12 && this.f46443D == i13) {
            m42476d(canvas, z10);
            return;
        }
        this.f46458i = c6919a.f35796a;
        this.f46459j = c6919a.f35797b;
        this.f46460k = c6919a.f35799d;
        this.f46461l = c6919a.f35800e;
        this.f46462m = c6919a.f35801f;
        this.f46463n = c6919a.f35802g;
        this.f46464o = c6919a.f35803h;
        this.f46465p = c6919a.f35804i;
        this.f46466q = c6919a.f35805j;
        this.f46467r = c6919a.f35806k;
        this.f46468s = c10077c.f46245a;
        this.f46469t = c10077c.f46246b;
        this.f46470u = i14;
        this.f46472w = c10077c.f46248d;
        this.f46471v = c10077c.f46249e;
        this.f46455f.setTypeface(c10077c.f46250f);
        this.f46473x = f10;
        this.f46474y = f11;
        this.f46475z = f12;
        this.f46440A = i10;
        this.f46441B = i11;
        this.f46442C = i12;
        this.f46443D = i13;
        if (z10) {
            C4349a.m21882e(this.f46458i);
            m42479g();
        } else {
            C4349a.m21882e(this.f46460k);
            m42478f();
        }
        m42476d(canvas, z10);
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    /* renamed from: c */
    public final void m42475c(Canvas canvas) {
        canvas.drawBitmap(this.f46460k, (Rect) null, this.f46449J, this.f46457h);
    }

    /* renamed from: d */
    public final void m42476d(Canvas canvas, boolean z10) {
        if (z10) {
            m42477e(canvas);
            return;
        }
        C4349a.m21882e(this.f46449J);
        C4349a.m21882e(this.f46460k);
        m42475c(canvas);
    }

    /* renamed from: e */
    public final void m42477e(Canvas canvas) {
        StaticLayout staticLayout = this.f46444E;
        StaticLayout staticLayout2 = this.f46445F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f46446G, this.f46447H);
        if (Color.alpha(this.f46470u) > 0) {
            this.f46456g.setColor(this.f46470u);
            canvas.drawRect(-this.f46448I, 0.0f, staticLayout.getWidth() + this.f46448I, staticLayout.getHeight(), this.f46456g);
        }
        int i10 = this.f46472w;
        boolean z10 = true;
        if (i10 == 1) {
            this.f46455f.setStrokeJoin(Paint.Join.ROUND);
            this.f46455f.setStrokeWidth(this.f46450a);
            this.f46455f.setColor(this.f46471v);
            this.f46455f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f46455f;
            float f10 = this.f46451b;
            float f11 = this.f46452c;
            textPaint.setShadowLayer(f10, f11, f11, this.f46471v);
        } else if (i10 == 3 || i10 == 4) {
            if (i10 != 3) {
                z10 = false;
            }
            int i11 = -1;
            int i12 = z10 ? -1 : this.f46471v;
            if (z10) {
                i11 = this.f46471v;
            }
            float f12 = this.f46451b / 2.0f;
            this.f46455f.setColor(this.f46468s);
            this.f46455f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f46455f.setShadowLayer(this.f46451b, f13, f13, i12);
            staticLayout2.draw(canvas);
            this.f46455f.setShadowLayer(this.f46451b, f12, f12, i11);
        }
        this.f46455f.setColor(this.f46468s);
        this.f46455f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f46455f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m42478f() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p440z8.C10116v0.m42478f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02dd  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m42479g() {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p440z8.C10116v0.m42479g():void");
    }
}
