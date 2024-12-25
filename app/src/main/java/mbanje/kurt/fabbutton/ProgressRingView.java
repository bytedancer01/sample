package mbanje.kurt.fabbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import mbanje.kurt.fabbutton.C6550a;
import mbanje.kurt.fabbutton.CircleImageView;
import org.achartengine.renderer.DefaultRenderer;
import p154ii.C5266e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mbanje/kurt/fabbutton/ProgressRingView.class
 */
/* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/ProgressRingView.class */
public class ProgressRingView extends View implements C6550a.g {

    /* renamed from: b */
    public String f34247b;

    /* renamed from: c */
    public Paint f34248c;

    /* renamed from: d */
    public int f34249d;

    /* renamed from: e */
    public RectF f34250e;

    /* renamed from: f */
    public float f34251f;

    /* renamed from: g */
    public int f34252g;

    /* renamed from: h */
    public float f34253h;

    /* renamed from: i */
    public boolean f34254i;

    /* renamed from: j */
    public boolean f34255j;

    /* renamed from: k */
    public float f34256k;

    /* renamed from: l */
    public float f34257l;

    /* renamed from: m */
    public float f34258m;

    /* renamed from: n */
    public float f34259n;

    /* renamed from: o */
    public int f34260o;

    /* renamed from: p */
    public int f34261p;

    /* renamed from: q */
    public int f34262q;

    /* renamed from: r */
    public int f34263r;

    /* renamed from: s */
    public float f34264s;

    /* renamed from: t */
    public float f34265t;

    /* renamed from: u */
    public ValueAnimator f34266u;

    /* renamed from: v */
    public ValueAnimator f34267v;

    /* renamed from: w */
    public AnimatorSet f34268w;

    /* renamed from: x */
    public CircleImageView.InterfaceC6547b f34269x;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/ProgressRingView$a.class
     */
    /* renamed from: mbanje.kurt.fabbutton.ProgressRingView$a */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/ProgressRingView$a.class */
    public class C6549a extends AnimatorListenerAdapter {

        /* renamed from: b */
        public boolean f34270b = false;

        /* renamed from: c */
        public final ProgressRingView f34271c;

