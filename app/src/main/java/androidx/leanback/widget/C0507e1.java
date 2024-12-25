package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/e1.class
 */
/* renamed from: androidx.leanback.widget.e1 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/e1.class */
public class C0507e1 {
    /* renamed from: a */
    public static boolean m2582a(ViewGroup viewGroup, View view) {
        while (view != null) {
            if (view == viewGroup) {
                return true;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }
}
