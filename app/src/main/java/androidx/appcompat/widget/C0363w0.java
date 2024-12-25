package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.ads.AdError;
import java.lang.reflect.Method;
import p029c.C0920a;
import p029c.C0929j;
import p155j.InterfaceC5274f;
import p235o0.C6824g0;
import p314s0.C8503k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/w0.class
 */
/* renamed from: androidx.appcompat.widget.w0 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/w0.class */
public class C0363w0 implements InterfaceC5274f {

    /* renamed from: H */
    public static Method f2305H;

    /* renamed from: I */
    public static Method f2306I;

    /* renamed from: J */
    public static Method f2307J;

    /* renamed from: A */
    public final c f2308A;

    /* renamed from: B */
    public Runnable f2309B;

    /* renamed from: C */
    public final Handler f2310C;

    /* renamed from: D */
    public final Rect f2311D;

    /* renamed from: E */
    public Rect f2312E;

    /* renamed from: F */
    public boolean f2313F;

    /* renamed from: G */
    public PopupWindow f2314G;

    /* renamed from: b */
    public Context f2315b;

    /* renamed from: c */
    public ListAdapter f2316c;

    /* renamed from: d */
    public C0342p0 f2317d;

    /* renamed from: e */
    public int f2318e;

    /* renamed from: f */
    public int f2319f;

    /* renamed from: g */
    public int f2320g;

    /* renamed from: h */
    public int f2321h;

    /* renamed from: i */
    public int f2322i;

    /* renamed from: j */
    public boolean f2323j;

    /* renamed from: k */
    public boolean f2324k;

    /* renamed from: l */
    public boolean f2325l;

    /* renamed from: m */
    public int f2326m;

    /* renamed from: n */
    public boolean f2327n;

    /* renamed from: o */
    public boolean f2328o;

    /* renamed from: p */
    public int f2329p;

    /* renamed from: q */
    public View f2330q;

    /* renamed from: r */
    public int f2331r;

    /* renamed from: s */
    public DataSetObserver f2332s;

    /* renamed from: t */
    public View f2333t;

    /* renamed from: u */
    public Drawable f2334u;

    /* renamed from: v */
    public AdapterView.OnItemClickListener f2335v;

    /* renamed from: w */
    public AdapterView.OnItemSelectedListener f2336w;

    /* renamed from: x */
    public final g f2337x;

    /* renamed from: y */
    public final f f2338y;

    /* renamed from: z */
    public final e f2339z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/w0$a.class
     */
    /* renamed from: androidx.appcompat.widget.w0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/w0$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C0363w0 f2340b;

        public a(C0363w0 c0363w0) {
            this.f2340b = c0363w0;
        }

        @Override // java.lang.Runnable
        public void run() {
            View m1670s = this.f2340b.m1670s();
            if (m1670s == null || m1670s.getWindowToken() == null) {
                return;
            }
            this.f2340b.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/w0$b.class
     */
    /* renamed from: androidx.appcompat.widget.w0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/w0$b.class */
    public class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final C0363w0 f2341b;

