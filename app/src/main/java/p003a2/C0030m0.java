package p003a2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/m0.class
 */
/* renamed from: a2.m0 */
/* loaded from: combined.jar:classes1.jar:a2/m0.class */
public class C0030m0 {

    /* renamed from: a */
    public static Method f128a;

    /* renamed from: b */
    public static boolean f129b;

    /* renamed from: c */
    public static Field f130c;

    /* renamed from: d */
    public static boolean f131d;

    /* renamed from: a */
    public void mo76a(View view) {
        throw null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    public final void m163b() {
        if (f129b) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f128a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
        }
        f129b = true;
    }

    /* renamed from: c */
    public float mo77c(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo78d(View view) {
        throw null;
    }

    /* renamed from: e */
    public void mo107e(View view, int i10, int i11, int i12, int i13) {
        m163b();
        Method method = f128a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException e10) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo79f(View view, float f10) {
        throw null;
    }

    /* renamed from: g */
    public void mo113g(View view, int i10) {
        if (!f131d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f130c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f131d = true;
        }
        Field field = f130c;
        if (field != null) {
            try {
                f130c.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException e11) {
            }
        }
    }

    /* renamed from: h */
    public void mo103h(View view, Matrix matrix) {
        throw null;
    }

    /* renamed from: i */
    public void mo104i(View view, Matrix matrix) {
        throw null;
    }
}
