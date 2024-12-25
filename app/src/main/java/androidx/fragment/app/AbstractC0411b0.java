package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p175k0.C5441b;
import p235o0.C6824g0;
import p235o0.C6860w0;
import p235o0.ViewTreeObserverOnPreDrawListenerC6865z;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/b0.class
 */
@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.b0 */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/b0.class */
public abstract class AbstractC0411b0 {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/b0$a.class
     */
    /* renamed from: androidx.fragment.app.b0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/b0$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final int f2776b;

        /* renamed from: c */
        public final ArrayList f2777c;

        /* renamed from: d */
        public final ArrayList f2778d;

        /* renamed from: e */
        public final ArrayList f2779e;

        /* renamed from: f */
        public final ArrayList f2780f;

        /* renamed from: g */
        public final AbstractC0411b0 f2781g;

        public a(AbstractC0411b0 abstractC0411b0, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2781g = abstractC0411b0;
            this.f2776b = i10;
            this.f2777c = arrayList;
            this.f2778d = arrayList2;
            this.f2779e = arrayList3;
            this.f2780f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f2776b; i10++) {
                C6824g0.m31480F0((View) this.f2777c.get(i10), (String) this.f2778d.get(i10));
                C6824g0.m31480F0((View) this.f2779e.get(i10), (String) this.f2780f.get(i10));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/b0$b.class
     */
    /* renamed from: androidx.fragment.app.b0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/b0$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final ArrayList f2782b;

        /* renamed from: c */
        public final Map f2783c;

        /* renamed from: d */
        public final AbstractC0411b0 f2784d;

        public b(AbstractC0411b0 abstractC0411b0, ArrayList arrayList, Map map) {
            this.f2784d = abstractC0411b0;
            this.f2782b = arrayList;
            this.f2783c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2782b.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f2782b.get(i10);
                String m31491L = C6824g0.m31491L(view);
                if (m31491L != null) {
                    C6824g0.m31480F0(view, AbstractC0411b0.m1981i(this.f2783c, m31491L));
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/b0$c.class
     */
    /* renamed from: androidx.fragment.app.b0$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/b0$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final ArrayList f2785b;

        /* renamed from: c */
        public final Map f2786c;

        /* renamed from: d */
        public final AbstractC0411b0 f2787d;

        public c(AbstractC0411b0 abstractC0411b0, ArrayList arrayList, Map map) {
            this.f2787d = abstractC0411b0;
            this.f2785b = arrayList;
            this.f2786c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2785b.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f2785b.get(i10);
                C6824g0.m31480F0(view, (String) this.f2786c.get(C6824g0.m31491L(view)));
            }
        }
    }

    /* renamed from: d */
    public static void m1979d(List<View> list, View view) {
        int size = list.size();
        if (m1980h(list, view, size)) {
            return;
        }
        if (C6824g0.m31491L(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!m1980h(list, childAt, size) && C6824g0.m31491L(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m1980h(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static String m1981i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    public static boolean m1982l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo81A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo82B(Object obj);

    /* renamed from: a */
    public abstract void mo83a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo84b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo85c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo86e(Object obj);

    /* renamed from: f */
    public void m1983f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            View view2 = view;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean m31662a = C6860w0.m31662a(viewGroup);
                view2 = viewGroup;
                if (!m31662a) {
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        m1983f(arrayList, viewGroup.getChildAt(i10));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    /* renamed from: g */
    public abstract Object mo87g(Object obj);

    /* renamed from: j */
    public void m1984j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m31491L = C6824g0.m31491L(view);
            if (m31491L != null) {
                map.put(m31491L, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    m1984j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    /* renamed from: k */
    public void m1985k(View view, Rect rect) {
        if (!C6824g0.m31501T(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (true) {
            Object obj = parent;
            if (!(obj instanceof View)) {
                view.getRootView().getLocationOnScreen(new int[2]);
                rectF.offset(r0[0], r0[1]);
                rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                return;
            }
            View view2 = (View) obj;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    /* renamed from: m */
    public abstract Object mo88m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo89n(Object obj, Object obj2, Object obj3);

    /* renamed from: o */
    public ArrayList<String> m1986o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(C6824g0.m31491L(view));
            C6824g0.m31480F0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo90p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo91q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo92r(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: s */
    public void m1987s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC6865z.m31685a(viewGroup, new c(this, arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo93t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo94u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo95v(Object obj, View view);

    /* renamed from: w */
    public void mo96w(Fragment fragment, Object obj, C5441b c5441b, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: x */
    public void m1988x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC6865z.m31685a(view, new b(this, arrayList, map));
    }

    /* renamed from: y */
    public void m1989y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String m31491L = C6824g0.m31491L(view2);
            arrayList4.add(m31491L);
            if (m31491L != null) {
                C6824g0.m31480F0(view2, null);
                String str = map.get(m31491L);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i11))) {
                        C6824g0.m31480F0(arrayList2.get(i11), m31491L);
                        break;
                    }
                    i11++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC6865z.m31685a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo97z(Object obj, View view, ArrayList<View> arrayList);
}
