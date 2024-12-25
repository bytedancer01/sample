package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/u1.class
 */
/* renamed from: androidx.appcompat.widget.u1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/u1.class */
public class C0358u1 {

    /* renamed from: a */
    public static Method f2275a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f2275a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f2275a.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static void m1620a(View view, Rect rect, Rect rect2) {
        Method method = f2275a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e10) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
            }
        }
    }

    /* renamed from: b */
    public static boolean m1621b(View view) {
        boolean z10 = true;
        if (C6824g0.m31473C(view) != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: c */
    public static void m1622c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException e11) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e12) {
            e = e12;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
    }
}
