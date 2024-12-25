package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p260p.C7521a;
import p260p.C7522b;
import p260p.C7523c;
import p260p.C7524d;
import p275q.C7739a;
import p275q.InterfaceC7740b;
import p275q.InterfaceC7741c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/cardview/widget/CardView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/cardview/widget/CardView.class */
public class CardView extends FrameLayout {

    /* renamed from: i */
    public static final int[] f2351i = {R.attr.colorBackground};

    /* renamed from: j */
    public static final InterfaceC7741c f2352j;

    /* renamed from: b */
    public boolean f2353b;

    /* renamed from: c */
    public boolean f2354c;

    /* renamed from: d */
    public int f2355d;

    /* renamed from: e */
    public int f2356e;

    /* renamed from: f */
    public final Rect f2357f;

    /* renamed from: g */
    public final Rect f2358g;

    /* renamed from: h */
    public final InterfaceC7740b f2359h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/cardview/widget/CardView$a.class
     */
    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/cardview/widget/CardView$a.class */
    public class C0370a implements InterfaceC7740b {

        /* renamed from: a */
        public Drawable f2360a;

        /* renamed from: b */
        public final CardView f2361b;

        public C0370a(CardView cardView) {
            this.f2361b = cardView;
        }

        @Override // p275q.InterfaceC7740b
        /* renamed from: a */
        public void mo1685a(int i10, int i11, int i12, int i13) {
            this.f2361b.f2358g.set(i10, i11, i12, i13);
            CardView cardView = this.f2361b;
            Rect rect = cardView.f2357f;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // p275q.InterfaceC7740b
        /* renamed from: b */
        public void mo1686b(Drawable drawable) {
            this.f2360a = drawable;
            this.f2361b.setBackgroundDrawable(drawable);
        }

        @Override // p275q.InterfaceC7740b
        /* renamed from: c */
        public boolean mo1687c() {
            return this.f2361b.getUseCompatPadding();
        }

        @Override // p275q.InterfaceC7740b
        /* renamed from: d */
        public Drawable mo1688d() {
            return this.f2360a;
        }

        @Override // p275q.InterfaceC7740b
        /* renamed from: e */
        public boolean mo1689e() {
            return this.f2361b.getPreventCornerOverlap();
        }

        @Override // p275q.InterfaceC7740b
        /* renamed from: f */
        public View mo1690f() {
            return this.f2361b;
        }
    }

    static {
        C7739a c7739a = new C7739a();
        f2352j = c7739a;
        c7739a.mo33821l();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.f36298a);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources;
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f2357f = rect;
        this.f2358g = new Rect();
        C0370a c0370a = new C0370a(this);
        this.f2359h = c0370a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7524d.f36302a, i10, C7523c.f36301a);
        int i12 = C7524d.f36305d;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2351i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = C7522b.f36300b;
            } else {
                resources = getResources();
                i11 = C7522b.f36299a;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        float dimension = obtainStyledAttributes.getDimension(C7524d.f36306e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C7524d.f36307f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C7524d.f36308g, 0.0f);
        this.f2353b = obtainStyledAttributes.getBoolean(C7524d.f36310i, false);
        this.f2354c = obtainStyledAttributes.getBoolean(C7524d.f36309h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7524d.f36311j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C7524d.f36313l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C7524d.f36315n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C7524d.f36314m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C7524d.f36312k, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f2355d = obtainStyledAttributes.getDimensionPixelSize(C7524d.f36303b, 0);
        this.f2356e = obtainStyledAttributes.getDimensionPixelSize(C7524d.f36304c, 0);
        obtainStyledAttributes.recycle();
        f2352j.mo33815f(c0370a, context, valueOf, dimension, dimension2, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return f2352j.mo33820k(this.f2359h);
    }

    public float getCardElevation() {
        return f2352j.mo33812c(this.f2359h);
    }

    public int getContentPaddingBottom() {
        return this.f2357f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2357f.left;
    }

    public int getContentPaddingRight() {
        return this.f2357f.right;
    }

    public int getContentPaddingTop() {
        return this.f2357f.top;
    }

    public float getMaxCardElevation() {
        return f2352j.mo33819j(this.f2359h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2354c;
    }

    public float getRadius() {
        return f2352j.mo33817h(this.f2359h);
    }

    public boolean getUseCompatPadding() {
        return this.f2353b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = i10;
        int i13 = i11;
        if (!(f2352j instanceof C7739a)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo33816g(this.f2359h)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i13 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo33813d(this.f2359h)), View.MeasureSpec.getSize(i11)), mode2);
                i12 = i10;
            } else {
                i12 = i10;
                i13 = i11;
            }
        }
        super.onMeasure(i12, i13);
    }

    public void setCardBackgroundColor(int i10) {
        f2352j.mo33822m(this.f2359h, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2352j.mo33822m(this.f2359h, colorStateList);
    }

    public void setCardElevation(float f10) {
        f2352j.mo33814e(this.f2359h, f10);
    }

    public void setMaxCardElevation(float f10) {
        f2352j.mo33823n(this.f2359h, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f2356e = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f2355d = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f2354c) {
            this.f2354c = z10;
            f2352j.mo33818i(this.f2359h);
        }
    }

    public void setRadius(float f10) {
        f2352j.mo33811b(this.f2359h, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f2353b != z10) {
            this.f2353b = z10;
            f2352j.mo33810a(this.f2359h);
        }
    }
}
