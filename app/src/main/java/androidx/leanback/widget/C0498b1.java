package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p413y0.C9793f;
import p413y0.C9795h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/b1.class
 */
/* renamed from: androidx.leanback.widget.b1 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/b1.class */
public final class C0498b1 {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/b1$a.class
     */
    /* renamed from: androidx.leanback.widget.b1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/b1$a.class */
    public static class a {

        /* renamed from: a */
        public View f3404a;

        /* renamed from: b */
        public View f3405b;
    }

    /* renamed from: a */
    public static Object m2565a(ViewGroup viewGroup) {
        viewGroup.setLayoutMode(1);
        LayoutInflater.from(viewGroup.getContext()).inflate(C9795h.f45021l, viewGroup, true);
        a aVar = new a();
        aVar.f3404a = viewGroup.findViewById(C9793f.f44998t);
        aVar.f3405b = viewGroup.findViewById(C9793f.f44996r);
        return aVar;
    }

    /* renamed from: b */
    public static void m2566b(ViewGroup viewGroup) {
        viewGroup.setLayoutMode(1);
    }

    /* renamed from: c */
    public static void m2567c(Object obj, float f10) {
        a aVar = (a) obj;
        aVar.f3404a.setAlpha(1.0f - f10);
        aVar.f3405b.setAlpha(f10);
    }

    /* renamed from: d */
    public static boolean m2568d() {
        return true;
    }
}
