package p235o0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/x0.class
 */
/* renamed from: o0.x0 */
/* loaded from: combined.jar:classes1.jar:o0/x0.class */
public final class C6862x0 {
    /* renamed from: a */
    public static boolean m31664a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        try {
            return viewParent.onNestedFling(view, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m31665b(ViewParent viewParent, View view, float f10, float f11) {
        try {
            return viewParent.onNestedPreFling(view, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    /* renamed from: c */
    public static void m31666c(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof InterfaceC6853t) {
            ((InterfaceC6853t) viewParent).mo1074k(view, i10, i11, iArr, i12);
            return;
        }
        if (i12 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i10, i11, iArr);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e10);
            }
        }
    }

    /* renamed from: d */
    public static void m31667d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (viewParent instanceof InterfaceC6855u) {
            ((InterfaceC6855u) viewParent).mo1076m(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof InterfaceC6853t) {
            ((InterfaceC6853t) viewParent).mo1077n(view, i10, i11, i12, i13, i14);
            return;
        }
        if (i14 == 0) {
            try {
                viewParent.onNestedScroll(view, i10, i11, i12, i13);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e10);
            }
        }
    }

    /* renamed from: e */
    public static void m31668e(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof InterfaceC6853t) {
            ((InterfaceC6853t) viewParent).mo1065b(view, view2, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e10);
            }
        }
    }

    /* renamed from: f */
    public static boolean m31669f(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof InterfaceC6853t) {
            return ((InterfaceC6853t) viewParent).mo1078o(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e10);
            return false;
        }
    }

    /* renamed from: g */
    public static void m31670g(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof InterfaceC6853t) {
            ((InterfaceC6853t) viewParent).mo1073j(view, i10);
            return;
        }
        if (i10 == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e10);
            }
        }
    }
}
