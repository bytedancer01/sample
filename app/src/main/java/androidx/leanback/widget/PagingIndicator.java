package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import p413y0.C9789b;
import p413y0.C9790c;
import p413y0.C9791d;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/PagingIndicator.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/PagingIndicator.class */
public class PagingIndicator extends View {

    /* renamed from: B */
    public static final TimeInterpolator f3228B = new DecelerateInterpolator();

    /* renamed from: C */
    public static final Property<C0472d, Float> f3229C = new C0469a(Float.class, "alpha");

    /* renamed from: D */
    public static final Property<C0472d, Float> f3230D = new C0470b(Float.class, "diameter");

    /* renamed from: E */
    public static final Property<C0472d, Float> f3231E = new C0471c(Float.class, "translation_x");

    /* renamed from: A */
    public final float f3232A;

    /* renamed from: b */
    public boolean f3233b;

    /* renamed from: c */
    public final int f3234c;

    /* renamed from: d */
    public final int f3235d;

    /* renamed from: e */
    public final int f3236e;

    /* renamed from: f */
    public final int f3237f;

    /* renamed from: g */
    public final int f3238g;

    /* renamed from: h */
    public final int f3239h;

    /* renamed from: i */
    public final int f3240i;

    /* renamed from: j */
    public C0472d[] f3241j;

    /* renamed from: k */
    public int[] f3242k;

    /* renamed from: l */
    public int[] f3243l;

    /* renamed from: m */
    public int[] f3244m;

    /* renamed from: n */
    public int f3245n;

    /* renamed from: o */
    public int f3246o;

    /* renamed from: p */
    public int f3247p;

    /* renamed from: q */
    public int f3248q;

    /* renamed from: r */
    public int f3249r;

    /* renamed from: s */
    public final Paint f3250s;

    /* renamed from: t */
    public final Paint f3251t;

    /* renamed from: u */
    public final AnimatorSet f3252u;

    /* renamed from: v */
    public final AnimatorSet f3253v;

    /* renamed from: w */
    public final AnimatorSet f3254w;

    /* renamed from: x */
    public Bitmap f3255x;

    /* renamed from: y */
    public Paint f3256y;

