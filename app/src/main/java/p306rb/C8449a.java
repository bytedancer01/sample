package p306rb;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import bb.C0871a;
import p138i0.C5146a;
import p207m0.C5890f;
import p221n0.C6616h;
import p235o0.C6824g0;
import p306rb.C8455g;
import p351ub.C9146a;
import p351ub.C9149d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/a.class
 */
/* renamed from: rb.a */
/* loaded from: combined.jar:classes2.jar:rb/a.class */
public final class C8449a {

    /* renamed from: b0 */
    public static final boolean f39447b0 = false;

    /* renamed from: c0 */
    public static final Paint f39448c0 = null;

    /* renamed from: A */
    public boolean f39449A;

    /* renamed from: B */
    public Bitmap f39450B;

    /* renamed from: C */
    public Paint f39451C;

    /* renamed from: D */
    public float f39452D;

    /* renamed from: E */
    public float f39453E;

    /* renamed from: F */
    public int[] f39454F;

    /* renamed from: G */
    public boolean f39455G;

    /* renamed from: H */
    public final TextPaint f39456H;

    /* renamed from: I */
    public final TextPaint f39457I;

    /* renamed from: J */
    public TimeInterpolator f39458J;

    /* renamed from: K */
    public TimeInterpolator f39459K;

    /* renamed from: L */
    public float f39460L;

    /* renamed from: M */
    public float f39461M;

    /* renamed from: N */
    public float f39462N;

    /* renamed from: O */
    public ColorStateList f39463O;

    /* renamed from: P */
    public float f39464P;

    /* renamed from: Q */
    public float f39465Q;

    /* renamed from: R */
    public float f39466R;

    /* renamed from: S */
    public ColorStateList f39467S;

    /* renamed from: T */
    public float f39468T;

    /* renamed from: U */
    public float f39469U;

    /* renamed from: V */
    public StaticLayout f39470V;

    /* renamed from: W */
    public float f39471W;

    /* renamed from: X */
    public float f39472X;

    /* renamed from: Y */
    public float f39473Y;

    /* renamed from: Z */
    public CharSequence f39474Z;

    /* renamed from: a */
    public final View f39475a;

    /* renamed from: b */
    public boolean f39477b;

    /* renamed from: c */
    public float f39478c;

    /* renamed from: d */
    public final Rect f39479d;

    /* renamed from: e */
    public final Rect f39480e;

    /* renamed from: f */
    public final RectF f39481f;

    /* renamed from: k */
    public ColorStateList f39486k;

    /* renamed from: l */
    public ColorStateList f39487l;

    /* renamed from: m */
    public float f39488m;

    /* renamed from: n */
    public float f39489n;

    /* renamed from: o */
    public float f39490o;

    /* renamed from: p */
    public float f39491p;

    /* renamed from: q */
    public float f39492q;

    /* renamed from: r */
    public float f39493r;

    /* renamed from: s */
    public Typeface f39494s;

    /* renamed from: t */
    public Typeface f39495t;

    /* renamed from: u */
    public Typeface f39496u;

    /* renamed from: v */
    public C9146a f39497v;

    /* renamed from: w */
    public C9146a f39498w;

    /* renamed from: x */
    public CharSequence f39499x;

    /* renamed from: y */
    public CharSequence f39500y;

    /* renamed from: z */
    public boolean f39501z;

    /* renamed from: g */
    public int f39482g = 16;

    /* renamed from: h */
    public int f39483h = 16;

    /* renamed from: i */
    public float f39484i = 15.0f;

    /* renamed from: j */
    public float f39485j = 15.0f;

    /* renamed from: a0 */
    public int f39476a0 = 1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/a$a.class
     */
    /* renamed from: rb.a$a */
    /* loaded from: combined.jar:classes2.jar:rb/a$a.class */
    public class a implements C9146a.a {

        /* renamed from: a */
        public final C8449a f39502a;

        public a(C8449a c8449a) {
            this.f39502a = c8449a;
        }

        @Override // p351ub.C9146a.a
        /* renamed from: a */
        public void mo36304a(Typeface typeface) {
            this.f39502a.m36263M(typeface);
        }
    }

