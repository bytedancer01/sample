package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p235o0.C6824g0;
import p413y0.C9788a;
import p413y0.C9789b;
import p413y0.C9790c;
import p413y0.C9791d;
import p413y0.C9792e;
import p413y0.C9793f;
import p413y0.C9794g;
import p413y0.C9795h;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/SearchOrbView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchOrbView.class */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* renamed from: b */
    public View.OnClickListener f3330b;

    /* renamed from: c */
    public View f3331c;

    /* renamed from: d */
    public View f3332d;

    /* renamed from: e */
    public ImageView f3333e;

    /* renamed from: f */
    public Drawable f3334f;

    /* renamed from: g */
    public C0490c f3335g;

    /* renamed from: h */
    public final float f3336h;

    /* renamed from: i */
    public final int f3337i;

    /* renamed from: j */
    public final int f3338j;

    /* renamed from: k */
    public final float f3339k;

    /* renamed from: l */
    public final float f3340l;

    /* renamed from: m */
    public ValueAnimator f3341m;

    /* renamed from: n */
    public boolean f3342n;

    /* renamed from: o */
    public boolean f3343o;

    /* renamed from: p */
    public final ArgbEvaluator f3344p;

    /* renamed from: q */
    public final ValueAnimator.AnimatorUpdateListener f3345q;

    /* renamed from: r */
    public ValueAnimator f3346r;

    /* renamed from: s */
    public final ValueAnimator.AnimatorUpdateListener f3347s;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchOrbView$a.class
     */
    /* renamed from: androidx.leanback.widget.SearchOrbView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchOrbView$a.class */
    public class C0488a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final SearchOrbView f3348b;

        public C0488a(SearchOrbView searchOrbView) {
            this.f3348b = searchOrbView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f3348b.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchOrbView$b.class
     */
    /* renamed from: androidx.leanback.widget.SearchOrbView$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchOrbView$b.class */
    public class C0489b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final SearchOrbView f3349b;

        public C0489b(SearchOrbView searchOrbView) {
            this.f3349b = searchOrbView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f3349b.setSearchOrbZ(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchOrbView$c.class
     */
    /* renamed from: androidx.leanback.widget.SearchOrbView$c */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchOrbView$c.class */
    public static class C0490c {

        /* renamed from: a */
        public int f3350a;

        /* renamed from: b */
        public int f3351b;

        /* renamed from: c */
        public int f3352c;

        public C0490c(int i10, int i11, int i12) {
            this.f3350a = i10;
            this.f3351b = i11 == i10 ? m2524a(i10) : i11;
            this.f3352c = i12;
        }

        /* renamed from: a */
        public static int m2524a(int i10) {
            return Color.argb((int) ((Color.alpha(i10) * 0.85f) + 38.25f), (int) ((Color.red(i10) * 0.85f) + 38.25f), (int) ((Color.green(i10) * 0.85f) + 38.25f), (int) ((Color.blue(i10) * 0.85f) + 38.25f));
        }
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9788a.f44920c);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3344p = new ArgbEvaluator();
        this.f3345q = new C0488a(this);
        this.f3347s = new C0489b(this);
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.f3331c = inflate;
        this.f3332d = inflate.findViewById(C9793f.f44974A);
        this.f3333e = (ImageView) this.f3331c.findViewById(C9793f.f44988j);
        this.f3336h = context.getResources().getFraction(C9792e.f44971g, 1, 1);
        this.f3337i = context.getResources().getInteger(C9794g.f45008d);
        this.f3338j = context.getResources().getInteger(C9794g.f45009e);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(C9790c.f44956v);
        this.f3340l = dimensionPixelSize;
        this.f3339k = context.getResources().getDimensionPixelSize(C9790c.f44957w);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9799l.f45058Z, i10, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(C9799l.f45064c0);
        setOrbIcon(drawable == null ? resources.getDrawable(C9791d.f44959a) : drawable);
        int color = obtainStyledAttributes.getColor(C9799l.f45062b0, resources.getColor(C9789b.f44921a));
        setOrbColors(new C0490c(color, obtainStyledAttributes.getColor(C9799l.f45060a0, color), obtainStyledAttributes.getColor(C9799l.f45066d0, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        C6824g0.m31488J0(this.f3333e, dimensionPixelSize);
    }

    /* renamed from: a */
    public void m2519a(boolean z10) {
        float f10 = z10 ? this.f3336h : 1.0f;
        this.f3331c.animate().scaleX(f10).scaleY(f10).setDuration(this.f3338j).start();
        m2522d(z10, this.f3338j);
        m2520b(z10);
    }

    /* renamed from: b */
    public void m2520b(boolean z10) {
        this.f3342n = z10;
        m2523e();
    }

    /* renamed from: c */
    public void m2521c(float f10) {
        this.f3332d.setScaleX(f10);
        this.f3332d.setScaleY(f10);
    }

    /* renamed from: d */
    public final void m2522d(boolean z10, int i10) {
        if (this.f3346r == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f3346r = ofFloat;
            ofFloat.addUpdateListener(this.f3347s);
        }
        if (z10) {
            this.f3346r.start();
        } else {
            this.f3346r.reverse();
        }
        this.f3346r.setDuration(i10);
    }

    /* renamed from: e */
    public final void m2523e() {
        ValueAnimator valueAnimator = this.f3341m;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f3341m = null;
        }
        if (this.f3342n && this.f3343o) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.f3344p, Integer.valueOf(this.f3335g.f3350a), Integer.valueOf(this.f3335g.f3351b), Integer.valueOf(this.f3335g.f3350a));
            this.f3341m = ofObject;
            ofObject.setRepeatCount(-1);
            this.f3341m.setDuration(this.f3337i * 2);
            this.f3341m.addUpdateListener(this.f3345q);
            this.f3341m.start();
        }
    }

    public float getFocusedZoom() {
        return this.f3336h;
    }

    public int getLayoutResourceId() {
        return C9795h.f45020k;
    }

    public int getOrbColor() {
        return this.f3335g.f3350a;
    }

    public C0490c getOrbColors() {
        return this.f3335g;
    }

    public Drawable getOrbIcon() {
        return this.f3334f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3343o = true;
        m2523e();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f3330b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f3343o = false;
        m2523e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        m2519a(z10);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f3330b = onClickListener;
    }

    public void setOrbColor(int i10) {
        setOrbColors(new C0490c(i10, i10, 0));
    }

    public void setOrbColors(C0490c c0490c) {
        this.f3335g = c0490c;
        this.f3333e.setColorFilter(c0490c.f3352c);
        if (this.f3341m == null) {
            setOrbViewColor(this.f3335g.f3350a);
        } else {
            m2520b(true);
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.f3334f = drawable;
        this.f3333e.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i10) {
        if (this.f3332d.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.f3332d.getBackground()).setColor(i10);
        }
    }

    public void setSearchOrbZ(float f10) {
        View view = this.f3332d;
        float f11 = this.f3339k;
        C6824g0.m31488J0(view, f11 + (f10 * (this.f3340l - f11)));
    }
}
