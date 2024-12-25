package p404xb;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import lb.C5837a;
import p012ab.C0142b;
import p106g0.InterfaceC4924j;
import p221n0.C6611c;
import p246ob.C6963a;
import p385wb.C9558a;
import p404xb.C9716k;
import p404xb.C9717l;
import p404xb.C9718m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xb/g.class
 */
/* renamed from: xb.g */
/* loaded from: combined.jar:classes2.jar:xb/g.class */
public class C9712g extends Drawable implements InterfaceC4924j, InterfaceC9719n {

    /* renamed from: x */
    public static final String f44254x = C9712g.class.getSimpleName();

    /* renamed from: y */
    public static final Paint f44255y = new Paint(1);

    /* renamed from: b */
    public c f44256b;

    /* renamed from: c */
    public final C9718m.g[] f44257c;

    /* renamed from: d */
    public final C9718m.g[] f44258d;

    /* renamed from: e */
    public final BitSet f44259e;

    /* renamed from: f */
    public boolean f44260f;

    /* renamed from: g */
    public final Matrix f44261g;

    /* renamed from: h */
    public final Path f44262h;

    /* renamed from: i */
    public final Path f44263i;

    /* renamed from: j */
    public final RectF f44264j;

    /* renamed from: k */
    public final RectF f44265k;

    /* renamed from: l */
    public final Region f44266l;

    /* renamed from: m */
    public final Region f44267m;

    /* renamed from: n */
    public C9716k f44268n;

    /* renamed from: o */
    public final Paint f44269o;

    /* renamed from: p */
    public final Paint f44270p;

    /* renamed from: q */
    public final C9558a f44271q;

    /* renamed from: r */
    public final C9717l.b f44272r;

    /* renamed from: s */
    public final C9717l f44273s;

    /* renamed from: t */
    public PorterDuffColorFilter f44274t;

    /* renamed from: u */
    public PorterDuffColorFilter f44275u;

    /* renamed from: v */
    public final RectF f44276v;

    /* renamed from: w */
    public boolean f44277w;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/g$a.class
     */
    /* renamed from: xb.g$a */
    /* loaded from: combined.jar:classes2.jar:xb/g$a.class */
    public class a implements C9717l.b {

        /* renamed from: a */
        public final C9712g f44278a;

        public a(C9712g c9712g) {
            this.f44278a = c9712g;
        }

        @Override // p404xb.C9717l.b
        /* renamed from: a */
        public void mo40872a(C9718m c9718m, Matrix matrix, int i10) {
            this.f44278a.f44259e.set(i10, c9718m.m40956e());
            this.f44278a.f44257c[i10] = c9718m.m40957f(matrix);
        }

