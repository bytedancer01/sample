package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;
import java.lang.reflect.Field;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/activity/ImmLeaksCleaner.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/activity/ImmLeaksCleaner.class */
final class ImmLeaksCleaner implements InterfaceC0577k {

    /* renamed from: c */
    public static int f1313c;

    /* renamed from: d */
    public static Field f1314d;

    /* renamed from: e */
    public static Field f1315e;

    /* renamed from: f */
    public static Field f1316f;

    /* renamed from: b */
    public Activity f1317b;

    public ImmLeaksCleaner(Activity activity) {
        this.f1317b = activity;
    }

    /* renamed from: c */
    public static void m777c() {
        try {
            f1313c = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f1315e = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f1316f = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f1314d = declaredField3;
            declaredField3.setAccessible(true);
            f1313c = 1;
        } catch (NoSuchFieldException e10) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0577k
    /* renamed from: b */
    public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
        if (bVar != AbstractC0572g.b.ON_DESTROY) {
            return;
        }
        if (f1313c == 0) {
            m777c();
        }
        if (f1313c == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1317b.getSystemService("input_method");
            try {
                Object obj = f1314d.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f1315e.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f1316f.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException e10) {
                            }
                        } catch (IllegalAccessException e11) {
                        }
                    } catch (ClassCastException e12) {
                    }
                }
            } catch (IllegalAccessException e13) {
            }
        }
    }
}
