package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.C0252g;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.view.menu.InterfaceC0255j;
import androidx.appcompat.widget.C0351s0;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/ActionMenuView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionMenuView.class */
public class ActionMenuView extends C0351s0 implements C0250e.b, InterfaceC0255j {

    /* renamed from: A */
    public int f1740A;

    /* renamed from: B */
    public InterfaceC0268e f1741B;

    /* renamed from: q */
    public C0250e f1742q;

    /* renamed from: r */
    public Context f1743r;

    /* renamed from: s */
    public int f1744s;

    /* renamed from: t */
    public boolean f1745t;

    /* renamed from: u */
    public C0302c f1746u;

    /* renamed from: v */
    public InterfaceC0254i.a f1747v;

    /* renamed from: w */
    public C0250e.a f1748w;

    /* renamed from: x */
    public boolean f1749x;

    /* renamed from: y */
    public int f1750y;

    /* renamed from: z */
    public int f1751z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionMenuView$a.class
     */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionMenuView$a.class */
    public interface InterfaceC0264a {
        /* renamed from: a */
        boolean mo883a();

        /* renamed from: b */
        boolean mo884b();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionMenuView$b.class
     */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionMenuView$b.class */
    public static class C0265b implements InterfaceC0254i.a {
        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: b */
        public void mo1006b(C0250e c0250e, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i.a
        /* renamed from: c */
        public boolean mo1007c(C0250e c0250e) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionMenuView$c.class
     */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionMenuView$c.class */
    public static class C0266c extends C0351s0.a {

        /* renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f1752a;

        /* renamed from: b */
        @ViewDebug.ExportedProperty
        public int f1753b;

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public int f1754c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f1755d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f1756e;

        /* renamed from: f */
        public boolean f1757f;

        public C0266c(int i10, int i11) {
            super(i10, i11);
            this.f1752a = false;
        }

        public C0266c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0266c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0266c(C0266c c0266c) {
            super(c0266c);
            this.f1752a = c0266c.f1752a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionMenuView$d.class
     */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionMenuView$d.class */
    public class C0267d implements C0250e.a {

        /* renamed from: b */
        public final ActionMenuView f1758b;

        public C0267d(ActionMenuView actionMenuView) {
            this.f1758b = actionMenuView;
        }

        @Override // androidx.appcompat.view.menu.C0250e.a
        /* renamed from: a */
        public boolean mo1003a(C0250e c0250e, MenuItem menuItem) {
            InterfaceC0268e interfaceC0268e = this.f1758b.f1741B;
            return interfaceC0268e != null && interfaceC0268e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0250e.a
        /* renamed from: b */
        public void mo1004b(C0250e c0250e) {
            C0250e.a aVar = this.f1758b.f1748w;
            if (aVar != null) {
                aVar.mo1004b(c0250e);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ActionMenuView$e.class
     */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ActionMenuView$e.class */
    public interface InterfaceC0268e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1751z = (int) (56.0f * f10);
        this.f1740A = (int) (f10 * 4.0f);
        this.f1743r = context;
        this.f1744s = 0;
    }

    /* renamed from: J */
    public static int m1095J(View view, int i10, int i11, int i12, int i13) {
        int i14;
        C0266c c0266c = (C0266c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = true;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.m887f();
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            i14 = i15;
            if (measuredWidth % i10 != 0) {
                i14 = i15 + 1;
            }
            if (z11 && i14 < 2) {
                i14 = 2;
            }
        }
        if (c0266c.f1752a || !z11) {
            z10 = false;
        }
        c0266c.f1755d = z10;
        c0266c.f1753b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), makeMeasureSpec);
        return i14;
    }

    @Override // androidx.appcompat.widget.C0351s0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C0266c generateDefaultLayoutParams() {
        C0266c c0266c = new C0266c(-2, -2);
        ((LinearLayout.LayoutParams) c0266c).gravity = 16;
        return c0266c;
    }

    @Override // androidx.appcompat.widget.C0351s0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C0266c generateLayoutParams(AttributeSet attributeSet) {
        return new C0266c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.C0351s0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C0266c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0266c c0266c = layoutParams instanceof C0266c ? new C0266c((C0266c) layoutParams) : new C0266c(layoutParams);
        if (((LinearLayout.LayoutParams) c0266c).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0266c).gravity = 16;
        }
        return c0266c;
    }

    /* renamed from: D */
    public C0266c m1099D() {
        C0266c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1752a = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: E */
    public boolean m1100E(int i10) {
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        boolean z10 = false;
        if (i10 < getChildCount()) {
            z10 = false;
            if (childAt instanceof InterfaceC0264a) {
                z10 = false | ((InterfaceC0264a) childAt).mo883a();
            }
        }
        boolean z11 = z10;
        if (i10 > 0) {
            z11 = z10;
            if (childAt2 instanceof InterfaceC0264a) {
                z11 = z10 | ((InterfaceC0264a) childAt2).mo884b();
            }
        }
        return z11;
    }

    /* renamed from: F */
    public boolean m1101F() {
        C0302c c0302c = this.f1746u;
        return c0302c != null && c0302c.m1260B();
    }

    /* renamed from: G */
    public boolean m1102G() {
        C0302c c0302c = this.f1746u;
        return c0302c != null && c0302c.m1262D();
    }

    /* renamed from: H */
    public boolean m1103H() {
        C0302c c0302c = this.f1746u;
        return c0302c != null && c0302c.m1263E();
    }

    /* renamed from: I */
    public boolean m1104I() {
        return this.f1745t;
    }

    /* renamed from: K */
    public final void m1105K(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        int i12;
        int i13;
        long j11;
        int i14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i15 = size - (paddingLeft + paddingRight);
        int i16 = this.f1751z;
        int i17 = i15 / i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i18 = i16 + ((i15 % i16) / i17);
        int childCount = getChildCount();
        int i19 = 0;
        int i20 = 0;
        boolean z13 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j12 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() == 8) {
                i14 = i23;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z14) {
                    int i24 = this.f1740A;
                    childAt.setPadding(i24, 0, i24, 0);
                }
                C0266c c0266c = (C0266c) childAt.getLayoutParams();
                c0266c.f1757f = false;
                c0266c.f1754c = 0;
                c0266c.f1753b = 0;
                c0266c.f1755d = false;
                ((LinearLayout.LayoutParams) c0266c).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0266c).rightMargin = 0;
                c0266c.f1756e = z14 && ((ActionMenuItemView) childAt).m887f();
                int m1095J = m1095J(childAt, i18, c0266c.f1752a ? 1 : i17, childMeasureSpec, paddingTop);
                i22 = Math.max(i22, m1095J);
                i14 = i23;
                if (c0266c.f1755d) {
                    i14 = i23 + 1;
                }
                if (c0266c.f1752a) {
                    z13 = true;
                }
                i17 -= m1095J;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (m1095J == 1) {
                    j12 |= 1 << i20;
                }
            }
            i20++;
            i23 = i14;
        }
        boolean z15 = false;
        int i25 = i17;
        boolean z16 = z13 && i21 == 2;
        while (i23 > 0 && i25 > 0) {
            int i26 = 0;
            int i27 = 0;
            int i28 = Integer.MAX_VALUE;
            long j13 = 0;
            while (true) {
                j10 = j13;
                if (i27 >= childCount) {
                    break;
                }
                C0266c c0266c2 = (C0266c) getChildAt(i27).getLayoutParams();
                if (c0266c2.f1755d) {
                    int i29 = c0266c2.f1753b;
                    if (i29 < i28) {
                        j11 = 1 << i27;
                        i13 = i29;
                        i12 = 1;
                    } else {
                        i12 = i26;
                        i13 = i28;
                        j11 = j10;
                        if (i29 == i28) {
                            i12 = i26 + 1;
                            j11 = j10 | (1 << i27);
                            i13 = i28;
                        }
                    }
                } else {
                    i12 = i26;
                    i13 = i28;
                    j11 = j10;
                }
                i27++;
                i26 = i12;
                i28 = i13;
                j13 = j11;
            }
            z10 = z15;
            j12 |= j10;
            if (i26 > i25) {
                break;
            }
            for (int i30 = 0; i30 < childCount; i30++) {
                View childAt2 = getChildAt(i30);
                C0266c c0266c3 = (C0266c) childAt2.getLayoutParams();
                long j14 = 1 << i30;
                if ((j10 & j14) == 0) {
                    long j15 = j12;
                    if (c0266c3.f1753b == i28 + 1) {
                        j15 = j12 | j14;
                    }
                    j12 = j15;
                } else {
                    if (z16 && c0266c3.f1756e && i25 == 1) {
                        int i31 = this.f1740A;
                        childAt2.setPadding(i31 + i18, 0, i31, 0);
                    }
                    c0266c3.f1753b++;
                    c0266c3.f1757f = true;
                    i25--;
                }
            }
            z15 = true;
        }
        z10 = z15;
        boolean z17 = !z13 && i21 == 1;
        if (i25 > 0 && j12 != 0 && (i25 < i21 - 1 || z17 || i22 > 1)) {
            float bitCount = Long.bitCount(j12);
            if (!z17) {
                float f10 = bitCount;
                if ((j12 & 1) != 0) {
                    f10 = bitCount;
                    if (!((C0266c) getChildAt(0).getLayoutParams()).f1756e) {
                        f10 = bitCount - 0.5f;
                    }
                }
                int i32 = childCount - 1;
                bitCount = f10;
                if ((j12 & (1 << i32)) != 0) {
                    bitCount = f10;
                    if (!((C0266c) getChildAt(i32).getLayoutParams()).f1756e) {
                        bitCount = f10 - 0.5f;
                    }
                }
            }
            int i33 = bitCount > 0.0f ? (int) ((i25 * i18) / bitCount) : 0;
            int i34 = 0;
            while (true) {
                z11 = z10;
                if (i34 >= childCount) {
                    break;
                }
                if ((j12 & (1 << i34)) == 0) {
                    z12 = z10;
                } else {
                    View childAt3 = getChildAt(i34);
                    C0266c c0266c4 = (C0266c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0266c4.f1754c = i33;
                        c0266c4.f1757f = true;
                        if (i34 == 0 && !c0266c4.f1756e) {
                            ((LinearLayout.LayoutParams) c0266c4).leftMargin = (-i33) / 2;
                        }
                    } else if (c0266c4.f1752a) {
                        c0266c4.f1754c = i33;
                        c0266c4.f1757f = true;
                        ((LinearLayout.LayoutParams) c0266c4).rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            ((LinearLayout.LayoutParams) c0266c4).leftMargin = i33 / 2;
                        }
                        z12 = z10;
                        if (i34 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c0266c4).rightMargin = i33 / 2;
                            z12 = z10;
                        }
                    }
                    z12 = true;
                }
                i34++;
                z10 = z12;
            }
        } else {
            z11 = z10;
        }
        if (z11) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                C0266c c0266c5 = (C0266c) childAt4.getLayoutParams();
                if (c0266c5.f1757f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0266c5.f1753b * i18) + c0266c5.f1754c, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            size2 = i19;
        }
        setMeasuredDimension(i15, size2);
    }

    /* renamed from: L */
    public C0250e m1106L() {
        return this.f1742q;
    }

    /* renamed from: M */
    public void m1107M(InterfaceC0254i.a aVar, C0250e.a aVar2) {
        this.f1747v = aVar;
        this.f1748w = aVar2;
    }

    /* renamed from: N */
    public boolean m1108N() {
        C0302c c0302c = this.f1746u;
        return c0302c != null && c0302c.m1269K();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0255j
    /* renamed from: a */
    public void mo893a(C0250e c0250e) {
        this.f1742q = c0250e;
    }

    @Override // androidx.appcompat.view.menu.C0250e.b
    /* renamed from: b */
    public boolean mo894b(C0252g c0252g) {
        return this.f1742q.m959L(c0252g, 0);
    }

    @Override // androidx.appcompat.widget.C0351s0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0266c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1742q == null) {
            Context context = getContext();
            C0250e c0250e = new C0250e(context);
            this.f1742q = c0250e;
            c0250e.mo965R(new C0267d(this));
            C0302c c0302c = new C0302c(context);
            this.f1746u = c0302c;
            c0302c.m1268J(true);
            C0302c c0302c2 = this.f1746u;
            InterfaceC0254i.a aVar = this.f1747v;
            if (aVar == null) {
                aVar = new C0265b();
            }
            c0302c2.mo904d(aVar);
            this.f1742q.m978c(this.f1746u, this.f1743r);
            this.f1746u.m1266H(this);
        }
        return this.f1742q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1746u.m1259A();
    }

    public int getPopupTheme() {
        return this.f1744s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0302c c0302c = this.f1746u;
        if (c0302c != null) {
            c0302c.mo906f(false);
            if (this.f1746u.m1263E()) {
                this.f1746u.m1260B();
                this.f1746u.m1269K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1112z();
    }

    @Override // androidx.appcompat.widget.C0351s0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.f1749x) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean m1621b = C0358u1.m1621b(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                C0266c c0266c = (C0266c) childAt.getLayoutParams();
                if (c0266c.f1752a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i20 = measuredWidth;
                    if (m1100E(i19)) {
                        i20 = measuredWidth + dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m1621b) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0266c).leftMargin;
                        width = i14 + i20;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0266c).rightMargin;
                        i14 = width - i20;
                    }
                    int i21 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i21, width, measuredHeight + i21);
                    paddingRight -= i20;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0266c).leftMargin) + ((LinearLayout.LayoutParams) c0266c).rightMargin;
                    m1100E(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i16 / 2) - (measuredWidth2 / 2);
            int i23 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i18 - (i17 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (m1621b) {
            int width2 = getWidth() - getPaddingRight();
            int i25 = 0;
            while (i25 < childCount) {
                View childAt3 = getChildAt(i25);
                C0266c c0266c2 = (C0266c) childAt3.getLayoutParams();
                int i26 = width2;
                if (childAt3.getVisibility() != 8) {
                    if (c0266c2.f1752a) {
                        i26 = width2;
                    } else {
                        int i27 = width2 - ((LinearLayout.LayoutParams) c0266c2).rightMargin;
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight3 = childAt3.getMeasuredHeight();
                        int i28 = i15 - (measuredHeight3 / 2);
                        childAt3.layout(i27 - measuredWidth3, i28, i27, measuredHeight3 + i28);
                        i26 = i27 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0266c2).leftMargin) + max);
                    }
                }
                i25++;
                width2 = i26;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        int i29 = 0;
        while (i29 < childCount) {
            View childAt4 = getChildAt(i29);
            C0266c c0266c3 = (C0266c) childAt4.getLayoutParams();
            int i30 = paddingLeft;
            if (childAt4.getVisibility() != 8) {
                if (c0266c3.f1752a) {
                    i30 = paddingLeft;
                } else {
                    int i31 = paddingLeft + ((LinearLayout.LayoutParams) c0266c3).leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i32 = i15 - (measuredHeight4 / 2);
                    childAt4.layout(i31, i32, i31 + measuredWidth4, measuredHeight4 + i32);
                    i30 = i31 + measuredWidth4 + ((LinearLayout.LayoutParams) c0266c3).rightMargin + max;
                }
            }
            i29++;
            paddingLeft = i30;
        }
    }

    @Override // androidx.appcompat.widget.C0351s0, android.view.View
    public void onMeasure(int i10, int i11) {
        C0250e c0250e;
        boolean z10 = this.f1749x;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1749x = z11;
        if (z10 != z11) {
            this.f1750y = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1749x && (c0250e = this.f1742q) != null && size != this.f1750y) {
            this.f1750y = size;
            c0250e.m958K(true);
        }
        int childCount = getChildCount();
        if (this.f1749x && childCount > 0) {
            m1105K(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            C0266c c0266c = (C0266c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) c0266c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0266c).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1746u.m1265G(z10);
    }

    public void setOnMenuItemClickListener(InterfaceC0268e interfaceC0268e) {
        this.f1741B = interfaceC0268e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1746u.m1267I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1745t = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1744s != i10) {
            this.f1744s = i10;
            if (i10 == 0) {
                this.f1743r = getContext();
            } else {
                this.f1743r = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C0302c c0302c) {
        this.f1746u = c0302c;
        c0302c.m1266H(this);
    }

    /* renamed from: z */
    public void m1112z() {
        C0302c c0302c = this.f1746u;
        if (c0302c != null) {
            c0302c.m1270y();
        }
    }
}