        @Override // p404xb.C9717l.b
        /* renamed from: b */
        public void mo40873b(C9718m c9718m, Matrix matrix, int i10) {
            this.f44278a.f44259e.set(i10 + 4, c9718m.m40956e());
            this.f44278a.f44258d[i10] = c9718m.m40957f(matrix);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/g$b.class
     */
    /* renamed from: xb.g$b */
    /* loaded from: combined.jar:classes2.jar:xb/g$b.class */
    public class b implements C9716k.c {

        /* renamed from: a */
        public final float f44279a;

        /* renamed from: b */
        public final C9712g f44280b;

        public b(C9712g c9712g, float f10) {
            this.f44280b = c9712g;
            this.f44279a = f10;
        }

        @Override // p404xb.C9716k.c
        /* renamed from: a */
        public InterfaceC9708c mo40874a(InterfaceC9708c interfaceC9708c) {
            if (!(interfaceC9708c instanceof C9714i)) {
                interfaceC9708c = new C9707b(this.f44279a, interfaceC9708c);
            }
            return interfaceC9708c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xb/g$c.class
     */
    /* renamed from: xb.g$c */
    /* loaded from: combined.jar:classes2.jar:xb/g$c.class */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a */
        public C9716k f44281a;

        /* renamed from: b */
        public C6963a f44282b;

        /* renamed from: c */
        public ColorFilter f44283c;

        /* renamed from: d */
        public ColorStateList f44284d;

        /* renamed from: e */
        public ColorStateList f44285e;

        /* renamed from: f */
        public ColorStateList f44286f;

        /* renamed from: g */
        public ColorStateList f44287g;

        /* renamed from: h */
        public PorterDuff.Mode f44288h;

        /* renamed from: i */
        public Rect f44289i;

        /* renamed from: j */
        public float f44290j;

        /* renamed from: k */
        public float f44291k;

        /* renamed from: l */
        public float f44292l;

        /* renamed from: m */
        public int f44293m;

        /* renamed from: n */
        public float f44294n;

        /* renamed from: o */
        public float f44295o;

        /* renamed from: p */
        public float f44296p;

        /* renamed from: q */
        public int f44297q;

        /* renamed from: r */
        public int f44298r;

        /* renamed from: s */
        public int f44299s;

        /* renamed from: t */
        public int f44300t;

        /* renamed from: u */
        public boolean f44301u;

        /* renamed from: v */
        public Paint.Style f44302v;

        public c(c cVar) {
            this.f44284d = null;
            this.f44285e = null;
            this.f44286f = null;
            this.f44287g = null;
            this.f44288h = PorterDuff.Mode.SRC_IN;
            this.f44289i = null;
            this.f44290j = 1.0f;
            this.f44291k = 1.0f;
            this.f44293m = 255;
            this.f44294n = 0.0f;
            this.f44295o = 0.0f;
            this.f44296p = 0.0f;
            this.f44297q = 0;
            this.f44298r = 0;
            this.f44299s = 0;
            this.f44300t = 0;
            this.f44301u = false;
            this.f44302v = Paint.Style.FILL_AND_STROKE;
            this.f44281a = cVar.f44281a;
            this.f44282b = cVar.f44282b;
            this.f44292l = cVar.f44292l;
            this.f44283c = cVar.f44283c;
            this.f44284d = cVar.f44284d;
            this.f44285e = cVar.f44285e;
            this.f44288h = cVar.f44288h;
            this.f44287g = cVar.f44287g;
            this.f44293m = cVar.f44293m;
            this.f44290j = cVar.f44290j;
            this.f44299s = cVar.f44299s;
            this.f44297q = cVar.f44297q;
            this.f44301u = cVar.f44301u;
            this.f44291k = cVar.f44291k;
            this.f44294n = cVar.f44294n;
            this.f44295o = cVar.f44295o;
            this.f44296p = cVar.f44296p;
            this.f44298r = cVar.f44298r;
            this.f44300t = cVar.f44300t;
            this.f44286f = cVar.f44286f;
            this.f44302v = cVar.f44302v;
            if (cVar.f44289i != null) {
                this.f44289i = new Rect(cVar.f44289i);
            }
        }

        public c(C9716k c9716k, C6963a c6963a) {
            this.f44284d = null;
            this.f44285e = null;
            this.f44286f = null;
            this.f44287g = null;
            this.f44288h = PorterDuff.Mode.SRC_IN;
            this.f44289i = null;
            this.f44290j = 1.0f;
            this.f44291k = 1.0f;
            this.f44293m = 255;
            this.f44294n = 0.0f;
            this.f44295o = 0.0f;
            this.f44296p = 0.0f;
            this.f44297q = 0;
            this.f44298r = 0;
            this.f44299s = 0;
            this.f44300t = 0;
            this.f44301u = false;
            this.f44302v = Paint.Style.FILL_AND_STROKE;
            this.f44281a = c9716k;
            this.f44282b = c6963a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C9712g c9712g = new C9712g(this, null);
            c9712g.f44260f = true;
            return c9712g;
        }
    }

    public C9712g() {
        this(new C9716k());
    }

    public C9712g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C9716k.m40885e(context, attributeSet, i10, i11).m40925m());
    }

