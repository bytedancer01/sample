package p424yb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import cc.C1060a;
import lb.C5837a;
import p012ab.C0142b;
import p012ab.C0144d;
import p012ab.C0152l;
import p106g0.C4917c;
import p235o0.C6824g0;
import p306rb.C8459k;
import p351ub.C9148c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yb/d.class
 */
/* renamed from: yb.d */
/* loaded from: combined.jar:classes2.jar:yb/d.class */
public class C9972d extends FrameLayout {

    /* renamed from: i */
    public static final View.OnTouchListener f45677i = new a();

    /* renamed from: b */
    public InterfaceC9971c f45678b;

    /* renamed from: c */
    public InterfaceC9970b f45679c;

    /* renamed from: d */
    public int f45680d;

    /* renamed from: e */
    public final float f45681e;

    /* renamed from: f */
    public final float f45682f;

    /* renamed from: g */
    public ColorStateList f45683g;

    /* renamed from: h */
    public PorterDuff.Mode f45684h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yb/d$a.class
     */
    /* renamed from: yb.d$a */
    /* loaded from: combined.jar:classes2.jar:yb/d$a.class */
    public static final class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public C9972d(Context context, AttributeSet attributeSet) {
        super(C1060a.m6267c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0152l.f1178q4);
        if (obtainStyledAttributes.hasValue(C0152l.f1234x4)) {
            C6824g0.m31553w0(this, obtainStyledAttributes.getDimensionPixelSize(r0, 0));
        }
        this.f45680d = obtainStyledAttributes.getInt(C0152l.f1202t4, 0);
        this.f45681e = obtainStyledAttributes.getFloat(C0152l.f1210u4, 1.0f);
        setBackgroundTintList(C9148c.m38476a(context2, obtainStyledAttributes, C0152l.f1218v4));
        setBackgroundTintMode(C8459k.m36344e(obtainStyledAttributes.getInt(C0152l.f1226w4, -1), PorterDuff.Mode.SRC_IN));
        this.f45682f = obtainStyledAttributes.getFloat(C0152l.f1194s4, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f45677i);
        setFocusable(true);
        if (getBackground() == null) {
            C6824g0.m31545s0(this, m41904a());
        }
    }

    /* renamed from: a */
    public final Drawable m41904a() {
        float dimension = getResources().getDimension(C0144d.f697U);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(C5837a.m28428g(this, C0142b.f653m, C0142b.f650j, getBackgroundOverlayColorAlpha()));
        if (this.f45683g == null) {
            return C4917c.m24854r(gradientDrawable);
        }
        Drawable m24854r = C4917c.m24854r(gradientDrawable);
        C4917c.m24851o(m24854r, this.f45683g);
        return m24854r;
    }

    public float getActionTextColorAlpha() {
        return this.f45682f;
    }

    public int getAnimationMode() {
        return this.f45680d;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f45681e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC9970b interfaceC9970b = this.f45679c;
        if (interfaceC9970b != null) {
            interfaceC9970b.onViewAttachedToWindow(this);
        }
        C6824g0.m31533m0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC9970b interfaceC9970b = this.f45679c;
        if (interfaceC9970b != null) {
            interfaceC9970b.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        InterfaceC9971c interfaceC9971c = this.f45678b;
        if (interfaceC9971c != null) {
            interfaceC9971c.m41903a(this, i10, i11, i12, i13);
        }
    }

    public void setAnimationMode(int i10) {
        this.f45680d = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = drawable;
            if (this.f45683g != null) {
                drawable2 = C4917c.m24854r(drawable.mutate());
                C4917c.m24851o(drawable2, this.f45683g);
                C4917c.m24852p(drawable2, this.f45684h);
            }
        }
        super.setBackgroundDrawable(drawable2);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f45683g = colorStateList;
        if (getBackground() != null) {
            Drawable m24854r = C4917c.m24854r(getBackground().mutate());
            C4917c.m24851o(m24854r, colorStateList);
            C4917c.m24852p(m24854r, this.f45684h);
            if (m24854r != getBackground()) {
                super.setBackgroundDrawable(m24854r);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f45684h = mode;
        if (getBackground() != null) {
            Drawable m24854r = C4917c.m24854r(getBackground().mutate());
            C4917c.m24852p(m24854r, mode);
            if (m24854r != getBackground()) {
                super.setBackgroundDrawable(m24854r);
            }
        }
    }

    public void setOnAttachStateChangeListener(InterfaceC9970b interfaceC9970b) {
        this.f45679c = interfaceC9970b;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f45677i);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(InterfaceC9971c interfaceC9971c) {
        this.f45678b = interfaceC9971c;
    }
}
