package p235o0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p018b0.C0778c;
import p235o0.C6805a;
import p235o0.C6813c1;
import p261p0.C7535k;
import p261p0.InterfaceC7538n;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/g0.class
 */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: o0.g0 */
/* loaded from: combined.jar:classes1.jar:o0/g0.class */
public class C6824g0 {

    /* renamed from: c */
    public static Field f35552c;

    /* renamed from: e */
    public static ThreadLocal<Rect> f35554e;

    /* renamed from: a */
    public static final AtomicInteger f35550a = new AtomicInteger(1);

    /* renamed from: b */
    public static WeakHashMap<View, C6864y0> f35551b = null;

    /* renamed from: d */
    public static boolean f35553d = false;

    /* renamed from: f */
    public static final int[] f35555f = {C0778c.f5327b, C0778c.f5328c, C0778c.f5339n, C0778c.f5350y, C0778c.f5308B, C0778c.f5309C, C0778c.f5310D, C0778c.f5311E, C0778c.f5312F, C0778c.f5313G, C0778c.f5329d, C0778c.f5330e, C0778c.f5331f, C0778c.f5332g, C0778c.f5333h, C0778c.f5334i, C0778c.f5335j, C0778c.f5336k, C0778c.f5337l, C0778c.f5338m, C0778c.f5340o, C0778c.f5341p, C0778c.f5342q, C0778c.f5343r, C0778c.f5344s, C0778c.f5345t, C0778c.f5346u, C0778c.f5347v, C0778c.f5348w, C0778c.f5349x, C0778c.f5351z, C0778c.f5307A};

    /* renamed from: g */
    public static final InterfaceC6863y f35556g = new a();

