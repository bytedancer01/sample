package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.C0252g;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.view.menu.SubMenuC0257l;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p029c.C0920a;
import p029c.C0929j;
import p049d.AbstractC4275a;
import p068e.C4561b;
import p137i.C5139g;
import p137i.InterfaceC5135c;
import p235o0.C6820f;
import p235o0.C6824g0;
import p235o0.C6829i;
import p341u0.AbstractC8783a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/Toolbar.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/Toolbar.class */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public ColorStateList f1903A;

    /* renamed from: B */
    public ColorStateList f1904B;

    /* renamed from: C */
    public boolean f1905C;

    /* renamed from: D */
    public boolean f1906D;

    /* renamed from: E */
    public final ArrayList<View> f1907E;

    /* renamed from: F */
    public final ArrayList<View> f1908F;

    /* renamed from: G */
    public final int[] f1909G;

    /* renamed from: H */
    public InterfaceC0293f f1910H;

    /* renamed from: I */
    public final ActionMenuView.InterfaceC0268e f1911I;

    /* renamed from: J */
    public C0340o1 f1912J;

    /* renamed from: K */
    public C0302c f1913K;

    /* renamed from: L */
    public C0291d f1914L;

    /* renamed from: M */
    public InterfaceC0254i.a f1915M;

    /* renamed from: N */
    public C0250e.a f1916N;

    /* renamed from: O */
    public boolean f1917O;

    /* renamed from: P */
    public final Runnable f1918P;

    /* renamed from: b */
    public ActionMenuView f1919b;

    /* renamed from: c */
    public TextView f1920c;

    /* renamed from: d */
    public TextView f1921d;

    /* renamed from: e */
    public ImageButton f1922e;

    /* renamed from: f */
    public ImageView f1923f;

    /* renamed from: g */
    public Drawable f1924g;

    /* renamed from: h */
    public CharSequence f1925h;

    /* renamed from: i */
    public ImageButton f1926i;

    /* renamed from: j */
    public View f1927j;

    /* renamed from: k */
    public Context f1928k;

    /* renamed from: l */
    public int f1929l;

    /* renamed from: m */
    public int f1930m;

    /* renamed from: n */
    public int f1931n;

    /* renamed from: o */
    public int f1932o;

    /* renamed from: p */
    public int f1933p;

    /* renamed from: q */
    public int f1934q;

    /* renamed from: r */
    public int f1935r;

    /* renamed from: s */
    public int f1936s;

    /* renamed from: t */
    public int f1937t;

    /* renamed from: u */
    public C0313f1 f1938u;

    /* renamed from: v */
    public int f1939v;

    /* renamed from: w */
    public int f1940w;

    /* renamed from: x */
    public int f1941x;

    /* renamed from: y */
    public CharSequence f1942y;

    /* renamed from: z */
    public CharSequence f1943z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/Toolbar$a.class
     */
    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/Toolbar$a.class */
    public class C0288a implements ActionMenuView.InterfaceC0268e {

        /* renamed from: a */
        public final Toolbar f1944a;

        public C0288a(Toolbar toolbar) {
            this.f1944a = toolbar;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0268e
        public boolean onMenuItemClick(MenuItem menuItem) {
            InterfaceC0293f interfaceC0293f = this.f1944a.f1910H;
            if (interfaceC0293f != null) {
                return interfaceC0293f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/Toolbar$b.class
     */
    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/Toolbar$b.class */
    public class RunnableC0289b implements Runnable {

        /* renamed from: b */
        public final Toolbar f1945b;

        public RunnableC0289b(Toolbar toolbar) {
            this.f1945b = toolbar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1945b.m1200O();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/Toolbar$c.class
     */
    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/Toolbar$c.class */
    public class ViewOnClickListenerC0290c implements View.OnClickListener {

        /* renamed from: b */
        public final Toolbar f1946b;

        public ViewOnClickListenerC0290c(Toolbar toolbar) {
            this.f1946b = toolbar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1946b.m1205e();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/Toolbar$d.class
     */
    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/Toolbar$d.class */
    public class C0291d implements InterfaceC0254i {

        /* renamed from: b */
        public C0250e f1947b;

        /* renamed from: c */
        public C0252g f1948c;

        /* renamed from: d */
        public final Toolbar f1949d;

        public C0291d(Toolbar toolbar) {
            this.f1949d = toolbar;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i
        /* renamed from: b */
        public void mo902b(C0250e c0250e, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i
        /* renamed from: c */
        public boolean mo903c(C0250e c0250e, C0252g c0252g) {
            this.f1949d.m1207g();
            ViewParent parent = this.f1949d.f1926i.getParent();
            Toolbar toolbar = this.f1949d;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1926i);
                }
                Toolbar toolbar2 = this.f1949d;
                toolbar2.addView(toolbar2.f1926i);
            }
            this.f1949d.f1927j = c0252g.getActionView();
            this.f1948c = c0252g;
            ViewParent parent2 = this.f1949d.f1927j.getParent();
            Toolbar toolbar3 = this.f1949d;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1927j);
                }
                C0292e generateDefaultLayoutParams = this.f1949d.generateDefaultLayoutParams();
                Toolbar toolbar4 = this.f1949d;
                generateDefaultLayoutParams.f26228a = 8388611 | (toolbar4.f1932o & 112);
                generateDefaultLayoutParams.f1950b = 2;
                toolbar4.f1927j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = this.f1949d;
                toolbar5.addView(toolbar5.f1927j);
            }
            this.f1949d.m1192G();
            this.f1949d.requestLayout();
            c0252g.m1028r(true);
            KeyEvent.Callback callback = this.f1949d.f1927j;
            if (!(callback instanceof InterfaceC5135c)) {
                return true;
            }
            ((InterfaceC5135c) callback).onActionViewExpanded();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i
        /* renamed from: e */
        public boolean mo905e(SubMenuC0257l subMenuC0257l) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i
        /* renamed from: f */
        public void mo906f(boolean z10) {
            if (this.f1948c != null) {
                C0250e c0250e = this.f1947b;
                boolean z11 = false;
                if (c0250e != null) {
                    int size = c0250e.size();
                    int i10 = 0;
                    while (true) {
                        z11 = false;
                        if (i10 >= size) {
                            break;
                        }
                        if (this.f1947b.getItem(i10) == this.f1948c) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    return;
                }
                mo907h(this.f1947b, this.f1948c);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i
        /* renamed from: g */
        public boolean mo923g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i
        /* renamed from: h */
        public boolean mo907h(C0250e c0250e, C0252g c0252g) {
            KeyEvent.Callback callback = this.f1949d.f1927j;
            if (callback instanceof InterfaceC5135c) {
                ((InterfaceC5135c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = this.f1949d;
            toolbar.removeView(toolbar.f1927j);
            Toolbar toolbar2 = this.f1949d;
            toolbar2.removeView(toolbar2.f1926i);
            Toolbar toolbar3 = this.f1949d;
            toolbar3.f1927j = null;
            toolbar3.m1201a();
            this.f1948c = null;
            this.f1949d.requestLayout();
            c0252g.m1028r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0254i
        /* renamed from: i */
        public void mo908i(Context context, C0250e c0250e) {
            C0252g c0252g;
            C0250e c0250e2 = this.f1947b;
            if (c0250e2 != null && (c0252g = this.f1948c) != null) {
                c0250e2.mo983f(c0252g);
            }
            this.f1947b = c0250e;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/Toolbar$e.class
     */
    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/Toolbar$e.class */
    public static class C0292e extends AbstractC4275a.a {

        /* renamed from: b */
        public int f1950b;

        public C0292e(int i10, int i11) {
            super(i10, i11);
            this.f1950b = 0;
            this.f26228a = 8388627;
        }

        public C0292e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1950b = 0;
        }

        public C0292e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1950b = 0;
        }

        public C0292e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1950b = 0;
            m1227a(marginLayoutParams);
        }

        public C0292e(C0292e c0292e) {
            super((AbstractC4275a.a) c0292e);
            this.f1950b = 0;
            this.f1950b = c0292e.f1950b;
        }

        public C0292e(AbstractC4275a.a aVar) {
            super(aVar);
            this.f1950b = 0;
        }

        /* renamed from: a */
        public void m1227a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/Toolbar$f.class
     */
    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/Toolbar$f.class */
    public interface InterfaceC0293f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/Toolbar$g.class
     */
    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/Toolbar$g.class */
    public static class C0294g extends AbstractC8783a {
        public static final Parcelable.Creator<C0294g> CREATOR = new a();

        /* renamed from: d */
        public int f1951d;

        /* renamed from: e */
        public boolean f1952e;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/appcompat/widget/Toolbar$g$a.class
         */
        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/Toolbar$g$a.class */
        public class a implements Parcelable.ClassLoaderCreator<C0294g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0294g createFromParcel(Parcel parcel) {
                return new C0294g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0294g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0294g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0294g[] newArray(int i10) {
                return new C0294g[i10];
            }
        }

        public C0294g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1951d = parcel.readInt();
            this.f1952e = parcel.readInt() != 0;
        }

        public C0294g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p341u0.AbstractC8783a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1951d);
            parcel.writeInt(this.f1952e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6105T);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1941x = 8388627;
        this.f1907E = new ArrayList<>();
        this.f1908F = new ArrayList<>();
        this.f1909G = new int[2];
        this.f1911I = new C0288a(this);
        this.f1918P = new RunnableC0289b(this);
        Context context2 = getContext();
        int[] iArr = C0929j.f6513s3;
        C0337n1 m1505v = C0337n1.m1505v(context2, attributeSet, iArr, i10, 0);
        C6824g0.m31535n0(this, context, iArr, attributeSet, m1505v.m1523r(), i10, 0);
        this.f1930m = m1505v.m1519n(C0929j.f6386U3, 0);
        this.f1931n = m1505v.m1519n(C0929j.f6341L3, 0);
        this.f1941x = m1505v.m1517l(C0929j.f6518t3, this.f1941x);
        this.f1932o = m1505v.m1517l(C0929j.f6523u3, 48);
        int m1510e = m1505v.m1510e(C0929j.f6356O3, 0);
        int i11 = C0929j.f6381T3;
        int m1510e2 = m1505v.m1524s(i11) ? m1505v.m1510e(i11, m1510e) : m1510e;
        this.f1937t = m1510e2;
        this.f1936s = m1510e2;
        this.f1935r = m1510e2;
        this.f1934q = m1510e2;
        int m1510e3 = m1505v.m1510e(C0929j.f6371R3, -1);
        if (m1510e3 >= 0) {
            this.f1934q = m1510e3;
        }
        int m1510e4 = m1505v.m1510e(C0929j.f6366Q3, -1);
        if (m1510e4 >= 0) {
            this.f1935r = m1510e4;
        }
        int m1510e5 = m1505v.m1510e(C0929j.f6376S3, -1);
        if (m1510e5 >= 0) {
            this.f1936s = m1510e5;
        }
        int m1510e6 = m1505v.m1510e(C0929j.f6361P3, -1);
        if (m1510e6 >= 0) {
            this.f1937t = m1510e6;
        }
        this.f1933p = m1505v.m1511f(C0929j.f6311F3, -1);
        int m1510e7 = m1505v.m1510e(C0929j.f6291B3, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        int m1510e8 = m1505v.m1510e(C0929j.f6538x3, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        int m1511f = m1505v.m1511f(C0929j.f6548z3, 0);
        int m1511f2 = m1505v.m1511f(C0929j.f6286A3, 0);
        m1208h();
        this.f1938u.m1363e(m1511f, m1511f2);
        if (m1510e7 != Integer.MIN_VALUE || m1510e8 != Integer.MIN_VALUE) {
            this.f1938u.m1365g(m1510e7, m1510e8);
        }
        this.f1939v = m1505v.m1510e(C0929j.f6296C3, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        this.f1940w = m1505v.m1510e(C0929j.f6543y3, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        this.f1924g = m1505v.m1512g(C0929j.f6533w3);
        this.f1925h = m1505v.m1521p(C0929j.f6528v3);
        CharSequence m1521p = m1505v.m1521p(C0929j.f6351N3);
        if (!TextUtils.isEmpty(m1521p)) {
            setTitle(m1521p);
        }
        CharSequence m1521p2 = m1505v.m1521p(C0929j.f6336K3);
        if (!TextUtils.isEmpty(m1521p2)) {
            setSubtitle(m1521p2);
        }
        this.f1928k = getContext();
        setPopupTheme(m1505v.m1519n(C0929j.f6331J3, 0));
        Drawable m1512g = m1505v.m1512g(C0929j.f6326I3);
        if (m1512g != null) {
            setNavigationIcon(m1512g);
        }
        CharSequence m1521p3 = m1505v.m1521p(C0929j.f6321H3);
        if (!TextUtils.isEmpty(m1521p3)) {
            setNavigationContentDescription(m1521p3);
        }
        Drawable m1512g2 = m1505v.m1512g(C0929j.f6301D3);
        if (m1512g2 != null) {
            setLogo(m1512g2);
        }
        CharSequence m1521p4 = m1505v.m1521p(C0929j.f6306E3);
        if (!TextUtils.isEmpty(m1521p4)) {
            setLogoDescription(m1521p4);
        }
        int i12 = C0929j.f6391V3;
        if (m1505v.m1524s(i12)) {
            setTitleTextColor(m1505v.m1508c(i12));
        }
        int i13 = C0929j.f6346M3;
        if (m1505v.m1524s(i13)) {
            setSubtitleTextColor(m1505v.m1508c(i13));
        }
        int i14 = C0929j.f6316G3;
        if (m1505v.m1524s(i14)) {
            m1224x(m1505v.m1519n(i14, 0));
        }
        m1505v.m1525w();
    }

    private MenuInflater getMenuInflater() {
        return new C5139g(getContext());
    }

    /* renamed from: A */
    public boolean m1186A() {
        ActionMenuView actionMenuView = this.f1919b;
        return actionMenuView != null && actionMenuView.m1103H();
    }

    /* renamed from: B */
    public final int m1187B(View view, int i10, int[] iArr, int i11) {
        C0292e c0292e = (C0292e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0292e).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int m1217q = m1217q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m1217q, max + measuredWidth, view.getMeasuredHeight() + m1217q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0292e).rightMargin;
    }

    /* renamed from: C */
    public final int m1188C(View view, int i10, int[] iArr, int i11) {
        C0292e c0292e = (C0292e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0292e).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int m1217q = m1217q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m1217q, max, view.getMeasuredHeight() + m1217q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0292e).leftMargin);
    }

    /* renamed from: D */
    public final int m1189D(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: E */
    public final void m1190E(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        int i15 = childMeasureSpec2;
        if (mode != 1073741824) {
            i15 = childMeasureSpec2;
            if (i14 >= 0) {
                int i16 = i14;
                if (mode != 0) {
                    i16 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
                }
                i15 = View.MeasureSpec.makeMeasureSpec(i16, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
            }
        }
        view.measure(childMeasureSpec, i15);
    }

    /* renamed from: F */
    public final void m1191F() {
        removeCallbacks(this.f1918P);
        post(this.f1918P);
    }

    /* renamed from: G */
    public void m1192G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0292e) childAt.getLayoutParams()).f1950b != 2 && childAt != this.f1919b) {
                removeViewAt(childCount);
                this.f1908F.add(childAt);
            }
        }
    }

    /* renamed from: H */
    public void m1193H(int i10, int i11) {
        m1208h();
        this.f1938u.m1365g(i10, i11);
    }

    /* renamed from: I */
    public void m1194I(C0250e c0250e, C0302c c0302c) {
        if (c0250e == null && this.f1919b == null) {
            return;
        }
        m1211k();
        C0250e m1106L = this.f1919b.m1106L();
        if (m1106L == c0250e) {
            return;
        }
        if (m1106L != null) {
            m1106L.m962O(this.f1913K);
            m1106L.m962O(this.f1914L);
        }
        if (this.f1914L == null) {
            this.f1914L = new C0291d(this);
        }
        c0302c.m1265G(true);
        if (c0250e != null) {
            c0250e.m978c(c0302c, this.f1928k);
            c0250e.m978c(this.f1914L, this.f1928k);
        } else {
            c0302c.mo908i(this.f1928k, null);
            this.f1914L.mo908i(this.f1928k, null);
            c0302c.mo906f(true);
            this.f1914L.mo906f(true);
        }
        this.f1919b.setPopupTheme(this.f1929l);
        this.f1919b.setPresenter(c0302c);
        this.f1913K = c0302c;
    }

    /* renamed from: J */
    public void m1195J(InterfaceC0254i.a aVar, C0250e.a aVar2) {
        this.f1915M = aVar;
        this.f1916N = aVar2;
        ActionMenuView actionMenuView = this.f1919b;
        if (actionMenuView != null) {
            actionMenuView.m1107M(aVar, aVar2);
        }
    }

    /* renamed from: K */
    public void m1196K(Context context, int i10) {
        this.f1931n = i10;
        TextView textView = this.f1921d;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    /* renamed from: L */
    public void m1197L(Context context, int i10) {
        this.f1930m = i10;
        TextView textView = this.f1920c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    /* renamed from: M */
    public final boolean m1198M() {
        if (!this.f1917O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (m1199N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    public final boolean m1199N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: O */
    public boolean m1200O() {
        ActionMenuView actionMenuView = this.f1919b;
        return actionMenuView != null && actionMenuView.m1108N();
    }

    /* renamed from: a */
    public void m1201a() {
        for (int size = this.f1908F.size() - 1; size >= 0; size--) {
            addView(this.f1908F.get(size));
        }
        this.f1908F.clear();
    }

    /* renamed from: b */
    public final void m1202b(List<View> list, int i10) {
        boolean z10 = C6824g0.m31473C(this) == 1;
        int childCount = getChildCount();
        int m31460b = C6820f.m31460b(i10, C6824g0.m31473C(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                C0292e c0292e = (C0292e) childAt.getLayoutParams();
                if (c0292e.f1950b == 0 && m1199N(childAt) && m1216p(c0292e.f26228a) == m31460b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            C0292e c0292e2 = (C0292e) childAt2.getLayoutParams();
            if (c0292e2.f1950b == 0 && m1199N(childAt2) && m1216p(c0292e2.f26228a) == m31460b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    public final void m1203c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0292e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0292e) layoutParams;
        generateDefaultLayoutParams.f1950b = 1;
        if (!z10 || this.f1927j == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f1908F.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0292e);
    }

    /* renamed from: d */
    public boolean m1204d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1919b) != null && actionMenuView.m1104I();
    }

    /* renamed from: e */
    public void m1205e() {
        C0291d c0291d = this.f1914L;
        C0252g c0252g = c0291d == null ? null : c0291d.f1948c;
        if (c0252g != null) {
            c0252g.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m1206f() {
        ActionMenuView actionMenuView = this.f1919b;
        if (actionMenuView != null) {
            actionMenuView.m1112z();
        }
    }

    /* renamed from: g */
    public void m1207g() {
        if (this.f1926i == null) {
            C0329l c0329l = new C0329l(getContext(), null, C0920a.f6104S);
            this.f1926i = c0329l;
            c0329l.setImageDrawable(this.f1924g);
            this.f1926i.setContentDescription(this.f1925h);
            C0292e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f26228a = 8388611 | (this.f1932o & 112);
            generateDefaultLayoutParams.f1950b = 2;
            this.f1926i.setLayoutParams(generateDefaultLayoutParams);
            this.f1926i.setOnClickListener(new ViewOnClickListenerC0290c(this));
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1926i;
        return imageButton != null ? imageButton.getContentDescription() : null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1926i;
        return imageButton != null ? imageButton.getDrawable() : null;
    }

    public int getContentInsetEnd() {
        C0313f1 c0313f1 = this.f1938u;
        return c0313f1 != null ? c0313f1.m1359a() : 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1940w;
        if (i10 == Integer.MIN_VALUE) {
            i10 = getContentInsetEnd();
        }
        return i10;
    }

    public int getContentInsetLeft() {
        C0313f1 c0313f1 = this.f1938u;
        return c0313f1 != null ? c0313f1.m1360b() : 0;
    }

    public int getContentInsetRight() {
        C0313f1 c0313f1 = this.f1938u;
        return c0313f1 != null ? c0313f1.m1361c() : 0;
    }

    public int getContentInsetStart() {
        C0313f1 c0313f1 = this.f1938u;
        return c0313f1 != null ? c0313f1.m1362d() : 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1939v;
        if (i10 == Integer.MIN_VALUE) {
            i10 = getContentInsetStart();
        }
        return i10;
    }

    public int getCurrentContentInsetEnd() {
        C0250e m1106L;
        ActionMenuView actionMenuView = this.f1919b;
        return actionMenuView != null && (m1106L = actionMenuView.m1106L()) != null && m1106L.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1940w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C6824g0.m31473C(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C6824g0.m31473C(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1939v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1923f;
        return imageView != null ? imageView.getDrawable() : null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1923f;
        return imageView != null ? imageView.getContentDescription() : null;
    }

    public Menu getMenu() {
        m1210j();
        return this.f1919b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1922e;
        return imageButton != null ? imageButton.getContentDescription() : null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1922e;
        return imageButton != null ? imageButton.getDrawable() : null;
    }

    public C0302c getOuterActionMenuPresenter() {
        return this.f1913K;
    }

    public Drawable getOverflowIcon() {
        m1210j();
        return this.f1919b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1928k;
    }

    public int getPopupTheme() {
        return this.f1929l;
    }

    public CharSequence getSubtitle() {
        return this.f1943z;
    }

    public final TextView getSubtitleTextView() {
        return this.f1921d;
    }

    public CharSequence getTitle() {
        return this.f1942y;
    }

    public int getTitleMarginBottom() {
        return this.f1937t;
    }

    public int getTitleMarginEnd() {
        return this.f1935r;
    }

    public int getTitleMarginStart() {
        return this.f1934q;
    }

    public int getTitleMarginTop() {
        return this.f1936s;
    }

    public final TextView getTitleTextView() {
        return this.f1920c;
    }

    public InterfaceC0333m0 getWrapper() {
        if (this.f1912J == null) {
            this.f1912J = new C0340o1(this, true);
        }
        return this.f1912J;
    }

    /* renamed from: h */
    public final void m1208h() {
        if (this.f1938u == null) {
            this.f1938u = new C0313f1();
        }
    }

    /* renamed from: i */
    public final void m1209i() {
        if (this.f1923f == null) {
            this.f1923f = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    public final void m1210j() {
        m1211k();
        if (this.f1919b.m1106L() == null) {
            C0250e c0250e = (C0250e) this.f1919b.getMenu();
            if (this.f1914L == null) {
                this.f1914L = new C0291d(this);
            }
            this.f1919b.setExpandedActionViewsExclusive(true);
            c0250e.m978c(this.f1914L, this.f1928k);
        }
    }

    /* renamed from: k */
    public final void m1211k() {
        if (this.f1919b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1919b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1929l);
            this.f1919b.setOnMenuItemClickListener(this.f1911I);
            this.f1919b.m1107M(this.f1915M, this.f1916N);
            C0292e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f26228a = 8388613 | (this.f1932o & 112);
            this.f1919b.setLayoutParams(generateDefaultLayoutParams);
            m1203c(this.f1919b, false);
        }
    }

    /* renamed from: l */
    public final void m1212l() {
        if (this.f1922e == null) {
            this.f1922e = new C0329l(getContext(), null, C0920a.f6104S);
            C0292e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f26228a = 8388611 | (this.f1932o & 112);
            this.f1922e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0292e generateDefaultLayoutParams() {
        return new C0292e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0292e generateLayoutParams(AttributeSet attributeSet) {
        return new C0292e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0292e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0292e ? new C0292e((C0292e) layoutParams) : layoutParams instanceof AbstractC4275a.a ? new C0292e((AbstractC4275a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0292e((ViewGroup.MarginLayoutParams) layoutParams) : new C0292e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1918P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1906D = false;
        }
        if (!this.f1906D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1906D = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1906D = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0544 A[LOOP:0: B:49:0x053e->B:51:0x0544, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0579 A[LOOP:1: B:54:0x0573->B:56:0x0579, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05f4 A[LOOP:2: B:65:0x05ee->B:67:0x05f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x036e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 1559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr = this.f1909G;
        boolean m1621b = C0358u1.m1621b(this);
        if (m1199N(this.f1922e)) {
            m1190E(this.f1922e, i10, 0, i11, 0, this.f1933p);
            i12 = this.f1922e.getMeasuredWidth() + m1219s(this.f1922e);
            i13 = Math.max(0, this.f1922e.getMeasuredHeight() + m1220t(this.f1922e));
            i14 = View.combineMeasuredStates(0, this.f1922e.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        int i18 = i12;
        int i19 = i13;
        int i20 = i14;
        if (m1199N(this.f1926i)) {
            m1190E(this.f1926i, i10, 0, i11, 0, this.f1933p);
            i18 = this.f1926i.getMeasuredWidth() + m1219s(this.f1926i);
            i19 = Math.max(i13, this.f1926i.getMeasuredHeight() + m1220t(this.f1926i));
            i20 = View.combineMeasuredStates(i14, this.f1926i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i18);
        iArr[m1621b ? 1 : 0] = Math.max(0, currentContentInsetStart - i18);
        if (m1199N(this.f1919b)) {
            m1190E(this.f1919b, i10, max, i11, 0, this.f1933p);
            i15 = this.f1919b.getMeasuredWidth() + m1219s(this.f1919b);
            i19 = Math.max(i19, this.f1919b.getMeasuredHeight() + m1220t(this.f1919b));
            i20 = View.combineMeasuredStates(i20, this.f1919b.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[!m1621b ? 1 : 0] = Math.max(0, currentContentInsetEnd - i15);
        int i21 = i19;
        int i22 = i20;
        int i23 = max2;
        if (m1199N(this.f1927j)) {
            i23 = max2 + m1189D(this.f1927j, i10, max2, i11, 0, iArr);
            i21 = Math.max(i19, this.f1927j.getMeasuredHeight() + m1220t(this.f1927j));
            i22 = View.combineMeasuredStates(i20, this.f1927j.getMeasuredState());
        }
        int i24 = i21;
        int i25 = i22;
        int i26 = i23;
        if (m1199N(this.f1923f)) {
            i26 = i23 + m1189D(this.f1923f, i10, i23, i11, 0, iArr);
            i24 = Math.max(i21, this.f1923f.getMeasuredHeight() + m1220t(this.f1923f));
            i25 = View.combineMeasuredStates(i22, this.f1923f.getMeasuredState());
        }
        int childCount = getChildCount();
        int i27 = i26;
        int i28 = i25;
        int i29 = i24;
        int i30 = 0;
        while (i30 < childCount) {
            View childAt = getChildAt(i30);
            int i31 = i29;
            int i32 = i28;
            int i33 = i27;
            if (((C0292e) childAt.getLayoutParams()).f1950b == 0) {
                if (m1199N(childAt)) {
                    i33 = i27 + m1189D(childAt, i10, i27, i11, 0, iArr);
                    i31 = Math.max(i29, childAt.getMeasuredHeight() + m1220t(childAt));
                    i32 = View.combineMeasuredStates(i28, childAt.getMeasuredState());
                } else {
                    i31 = i29;
                    i32 = i28;
                    i33 = i27;
                }
            }
            i30++;
            i29 = i31;
            i28 = i32;
            i27 = i33;
        }
        int i34 = this.f1936s + this.f1937t;
        int i35 = this.f1934q + this.f1935r;
        if (m1199N(this.f1920c)) {
            m1189D(this.f1920c, i10, i27 + i35, i11, i34, iArr);
            int measuredWidth = this.f1920c.getMeasuredWidth();
            int m1219s = m1219s(this.f1920c);
            int measuredHeight = this.f1920c.getMeasuredHeight();
            int m1220t = m1220t(this.f1920c);
            i28 = View.combineMeasuredStates(i28, this.f1920c.getMeasuredState());
            i17 = measuredHeight + m1220t;
            i16 = measuredWidth + m1219s;
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (m1199N(this.f1921d)) {
            i16 = Math.max(i16, m1189D(this.f1921d, i10, i27 + i35, i11, i17 + i34, iArr));
            i17 += this.f1921d.getMeasuredHeight() + m1220t(this.f1921d);
            i28 = View.combineMeasuredStates(i28, this.f1921d.getMeasuredState());
        }
        int max3 = Math.max(i29, i17);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i27 + i16 + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & i28);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i11, i28 << 16);
        if (m1198M()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0294g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0294g c0294g = (C0294g) parcelable;
        super.onRestoreInstanceState(c0294g.m37586b());
        ActionMenuView actionMenuView = this.f1919b;
        C0250e m1106L = actionMenuView != null ? actionMenuView.m1106L() : null;
        int i10 = c0294g.f1951d;
        if (i10 != 0 && this.f1914L != null && m1106L != null && (findItem = m1106L.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (c0294g.f1952e) {
            m1191F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        m1208h();
        C0313f1 c0313f1 = this.f1938u;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        c0313f1.m1364f(z10);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0252g c0252g;
        C0294g c0294g = new C0294g(super.onSaveInstanceState());
        C0291d c0291d = this.f1914L;
        if (c0291d != null && (c0252g = c0291d.f1948c) != null) {
            c0294g.f1951d = c0252g.getItemId();
        }
        c0294g.f1952e = m1186A();
        return c0294g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1905C = false;
        }
        if (!this.f1905C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1905C = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1905C = false;
        return true;
    }

    /* renamed from: p */
    public final int m1216p(int i10) {
        int m31473C = C6824g0.m31473C(this);
        int m31460b = C6820f.m31460b(i10, m31473C) & 7;
        if (m31460b != 1) {
            int i11 = 3;
            if (m31460b != 3 && m31460b != 5) {
                if (m31473C == 1) {
                    i11 = 5;
                }
                return i11;
            }
        }
        return m31460b;
    }

    /* renamed from: q */
    public final int m1217q(View view, int i10) {
        C0292e c0292e = (C0292e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int m1218r = m1218r(c0292e.f26228a);
        if (m1218r == 48) {
            return getPaddingTop() - i11;
        }
        if (m1218r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0292e).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) c0292e).topMargin;
        if (i12 >= i13) {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) c0292e).bottomMargin;
            i13 = i12;
            if (i14 < i15) {
                i13 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i13;
    }

    /* renamed from: r */
    public final int m1218r(int i10) {
        int i11 = i10 & 112;
        int i12 = i11;
        if (i11 != 16) {
            i12 = i11;
            if (i11 != 48) {
                i12 = i11;
                if (i11 != 80) {
                    i12 = this.f1941x & 112;
                }
            }
        }
        return i12;
    }

    /* renamed from: s */
    public final int m1219s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C6829i.m31600b(marginLayoutParams) + C6829i.m31599a(marginLayoutParams);
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1207g();
        }
        ImageButton imageButton = this.f1926i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(C4561b.m22999d(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1207g();
            this.f1926i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1926i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1924g);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f1917O = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        int i11 = i10;
        if (i10 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f1940w) {
            this.f1940w = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        int i11 = i10;
        if (i10 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f1939v) {
            this.f1939v = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(C4561b.m22999d(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1209i();
            if (!m1225y(this.f1923f)) {
                m1203c(this.f1923f, true);
            }
        } else {
            ImageView imageView = this.f1923f;
            if (imageView != null && m1225y(imageView)) {
                removeView(this.f1923f);
                this.f1908F.remove(this.f1923f);
            }
        }
        ImageView imageView2 = this.f1923f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1209i();
        }
        ImageView imageView = this.f1923f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1212l();
        }
        ImageButton imageButton = this.f1922e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(C4561b.m22999d(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1212l();
            if (!m1225y(this.f1922e)) {
                m1203c(this.f1922e, true);
            }
        } else {
            ImageButton imageButton = this.f1922e;
            if (imageButton != null && m1225y(imageButton)) {
                removeView(this.f1922e);
                this.f1908F.remove(this.f1922e);
            }
        }
        ImageButton imageButton2 = this.f1922e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1212l();
        this.f1922e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0293f interfaceC0293f) {
        this.f1910H = interfaceC0293f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1210j();
        this.f1919b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1929l != i10) {
            this.f1929l = i10;
            if (i10 == 0) {
                this.f1928k = getContext();
            } else {
                this.f1928k = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1921d;
            if (textView != null && m1225y(textView)) {
                removeView(this.f1921d);
                this.f1908F.remove(this.f1921d);
            }
        } else {
            if (this.f1921d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1921d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1921d.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1931n;
                if (i10 != 0) {
                    this.f1921d.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1904B;
                if (colorStateList != null) {
                    this.f1921d.setTextColor(colorStateList);
                }
            }
            if (!m1225y(this.f1921d)) {
                m1203c(this.f1921d, true);
            }
        }
        TextView textView2 = this.f1921d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1943z = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1904B = colorStateList;
        TextView textView = this.f1921d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1920c;
            if (textView != null && m1225y(textView)) {
                removeView(this.f1920c);
                this.f1908F.remove(this.f1920c);
            }
        } else {
            if (this.f1920c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1920c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1920c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1930m;
                if (i10 != 0) {
                    this.f1920c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1903A;
                if (colorStateList != null) {
                    this.f1920c.setTextColor(colorStateList);
                }
            }
            if (!m1225y(this.f1920c)) {
                m1203c(this.f1920c, true);
            }
        }
        TextView textView2 = this.f1920c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1942y = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f1937t = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1935r = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1934q = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1936s = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1903A = colorStateList;
        TextView textView = this.f1920c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: t */
    public final int m1220t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    public final int m1221u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            View view = list.get(i13);
            C0292e c0292e = (C0292e) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) c0292e).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) c0292e).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            i10 = Math.max(0, -i14);
            i11 = Math.max(0, -i15);
            i12 += max + view.getMeasuredWidth() + max2;
        }
        return i12;
    }

    /* renamed from: v */
    public boolean m1222v() {
        C0291d c0291d = this.f1914L;
        return (c0291d == null || c0291d.f1948c == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m1223w() {
        ActionMenuView actionMenuView = this.f1919b;
        return actionMenuView != null && actionMenuView.m1101F();
    }

    /* renamed from: x */
    public void m1224x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    /* renamed from: y */
    public final boolean m1225y(View view) {
        return view.getParent() == this || this.f1908F.contains(view);
    }

    /* renamed from: z */
    public boolean m1226z() {
        ActionMenuView actionMenuView = this.f1919b;
        return actionMenuView != null && actionMenuView.m1102G();
    }
}