    /* renamed from: z */
    public final Rect f3257z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/PagingIndicator$a.class
     */
    /* renamed from: androidx.leanback.widget.PagingIndicator$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/PagingIndicator$a.class */
    public static final class C0469a extends Property<C0472d, Float> {
        public C0469a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C0472d c0472d) {
            return Float.valueOf(c0472d.m2486d());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0472d c0472d, Float f10) {
            c0472d.m2491i(f10.floatValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/PagingIndicator$b.class
     */
    /* renamed from: androidx.leanback.widget.PagingIndicator$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/PagingIndicator$b.class */
    public static final class C0470b extends Property<C0472d, Float> {
        public C0470b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C0472d c0472d) {
            return Float.valueOf(c0472d.m2487e());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0472d c0472d, Float f10) {
            c0472d.m2492j(f10.floatValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/PagingIndicator$c.class
     */
    /* renamed from: androidx.leanback.widget.PagingIndicator$c */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/PagingIndicator$c.class */
    public static final class C0471c extends Property<C0472d, Float> {
        public C0471c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(C0472d c0472d) {
            return Float.valueOf(c0472d.m2488f());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C0472d c0472d, Float f10) {
            c0472d.m2493k(f10.floatValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/PagingIndicator$d.class
     */
    /* renamed from: androidx.leanback.widget.PagingIndicator$d */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/PagingIndicator$d.class */
    public class C0472d {

        /* renamed from: a */
        public float f3258a;

        /* renamed from: b */
        public int f3259b;

        /* renamed from: c */
        public float f3260c;

        /* renamed from: d */
        public float f3261d;

        /* renamed from: e */
        public float f3262e;

        /* renamed from: f */
        public float f3263f;

        /* renamed from: g */
        public float f3264g;

        /* renamed from: h */
        public float f3265h = 1.0f;

        /* renamed from: i */
        public float f3266i;

        /* renamed from: j */
        public final PagingIndicator f3267j;

        public C0472d(PagingIndicator pagingIndicator) {
            this.f3267j = pagingIndicator;
            float f10 = 1.0f;
            this.f3266i = pagingIndicator.f3233b ? f10 : -1.0f;
        }

        /* renamed from: a */
        public void m2483a() {
            this.f3259b = Color.argb(Math.round(this.f3258a * 255.0f), Color.red(this.f3267j.f3249r), Color.green(this.f3267j.f3249r), Color.blue(this.f3267j.f3249r));
        }

        /* renamed from: b */
        public void m2484b() {
            this.f3260c = 0.0f;
            this.f3261d = 0.0f;
            PagingIndicator pagingIndicator = this.f3267j;
            this.f3262e = pagingIndicator.f3234c;
            float f10 = pagingIndicator.f3235d;
            this.f3263f = f10;
            this.f3264g = f10 * pagingIndicator.f3232A;
            this.f3258a = 0.0f;
            m2483a();
        }

        /* renamed from: c */
        public void m2485c(Canvas canvas) {
            float f10 = this.f3261d + this.f3260c;
            canvas.drawCircle(f10, r0.f3245n, this.f3263f, this.f3267j.f3250s);
            if (this.f3258a > 0.0f) {
                this.f3267j.f3251t.setColor(this.f3259b);
                canvas.drawCircle(f10, r0.f3245n, this.f3263f, this.f3267j.f3251t);
                PagingIndicator pagingIndicator = this.f3267j;
                Bitmap bitmap = pagingIndicator.f3255x;
                Rect rect = pagingIndicator.f3257z;
                float f11 = this.f3264g;
                int i10 = (int) (f10 - f11);
                int i11 = this.f3267j.f3245n;
                canvas.drawBitmap(bitmap, rect, new Rect(i10, (int) (i11 - f11), (int) (f10 + f11), (int) (i11 + f11)), this.f3267j.f3256y);
            }
        }

        /* renamed from: d */
        public float m2486d() {
            return this.f3258a;
        }

        /* renamed from: e */
        public float m2487e() {
            return this.f3262e;
        }

        /* renamed from: f */
        public float m2488f() {
            return this.f3260c;
        }

        /* renamed from: g */
        public void m2489g() {
            this.f3266i = this.f3267j.f3233b ? 1.0f : -1.0f;
        }

        /* renamed from: h */
        public void m2490h() {
            this.f3260c = 0.0f;
            this.f3261d = 0.0f;
            PagingIndicator pagingIndicator = this.f3267j;
            this.f3262e = pagingIndicator.f3237f;
            float f10 = pagingIndicator.f3238g;
            this.f3263f = f10;
            this.f3264g = f10 * pagingIndicator.f3232A;
            this.f3258a = 1.0f;
            m2483a();
        }

        /* renamed from: i */
        public void m2491i(float f10) {
            this.f3258a = f10;
            m2483a();
            this.f3267j.invalidate();
        }

        /* renamed from: j */
        public void m2492j(float f10) {
            this.f3262e = f10;
            float f11 = f10 / 2.0f;
            this.f3263f = f11;
            PagingIndicator pagingIndicator = this.f3267j;
            this.f3264g = f11 * pagingIndicator.f3232A;
            pagingIndicator.invalidate();
        }

        /* renamed from: k */
        public void m2493k(float f10) {
            this.f3260c = f10 * this.f3265h * this.f3266i;
            this.f3267j.invalidate();
        }
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3254w = animatorSet;
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9799l.f45087p, i10, 0);
        int m2475g = m2475g(obtainStyledAttributes, C9799l.f45094w, C9790c.f44945k);
        this.f3235d = m2475g;
        this.f3234c = m2475g * 2;
        int m2475g2 = m2475g(obtainStyledAttributes, C9799l.f45090s, C9790c.f44941g);
        this.f3238g = m2475g2;
        int i11 = m2475g2 * 2;
        this.f3237f = i11;
        this.f3236e = m2475g(obtainStyledAttributes, C9799l.f45093v, C9790c.f44944j);
        this.f3239h = m2475g(obtainStyledAttributes, C9799l.f45092u, C9790c.f44940f);
        int m2474f = m2474f(obtainStyledAttributes, C9799l.f45091t, C9789b.f44924d);
        Paint paint = new Paint(1);
        this.f3250s = paint;
        paint.setColor(m2474f);
        this.f3249r = m2474f(obtainStyledAttributes, C9799l.f45088q, C9789b.f44922b);
        if (this.f3256y == null) {
            int i12 = C9799l.f45089r;
            if (obtainStyledAttributes.hasValue(i12)) {
                setArrowColor(obtainStyledAttributes.getColor(i12, 0));
            }
        }
        obtainStyledAttributes.recycle();
        this.f3233b = resources.getConfiguration().getLayoutDirection() == 0;
        int color = resources.getColor(C9789b.f44923c);
        int dimensionPixelSize = resources.getDimensionPixelSize(C9790c.f44943i);
        this.f3240i = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.f3251t = paint2;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C9790c.f44942h);
        float f10 = dimensionPixelSize;
        float f11 = dimensionPixelSize2;
        paint2.setShadowLayer(f10, f11, f11, color);
        this.f3255x = m2476h();
        this.f3257z = new Rect(0, 0, this.f3255x.getWidth(), this.f3255x.getHeight());
        this.f3232A = this.f3255x.getWidth() / i11;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f3252u = animatorSet2;
        animatorSet2.playTogether(m2471c(0.0f, 1.0f), m2472d(m2475g * 2, m2475g2 * 2), m2473e());
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f3253v = animatorSet3;
        animatorSet3.playTogether(m2471c(1.0f, 0.0f), m2472d(m2475g2 * 2, m2475g * 2), m2473e());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f3237f + getPaddingBottom() + this.f3240i;
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        return (this.f3235d * 2) + (this.f3239h * 2) + ((this.f3246o - 3) * this.f3236e);
    }

    private void setSelectedPage(int i10) {
        if (i10 == this.f3247p) {
            return;
        }
        this.f3247p = i10;
        m2469a();
    }

    /* renamed from: a */
    public final void m2469a() {
        int i10;
        float f10;
        int i11 = 0;
        while (true) {
            i10 = this.f3247p;
            f10 = -1.0f;
            if (i11 >= i10) {
                break;
            }
            this.f3241j[i11].m2484b();
            C0472d c0472d = this.f3241j[i11];
            if (i11 != this.f3248q) {
                f10 = 1.0f;
            }
            c0472d.f3265h = f10;
            c0472d.f3261d = this.f3243l[i11];
            i11++;
        }
        this.f3241j[i10].m2490h();
        C0472d[] c0472dArr = this.f3241j;
        int i12 = this.f3247p;
        C0472d c0472d2 = c0472dArr[i12];
        if (this.f3248q >= i12) {
            f10 = 1.0f;
        }
        c0472d2.f3265h = f10;
        int i13 = this.f3242k[i12];
        while (true) {
            c0472d2.f3261d = i13;
            i12++;
            if (i12 >= this.f3246o) {
                return;
            }
            this.f3241j[i12].m2484b();
            c0472d2 = this.f3241j[i12];
            c0472d2.f3265h = 1.0f;
            i13 = this.f3244m[i12];
        }
    }

    /* renamed from: b */
    public final void m2470b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i10 = (paddingLeft + (width - paddingRight)) / 2;
        int i11 = this.f3246o;
        int[] iArr = new int[i11];
        this.f3242k = iArr;
        int[] iArr2 = new int[i11];
        this.f3243l = iArr2;
        int[] iArr3 = new int[i11];
        this.f3244m = iArr3;
        int i12 = requiredWidth / 2;
        if (this.f3233b) {
            int i13 = i10 - i12;
            int i14 = this.f3235d;
            int i15 = this.f3236e;
            int i16 = this.f3239h;
            iArr[0] = ((i13 + i14) - i15) + i16;
            iArr2[0] = i13 + i14;
            iArr3[0] = ((i13 + i14) - (i15 * 2)) + (i16 * 2);
            for (int i17 = 1; i17 < this.f3246o; i17++) {
                int[] iArr4 = this.f3242k;
                int[] iArr5 = this.f3243l;
                int i18 = i17 - 1;
                int i19 = iArr5[i18];
                int i20 = this.f3239h;
                iArr4[i17] = i19 + i20;
                iArr5[i17] = iArr5[i18] + this.f3236e;
                this.f3244m[i17] = iArr4[i18] + i20;
            }
        } else {
            int i21 = i10 + i12;
            int i22 = this.f3235d;
            int i23 = this.f3236e;
            int i24 = this.f3239h;
            iArr[0] = ((i21 - i22) + i23) - i24;
            iArr2[0] = i21 - i22;
            iArr3[0] = ((i21 - i22) + (i23 * 2)) - (i24 * 2);
            for (int i25 = 1; i25 < this.f3246o; i25++) {
                int[] iArr6 = this.f3242k;
                int[] iArr7 = this.f3243l;
                int i26 = i25 - 1;
                int i27 = iArr7[i26];
                int i28 = this.f3239h;
                iArr6[i25] = i27 - i28;
                iArr7[i25] = iArr7[i26] - this.f3236e;
                this.f3244m[i25] = iArr6[i26] - i28;
            }
        }
        this.f3245n = paddingTop + this.f3238g;
        m2469a();
    }

    /* renamed from: c */
    public final Animator m2471c(float f10, float f11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f3229C, f10, f11);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(f3228B);
        return ofFloat;
    }

    /* renamed from: d */
    public final Animator m2472d(float f10, float f11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f3230D, f10, f11);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(f3228B);
        return ofFloat;
    }

    /* renamed from: e */
    public final Animator m2473e() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f3231E, (-this.f3239h) + this.f3236e, 0.0f);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(f3228B);
        return ofFloat;
    }