        public b(C0363w0 c0363w0) {
            this.f2341b = c0363w0;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            C0342p0 c0342p0;
            if (i10 == -1 || (c0342p0 = this.f2341b.f2317d) == null) {
                return;
            }
            c0342p0.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/w0$c.class
     */
    /* renamed from: androidx.appcompat.widget.w0$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/w0$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final C0363w0 f2342b;

        public c(C0363w0 c0363w0) {
            this.f2342b = c0363w0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2342b.m1669q();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/w0$d.class
     */
    /* renamed from: androidx.appcompat.widget.w0$d */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/w0$d.class */
    public class d extends DataSetObserver {

        /* renamed from: a */
        public final C0363w0 f2343a;

        public d(C0363w0 c0363w0) {
            this.f2343a = c0363w0;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (this.f2343a.mo922a()) {
                this.f2343a.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            this.f2343a.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/w0$e.class
     */
    /* renamed from: androidx.appcompat.widget.w0$e */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/w0$e.class */
    public class e implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final C0363w0 f2344a;

        public e(C0363w0 c0363w0) {
            this.f2344a = c0363w0;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || this.f2344a.m1677z() || this.f2344a.f2314G.getContentView() == null) {
                return;
            }
            C0363w0 c0363w0 = this.f2344a;
            c0363w0.f2310C.removeCallbacks(c0363w0.f2337x);
            this.f2344a.f2337x.run();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/w0$f.class
     */
    /* renamed from: androidx.appcompat.widget.w0$f */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/w0$f.class */
    public class f implements View.OnTouchListener {

        /* renamed from: b */
        public final C0363w0 f2345b;

        public f(C0363w0 c0363w0) {
            this.f2345b = c0363w0;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = this.f2345b.f2314G) != null && popupWindow.isShowing() && x10 >= 0 && x10 < this.f2345b.f2314G.getWidth() && y10 >= 0 && y10 < this.f2345b.f2314G.getHeight()) {
                C0363w0 c0363w0 = this.f2345b;
                c0363w0.f2310C.postDelayed(c0363w0.f2337x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0363w0 c0363w02 = this.f2345b;
            c0363w02.f2310C.removeCallbacks(c0363w02.f2337x);
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/w0$g.class
     */
    /* renamed from: androidx.appcompat.widget.w0$g */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/w0$g.class */
    public class g implements Runnable {

        /* renamed from: b */
        public final C0363w0 f2346b;

        public g(C0363w0 c0363w0) {
            this.f2346b = c0363w0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0342p0 c0342p0 = this.f2346b.f2317d;
            if (c0342p0 == null || !C6824g0.m31501T(c0342p0) || this.f2346b.f2317d.getCount() <= this.f2346b.f2317d.getChildCount()) {
                return;
            }
            int childCount = this.f2346b.f2317d.getChildCount();
            C0363w0 c0363w0 = this.f2346b;
            if (childCount <= c0363w0.f2329p) {
                c0363w0.f2314G.setInputMethodMode(2);
                this.f2346b.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2305H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e10) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2307J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException e11) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f2306I = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException e12) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0363w0(Context context) {
        this(context, null, C0920a.f6093H);
    }

    public C0363w0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public C0363w0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2318e = -2;
        this.f2319f = -2;
        this.f2322i = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.f2326m = 0;
        this.f2327n = false;
        this.f2328o = false;
        this.f2329p = Integer.MAX_VALUE;
        this.f2331r = 0;
        this.f2337x = new g(this);
        this.f2338y = new f(this);
        this.f2339z = new e(this);
        this.f2308A = new c(this);
        this.f2311D = new Rect();
        this.f2315b = context;
        this.f2310C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0929j.f6531w1, i10, i11);
        this.f2320g = obtainStyledAttributes.getDimensionPixelOffset(C0929j.f6536x1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0929j.f6541y1, 0);
        this.f2321h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2323j = true;
        }
        obtainStyledAttributes.recycle();
        C0338o c0338o = new C0338o(context, attributeSet, i10, i11);
        this.f2314G = c0338o;
        c0338o.setInputMethodMode(1);
    }

    /* renamed from: A */
    public boolean m1646A() {
        return this.f2313F;
    }

    /* renamed from: B */
    public final void m1647B() {
        View view = this.f2330q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2330q);
            }
        }
    }

    /* renamed from: C */
    public void m1648C(View view) {
        this.f2333t = view;
    }

    /* renamed from: D */
    public void m1649D(int i10) {
        this.f2314G.setAnimationStyle(i10);
    }

    /* renamed from: E */
    public void m1650E(int i10) {
        Drawable background = this.f2314G.getBackground();
        if (background == null) {
            m1661P(i10);
            return;
        }
        background.getPadding(this.f2311D);
        Rect rect = this.f2311D;
        this.f2319f = rect.left + rect.right + i10;
    }

    /* renamed from: F */
    public void m1651F(int i10) {
        this.f2326m = i10;
    }

