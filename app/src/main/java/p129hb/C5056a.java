package p129hb;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import p012ab.C0142b;
import p012ab.C0151k;
import p068e.C4561b;
import p404xb.C9716k;
import p404xb.InterfaceC9719n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hb/a.class
 */
/* renamed from: hb.a */
/* loaded from: combined.jar:classes2.jar:hb/a.class */
public class C5056a extends CardView implements Checkable, InterfaceC9719n {

    /* renamed from: o */
    public static final int[] f29126o = {R.attr.state_checkable};

    /* renamed from: p */
    public static final int[] f29127p = {R.attr.state_checked};

    /* renamed from: q */
    public static final int[] f29128q = {C0142b.f633B};

    /* renamed from: r */
    public static final int f29129r = C0151k.f832n;

    /* renamed from: k */
    public boolean f29130k;

    /* renamed from: l */
    public boolean f29131l;

    /* renamed from: m */
    public boolean f29132m;

    /* renamed from: n */
    public a f29133n;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hb/a$a.class
     */
    /* renamed from: hb.a$a */
    /* loaded from: combined.jar:classes2.jar:hb/a$a.class */
    public interface a {
        /* renamed from: a */
        void m25290a(C5056a c5056a, boolean z10);
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    /* renamed from: e */
    public final void m25287e() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    /* renamed from: f */
    public boolean m25288f() {
        return false;
    }

    /* renamed from: g */
    public boolean m25289g() {
        return this.f29132m;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public C9716k getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29131l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (m25288f()) {
            View.mergeDrawableStates(onCreateDrawableState, f29126o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f29127p);
        }
        if (m25289g()) {
            View.mergeDrawableStates(onCreateDrawableState, f29128q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m25288f());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f29130k) {
            throw null;
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z10) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f29131l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconMargin(int i10) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i10);
        throw null;
    }

    public void setCheckedIconResource(int i10) {
        C4561b.m22999d(getContext(), i10);
        throw null;
    }

    public void setCheckedIconSize(int i10) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i10);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
    }

    public void setDragged(boolean z10) {
        if (this.f29132m != z10) {
            this.f29132m = z10;
            refreshDrawableState();
            m25287e();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        throw null;
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f29133n = aVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        throw null;
    }

    public void setProgress(float f10) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i10) {
        C4561b.m22998c(getContext(), i10);
        throw null;
    }

    @Override // p404xb.InterfaceC9719n
    public void setShapeAppearanceModel(C9716k c9716k) {
        setClipToOutline(c9716k.m40901u(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i10) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m25288f() && isEnabled()) {
            this.f29131l = !this.f29131l;
            refreshDrawableState();
            m25287e();
            a aVar = this.f29133n;
            if (aVar != null) {
                aVar.m25290a(this, this.f29131l);
            }
        }
    }
}
