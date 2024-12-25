package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import p029c.C0920a;
import p029c.C0927h;
import p029c.C0929j;
import p068e.C4561b;
import p106g0.C4917c;
import p117h.C5015a;
import p235o0.C6824g0;
import p314s0.C8513u;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/SwitchCompat.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SwitchCompat.class */
public class SwitchCompat extends CompoundButton {

    /* renamed from: O */
    public static final Property<SwitchCompat, Float> f1862O = new C0287a(Float.class, "thumbPos");

    /* renamed from: P */
    public static final int[] f1863P = {R.attr.state_checked};

    /* renamed from: A */
    public int f1864A;

    /* renamed from: B */
    public int f1865B;

    /* renamed from: C */
    public int f1866C;

    /* renamed from: D */
    public int f1867D;

    /* renamed from: E */
    public int f1868E;

    /* renamed from: F */
    public int f1869F;

    /* renamed from: G */
    public final TextPaint f1870G;

    /* renamed from: H */
    public ColorStateList f1871H;

    /* renamed from: I */
    public Layout f1872I;

    /* renamed from: J */
    public Layout f1873J;

    /* renamed from: K */
    public TransformationMethod f1874K;

    /* renamed from: L */
    public ObjectAnimator f1875L;

    /* renamed from: M */
    public final C0309e0 f1876M;

    /* renamed from: N */
    public final Rect f1877N;

    /* renamed from: b */
    public Drawable f1878b;

    /* renamed from: c */
    public ColorStateList f1879c;

    /* renamed from: d */
    public PorterDuff.Mode f1880d;

    /* renamed from: e */
    public boolean f1881e;

    /* renamed from: f */
    public boolean f1882f;

    /* renamed from: g */
    public Drawable f1883g;

    /* renamed from: h */
    public ColorStateList f1884h;

    /* renamed from: i */
    public PorterDuff.Mode f1885i;

    /* renamed from: j */
    public boolean f1886j;

    /* renamed from: k */
    public boolean f1887k;

    /* renamed from: l */
    public int f1888l;

    /* renamed from: m */
    public int f1889m;

    /* renamed from: n */
    public int f1890n;

    /* renamed from: o */
    public boolean f1891o;

    /* renamed from: p */
    public CharSequence f1892p;

    /* renamed from: q */
    public CharSequence f1893q;

    /* renamed from: r */
    public boolean f1894r;

    /* renamed from: s */
    public int f1895s;

    /* renamed from: t */
    public int f1896t;

    /* renamed from: u */
    public float f1897u;

    /* renamed from: v */
    public float f1898v;

    /* renamed from: w */
    public VelocityTracker f1899w;

    /* renamed from: x */
    public int f1900x;

    /* renamed from: y */
    public float f1901y;

