package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.achartengine.renderer.DefaultRenderer;
import p001a0.C0002a;
import p001a0.C0003b;
import p050d0.C4290b;
import p106g0.C4917c;
import p221n0.C6611c;
import p221n0.C6615g;
import p221n0.InterfaceC6613e;
import p235o0.C6813c1;
import p235o0.C6820f;
import p235o0.C6824g0;
import p235o0.C6857v;
import p235o0.InterfaceC6853t;
import p235o0.InterfaceC6855u;
import p235o0.InterfaceC6859w;
import p341u0.AbstractC8783a;
import p431z.C10025a;
import p431z.C10026b;
import p431z.C10027c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout.class */
public class CoordinatorLayout extends ViewGroup implements InterfaceC6853t, InterfaceC6855u {

    /* renamed from: v */
    public static final String f2599v;

    /* renamed from: w */
    public static final Class<?>[] f2600w;

    /* renamed from: x */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0381c>>> f2601x;

    /* renamed from: y */
    public static final Comparator<View> f2602y;

    /* renamed from: z */
    public static final InterfaceC6613e<Rect> f2603z;

    /* renamed from: b */
    public final List<View> f2604b;

    /* renamed from: c */
    public final C0002a<View> f2605c;

    /* renamed from: d */
    public final List<View> f2606d;

    /* renamed from: e */
    public final List<View> f2607e;

    /* renamed from: f */
    public Paint f2608f;

    /* renamed from: g */
    public final int[] f2609g;

    /* renamed from: h */
    public final int[] f2610h;

    /* renamed from: i */
    public boolean f2611i;

    /* renamed from: j */
    public boolean f2612j;

    /* renamed from: k */
    public int[] f2613k;

    /* renamed from: l */
    public View f2614l;

    /* renamed from: m */
    public View f2615m;

    /* renamed from: n */
    public ViewTreeObserverOnPreDrawListenerC0385g f2616n;

    /* renamed from: o */
    public boolean f2617o;

    /* renamed from: p */
    public C6813c1 f2618p;

    /* renamed from: q */
    public boolean f2619q;

    /* renamed from: r */
    public Drawable f2620r;

    /* renamed from: s */
    public ViewGroup.OnHierarchyChangeListener f2621s;

    /* renamed from: t */
    public InterfaceC6859w f2622t;

    /* renamed from: u */
    public final C6857v f2623u;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$a.class
     */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$a.class */
    public class C0379a implements InterfaceC6859w {

        /* renamed from: a */
        public final CoordinatorLayout f2624a;

        public C0379a(CoordinatorLayout coordinatorLayout) {
            this.f2624a = coordinatorLayout;
        }