        public C6549a(ProgressRingView progressRingView) {
            this.f34271c = progressRingView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f34270b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f34270b) {
                return;
            }
            this.f34271c.m30217c();
        }
    }

    public ProgressRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34247b = ProgressRingView.class.getSimpleName();
        this.f34249d = 0;
        this.f34251f = 0.14f;
        this.f34253h = 0.14f;
        this.f34263r = DefaultRenderer.BACKGROUND_COLOR;
        m30216b(attributeSet, 0);
    }

    @Override // mbanje.kurt.fabbutton.C6550a.g
    /* renamed from: a */
    public void mo30215a(float f10, float f11, float f12, float f13) {
        CircleImageView.InterfaceC6547b interfaceC6547b;
        if (f10 != -1.0f) {
            this.f34258m = f10;
        }
        if (f11 != -1.0f) {
            this.f34259n = f11;
        }
        if (f12 != -1.0f) {
            this.f34264s = f12;
        }
        if (f13 != -1.0f) {
            this.f34265t = f13;
            if (Math.round(f13) != 100 || (interfaceC6547b = this.f34269x) == null) {
                return;
            }
            interfaceC6547b.mo30202a();
        }
    }

    /* renamed from: b */
    public void m30216b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5266e.f30275z, i10, 0);
        this.f34256k = obtainStyledAttributes.getFloat(C5266e.f30193C, 0.0f);
        this.f34263r = obtainStyledAttributes.getColor(C5266e.f30211M, this.f34263r);
        this.f34257l = obtainStyledAttributes.getFloat(C5266e.f30191B, 100.0f);
        this.f34254i = obtainStyledAttributes.getBoolean(C5266e.f30195D, false);
        this.f34255j = obtainStyledAttributes.getBoolean(C5266e.f30207J, true);
        this.f34262q = obtainStyledAttributes.getInteger(C5266e.f30197E, 4000);
        this.f34253h = obtainStyledAttributes.getFloat(C5266e.f30212N, this.f34253h);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f34248c = paint;
        paint.setColor(this.f34263r);
        this.f34248c.setStyle(Paint.Style.STROKE);
        this.f34248c.setStrokeCap(Paint.Cap.BUTT);
        if (this.f34255j) {
            m30219e();
        }
    }

    /* renamed from: c */
    public void m30217c() {
        int i10 = 0;
        m30220f(false);
        boolean z10 = this.f34254i;
        this.f34264s = -90.0f;
        if (!z10) {
            ValueAnimator m30224c = C6550a.m30224c(this, -90.0f, 270.0f, this);
            this.f34266u = m30224c;
            m30224c.start();
            this.f34265t = 0.0f;
            ValueAnimator m30223b = C6550a.m30223b(this, 0.0f, this.f34256k, this);
            this.f34267v = m30223b;
            m30223b.start();
            return;
        }
        this.f34258m = 15.0f;
        this.f34268w = new AnimatorSet();
        AnimatorSet animatorSet = null;
        while (true) {
            AnimatorSet animatorSet2 = animatorSet;
            if (i10 >= 4) {
                this.f34268w.addListener(new C6549a(this));
                this.f34268w.start();
                return;
            }
            AnimatorSet m30222a = C6550a.m30222a(this, i10, this.f34262q, this);
            AnimatorSet.Builder play = this.f34268w.play(m30222a);
            if (animatorSet2 != null) {
                play.after(animatorSet2);
            }
            i10++;
            animatorSet = m30222a;
        }
    }

    /* renamed from: d */
    public void m30218d(int i10, boolean z10) {
        if (z10) {
            i10 = Math.round(this.f34252g * this.f34253h);
        }
        this.f34260o = i10;
        int i11 = this.f34260o;
        this.f34261p = i11 / 2;
        this.f34248c.setStrokeWidth(i11);
        m30221g();
    }

    /* renamed from: e */
    public void m30219e() {
        m30217c();
    }

    /* renamed from: f */
    public void m30220f(boolean z10) {
        ValueAnimator valueAnimator = this.f34266u;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f34266u.cancel();
        }
        ValueAnimator valueAnimator2 = this.f34267v;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f34267v.cancel();
        }
        AnimatorSet animatorSet = this.f34268w;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f34268w.cancel();
        }
        if (z10) {
            m30218d(0, false);
        } else {
            m30218d(0, true);
        }
        invalidate();
    }

    /* renamed from: g */
    public final void m30221g() {
        int i10 = this.f34261p;
        float f10 = i10;
        float f11 = i10;
        int i11 = this.f34249d;
        this.f34250e = new RectF(f10, f11, i11 - i10, i11 - i10);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10 = (isInEditMode() ? this.f34256k : this.f34265t) / this.f34257l;
        if (this.f34254i) {
            canvas.drawArc(this.f34250e, this.f34264s + this.f34259n, this.f34258m, false, this.f34248c);
        } else {
            canvas.drawArc(this.f34250e, this.f34264s, f10 * 360.0f, false, this.f34248c);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int min = Math.min(i10, i11);
        this.f34249d = min;
        this.f34252g = min / 2;
        m30218d(-1, true);
    }

    public void setAnimDuration(int i10) {
        this.f34262q = i10;
    }

    public void setAutostartanim(boolean z10) {
        this.f34255j = z10;
    }

    public void setFabViewListener(CircleImageView.InterfaceC6547b interfaceC6547b) {
        this.f34269x = interfaceC6547b;
    }

    public void setIndeterminate(boolean z10) {
        this.f34254i = z10;
    }

    public void setMaxProgress(float f10) {
        this.f34257l = f10;
    }

    public void setProgress(float f10) {
        this.f34256k = f10;
        if (!this.f34254i) {
            ValueAnimator valueAnimator = this.f34267v;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f34267v.cancel();
            }
            ValueAnimator m30223b = C6550a.m30223b(this, this.f34265t, f10, this);
            this.f34267v = m30223b;
            m30223b.start();
        }
        invalidate();
    }

    public void setProgressColor(int i10) {
        this.f34263r = i10;
        this.f34248c.setColor(i10);
    }

    public void setRingWidthRatio(float f10) {
        this.f34253h = f10;
    }
}
