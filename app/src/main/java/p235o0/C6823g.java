package p235o0;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/g.class
 */
/* renamed from: o0.g */
/* loaded from: combined.jar:classes1.jar:o0/g.class */
public class C6823g {

    /* renamed from: a */
    public static boolean f35546a;

    /* renamed from: b */
    public static Method f35547b;

    /* renamed from: c */
    public static boolean f35548c;

    /* renamed from: d */
    public static Field f35549d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o0/g$a.class
     */
    /* renamed from: o0.g$a */
    /* loaded from: combined.jar:classes1.jar:o0/g$a.class */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m31463a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f35546a) {
            try {
                f35547b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException e10) {
            }
            f35546a = true;
        }
        Method method = f35547b;
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e11) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m31464b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m31463a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C6824g0.m31524i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    public static boolean m31465c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m31468f = m31468f(dialog);
        if (m31468f != null && m31468f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C6824g0.m31524i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m31466d(View view, KeyEvent keyEvent) {
        return C6824g0.m31526j(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m31467e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        boolean z10 = false;
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m31464b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m31465c((Dialog) callback, keyEvent);
        }
        if ((view != null && C6824g0.m31524i(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent)) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m31468f(Dialog dialog) {
        if (!f35548c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f35549d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
            }
            f35548c = true;
        }
        Field field = f35549d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException e11) {
            return null;
        }
    }
}
