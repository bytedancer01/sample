package p314s0;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s0/k.class
 */
/* renamed from: s0.k */
/* loaded from: combined.jar:classes1.jar:s0/k.class */
public final class C8503k {

    /* renamed from: a */
    public static Method f39861a;

    /* renamed from: b */
    public static boolean f39862b;

    /* renamed from: c */
    public static Field f39863c;

    /* renamed from: d */
    public static boolean f39864d;

    /* renamed from: a */
    public static void m36697a(PopupWindow popupWindow, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z10);
            return;
        }
        if (!f39864d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f39863c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
            }
            f39864d = true;
        }
        Field field = f39863c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z10));
            } catch (IllegalAccessException e11) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
            }
        }
    }

    /* renamed from: b */
    public static void m36698b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i10);
            return;
        }
        if (!f39862b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f39861a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e10) {
            }
            f39862b = true;
        }
        Method method = f39861a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception e11) {
            }
        }
    }

    /* renamed from: c */
    public static void m36699c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
