package mbanje.kurt.fabbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import org.achartengine.renderer.DefaultRenderer;
import p154ii.C5266e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mbanje/kurt/fabbutton/CircleImageView.class
 */
/* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/CircleImageView.class */
public class CircleImageView extends AppCompatImageView {

    /* renamed from: d */
    public int f34212d;

    /* renamed from: e */
    public int f34213e;

    /* renamed from: f */
    public int f34214f;

    /* renamed from: g */
    public boolean f34215g;

    /* renamed from: h */
    public int f34216h;

    /* renamed from: i */
    public Paint f34217i;

    /* renamed from: j */
    public InterfaceC6547b f34218j;

    /* renamed from: k */
    public final int f34219k;

    /* renamed from: l */
    public int f34220l;

    /* renamed from: m */
    public Paint f34221m;

    /* renamed from: n */
    public float f34222n;

    /* renamed from: o */
    public float f34223o;

    /* renamed from: p */
    public Drawable[] f34224p;

    /* renamed from: q */
    public TransitionDrawable f34225q;

    /* renamed from: r */
    public int f34226r;

    /* renamed from: s */
    public ObjectAnimator f34227s;

    /* renamed from: t */
    public float f34228t;

    /* renamed from: u */
    public float f34229u;

    /* renamed from: v */
    public float f34230v;

    /* renamed from: w */
    public int f34231w;

    /* renamed from: x */
    public boolean f34232x;

    /* renamed from: y */
    public boolean f34233y;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/CircleImageView$a.class
     */
    /* renamed from: mbanje.kurt.fabbutton.CircleImageView$a */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/CircleImageView$a.class */
    public class C6546a extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final CircleImageView f34234b;

        public C6546a(CircleImageView circleImageView) {
            this.f34234b = circleImageView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f34234b.f34218j != null) {
                this.f34234b.f34218j.mo30203b(this.f34234b.f34215g);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mbanje/kurt/fabbutton/CircleImageView$b.class
     */
    /* renamed from: mbanje.kurt.fabbutton.CircleImageView$b */
    /* loaded from: combined.jar:classes2.jar:mbanje/kurt/fabbutton/CircleImageView$b.class */
    public interface InterfaceC6547b {
        /* renamed from: a */
        void mo30202a();

        /* renamed from: b */
        void mo30203b(boolean z10);
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34219k = 75;
        this.f34223o = 0.14f;
        this.f34224p = new Drawable[2];
        this.f34228t = 3.5f;
        this.f34229u = 0.0f;
        this.f34230v = 10.0f;
        this.f34231w = 100;
        this.f34233y = true;
        m30197e(context, attributeSet);
    }

    /* renamed from: e */
    public final void m30197e(Context context, AttributeSet attributeSet) {
        setFocusable(false);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setClickable(true);
        Paint paint = new Paint(1);
        this.f34217i = paint;
        paint.setStyle(Paint.Style.FILL);
        int i10 = getResources().getDisplayMetrics().densityDpi;
        this.f34230v = i10 <= 240 ? 1.0f : i10 <= 320 ? 3.0f : 10.0f;
        Paint paint2 = new Paint(1);
        this.f34221m = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        setWillNotDraw(false);
        setLayerType(1, null);
        int i11 = -16777216;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5266e.f30275z);
            i11 = obtainStyledAttributes.getColor(C5266e.f30205I, DefaultRenderer.BACKGROUND_COLOR);
            this.f34223o = obtainStyledAttributes.getFloat(C5266e.f30212N, this.f34223o);
            this.f34230v = obtainStyledAttributes.getFloat(C5266e.f30203H, this.f34230v);
            this.f34228t = obtainStyledAttributes.getFloat(C5266e.f30201G, this.f34228t);
            this.f34229u = obtainStyledAttributes.getFloat(C5266e.f30199F, this.f34229u);
            setShowShadow(obtainStyledAttributes.getBoolean(C5266e.f30214P, true));
            obtainStyledAttributes.recycle();
        }
        setColor(i11);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "currentRingWidth", 0.0f, 0.0f);
        this.f34227s = ofFloat;
        ofFloat.setDuration(200L);
        this.f34227s.addListener(new C6546a(this));
    }

    /* renamed from: f */
    public void m30198f(int i10, int i11) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i10);
        if (!this.f34232x) {
            setImageBitmap(decodeResource);
        } else {
            m30199g(new BitmapDrawable(getResources(), decodeResource), new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), i11)));
        }
    }

    /* renamed from: g */
    public final void m30199g(Drawable drawable, Drawable drawable2) {
        Drawable[] drawableArr = this.f34224p;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        TransitionDrawable transitionDrawable = new TransitionDrawable(this.f34224p);
        this.f34225q = transitionDrawable;
        transitionDrawable.setCrossFadeEnabled(true);
        setImageDrawable(this.f34225q);
    }

    public float getCurrentRingWidth() {
        return this.f34222n;
    }

    /* renamed from: h */
    public void m30200h(boolean z10, boolean z11) {
        if (z10) {
            this.f34225q.startTransition(500);
        }
        if (z11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "currentRingWidth", 0.0f, 0.0f);
            ofFloat.setFloatValues(1.0f);
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    /* renamed from: i */
    public void m30201i(boolean z10) {
        this.f34215g = z10;
        if (z10) {
            this.f34227s.setFloatValues(this.f34222n, this.f34226r);
        } else {
            this.f34227s.setFloatValues(this.f34226r, 0.0f);
        }
        this.f34227s.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(this.f34213e, this.f34212d, this.f34220l + this.f34222n, this.f34221m);
        canvas.drawCircle(this.f34213e, this.f34212d, this.f34216h, this.f34217i);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f34213e = i10 / 2;
        this.f34212d = i11 / 2;
        int min = Math.min(i10, i11) / 2;
        this.f34214f = min;
        int round = Math.round(min * this.f34223o);
        this.f34226r = round;
        this.f34216h = this.f34214f - round;
        this.f34221m.setStrokeWidth(round);
        this.f34221m.setAlpha(75);
        this.f34220l = this.f34216h - (this.f34226r / 2);
    }

    public void setColor(int i10) {
        this.f34217i.setColor(i10);
        this.f34221m.setColor(i10);
        this.f34221m.setAlpha(75);
        invalidate();
    }

    public void setCurrentRingWidth(float f10) {
        this.f34222n = f10;
        invalidate();
    }

    public void setFabViewListener(InterfaceC6547b interfaceC6547b) {
        this.f34218j = interfaceC6547b;
    }

    public void setRingWidthRatio(float f10) {
        this.f34223o = f10;
    }

    public void setShowEndBitmap(boolean z10) {
        this.f34232x = z10;
    }

    public void setShowShadow(boolean z10) {
        if (z10) {
            this.f34217i.setShadowLayer(this.f34230v, this.f34229u, this.f34228t, Color.argb(this.f34231w, 0, 0, 0));
        } else {
            this.f34217i.clearShadowLayer();
        }
        invalidate();
    }
}
