package androidx.navigation;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import p030c0.C0936d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/r.class
 */
/* renamed from: androidx.navigation.r */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/r.class */
public final class C0638r {
    /* renamed from: a */
    public static NavController m3659a(Activity activity, int i10) {
        NavController m3661c = m3661c(C0936d.m5642s(activity, i10));
        if (m3661c != null) {
            return m3661c;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i10);
    }

    /* renamed from: b */
    public static NavController m3660b(View view) {
        NavController m3661c = m3661c(view);
        if (m3661c != null) {
            return m3661c;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* renamed from: c */
    public static NavController m3661c(View view) {
        while (view != null) {
            NavController m3662d = m3662d(view);
            if (m3662d != null) {
                return m3662d;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: d */
    public static NavController m3662d(View view) {
        NavController navController;
        Object tag = view.getTag(C0641u.f4316a);
        if (tag instanceof WeakReference) {
            tag = ((WeakReference) tag).get();
        } else if (!(tag instanceof NavController)) {
            navController = null;
            return navController;
        }
        navController = (NavController) tag;
        return navController;
    }

    /* renamed from: e */
    public static void m3663e(View view, NavController navController) {
        view.setTag(C0641u.f4316a, navController);
    }
}