    /* renamed from: f */
    public final int m2474f(TypedArray typedArray, int i10, int i11) {
        return typedArray.getColor(i10, getResources().getColor(i11));
    }

    /* renamed from: g */
    public final int m2475g(TypedArray typedArray, int i10, int i11) {
        return typedArray.getDimensionPixelOffset(i10, getResources().getDimensionPixelOffset(i11));
    }

    public int[] getDotSelectedLeftX() {
        return this.f3243l;
    }

    public int[] getDotSelectedRightX() {
        return this.f3244m;
    }

    public int[] getDotSelectedX() {
        return this.f3242k;
    }

    public int getPageCount() {
        return this.f3246o;
    }

    /* renamed from: h */
    public final Bitmap m2476h() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C9791d.f44960b);
        if (this.f3233b) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f3246o; i10++) {
            this.f3241j[i10].m2485c(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i11);
        int size = mode != Integer.MIN_VALUE ? mode != 1073741824 ? desiredHeight : View.MeasureSpec.getSize(i11) : Math.min(desiredHeight, View.MeasureSpec.getSize(i11));
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i10);
        setMeasuredDimension(mode2 != Integer.MIN_VALUE ? mode2 != 1073741824 ? desiredWidth : View.MeasureSpec.getSize(i10) : Math.min(desiredWidth, View.MeasureSpec.getSize(i10)), size);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 0;
        if (this.f3233b != z10) {
            this.f3233b = z10;
            this.f3255x = m2476h();
            C0472d[] c0472dArr = this.f3241j;
            if (c0472dArr != null) {
                for (C0472d c0472d : c0472dArr) {
                    c0472d.m2489g();
                }
            }
            m2470b();
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        setMeasuredDimension(i10, i11);
        m2470b();
    }

    public void setArrowBackgroundColor(int i10) {
        this.f3249r = i10;
    }

    public void setArrowColor(int i10) {
        if (this.f3256y == null) {
            this.f3256y = new Paint();
        }
        this.f3256y.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i10) {
        this.f3250s.setColor(i10);
    }

    public void setPageCount(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The page count should be a positive integer");
        }
        this.f3246o = i10;
        this.f3241j = new C0472d[i10];
        for (int i11 = 0; i11 < this.f3246o; i11++) {
            this.f3241j[i11] = new C0472d(this);
        }
        m2470b();
        setSelectedPage(0);
    }
}
