package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0717p;
import androidx.recyclerview.widget.RecyclerView;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/b.class
 */
/* renamed from: androidx.leanback.widget.b */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/b.class */
public abstract class AbstractC0496b extends RecyclerView {

    /* renamed from: R0 */
    public final C0524m f3393R0;

    /* renamed from: S0 */
    public boolean f3394S0;

    /* renamed from: T0 */
    public boolean f3395T0;

    /* renamed from: U0 */
    public RecyclerView.AbstractC0682m f3396U0;

    /* renamed from: V0 */
    public d f3397V0;

    /* renamed from: W0 */
    public c f3398W0;

    /* renamed from: X0 */
    public b f3399X0;

    /* renamed from: Y0 */
    public RecyclerView.InterfaceC0693x f3400Y0;

    /* renamed from: Z0 */
    public e f3401Z0;

    /* renamed from: a1 */
    public int f3402a1;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/b$a.class
     */
    /* renamed from: androidx.leanback.widget.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/b$a.class */
    public class a implements RecyclerView.InterfaceC0693x {

        /* renamed from: a */
        public final AbstractC0496b f3403a;

        public a(AbstractC0496b abstractC0496b) {
            this.f3403a = abstractC0496b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0693x
        /* renamed from: a */
        public void mo2559a(RecyclerView.AbstractC0674e0 abstractC0674e0) {
            this.f3403a.f3393R0.m2726F3(abstractC0674e0);
            RecyclerView.InterfaceC0693x interfaceC0693x = this.f3403a.f3400Y0;
            if (interfaceC0693x != null) {
                interfaceC0693x.mo2559a(abstractC0674e0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/b$b.class
     */
    /* renamed from: androidx.leanback.widget.b$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/b$b.class */
    public interface b {
        /* renamed from: a */
        boolean m2560a(KeyEvent keyEvent);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/b$c.class
     */
    /* renamed from: androidx.leanback.widget.b$c */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/b$c.class */
    public interface c {
        /* renamed from: a */
        boolean m2561a(MotionEvent motionEvent);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/b$d.class
     */
    /* renamed from: androidx.leanback.widget.b$d */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/b$d.class */
    public interface d {
        /* renamed from: a */
        boolean m2562a(MotionEvent motionEvent);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/b$e.class
     */
    /* renamed from: androidx.leanback.widget.b$e */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/b$e.class */
    public interface e {
        /* renamed from: a */
        boolean mo2563a(KeyEvent keyEvent);
    }

    public AbstractC0496b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3394S0 = true;
        this.f3395T0 = true;
        this.f3402a1 = 4;
        C0524m c0524m = new C0524m(this);
        this.f3393R0 = c0524m;
        setLayoutManager(c0524m);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((AbstractC0717p) getItemAnimator()).m4670R(false);
        super.setRecyclerListener(new a(this));
    }

    /* renamed from: D1 */
    public void m2554D1(View view, int[] iArr) {
        this.f3393R0.m2810j3(view, iArr);
    }

    /* renamed from: E1 */
    public void m2555E1(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9799l.f45033A);
        this.f3393R0.m2785a4(obtainStyledAttributes.getBoolean(C9799l.f45038F, false), obtainStyledAttributes.getBoolean(C9799l.f45037E, false));
        this.f3393R0.m2789b4(obtainStyledAttributes.getBoolean(C9799l.f45040H, true), obtainStyledAttributes.getBoolean(C9799l.f45039G, true));
        this.f3393R0.m2874y4(obtainStyledAttributes.getDimensionPixelSize(C9799l.f45036D, obtainStyledAttributes.getDimensionPixelSize(C9799l.f45042J, 0)));
        this.f3393R0.m2799f4(obtainStyledAttributes.getDimensionPixelSize(C9799l.f45035C, obtainStyledAttributes.getDimensionPixelSize(C9799l.f45041I, 0)));
        int i10 = C9799l.f45034B;
        if (obtainStyledAttributes.hasValue(i10)) {
            setGravity(obtainStyledAttributes.getInt(i10, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: F1 */
    public final boolean m2556F1() {
        return isChildrenDrawingOrderEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        c cVar = this.f3398W0;
        if (cVar == null || !cVar.m2561a(motionEvent)) {
            return super.dispatchGenericFocusedEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar = this.f3399X0;
        boolean z10 = true;
        if ((bVar != null && bVar.m2560a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        e eVar = this.f3401Z0;
        if (eVar == null || !eVar.mo2563a(keyEvent)) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.f3397V0;
        if (dVar == null || !dVar.m2562a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public View focusSearch(int i10) {
        C0524m c0524m;
        View mo3812a0;
        return (!isFocused() || (mo3812a0 = (c0524m = this.f3393R0).mo3812a0(c0524m.m2770U2())) == null) ? super.focusSearch(i10) : focusSearch(mo3812a0, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return this.f3393R0.m2711B2(this, i10, i11);
    }

    public int getExtraLayoutSpace() {
        return this.f3393R0.m2722E2();
    }

    public int getFocusScrollStrategy() {
        return this.f3393R0.m2728G2();
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.f3393R0.m2733H2();
    }

    public int getHorizontalSpacing() {
        return this.f3393R0.m2733H2();
    }

    public int getInitialPrefetchItemCount() {
        return this.f3402a1;
    }

    public int getItemAlignmentOffset() {
        return this.f3393R0.m2737I2();
    }

    public float getItemAlignmentOffsetPercent() {
        return this.f3393R0.m2740J2();
    }

    public int getItemAlignmentViewId() {
        return this.f3393R0.m2743K2();
    }

    public e getOnUnhandledKeyListener() {
        return this.f3401Z0;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.f3393R0.f3509g0.m2587c();
    }

    public final int getSaveChildrenPolicy() {
        return this.f3393R0.f3509g0.m2588d();
    }

    public int getSelectedPosition() {
        return this.f3393R0.m2770U2();
    }

    public int getSelectedSubPosition() {
        return this.f3393R0.m2779Y2();
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.f3393R0.m2784a3();
    }

    public int getVerticalSpacing() {
        return this.f3393R0.m2784a3();
    }

    public int getWindowAlignment() {
        return this.f3393R0.m2813k3();
    }

    public int getWindowAlignmentOffset() {
        return this.f3393R0.m2818l3();
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.f3393R0.m2823m3();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f3395T0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: n1 */
    public void mo2557n1(int i10) {
        if (this.f3393R0.m2869x3()) {
            this.f3393R0.m2870x4(i10, 0, 0);
        } else {
            super.mo2557n1(i10);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.f3393R0.m2729G3(z10, i10, rect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        return this.f3393R0.m2828n3(this, i10, rect);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        this.f3393R0.m2734H3(i10);
    }

    public void setAnimateChildLayout(boolean z10) {
        RecyclerView.AbstractC0682m abstractC0682m;
        if (this.f3394S0 != z10) {
            this.f3394S0 = z10;
            if (z10) {
                abstractC0682m = this.f3396U0;
            } else {
                this.f3396U0 = getItemAnimator();
                abstractC0682m = null;
            }
            super.setItemAnimator(abstractC0682m);
        }
    }

    public void setChildrenVisibility(int i10) {
        this.f3393R0.m2780Y3(i10);
    }

    public void setExtraLayoutSpace(int i10) {
        this.f3393R0.m2782Z3(i10);
    }

    public void setFocusDrawingOrderEnabled(boolean z10) {
        super.setChildrenDrawingOrderEnabled(z10);
    }

    public void setFocusScrollStrategy(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.f3393R0.m2792c4(i10);
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z10) {
        setDescendantFocusability(z10 ? 393216 : 262144);
        this.f3393R0.m2795d4(z10);
    }

    public void setGravity(int i10) {
        this.f3393R0.m2797e4(i10);
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z10) {
        this.f3395T0 = z10;
    }

    @Deprecated
    public void setHorizontalMargin(int i10) {
        setHorizontalSpacing(i10);
    }

    public void setHorizontalSpacing(int i10) {
        this.f3393R0.m2799f4(i10);
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.f3402a1 = i10;
    }

    public void setItemAlignmentOffset(int i10) {
        this.f3393R0.m2802g4(i10);
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f10) {
        this.f3393R0.m2805h4(f10);
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z10) {
        this.f3393R0.m2808i4(z10);
        requestLayout();
    }

    public void setItemAlignmentViewId(int i10) {
        this.f3393R0.m2811j4(i10);
    }

    @Deprecated
    public void setItemMargin(int i10) {
        setItemSpacing(i10);
    }

    public void setItemSpacing(int i10) {
        this.f3393R0.m2814k4(i10);
        requestLayout();
    }

    public void setLayoutEnabled(boolean z10) {
        this.f3393R0.m2819l4(z10);
    }

    public void setOnChildLaidOutListener(InterfaceC0497b0 interfaceC0497b0) {
        this.f3393R0.m2829n4(interfaceC0497b0);
    }

    public void setOnChildSelectedListener(InterfaceC0500c0 interfaceC0500c0) {
        this.f3393R0.m2834o4(interfaceC0500c0);
    }

    public void setOnChildViewHolderSelectedListener(AbstractC0503d0 abstractC0503d0) {
        this.f3393R0.m2838p4(abstractC0503d0);
    }

    public void setOnKeyInterceptListener(b bVar) {
        this.f3399X0 = bVar;
    }

    public void setOnMotionInterceptListener(c cVar) {
        this.f3398W0 = cVar;
    }

    public void setOnTouchInterceptListener(d dVar) {
        this.f3397V0 = dVar;
    }

    public void setOnUnhandledKeyListener(e eVar) {
        this.f3401Z0 = eVar;
    }

    public void setPruneChild(boolean z10) {
        this.f3393R0.m2847r4(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(RecyclerView.InterfaceC0693x interfaceC0693x) {
        this.f3400Y0 = interfaceC0693x;
    }

    public final void setSaveChildrenLimitNumber(int i10) {
        this.f3393R0.f3509g0.m2596m(i10);
    }

    public final void setSaveChildrenPolicy(int i10) {
        this.f3393R0.f3509g0.m2597n(i10);
    }

    public void setScrollEnabled(boolean z10) {
        this.f3393R0.m2855t4(z10);
    }

    public void setSelectedPosition(int i10) {
        this.f3393R0.m2859u4(i10, 0);
    }

    public void setSelectedPositionSmooth(int i10) {
        this.f3393R0.m2867w4(i10);
    }

    @Deprecated
    public void setVerticalMargin(int i10) {
        setVerticalSpacing(i10);
    }

    public void setVerticalSpacing(int i10) {
        this.f3393R0.m2874y4(i10);
        requestLayout();
    }

    public void setWindowAlignment(int i10) {
        this.f3393R0.m2878z4(i10);
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i10) {
        this.f3393R0.m2710A4(i10);
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f10) {
        this.f3393R0.m2713B4(f10);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z10) {
        this.f3393R0.f3504b0.m2603a().m2629u(z10);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z10) {
        this.f3393R0.f3504b0.m2603a().m2630v(z10);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: v1 */
    public void mo2558v1(int i10) {
        if (this.f3393R0.m2869x3()) {
            this.f3393R0.m2870x4(i10, 0, 0);
        } else {
            super.mo2558v1(i10);
        }
    }
}
