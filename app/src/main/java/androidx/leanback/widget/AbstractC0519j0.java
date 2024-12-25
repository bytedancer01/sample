package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/j0.class
 */
/* renamed from: androidx.leanback.widget.j0 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/j0.class */
public abstract class AbstractC0519j0 implements InterfaceC0505e {

    /* renamed from: a */
    public Map<Class, Object> f3458a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/j0$a.class
     */
    /* renamed from: androidx.leanback.widget.j0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/j0$a.class */
    public static class a implements InterfaceC0505e {

        /* renamed from: a */
        public final View f3459a;

        /* renamed from: b */
        public Map<Class, Object> f3460b;

        public a(View view) {
            this.f3459a = view;
        }

        @Override // androidx.leanback.widget.InterfaceC0505e
        /* renamed from: c */
        public final Object mo2581c(Class<?> cls) {
            Map<Class, Object> map = this.f3460b;
            if (map == null) {
                return null;
            }
            return map.get(cls);
        }
    }

    /* renamed from: a */
    public static void m2651a(View view) {
        if (view == null || !view.hasTransientState()) {
            return;
        }
        view.animate().cancel();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; view.hasTransientState() && i10 < childCount; i10++) {
                m2651a(viewGroup.getChildAt(i10));
            }
        }
    }

    /* renamed from: b */
    public abstract void mo2652b(a aVar, Object obj);

    @Override // androidx.leanback.widget.InterfaceC0505e
    /* renamed from: c */
    public final Object mo2581c(Class<?> cls) {
        Map<Class, Object> map = this.f3458a;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    /* renamed from: d */
    public void m2653d(a aVar, Object obj, List<Object> list) {
        mo2652b(aVar, obj);
    }

    /* renamed from: e */
    public abstract a mo2654e(ViewGroup viewGroup);

    /* renamed from: f */
    public abstract void mo2655f(a aVar);

    /* renamed from: g */
    public void mo2656g(a aVar) {
    }

    /* renamed from: h */
    public void mo2657h(a aVar) {
        m2651a(aVar.f3459a);
    }
}
