package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0920a;
import p086f.C4735c;
import p106g0.C4917c;
import p235o0.C6864y0;
import p314s0.C8499g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/p0.class
 */
/* renamed from: androidx.appcompat.widget.p0 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/p0.class */
public class C0342p0 extends ListView {

    /* renamed from: b */
    public final Rect f2202b;

    /* renamed from: c */
    public int f2203c;

    /* renamed from: d */
    public int f2204d;

    /* renamed from: e */
    public int f2205e;

    /* renamed from: f */
    public int f2206f;

    /* renamed from: g */
    public int f2207g;

    /* renamed from: h */
    public Field f2208h;

    /* renamed from: i */
    public a f2209i;

    /* renamed from: j */
    public boolean f2210j;

    /* renamed from: k */
    public boolean f2211k;

    /* renamed from: l */
    public boolean f2212l;

    /* renamed from: m */
    public C6864y0 f2213m;

    /* renamed from: n */
    public C8499g f2214n;

    /* renamed from: o */
    public b f2215o;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/p0$a.class
     */
    /* renamed from: androidx.appcompat.widget.p0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/p0$a.class */
    public static class a extends C4735c {

        /* renamed from: c */
        public boolean f2216c;

        public a(Drawable drawable) {
            super(drawable);
            this.f2216c = true;
        }

        /* renamed from: c */
        public void m1558c(boolean z10) {
            this.f2216c = z10;
        }

        @Override // p086f.C4735c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f2216c) {
                super.draw(canvas);
            }
        }

        @Override // p086f.C4735c, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f2216c) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // p086f.C4735c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f2216c) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // p086f.C4735c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f2216c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p086f.C4735c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f2216c) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/p0$b.class
     */
    /* renamed from: androidx.appcompat.widget.p0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/p0$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C0342p0 f2217b;

        public b(C0342p0 c0342p0) {
            this.f2217b = c0342p0;
        }

        /* renamed from: a */
        public void m1559a() {
            C0342p0 c0342p0 = this.f2217b;
            c0342p0.f2215o = null;
            c0342p0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m1560b() {
            this.f2217b.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0342p0 c0342p0 = this.f2217b;
            c0342p0.f2215o = null;
            c0342p0.drawableStateChanged();
        }
    }

    public C0342p0(Context context, boolean z10) {
        super(context, null, C0920a.f6088C);
        this.f2202b = new Rect();
        this.f2203c = 0;
        this.f2204d = 0;
        this.f2205e = 0;
        this.f2206f = 0;
        this.f2211k = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2208h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z10) {
        a aVar = this.f2209i;
        if (aVar != null) {
            aVar.m1558c(z10);
        }
    }

    /* renamed from: a */
    public final void m1549a() {
        this.f2212l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2207g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C6864y0 c6864y0 = this.f2213m;
        if (c6864y0 != null) {
            c6864y0.m31672b();
            this.f2213m = null;
        }
    }

    /* renamed from: b */
    public final void m1550b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    /* renamed from: c */
    public final void m1551c(Canvas canvas) {
        Drawable selector;
        if (this.f2202b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f2202b);
        selector.draw(canvas);
    }

    /* renamed from: d */
    public int mo1250d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i15 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i15;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = i18;
            if (i16 >= count) {
                return i15;
            }
            int itemViewType = adapter.getItemViewType(i16);
            int i20 = i17;
            if (itemViewType != i17) {
                view = null;
                i20 = itemViewType;
            }
            View view2 = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = layoutParams;
            if (layoutParams == null) {
                layoutParams2 = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams2);
            }
            int i21 = layoutParams2.height;
            view2.measure(i10, i21 > 0 ? View.MeasureSpec.makeMeasureSpec(i21, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view2.forceLayout();
            int i22 = i15;
            if (i16 > 0) {
                i22 = i15 + dividerHeight;
            }
            i15 = i22 + view2.getMeasuredHeight();
            if (i15 >= i13) {
                int i23 = i13;
                if (i14 >= 0) {
                    i23 = i13;
                    if (i16 > i14) {
                        i23 = i13;
                        if (i19 > 0) {
                            i23 = i13;
                            if (i15 != i13) {
                                i23 = i19;
                            }
                        }
                    }
                }
                return i23;
            }
            int i24 = i19;
            if (i14 >= 0) {
                i24 = i19;
                if (i16 >= i14) {
                    i24 = i15;
                }
            }
            i16++;
            i17 = i20;
            view = view2;
            i18 = i24;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m1551c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f2215o != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m1557k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1251e(android.view.MotionEvent r7, int r8) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0342p0.mo1251e(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: f */
    public final void m1552f(int i10, View view) {
        Rect rect = this.f2202b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2203c;
        rect.top -= this.f2204d;
        rect.right += this.f2205e;
        rect.bottom += this.f2206f;
        try {
            boolean z10 = this.f2208h.getBoolean(this);
            if (view.isEnabled() != z10) {
                this.f2208h.set(this, Boolean.valueOf(!z10));
                if (i10 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void m1553g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = true;
        boolean z11 = (selector == null || i10 == -1) ? false : true;
        if (z11) {
            selector.setVisible(false, false);
        }
        m1552f(i10, view);
        if (z11) {
            Rect rect = this.f2202b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z10 = false;
            }
            selector.setVisible(z10, false);
            C4917c.m24847k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    public final void m1554h(int i10, View view, float f10, float f11) {
        m1553g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        C4917c.m24847k(selector, f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f2211k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f2211k || super.hasWindowFocus();
    }

    /* renamed from: i */
    public final void m1555i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f2212l = true;
        drawableHotspotChanged(f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f2207g;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f2207g = i10;
        view.drawableHotspotChanged(f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1554h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f2211k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f2211k && this.f2210j) || super.isInTouchMode();
    }

    /* renamed from: j */
    public final boolean m1556j() {
        return this.f2212l;
    }

    /* renamed from: k */
    public final void m1557k() {
        Drawable selector = getSelector();
        if (selector != null && m1556j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f2215o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2215o == null) {
            b bVar = new b(this);
            this.f2215o = bVar;
            bVar.m1560b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1557k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2207g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f2215o;
        if (bVar != null) {
            bVar.m1559a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f2210j = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f2209i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2203c = rect.left;
        this.f2204d = rect.top;
        this.f2205e = rect.right;
        this.f2206f = rect.bottom;
    }
}