    public C8449a(View view) {
        this.f39475a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f39456H = textPaint;
        this.f39457I = new TextPaint(textPaint);
        this.f39480e = new Rect();
        this.f39479d = new Rect();
        this.f39481f = new RectF();
    }

    /* renamed from: C */
    public static float m36249C(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        float f13 = f12;
        if (timeInterpolator != null) {
            f13 = timeInterpolator.getInterpolation(f12);
        }
        return C0871a.m5437a(f10, f11, f13);
    }

    /* renamed from: F */
    public static boolean m36250F(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    /* renamed from: a */
    public static int m36251a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    /* renamed from: z */
    public static boolean m36252z(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.001f;
    }

    /* renamed from: A */
    public final boolean m36253A() {
        boolean z10 = true;
        if (C6824g0.m31473C(this.f39475a) != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: B */
    public final boolean m36254B() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f39487l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f39486k) != null && colorStateList.isStateful());
    }

    /* renamed from: D */
    public void m36255D() {
        this.f39477b = this.f39480e.width() > 0 && this.f39480e.height() > 0 && this.f39479d.width() > 0 && this.f39479d.height() > 0;
    }

    /* renamed from: E */
    public void m36256E() {
        if (this.f39475a.getHeight() <= 0 || this.f39475a.getWidth() <= 0) {
            return;
        }
        m36278b();
        m36282d();
    }

    /* renamed from: G */
    public void m36257G(int i10, int i11, int i12, int i13) {
        if (m36250F(this.f39480e, i10, i11, i12, i13)) {
            return;
        }
        this.f39480e.set(i10, i11, i12, i13);
        this.f39455G = true;
        m36255D();
    }

