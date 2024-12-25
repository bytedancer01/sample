package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p235o0.C6813c1;
import p235o0.C6824g0;
import p374w0.C9395c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/h.class
 */
/* renamed from: androidx.fragment.app.h */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/h.class */
public final class C0422h extends FrameLayout {

    /* renamed from: b */
    public ArrayList<View> f2899b;

    /* renamed from: c */
    public ArrayList<View> f2900c;

    /* renamed from: d */
    public View.OnApplyWindowInsetsListener f2901d;

    /* renamed from: e */
    public boolean f2902e;

    public C0422h(Context context) {
        super(context);
        this.f2902e = true;
    }

    public C0422h(Context context, AttributeSet attributeSet, AbstractC0428n abstractC0428n) {
        super(context, attributeSet);
        String str;
        this.f2902e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9395c.f43085h);
        String string = classAttribute == null ? obtainStyledAttributes.getString(C9395c.f43086i) : classAttribute;
        String string2 = obtainStyledAttributes.getString(C9395c.f43087j);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment m2203h0 = abstractC0428n.m2203h0(id2);
        if (string != null && m2203h0 == null) {
            if (id2 <= 0) {
                if (string2 != null) {
                    str = " with tag " + string2;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + string + str);
            }
            Fragment mo2105a = abstractC0428n.m2232r0().mo2105a(context.getClassLoader(), string);
            mo2105a.onInflate(context, attributeSet, (Bundle) null);
            abstractC0428n.m2216m().m2374x(true).m2363d(this, mo2105a, string2).mo1967m();
        }
        abstractC0428n.m2176V0(this);
    }

    /* renamed from: a */
    public final void m2077a(View view) {
        ArrayList<View> arrayList = this.f2900c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2899b == null) {
            this.f2899b = new ArrayList<>();
        }
        this.f2899b.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (AbstractC0428n.m2128A0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (AbstractC0428n.m2128A0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C6813c1 m31389v = C6813c1.m31389v(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2901d;
        C6813c1 m31389v2 = onApplyWindowInsetsListener != null ? C6813c1.m31389v(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : C6824g0.m31511b0(this, m31389v);
        if (!m31389v2.m31404o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C6824g0.m31522h(getChildAt(i10), m31389v2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f2902e && this.f2899b != null) {
            for (int i10 = 0; i10 < this.f2899b.size(); i10++) {
                super.drawChild(canvas, this.f2899b.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f2902e || (arrayList = this.f2899b) == null || arrayList.size() <= 0 || !this.f2899b.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2900c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2899b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2902e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m2077a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        if (z10) {
            m2077a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m2077a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        m2077a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m2077a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            m2077a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            m2077a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f2902e = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2901d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2900c == null) {
                this.f2900c = new ArrayList<>();
            }
            this.f2900c.add(view);
        }
        super.startViewTransition(view);
    }
}