    public C9712g(c cVar) {
        this.f44257c = new C9718m.g[4];
        this.f44258d = new C9718m.g[4];
        this.f44259e = new BitSet(8);
        this.f44261g = new Matrix();
        this.f44262h = new Path();
        this.f44263i = new Path();
        this.f44264j = new RectF();
        this.f44265k = new RectF();
        this.f44266l = new Region();
        this.f44267m = new Region();
        Paint paint = new Paint(1);
        this.f44269o = paint;
        Paint paint2 = new Paint(1);
        this.f44270p = paint2;
        this.f44271q = new C9558a();
        this.f44273s = Looper.getMainLooper().getThread() == Thread.currentThread() ? C9717l.m40938k() : new C9717l();
        this.f44276v = new RectF();
        this.f44277w = true;
        this.f44256b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f44255y;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m40852g0();
        m40850f0(getState());
        this.f44272r = new a(this);
    }

    public /* synthetic */ C9712g(c cVar, a aVar) {
        this(cVar);
    }

    public C9712g(C9716k c9716k) {
        this(new c(c9716k, null));
    }

    /* renamed from: R */
    public static int m40813R(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    /* renamed from: m */
    public static C9712g m40818m(Context context, float f10) {
        int m28423b = C5837a.m28423b(context, C0142b.f653m, C9712g.class.getSimpleName());
        C9712g c9712g = new C9712g();
        c9712g.m40831M(context);
        c9712g.m40841X(ColorStateList.valueOf(m28423b));
        c9712g.m40840W(f10);
        return c9712g;
    }

    /* renamed from: A */
    public int m40819A() {
        c cVar = this.f44256b;
        return (int) (cVar.f44299s * Math.cos(Math.toRadians(cVar.f44300t)));
    }

    /* renamed from: B */
    public int m40820B() {
        return this.f44256b.f44298r;
    }

    /* renamed from: C */
    public C9716k m40821C() {
        return this.f44256b.f44281a;
    }

    /* renamed from: D */
    public final float m40822D() {
        if (m40830L()) {
            return this.f44270p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: E */
    public ColorStateList m40823E() {
        return this.f44256b.f44287g;
    }

    /* renamed from: F */
    public float m40824F() {
        return this.f44256b.f44281a.m40898r().mo40809a(m40866u());
    }

    /* renamed from: G */
    public float m40825G() {
        return this.f44256b.f44281a.m40900t().mo40809a(m40866u());
    }

    /* renamed from: H */
    public float m40826H() {
        return this.f44256b.f44296p;
    }

    /* renamed from: I */
    public float m40827I() {
        return m40868w() + m40826H();
    }

    /* renamed from: J */
    public final boolean m40828J() {
        boolean z10;
        c cVar = this.f44256b;
        int i10 = cVar.f44297q;
        if (i10 != 1 && cVar.f44298r > 0) {
            z10 = true;
            if (i10 != 2) {
                if (m40837T()) {
                    z10 = true;
                }
            }
            return z10;
        }
        z10 = false;
        return z10;
    }

    /* renamed from: K */
    public final boolean m40829K() {
        Paint.Style style = this.f44256b.f44302v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: L */
    public final boolean m40830L() {
        Paint.Style style = this.f44256b.f44302v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f44270p.getStrokeWidth() > 0.0f;
    }

    /* renamed from: M */
    public void m40831M(Context context) {
        this.f44256b.f44282b = new C6963a(context);
        m40854h0();
    }

    /* renamed from: N */
    public final void m40832N() {
        super.invalidateSelf();
    }

    /* renamed from: O */
    public boolean m40833O() {
        C6963a c6963a = this.f44256b.f44282b;
        return c6963a != null && c6963a.m31960d();
    }

    /* renamed from: P */
    public boolean m40834P() {
        return this.f44256b.f44281a.m40901u(m40866u());
    }

    /* renamed from: Q */
    public final void m40835Q(Canvas canvas) {
        if (m40828J()) {
            canvas.save();
            m40836S(canvas);
            if (this.f44277w) {
                int width = (int) (this.f44276v.width() - getBounds().width());
                int height = (int) (this.f44276v.height() - getBounds().height());
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f44276v.width()) + (this.f44256b.f44298r * 2) + width, ((int) this.f44276v.height()) + (this.f44256b.f44298r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f10 = (getBounds().left - this.f44256b.f44298r) - width;
                float f11 = (getBounds().top - this.f44256b.f44298r) - height;
                canvas2.translate(-f10, -f11);
                m40859n(canvas2);
                canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
                createBitmap.recycle();
            } else {
                m40859n(canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: S */
    public final void m40836S(Canvas canvas) {
        canvas.translate(m40871z(), m40819A());
    }

    /* renamed from: T */
    public boolean m40837T() {
        return (m40834P() || this.f44262h.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    /* renamed from: U */
    public void m40838U(float f10) {
        setShapeAppearanceModel(this.f44256b.f44281a.m40903w(f10));
    }

    /* renamed from: V */
    public void m40839V(InterfaceC9708c interfaceC9708c) {
        setShapeAppearanceModel(this.f44256b.f44281a.m40904x(interfaceC9708c));
    }

    /* renamed from: W */
    public void m40840W(float f10) {
        c cVar = this.f44256b;
        if (cVar.f44295o != f10) {
            cVar.f44295o = f10;
            m40854h0();
        }
    }

    /* renamed from: X */
    public void m40841X(ColorStateList colorStateList) {
        c cVar = this.f44256b;
        if (cVar.f44284d != colorStateList) {
            cVar.f44284d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void m40842Y(float f10) {
        c cVar = this.f44256b;
        if (cVar.f44291k != f10) {
            cVar.f44291k = f10;
            this.f44260f = true;
            invalidateSelf();
        }
    }

    /* renamed from: Z */
    public void m40843Z(int i10, int i11, int i12, int i13) {
        c cVar = this.f44256b;
        if (cVar.f44289i == null) {
            cVar.f44289i = new Rect();
        }
        this.f44256b.f44289i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void m40844a0(float f10) {
        c cVar = this.f44256b;
        if (cVar.f44294n != f10) {
            cVar.f44294n = f10;
            m40854h0();
        }
    }

    /* renamed from: b0 */
    public void m40845b0(float f10, int i10) {
        m40848e0(f10);
        m40847d0(ColorStateList.valueOf(i10));
    }

    /* renamed from: c0 */
    public void m40846c0(float f10, ColorStateList colorStateList) {
        m40848e0(f10);
        m40847d0(colorStateList);
    }

    /* renamed from: d0 */
    public void m40847d0(ColorStateList colorStateList) {
        c cVar = this.f44256b;
        if (cVar.f44285e != colorStateList) {
            cVar.f44285e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f44269o.setColorFilter(this.f44274t);
        int alpha = this.f44269o.getAlpha();
        this.f44269o.setAlpha(m40813R(alpha, this.f44256b.f44293m));
        this.f44270p.setColorFilter(this.f44275u);
        this.f44270p.setStrokeWidth(this.f44256b.f44292l);
        int alpha2 = this.f44270p.getAlpha();
        this.f44270p.setAlpha(m40813R(alpha2, this.f44256b.f44293m));
        if (this.f44260f) {
            m40855i();
            m40851g(m40866u(), this.f44262h);
            this.f44260f = false;
        }
        m40835Q(canvas);
        if (m40829K()) {
            m40860o(canvas);
        }
        if (m40830L()) {
            m40863r(canvas);
        }
        this.f44269o.setAlpha(alpha);
        this.f44270p.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m40848e0(float f10) {
        this.f44256b.f44292l = f10;
        invalidateSelf();
    }

    /* renamed from: f */
    public final PorterDuffColorFilter m40849f(Paint paint, boolean z10) {
        int color;
        int m40858l;
        if (!z10 || (m40858l = m40858l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(m40858l, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: f0 */
    public final boolean m40850f0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f44256b.f44284d == null || color2 == (colorForState2 = this.f44256b.f44284d.getColorForState(iArr, (color2 = this.f44269o.getColor())))) {
            z10 = false;
        } else {
            this.f44269o.setColor(colorForState2);
            z10 = true;
        }
        if (this.f44256b.f44285e != null && color != (colorForState = this.f44256b.f44285e.getColorForState(iArr, (color = this.f44270p.getColor())))) {
            this.f44270p.setColor(colorForState);
            z10 = true;
        }
        return z10;
    }

    /* renamed from: g */
    public final void m40851g(RectF rectF, Path path) {
        m40853h(rectF, path);
        if (this.f44256b.f44290j != 1.0f) {
            this.f44261g.reset();
            Matrix matrix = this.f44261g;
            float f10 = this.f44256b.f44290j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f44261g);
        }
        path.computeBounds(this.f44276v, true);
    }

    /* renamed from: g0 */
    public final boolean m40852g0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f44274t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f44275u;
        c cVar = this.f44256b;
        this.f44274t = m40857k(cVar.f44287g, cVar.f44288h, this.f44269o, true);
        c cVar2 = this.f44256b;
        this.f44275u = m40857k(cVar2.f44286f, cVar2.f44288h, this.f44270p, false);
        c cVar3 = this.f44256b;
        if (cVar3.f44301u) {
            this.f44271q.m40096d(cVar3.f44287g.getColorForState(getState(), 0));
        }
        boolean z10 = true;
        if (C6611c.m30516a(porterDuffColorFilter, this.f44274t)) {
            z10 = !C6611c.m30516a(porterDuffColorFilter2, this.f44275u);
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f44256b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f44256b.f44297q == 2) {
            return;
        }
        if (m40834P()) {
            outline.setRoundRect(getBounds(), m40824F() * this.f44256b.f44291k);
        } else {
            m40851g(m40866u(), this.f44262h);
            if (this.f44262h.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f44262h);
                } catch (IllegalArgumentException e10) {
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f44256b.f44289i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f44266l.set(getBounds());
        m40851g(m40866u(), this.f44262h);
        this.f44267m.setPath(this.f44262h, this.f44266l);
        this.f44266l.op(this.f44267m, Region.Op.DIFFERENCE);
        return this.f44266l;
    }

    /* renamed from: h */
    public final void m40853h(RectF rectF, Path path) {
        C9717l c9717l = this.f44273s;
        c cVar = this.f44256b;
        c9717l.m40943e(cVar.f44281a, cVar.f44291k, rectF, this.f44272r, path);
    }

    /* renamed from: h0 */
    public final void m40854h0() {
        float m40827I = m40827I();
        this.f44256b.f44298r = (int) Math.ceil(0.75f * m40827I);
        this.f44256b.f44299s = (int) Math.ceil(m40827I * 0.25f);
        m40852g0();
        m40832N();
    }

    /* renamed from: i */
    public final void m40855i() {
        C9716k m40905y = m40821C().m40905y(new b(this, -m40822D()));
        this.f44268n = m40905y;
        this.f44273s.m40942d(m40905y, this.f44256b.f44291k, m40867v(), this.f44263i);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f44260f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f44256b.f44287g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f44256b.f44286f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f44256b.f44285e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f44256b.f44284d) != null && colorStateList4.isStateful())));
    }

    /* renamed from: j */
    public final PorterDuffColorFilter m40856j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        int i10 = colorForState;
        if (z10) {
            i10 = m40858l(colorForState);
        }
        return new PorterDuffColorFilter(i10, mode);
    }

    /* renamed from: k */
    public final PorterDuffColorFilter m40857k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? m40849f(paint, z10) : m40856j(colorStateList, mode, z10);
    }

    /* renamed from: l */
    public int m40858l(int i10) {
        float m40827I = m40827I();
        float m40870y = m40870y();
        C6963a c6963a = this.f44256b.f44282b;
        int i11 = i10;
        if (c6963a != null) {
            i11 = c6963a.m31959c(i10, m40827I + m40870y);
        }
        return i11;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f44256b = new c(this.f44256b);
        return this;
    }

    /* renamed from: n */
    public final void m40859n(Canvas canvas) {
        if (this.f44259e.cardinality() > 0) {
            Log.w(f44254x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f44256b.f44299s != 0) {
            canvas.drawPath(this.f44262h, this.f44271q.m40095c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f44257c[i10].m41000b(this.f44271q, this.f44256b.f44298r, canvas);
            this.f44258d[i10].m41000b(this.f44271q, this.f44256b.f44298r, canvas);
        }
        if (this.f44277w) {
            int m40871z = m40871z();
            int m40819A = m40819A();
            canvas.translate(-m40871z, -m40819A);
            canvas.drawPath(this.f44262h, f44255y);
            canvas.translate(m40871z, m40819A);
        }
    }

    /* renamed from: o */
    public final void m40860o(Canvas canvas) {
        m40862q(canvas, this.f44269o, this.f44262h, this.f44256b.f44281a, m40866u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f44260f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p306rb.C8456h.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = m40850f0(iArr) || m40852g0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* renamed from: p */
    public void m40861p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m40862q(canvas, paint, path, this.f44256b.f44281a, rectF);
    }

    /* renamed from: q */
    public final void m40862q(Canvas canvas, Paint paint, Path path, C9716k c9716k, RectF rectF) {
        if (!c9716k.m40901u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float mo40809a = c9716k.m40900t().mo40809a(rectF) * this.f44256b.f44291k;
            canvas.drawRoundRect(rectF, mo40809a, mo40809a, paint);
        }
    }

    /* renamed from: r */
    public final void m40863r(Canvas canvas) {
        m40862q(canvas, this.f44270p, this.f44263i, this.f44268n, m40867v());
    }

    /* renamed from: s */
    public float m40864s() {
        return this.f44256b.f44281a.m40891j().mo40809a(m40866u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f44256b;
        if (cVar.f44293m != i10) {
            cVar.f44293m = i10;
            m40832N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f44256b.f44283c = colorFilter;
        m40832N();
    }

    @Override // p404xb.InterfaceC9719n
    public void setShapeAppearanceModel(C9716k c9716k) {
        this.f44256b.f44281a = c9716k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f44256b.f44287g = colorStateList;
        m40852g0();
        m40832N();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f44256b;
        if (cVar.f44288h != mode) {
            cVar.f44288h = mode;
            m40852g0();
            m40832N();
        }
    }

    /* renamed from: t */
    public float m40865t() {
        return this.f44256b.f44281a.m40893l().mo40809a(m40866u());
    }

    /* renamed from: u */
    public RectF m40866u() {
        this.f44264j.set(getBounds());
        return this.f44264j;
    }

    /* renamed from: v */
    public final RectF m40867v() {
        this.f44265k.set(m40866u());
        float m40822D = m40822D();
        this.f44265k.inset(m40822D, m40822D);
        return this.f44265k;
    }

    /* renamed from: w */
    public float m40868w() {
        return this.f44256b.f44295o;
    }

    /* renamed from: x */
    public ColorStateList m40869x() {
        return this.f44256b.f44284d;
    }

    /* renamed from: y */
    public float m40870y() {
        return this.f44256b.f44294n;
    }

    /* renamed from: z */
    public int m40871z() {
        c cVar = this.f44256b;
        return (int) (cVar.f44299s * Math.sin(Math.toRadians(cVar.f44300t)));
    }
}