        @Override // p235o0.InterfaceC6859w
        /* renamed from: a */
        public C6813c1 mo1813a(View view, C6813c1 c6813c1) {
            return this.f2624a.m1793X(c6813c1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$b.class
     */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$b.class */
    public interface InterfaceC0380b {
        AbstractC0381c getBehavior();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$c.class
     */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$c.class */
    public static abstract class AbstractC0381c<V extends View> {
        public AbstractC0381c() {
        }

        public AbstractC0381c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo1814A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return m1843z(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void m1815B(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        /* renamed from: C */
        public void mo1816C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                m1815B(coordinatorLayout, v10, view);
            }
        }

        /* renamed from: D */
        public boolean mo1817D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m1818a(CoordinatorLayout coordinatorLayout, V v10) {
            return m1821d(coordinatorLayout, v10) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo1819b(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int m1820c(CoordinatorLayout coordinatorLayout, V v10) {
            return DefaultRenderer.BACKGROUND_COLOR;
        }

        /* renamed from: d */
        public float m1821d(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo1822e(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        /* renamed from: f */
        public C6813c1 m1823f(CoordinatorLayout coordinatorLayout, V v10, C6813c1 c6813c1) {
            return c6813c1;
        }

        /* renamed from: g */
        public void mo1824g(C0384f c0384f) {
        }

        /* renamed from: h */
        public boolean mo1825h(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo1826i(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        /* renamed from: j */
        public void mo1827j() {
        }

        /* renamed from: k */
        public boolean mo1828k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo1829l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        /* renamed from: m */
        public boolean mo1830m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        /* renamed from: n */
        public boolean m1831n(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        /* renamed from: o */
        public boolean mo1832o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void m1833p(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        /* renamed from: q */
        public void mo1834q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                m1833p(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void m1835r(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        /* renamed from: s */
        public void m1836s(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                m1835r(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        /* renamed from: t */
        public void mo1837t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            m1836s(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        /* renamed from: u */
        public void m1838u(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        /* renamed from: v */
        public void m1839v(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                m1838u(coordinatorLayout, v10, view, view2, i10);
            }
        }

        /* renamed from: w */
        public boolean mo1840w(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        /* renamed from: x */
        public void mo1841x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo1842y(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean m1843z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$d.class
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$d.class */
    public @interface InterfaceC0382d {
        Class<? extends AbstractC0381c> value();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$e.class
     */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$e.class */
    public class ViewGroupOnHierarchyChangeListenerC0383e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public final CoordinatorLayout f2625b;

        public ViewGroupOnHierarchyChangeListenerC0383e(CoordinatorLayout coordinatorLayout) {
            this.f2625b = coordinatorLayout;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2625b.f2621s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            this.f2625b.m1783I(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2625b.f2621s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$f.class
     */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$f.class */
    public static class C0384f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC0381c f2626a;

        /* renamed from: b */
        public boolean f2627b;

        /* renamed from: c */
        public int f2628c;

        /* renamed from: d */
        public int f2629d;

        /* renamed from: e */
        public int f2630e;

        /* renamed from: f */
        public int f2631f;

        /* renamed from: g */
        public int f2632g;

        /* renamed from: h */
        public int f2633h;

        /* renamed from: i */
        public int f2634i;

        /* renamed from: j */
        public int f2635j;

        /* renamed from: k */
        public View f2636k;

        /* renamed from: l */
        public View f2637l;

        /* renamed from: m */
        public boolean f2638m;

        /* renamed from: n */
        public boolean f2639n;

        /* renamed from: o */
        public boolean f2640o;

        /* renamed from: p */
        public boolean f2641p;

        /* renamed from: q */
        public final Rect f2642q;

        /* renamed from: r */
        public Object f2643r;

        public C0384f(int i10, int i11) {
            super(i10, i11);
            this.f2627b = false;
            this.f2628c = 0;
            this.f2629d = 0;
            this.f2630e = -1;
            this.f2631f = -1;
            this.f2632g = 0;
            this.f2633h = 0;
            this.f2642q = new Rect();
        }

        public C0384f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2627b = false;
            this.f2628c = 0;
            this.f2629d = 0;
            this.f2630e = -1;
            this.f2631f = -1;
            this.f2632g = 0;
            this.f2633h = 0;
            this.f2642q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10027c.f45984e);
            this.f2628c = obtainStyledAttributes.getInteger(C10027c.f45985f, 0);
            this.f2631f = obtainStyledAttributes.getResourceId(C10027c.f45986g, -1);
            this.f2629d = obtainStyledAttributes.getInteger(C10027c.f45987h, 0);
            this.f2630e = obtainStyledAttributes.getInteger(C10027c.f45991l, -1);
            this.f2632g = obtainStyledAttributes.getInt(C10027c.f45990k, 0);
            this.f2633h = obtainStyledAttributes.getInt(C10027c.f45989j, 0);
            int i10 = C10027c.f45988i;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f2627b = hasValue;
            if (hasValue) {
                this.f2626a = CoordinatorLayout.m1768L(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            AbstractC0381c abstractC0381c = this.f2626a;
            if (abstractC0381c != null) {
                abstractC0381c.mo1824g(this);
            }
        }

        public C0384f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2627b = false;
            this.f2628c = 0;
            this.f2629d = 0;
            this.f2630e = -1;
            this.f2631f = -1;
            this.f2632g = 0;
            this.f2633h = 0;
            this.f2642q = new Rect();
        }

        public C0384f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2627b = false;
            this.f2628c = 0;
            this.f2629d = 0;
            this.f2630e = -1;
            this.f2631f = -1;
            this.f2632g = 0;
            this.f2633h = 0;
            this.f2642q = new Rect();
        }

        public C0384f(C0384f c0384f) {
            super((ViewGroup.MarginLayoutParams) c0384f);
            this.f2627b = false;
            this.f2628c = 0;
            this.f2629d = 0;
            this.f2630e = -1;
            this.f2631f = -1;
            this.f2632g = 0;
            this.f2633h = 0;
            this.f2642q = new Rect();
        }

        /* renamed from: a */
        public boolean m1844a() {
            return this.f2636k == null && this.f2631f != -1;
        }

        /* renamed from: b */
        public boolean m1845b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0381c abstractC0381c;
            return view2 == this.f2637l || m1862s(view2, C6824g0.m31473C(coordinatorLayout)) || ((abstractC0381c = this.f2626a) != null && abstractC0381c.mo1822e(coordinatorLayout, view, view2));
        }

        /* renamed from: c */
        public boolean m1846c() {
            if (this.f2626a == null) {
                this.f2638m = false;
            }
            return this.f2638m;
        }

        /* renamed from: d */
        public View m1847d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2631f == -1) {
                this.f2637l = null;
                this.f2636k = null;
                return null;
            }
            if (this.f2636k == null || !m1863t(view, coordinatorLayout)) {
                m1857n(view, coordinatorLayout);
            }
            return this.f2636k;
        }

        /* renamed from: e */
        public int m1848e() {
            return this.f2631f;
        }

        /* renamed from: f */
        public AbstractC0381c m1849f() {
            return this.f2626a;
        }

        /* renamed from: g */
        public boolean m1850g() {
            return this.f2641p;
        }

        /* renamed from: h */
        public Rect m1851h() {
            return this.f2642q;
        }

        /* renamed from: i */
        public boolean m1852i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f2638m;
            if (z10) {
                return true;
            }
            AbstractC0381c abstractC0381c = this.f2626a;
            boolean m1818a = (abstractC0381c != null ? abstractC0381c.m1818a(coordinatorLayout, view) : false) | z10;
            this.f2638m = m1818a;
            return m1818a;
        }

        /* renamed from: j */
        public boolean m1853j(int i10) {
            if (i10 == 0) {
                return this.f2639n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f2640o;
        }

        /* renamed from: k */
        public void m1854k() {
            this.f2641p = false;
        }

        /* renamed from: l */
        public void m1855l(int i10) {
            m1861r(i10, false);
        }

        /* renamed from: m */
        public void m1856m() {
            this.f2638m = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
        /* renamed from: n */
        public final void m1857n(View view, CoordinatorLayout coordinatorLayout) {
            CoordinatorLayout findViewById = coordinatorLayout.findViewById(this.f2631f);
            this.f2636k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (true) {
                        CoordinatorLayout coordinatorLayout2 = parent;
                        if (coordinatorLayout2 == coordinatorLayout || coordinatorLayout2 == null) {
                            break;
                        }
                        if (coordinatorLayout2 != view) {
                            if (coordinatorLayout2 instanceof View) {
                                findViewById = coordinatorLayout2;
                            }
                            parent = coordinatorLayout2.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2637l = findViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2631f) + " to anchor view " + view);
            }
            this.f2637l = null;
            this.f2636k = null;
        }

        /* renamed from: o */
        public void m1858o(AbstractC0381c abstractC0381c) {
            AbstractC0381c abstractC0381c2 = this.f2626a;
            if (abstractC0381c2 != abstractC0381c) {
                if (abstractC0381c2 != null) {
                    abstractC0381c2.mo1827j();
                }
                this.f2626a = abstractC0381c;
                this.f2643r = null;
                this.f2627b = true;
                if (abstractC0381c != null) {
                    abstractC0381c.mo1824g(this);
                }
            }
        }

        /* renamed from: p */
        public void m1859p(boolean z10) {
            this.f2641p = z10;
        }

        /* renamed from: q */
        public void m1860q(Rect rect) {
            this.f2642q.set(rect);
        }

        /* renamed from: r */
        public void m1861r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f2639n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f2640o = z10;
            }
        }

        /* renamed from: s */
        public final boolean m1862s(View view, int i10) {
            int m31460b = C6820f.m31460b(((C0384f) view.getLayoutParams()).f2632g, i10);
            return m31460b != 0 && (C6820f.m31460b(this.f2633h, i10) & m31460b) == m31460b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        
            r3.f2637l = null;
            r3.f2636k = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        
            return false;
         */
        /* renamed from: t */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m1863t(android.view.View r4, androidx.coordinatorlayout.widget.CoordinatorLayout r5) {
            /*
                r3 = this;
                r0 = r3
                android.view.View r0 = r0.f2636k
                int r0 = r0.getId()
                r1 = r3
                int r1 = r1.f2631f
                if (r0 == r1) goto L10
                r0 = 0
                return r0
            L10:
                r0 = r3
                android.view.View r0 = r0.f2636k
                r7 = r0
                r0 = r7
                android.view.ViewParent r0 = r0.getParent()
                r6 = r0
            L1c:
                r0 = r6
                r1 = r5
                if (r0 == r1) goto L50
                r0 = r6
                if (r0 == 0) goto L44
                r0 = r6
                r1 = r4
                if (r0 != r1) goto L2d
                goto L44
            L2d:
                r0 = r6
                boolean r0 = r0 instanceof android.view.View
                if (r0 == 0) goto L3a
                r0 = r6
                android.view.View r0 = (android.view.View) r0
                r7 = r0
            L3a:
                r0 = r6
                android.view.ViewParent r0 = r0.getParent()
                r6 = r0
                goto L1c
            L44:
                r0 = r3
                r1 = 0
                r0.f2637l = r1
                r0 = r3
                r1 = 0
                r0.f2636k = r1
                r0 = 0
                return r0
            L50:
                r0 = r3
                r1 = r7
                r0.f2637l = r1
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0384f.m1863t(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$g.class
     */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$g.class */
    public class ViewTreeObserverOnPreDrawListenerC0385g implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final CoordinatorLayout f2644b;

        public ViewTreeObserverOnPreDrawListenerC0385g(CoordinatorLayout coordinatorLayout) {
            this.f2644b = coordinatorLayout;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f2644b.m1783I(0);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$h.class
     */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$h.class */
    public static class C0386h extends AbstractC8783a {
        public static final Parcelable.Creator<C0386h> CREATOR = new a();

        /* renamed from: d */
        public SparseArray<Parcelable> f2645d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$h$a.class
         */
        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$h$a.class */
        public static final class a implements Parcelable.ClassLoaderCreator<C0386h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0386h createFromParcel(Parcel parcel) {
                return new C0386h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0386h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0386h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0386h[] newArray(int i10) {
                return new C0386h[i10];
            }
        }

        public C0386h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2645d = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f2645d.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public C0386h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p341u0.AbstractC8783a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f2645d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f2645d.keyAt(i11);
                parcelableArr[i11] = this.f2645d.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$i.class
     */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    /* loaded from: combined.jar:classes1.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$i.class */
    public static class C0387i implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float m31496O = C6824g0.m31496O(view);
            float m31496O2 = C6824g0.m31496O(view2);
            if (m31496O > m31496O2) {
                return -1;
            }
            return m31496O < m31496O2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2599v = r02 != null ? r02.getName() : null;
        f2602y = new C0387i();
        f2600w = new Class[]{Context.class, AttributeSet.class};
        f2601x = new ThreadLocal<>();
        f2603z = new C6615g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10025a.f45978a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2604b = new ArrayList();
        this.f2605c = new C0002a<>();
        this.f2606d = new ArrayList();
        this.f2607e = new ArrayList();
        this.f2609g = new int[2];
        this.f2610h = new int[2];
        this.f2623u = new C6857v(this);
        int[] iArr = C10027c.f45981b;
        TypedArray obtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, C10026b.f45979a) : context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = C10027c.f45981b;
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, C10026b.f45979a);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C10027c.f45982c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2613k = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f2613k.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f2613k[i11] = (int) (r0[i11] * f10);
            }
        }
        this.f2620r = obtainStyledAttributes.getDrawable(C10027c.f45983d);
        obtainStyledAttributes.recycle();
        m1794Y();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0383e(this));
        if (C6824g0.m31469A(this) == 0) {
            C6824g0.m31557y0(this, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public static AbstractC0381c m1768L(Context context, AttributeSet attributeSet, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(InstructionFileId.DOT)) {
            str2 = context.getPackageName() + str;
        } else if (str.indexOf(46) >= 0) {
            str2 = str;
        } else {
            String str3 = f2599v;
            str2 = str;
            if (!TextUtils.isEmpty(str3)) {
                str2 = str3 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0381c>>> threadLocal = f2601x;
            Map<String, Constructor<AbstractC0381c>> map = threadLocal.get();
            Map<String, Constructor<AbstractC0381c>> map2 = map;
            if (map == null) {
                map2 = new HashMap<>();
                threadLocal.set(map2);
            }
            Constructor<AbstractC0381c> constructor = map2.get(str2);
            Constructor<AbstractC0381c> constructor2 = constructor;
            if (constructor == null) {
                constructor2 = Class.forName(str2, false, context.getClassLoader()).getConstructor(f2600w);
                constructor2.setAccessible(true);
                map2.put(str2, constructor2);
            }
            return constructor2.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str2, e10);
        }
    }

    /* renamed from: P */
    public static void m1769P(Rect rect) {
        rect.setEmpty();
        f2603z.mo30520a(rect);
    }

    /* renamed from: S */
    public static int m1770S(int i10) {
        int i11 = i10;
        if (i10 == 0) {
            i11 = 17;
        }
        return i11;
    }

    /* renamed from: T */
    public static int m1771T(int i10) {
        int i11 = i10;
        if ((i10 & 7) == 0) {
            i11 = i10 | 8388611;
        }
        int i12 = i11;
        if ((i11 & 112) == 0) {
            i12 = i11 | 48;
        }
        return i12;
    }

    /* renamed from: U */
    public static int m1772U(int i10) {
        int i11 = i10;
        if (i10 == 0) {
            i11 = 8388661;
        }
        return i11;
    }

    /* renamed from: a */
    public static Rect m1773a() {
        Rect mo30521b = f2603z.mo30521b();
        Rect rect = mo30521b;
        if (mo30521b == null) {
            rect = new Rect();
        }
        return rect;
    }

    /* renamed from: d */
    public static int m1774d(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    /* renamed from: A */
    public final void m1775A(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f2602y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: B */
    public final boolean m1776B(View view) {
        return this.f2605c.m15j(view);
    }

    /* renamed from: C */
    public boolean m1777C(View view, int i10, int i11) {
        Rect m1773a = m1773a();
        m1807u(view, m1773a);
        try {
            return m1773a.contains(i10, i11);
        } finally {
            m1769P(m1773a);
        }
    }

    /* renamed from: D */
    public final void m1778D(View view, int i10) {
        C0384f c0384f = (C0384f) view.getLayoutParams();
        Rect m1773a = m1773a();
        m1773a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0384f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0384f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0384f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0384f).bottomMargin);
        if (this.f2618p != null && C6824g0.m31558z(this) && !C6824g0.m31558z(view)) {
            m1773a.left += this.f2618p.m31400j();
            m1773a.top += this.f2618p.m31402l();
            m1773a.right -= this.f2618p.m31401k();
            m1773a.bottom -= this.f2618p.m31399i();
        }
        Rect m1773a2 = m1773a();
        C6820f.m31459a(m1771T(c0384f.f2628c), view.getMeasuredWidth(), view.getMeasuredHeight(), m1773a, m1773a2, i10);
        view.layout(m1773a2.left, m1773a2.top, m1773a2.right, m1773a2.bottom);
        m1769P(m1773a);
        m1769P(m1773a2);
    }

    /* renamed from: E */
    public final void m1779E(View view, View view2, int i10) {
        Rect m1773a = m1773a();
        Rect m1773a2 = m1773a();
        try {
            m1807u(view2, m1773a);
            m1808v(view, i10, m1773a, m1773a2);
            view.layout(m1773a2.left, m1773a2.top, m1773a2.right, m1773a2.bottom);
        } finally {
            m1769P(m1773a);
            m1769P(m1773a2);
        }
    }

    /* renamed from: F */
    public final void m1780F(View view, int i10, int i11) {
        C0384f c0384f = (C0384f) view.getLayoutParams();
        int m31460b = C6820f.m31460b(m1772U(c0384f.f2628c), i11);
        int i12 = m31460b & 7;
        int i13 = m31460b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i14 = i10;
        if (i11 == 1) {
            i14 = width - i10;
        }
        int m1810x = m1810x(i14) - measuredWidth;
        int i15 = 0;
        if (i12 == 1) {
            m1810x += measuredWidth / 2;
        } else if (i12 == 5) {
            m1810x += measuredWidth;
        }
        if (i13 == 16) {
            i15 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i15 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0384f).leftMargin, Math.min(m1810x, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0384f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0384f).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0384f).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: G */
    public final void m1781G(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (C6824g0.m31502U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0384f c0384f = (C0384f) view.getLayoutParams();
            AbstractC0381c m1849f = c0384f.m1849f();
            Rect m1773a = m1773a();
            Rect m1773a2 = m1773a();
            m1773a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m1849f == null || !m1849f.mo1819b(this, view, m1773a)) {
                m1773a.set(m1773a2);
            } else if (!m1773a2.contains(m1773a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m1773a.toShortString() + " | Bounds:" + m1773a2.toShortString());
            }
            m1769P(m1773a2);
            if (m1773a.isEmpty()) {
                m1769P(m1773a);
                return;
            }
            int m31460b = C6820f.m31460b(c0384f.f2633h, i10);
            if ((m31460b & 48) != 48 || (i14 = (m1773a.top - ((ViewGroup.MarginLayoutParams) c0384f).topMargin) - c0384f.f2635j) >= (i15 = rect.top)) {
                z10 = false;
            } else {
                m1792W(view, i15 - i14);
                z10 = true;
            }
            boolean z12 = z10;
            if ((m31460b & 80) == 80) {
                int height = ((getHeight() - m1773a.bottom) - ((ViewGroup.MarginLayoutParams) c0384f).bottomMargin) + c0384f.f2635j;
                int i16 = rect.bottom;
                z12 = z10;
                if (height < i16) {
                    m1792W(view, height - i16);
                    z12 = true;
                }
            }
            if (!z12) {
                m1792W(view, 0);
            }
            if ((m31460b & 3) != 3 || (i12 = (m1773a.left - ((ViewGroup.MarginLayoutParams) c0384f).leftMargin) - c0384f.f2634i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                m1791V(view, i13 - i12);
                z11 = true;
            }
            if ((m31460b & 5) == 5 && (width = ((getWidth() - m1773a.right) - ((ViewGroup.MarginLayoutParams) c0384f).rightMargin) + c0384f.f2634i) < (i11 = rect.right)) {
                m1791V(view, width - i11);
                z11 = true;
            }
            if (!z11) {
                m1791V(view, 0);
            }
            m1769P(m1773a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x006a, code lost:
    
        if (r0.top != r0.top) goto L8;
     */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1782H(android.view.View r10, int r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m1782H(android.view.View, int):void");
    }

    /* renamed from: I */
    public final void m1783I(int i10) {
        boolean z10;
        int m31473C = C6824g0.m31473C(this);
        int size = this.f2604b.size();
        Rect m1773a = m1773a();
        Rect m1773a2 = m1773a();
        Rect m1773a3 = m1773a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f2604b.get(i11);
            C0384f c0384f = (C0384f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (c0384f.f2637l == this.f2604b.get(i12)) {
                        m1782H(view, m31473C);
                    }
                }
                m1804r(view, true, m1773a2);
                if (c0384f.f2632g != 0 && !m1773a2.isEmpty()) {
                    int m31460b = C6820f.m31460b(c0384f.f2632g, m31473C);
                    int i13 = m31460b & 112;
                    if (i13 == 48) {
                        m1773a.top = Math.max(m1773a.top, m1773a2.bottom);
                    } else if (i13 == 80) {
                        m1773a.bottom = Math.max(m1773a.bottom, getHeight() - m1773a2.top);
                    }
                    int i14 = m31460b & 7;
                    if (i14 == 3) {
                        m1773a.left = Math.max(m1773a.left, m1773a2.right);
                    } else if (i14 == 5) {
                        m1773a.right = Math.max(m1773a.right, getWidth() - m1773a2.left);
                    }
                }
                if (c0384f.f2633h != 0 && view.getVisibility() == 0) {
                    m1781G(view, m1773a, m31473C);
                }
                if (i10 != 2) {
                    m1811y(view, m1773a3);
                    if (!m1773a3.equals(m1773a2)) {
                        m1788O(view, m1773a2);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = this.f2604b.get(i15);
                    C0384f c0384f2 = (C0384f) view2.getLayoutParams();
                    AbstractC0381c m1849f = c0384f2.m1849f();
                    if (m1849f != null && m1849f.mo1822e(this, view2, view)) {
                        if (i10 == 0 && c0384f2.m1850g()) {
                            c0384f2.m1854k();
                        } else {
                            if (i10 != 2) {
                                z10 = m1849f.mo1825h(this, view2, view);
                            } else {
                                m1849f.mo1826i(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                c0384f2.m1859p(z10);
                            }
                        }
                    }
                }
            }
        }
        m1769P(m1773a);
        m1769P(m1773a2);
        m1769P(m1773a3);
    }

    /* renamed from: J */
    public void m1784J(View view, int i10) {
        C0384f c0384f = (C0384f) view.getLayoutParams();
        if (c0384f.m1844a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c0384f.f2636k;
        if (view2 != null) {
            m1779E(view, view2, i10);
            return;
        }
        int i11 = c0384f.f2630e;
        if (i11 >= 0) {
            m1780F(view, i11, i10);
        } else {
            m1778D(view, i10);
        }
    }

    /* renamed from: K */
    public void m1785K(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* renamed from: M */
    public final boolean m1786M(MotionEvent motionEvent, int i10) {
        boolean z10;
        MotionEvent motionEvent2;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2606d;
        m1775A(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        int i11 = 0;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            boolean z15 = z14;
            z10 = z13;
            if (i11 >= size) {
                break;
            }
            View view = list.get(i11);
            C0384f c0384f = (C0384f) view.getLayoutParams();
            AbstractC0381c m1849f = c0384f.m1849f();
            if ((z13 || z15) && actionMasked != 0) {
                motionEvent2 = motionEvent3;
                z11 = z13;
                z12 = z15;
                if (m1849f != null) {
                    motionEvent2 = motionEvent3;
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 == 0) {
                        m1849f.mo1828k(this, view, motionEvent2);
                        z11 = z13;
                        z12 = z15;
                    } else if (i10 != 1) {
                        z11 = z13;
                        z12 = z15;
                    } else {
                        m1849f.mo1817D(this, view, motionEvent2);
                        z11 = z13;
                        z12 = z15;
                    }
                }
            } else {
                z10 = z13;
                if (!z13) {
                    z10 = z13;
                    if (m1849f != null) {
                        if (i10 == 0) {
                            z13 = m1849f.mo1828k(this, view, motionEvent);
                        } else if (i10 == 1) {
                            z13 = m1849f.mo1817D(this, view, motionEvent);
                        }
                        z10 = z13;
                        if (z13) {
                            this.f2614l = view;
                            z10 = z13;
                        }
                    }
                }
                boolean m1846c = c0384f.m1846c();
                boolean m1852i = c0384f.m1852i(this, view);
                boolean z16 = m1852i && !m1846c;
                motionEvent2 = motionEvent3;
                z11 = z10;
                z12 = z16;
                if (m1852i) {
                    motionEvent2 = motionEvent3;
                    z11 = z10;
                    z12 = z16;
                    if (!z16) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i11++;
            motionEvent3 = motionEvent2;
            z13 = z11;
            z14 = z12;
        }
        list.clear();
        return z10;
    }

    /* renamed from: N */
    public final void m1787N() {
        this.f2604b.clear();
        this.f2605c.m8c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C0384f m1812z = m1812z(childAt);
            m1812z.m1847d(this, childAt);
            this.f2605c.m7b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (m1812z.m1845b(this, childAt, childAt2)) {
                        if (!this.f2605c.m9d(childAt2)) {
                            this.f2605c.m7b(childAt2);
                        }
                        this.f2605c.m6a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2604b.addAll(this.f2605c.m14i());
        Collections.reverse(this.f2604b);
    }

    /* renamed from: O */
    public void m1788O(View view, Rect rect) {
        ((C0384f) view.getLayoutParams()).m1860q(rect);
    }

    /* renamed from: Q */
    public void m1789Q() {
        if (this.f2612j && this.f2616n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2616n);
        }
        this.f2617o = false;
    }

    /* renamed from: R */
    public final void m1790R(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC0381c m1849f = ((C0384f) childAt.getLayoutParams()).m1849f();
            if (m1849f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    m1849f.mo1828k(this, childAt, obtain);
                } else {
                    m1849f.mo1817D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((C0384f) getChildAt(i11).getLayoutParams()).m1856m();
        }
        this.f2614l = null;
        this.f2611i = false;
    }

    /* renamed from: V */
    public final void m1791V(View view, int i10) {
        C0384f c0384f = (C0384f) view.getLayoutParams();
        int i11 = c0384f.f2634i;
        if (i11 != i10) {
            C6824g0.m31507Z(view, i10 - i11);
            c0384f.f2634i = i10;
        }
    }

    /* renamed from: W */
    public final void m1792W(View view, int i10) {
        C0384f c0384f = (C0384f) view.getLayoutParams();
        int i11 = c0384f.f2635j;
        if (i11 != i10) {
            C6824g0.m31509a0(view, i10 - i11);
            c0384f.f2635j = i10;
        }
    }

    /* renamed from: X */
    public final C6813c1 m1793X(C6813c1 c6813c1) {
        C6813c1 c6813c12 = c6813c1;
        if (!C6611c.m30516a(this.f2618p, c6813c1)) {
            this.f2618p = c6813c1;
            boolean z10 = c6813c1 != null && c6813c1.m31402l() > 0;
            this.f2619q = z10;
            setWillNotDraw(!z10 && getBackground() == null);
            c6813c12 = m1797f(c6813c1);
            requestLayout();
        }
        return c6813c12;
    }

    /* renamed from: Y */
    public final void m1794Y() {
        if (!C6824g0.m31558z(this)) {
            C6824g0.m31470A0(this, null);
            return;
        }
        if (this.f2622t == null) {
            this.f2622t = new C0379a(this);
        }
        C6824g0.m31470A0(this, this.f2622t);
        setSystemUiVisibility(1280);
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: b */
    public void mo1065b(View view, View view2, int i10, int i11) {
        AbstractC0381c m1849f;
        this.f2623u.m31655c(view, view2, i10, i11);
        this.f2615m = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            C0384f c0384f = (C0384f) childAt.getLayoutParams();
            if (c0384f.m1853j(i11) && (m1849f = c0384f.m1849f()) != null) {
                m1849f.m1839v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    /* renamed from: c */
    public void m1795c() {
        if (this.f2612j) {
            if (this.f2616n == null) {
                this.f2616n = new ViewTreeObserverOnPreDrawListenerC0385g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2616n);
        }
        this.f2617o = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0384f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        C0384f c0384f = (C0384f) view.getLayoutParams();
        AbstractC0381c abstractC0381c = c0384f.f2626a;
        if (abstractC0381c != null) {
            float m1821d = abstractC0381c.m1821d(this, view);
            if (m1821d > 0.0f) {
                if (this.f2608f == null) {
                    this.f2608f = new Paint();
                }
                this.f2608f.setColor(c0384f.f2626a.m1820c(this, view));
                this.f2608f.setAlpha(m1774d(Math.round(m1821d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f2608f);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2620r;
        boolean z10 = false;
        if (drawable != null) {
            z10 = false;
            if (drawable.isStateful()) {
                z10 = false | drawable.setState(drawableState);
            }
        }
        if (z10) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m1796e(C0384f c0384f, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0384f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) c0384f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0384f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) c0384f).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    /* renamed from: f */
    public final C6813c1 m1797f(C6813c1 c6813c1) {
        C6813c1 c6813c12;
        if (c6813c1.m31404o()) {
            return c6813c1;
        }
        int i10 = 0;
        int childCount = getChildCount();
        while (true) {
            c6813c12 = c6813c1;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            C6813c1 c6813c13 = c6813c1;
            if (C6824g0.m31558z(childAt)) {
                AbstractC0381c m1849f = ((C0384f) childAt.getLayoutParams()).m1849f();
                c6813c13 = c6813c1;
                if (m1849f != null) {
                    C6813c1 m1823f = m1849f.m1823f(this, childAt, c6813c1);
                    c6813c13 = m1823f;
                    if (m1823f.m31404o()) {
                        c6813c12 = m1823f;
                        break;
                    }
                } else {
                    continue;
                }
            }
            i10++;
            c6813c1 = c6813c13;
        }
        return c6813c12;
    }

    /* renamed from: g */
    public void m1798g(View view) {
        List m12g = this.f2605c.m12g(view);
        if (m12g == null || m12g.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < m12g.size(); i10++) {
            View view2 = (View) m12g.get(i10);
            AbstractC0381c m1849f = ((C0384f) view2.getLayoutParams()).m1849f();
            if (m1849f != null) {
                m1849f.mo1825h(this, view2, view);
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        m1787N();
        return Collections.unmodifiableList(this.f2604b);
    }

    public final C6813c1 getLastWindowInsets() {
        return this.f2618p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2623u.m31653a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2620r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: h */
    public boolean m1799h(View view, View view2) {
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect m1773a = m1773a();
        m1804r(view, view.getParent() != this, m1773a);
        Rect m1773a2 = m1773a();
        m1804r(view2, view2.getParent() != this, m1773a2);
        boolean z10 = false;
        try {
            if (m1773a.left <= m1773a2.right) {
                z10 = false;
                if (m1773a.top <= m1773a2.bottom) {
                    z10 = false;
                    if (m1773a.right >= m1773a2.left) {
                        z10 = false;
                        if (m1773a.bottom >= m1773a2.top) {
                            z10 = true;
                        }
                    }
                }
            }
            m1769P(m1773a);
            m1769P(m1773a2);
            return z10;
        } catch (Throwable th2) {
            m1769P(m1773a);
            m1769P(m1773a2);
            throw th2;
        }
    }

    /* renamed from: i */
    public void m1800i() {
        boolean z10;
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            z10 = false;
            if (i10 >= childCount) {
                break;
            }
            if (m1776B(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f2617o) {
            if (z10) {
                m1795c();
            } else {
                m1789Q();
            }
        }
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: j */
    public void mo1073j(View view, int i10) {
        this.f2623u.m31656d(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0384f c0384f = (C0384f) childAt.getLayoutParams();
            if (c0384f.m1853j(i10)) {
                AbstractC0381c m1849f = c0384f.m1849f();
                if (m1849f != null) {
                    m1849f.mo1816C(this, childAt, view, i10);
                }
                c0384f.m1855l(i10);
                c0384f.m1854k();
            }
        }
        this.f2615m = null;
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: k */
    public void mo1074k(View view, int i10, int i11, int[] iArr, int i12) {
        int i13;
        int i14;
        int i15;
        int childCount = getChildCount();
        boolean z10 = false;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i13 = i18;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                i14 = i17;
                i15 = i13;
            } else {
                C0384f c0384f = (C0384f) childAt.getLayoutParams();
                if (c0384f.m1853j(i12)) {
                    AbstractC0381c m1849f = c0384f.m1849f();
                    i14 = i17;
                    i15 = i13;
                    if (m1849f != null) {
                        int[] iArr2 = this.f2609g;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        m1849f.mo1834q(this, childAt, view, i10, i11, iArr2, i12);
                        int[] iArr3 = this.f2609g;
                        int max = i10 > 0 ? Math.max(i17, iArr3[0]) : Math.min(i17, iArr3[0]);
                        int[] iArr4 = this.f2609g;
                        i15 = i11 > 0 ? Math.max(i13, iArr4[1]) : Math.min(i13, iArr4[1]);
                        z10 = true;
                        i14 = max;
                    }
                } else {
                    i14 = i17;
                    i15 = i13;
                }
            }
            i16++;
            i17 = i14;
            i18 = i15;
        }
        iArr[0] = i17;
        iArr[1] = i13;
        if (z10) {
            m1783I(1);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0384f generateDefaultLayoutParams() {
        return new C0384f(-2, -2);
    }

    @Override // p235o0.InterfaceC6855u
    /* renamed from: m */
    public void mo1076m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        int i16;
        int i17;
        int childCount = getChildCount();
        boolean z10 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i15 = i20;
            if (i18 >= childCount) {
                break;
            }
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                i16 = i19;
                i17 = i15;
            } else {
                C0384f c0384f = (C0384f) childAt.getLayoutParams();
                if (c0384f.m1853j(i14)) {
                    AbstractC0381c m1849f = c0384f.m1849f();
                    i16 = i19;
                    i17 = i15;
                    if (m1849f != null) {
                        int[] iArr2 = this.f2609g;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        m1849f.mo1837t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                        int[] iArr3 = this.f2609g;
                        i16 = i12 > 0 ? Math.max(i19, iArr3[0]) : Math.min(i19, iArr3[0]);
                        i17 = i13 > 0 ? Math.max(i15, this.f2609g[1]) : Math.min(i15, this.f2609g[1]);
                        z10 = true;
                    }
                } else {
                    i16 = i19;
                    i17 = i15;
                }
            }
            i18++;
            i19 = i16;
            i20 = i17;
        }
        iArr[0] = iArr[0] + i19;
        iArr[1] = iArr[1] + i15;
        if (z10) {
            m1783I(1);
        }
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: n */
    public void mo1077n(View view, int i10, int i11, int i12, int i13, int i14) {
        mo1076m(view, i10, i11, i12, i13, 0, this.f2610h);
    }

    @Override // p235o0.InterfaceC6853t
    /* renamed from: o */
    public boolean mo1078o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0384f c0384f = (C0384f) childAt.getLayoutParams();
                AbstractC0381c m1849f = c0384f.m1849f();
                if (m1849f != null) {
                    boolean mo1814A = m1849f.mo1814A(this, childAt, view, view2, i10, i11);
                    z10 |= mo1814A;
                    c0384f.m1861r(i11, mo1814A);
                } else {
                    c0384f.m1861r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1790R(false);
        if (this.f2617o) {
            if (this.f2616n == null) {
                this.f2616n = new ViewTreeObserverOnPreDrawListenerC0385g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2616n);
        }
        if (this.f2618p == null && C6824g0.m31558z(this)) {
            C6824g0.m31533m0(this);
        }
        this.f2612j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1790R(false);
        if (this.f2617o && this.f2616n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2616n);
        }
        View view = this.f2615m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2612j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2619q || this.f2620r == null) {
            return;
        }
        C6813c1 c6813c1 = this.f2618p;
        int m31402l = c6813c1 != null ? c6813c1.m31402l() : 0;
        if (m31402l > 0) {
            this.f2620r.setBounds(0, 0, getWidth(), m31402l);
            this.f2620r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1790R(true);
        }
        boolean m1786M = m1786M(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1790R(true);
        }
        return m1786M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        AbstractC0381c m1849f;
        int m31473C = C6824g0.m31473C(this);
        int size = this.f2604b.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f2604b.get(i14);
            if (view.getVisibility() != 8 && ((m1849f = ((C0384f) view.getLayoutParams()).m1849f()) == null || !m1849f.mo1829l(this, view, m31473C))) {
                m1784J(view, m31473C);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        AbstractC0381c m1849f;
        m1787N();
        m1800i();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int m31473C = C6824g0.m31473C(this);
        boolean z10 = m31473C == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z11 = this.f2618p != null && C6824g0.m31558z(this);
        int size3 = this.f2604b.size();
        int i15 = 0;
        int i16 = 0;
        int i17 = paddingLeft;
        while (true) {
            int i18 = i17;
            if (i16 >= size3) {
                setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i15), View.resolveSizeAndState(suggestedMinimumHeight, i11, i15 << 16));
                return;
            }
            View view = this.f2604b.get(i16);
            if (view.getVisibility() != 8) {
                C0384f c0384f = (C0384f) view.getLayoutParams();
                int i19 = c0384f.f2630e;
                if (i19 >= 0 && mode != 0) {
                    int m1810x = m1810x(i19);
                    int m31460b = C6820f.m31460b(m1772U(c0384f.f2628c), m31473C) & 7;
                    if ((m31460b == 3 && !z10) || (m31460b == 5 && z10)) {
                        i12 = Math.max(0, (size - paddingRight) - m1810x);
                    } else if ((m31460b == 5 && !z10) || (m31460b == 3 && z10)) {
                        i12 = Math.max(0, m1810x - i18);
                    }
                    if (z11 || C6824g0.m31558z(view)) {
                        i13 = i11;
                        i14 = i10;
                    } else {
                        int m31400j = this.f2618p.m31400j();
                        int m31401k = this.f2618p.m31401k();
                        int m31402l = this.f2618p.m31402l();
                        int m31399i = this.f2618p.m31399i();
                        i14 = View.MeasureSpec.makeMeasureSpec(size - (m31400j + m31401k), mode);
                        i13 = View.MeasureSpec.makeMeasureSpec(size2 - (m31402l + m31399i), mode2);
                    }
                    m1849f = c0384f.m1849f();
                    if (m1849f != null || !m1849f.mo1830m(this, view, i14, i12, i13, 0)) {
                        m1785K(view, i14, i12, i13, 0);
                    }
                    suggestedMinimumWidth = Math.max(suggestedMinimumWidth, paddingLeft + paddingRight + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0384f).leftMargin + ((ViewGroup.MarginLayoutParams) c0384f).rightMargin);
                    suggestedMinimumHeight = Math.max(suggestedMinimumHeight, paddingTop + paddingBottom + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0384f).topMargin + ((ViewGroup.MarginLayoutParams) c0384f).bottomMargin);
                    i15 = View.combineMeasuredStates(i15, view.getMeasuredState());
                }
                i12 = 0;
                if (z11) {
                }
                i13 = i11;
                i14 = i10;
                m1849f = c0384f.m1849f();
                if (m1849f != null) {
                }
                m1785K(view, i14, i12, i13, 0);
                suggestedMinimumWidth = Math.max(suggestedMinimumWidth, paddingLeft + paddingRight + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0384f).leftMargin + ((ViewGroup.MarginLayoutParams) c0384f).rightMargin);
                suggestedMinimumHeight = Math.max(suggestedMinimumHeight, paddingTop + paddingBottom + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0384f).topMargin + ((ViewGroup.MarginLayoutParams) c0384f).bottomMargin);
                i15 = View.combineMeasuredStates(i15, view.getMeasuredState());
            }
            i16++;
            i17 = i18;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11;
        boolean z12;
        int childCount = getChildCount();
        int i10 = 0;
        boolean z13 = false;
        while (true) {
            z11 = z13;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                z12 = z11;
            } else {
                C0384f c0384f = (C0384f) childAt.getLayoutParams();
                if (c0384f.m1853j(0)) {
                    AbstractC0381c m1849f = c0384f.m1849f();
                    z12 = z11;
                    if (m1849f != null) {
                        z12 = z11 | m1849f.m1831n(this, childAt, view, f10, f11, z10);
                    }
                } else {
                    z12 = z11;
                }
            }
            i10++;
            z13 = z12;
        }
        if (z11) {
            m1783I(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        boolean z10;
        int childCount = getChildCount();
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            boolean z12 = z11;
            if (i10 >= childCount) {
                return z12;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                z10 = z12;
            } else {
                C0384f c0384f = (C0384f) childAt.getLayoutParams();
                if (c0384f.m1853j(0)) {
                    AbstractC0381c m1849f = c0384f.m1849f();
                    z10 = z12;
                    if (m1849f != null) {
                        z10 = z12 | m1849f.mo1832o(this, childAt, view, f10, f11);
                    }
                } else {
                    z10 = z12;
                }
            }
            i10++;
            z11 = z10;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        mo1074k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        mo1077n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        mo1065b(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0386h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0386h c0386h = (C0386h) parcelable;
        super.onRestoreInstanceState(c0386h.m37586b());
        SparseArray<Parcelable> sparseArray = c0386h.f2645d;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC0381c m1849f = m1812z(childAt).m1849f();
            if (id2 != -1 && m1849f != null && (parcelable2 = sparseArray.get(id2)) != null) {
                m1849f.mo1841x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable mo1842y;
        C0386h c0386h = new C0386h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC0381c m1849f = ((C0384f) childAt.getLayoutParams()).m1849f();
            if (id2 != -1 && m1849f != null && (mo1842y = m1849f.mo1842y(this, childAt)) != null) {
                sparseArray.append(id2, mo1842y);
            }
        }
        c0386h.f2645d = sparseArray;
        return c0386h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo1078o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo1073j(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r12 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r0 = r10
            int r0 = r0.getActionMasked()
            r11 = r0
            r0 = r9
            android.view.View r0 = r0.f2614l
            if (r0 != 0) goto L1d
            r0 = r9
            r1 = r10
            r2 = 1
            boolean r0 = r0.m1786M(r1, r2)
            r12 = r0
            r0 = r12
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L4c
            goto L1f
        L1d:
            r0 = 0
            r12 = r0
        L1f:
            r0 = r9
            android.view.View r0 = r0.f2614l
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0384f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.m1849f()
            r17 = r0
            r0 = r12
            r13 = r0
            r0 = r17
            if (r0 == 0) goto L4c
            r0 = r17
            r1 = r9
            r2 = r9
            android.view.View r2 = r2.f2614l
            r3 = r10
            boolean r0 = r0.mo1817D(r1, r2, r3)
            r14 = r0
            r0 = r12
            r13 = r0
            r0 = r14
            r12 = r0
            goto L4e
        L4c:
            r0 = 0
            r12 = r0
        L4e:
            r0 = r9
            android.view.View r0 = r0.f2614l
            r18 = r0
            r0 = 0
            r17 = r0
            r0 = r18
            if (r0 != 0) goto L6b
            r0 = r12
            r1 = r9
            r2 = r10
            boolean r1 = super.onTouchEvent(r2)
            r0 = r0 | r1
            r14 = r0
            r0 = r17
            r10 = r0
            goto L90
        L6b:
            r0 = r12
            r14 = r0
            r0 = r17
            r10 = r0
            r0 = r13
            if (r0 == 0) goto L90
            long r0 = android.os.SystemClock.uptimeMillis()
            r15 = r0
            r0 = r15
            r1 = r15
            r2 = 3
            r3 = 0
            r4 = 0
            r5 = 0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r0, r1, r2, r3, r4, r5)
            r10 = r0
            r0 = r9
            r1 = r10
            boolean r0 = super.onTouchEvent(r1)
            r0 = r12
            r14 = r0
        L90:
            r0 = r10
            if (r0 == 0) goto L98
            r0 = r10
            r0.recycle()
        L98:
            r0 = r11
            r1 = 1
            if (r0 == r1) goto La2
            r0 = r11
            r1 = 3
            if (r0 != r1) goto La7
        La2:
            r0 = r9
            r1 = 0
            r0.m1790R(r1)
        La7:
            r0 = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0384f generateLayoutParams(AttributeSet attributeSet) {
        return new C0384f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0384f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0384f ? new C0384f((C0384f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0384f((ViewGroup.MarginLayoutParams) layoutParams) : new C0384f(layoutParams);
    }

    /* renamed from: r */
    public void m1804r(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            m1807u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        AbstractC0381c m1849f = ((C0384f) view.getLayoutParams()).m1849f();
        if (m1849f == null || !m1849f.mo1840w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f2611i) {
            return;
        }
        m1790R(false);
        this.f2611i = true;
    }

    /* renamed from: s */
    public List<View> m1805s(View view) {
        List<View> m13h = this.f2605c.m13h(view);
        this.f2607e.clear();
        if (m13h != null) {
            this.f2607e.addAll(m13h);
        }
        return this.f2607e;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        m1794Y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2621s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2620r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2620r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2620r.setState(getDrawableState());
                }
                C4917c.m24849m(this.f2620r, C6824g0.m31473C(this));
                this.f2620r.setVisible(getVisibility() == 0, false);
                this.f2620r.setCallback(this);
            }
            C6824g0.m31521g0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? C4290b.m21726e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f2620r;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f2620r.setVisible(z10, false);
    }

    /* renamed from: t */
    public List<View> m1806t(View view) {
        List m12g = this.f2605c.m12g(view);
        this.f2607e.clear();
        if (m12g != null) {
            this.f2607e.addAll(m12g);
        }
        return this.f2607e;
    }

    /* renamed from: u */
    public void m1807u(View view, Rect rect) {
        C0003b.m17a(this, view, rect);
    }

    /* renamed from: v */
    public void m1808v(View view, int i10, Rect rect, Rect rect2) {
        C0384f c0384f = (C0384f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1809w(view, i10, rect, rect2, c0384f, measuredWidth, measuredHeight);
        m1796e(c0384f, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2620r;
    }

    /* renamed from: w */
    public final void m1809w(View view, int i10, Rect rect, Rect rect2, C0384f c0384f, int i11, int i12) {
        int i13;
        int i14;
        int m31460b = C6820f.m31460b(m1770S(c0384f.f2628c), i10);
        int m31460b2 = C6820f.m31460b(m1771T(c0384f.f2629d), i10);
        int i15 = m31460b & 7;
        int i16 = m31460b & 112;
        int i17 = m31460b2 & 7;
        int i18 = m31460b2 & 112;
        int width = i17 != 1 ? i17 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i18 != 16 ? i18 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i15 != 1) {
            i13 = width;
            if (i15 != 5) {
                i13 = width - i11;
            }
        } else {
            i13 = width - (i11 / 2);
        }
        if (i16 != 16) {
            i14 = height;
            if (i16 != 80) {
                i14 = height - i12;
            }
        } else {
            i14 = height - (i12 / 2);
        }
        rect2.set(i13, i14, i11 + i13, i12 + i14);
    }

    /* renamed from: x */
    public final int m1810x(int i10) {
        StringBuilder sb2;
        int[] iArr = this.f2613k;
        if (iArr == null) {
            sb2 = new StringBuilder();
            sb2.append("No keylines defined for ");
            sb2.append(this);
            sb2.append(" - attempted index lookup ");
            sb2.append(i10);
        } else {
            if (i10 >= 0 && i10 < iArr.length) {
                return iArr[i10];
            }
            sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i10);
            sb2.append(" out of range for ");
            sb2.append(this);
        }
        Log.e("CoordinatorLayout", sb2.toString());
        return 0;
    }

    /* renamed from: y */
    public void m1811y(View view, Rect rect) {
        rect.set(((C0384f) view.getLayoutParams()).m1851h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public C0384f m1812z(View view) {
        InterfaceC0382d interfaceC0382d;
        C0384f c0384f = (C0384f) view.getLayoutParams();
        if (!c0384f.f2627b) {
            if (view instanceof InterfaceC0380b) {
                AbstractC0381c behavior = ((InterfaceC0380b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0384f.m1858o(behavior);
            } else {
                Class<?> cls = view.getClass();
                InterfaceC0382d interfaceC0382d2 = null;
                while (true) {
                    interfaceC0382d = interfaceC0382d2;
                    if (cls == null) {
                        break;
                    }
                    InterfaceC0382d interfaceC0382d3 = (InterfaceC0382d) cls.getAnnotation(InterfaceC0382d.class);
                    interfaceC0382d = interfaceC0382d3;
                    if (interfaceC0382d3 != null) {
                        break;
                    }
                    cls = cls.getSuperclass();
                    interfaceC0382d2 = interfaceC0382d3;
                }
                if (interfaceC0382d != null) {
                    try {
                        c0384f.m1858o(interfaceC0382d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0382d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
            }
            c0384f.f2627b = true;
        }
        return c0384f;
    }
}