    /* renamed from: G */
    public void m1652G(Rect rect) {
        this.f2312E = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: H */
    public void m1653H(int i10) {
        this.f2314G.setInputMethodMode(i10);
    }

    /* renamed from: I */
    public void m1654I(boolean z10) {
        this.f2313F = z10;
        this.f2314G.setFocusable(z10);
    }

    /* renamed from: J */
    public void m1655J(PopupWindow.OnDismissListener onDismissListener) {
        this.f2314G.setOnDismissListener(onDismissListener);
    }

    /* renamed from: K */
    public void m1656K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2335v = onItemClickListener;
    }

    /* renamed from: L */
    public void m1657L(boolean z10) {
        this.f2325l = true;
        this.f2324k = z10;
    }

    /* renamed from: M */
    public final void m1658M(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f2314G.setIsClippedToScreen(z10);
            return;
        }
        Method method = f2305H;
        if (method != null) {
            try {
                method.invoke(this.f2314G, Boolean.valueOf(z10));
            } catch (Exception e10) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: N */
    public void m1659N(int i10) {
        this.f2331r = i10;
    }

    /* renamed from: O */
    public void m1660O(int i10) {
        C0342p0 c0342p0 = this.f2317d;
        if (!mo922a() || c0342p0 == null) {
            return;
        }
        c0342p0.setListSelectionHidden(false);
        c0342p0.setSelection(i10);
        if (c0342p0.getChoiceMode() != 0) {
            c0342p0.setItemChecked(i10, true);
        }
    }

    /* renamed from: P */
    public void m1661P(int i10) {
        this.f2319f = i10;
    }

    @Override // p155j.InterfaceC5274f
    /* renamed from: a */
    public boolean mo922a() {
        return this.f2314G.isShowing();
    }

    /* renamed from: b */
    public void m1662b(Drawable drawable) {
        this.f2314G.setBackgroundDrawable(drawable);
    }

    /* renamed from: c */
    public int m1663c() {
        return this.f2320g;
    }

    @Override // p155j.InterfaceC5274f
    public void dismiss() {
        this.f2314G.dismiss();
        m1647B();
        this.f2314G.setContentView(null);
        this.f2317d = null;
        this.f2310C.removeCallbacks(this.f2337x);
    }

    /* renamed from: e */
    public void m1664e(int i10) {
        this.f2320g = i10;
    }

    /* renamed from: g */
    public Drawable m1665g() {
        return this.f2314G.getBackground();
    }

    /* renamed from: i */
    public void m1666i(int i10) {
        this.f2321h = i10;
        this.f2323j = true;
    }

    /* renamed from: l */
    public int m1667l() {
        if (this.f2323j) {
            return this.f2321h;
        }
        return 0;
    }

    /* renamed from: m */
    public void mo1636m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2332s;
        if (dataSetObserver == null) {
            this.f2332s = new d(this);
        } else {
            ListAdapter listAdapter2 = this.f2316c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2316c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2332s);
        }
        C0342p0 c0342p0 = this.f2317d;
        if (c0342p0 != null) {
            c0342p0.setAdapter(this.f2316c);
        }
    }

    @Override // p155j.InterfaceC5274f
    /* renamed from: o */
    public ListView mo927o() {
        return this.f2317d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0294  */
    /* JADX WARN: Type inference failed for: r14v9, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m1668p() {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0363w0.m1668p():int");
    }

    /* renamed from: q */
    public void m1669q() {
        C0342p0 c0342p0 = this.f2317d;
        if (c0342p0 != null) {
            c0342p0.setListSelectionHidden(true);
            c0342p0.requestLayout();
        }
    }

    /* renamed from: r */
    public C0342p0 mo1249r(Context context, boolean z10) {
        return new C0342p0(context, z10);
    }

    /* renamed from: s */
    public View m1670s() {
        return this.f2333t;
    }

    @Override // p155j.InterfaceC5274f
    public void show() {
        int i10;
        int i11;
        int m1668p = m1668p();
        boolean m1677z = m1677z();
        C8503k.m36698b(this.f2314G, this.f2322i);
        boolean z10 = true;
        if (this.f2314G.isShowing()) {
            if (C6824g0.m31501T(m1670s())) {
                int i12 = this.f2319f;
                if (i12 == -1) {
                    i11 = -1;
                } else {
                    i11 = i12;
                    if (i12 == -2) {
                        i11 = m1670s().getWidth();
                    }
                }
                int i13 = this.f2318e;
                if (i13 == -1) {
                    if (!m1677z) {
                        m1668p = -1;
                    }
                    if (m1677z) {
                        this.f2314G.setWidth(this.f2319f == -1 ? -1 : 0);
                        this.f2314G.setHeight(0);
                    } else {
                        this.f2314G.setWidth(this.f2319f == -1 ? -1 : 0);
                        this.f2314G.setHeight(-1);
                    }
                } else if (i13 != -2) {
                    m1668p = i13;
                }
                PopupWindow popupWindow = this.f2314G;
                if (this.f2328o || this.f2327n) {
                    z10 = false;
                }
                popupWindow.setOutsideTouchable(z10);
                PopupWindow popupWindow2 = this.f2314G;
                View m1670s = m1670s();
                int i14 = this.f2320g;
                int i15 = this.f2321h;
                if (i11 < 0) {
                    i11 = -1;
                }
                if (m1668p < 0) {
                    m1668p = -1;
                }
                popupWindow2.update(m1670s, i14, i15, i11, m1668p);
                return;
            }
            return;
        }
        int i16 = this.f2319f;
        if (i16 == -1) {
            i10 = -1;
        } else {
            i10 = i16;
            if (i16 == -2) {
                i10 = m1670s().getWidth();
            }
        }
        int i17 = this.f2318e;
        if (i17 == -1) {
            m1668p = -1;
        } else if (i17 != -2) {
            m1668p = i17;
        }
        this.f2314G.setWidth(i10);
        this.f2314G.setHeight(m1668p);
        m1658M(true);
        this.f2314G.setOutsideTouchable((this.f2328o || this.f2327n) ? false : true);
        this.f2314G.setTouchInterceptor(this.f2338y);
        if (this.f2325l) {
            C8503k.m36697a(this.f2314G, this.f2324k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2307J;
            if (method != null) {
                try {
                    method.invoke(this.f2314G, this.f2312E);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            this.f2314G.setEpicenterBounds(this.f2312E);
        }
        C8503k.m36699c(this.f2314G, m1670s(), this.f2320g, this.f2321h, this.f2326m);
        this.f2317d.setSelection(-1);
        if (!this.f2313F || this.f2317d.isInTouchMode()) {
            m1669q();
        }
        if (this.f2313F) {
            return;
        }
        this.f2310C.post(this.f2308A);
    }

    /* renamed from: t */
    public final int m1671t(View view, int i10, boolean z10) {
        int maxAvailableHeight;
        if (Build.VERSION.SDK_INT > 23) {
            maxAvailableHeight = this.f2314G.getMaxAvailableHeight(view, i10, z10);
            return maxAvailableHeight;
        }
        Method method = f2306I;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f2314G, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
            } catch (Exception e10) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f2314G.getMaxAvailableHeight(view, i10);
    }

    /* renamed from: u */
    public Object m1672u() {
        if (mo922a()) {
            return this.f2317d.getSelectedItem();
        }
        return null;
    }

    /* renamed from: v */
    public long m1673v() {
        if (mo922a()) {
            return this.f2317d.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: w */
    public int m1674w() {
        if (mo922a()) {
            return this.f2317d.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: x */
    public View m1675x() {
        if (mo922a()) {
            return this.f2317d.getSelectedView();
        }
        return null;
    }

    /* renamed from: y */
    public int m1676y() {
        return this.f2319f;
    }

    /* renamed from: z */
    public boolean m1677z() {
        return this.f2314G.getInputMethodMode() == 2;
    }
}