    /* renamed from: h */
    public static f f35557h = new f();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$a.class
     */
    /* renamed from: o0.g0$a */
    /* loaded from: combined.jar:classes1.jar:o0/g0$a.class */
    public class a implements InterfaceC6863y {
        @Override // p235o0.InterfaceC6863y
        /* renamed from: a */
        public C6811c mo1460a(C6811c c6811c) {
            return c6811c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$b.class
     */
    /* renamed from: o0.g0$b */
    /* loaded from: combined.jar:classes1.jar:o0/g0$b.class */
    public class b extends g<Boolean> {
        public b(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo31560d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return Boolean.valueOf(isScreenReaderFocusable);
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo31561e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo31562h(Boolean bool, Boolean bool2) {
            return !m31577a(bool, bool2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$c.class
     */
    /* renamed from: o0.g0$c */
    /* loaded from: combined.jar:classes1.jar:o0/g0$c.class */
    public class c extends g<CharSequence> {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo31560d(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo31561e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo31562h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$d.class
     */
    /* renamed from: o0.g0$d */
    /* loaded from: combined.jar:classes1.jar:o0/g0$d.class */
    public class d extends g<CharSequence> {
        public d(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence mo31560d(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo31561e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo31562h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$e.class
     */
    /* renamed from: o0.g0$e */
    /* loaded from: combined.jar:classes1.jar:o0/g0$e.class */
    public class e extends g<Boolean> {
        public e(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean mo31560d(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return Boolean.valueOf(isAccessibilityHeading);
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo31561e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        @Override // p235o0.C6824g0.g
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean mo31562h(Boolean bool, Boolean bool2) {
            return !m31577a(bool, bool2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$f.class
     */
    /* renamed from: o0.g0$f */
    /* loaded from: combined.jar:classes1.jar:o0/g0$f.class */
    public static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public WeakHashMap<View, Boolean> f35558b = new WeakHashMap<>();

        /* renamed from: a */
        public final void m31575a(View view, boolean z10) {
            boolean z11 = view.getVisibility() == 0;
            if (z10 != z11) {
                C6824g0.m31506Y(view, z11 ? 16 : 32);
                this.f35558b.put(view, Boolean.valueOf(z11));
            }
        }

        /* renamed from: b */
        public final void m31576b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f35558b.entrySet()) {
                    m31575a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m31576b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$g.class
     */
    /* renamed from: o0.g0$g */
    /* loaded from: combined.jar:classes1.jar:o0/g0$g.class */
    public static abstract class g<T> {

        /* renamed from: a */
        public final int f35559a;

        /* renamed from: b */
        public final Class<T> f35560b;

        /* renamed from: c */
        public final int f35561c;

        /* renamed from: d */
        public final int f35562d;

        public g(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public g(int i10, Class<T> cls, int i11, int i12) {
            this.f35559a = i10;
            this.f35560b = cls;
            this.f35562d = i11;
            this.f35561c = i12;
        }

        /* renamed from: a */
        public boolean m31577a(Boolean bool, Boolean bool2) {
            boolean z10 = false;
            if ((bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue())) {
                z10 = true;
            }
            return z10;
        }

        /* renamed from: b */
        public final boolean m31578b() {
            return true;
        }

        /* renamed from: c */
        public final boolean m31579c() {
            return Build.VERSION.SDK_INT >= this.f35561c;
        }

        /* renamed from: d */
        public abstract T mo31560d(View view);

        /* renamed from: e */
        public abstract void mo31561e(View view, T t10);

        /* renamed from: f */
        public T m31580f(View view) {
            if (m31579c()) {
                return mo31560d(view);
            }
            if (!m31578b()) {
                return null;
            }
            T t10 = (T) view.getTag(this.f35559a);
            if (this.f35560b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        /* renamed from: g */
        public void m31581g(View view, T t10) {
            if (m31579c()) {
                mo31561e(view, t10);
            } else if (m31578b() && mo31562h(m31580f(view), t10)) {
                C6824g0.m31481G(view);
                view.setTag(this.f35559a, t10);
                C6824g0.m31506Y(view, this.f35562d);
            }
        }

        /* renamed from: h */
        public abstract boolean mo31562h(T t10, T t11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$h.class
     */
    /* renamed from: o0.g0$h */
    /* loaded from: combined.jar:classes1.jar:o0/g0$h.class */
    public static class h {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:o0/g0$h$a.class
         */
        /* renamed from: o0.g0$h$a */
        /* loaded from: combined.jar:classes1.jar:o0/g0$h$a.class */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public C6813c1 f35563a = null;

            /* renamed from: b */
            public final View f35564b;

            /* renamed from: c */
            public final InterfaceC6859w f35565c;

            public a(View view, InterfaceC6859w interfaceC6859w) {
                this.f35564b = view;
                this.f35565c = interfaceC6859w;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C6813c1 m31390w = C6813c1.m31390w(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.m31582a(windowInsets, this.f35564b);
                    if (m31390w.equals(this.f35563a)) {
                        return this.f35565c.mo1813a(view, m31390w).m31410u();
                    }
                }
                this.f35563a = m31390w;
                C6813c1 mo1813a = this.f35565c.mo1813a(view, m31390w);
                if (i10 >= 30) {
                    return mo1813a.m31410u();
                }
                C6824g0.m31533m0(view);
                return mo1813a.m31410u();
            }
        }

        /* renamed from: a */
        public static void m31582a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C0778c.f5325S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static C6813c1 m31583b(View view, C6813c1 c6813c1, Rect rect) {
            WindowInsets m31410u = c6813c1.m31410u();
            if (m31410u != null) {
                return C6813c1.m31390w(view.computeSystemWindowInsets(m31410u, rect), view);
            }
            rect.setEmpty();
            return c6813c1;
        }

        /* renamed from: c */
        public static C6813c1 m31584c(View view) {
            return C6813c1.a.m31411a(view);
        }

        /* renamed from: d */
        public static void m31585d(View view, InterfaceC6859w interfaceC6859w) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C0778c.f5318L, interfaceC6859w);
            }
            if (interfaceC6859w == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C0778c.f5325S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC6859w));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$i.class
     */
    /* renamed from: o0.g0$i */
    /* loaded from: combined.jar:classes1.jar:o0/g0$i.class */
    public static class i {
        /* renamed from: a */
        public static C6813c1 m31586a(View view) {
            WindowInsets rootWindowInsets;
            rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C6813c1 m31389v = C6813c1.m31389v(rootWindowInsets);
            m31389v.m31408s(m31389v);
            m31389v.m31394d(view.getRootView());
            return m31389v;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$j.class
     */
    /* renamed from: o0.g0$j */
    /* loaded from: combined.jar:classes1.jar:o0/g0$j.class */
    public static class j {
        /* renamed from: a */
        public static void m31587a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$k.class
     */
    /* renamed from: o0.g0$k */
    /* loaded from: combined.jar:classes1.jar:o0/g0$k.class */
    public interface k {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g0$l.class
     */
    /* renamed from: o0.g0$l */
    /* loaded from: combined.jar:classes1.jar:o0/g0$l.class */
    public static class l {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f35566d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f35567a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f35568b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f35569c = null;

        /* renamed from: a */
        public static l m31588a(View view) {
            int i10 = C0778c.f5323Q;
            l lVar = (l) view.getTag(i10);
            l lVar2 = lVar;
            if (lVar == null) {
                lVar2 = new l();
                view.setTag(i10, lVar2);
            }
            return lVar2;
        }

        /* renamed from: b */
        public boolean m31589b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m31594g();
            }
            View m31590c = m31590c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m31590c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m31591d().put(keyCode, new WeakReference<>(m31590c));
                }
            }
            return m31590c != null;
        }

        /* renamed from: c */
        public final View m31590c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f35567a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View m31590c = m31590c(viewGroup.getChildAt(childCount), keyEvent);
                    if (m31590c != null) {
                        return m31590c;
                    }
                }
            }
            if (m31592e(view, keyEvent)) {
                return view;
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray<WeakReference<View>> m31591d() {
            if (this.f35568b == null) {
                this.f35568b = new SparseArray<>();
            }
            return this.f35568b;
        }

        /* renamed from: e */
        public final boolean m31592e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0778c.f5324R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((k) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public boolean m31593f(KeyEvent keyEvent) {
            WeakReference<KeyEvent> weakReference = this.f35569c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f35569c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> m31591d = m31591d();
            WeakReference<View> weakReference2 = null;
            if (keyEvent.getAction() == 1) {
                int indexOfKey = m31591d.indexOfKey(keyEvent.getKeyCode());
                weakReference2 = null;
                if (indexOfKey >= 0) {
                    weakReference2 = m31591d.valueAt(indexOfKey);
                    m31591d.removeAt(indexOfKey);
                }
            }
            WeakReference<View> weakReference3 = weakReference2;
            if (weakReference2 == null) {
                weakReference3 = m31591d.get(keyEvent.getKeyCode());
            }
            if (weakReference3 == null) {
                return false;
            }
            View view = weakReference3.get();
            if (view == null || !C6824g0.m31501T(view)) {
                return true;
            }
            m31592e(view, keyEvent);
            return true;
        }

        /* renamed from: g */
        public final void m31594g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f35567a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f35566d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f35567a == null) {
                    this.f35567a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f35566d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f35567a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f35567a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public static int m31469A(View view) {
        return view.getImportantForAccessibility();
    }

    /* renamed from: A0 */
    public static void m31470A0(View view, InterfaceC6859w interfaceC6859w) {
        h.m31585d(view, interfaceC6859w);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: B */
    public static int m31471B(View view) {
        int importantForAutofill;
        if (Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        importantForAutofill = view.getImportantForAutofill();
        return importantForAutofill;
    }

    /* renamed from: B0 */
    public static void m31472B0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    /* renamed from: C */
    public static int m31473C(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: C0 */
    public static void m31474C0(View view, C6806a0 c6806a0) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (c6806a0 != null ? c6806a0.m31372a() : null));
        }
    }

    /* renamed from: D */
    public static int m31475D(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: D0 */
    public static void m31476D0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* renamed from: E */
    public static int m31477E(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: E0 */
    public static void m31478E0(View view, CharSequence charSequence) {
        m31490K0().m31581g(view, charSequence);
    }

    /* renamed from: F */
    public static String[] m31479F(View view) {
        return (String[]) view.getTag(C0778c.f5320N);
    }

    /* renamed from: F0 */
    public static void m31480F0(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: G */
    public static C6805a m31481G(View view) {
        C6805a m31530l = m31530l(view);
        C6805a c6805a = m31530l;
        if (m31530l == null) {
            c6805a = new C6805a();
        }
        m31539p0(view, c6805a);
        return c6805a;
    }

    @Deprecated
    /* renamed from: G0 */
    public static void m31482G0(View view, float f10) {
        view.setTranslationX(f10);
    }

    /* renamed from: H */
    public static int m31483H(View view) {
        return view.getPaddingEnd();
    }

    @Deprecated
    /* renamed from: H0 */
    public static void m31484H0(View view, float f10) {
        view.setTranslationY(f10);
    }

    /* renamed from: I */
    public static int m31485I(View view) {
        return view.getPaddingStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I0 */
    public static void m31486I0(View view) {
        if (m31469A(view) == 0) {
            m31557y0(view, 1);
        }
        ViewParent parent = view.getParent();
        while (true) {
            ViewParent viewParent = parent;
            if (!(viewParent instanceof View)) {
                return;
            }
            if (m31469A((View) viewParent) == 4) {
                m31557y0(view, 2);
                return;
            }
            parent = viewParent.getParent();
        }
    }

    /* renamed from: J */
    public static C6813c1 m31487J(View view) {
        return Build.VERSION.SDK_INT >= 23 ? i.m31586a(view) : h.m31584c(view);
    }

    /* renamed from: J0 */
    public static void m31488J0(View view, float f10) {
        view.setZ(f10);
    }

    /* renamed from: K */
    public static final CharSequence m31489K(View view) {
        return m31490K0().m31580f(view);
    }

    /* renamed from: K0 */
    public static g<CharSequence> m31490K0() {
        return new d(C0778c.f5322P, CharSequence.class, 64, 30);
    }

    /* renamed from: L */
    public static String m31491L(View view) {
        return view.getTransitionName();
    }

    /* renamed from: L0 */
    public static void m31492L0(View view) {
        view.stopNestedScroll();
    }

    @Deprecated
    /* renamed from: M */
    public static float m31493M(View view) {
        return view.getTranslationY();
    }

    /* renamed from: M0 */
    public static void m31494M0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: N */
    public static int m31495N(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: O */
    public static float m31496O(View view) {
        return view.getZ();
    }

    /* renamed from: P */
    public static boolean m31497P(View view) {
        return view.hasOnClickListeners();
    }

    /* renamed from: Q */
    public static boolean m31498Q(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: R */
    public static boolean m31499R(View view) {
        return view.hasTransientState();
    }

    /* renamed from: S */
    public static boolean m31500S(View view) {
        Boolean m31580f = m31508a().m31580f(view);
        return m31580f == null ? false : m31580f.booleanValue();
    }

    /* renamed from: T */
    public static boolean m31501T(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: U */
    public static boolean m31502U(View view) {
        return view.isLaidOut();
    }

    /* renamed from: V */
    public static boolean m31503V(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: W */
    public static boolean m31504W(View view) {
        return view.isPaddingRelative();
    }

    /* renamed from: X */
    public static boolean m31505X(View view) {
        Boolean m31580f = m31537o0().m31580f(view);
        return m31580f == null ? false : m31580f.booleanValue();
    }

    /* renamed from: Y */
    public static void m31506Y(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = m31538p(view) != null && view.getVisibility() == 0;
            int i11 = 32;
            if (m31536o(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                obtain.setContentChangeTypes(i10);
                if (z10) {
                    obtain.getText().add(m31538p(view));
                    m31486I0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m31538p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    /* renamed from: Z */
    public static void m31507Z(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect m31554x = m31554x();
        boolean z10 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m31554x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !m31554x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m31516e(view, i10);
        if (z10 && m31554x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m31554x);
        }
    }

    /* renamed from: a */
    public static g<Boolean> m31508a() {
        return new e(C0778c.f5316J, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static void m31509a0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect m31554x = m31554x();
        boolean z10 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m31554x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !m31554x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m31518f(view, i10);
        if (z10 && m31554x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m31554x);
        }
    }

    /* renamed from: b */
    public static int m31510b(View view, CharSequence charSequence, InterfaceC7538n interfaceC7538n) {
        int m31542r = m31542r(view, charSequence);
        if (m31542r != -1) {
            m31512c(view, new C7535k.a(m31542r, charSequence, interfaceC7538n));
        }
        return m31542r;
    }

    /* renamed from: b0 */
    public static C6813c1 m31511b0(View view, C6813c1 c6813c1) {
        WindowInsets m31410u = c6813c1.m31410u();
        if (m31410u != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(m31410u);
            if (!onApplyWindowInsets.equals(m31410u)) {
                return C6813c1.m31390w(onApplyWindowInsets, view);
            }
        }
        return c6813c1;
    }

    /* renamed from: c */
    public static void m31512c(View view, C7535k.a aVar) {
        m31481G(view);
        m31529k0(aVar.m32250b(), view);
        m31540q(view).add(aVar);
        m31506Y(view, 0);
    }

    /* renamed from: c0 */
    public static void m31513c0(View view, C7535k c7535k) {
        view.onInitializeAccessibilityNodeInfo(c7535k.m32245w0());
    }

    /* renamed from: d */
    public static C6864y0 m31514d(View view) {
        if (f35551b == null) {
            f35551b = new WeakHashMap<>();
        }
        C6864y0 c6864y0 = f35551b.get(view);
        C6864y0 c6864y02 = c6864y0;
        if (c6864y0 == null) {
            c6864y02 = new C6864y0(view);
            f35551b.put(view, c6864y02);
        }
        return c6864y02;
    }

    /* renamed from: d0 */
    public static g<CharSequence> m31515d0() {
        return new c(C0778c.f5317K, CharSequence.class, 8, 28);
    }

    /* renamed from: e */
    public static void m31516e(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            m31494M0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m31494M0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static boolean m31517e0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    /* renamed from: f */
    public static void m31518f(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            m31494M0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m31494M0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static C6811c m31519f0(View view, C6811c c6811c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c6811c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        InterfaceC6861x interfaceC6861x = (InterfaceC6861x) view.getTag(C0778c.f5319M);
        if (interfaceC6861x == null) {
            return m31556y(view).mo1460a(c6811c);
        }
        C6811c mo31663a = interfaceC6861x.mo31663a(view, c6811c);
        return mo31663a == null ? null : m31556y(view).mo1460a(mo31663a);
    }

    /* renamed from: g */
    public static C6813c1 m31520g(View view, C6813c1 c6813c1, Rect rect) {
        return h.m31583b(view, c6813c1, rect);
    }

    /* renamed from: g0 */
    public static void m31521g0(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: h */
    public static C6813c1 m31522h(View view, C6813c1 c6813c1) {
        WindowInsets m31410u = c6813c1.m31410u();
        if (m31410u != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(m31410u);
            if (!dispatchApplyWindowInsets.equals(m31410u)) {
                return C6813c1.m31390w(dispatchApplyWindowInsets, view);
            }
        }
        return c6813c1;
    }

    /* renamed from: h0 */
    public static void m31523h0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: i */
    public static boolean m31524i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.m31588a(view).m31589b(view, keyEvent);
    }

    /* renamed from: i0 */
    public static void m31525i0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    /* renamed from: j */
    public static boolean m31526j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.m31588a(view).m31593f(keyEvent);
    }

    /* renamed from: j0 */
    public static void m31527j0(View view, int i10) {
        m31529k0(i10, view);
        m31506Y(view, 0);
    }

    /* renamed from: k */
    public static int m31528k() {
        return View.generateViewId();
    }

    /* renamed from: k0 */
    public static void m31529k0(int i10, View view) {
        List<C7535k.a> m31540q = m31540q(view);
        for (int i11 = 0; i11 < m31540q.size(); i11++) {
            if (m31540q.get(i11).m32250b() == i10) {
                m31540q.remove(i11);
                return;
            }
        }
    }

    /* renamed from: l */
    public static C6805a m31530l(View view) {
        View.AccessibilityDelegate m31532m = m31532m(view);
        if (m31532m == null) {
            return null;
        }
        return m31532m instanceof C6805a.a ? ((C6805a.a) m31532m).f35494a : new C6805a(m31532m);
    }

    /* renamed from: l0 */
    public static void m31531l0(View view, C7535k.a aVar, CharSequence charSequence, InterfaceC7538n interfaceC7538n) {
        if (interfaceC7538n == null && charSequence == null) {
            m31527j0(view, aVar.m32250b());
        } else {
            m31512c(view, aVar.m32249a(charSequence, interfaceC7538n));
        }
    }

    /* renamed from: m */
    public static View.AccessibilityDelegate m31532m(View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT < 29) {
            return m31534n(view);
        }
        accessibilityDelegate = view.getAccessibilityDelegate();
        return accessibilityDelegate;
    }

    /* renamed from: m0 */
    public static void m31533m0(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: n */
    public static View.AccessibilityDelegate m31534n(View view) {
        if (f35553d) {
            return null;
        }
        if (f35552c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f35552c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th2) {
                f35553d = true;
                return null;
            }
        }
        try {
            Object obj = f35552c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable th3) {
            f35553d = true;
            return null;
        }
    }

    /* renamed from: n0 */
    public static void m31535n0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.m31587a(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* renamed from: o */
    public static int m31536o(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* renamed from: o0 */
    public static g<Boolean> m31537o0() {
        return new b(C0778c.f5321O, Boolean.class, 28);
    }

    /* renamed from: p */
    public static CharSequence m31538p(View view) {
        return m31515d0().m31580f(view);
    }

    /* renamed from: p0 */
    public static void m31539p0(View view, C6805a c6805a) {
        C6805a c6805a2 = c6805a;
        if (c6805a == null) {
            c6805a2 = c6805a;
            if (m31532m(view) instanceof C6805a.a) {
                c6805a2 = new C6805a();
            }
        }
        view.setAccessibilityDelegate(c6805a2 == null ? null : c6805a2.m31368d());
    }

    /* renamed from: q */
    public static List<C7535k.a> m31540q(View view) {
        int i10 = C0778c.f5314H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        ArrayList arrayList2 = arrayList;
        if (arrayList == null) {
            arrayList2 = new ArrayList();
            view.setTag(i10, arrayList2);
        }
        return arrayList2;
    }

    /* renamed from: q0 */
    public static void m31541q0(View view, boolean z10) {
        m31508a().m31581g(view, Boolean.valueOf(z10));
    }

    /* renamed from: r */
    public static int m31542r(View view, CharSequence charSequence) {
        List<C7535k.a> m31540q = m31540q(view);
        for (int i10 = 0; i10 < m31540q.size(); i10++) {
            if (TextUtils.equals(charSequence, m31540q.get(i10).m32251c())) {
                return m31540q.get(i10).m32250b();
            }
        }
        int i11 = 0;
        int i12 = -1;
        while (true) {
            int[] iArr = f35555f;
            if (i11 >= iArr.length || i12 != -1) {
                break;
            }
            int i13 = iArr[i11];
            boolean z10 = true;
            for (int i14 = 0; i14 < m31540q.size(); i14++) {
                z10 &= m31540q.get(i14).m32250b() != i13;
            }
            if (z10) {
                i12 = i13;
            }
            i11++;
        }
        return i12;
    }

    /* renamed from: r0 */
    public static void m31543r0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    /* renamed from: s */
    public static ColorStateList m31544s(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: s0 */
    public static void m31545s0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: t */
    public static PorterDuff.Mode m31546t(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: t0 */
    public static void m31547t0(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        view.setBackgroundTintList(colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: u */
    public static Rect m31548u(View view) {
        return view.getClipBounds();
    }

    /* renamed from: u0 */
    public static void m31549u0(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        view.setBackgroundTintMode(mode);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: v */
    public static Display m31550v(View view) {
        return view.getDisplay();
    }

    /* renamed from: v0 */
    public static void m31551v0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* renamed from: w */
    public static float m31552w(View view) {
        return view.getElevation();
    }

    /* renamed from: w0 */
    public static void m31553w0(View view, float f10) {
        view.setElevation(f10);
    }

    /* renamed from: x */
    public static Rect m31554x() {
        if (f35554e == null) {
            f35554e = new ThreadLocal<>();
        }
        Rect rect = f35554e.get();
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
            f35554e.set(rect2);
        }
        rect2.setEmpty();
        return rect2;
    }

    /* renamed from: x0 */
    public static void m31555x0(View view, boolean z10) {
        view.setHasTransientState(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public static InterfaceC6863y m31556y(View view) {
        return view instanceof InterfaceC6863y ? (InterfaceC6863y) view : f35556g;
    }

    /* renamed from: y0 */
    public static void m31557y0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    /* renamed from: z */
    public static boolean m31558z(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: z0 */
    public static void m31559z0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i10);
        }
    }
}