    /* renamed from: H */
    public void m36258H(Rect rect) {
        m36257G(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: I */
    public void m36259I(int i10) {
        C9149d c9149d = new C9149d(this.f39475a.getContext(), i10);
        ColorStateList colorStateList = c9149d.f41837a;
        if (colorStateList != null) {
            this.f39487l = colorStateList;
        }
        float f10 = c9149d.f41850n;
        if (f10 != 0.0f) {
            this.f39485j = f10;
        }
        ColorStateList colorStateList2 = c9149d.f41840d;
        if (colorStateList2 != null) {
            this.f39463O = colorStateList2;
        }
        this.f39461M = c9149d.f41845i;
        this.f39462N = c9149d.f41846j;
        this.f39460L = c9149d.f41847k;
        this.f39468T = c9149d.f41849m;
        C9146a c9146a = this.f39498w;
        if (c9146a != null) {
            c9146a.m38470c();
        }
        this.f39498w = new C9146a(new a(this), c9149d.m38488e());
        c9149d.m38491h(this.f39475a.getContext(), this.f39498w);
        m36256E();
    }

    /* renamed from: J */
    public final void m36260J(float f10) {
        this.f39471W = f10;
        C6824g0.m31521g0(this.f39475a);
    }

    /* renamed from: K */
    public void m36261K(ColorStateList colorStateList) {
        if (this.f39487l != colorStateList) {
            this.f39487l = colorStateList;
            m36256E();
        }
    }

    /* renamed from: L */
    public void m36262L(int i10) {
        if (this.f39483h != i10) {
            this.f39483h = i10;
            m36256E();
        }
    }

    /* renamed from: M */
    public void m36263M(Typeface typeface) {
        if (m36264N(typeface)) {
            m36256E();
        }
    }

    /* renamed from: N */
    public final boolean m36264N(Typeface typeface) {
        C9146a c9146a = this.f39498w;
        if (c9146a != null) {
            c9146a.m38470c();
        }
        if (this.f39494s == typeface) {
            return false;
        }
        this.f39494s = typeface;
        return true;
    }

    /* renamed from: O */
    public void m36265O(int i10, int i11, int i12, int i13) {
        if (m36250F(this.f39479d, i10, i11, i12, i13)) {
            return;
        }
        this.f39479d.set(i10, i11, i12, i13);
        this.f39455G = true;
        m36255D();
    }

    /* renamed from: P */
    public void m36266P(Rect rect) {
        m36265O(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: Q */
    public final void m36267Q(float f10) {
        this.f39472X = f10;
        C6824g0.m31521g0(this.f39475a);
    }

    /* renamed from: R */
    public void m36268R(ColorStateList colorStateList) {
        if (this.f39486k != colorStateList) {
            this.f39486k = colorStateList;
            m36256E();
        }
    }

    /* renamed from: S */
    public void m36269S(int i10) {
        if (this.f39482g != i10) {
            this.f39482g = i10;
            m36256E();
        }
    }

    /* renamed from: T */
    public void m36270T(float f10) {
        if (this.f39484i != f10) {
            this.f39484i = f10;
            m36256E();
        }
    }

    /* renamed from: U */
    public final boolean m36271U(Typeface typeface) {
        C9146a c9146a = this.f39497v;
        if (c9146a != null) {
            c9146a.m38470c();
        }
        if (this.f39495t == typeface) {
            return false;
        }
        this.f39495t = typeface;
        return true;
    }

    /* renamed from: V */
    public void m36272V(float f10) {
        float m25778a = C5146a.m25778a(f10, 0.0f, 1.0f);
        if (m25778a != this.f39478c) {
            this.f39478c = m25778a;
            m36282d();
        }
    }

    /* renamed from: W */
    public final void m36273W(float f10) {
        m36285g(f10);
        boolean z10 = f39447b0 && this.f39452D != 1.0f;
        this.f39449A = z10;
        if (z10) {
            m36290l();
        }
        C6824g0.m31521g0(this.f39475a);
    }

    /* renamed from: X */
    public void m36274X(TimeInterpolator timeInterpolator) {
        this.f39458J = timeInterpolator;
        m36256E();
    }

    /* renamed from: Y */
    public final boolean m36275Y(int[] iArr) {
        this.f39454F = iArr;
        if (!m36254B()) {
            return false;
        }
        m36256E();
        return true;
    }

    /* renamed from: Z */
    public void m36276Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f39499x, charSequence)) {
            this.f39499x = charSequence;
            this.f39500y = null;
            m36286h();
            m36256E();
        }
    }

    /* renamed from: a0 */
    public void m36277a0(TimeInterpolator timeInterpolator) {
        this.f39459K = timeInterpolator;
        m36256E();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m36278b() {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p306rb.C8449a.m36278b():void");
    }

    /* renamed from: b0 */
    public void m36279b0(Typeface typeface) {
        boolean m36264N = m36264N(typeface);
        boolean m36271U = m36271U(typeface);
        if (m36264N || m36271U) {
            m36256E();
        }
    }

    /* renamed from: c */
    public float m36280c() {
        if (this.f39499x == null) {
            return 0.0f;
        }
        m36301w(this.f39457I);
        TextPaint textPaint = this.f39457I;
        CharSequence charSequence = this.f39499x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c0 */
    public final boolean m36281c0() {
        boolean z10 = true;
        if (this.f39476a0 <= 1 || this.f39501z || this.f39449A) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: d */
    public final void m36282d() {
        m36284f(this.f39478c);
    }

    /* renamed from: e */
    public final boolean m36283e(CharSequence charSequence) {
        return (m36253A() ? C5890f.f32995d : C5890f.f32994c).isRtl(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    public final void m36284f(float f10) {
        TextPaint textPaint;
        int m36296r;
        m36303y(f10);
        this.f39492q = m36249C(this.f39490o, this.f39491p, f10, this.f39458J);
        this.f39493r = m36249C(this.f39488m, this.f39489n, f10, this.f39458J);
        m36273W(m36249C(this.f39484i, this.f39485j, f10, this.f39459K));
        TimeInterpolator timeInterpolator = C0871a.f5952b;
        m36260J(1.0f - m36249C(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        m36267Q(m36249C(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f39487l != this.f39486k) {
            textPaint = this.f39456H;
            m36296r = m36251a(m36298t(), m36296r(), f10);
        } else {
            textPaint = this.f39456H;
            m36296r = m36296r();
        }
        textPaint.setColor(m36296r);
        float f11 = this.f39468T;
        float f12 = this.f39469U;
        if (f11 != f12) {
            this.f39456H.setLetterSpacing(m36249C(f12, f11, f10, timeInterpolator));
        } else {
            this.f39456H.setLetterSpacing(f11);
        }
        this.f39456H.setShadowLayer(m36249C(this.f39464P, this.f39460L, f10, null), m36249C(this.f39465Q, this.f39461M, f10, null), m36249C(this.f39466R, this.f39462N, f10, null), m36251a(m36297s(this.f39467S), m36297s(this.f39463O), f10));
        C6824g0.m31521g0(this.f39475a);
    }

    /* renamed from: g */
    public final void m36285g(float f10) {
        float f11;
        boolean z10;
        float min;
        if (this.f39499x == null) {
            return;
        }
        float width = this.f39480e.width();
        float width2 = this.f39479d.width();
        boolean z11 = false;
        if (m36252z(f10, this.f39485j)) {
            f11 = this.f39485j;
            this.f39452D = 1.0f;
            Typeface typeface = this.f39496u;
            Typeface typeface2 = this.f39494s;
            if (typeface != typeface2) {
                this.f39496u = typeface2;
                z10 = true;
                min = width;
            } else {
                z10 = false;
                min = width;
            }
        } else {
            f11 = this.f39484i;
            Typeface typeface3 = this.f39496u;
            Typeface typeface4 = this.f39495t;
            if (typeface3 != typeface4) {
                this.f39496u = typeface4;
                z10 = true;
            } else {
                z10 = false;
            }
            if (m36252z(f10, f11)) {
                this.f39452D = 1.0f;
            } else {
                this.f39452D = f10 / this.f39484i;
            }
            float f12 = this.f39485j / this.f39484i;
            min = width2 * f12 > width ? Math.min(width / f12, width2) : width2;
        }
        boolean z12 = z10;
        if (min > 0.0f) {
            boolean z13 = this.f39453E != f11 || this.f39455G || z10;
            this.f39453E = f11;
            this.f39455G = false;
            z12 = z13;
        }
        if (this.f39500y == null || z12) {
            this.f39456H.setTextSize(this.f39453E);
            this.f39456H.setTypeface(this.f39496u);
            TextPaint textPaint = this.f39456H;
            if (this.f39452D != 1.0f) {
                z11 = true;
            }
            textPaint.setLinearText(z11);
            this.f39501z = m36283e(this.f39499x);
            int i10 = 1;
            if (m36281c0()) {
                i10 = this.f39476a0;
            }
            StaticLayout m36287i = m36287i(i10, min, this.f39501z);
            this.f39470V = m36287i;
            this.f39500y = m36287i.getText();
        }
    }

    /* renamed from: h */
    public final void m36286h() {
        Bitmap bitmap = this.f39450B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f39450B = null;
        }
    }

    /* renamed from: i */
    public final StaticLayout m36287i(int i10, float f10, boolean z10) {
        StaticLayout staticLayout;
        try {
            staticLayout = C8455g.m36313c(this.f39499x, this.f39456H, (int) f10).m36317e(TextUtils.TruncateAt.END).m36319g(z10).m36316d(Layout.Alignment.ALIGN_NORMAL).m36318f(false).m36320h(i10).m36314a();
        } catch (C8455g.a e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayout = null;
        }
        return (StaticLayout) C6616h.m30527e(staticLayout);
    }

    /* renamed from: j */
    public void m36288j(Canvas canvas) {
        int save = canvas.save();
        if (this.f39500y == null || !this.f39477b) {
            return;
        }
        float f10 = this.f39492q;
        float lineLeft = this.f39470V.getLineLeft(0);
        float f11 = this.f39473Y;
        this.f39456H.setTextSize(this.f39453E);
        float f12 = this.f39492q;
        float f13 = this.f39493r;
        boolean z10 = false;
        if (this.f39449A) {
            z10 = false;
            if (this.f39450B != null) {
                z10 = true;
            }
        }
        float f14 = this.f39452D;
        if (f14 != 1.0f) {
            canvas.scale(f14, f14, f12, f13);
        }
        if (z10) {
            canvas.drawBitmap(this.f39450B, f12, f13, this.f39451C);
            canvas.restoreToCount(save);
            return;
        }
        if (m36281c0()) {
            m36289k(canvas, (f10 + lineLeft) - (f11 * 2.0f), f13);
        } else {
            canvas.translate(f12, f13);
            this.f39470V.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: k */
    public final void m36289k(Canvas canvas, float f10, float f11) {
        int alpha = this.f39456H.getAlpha();
        canvas.translate(f10, f11);
        float f12 = alpha;
        this.f39456H.setAlpha((int) (this.f39472X * f12));
        this.f39470V.draw(canvas);
        this.f39456H.setAlpha((int) (this.f39471W * f12));
        int lineBaseline = this.f39470V.getLineBaseline(0);
        CharSequence charSequence = this.f39474Z;
        int length = charSequence.length();
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, length, 0.0f, f13, this.f39456H);
        String trim = this.f39474Z.toString().trim();
        String str = trim;
        if (trim.endsWith("…")) {
            str = trim.substring(0, trim.length() - 1);
        }
        this.f39456H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f39470V.getLineEnd(0), str.length()), 0.0f, f13, (Paint) this.f39456H);
    }

    /* renamed from: l */
    public final void m36290l() {
        if (this.f39450B != null || this.f39479d.isEmpty() || TextUtils.isEmpty(this.f39500y)) {
            return;
        }
        m36284f(0.0f);
        int width = this.f39470V.getWidth();
        int height = this.f39470V.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f39450B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f39470V.draw(new Canvas(this.f39450B));
        if (this.f39451C == null) {
            this.f39451C = new Paint(3);
        }
    }

    /* renamed from: m */
    public void m36291m(RectF rectF, int i10, int i11) {
        this.f39501z = m36283e(this.f39499x);
        rectF.left = m36294p(i10, i11);
        rectF.top = this.f39480e.top;
        rectF.right = m36295q(rectF, i10, i11);
        rectF.bottom = this.f39480e.top + m36293o();
    }

    /* renamed from: n */
    public ColorStateList m36292n() {
        return this.f39487l;
    }

    /* renamed from: o */
    public float m36293o() {
        m36301w(this.f39457I);
        return -this.f39457I.ascent();
    }

    /* renamed from: p */
    public final float m36294p(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (m36280c() / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.f39501z ? this.f39480e.left : this.f39480e.right - m36280c();
        }
        return this.f39501z ? this.f39480e.right - m36280c() : this.f39480e.left;
    }

    /* renamed from: q */
    public final float m36295q(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (m36280c() / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.f39501z ? rectF.left + m36280c() : this.f39480e.right;
        }
        return this.f39501z ? this.f39480e.right : rectF.left + m36280c();
    }

    /* renamed from: r */
    public int m36296r() {
        return m36297s(this.f39487l);
    }

    /* renamed from: s */
    public final int m36297s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f39454F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: t */
    public final int m36298t() {
        return m36297s(this.f39486k);
    }

    /* renamed from: u */
    public float m36299u() {
        m36302x(this.f39457I);
        return -this.f39457I.ascent();
    }

    /* renamed from: v */
    public float m36300v() {
        return this.f39478c;
    }

    /* renamed from: w */
    public final void m36301w(TextPaint textPaint) {
        textPaint.setTextSize(this.f39485j);
        textPaint.setTypeface(this.f39494s);
        textPaint.setLetterSpacing(this.f39468T);
    }

    /* renamed from: x */
    public final void m36302x(TextPaint textPaint) {
        textPaint.setTextSize(this.f39484i);
        textPaint.setTypeface(this.f39495t);
        textPaint.setLetterSpacing(this.f39469U);
    }

    /* renamed from: y */
    public final void m36303y(float f10) {
        this.f39481f.left = m36249C(this.f39479d.left, this.f39480e.left, f10, this.f39458J);
        this.f39481f.top = m36249C(this.f39488m, this.f39489n, f10, this.f39458J);
        this.f39481f.right = m36249C(this.f39479d.right, this.f39480e.right, f10, this.f39458J);
        this.f39481f.bottom = m36249C(this.f39479d.bottom, this.f39480e.bottom, f10, this.f39458J);
    }
}