    /* renamed from: z */
    public int f1902z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/SwitchCompat$a.class
     */
    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/SwitchCompat$a.class */
    public class C0287a extends Property<SwitchCompat, Float> {
        public C0287a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1901y);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6102Q);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1879c = null;
        this.f1880d = null;
        this.f1881e = false;
        this.f1882f = false;
        this.f1884h = null;
        this.f1885i = null;
        this.f1886j = false;
        this.f1887k = false;
        this.f1899w = VelocityTracker.obtain();
        this.f1877N = new Rect();
        C0322i1.m1454a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1870G = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C0929j.f6365Q2;
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, iArr, i10, 0);
        C6824g0.m31535n0(this, context, iArr, attributeSet, m1505v.m1523r(), i10, 0);
        Drawable m1512g = m1505v.m1512g(C0929j.f6380T2);
        this.f1878b = m1512g;
        if (m1512g != null) {
            m1512g.setCallback(this);
        }
        Drawable m1512g2 = m1505v.m1512g(C0929j.f6428c3);
        this.f1883g = m1512g2;
        if (m1512g2 != null) {
            m1512g2.setCallback(this);
        }
        this.f1892p = m1505v.m1521p(C0929j.f6370R2);
        this.f1893q = m1505v.m1521p(C0929j.f6375S2);
        this.f1894r = m1505v.m1506a(C0929j.f6385U2, true);
        this.f1888l = m1505v.m1511f(C0929j.f6410Z2, 0);
        this.f1889m = m1505v.m1511f(C0929j.f6395W2, 0);
        this.f1890n = m1505v.m1511f(C0929j.f6400X2, 0);
        this.f1891o = m1505v.m1506a(C0929j.f6390V2, false);
        ColorStateList m1508c = m1505v.m1508c(C0929j.f6416a3);
        if (m1508c != null) {
            this.f1879c = m1508c;
            this.f1881e = true;
        }
        PorterDuff.Mode m1532e = C0339o0.m1532e(m1505v.m1516k(C0929j.f6422b3, -1), null);
        if (this.f1880d != m1532e) {
            this.f1880d = m1532e;
            this.f1882f = true;
        }
        if (this.f1881e || this.f1882f) {
            m1172b();
        }
        ColorStateList m1508c2 = m1505v.m1508c(C0929j.f6434d3);
        if (m1508c2 != null) {
            this.f1884h = m1508c2;
            this.f1886j = true;
        }
        PorterDuff.Mode m1532e2 = C0339o0.m1532e(m1505v.m1516k(C0929j.f6440e3, -1), null);
        if (this.f1885i != m1532e2) {
            this.f1885i = m1532e2;
            this.f1887k = true;
        }
        if (this.f1886j || this.f1887k) {
            m1173c();
        }
        int m1519n = m1505v.m1519n(C0929j.f6405Y2, 0);
        if (m1519n != 0) {
            m1180k(context, m1519n);
        }
        C0309e0 c0309e0 = new C0309e0(this);
        this.f1876M = c0309e0;
        c0309e0.m1342m(attributeSet, i10);
        m1505v.m1525w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1896t = viewConfiguration.getScaledTouchSlop();
        this.f1900x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: f */
    public static float m1170f(float f10, float f11, float f12) {
        if (f10 >= f11) {
            f11 = f10;
            if (f10 > f12) {
                f11 = f12;
            }
        }
        return f11;
    }

    private boolean getTargetCheckedState() {
        return this.f1901y > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0358u1.m1621b(this) ? 1.0f - this.f1901y : this.f1901y) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1883g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1877N;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1878b;
        Rect m1531d = drawable2 != null ? C0339o0.m1531d(drawable2) : C0339o0.f2175c;
        return ((((this.f1902z - this.f1865B) - rect.left) - rect.right) - m1531d.left) - m1531d.right;
    }

    /* renamed from: a */
    public final void m1171a(boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1862O, z10 ? 1.0f : 0.0f);
        this.f1875L = ofFloat;
        ofFloat.setDuration(250L);
        this.f1875L.setAutoCancel(true);
        this.f1875L.start();
    }

    /* renamed from: b */
    public final void m1172b() {
        Drawable drawable = this.f1878b;
        if (drawable != null) {
            if (this.f1881e || this.f1882f) {
                Drawable mutate = C4917c.m24854r(drawable).mutate();
                this.f1878b = mutate;
                if (this.f1881e) {
                    C4917c.m24851o(mutate, this.f1879c);
                }
                if (this.f1882f) {
                    C4917c.m24852p(this.f1878b, this.f1880d);
                }
                if (this.f1878b.isStateful()) {
                    this.f1878b.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1173c() {
        Drawable drawable = this.f1883g;
        if (drawable != null) {
            if (this.f1886j || this.f1887k) {
                Drawable mutate = C4917c.m24854r(drawable).mutate();
                this.f1883g = mutate;
                if (this.f1886j) {
                    C4917c.m24851o(mutate, this.f1884h);
                }
                if (this.f1887k) {
                    C4917c.m24852p(this.f1883g, this.f1885i);
                }
                if (this.f1883g.isStateful()) {
                    this.f1883g.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m1174d() {
        ObjectAnimator objectAnimator = this.f1875L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        Rect rect = this.f1877N;
        int i14 = this.f1866C;
        int i15 = this.f1867D;
        int i16 = this.f1868E;
        int i17 = this.f1869F;
        int thumbOffset = getThumbOffset() + i14;
        Drawable drawable = this.f1878b;
        Rect m1531d = drawable != null ? C0339o0.m1531d(drawable) : C0339o0.f2175c;
        Drawable drawable2 = this.f1883g;
        int i18 = thumbOffset;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i19 = rect.left;
            int i20 = thumbOffset + i19;
            if (m1531d != null) {
                int i21 = m1531d.left;
                int i22 = i14;
                if (i21 > i19) {
                    i22 = i14 + (i21 - i19);
                }
                int i23 = m1531d.top;
                int i24 = rect.top;
                i12 = i23 > i24 ? (i23 - i24) + i15 : i15;
                int i25 = m1531d.right;
                int i26 = rect.right;
                i13 = i16;
                if (i25 > i26) {
                    i13 = i16 - (i25 - i26);
                }
                int i27 = m1531d.bottom;
                int i28 = rect.bottom;
                i14 = i22;
                i16 = i13;
                i10 = i12;
                if (i27 > i28) {
                    i14 = i22;
                    i11 = i17 - (i27 - i28);
                    this.f1883g.setBounds(i14, i12, i13, i11);
                    i18 = i20;
                }
            } else {
                i10 = i15;
            }
            i11 = i17;
            i12 = i10;
            i13 = i16;
            this.f1883g.setBounds(i14, i12, i13, i11);
            i18 = i20;
        }
        Drawable drawable3 = this.f1878b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i29 = i18 - rect.left;
            int i30 = i18 + this.f1865B + rect.right;
            this.f1878b.setBounds(i29, i15, i30, i17);
            Drawable background = getBackground();
            if (background != null) {
                C4917c.m24848l(background, i29, i15, i30, i17);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1878b;
        if (drawable != null) {
            C4917c.m24847k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1883g;
        if (drawable2 != null) {
            C4917c.m24847k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1878b;
        boolean z10 = false;
        if (drawable != null) {
            z10 = false;
            if (drawable.isStateful()) {
                z10 = false | drawable.setState(drawableState);
            }
        }
        Drawable drawable2 = this.f1883g;
        boolean z11 = z10;
        if (drawable2 != null) {
            z11 = z10;
            if (drawable2.isStateful()) {
                z11 = z10 | drawable2.setState(drawableState);
            }
        }
        if (z11) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m1175e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: g */
    public final boolean m1176g(float f10, float f11) {
        if (this.f1878b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1878b.getPadding(this.f1877N);
        int i10 = this.f1867D;
        int i11 = (this.f1866C + thumbOffset) - this.f1896t;
        int i12 = this.f1865B;
        Rect rect = this.f1877N;
        int i13 = rect.left;
        int i14 = rect.right;
        int i15 = this.f1869F;
        boolean z10 = false;
        if (f10 > i11) {
            z10 = false;
            if (f10 < i12 + i11 + i13 + i14 + r0) {
                z10 = false;
                if (f11 > i10 - r0) {
                    z10 = false;
                    if (f11 < i15 + r0) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0358u1.m1621b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1902z;
        int i10 = compoundPaddingLeft;
        if (!TextUtils.isEmpty(getText())) {
            i10 = compoundPaddingLeft + this.f1890n;
        }
        return i10;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0358u1.m1621b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1902z;
        int i10 = compoundPaddingRight;
        if (!TextUtils.isEmpty(getText())) {
            i10 = compoundPaddingRight + this.f1890n;
        }
        return i10;
    }

    public boolean getShowText() {
        return this.f1894r;
    }

    public boolean getSplitTrack() {
        return this.f1891o;
    }

    public int getSwitchMinWidth() {
        return this.f1889m;
    }

    public int getSwitchPadding() {
        return this.f1890n;
    }

    public CharSequence getTextOff() {
        return this.f1893q;
    }

    public CharSequence getTextOn() {
        return this.f1892p;
    }

    public Drawable getThumbDrawable() {
        return this.f1878b;
    }

    public int getThumbTextPadding() {
        return this.f1888l;
    }

    public ColorStateList getThumbTintList() {
        return this.f1879c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1880d;
    }

    public Drawable getTrackDrawable() {
        return this.f1883g;
    }

    public ColorStateList getTrackTintList() {
        return this.f1884h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1885i;
    }

    /* renamed from: h */
    public final Layout m1177h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1874K;
        CharSequence charSequence2 = charSequence;
        if (transformationMethod != null) {
            charSequence2 = transformationMethod.getTransformation(charSequence, this);
        }
        return new StaticLayout(charSequence2, this.f1870G, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r0)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence] */
    /* renamed from: i */
    public final void m1178i() {
        if (Build.VERSION.SDK_INT >= 30) {
            ?? r02 = this.f1893q;
            String str = r02;
            if (r02 == 0) {
                str = getResources().getString(C0927h.f6264b);
            }
            C6824g0.m31478E0(this, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence] */
    /* renamed from: j */
    public final void m1179j() {
        if (Build.VERSION.SDK_INT >= 30) {
            ?? r02 = this.f1892p;
            String str = r02;
            if (r02 == 0) {
                str = getResources().getString(C0927h.f6265c);
            }
            C6824g0.m31478E0(this, str);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1878b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1883g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1875L;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1875L.end();
        this.f1875L = null;
    }

    /* renamed from: k */
    public void m1180k(Context context, int i10) {
        C0337n1 m1503t = C0337n1.m1503t(context, i10, C0929j.f6446f3);
        ColorStateList m1508c = m1503t.m1508c(C0929j.f6468j3);
        if (m1508c == null) {
            m1508c = getTextColors();
        }
        this.f1871H = m1508c;
        int m1511f = m1503t.m1511f(C0929j.f6452g3, 0);
        if (m1511f != 0) {
            float f10 = m1511f;
            if (f10 != this.f1870G.getTextSize()) {
                this.f1870G.setTextSize(f10);
                requestLayout();
            }
        }
        m1182m(m1503t.m1516k(C0929j.f6458h3, -1), m1503t.m1516k(C0929j.f6463i3, -1));
        this.f1874K = m1503t.m1506a(C0929j.f6503q3, false) ? new C5015a(getContext()) : null;
        m1503t.m1525w();
    }

    /* renamed from: l */
    public void m1181l(Typeface typeface, int i10) {
        float f10 = 0.0f;
        boolean z10 = false;
        if (i10 <= 0) {
            this.f1870G.setFakeBoldText(false);
            this.f1870G.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
            return;
        }
        Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
        setSwitchTypeface(defaultFromStyle);
        int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ (-1)) & i10;
        TextPaint textPaint = this.f1870G;
        if ((style & 1) != 0) {
            z10 = true;
        }
        textPaint.setFakeBoldText(z10);
        TextPaint textPaint2 = this.f1870G;
        if ((style & 2) != 0) {
            f10 = -0.25f;
        }
        textPaint2.setTextSkewX(f10);
    }

    /* renamed from: m */
    public final void m1182m(int i10, int i11) {
        m1181l(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    /* renamed from: n */
    public final void m1183n(MotionEvent motionEvent) {
        this.f1895s = 0;
        boolean z10 = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z11) {
            this.f1899w.computeCurrentVelocity(1000);
            float xVelocity = this.f1899w.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1900x) {
                z10 = getTargetCheckedState();
            } else if (!C0358u1.m1621b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z10 = false;
            }
        } else {
            z10 = isChecked;
        }
        if (z10 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z10);
        m1175e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1863P);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1877N;
        Drawable drawable = this.f1883g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f1867D;
        int i11 = this.f1869F;
        int i12 = rect.top;
        int i13 = rect.bottom;
        Drawable drawable2 = this.f1878b;
        if (drawable != null) {
            if (!this.f1891o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m1531d = C0339o0.m1531d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m1531d.left;
                rect.right -= m1531d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1872I : this.f1873J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1871H;
            if (colorStateList != null) {
                this.f1870G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1870G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), (((i10 + i12) + (i11 - i13)) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1892p : this.f1893q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        int i18;
        super.onLayout(z10, i10, i11, i12, i13);
        int i19 = 0;
        if (this.f1878b != null) {
            Rect rect = this.f1877N;
            Drawable drawable = this.f1883g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m1531d = C0339o0.m1531d(this.f1878b);
            i14 = Math.max(0, m1531d.left - rect.left);
            i19 = Math.max(0, m1531d.right - rect.right);
        } else {
            i14 = 0;
        }
        if (C0358u1.m1621b(this)) {
            int paddingLeft = getPaddingLeft() + i14;
            int i20 = ((this.f1902z + paddingLeft) - i14) - i19;
            i15 = paddingLeft;
            width = i20;
        } else {
            width = (getWidth() - getPaddingRight()) - i19;
            i15 = (width - this.f1902z) + i14 + i19;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i16 = this.f1864A;
            i17 = paddingTop - (i16 / 2);
        } else {
            if (gravity == 80) {
                i18 = getHeight() - getPaddingBottom();
                i17 = i18 - this.f1864A;
                this.f1866C = i15;
                this.f1867D = i17;
                this.f1869F = i18;
                this.f1868E = width;
            }
            i17 = getPaddingTop();
            i16 = this.f1864A;
        }
        i18 = i16 + i17;
        this.f1866C = i15;
        this.f1867D = i17;
        this.f1869F = i18;
        this.f1868E = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f1894r) {
            if (this.f1872I == null) {
                this.f1872I = m1177h(this.f1892p);
            }
            if (this.f1873J == null) {
                this.f1873J = m1177h(this.f1893q);
            }
        }
        Rect rect = this.f1877N;
        Drawable drawable = this.f1878b;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f1878b.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f1878b.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        this.f1865B = Math.max(this.f1894r ? Math.max(this.f1872I.getWidth(), this.f1873J.getWidth()) + (this.f1888l * 2) : 0, i12);
        Drawable drawable2 = this.f1883g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.f1883g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
            i14 = 0;
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f1878b;
        int i17 = i16;
        int i18 = i15;
        if (drawable3 != null) {
            Rect m1531d = C0339o0.m1531d(drawable3);
            i18 = Math.max(i15, m1531d.left);
            i17 = Math.max(i16, m1531d.right);
        }
        int max = Math.max(this.f1889m, (this.f1865B * 2) + i18 + i17);
        int max2 = Math.max(i14, i13);
        this.f1902z = max;
        this.f1864A = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1892p : this.f1893q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0 != 3) goto L47;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            m1179j();
        } else {
            m1178i();
        }
        if (getWindowToken() != null && C6824g0.m31502U(this)) {
            m1171a(isChecked);
        } else {
            m1174d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8513u.m36725q(this, callback));
    }

    public void setShowText(boolean z10) {
        if (this.f1894r != z10) {
            this.f1894r = z10;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1891o = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1889m = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1890n = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1870G.getTypeface() == null || this.f1870G.getTypeface().equals(typeface)) && (this.f1870G.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f1870G.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1893q = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        m1178i();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1892p = charSequence;
        requestLayout();
        if (isChecked()) {
            m1179j();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1878b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1878b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f1901y = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(C4561b.m22999d(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1888l = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1879c = colorStateList;
        this.f1881e = true;
        m1172b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1880d = mode;
        this.f1882f = true;
        m1172b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1883g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1883g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(C4561b.m22999d(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1884h = colorStateList;
        this.f1886j = true;
        m1173c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1885i = mode;
        this.f1887k = true;
        m1173c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1878b || drawable == this.f1883g;
    }
}
